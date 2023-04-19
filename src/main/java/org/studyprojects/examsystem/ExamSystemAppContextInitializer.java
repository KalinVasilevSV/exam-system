package org.studyprojects.examsystem;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.studyprojects.examsystem.config.ExamSystemAppConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class ExamSystemAppContextInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(ExamSystemAppConfig.class);

        DispatcherServlet servlet = new DispatcherServlet(context);
        ServletRegistration.Dynamic registration = servletContext.addServlet("exam-system-dispatcher", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/*");
    }
}
