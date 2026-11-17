package X;

/* renamed from: X.CUm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3567CUm {
    public final int A00;
    public final int A01;
    public final Class<?> A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3567CUm)) {
            return false;
        }
        C3567CUm c3567CUm = (C3567CUm) obj;
        return this.A02 == c3567CUm.A02 && this.A01 == c3567CUm.A01 && this.A00 == c3567CUm.A00;
    }

    public final int hashCode() {
        return ((((this.A02.hashCode() ^ 1000003) * 1000003) ^ this.A01) * 1000003) ^ this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Dependency{anInterface=");
        sbA0x.append(this.A02);
        sbA0x.append(", type=");
        sbA0x.append(this.A01 == 1 ? "required" : "set");
        sbA0x.append(", injection=");
        sbA0x.append(this.A00 != 0 ? "provider" : "direct");
        return BV7.A11(sbA0x);
    }

    public C3567CUm(Class<?> cls, int i, int i2) {
        this.A02 = cls;
        this.A01 = i;
        this.A00 = i2;
    }
}
