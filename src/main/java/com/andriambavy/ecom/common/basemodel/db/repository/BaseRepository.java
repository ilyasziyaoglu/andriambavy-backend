package com.andriambavy.ecom.common.basemodel.db.repository;

import com.andriambavy.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */
@NoRepositoryBean
public interface BaseRepository<T extends AbstractBaseEntity> extends JpaRepository<T, Long> {
}
