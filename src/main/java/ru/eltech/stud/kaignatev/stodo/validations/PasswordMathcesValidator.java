package ru.eltech.stud.kaignatev.stodo.validations;

import ru.eltech.stud.kaignatev.stodo.annotations.PasswordMatches;
import ru.eltech.stud.kaignatev.stodo.payload.request.SignUpRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMathcesValidator implements ConstraintValidator<PasswordMatches, Object> {
    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext constraintValidatorContext) {
        SignUpRequest userSignUpRequest = (SignUpRequest) obj;
        return userSignUpRequest
                .getPassword()
                .equals(userSignUpRequest.getConfirmPassword());
    }
}
