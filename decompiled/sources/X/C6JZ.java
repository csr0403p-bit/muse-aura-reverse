package X;

/* renamed from: X.6JZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JZ<T> {
    public final String A00;

    public final boolean equals(Object obj) {
        if (obj instanceof C6JZ) {
            return C7384Etj.areEqual(this.A00, ((C6JZ) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00;
    }

    public C6JZ(String str) {
        this.A00 = str;
    }
}
