package com.yj.springboot3.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author YangJian
 * @date 2023/12/22 10:47
 * @description
 *
 */
public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 在这里编写判断逻辑，返回true表示满足条件，返回false表示不满足条件
        return true; // 假设这里判断为true，即满足条件
    }


}
