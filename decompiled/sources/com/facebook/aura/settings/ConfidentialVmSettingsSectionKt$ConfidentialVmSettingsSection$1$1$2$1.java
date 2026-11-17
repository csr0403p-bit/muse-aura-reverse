package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
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
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.permissions.defaults.ConfidentialVmToggle;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConfidentialVmSettingsSectionKt$ConfidentialVmSettingsSection$1$1$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ ConfidentialVmToggle $toggle;
    public final /* synthetic */ ConfidentialVmSettingsViewModel $viewModel;

    /* renamed from: com.facebook.aura.settings.ConfidentialVmSettingsSectionKt$ConfidentialVmSettingsSection$1$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ConfidentialVmToggle $toggle;
        public final /* synthetic */ ConfidentialVmSettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfidentialVmToggle confidentialVmToggle, ConfidentialVmSettingsViewModel confidentialVmSettingsViewModel) {
            super(3);
            this.$toggle = confidentialVmToggle;
            this.$viewModel = confidentialVmSettingsViewModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.Toggle toggle = AuraCardType.Toggle.INSTANCE;
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass005.A0X(this.$toggle.title), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
                ConfidentialVmToggle confidentialVmToggle = this.$toggle;
                boolean z = confidentialVmToggle.isAllowed;
                boolean z2 = !confidentialVmToggle.isUpdating;
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$toggle, bfm.A67(this.$viewModel));
                ConfidentialVmSettingsViewModel confidentialVmSettingsViewModel = this.$viewModel;
                ConfidentialVmToggle confidentialVmToggle2 = this.$toggle;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new ConfidentialVmSettingsSectionKt$ConfidentialVmSettingsSection$1$1$2$1$1$1$1(confidentialVmSettingsViewModel, confidentialVmToggle2);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, toggle, null, null, null, boolValueOf, (G0U) objAaT, null, z2, false, null, null, 0L, false, null, null, bfm, 3078, 0, 260720);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$toggle, this.$viewModel), -1112388326);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSettingsSectionKt$ConfidentialVmSettingsSection$1$1$2$1(ConfidentialVmToggle confidentialVmToggle, ConfidentialVmSettingsViewModel confidentialVmSettingsViewModel) {
        super(1);
        this.$toggle = confidentialVmToggle;
        this.$viewModel = confidentialVmSettingsViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
