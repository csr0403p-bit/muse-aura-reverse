package com.facebook.aura.settings;

import X.AbstractC07539Wl;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C06H;
import X.C07C;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
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
public final class HatchSettingsScreenKt$GraduationSection$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$GraduationSection$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraNavigator auraNavigator) {
            super(3);
            this.$navigator = auraNavigator;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
                BRg bRgA00 = AbstractC07539Wl.A00(C10G.A02, "hatch-settings-graduation-button");
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120f60), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
                G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchSettingsScreenKt.lambda$1576601477;
                boolean zA67 = bfm.A67(this.$navigator);
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchSettingsScreenKt$GraduationSection$2$1$1$1$1(auraNavigator);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(bRgA00, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, g0v, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 27654, 0, 262048);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$navigator), -1222917975);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsScreenKt$GraduationSection$2$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
