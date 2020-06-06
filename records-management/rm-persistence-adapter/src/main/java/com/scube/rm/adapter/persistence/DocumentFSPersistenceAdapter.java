package com.scube.rm.adapter.persistence;

import java.io.InputStream;
import java.util.Optional;

import com.scube.rm.core.port.out.DocumentFSPersistencePort;
import com.scube.rm.domain.Document;

public class DocumentFSPersistenceAdapter implements DocumentFSPersistencePort {

	@Override
	public Optional<Document> setContent(Document document, InputStream content) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream getContent(Document document) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Document unsetContent(Document document) {
		// TODO Auto-generated method stub
		return null;
	}

}
