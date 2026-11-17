package X;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/* renamed from: X.Gos, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10071Gos implements InterfaceC10076Gox, Serializable {
    public static final long serialVersionUID = 1;
    public final Class<?> _type;
    public final Annotation _value;

    @Override // X.InterfaceC10076Gox
    public final boolean AND(Class<? extends Annotation>[] clsArr) {
        for (Class<? extends Annotation> cls : clsArr) {
            if (cls == this._type) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC10076Gox
    public final <A extends Annotation> A AC0(Class<A> cls) {
        if (this._type == cls) {
            return (A) this._value;
        }
        return null;
    }

    @Override // X.InterfaceC10076Gox
    public final int size() {
        return 1;
    }

    public C10071Gos(Class<?> cls, Annotation annotation) {
        this._type = cls;
        this._value = annotation;
    }
}
