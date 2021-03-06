/*******************************************************************************
 * Copyright (c) 2015 Red Hat, Inc. Distributed under license by Red Hat, Inc.
 * All rights reserved. This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Red Hat, Inc.
 ******************************************************************************/
package com.openshift.restclient.images;

/**
 * @author Jeff Cantrill
 */
public class DockerImageDescriptor{
	
	private final String description;
	private final DockerImageURI name;

	public DockerImageDescriptor(DockerImageURI name, String description){
		this.name = name;		
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	public DockerImageURI getImageUri() {
		return name;
	}
	
}