package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class Cbx {
    public final BXk A00;
    public final EnumC2382BXl A01;
    public final BXm A02;
    public final EnumC2381BXj A03;
    public final Boolean A04;
    public final Float A05;

    public /* synthetic */ Cbx(BXk bXk, EnumC2382BXl enumC2382BXl, BXm bXm, EnumC2381BXj enumC2381BXj, Boolean bool, Float f) {
        this.A02 = bXm;
        this.A00 = bXk;
        this.A03 = enumC2381BXj;
        this.A01 = enumC2382BXl;
        this.A04 = bool;
        this.A05 = f;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Cbx) {
                Cbx cbx = (Cbx) obj;
                if (!CS7.A01(this.A02, cbx.A02) || !CS7.A01(this.A00, cbx.A00) || !CS7.A01(this.A03, cbx.A03) || !CS7.A01(this.A01, cbx.A01) || !CS7.A01(this.A04, cbx.A04) || !CS7.A01(this.A05, cbx.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00, this.A03, this.A01, this.A04, this.A05});
    }
}
