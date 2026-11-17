package com.facebook.aura.email.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$EmailScreenKt$lambda$1571743374$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailScreenKt$lambda$1571743374$1 INSTANCE = new ComposableSingletons$EmailScreenKt$lambda$1571743374$1();

    public ComposableSingletons$EmailScreenKt$lambda$1571743374$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
            BRg bRgA00 = C10G.A00(C2VU.A00, C3U4.A09(C10G.A02, 16.0f), false);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$EmailScreenKt$lambda$1571743374$1$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0v(bfm, bRgA00, (G0U) objAaT);
            return;
        }
        bfm.Afo();
    }
}
