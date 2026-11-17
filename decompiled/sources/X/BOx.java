package X;

/* loaded from: classes4.dex */
public final class BOx {
    public final Object A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BOx) {
                BOx bOx = (BOx) obj;
                if (!C7384Etj.areEqual(this.A01, bOx.A01) || !C7384Etj.areEqual(this.A00, bOx.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A01) + AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ValueElement(name=");
        sbA0x.append(this.A01);
        sbA0x.append(", value=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public BOx(String str, Object obj) {
        this.A01 = str;
        this.A00 = obj;
    }
}
