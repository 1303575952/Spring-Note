package io.github.felix.spring.ioc.java;

import io.github.felix.spring.ioc.annotation.AnnotationComponentScan;
import io.github.felix.spring.ioc.sample.job.Teacher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 展示Java方式扫描注解
 *
 * @author felix
 * @see AnnotationComponentScan
 */
public class ComponentScanInJava {
    private static final Logger log = LoggerFactory.getLogger(ComponentScanInJava.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("io.github.felix.spring.ioc");
        ctx.refresh();
        Teacher teacher = (Teacher) ctx.getBean("teacher");
        log.debug(teacher.work());
    }
}
