package X;

/* loaded from: classes4.dex */
public final class BE6 extends C06G {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BE6) {
                BE6 be6 = (BE6) obj;
                if (!C7384Etj.areEqual(this.A00, be6.A00) || !C7384Etj.areEqual(this.A01, be6.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A01, AnonymousClass001.A0G(this.A00));
    }

    public BE6(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
