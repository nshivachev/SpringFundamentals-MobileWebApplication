package org.softuni.mobilewebapplication.model.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.Year;

public class YearNotInTheFutureValidator implements ConstraintValidator<YearNotInTheFuture, Number> {

    @Override
    public boolean isValid(Number value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null) {
            return true;
        }

        return value.intValue() <= Year.now().getValue();
    }
}