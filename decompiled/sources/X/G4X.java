package X;

/* loaded from: classes6.dex */
public final class G4X extends C06G {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof G4X) {
                G4X g4x = (G4X) obj;
                if (!C7384Etj.areEqual(this.A02, g4x.A02) || !C7384Etj.areEqual(this.A03, g4x.A03) || this.A00 != g4x.A00 || this.A01 != g4x.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA0I = (AnonymousClass005.A0I(this.A03, AnonymousClass001.A0G(this.A02)) + this.A00) * 31;
        Integer num = this.A01;
        return iA0I + BV5.A03(num, G4Y.A00(num));
    }

    public G4X(String str, String str2, int i, Integer num) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A01 = num;
    }
}
