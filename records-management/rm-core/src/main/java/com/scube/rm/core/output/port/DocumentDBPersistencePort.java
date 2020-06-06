package com.scube.rm.core.output.port;

import java.util.Optional;

import com.scube.rm.domain.Document;

public interface DocumentDBPersistencePort {
	
	Optional<Document> findById(Long id);
	
	void save(Document document);
	
	void delete(Document document);
	
	Optional<Document>  findByContentId(String contentId);

}
