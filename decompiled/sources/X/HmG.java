package X;

import android.graphics.Color;

/* loaded from: classes6.dex */
public final class HmG implements InterfaceC10514HoR<Integer> {
    public static final HmG A00 = new HmG();

    @Override // X.InterfaceC10514HoR
    public final /* bridge */ /* synthetic */ Integer AXc(AbstractC6806EaH abstractC6806EaH, float f) {
        boolean z = false;
        if (abstractC6806EaH.A0C() == C79.A00) {
            z = true;
            abstractC6806EaH.A0F();
        }
        double dA09 = abstractC6806EaH.A09();
        double dA092 = abstractC6806EaH.A09();
        double dA093 = abstractC6806EaH.A09();
        double dA094 = abstractC6806EaH.A0C() == C79.A0W ? abstractC6806EaH.A09() : 1.0d;
        if (z) {
            abstractC6806EaH.A0H();
        }
        if (dA09 <= 1.0d && dA092 <= 1.0d && dA093 <= 1.0d) {
            dA09 *= 255.0d;
            dA092 *= 255.0d;
            dA093 *= 255.0d;
            if (dA094 <= 1.0d) {
                dA094 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dA094, (int) dA09, (int) dA092, (int) dA093));
    }
}
