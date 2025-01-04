package me.whiteship.chapter04.item20.typeframework;

/**
 * 계층구조가 불분명한 타입프레임워크를 만들 수 있다.
 */
public interface SingerSongwriter extends Singer, Songwriter {

    AudioClip strum();
    void actSensitive();
}
