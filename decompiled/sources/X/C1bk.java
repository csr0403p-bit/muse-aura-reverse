package X;

import java.util.Arrays;

/* renamed from: X.1bk, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1bk {
    public static final C1bk A01 = new C1bk(-1);
    public static final C1bk A02 = new C1bk(-2);
    public final int A00;

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C1bk) && this.A00 == ((C1bk) obj).A00);
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.A00);
        Boolean boolA0h = AnonymousClass001.A0h();
        return ((numValueOf.hashCode() + 31) * 31) + boolA0h.hashCode();
    }

    public final String toString() {
        return String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.A00), AnonymousClass001.A0h()}, 2));
    }

    public C1bk(int i) {
        this.A00 = i;
    }
}
