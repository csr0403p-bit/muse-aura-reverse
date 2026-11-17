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
import X.C1BO;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.settings.HatchDataPrivacySettingsViewModel;
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
public final class HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$4$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ boolean $isResetting;
    public final /* synthetic */ MutableState<Boolean> $showResetDialog$delegate;
    public final /* synthetic */ C1BO<HatchDataPrivacySettingsViewModel.DataPrivacyUiState> $uiState$delegate;

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isResetting;
        public final /* synthetic */ MutableState<Boolean> $showResetDialog$delegate;
        public final /* synthetic */ C1BO<HatchDataPrivacySettingsViewModel.DataPrivacyUiState> $uiState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, C1BO<HatchDataPrivacySettingsViewModel.DataPrivacyUiState> c1bo, MutableState<Boolean> mutableState) {
            super(3);
            this.$isResetting = z;
            this.$uiState$delegate = c1bo;
            this.$showResetDialog$delegate = mutableState;
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
                AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass005.A0X(AnonymousClass001.A0t(bfm, this.$uiState$delegate.getValue().botName, R.string._name_removed__res_0x7f1208c9)), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
                boolean z = !this.$isResetting;
                MutableState<Boolean> mutableState = this.$showResetDialog$delegate;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$4$1$1$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, clickable, null, null, (Function0) objAaT, null, null, null, z, false, null, null, 0L, true, null, null, bfm, 1575942, 196608, 228272);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$isResetting, this.$uiState$delegate, this.$showResetDialog$delegate), -1865450204);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$4$1(boolean z, C1BO<HatchDataPrivacySettingsViewModel.DataPrivacyUiState> c1bo, MutableState<Boolean> mutableState) {
        super(1);
        this.$isResetting = z;
        this.$uiState$delegate = c1bo;
        this.$showResetDialog$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
