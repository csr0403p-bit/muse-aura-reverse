package X;

/* renamed from: X.Bbj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2456Bbj extends AbstractC2457Bbk {
    public final EnumC2388BYo A00;
    public final EnumC2387BYn A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2457Bbk) {
                EnumC2387BYn enumC2387BYn = this.A01;
                C2456Bbj c2456Bbj = (C2456Bbj) ((AbstractC2457Bbk) obj);
                EnumC2387BYn enumC2387BYn2 = c2456Bbj.A01;
                if (enumC2387BYn != null ? enumC2387BYn.equals(enumC2387BYn2) : enumC2387BYn2 == null) {
                    EnumC2388BYo enumC2388BYo = this.A00;
                    EnumC2388BYo enumC2388BYo2 = c2456Bbj.A00;
                    if (enumC2388BYo == null) {
                        if (enumC2388BYo2 == null) {
                        }
                    } else if (enumC2388BYo.equals(enumC2388BYo2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass006.A0D(this.A01) ^ 1000003) * 1000003) ^ C3cH.A02(this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("NetworkConnectionInfo{networkType=");
        sbA0x.append(this.A01);
        sbA0x.append(", mobileSubtype=");
        return BV8.A0v(this.A00, sbA0x);
    }

    public C2456Bbj(EnumC2388BYo enumC2388BYo, EnumC2387BYn enumC2387BYn) {
        this.A01 = enumC2387BYn;
        this.A00 = enumC2388BYo;
    }
}
