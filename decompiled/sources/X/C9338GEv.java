package X;

import java.lang.reflect.Method;

/* renamed from: X.GEv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9338GEv {
    public static final Class<?>[] A02 = new Class[0];
    public final String A00;
    public final Class<?>[] A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                C9338GEv c9338GEv = (C9338GEv) obj;
                if (this.A00.equals(c9338GEv.A00)) {
                    Class<?>[] clsArr = c9338GEv.A01;
                    Class<?>[] clsArr2 = this.A01;
                    int length = clsArr2.length;
                    if (clsArr.length == length) {
                        for (int i = 0; i < length; i++) {
                            if (clsArr[i] == clsArr2[i]) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode() + this.A01.length;
    }

    public final String toString() {
        return FGI.A0X(this.A00, "(", "-args)", this.A01.length);
    }

    public C9338GEv(Method method) {
        this(method.getName(), method.getParameterTypes().length > 0 ? method.getParameterTypes() : A02);
    }

    public C9338GEv(String str, Class<?>[] clsArr) {
        this.A00 = str;
        this.A01 = clsArr == null ? A02 : clsArr;
    }
}
