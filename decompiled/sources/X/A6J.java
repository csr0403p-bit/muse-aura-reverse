package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class A6J {
    public final Map<BNw<?>, Object> A00 = new LinkedHashMap();

    public <T> T A00(BNw<T> bNw) {
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof A6J) && this.A00.equals(((A6J) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("CreationExtras(extras="));
    }
}
