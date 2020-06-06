package com.scube.rm.adapter.persistence;

import com.scube.rm.core.port.out.DocumentESIndexingPort;
import com.scube.rm.domain.Document;

public class DocumentESPersistenceAdapter implements DocumentESIndexingPort {

	@Override
	public void index(Document document) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unindex(Document document) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<String> search(String quueryString) {
		// TODO Auto-generated method stub
		return null;
	}

}
