package X;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class EYK implements EYY, Cloneable {
    public static final EYK A02 = new EYK();
    public List A00;
    public List A01;

    private final boolean A00(Class<?> cls, boolean z) {
        List list;
        if (z) {
            list = this.A01;
        } else {
            if (!Enum.class.isAssignableFrom(cls) && !Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
            list = this.A00;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        throw BV4.A0a("shouldSkipClass");
    }

    @Override // X.EYY
    public final <T> AbstractC6735EXt<T> create(EYC eyc, C6753EYn<T> c6753EYn) {
        Class<? super T> cls = c6753EYn.A01;
        boolean zA00 = A00(cls, true);
        boolean zA002 = A00(cls, false);
        if (zA00 || zA002) {
            return new EYJ(eyc, this, c6753EYn, zA002, zA00);
        }
        return null;
    }

    public final boolean A01(Field field, boolean z) {
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || A00(field.getType(), z)) {
            return true;
        }
        List list = z ? this.A01 : this.A00;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw BV4.A0a("shouldSkipField");
            }
        }
        return false;
    }

    public EYK() {
        List list = Collections.EMPTY_LIST;
        this.A01 = list;
        this.A00 = list;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw BV4.A0N(e);
        }
    }
}
