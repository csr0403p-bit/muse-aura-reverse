package com.facebook.aura.vmdisabled.content;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BFM;
import X.C06G;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$VmDisabledOverlayContentKt$lambda$460502707$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$VmDisabledOverlayContentKt$lambda$460502707$1 INSTANCE = new ComposableSingletons$VmDisabledOverlayContentKt$lambda$460502707$1();

    public ComposableSingletons$VmDisabledOverlayContentKt$lambda$460502707$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12111d);
            C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
            AuraTextKt.m2639AuraTextUY9GdpU(strA0v, C10G.A02, C06G.A08(bfm), c1822ArmA0Z, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            return;
        }
        bfm.Afo();
    }
}
