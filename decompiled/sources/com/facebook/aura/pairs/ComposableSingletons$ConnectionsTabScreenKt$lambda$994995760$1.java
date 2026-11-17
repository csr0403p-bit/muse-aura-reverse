package com.facebook.aura.pairs;

import X.ARD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C1822Arm;
import X.C3U4;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.pairs.ComposableSingletons$ConnectionsTabScreenKt$lambda$-994995760$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConnectionsTabScreenKt$lambda$994995760$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConnectionsTabScreenKt$lambda$994995760$1 INSTANCE = new ComposableSingletons$ConnectionsTabScreenKt$lambda$994995760$1();

    public ComposableSingletons$ConnectionsTabScreenKt$lambda$994995760$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, anonymousClass037), bfm, i)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string.connections_activity);
            C1822Arm c1822ArmA0X = C06G.A0X(bfm);
            long jA0C = C06G.A0C(bfm);
            BRg bRgA0C = C3U4.A0C(BRg.A00, 16.0f, 16.0f, 16.0f, 4.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ComposableSingletons$ConnectionsTabScreenKt$lambda$994995760$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, ARD.A01(bRgA0C, (G0U) objAaT, false), jA0C, c1822ArmA0X, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            return;
        }
        bfm.Afo();
    }
}
