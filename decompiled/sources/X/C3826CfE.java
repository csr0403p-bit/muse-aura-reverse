package X;

import java.util.Arrays;

/* renamed from: X.CfE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3826CfE {
    public final Cbx A00;
    public final EnumC10409Hbg A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;

    public /* synthetic */ C3826CfE(Cbx cbx, EnumC10409Hbg enumC10409Hbg, Boolean bool, Integer num, Integer num2) {
        this.A01 = enumC10409Hbg;
        this.A02 = bool;
        this.A00 = cbx;
        this.A03 = num;
        this.A04 = num2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C3826CfE) {
                C3826CfE c3826CfE = (C3826CfE) obj;
                if (!CS7.A01(this.A01, c3826CfE.A01) || !CS7.A01(this.A02, c3826CfE.A02) || !CS7.A01(this.A00, c3826CfE.A00) || !CS7.A01(this.A03, c3826CfE.A03) || !CS7.A01(this.A04, c3826CfE.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, null, this.A00, this.A03, this.A04});
    }
}
