package ru.eltech.stud.kaignatev.stodo.annotations;

import ru.eltech.stud.kaignatev.stodo.validations.PasswordMathcesValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMathcesValidator.class)
@Documented
public @interface PasswordMatches {
    String message() default "Password don't match";
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default {};
}
