package X;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.GpJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10095GpJ {
    public static final InterfaceC10076Gox A01 = new C10090GpE();
    public final Object A00;

    public final AbstractC10095GpJ A00(Annotation annotation) {
        C10070Gor c10070Gor;
        if (this instanceof C10070Gor) {
            c10070Gor = (C10070Gor) this;
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            Class<?> cls = c10070Gor.A00;
            if (cls != clsAnnotationType) {
                return new C9990GnH(cls, clsAnnotationType, ((AbstractC10095GpJ) c10070Gor).A00, c10070Gor.A01, annotation);
            }
        } else {
            if (this instanceof C9990GnH) {
                C9990GnH c9990GnH = (C9990GnH) this;
                c9990GnH.A00.put(annotation.annotationType(), annotation);
                return c9990GnH;
            }
            Object obj = this.A00;
            Class<? extends Annotation> clsAnnotationType2 = annotation.annotationType();
            c10070Gor = new C10070Gor(obj);
            c10070Gor.A00 = clsAnnotationType2;
        }
        c10070Gor.A01 = annotation;
        return c10070Gor;
    }

    public final C9971Gmk A01() {
        if (this instanceof C10070Gor) {
            C10070Gor c10070Gor = (C10070Gor) this;
            Class<?> cls = c10070Gor.A00;
            Annotation annotation = c10070Gor.A01;
            HashMap<Class<?>, Annotation> mapA0v = BV4.A0v(4);
            mapA0v.put(cls, annotation);
            C9971Gmk c9971Gmk = new C9971Gmk();
            c9971Gmk.A00 = mapA0v;
            return c9971Gmk;
        }
        if (!(this instanceof C9990GnH)) {
            return new C9971Gmk();
        }
        C9971Gmk c9971Gmk2 = new C9971Gmk();
        Iterator itA0x = BV5.A0x(((C9990GnH) this).A00);
        while (itA0x.hasNext()) {
            Annotation annotation2 = (Annotation) itA0x.next();
            HashMap<Class<?>, Annotation> mapA0u = c9971Gmk2.A00;
            if (mapA0u == null) {
                mapA0u = BV4.A0u();
                c9971Gmk2.A00 = mapA0u;
            }
            Annotation annotationPut = mapA0u.put(annotation2.annotationType(), annotation2);
            if (annotationPut != null) {
                annotationPut.equals(annotation2);
            }
        }
        return c9971Gmk2;
    }

    public final boolean A02(Annotation annotation) {
        if (this instanceof C10070Gor) {
            return AnonymousClass002.A1Z(annotation.annotationType(), ((C10070Gor) this).A00);
        }
        if (this instanceof C9990GnH) {
            return ((C9990GnH) this).A00.containsKey(annotation.annotationType());
        }
        return false;
    }

    public AbstractC10095GpJ(Object obj) {
        this.A00 = obj;
    }
}
