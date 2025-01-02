package me.whiteship.chapter06.item41;

import me.whiteship.chapter06.item41.marker_annotation.MyAnnotation;
import me.whiteship.chapter06.item41.marker_interface.MyInterface;
import org.springframework.context.annotation.Conditional;

import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Sample implements Serializable {

    public String hello() {
        return "hello";
    }

}
