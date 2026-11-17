package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BO6;
import X.C06H;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
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
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$CancelEncryptionScreenKt$lambda$126311909$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public static final ComposableSingletons$CancelEncryptionScreenKt$lambda$126311909$1 INSTANCE = new ComposableSingletons$CancelEncryptionScreenKt$lambda$126311909$1();

    public ComposableSingletons$CancelEncryptionScreenKt$lambda$126311909$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(C07C c07c, BFM bfm, int i) {
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        C7384Etj.A0Y(c07c, 0);
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
            C1062ATq c1062ATq = C10G.A02;
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            ApQ apQA0Y = AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120ed8);
            long j = 0;
            Object[] objArr5 = objArr4 == true ? 1 : 0;
            Object[] objArr6 = objArr3 == true ? 1 : 0;
            Object[] objArr7 = objArr2 == true ? 1 : 0;
            Object[] objArr8 = objArr == true ? 1 : 0;
            AuraCardContent auraCardContent = new AuraCardContent(apQA0Y, auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i2, (int) objArr5, (int) objArr6, (String) (0 == true ? 1 : 0), (boolean) objArr7, (boolean) objArr8, (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097148, (C06H) (0 == true ? 1 : 0));
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ComposableSingletons$CancelEncryptionScreenKt$lambda$126311909$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 1575942, 0, 262064);
            return;
        }
        bfm.Afo();
    }
}
