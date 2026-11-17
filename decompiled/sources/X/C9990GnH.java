package X;

import java.lang.annotation.Annotation;
import java.util.HashMap;

/* renamed from: X.GnH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9990GnH extends AbstractC10095GpJ {
    public final HashMap<Class<?>, Annotation> A00;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;Ljava/lang/Class<*>;Ljava/lang/annotation/Annotation;Ljava/lang/Class<*>;Ljava/lang/annotation/Annotation;)V */
    public C9990GnH(Class cls, Class cls2, Object obj, Annotation annotation, Annotation annotation2) {
        super(obj);
        HashMap<Class<?>, Annotation> mapA0u = BV4.A0u();
        this.A00 = mapA0u;
        mapA0u.put(cls, annotation);
        mapA0u.put(cls2, annotation2);
    }
}
