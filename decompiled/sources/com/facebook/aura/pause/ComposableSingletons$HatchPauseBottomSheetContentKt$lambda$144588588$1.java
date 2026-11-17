package com.facebook.aura.pause;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C06G;
import X.C07C;
import X.C1822Arm;
import X.C3U4;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchPauseBottomSheetContentKt$lambda$144588588$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchPauseBottomSheetContentKt$lambda$144588588$1 INSTANCE = new ComposableSingletons$HatchPauseBottomSheetContentKt$lambda$144588588$1();

    public ComposableSingletons$HatchPauseBottomSheetContentKt$lambda$144588588$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f23);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title3Medium;
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingLarge;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0B(bs0, f, 0.0f), jA0C, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120f20);
            C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
            AuraTextKt.m2639AuraTextUY9GdpU(strA0v, C3U4.A0B(bs0, f, 0.0f), C06G.A0C(bfm), c1822ArmA0Z, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            return;
        }
        bfm.Afo();
    }
}
