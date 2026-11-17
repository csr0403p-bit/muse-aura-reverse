package X;

/* renamed from: X.BxE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3075BxE {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3075BxE) {
                C3075BxE c3075BxE = (C3075BxE) obj;
                if (!this.A01.equals(c3075BxE.A01) || this.A00 != c3075BxE.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A01) + this.A00;
    }

    public final String toString() {
        return FGI.A0A(this.A00, "Key(agsl=", this.A01, ", passes=", ")");
    }

    public C3075BxE(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
