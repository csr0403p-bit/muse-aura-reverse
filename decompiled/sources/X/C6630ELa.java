package X;

/* renamed from: X.ELa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6630ELa {
    public final int A00;
    public final String A01;

    public C6630ELa(String str, int i) {
        C7384Etj.A0Y(str, 0);
        this.A01 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6630ELa) {
                C6630ELa c6630ELa = (C6630ELa) obj;
                if (!this.A01.equals(c6630ELa.A01) || this.A00 != c6630ELa.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public final String toString() {
        return FGI.A0A(this.A00, "WorkGenerationalId(workSpecId=", this.A01, ", generation=", ")");
    }
}
