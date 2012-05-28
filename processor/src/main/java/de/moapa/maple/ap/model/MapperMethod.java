/**
 *  Copyright 2012 Gunnar Morling (http://www.gunnarmorling.de/)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package de.moapa.maple.ap.model;

import java.util.List;

public class MapperMethod {

	private final String name;
	private final Type returnType;
	private final Parameter parameter;
	private final List<Binding> bindings;

	public MapperMethod(String name, Type returnType, Parameter parameter, List<Binding> bindings) {
		this.name = name;
		this.returnType = returnType;
		this.parameter = parameter;
		this.bindings = bindings;
	}

	public String getName() {
		return name;
	}

	public Type getReturnType() {
		return returnType;
	}

	public Parameter getParameter() {
		return parameter;
	}

	public List<Binding> getBindings() {
		return bindings;
	}
}
