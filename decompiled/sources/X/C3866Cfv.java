package X;

/* renamed from: X.Cfv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3866Cfv extends AbstractC3929ChB {
    public final AbstractC3931ChD A00;
    public final EnumC7435Evv A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3929ChB) {
                EnumC7435Evv enumC7435Evv = this.A01;
                C3866Cfv c3866Cfv = (C3866Cfv) ((AbstractC3929ChB) obj);
                EnumC7435Evv enumC7435Evv2 = c3866Cfv.A01;
                if (enumC7435Evv != null ? enumC7435Evv.equals(enumC7435Evv2) : enumC7435Evv2 == null) {
                    AbstractC3931ChD abstractC3931ChD = this.A00;
                    AbstractC3931ChD abstractC3931ChD2 = c3866Cfv.A00;
                    if (abstractC3931ChD == null) {
                        if (abstractC3931ChD2 == null) {
                        }
                    } else if (abstractC3931ChD.equals(abstractC3931ChD2)) {
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
        StringBuilder sbA0x = C60O.A0x("ClientInfo{clientType=");
        sbA0x.append(this.A01);
        sbA0x.append(", androidClientInfo=");
        return BV8.A0v(this.A00, sbA0x);
    }

    public C3866Cfv(AbstractC3931ChD abstractC3931ChD, EnumC7435Evv enumC7435Evv) {
        this.A01 = enumC7435Evv;
        this.A00 = abstractC3931ChD;
    }
}
