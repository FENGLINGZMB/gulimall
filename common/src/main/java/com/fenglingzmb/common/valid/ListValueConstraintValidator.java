package com.fenglingzmb.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author fenglingzmb
 * @date 2022/6/18
 */
public class ListValueConstraintValidator implements ConstraintValidator<ListValue, Integer> {
    private Set<Integer> values;

    // 初始化方法，从注解处获取一些详细信息
    @Override
    public void initialize(ListValue constraintAnnotation) {
        values = Arrays.stream(constraintAnnotation.values()).boxed().collect(Collectors.toSet());
    }

    // 校验逻辑
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return values.contains(value);
    }
}
