package com.facebook.aura.vds.compose.font;

import X.ATD;
import X.AXN;
import X.AbstractC7559F3s;
import X.B0G;
import X.C3cI;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.bloks.fonts.AuraTypefaceCreatorKt;

/* loaded from: classes4.dex */
public final class OptimisticAiFont$Loader$toAndroidString$1 extends AbstractC7559F3s implements G0U<B0G, CharSequence> {
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ int $weightAdjustment;

    @Override // X.G0U
    public final CharSequence invoke(B0G b0g) {
        C7384Etj.A0Y(b0g, 0);
        float fAhA = b0g.AhA(this.$density);
        String strACh = b0g.ACh();
        if (AuraTypefaceCreatorKt.WEIGHT_AXIS.equals(strACh)) {
            fAhA = ATD.A03(fAhA + this.$weightAdjustment, 1.0f, 1000.0f);
        }
        StringBuilder sbA0x = C3cI.A0x("'", strACh);
        sbA0x.append("' ");
        sbA0x.append(fAhA);
        return sbA0x.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptimisticAiFont$Loader$toAndroidString$1(AXN axn, int i) {
        super(1);
        this.$density = axn;
        this.$weightAdjustment = i;
    }
}
