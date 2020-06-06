package com.scube.rm.core.output.port;

import com.scube.rm.domain.Document;

public interface DocumentESIndexingPort {
	
	void index(Document document);
	
	void unindex(Document document);
	
	Iterable<String> search(String  quueryString);

}
