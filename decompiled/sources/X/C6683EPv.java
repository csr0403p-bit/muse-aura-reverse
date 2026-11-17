package X;

/* renamed from: X.EPv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6683EPv {
    public EPM A00;
    public final String A01;
    public final EnumC7407Eul A02;

    public C6683EPv() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6683EPv) {
                C6683EPv c6683EPv = (C6683EPv) obj;
                if (this.A00 == c6683EPv.A00 && this.A02 == c6683EPv.A02) {
                    String str = this.A01;
                    String str2 = c6683EPv.A01;
                    if (str == null) {
                        if (str2 != null) {
                        }
                    } else if (str2 == null || !str.equals(str2)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0E(this.A00, this.A01, this.A02);
    }

    public final String toString() {
        EPM epm = this.A00;
        EnumC7407Eul enumC7407Eul = this.A02;
        String str = this.A01;
        StringBuilder sbA0f = C3cG.A0f(epm, "FXEligibilityItem(appSource=");
        sbA0f.append(", itemType=");
        sbA0f.append(enumC7407Eul);
        return C3cJ.A0N(", item=", str, sbA0f);
    }

    public C6683EPv(String str, EPM epm, EnumC7407Eul enumC7407Eul) {
        this.A00 = epm;
        this.A02 = enumC7407Eul;
        this.A01 = str;
    }
}
