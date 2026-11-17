package X;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class HsJ<T> implements Serializable {
    public final Object value;

    public static final Throwable A00(Object obj) {
        if (obj instanceof C10571Hud) {
            return ((C10571Hud) obj).exception;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HsJ) && C7384Etj.areEqual(this.value, ((HsJ) obj).value);
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.value);
    }

    public final String toString() {
        Object obj = this.value;
        boolean z = obj instanceof C10571Hud;
        Object obj2 = obj;
        if (!z) {
            StringBuilder sbA0f = C3cG.A0f(obj, "Success(");
            sbA0f.append(')');
            obj2 = sbA0f;
        }
        return obj2.toString();
    }

    public /* synthetic */ HsJ(Object obj) {
        this.value = obj;
    }
}
