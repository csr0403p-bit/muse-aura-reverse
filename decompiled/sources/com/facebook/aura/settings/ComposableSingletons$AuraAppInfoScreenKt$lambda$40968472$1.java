package com.facebook.aura.settings;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BO6;
import X.C06H;
import X.C07C;
import X.C0881AGi;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$AuraAppInfoScreenKt$lambda$40968472$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public static final ComposableSingletons$AuraAppInfoScreenKt$lambda$40968472$1 INSTANCE = new ComposableSingletons$AuraAppInfoScreenKt$lambda$40968472$1();

    public ComposableSingletons$AuraAppInfoScreenKt$lambda$40968472$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        C7384Etj.A0Y(c07c, 0);
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AuraCardType.None none = AuraCardType.None.INSTANCE;
            C1062ATq c1062ATq = C10G.A02;
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201ba);
            C0881AGi c0881AGi = C0881AGi.A00;
            AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, new AuraCardContent(new ApQ(strA01, c0881AGi), auraIconAndHeadlineStyle, (BO6) null, (B6A) null, new ApQ("16.0.0.11.159", c0881AGi), (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097132, (C06H) null), none, null, null, null, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 262128);
            return;
        }
        bfm.Afo();
    }
}
