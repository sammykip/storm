/**
 * 
 */
package in.cubestack.android.lib.storm.core;

import in.cubestack.android.lib.storm.FieldType;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;


/**
 * A core Android SQLite ORM framrwork build for speed and raw execution.
 * Copyright (c) 2014  CubeStack. Version built for Flash Back..
 * <p/>
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 * <p/>
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE
 * USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public class FieldTypeResolver {
	
	private static final List<FieldType> INT_TYPES = Arrays.asList(new FieldType[] {FieldType.INTEGER, FieldType.LONG});
	private static final List<FieldType> FLOATING_TYPES = Arrays.asList(new FieldType[] {FieldType.DOUBLE, FieldType.REAL});

	
	public FieldType fetchMatching(Field field, FieldType fieldType) {
		if(INT_TYPES.contains(fieldType)) {
			if(field.getType().getSimpleName().equalsIgnoreCase(Long.class.getSimpleName())) {
				return FieldType.LONG;
			} else {
				return FieldType.INTEGER;
			}
		}
		
		if(FLOATING_TYPES.contains(fieldType)) {
			if(field.getType().getSimpleName().equalsIgnoreCase(Float.class.getSimpleName())) {
				return FieldType.REAL;
			} else if(field.getType().getSimpleName().equalsIgnoreCase(Double.class.getSimpleName())) {
				return FieldType.DOUBLE;
			}
		}
		
		//Return default
		return fieldType;
	}

}