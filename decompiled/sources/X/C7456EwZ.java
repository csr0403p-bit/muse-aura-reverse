package X;

/* renamed from: X.EwZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7456EwZ {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7456EwZ) {
                C7456EwZ c7456EwZ = (C7456EwZ) obj;
                if (this.A01 != c7456EwZ.A01 || !C7384Etj.areEqual(this.A00, c7456EwZ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A00, (this.A01 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        return C3cJ.A0N(", canonicalTemplate=", this.A00, C60O.A10("LegacyFieldKeyTemplateKey(isTemplated=", this.A01));
    }

    public C7456EwZ(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }
}
