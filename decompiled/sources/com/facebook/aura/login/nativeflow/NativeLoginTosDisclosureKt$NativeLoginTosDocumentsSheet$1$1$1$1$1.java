package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
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
import android.content.Context;
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
public final class NativeLoginTosDisclosureKt$NativeLoginTosDocumentsSheet$1$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchTosDocument $document;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginTosDisclosureKt$NativeLoginTosDocumentsSheet$1$1$1$1$1(HatchTosDocument hatchTosDocument, Context context) {
        super(3);
        this.$document = hatchTosDocument;
        this.$context = context;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        C7384Etj.A0Y(c07c, 0);
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AuraCardType.ExternalNavigation externalNavigation = AuraCardType.ExternalNavigation.INSTANCE;
            C1062ATq c1062ATq = C10G.A02;
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass005.A0X(this.$document.label), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$context, bfm.A67(this.$document));
            HatchTosDocument hatchTosDocument = this.$document;
            Context context = this.$context;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new NativeLoginTosDisclosureKt$NativeLoginTosDocumentsSheet$1$1$1$1$1$1$1(hatchTosDocument, context);
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, externalNavigation, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 262064);
            return;
        }
        bfm.Afo();
    }
}
