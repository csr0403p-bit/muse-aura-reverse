package X;

import java.io.Serializable;

/* renamed from: X.Gir, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9848Gir<T> implements Serializable {
    public final T A00(Object obj) {
        if (!(this instanceof C9994GnN)) {
            throw C8j3.A17();
        }
        C9994GnN c9994GnN = (C9994GnN) this;
        try {
            return (T) GmW.A02(c9994GnN._property, obj);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException(FGI.A0d("Problem accessing property '", c9994GnN._property._name._value, "': ", e2.getMessage()), e2);
        }
    }
}
