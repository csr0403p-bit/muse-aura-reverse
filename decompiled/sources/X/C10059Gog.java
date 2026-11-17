package X;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/* renamed from: X.Gog, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10059Gog implements InterfaceC10076Gox, Serializable {
    public static final long serialVersionUID = 1;
    public final Class<?> _type1;
    public final Class<?> _type2;
    public final Annotation _value1;
    public final Annotation _value2;

    @Override // X.InterfaceC10076Gox
    public final boolean AND(Class<? extends Annotation>[] clsArr) {
        for (Class<? extends Annotation> cls : clsArr) {
            if (cls == this._type1 || cls == this._type2) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC10076Gox
    public final <A extends Annotation> A AC0(Class<A> cls) {
        if (this._type1 == cls) {
            return (A) this._value1;
        }
        if (this._type2 == cls) {
            return (A) this._value2;
        }
        return null;
    }

    @Override // X.InterfaceC10076Gox
    public final int size() {
        return 2;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;Ljava/lang/annotation/Annotation;Ljava/lang/Class<*>;Ljava/lang/annotation/Annotation;)V */
    public C10059Gog(Class cls, Class cls2, Annotation annotation, Annotation annotation2) {
        this._type1 = cls;
        this._value1 = annotation;
        this._type2 = cls2;
        this._value2 = annotation2;
    }
}
