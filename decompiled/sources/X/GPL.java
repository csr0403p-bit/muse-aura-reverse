package X;

/* loaded from: classes6.dex */
public final class GPL extends C06G {
    public final C10574Huh A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GPL) {
                GPL gpl = (GPL) obj;
                if (!C7384Etj.areEqual(this.A01, gpl.A01) || !C7384Etj.areEqual(this.A02, gpl.A02) || !C7384Etj.areEqual(this.A00, gpl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, ((AnonymousClass006.A0G(this.A01) * 31) + AnonymousClass005.A0H(this.A02)) * 31);
    }

    public GPL(C10574Huh c10574Huh, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = c10574Huh;
    }
}
