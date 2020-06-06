package com.scube.rm.adapter.persistence;

import java.util.Optional;

import com.scube.rm.common.PersistenceAdapter;
import com.scube.rm.core.port.out.DocumentDBPersistencePort;
import com.scube.rm.domain.Document;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@PersistenceAdapter
class DocumentDBPersistenceAdapter implements  DocumentDBPersistencePort {
	
	private final  DocumentContentJpaRepository documentContentJpaRepository;

	@Override
	public Optional<Document> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Document document) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Document document) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Document> findByContentId(String contentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
