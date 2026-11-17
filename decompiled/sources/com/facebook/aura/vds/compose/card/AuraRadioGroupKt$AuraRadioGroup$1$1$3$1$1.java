package com.facebook.aura.vds.compose.card;

import X.AVy;
import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C0v5;
import X.C78N;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraRadioGroupKt$AuraRadioGroup$1$1$3$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $icon;
    public final /* synthetic */ AuraRadioTapOption $option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraRadioGroupKt$AuraRadioGroup$1$1$3$1$1(AuraRadioTapOption auraRadioTapOption, int i) {
        super(2);
        this.$option = auraRadioTapOption;
        this.$icon = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        BBI bbiA0M;
        BRg bRgA0Y;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AuraRadioTapOption auraRadioTapOption = this.$option;
            Function0<Unit> function0 = auraRadioTapOption.onClick;
            if (auraRadioTapOption.iconFocusable && function0 != null) {
                bfm.AgE(-181901875);
                BRg bRgA04 = C0v5.A04(BRg.A00, null, null, function0, true);
                boolean zA67 = bfm.A67(this.$option);
                AuraRadioTapOption auraRadioTapOption2 = this.$option;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new AuraRadioGroupKt$AuraRadioGroup$1$1$3$1$1$iconModifier$1$1(auraRadioTapOption2);
                    bfm.Ai0(objAaT);
                }
                bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, false);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -181511275);
                bRgA0Y = BRg.A00;
            }
            if (this.$option.iconTint == null) {
                bfm.AgE(-560038997);
                AuraCardDefaults.INSTANCE.m2478LeadingIcongKt5lHk(bRgA0Y, AbstractC8407FdO.A00(bfm, this.$icon), null, bfm, (AVy.$stable << 3) | 3072, 4);
            } else {
                bfm.AgE(-560031293);
                AuraCardDefaults.INSTANCE.m2478LeadingIcongKt5lHk(bRgA0Y, AbstractC8407FdO.A00(bfm, this.$icon), this.$option.iconTint, bfm, (AVy.$stable << 3) | 3072, 0);
            }
            BBI.A0R(bbiA0M, false);
            return;
        }
        bfm.Afo();
    }
}
