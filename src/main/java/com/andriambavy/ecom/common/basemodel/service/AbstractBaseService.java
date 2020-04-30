package com.andriambavy.ecom.common.basemodel.service;

import com.andriambavy.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.andriambavy.ecom.common.basemodel.db.repository.BaseRepository;
import com.andriambavy.ecom.common.basemodel.request.BaseRequest;
import com.andriambavy.ecom.common.basemodel.response.BaseResponse;
import com.andriambavy.ecom.common.basemodel.mapper.BaseMapper;
import org.springframework.http.HttpStatus;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

public abstract class AbstractBaseService<
		Request extends BaseRequest,
		Entity extends AbstractBaseEntity,
		Response extends BaseResponse,
		Mapper extends BaseMapper<Request, Entity, Response>> extends BaseService<Entity, BaseRepository<Entity>>{

	public abstract Mapper getMapper();

	public ServiceResult<Entity> get(Long id) {
		ServiceResult<Entity> serviceResult = new ServiceResult<>();
		Optional<Entity> entity = getRepository().findById(id);
		if (entity.isPresent()) {
			serviceResult.setValue(entity.get());
			serviceResult.setHttpStatus(HttpStatus.OK);
		} else {
			serviceResult.setMessage("Entity can not found by the given id: " + id);
			serviceResult.setHttpStatus(HttpStatus.NOT_FOUND);
		}
		return serviceResult;
	}

	public ServiceResult<Void> delete(Long id) {
		ServiceResult<Void> serviceResult = new ServiceResult<>();
		try {
			getRepository().deleteById(id);
			serviceResult.setHttpStatus(HttpStatus.OK);
		} catch (Exception e) {
			serviceResult.setMessage("Entity can not delete by the given id: " + id + ". Error message: " + e.getMessage());
			serviceResult.setHttpStatus(HttpStatus.NOT_MODIFIED);
		}
		return serviceResult;
	}

	public ServiceResult<Entity> update(@NotNull Request request) {
		ServiceResult<Entity> serviceResult = new ServiceResult<>();
		Optional<Entity> entity = getRepository().findById(request.getId());
		if (entity.isPresent()) {
			try {
				Entity newEntity = getMapper().toEntity(request);
				getRepository().save(newEntity);
				serviceResult.setValue(newEntity);
				serviceResult.setHttpStatus(HttpStatus.OK);
			} catch (Exception e) {
				serviceResult.setMessage("Entity can not update with the given id: " + request.getId() + ". Error message: " + e.getMessage());
				serviceResult.setHttpStatus(HttpStatus.NOT_MODIFIED);
			}
		} else {
			serviceResult.setMessage("Entity not found to update update with the given id: " + request.getId());
			serviceResult.setHttpStatus(HttpStatus.NOT_FOUND);
		}
		return serviceResult;
	}

	public ServiceResult<Entity> save(Request request) {
		ServiceResult<Entity> serviceResult = new ServiceResult<>();
		try {
			Entity entity = getRepository().save(getMapper().toEntity(request));
			serviceResult.setValue(entity);
			serviceResult.setHttpStatus(HttpStatus.CREATED);
		} catch (Exception e) {
			serviceResult.setMessage("Entity can not save. Error message: " + e.getMessage());
			serviceResult.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return serviceResult;
	}

	public ServiceResult<List<Entity>> getAll() {
		ServiceResult<List<Entity>> serviceResult = new ServiceResult<>();
		try {
			Optional<List<Entity>> entityList = Optional.of(getRepository().findAll());
			serviceResult.setValue(entityList.get());
			serviceResult.setHttpStatus(HttpStatus.OK);
		} catch (Exception e) {
			serviceResult.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
			serviceResult.setMessage(e.getMessage());
		}
		return serviceResult;
	}


}
