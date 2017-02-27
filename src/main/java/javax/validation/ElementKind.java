/*
 * Bean Validation API
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package javax.validation;

/**
 * Enum of possible kinds of elements encountered in Bean Validation.
 * <p>
 * Mostly elements that can be constrained and described in the metadata
 * but also elements that can be part of a {@link Path} and represented
 * by a {@link Path.Node}
 *
 * @author Emmanuel Bernard
 * @author Gunnar Morling
 * @author Guillaume Smet
 *
 * @since 1.1
 */
public enum ElementKind {
	/**
	 * A Java Bean or object.
	 */
	BEAN,

	/**
	 * A property of a Java Bean.
	 */
	PROPERTY,

	/**
	 * A method.
	 */
	METHOD,

	/**
	 * A constructor.
	 */
	CONSTRUCTOR,

	/**
	 * A parameter of a method or constructor.
	 */
	PARAMETER,

	/**
	 * Element holding cross-parameter constraints of a method or constructor.
	 */
	CROSS_PARAMETER,

	/**
	 * The return value of a method or constructor.
	 */
	RETURN_VALUE,

	/**
	 * A container element e.g. a type argument of a generic declaration.
	 *
	 * @since 2.0
	 */
	CONTAINER_ELEMENT
}
