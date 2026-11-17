package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
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
import X.C1BO;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
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
public final class HatchSettingsScreenKt$SupportAndLegalSection$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ boolean $appUpdatesSettingsItemEnabled;
    public final /* synthetic */ HatchSettingsConfig $config;
    public final /* synthetic */ C1BO<Boolean> $isManagedByAppManager$delegate;
    public final /* synthetic */ Function0<Unit> $onDataPrivacySettingsClick;
    public final /* synthetic */ Function0<Unit> $onHelpSupportSettingsClick;
    public final /* synthetic */ Function0<Unit> $onLegalSafetySettingsClick;
    public final /* synthetic */ Function0<Unit> $onSubmitReportClick;

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$SupportAndLegalSection$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onDataPrivacySettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(3);
            this.$onDataPrivacySettingsClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                HatchSettingsScreenKt.DataControlsCard(this.$onDataPrivacySettingsClick, bfm, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$SupportAndLegalSection$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onSubmitReportClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0) {
            super(3);
            this.$onSubmitReportClick = function0;
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
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120c21), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
                G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchSettingsScreenKt.lambda$1352525533;
                boolean zA65 = bfm.A65(this.$onSubmitReportClick);
                Function0<Unit> function0 = this.$onSubmitReportClick;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchSettingsScreenKt$SupportAndLegalSection$2$1$2$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, g0v, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 27654, 0, 262048);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$SupportAndLegalSection$2$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onHelpSupportSettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0) {
            super(3);
            this.$onHelpSupportSettingsClick = function0;
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
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120701), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
                G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchSettingsScreenKt.f251lambda$1603417914;
                boolean zA65 = bfm.A65(this.$onHelpSupportSettingsClick);
                Function0<Unit> function0 = this.$onHelpSupportSettingsClick;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchSettingsScreenKt$SupportAndLegalSection$2$1$3$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, g0v, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 27654, 0, 262048);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$SupportAndLegalSection$2$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onLegalSafetySettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Function0<Unit> function0) {
            super(3);
            this.$onLegalSafetySettingsClick = function0;
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
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120f13), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
                G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchSettingsScreenKt.lambda$1723588453;
                boolean zA65 = bfm.A65(this.$onLegalSafetySettingsClick);
                Function0<Unit> function0 = this.$onLegalSafetySettingsClick;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchSettingsScreenKt$SupportAndLegalSection$2$1$4$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, g0v, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 27654, 0, 262048);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        if (this.$config.showDataControls) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$onDataPrivacySettingsClick), 19491654);
        }
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$onSubmitReportClick), 1661402881);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass3(this.$onHelpSupportSettingsClick), -1125029910);
        if (AnonymousClass002.A1b(this.$isManagedByAppManager$delegate.getValue(), true) && this.$appUpdatesSettingsItemEnabled) {
            hatchSectionScope.item(ComposableSingletons$HatchSettingsScreenKt.lambda$1546245871);
        }
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass4(this.$onLegalSafetySettingsClick), -2092990839);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsScreenKt$SupportAndLegalSection$2$1(HatchSettingsConfig hatchSettingsConfig, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, C1BO<Boolean> c1bo, Function0<Unit> function04) {
        super(1);
        this.$config = hatchSettingsConfig;
        this.$appUpdatesSettingsItemEnabled = z;
        this.$onDataPrivacySettingsClick = function0;
        this.$onSubmitReportClick = function02;
        this.$onHelpSupportSettingsClick = function03;
        this.$isManagedByAppManager$delegate = c1bo;
        this.$onLegalSafetySettingsClick = function04;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
