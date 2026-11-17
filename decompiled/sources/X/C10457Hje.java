package X;

/* renamed from: X.Hje, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10457Hje {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.health.connect.client.records.metadata.Device");
                C10457Hje c10457Hje = (C10457Hje) obj;
                if (this.A00 != c10457Hje.A00 || !C7384Etj.areEqual(this.A01, c10457Hje.A01) || !C7384Etj.areEqual(this.A02, c10457Hje.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA0I = ((this.A00 * 31) + BV7.A0I(this.A01)) * 31;
        String str = this.A02;
        return iA0I + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Device(type=");
        sbA0x.append(this.A00);
        sbA0x.append(BV3.A00(18));
        sbA0x.append(this.A01);
        sbA0x.append(", model=");
        sbA0x.append(this.A02);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C10457Hje(int i, String str, String str2) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }
}
