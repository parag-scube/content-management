package com.scube.rm.core.service;

import javax.transaction.Transactional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.scube.rm.common.UseCase;
import com.scube.rm.core.input.port.DocumentContentUseCase;
import com.scube.rm.core.output.port.DocumentDBPersistencePort;
import com.scube.rm.core.output.port.DocumentESIndexingPort;
import com.scube.rm.core.output.port.DocumentFSPersistencePort;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@UseCase
@Transactional
public class DocumentContentService implements  DocumentContentUseCase {
	
	private final DocumentDBPersistencePort dbPersistencePort;
	private final DocumentFSPersistencePort fsPersistencePort;
	private final DocumentESIndexingPort esIndexingPort;

	@Override
	public ResponseEntity<?> setContent(Long Id, MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> getContent(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> unsetContent(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> searchContent(String queryString) {
		// TODO Auto-generated method stub
		return null;
	}

}
