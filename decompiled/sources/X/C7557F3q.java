package X;

import java.io.Serializable;
import java.lang.Enum;

/* renamed from: X.F3q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7557F3q<E extends Enum<E>> implements Serializable {
    public static final long serialVersionUID = 0;
    public final Class<E> c;

    public C7557F3q(E[] eArr) {
        C7384Etj.A0Y(eArr, 0);
        Class<E> cls = (Class<E>) eArr.getClass().getComponentType();
        C7384Etj.A0X(cls);
        this.c = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.c.getEnumConstants();
        C7384Etj.A0U(enumConstants);
        E[] eArr = enumConstants;
        C7384Etj.A0Y(eArr, 0);
        return C3cG.A0w(eArr);
    }
}
