package org.codehaus.jackson.annotate;

/**
 * Annotation that can be used to define ordering (possibly partial) to use
 * when serializing object properties. Properties included in annotation
 * declaration will be serialized first (in defined order), followed by
 * any properties not included in the definition.
 * Annotation definition will override any implicit orderings (such as
 * guarantee that Creator-properties are serialized before non-creator
 * properties)
 *<p>
 * This annotation has no effect on deserialization.
 * 
 * @since 1.4
 */
public @interface JsonPropertyOrder {
    /**
     * Order in which properties of annotated object are to be serialized in.
     */
    public String[] value() default { };

    /**
     * Property that defines what to do regarding ordering of properties
     * not explicitly included in annotation instance. If set to true,
     * they will be alphabetically ordered; if false, order is
     * undefined (default setting)
     */
    public boolean alphabetic() default false;
}
