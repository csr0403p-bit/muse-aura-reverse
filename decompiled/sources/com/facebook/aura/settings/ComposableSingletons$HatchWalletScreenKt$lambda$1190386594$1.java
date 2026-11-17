package com.facebook.aura.settings;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.C3U4;
import X.C78N;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchWalletScreenKt$lambda$1190386594$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchWalletScreenKt$lambda$1190386594$1 INSTANCE = new ComposableSingletons$HatchWalletScreenKt$lambda$1190386594$1();

    public ComposableSingletons$HatchWalletScreenKt$lambda$1190386594$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, anonymousClass037), bfm, i)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ada);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            long jA08 = C06G.A08(bfm);
            BRg bRgA06 = C3U4.A06(C10G.A02, AuraDimensKt.SpacingXlarge);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ComposableSingletons$HatchWalletScreenKt$lambda$1190386594$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA06, objAaT, false), jA08, c1822ArmA0T, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            return;
        }
        bfm.Afo();
    }
}
