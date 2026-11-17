package X;

import java.lang.annotation.Annotation;
import java.util.List;

/* renamed from: X.9iZ, reason: invalid class name */
/* loaded from: classes4.dex */
public interface C9iZ {
    List<Annotation> AF2(int i);

    C9iZ AF3(int i);

    int AF4(String str);

    String AF5(int i);

    int AF6();

    BL8 AGs();

    String AKP();

    boolean AOL(int i);

    boolean AOo();

    List<Annotation> getAnnotations();

    boolean isInline();

    static IllegalArgumentException A00(C9iZ c9iZ, InterfaceC07829iw interfaceC07829iw) {
        return new IllegalArgumentException(A5p.A00(c9iZ.AKP(), interfaceC07829iw));
    }

    static IllegalArgumentException A01(C9iZ c9iZ, InterfaceC07789is interfaceC07789is) {
        return new IllegalArgumentException(A5p.A01(c9iZ.AKP(), interfaceC07789is));
    }
}
