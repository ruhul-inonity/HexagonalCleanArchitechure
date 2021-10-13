package com.inonity.justpay.common;

import javax.validation.*;
import java.util.Set;

/**
 * Created by @ruhul on 10/10/21
 */

public abstract class SelfValidating<T> {

    private Validator validator;

    public SelfValidating() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    /**
     * Evaluates all Bean Validations on the attributes of this
     * instance.
     */
    protected void validateSelf() {
        Set<ConstraintViolation<T>> violations = validator.validate((T) this);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }
}

