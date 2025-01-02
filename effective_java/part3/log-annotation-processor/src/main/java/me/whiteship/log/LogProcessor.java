package me.whiteship.log;

import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.tools.Diagnostic;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Retention;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes("me.whiteship.log.Log")
@SupportedSourceVersion(SourceVersion.RELEASE_17)
@AutoService(Processor.class)
public class LogProcessor extends AbstractProcessor {

    private Elements elementUtils;
    private Messager messager;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        elementUtils = processingEnv.getElementUtils();
        messager = processingEnv.getMessager();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        messager.printMessage(Diagnostic.Kind.WARNING, "Processing Log annotation");
        for (Element element : roundEnv.getElementsAnnotatedWith(Log.class)) {
            if (element instanceof ExecutableElement) {
                ExecutableElement method = (ExecutableElement) element;
                TypeElement classElement = (TypeElement) method.getEnclosingElement();
                String className = classElement.getQualifiedName().toString();
                String methodName = method.getSimpleName().toString();

                // 로그 출력
                messager.printMessage(Diagnostic.Kind.WARNING, "Processing method: " + className + "." + methodName);

                // 여기서 추가 작업 수행 가능
            }
        }
        return true;
    }
}
