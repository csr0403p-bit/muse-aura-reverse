package com.facebook.aura.settings;

import X.AbstractC2271BQs;
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
import X.C0881AGi;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import android.content.Context;
import android.view.View;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchSectionScope;
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
public final class AuraAppInfoScreenKt$AuraAppInfoScreen$1$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $deviceId;
    public final /* synthetic */ View $view;

    /* renamed from: com.facebook.aura.settings.AuraAppInfoScreenKt$AuraAppInfoScreen$1$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $deviceId;
        public final /* synthetic */ View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Context context, View view) {
            super(3);
            this.$deviceId = str;
            this.$context = context;
            this.$view = view;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.Clickable clickable = AuraCardType.Clickable.INSTANCE;
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1203a5);
                C0881AGi c0881AGi = C0881AGi.A00;
                AuraCardContent auraCardContent = new AuraCardContent(new ApQ(strA01, c0881AGi), auraIconAndHeadlineStyle, (BO6) null, (B6A) null, new ApQ(this.$deviceId, c0881AGi), (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097132, (C06H) null);
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$view, bfm.A67(this.$context));
                Context context = this.$context;
                String str = this.$deviceId;
                View view = this.$view;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new AuraAppInfoScreenKt$AuraAppInfoScreen$1$1$1$1$1$1$1(context, str, view);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, clickable, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 262064);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        hatchSectionScope.item(ComposableSingletons$AuraAppInfoScreenKt.lambda$423253345);
        hatchSectionScope.item(ComposableSingletons$AuraAppInfoScreenKt.lambda$40968472);
        hatchSectionScope.item(ComposableSingletons$AuraAppInfoScreenKt.f229lambda$1998495015);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$deviceId, this.$context, this.$view), 257008794);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraAppInfoScreenKt$AuraAppInfoScreen$1$1$1$1(String str, Context context, View view) {
        super(1);
        this.$deviceId = str;
        this.$context = context;
        this.$view = view;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
