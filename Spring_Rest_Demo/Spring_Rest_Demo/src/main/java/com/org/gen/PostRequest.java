package com.org.gen;
/*
* A POST Request generally has 
* a POST body which is sent as an input. PostRequest.java indicates all the fields which are 
* present in the input POST body*/
public class PostRequest {
	int id;
    String name;
    public void setId(int id) {
		this.id = id;
	}
    public int getId() {
		return id;
	}
    public void setName(String name) {
		this.name = name;
	}
    public String getName() {
		return name;
	}

}
