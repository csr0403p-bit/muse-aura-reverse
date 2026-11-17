package X;

/* loaded from: classes5.dex */
public final class CDM extends C06G {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CDM) {
                CDM cdm = (CDM) obj;
                if (!C7384Etj.areEqual(this.A00, cdm.A00) || this.A01 != cdm.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A00) + BV7.A02(this.A01 ? 1 : 0);
    }

    public CDM(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
