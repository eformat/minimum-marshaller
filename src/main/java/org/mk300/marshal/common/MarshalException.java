/*
 * Copyright 2014 Masazumi Kobayashi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mk300.marshal.common;

import java.io.IOException;

/**
 * 
 * @author mkobayas@redhat.com
 *
 */
public class MarshalException extends IOException {

	private static final long serialVersionUID = 1L;

	public MarshalException() {
	}

	public MarshalException(String message) {
		super(message);
	}

	public MarshalException(Throwable cause) {
		super(cause);
	}

	public MarshalException(String message, Throwable cause) {
		super(message, cause);
	}

}
