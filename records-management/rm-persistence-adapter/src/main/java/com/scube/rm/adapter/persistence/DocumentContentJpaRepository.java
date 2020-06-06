package com.scube.rm.adapter.persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DocumentContentJpaRepository extends JpaRepository<DocumentJpaEntity, Long> {
	
	Optional<DocumentJpaEntity> findByContentId(String contentId);

}
