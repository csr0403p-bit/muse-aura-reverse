package X;

/* loaded from: classes4.dex */
public final class AuA {
    public final At0 A00;
    public final Au2 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuA) {
                AuA auA = (AuA) obj;
                if (!this.A00.equals(auA.A00) || !this.A01.equals(auA.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TransformedText(text=");
        sbA0x.append((Object) this.A00);
        sbA0x.append(", offsetMapping=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public AuA(At0 at0, Au2 au2) {
        this.A00 = at0;
        this.A01 = au2;
    }
}
