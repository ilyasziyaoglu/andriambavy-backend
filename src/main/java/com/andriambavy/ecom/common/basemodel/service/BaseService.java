package com.andriambavy.ecom.common.basemodel.service;

import com.andriambavy.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import com.andriambavy.ecom.common.basemodel.db.repository.BaseRepository;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

public abstract class BaseService<Entity extends AbstractBaseEntity, Repository extends BaseRepository<Entity>> {
	public abstract Repository getRepository();
}
