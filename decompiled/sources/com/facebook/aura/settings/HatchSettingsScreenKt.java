package com.facebook.aura.settings;

import X.AIW;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOD;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06H;
import X.C07C;
import X.C0924AIa;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BN;
import X.C1BO;
import X.C1DG;
import X.C1YL;
import X.C2CK;
import X.C31u;
import X.C3O5;
import X.C3UX;
import X.C5wL;
import X.C7462Ewq;
import X.C78N;
import X.C7BY;
import X.C7bA;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HtJ;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7359EnW;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.ui.settings.HatchSettingsDescriptionKt;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModelKt;
import com.facebook.aura.graduation.repo.HatchGraduationRepository;
import com.facebook.aura.graduation.repo.HatchGraduationState;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.navigation.key.HatchSettingsSubdestination;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.pause.HatchPauseViewModel;
import com.facebook.aura.preloads.HatchAppManagerRepository;
import com.facebook.aura.settings.MC;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.viewmodel.HatchConnectorPrefetchViewModel;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.utils.MetaAccountEntrypoint;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceResource;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.header.AuraSectionHeaderKt;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchSettingsScreenKt {
    public static final String TAG = "HatchSettingsScreen";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(HatchSettingsScreenKt.class, "appUpdatesSettingsItemEnabled", "getAppUpdatesSettingsItemEnabled()Z", 1)};
    public static final C31u appUpdatesSettingsItemEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_app_preloads.enable_hatch_app_manager_app_updates_settings_item);

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$AccountsCenterSection$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $onValidateSessionAfterAccountCenter;
        public final /* synthetic */ C07C $this_AccountsCenterSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(C07C c07c, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, int i) {
            super(2);
            this.$this_AccountsCenterSection = c07c;
            this.$onValidateSessionAfterAccountCenter = g0u;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.AccountsCenterSection(this.$this_AccountsCenterSection, this.$onValidateSessionAfterAccountCenter, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$AppUpdatesCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.AppUpdatesCard(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$ConfidentialityAwareSettingsSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C135752 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<HatchSectionScope, Boolean, Unit> $content;
        public final /* synthetic */ C07C $this_ConfidentialityAwareSettingsSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135752(C07C c07c, G0V<? super HatchSectionScope, ? super Boolean, Unit> g0v, int i) {
            super(2);
            this.$this_ConfidentialityAwareSettingsSection = c07c;
            this.$content = g0v;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.ConfidentialityAwareSettingsSection(this.$this_ConfidentialityAwareSettingsSection, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$ConnectorCatalogPrefetcher$2, reason: invalid class name and case insensitive filesystem */
    public final class C135762 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135762(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.ConnectorCatalogPrefetcher(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$DataControlsCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C135772 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onDataPrivacySettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135772(Function0<Unit> function0, int i) {
            super(2);
            this.$onDataPrivacySettingsClick = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.DataControlsCard(this.$onDataPrivacySettingsClick, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$DefaultAssistantSettingsCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Boolean> $isDefaultAssistant;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Boolean> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$isDefaultAssistant = function0;
            this.$onClick = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.DefaultAssistantSettingsCard(this.$isDefaultAssistant, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$EncryptionCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C135782 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onEncryptionSettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135782(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onEncryptionSettingsClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.EncryptionCard(this.$onEncryptionSettingsClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$GraduationSection$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C07C $this_GraduationSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C07C c07c, int i) {
            super(2);
            this.$this_GraduationSection = c07c;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.GraduationSection(this.$this_GraduationSection, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$GraduationSection$3, reason: invalid class name and case insensitive filesystem */
    public final class C135793 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C07C $this_GraduationSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135793(C07C c07c, int i) {
            super(2);
            this.$this_GraduationSection = c07c;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.GraduationSection(this.$this_GraduationSection, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchPauseSettingsSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C135802 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isPaused;
        public final /* synthetic */ Function0<Unit> $onPauseClick;
        public final /* synthetic */ Function0<Unit> $onUnpauseClick;
        public final /* synthetic */ C07C $this_HatchPauseSettingsSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135802(C07C c07c, boolean z, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$this_HatchPauseSettingsSection = c07c;
            this.$isPaused = z;
            this.$onPauseClick = function0;
            this.$onUnpauseClick = function02;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.HatchPauseSettingsSection(this.$this_HatchPauseSettingsSection, this.$isPaused, this.$onPauseClick, this.$onUnpauseClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsDeepLinkSubdestinationEffect$1, reason: invalid class name and case insensitive filesystem */
    public final class C135811 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0U<HatchSettingsSubdestination, Function0<Unit>> $resolveAction;
        public final /* synthetic */ HatchSettingsSubdestination $subdestination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135811(HatchSettingsSubdestination hatchSettingsSubdestination, G0U<? super HatchSettingsSubdestination, ? extends Function0<Unit>> g0u, int i) {
            super(2);
            this.$subdestination = hatchSettingsSubdestination;
            this.$resolveAction = g0u;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.HatchSettingsDeepLinkSubdestinationEffect(this.$subdestination, this.$resolveAction, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsDeepLinkSubdestinationEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C135822 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0U<HatchSettingsSubdestination, Function0<Unit>> $resolveAction;
        public final /* synthetic */ HatchSettingsSubdestination $subdestination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135822(HatchSettingsSubdestination hatchSettingsSubdestination, G0U<? super HatchSettingsSubdestination, ? extends Function0<Unit>> g0u, int i) {
            super(2);
            this.$subdestination = hatchSettingsSubdestination;
            this.$resolveAction = g0u;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.HatchSettingsDeepLinkSubdestinationEffect(this.$subdestination, this.$resolveAction, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsDeepLinkSubdestinationEffect$4, reason: invalid class name and case insensitive filesystem */
    public final class C135834 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0U<HatchSettingsSubdestination, Function0<Unit>> $resolveAction;
        public final /* synthetic */ HatchSettingsSubdestination $subdestination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135834(HatchSettingsSubdestination hatchSettingsSubdestination, G0U<? super HatchSettingsSubdestination, ? extends Function0<Unit>> g0u, int i) {
            super(2);
            this.$subdestination = hatchSettingsSubdestination;
            this.$resolveAction = g0u;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.HatchSettingsDeepLinkSubdestinationEffect(this.$subdestination, this.$resolveAction, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsScreen$24, reason: invalid class name */
    public final class AnonymousClass24 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ HatchSettingsConfig $config;
        public final /* synthetic */ boolean $hideUnsupportedCvmFeatures;
        public final /* synthetic */ Function0<Boolean> $isDefaultAssistant;
        public final /* synthetic */ boolean $isHatchLockEnabled;
        public final /* synthetic */ boolean $isPaused;
        public final /* synthetic */ boolean $isRedeemInviteEnabled;
        public final /* synthetic */ G0U<AuraSubscriptionPage, Unit> $navigateToSubscriptionSurface;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ Function0<Unit> $onAddToHomeScreenClick;
        public final /* synthetic */ Function0<Unit> $onAppAppearanceSettingsClick;
        public final /* synthetic */ Function0<Unit> $onBiometricsSettingsClick;
        public final /* synthetic */ Function0<Unit> $onChannelsSettingsClick;
        public final /* synthetic */ Function0<Unit> $onConnectedAppsSettingsClick;
        public final /* synthetic */ Function0<Unit> $onConnectedDevicesSettingsClick;
        public final /* synthetic */ Function0<Unit> $onDataPrivacySettingsClick;
        public final /* synthetic */ Function0<Unit> $onEncryptionSettingsClick;
        public final /* synthetic */ Function0<Unit> $onHelpSupportSettingsClick;
        public final /* synthetic */ Function0<Unit> $onInternalSettingsClick;
        public final /* synthetic */ Function0<Unit> $onLegalSafetySettingsClick;
        public final /* synthetic */ Function0<Unit> $onLogOutClick;
        public final /* synthetic */ Function0<Unit> $onNotificationsSettingsClick;
        public final /* synthetic */ Function0<Unit> $onPermissionsSettingsClick;
        public final /* synthetic */ Function0<Unit> $onRedeemInviteCodeClick;
        public final /* synthetic */ Function0<Unit> $onSetDefaultAssistantClick;
        public final /* synthetic */ Function0<Unit> $onSubmitReportClick;
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $onValidateSessionAfterAccountCenter;
        public final /* synthetic */ Function0<Unit> $onWalletSettingsClick;
        public final /* synthetic */ HatchPauseViewModel $pauseViewModel;
        public final /* synthetic */ boolean $showBiometricsRow;
        public final /* synthetic */ MutableState<Boolean> $showLogoutDialog$delegate;
        public final /* synthetic */ MutableState<Boolean> $showPauseHatchBottomSheet$delegate;
        public final /* synthetic */ MutableState<Boolean> $showUnpauseHatchBottomSheet$delegate;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass24(HatchSettingsConfig hatchSettingsConfig, AbstractC3358CGz abstractC3358CGz, G0U<? super AuraSubscriptionPage, Unit> g0u, AuraNavigator auraNavigator, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, boolean z2, Function0<Unit> function07, Function0<Unit> function08, Function0<Unit> function09, Function0<Unit> function010, Function0<Boolean> function011, Function0<Unit> function012, boolean z3, Function0<Unit> function013, Function0<Unit> function014, Function0<Unit> function015, Function0<Unit> function016, Function0<Unit> function017, G0U<? super HtJ<? super Unit>, ? extends Object> g0u2, boolean z4, boolean z5, Function0<Unit> function018, Function0<Unit> function019, HatchPauseViewModel hatchPauseViewModel, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
            super(4);
            this.$config = hatchSettingsConfig;
            this.$userSession = abstractC3358CGz;
            this.$navigateToSubscriptionSurface = g0u;
            this.$navigator = auraNavigator;
            this.$hideUnsupportedCvmFeatures = z;
            this.$onConnectedAppsSettingsClick = function0;
            this.$onWalletSettingsClick = function02;
            this.$onPermissionsSettingsClick = function03;
            this.$onChannelsSettingsClick = function04;
            this.$onConnectedDevicesSettingsClick = function05;
            this.$onEncryptionSettingsClick = function06;
            this.$showBiometricsRow = z2;
            this.$onAddToHomeScreenClick = function07;
            this.$onNotificationsSettingsClick = function08;
            this.$onAppAppearanceSettingsClick = function09;
            this.$onBiometricsSettingsClick = function010;
            this.$isDefaultAssistant = function011;
            this.$onSetDefaultAssistantClick = function012;
            this.$isRedeemInviteEnabled = z3;
            this.$onRedeemInviteCodeClick = function013;
            this.$onSubmitReportClick = function014;
            this.$onHelpSupportSettingsClick = function015;
            this.$onDataPrivacySettingsClick = function016;
            this.$onLegalSafetySettingsClick = function017;
            this.$onValidateSessionAfterAccountCenter = g0u2;
            this.$isHatchLockEnabled = z4;
            this.$isPaused = z5;
            this.$onInternalSettingsClick = function018;
            this.$onLogOutClick = function019;
            this.$pauseViewModel = hatchPauseViewModel;
            this.$showPauseHatchBottomSheet$delegate = mutableState;
            this.$showUnpauseHatchBottomSheet$delegate = mutableState2;
            this.$showLogoutDialog$delegate = mutableState3;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1964invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x0213  */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1964invokei1RSzL4(float r52, float r53, X.BFM r54, int r55) {
            /*
                Method dump skipped, instructions count: 1349
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchSettingsScreenKt.AnonymousClass24.m1964invokei1RSzL4(float, float, X.BFM, int):void");
        }

        public static final /* synthetic */ AuraSubscriptionUsageViewModel.UiState access$invoke_i1RSzL4$lambda$0$0(C1BO c1bo) {
            return (AuraSubscriptionUsageViewModel.UiState) c1bo.getValue();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsScreen$25, reason: invalid class name */
    public final class AnonymousClass25 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchSettingsConfig $config;
        public final /* synthetic */ HatchSettingsSubdestination $initialSubdestination;
        public final /* synthetic */ Function0<Boolean> $isDefaultAssistant;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAddToHomeScreenClick;
        public final /* synthetic */ Function0<Unit> $onAppAppearanceSettingsClick;
        public final /* synthetic */ Function0<Unit> $onBiometricsSettingsClick;
        public final /* synthetic */ Function0<Unit> $onChannelsSettingsClick;
        public final /* synthetic */ Function0<Unit> $onConnectedAppsSettingsClick;
        public final /* synthetic */ Function0<Unit> $onConnectedDevicesSettingsClick;
        public final /* synthetic */ Function0<Unit> $onDataPrivacySettingsClick;
        public final /* synthetic */ Function0<Unit> $onEncryptionSettingsClick;
        public final /* synthetic */ Function0<Unit> $onHelpSupportSettingsClick;
        public final /* synthetic */ Function0<Unit> $onInternalSettingsClick;
        public final /* synthetic */ Function0<Unit> $onLegalSafetySettingsClick;
        public final /* synthetic */ Function0<Unit> $onLogOutClick;
        public final /* synthetic */ Function0<Unit> $onNotificationsSettingsClick;
        public final /* synthetic */ Function0<Unit> $onPermissionsSettingsClick;
        public final /* synthetic */ Function0<Unit> $onRedeemInviteCodeClick;
        public final /* synthetic */ Function0<Unit> $onSetDefaultAssistantClick;
        public final /* synthetic */ Function0<Unit> $onSubmitReportClick;
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $onValidateSessionAfterAccountCenter;
        public final /* synthetic */ Function0<Unit> $onVoiceControlsSettingsClick;
        public final /* synthetic */ Function0<Unit> $onWalletSettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass25(BRg bRg, HatchSettingsConfig hatchSettingsConfig, HatchSettingsSubdestination hatchSettingsSubdestination, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08, Function0<Unit> function09, Function0<Unit> function010, Function0<Unit> function011, Function0<Unit> function012, Function0<Unit> function013, Function0<Unit> function014, Function0<Unit> function015, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, Function0<Unit> function016, Function0<Unit> function017, Function0<Unit> function018, Function0<Boolean> function019, Function0<Unit> function020, int i, int i2, int i3, int i4) {
            super(2);
            this.$modifier = bRg;
            this.$config = hatchSettingsConfig;
            this.$initialSubdestination = hatchSettingsSubdestination;
            this.$onInternalSettingsClick = function0;
            this.$onChannelsSettingsClick = function02;
            this.$onConnectedAppsSettingsClick = function03;
            this.$onWalletSettingsClick = function04;
            this.$onPermissionsSettingsClick = function05;
            this.$onLogOutClick = function06;
            this.$onAppAppearanceSettingsClick = function07;
            this.$onVoiceControlsSettingsClick = function08;
            this.$onBiometricsSettingsClick = function09;
            this.$onRedeemInviteCodeClick = function010;
            this.$onSubmitReportClick = function011;
            this.$onHelpSupportSettingsClick = function012;
            this.$onDataPrivacySettingsClick = function013;
            this.$onEncryptionSettingsClick = function014;
            this.$onLegalSafetySettingsClick = function015;
            this.$onValidateSessionAfterAccountCenter = g0u;
            this.$onNotificationsSettingsClick = function016;
            this.$onConnectedDevicesSettingsClick = function017;
            this.$onSetDefaultAssistantClick = function018;
            this.$isDefaultAssistant = function019;
            this.$onAddToHomeScreenClick = function020;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$changed2 = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.HatchSettingsScreen(this.$modifier, this.$config, this.$initialSubdestination, this.$onInternalSettingsClick, this.$onChannelsSettingsClick, this.$onConnectedAppsSettingsClick, this.$onWalletSettingsClick, this.$onPermissionsSettingsClick, this.$onLogOutClick, this.$onAppAppearanceSettingsClick, this.$onVoiceControlsSettingsClick, this.$onBiometricsSettingsClick, this.$onRedeemInviteCodeClick, this.$onSubmitReportClick, this.$onHelpSupportSettingsClick, this.$onDataPrivacySettingsClick, this.$onEncryptionSettingsClick, this.$onLegalSafetySettingsClick, this.$onValidateSessionAfterAccountCenter, this.$onNotificationsSettingsClick, this.$onConnectedDevicesSettingsClick, this.$onSetDefaultAssistantClick, this.$isDefaultAssistant, this.$onAddToHomeScreenClick, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$InternalSettingsSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C135842 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onInternalSettingsClick;
        public final /* synthetic */ C07C $this_InternalSettingsSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135842(C07C c07c, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$this_InternalSettingsSection = c07c;
            this.$onInternalSettingsClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.InternalSettingsSection(this.$this_InternalSettingsSection, this.$onInternalSettingsClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$LogOutConfirmationDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C135851 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ String $confirmText;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135851(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$confirmText = str;
            this.$onConfirm = function0;
            this.$cancelText = str2;
            this.$onDismiss = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onConfirm, bfm.A65(this.$confirmText))));
                String str = this.$confirmText;
                Function0<Unit> function0 = this.$onConfirm;
                String str2 = this.$cancelText;
                Function0<Unit> function02 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchSettingsScreenKt$LogOutConfirmationDialog$1$1$1(str, function0, str2, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$LogOutConfirmationDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C135862 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135862(Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$onDismiss = function0;
            this.$onConfirm = function02;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.LogOutConfirmationDialog(this.$onDismiss, this.$onConfirm, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$LogOutSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C135872 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onLogOutClick;
        public final /* synthetic */ C07C $this_LogOutSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135872(C07C c07c, Function0<Unit> function0, int i) {
            super(2);
            this.$this_LogOutSection = c07c;
            this.$onLogOutClick = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.LogOutSection(this.$this_LogOutSection, this.$onLogOutClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$RedeemInviteCodeSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C135882 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ C07C $this_RedeemInviteCodeSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135882(C07C c07c, Function0<Unit> function0, int i) {
            super(2);
            this.$this_RedeemInviteCodeSection = c07c;
            this.$onClick = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.RedeemInviteCodeSection(this.$this_RedeemInviteCodeSection, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$SupportAndLegalSection$3, reason: invalid class name and case insensitive filesystem */
    public final class C135893 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $appUpdatesSettingsItemEnabled;
        public final /* synthetic */ HatchSettingsConfig $config;
        public final /* synthetic */ Function0<Unit> $onDataPrivacySettingsClick;
        public final /* synthetic */ Function0<Unit> $onEncryptionSettingsClick;
        public final /* synthetic */ Function0<Unit> $onHelpSupportSettingsClick;
        public final /* synthetic */ Function0<Unit> $onLegalSafetySettingsClick;
        public final /* synthetic */ Function0<Unit> $onSubmitReportClick;
        public final /* synthetic */ C07C $this_SupportAndLegalSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135893(C07C c07c, boolean z, HatchSettingsConfig hatchSettingsConfig, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, int i) {
            super(2);
            this.$this_SupportAndLegalSection = c07c;
            this.$appUpdatesSettingsItemEnabled = z;
            this.$config = hatchSettingsConfig;
            this.$onSubmitReportClick = function0;
            this.$onHelpSupportSettingsClick = function02;
            this.$onDataPrivacySettingsClick = function03;
            this.$onEncryptionSettingsClick = function04;
            this.$onLegalSafetySettingsClick = function05;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsScreenKt.SupportAndLegalSection(this.$this_SupportAndLegalSection, this.$appUpdatesSettingsItemEnabled, this.$config, this.$onSubmitReportClick, this.$onHelpSupportSettingsClick, this.$onDataPrivacySettingsClick, this.$onEncryptionSettingsClick, this.$onLegalSafetySettingsClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void AccountsCenterSection(C07C c07c, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, BFM bfm, int i) {
        int i2;
        boolean zA1b = AnonymousClass004.A1b(c07c, g0u);
        bfm.AgG(1453935064);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(g0u, bfm, i) ? 1 : 0);
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            Context contextA0O = AnonymousClass003.A0O(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
            AuraDrawableSourceResource auraDrawableSourceResource = null;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, bfm.AaT(), obj, zA1b);
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(c3ux);
            if ((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) != 32 && ((iA0d & 64) == 0 || !bfm.A67(g0u))) {
                z = false;
            }
            boolean z2 = zA67 | z;
            Object objAaT2 = bfm.AaT();
            if (z2 || objAaT2 == obj) {
                objAaT2 = new HatchSettingsScreenKt$AccountsCenterSection$1$1(c3ux, mutableState, g0u);
                bfm.Ai0(objAaT2);
            }
            C7bA.A05(bfm, null, unit, (G0U) objAaT2, 6, 2);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ec6);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ec5);
            MetaAccountEntrypoint metaAccountEntrypoint = MetaAccountEntrypoint.INSTANCE;
            if (metaAccountEntrypoint.getCanSeeNewEntrypoint()) {
                AnonymousClass003.A0l(bfm, -564947851);
                String title = metaAccountEntrypoint.getTitle();
                if (!C7BY.A0j(title)) {
                    strA01 = title;
                }
                i2 = R.drawable.ic_meta_infinity;
            } else {
                bfm.AgE(-564788356);
                i2 = R.drawable.circle_user_wght400_outline_24;
                boolean zA00 = C3O5.A00(bfm);
                int i3 = R.drawable.ic_meta_logo_with_color;
                if (zA00) {
                    i3 = R.drawable.ic_meta_logo_with_color_white;
                }
                auraDrawableSourceResource = new AuraDrawableSourceResource(i3);
                AnonymousClass001.A1D(bfm);
            }
            C01N.A06(bfm, BRg.A00);
            AuraSectionHeaderKt.AuraSectionHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ec4), auraDrawableSourceResource, null, bfm, zA1b ? 1 : 0, 4);
            boolean zA1V = AnonymousClass002.A1V(bfm, contextA0O, AnonymousClass003.A1K(bfm, strA01, strA012), bfm.A63(i2));
            Object objAaT3 = bfm.AaT();
            if (zA1V || objAaT3 == obj) {
                objAaT3 = new HatchSettingsScreenKt$AccountsCenterSection$3$1(strA01, strA012, contextA0O, i2, mutableState);
                bfm.Ai0(objAaT3);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, zA1b, null, 0L, (G0U) objAaT3, bfm, iA0d & 14, 7);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(c07c, g0u, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void DefaultAssistantSettingsCard(Function0<Boolean> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-842007863);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            BO6 bo6 = null;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            Object[] objArr13 = 0;
            Object[] objArr14 = 0;
            Object[] objArr15 = 0;
            Object[] objArr16 = 0;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, function0.invoke());
            }
            MutableState mutableState = (MutableState) objAaT;
            Unit unit = Unit.INSTANCE;
            boolean zA1B = AnonymousClass003.A1B(iA0T);
            Object objAaT2 = bfm.AaT();
            if (zA1B || objAaT2 == obj) {
                objAaT2 = new HatchSettingsScreenKt$DefaultAssistantSettingsCard$1$1(function0, mutableState);
                bfm.Ai0(objAaT2);
            }
            C7bA.A05(bfm, null, unit, (G0U) objAaT2, 6, 2);
            AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            boolean zA0A = MutableState.A0A(mutableState);
            int i5 = R.string._name_removed__res_0x7f120eeb;
            if (zA0A) {
                i5 = R.string._name_removed__res_0x7f120ee8;
            }
            long j = 0;
            AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, i5), auraIconAndHeadlineStyle, bo6, (B6A) (objArr16 == true ? 1 : 0), (ApQ) (objArr15 == true ? 1 : 0), (G0U) (objArr14 == true ? 1 : 0), (AuraIconAndBodyStyle) (objArr13 == true ? 1 : 0), (B6A) (objArr12 == true ? 1 : 0), (String) (objArr11 == true ? 1 : 0), (C1822Arm) (objArr10 == true ? 1 : 0), i4, (int) (objArr4 == true ? 1 : 0), (int) (objArr3 == true ? 1 : 0), (String) (objArr9 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0), (ApQ) (objArr8 == true ? 1 : 0), (C1822Arm) (objArr7 == true ? 1 : 0), j, j, (C1YL) (objArr6 == true ? 1 : 0), 2097148, (C06H) (objArr5 == true ? 1 : 0));
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchSettingsScreenKt.lambda$1522621293;
            boolean zA1V = AnonymousClass006.A1V(iA0T);
            Object objAaT3 = bfm.AaT();
            if (zA1V || objAaT3 == obj) {
                objAaT3 = new HatchSettingsScreenKt$DefaultAssistantSettingsCard$2$1(function02);
                bfm.Ai0(objAaT3);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRg2, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, g0v, null, (Function0) objAaT3, null, null, null, false, false, null, null, 0L, false, null, null, bfm, ((iA0T >> 6) & 14) | 27648, 0, 262048);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(function0, function02, bRg2, i, i2);
        }
    }

    public static final void EncryptionCard(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1574277678);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = ConfidentialVmSwitchViewModelKt.confidentialVmSwitchViewModel(bfm, 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ef6);
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(AnonymousClass001.A0R(bRg2), HatchOrigin.SETTINGS, HatchSurface.SETTINGS, HatchSubsurface.TAB_SETTINGS, HatchScreen.SETTINGS_MAIN, HatchComponent.ENCRYPTION_BUTTON, null, null, null, 500L, 0.0f, null, null, null);
            Integer numValueOf = Integer.valueOf(R.drawable.shielduser_outline_24_wght400);
            boolean zA1M = AnonymousClass003.A1M(bfm, confidentialVmSwitchViewModel, auraNavigatorA0b) | AnonymousClass001.A1L(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new HatchSettingsScreenKt$EncryptionCard$1$1(confidentialVmSwitchViewModel, function0, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchSettingsCardsKt.HatchSettingsNavigationCard(strA01, numValueOf, (Function0) objAaT, bRgHatchImpression, null, bfm, 0, 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135782(function0, bRg2, i, i2);
        }
    }

    public static final Map<String, String> entrypointViewerData(AuraSubscriptionUsageViewModel.UiState uiState) {
        AuraSubscriptionUsageViewModel.UiState.Loaded loaded;
        String str;
        C0924AIa c0924AIa = new C0924AIa();
        if ((uiState instanceof AuraSubscriptionUsageViewModel.UiState.Loaded) && (loaded = (AuraSubscriptionUsageViewModel.UiState.Loaded) uiState) != null) {
            c0924AIa.put(HatchMetadataKey.IS_PAID_TIER.getValue(), String.valueOf(loaded.isPaidTier));
            if (loaded.isPaidTier && (str = loaded.tierCode) != null) {
                AnonymousClass001.A1C(HatchMetadataKey.CURRENT_TIER, str, c0924AIa);
            }
        }
        return AIW.A0K(c0924AIa);
    }

    public static final boolean getAppUpdatesSettingsItemEnabled() {
        return AnonymousClass001.A1X(C31u.A00(appUpdatesSettingsItemEnabled$delegate, $$delegatedProperties));
    }

    public static final void AppUpdatesCard(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 2048185985, i), bfm, i)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ece);
            C1062ATq c1062ATq = C10G.A02;
            Integer numValueOf = Integer.valueOf(R.drawable.arrowdownload_outline_24_wght400);
            boolean zA67 = bfm.A67(contextA0H);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchSettingsScreenKt$AppUpdatesCard$1$1(contextA0H);
                bfm.Ai0(objAaT);
            }
            HatchSettingsCardsKt.HatchSettingsNavigationCard(strA01, numValueOf, (Function0) objAaT, c1062ATq, null, bfm, 3072, 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i);
        }
    }

    public static final void ConfidentialityAwareSettingsSection(C07C c07c, G0V<? super HatchSectionScope, ? super Boolean, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(291059518);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            C1BO c1boA02 = C2CK.A02(bfm, ConfidentialVmSwitchViewModelKt.confidentialVmSwitchViewModel(bfm, 0).uiState);
            boolean zA65 = bfm.A65(c1boA02) | AnonymousClass001.A1N(iA0d);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchSettingsScreenKt$ConfidentialityAwareSettingsSection$1$1(g0v, c1boA02);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, null, 0L, (G0U) objAaT, bfm, iA0d & 14, 7);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135752(c07c, g0v, i);
        }
    }

    public static final void ConnectorCatalogPrefetcher(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, -291123350, i), bfm, i)) {
            HatchConnectorPrefetchViewModel.Factory factory = new HatchConnectorPrefetchViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchConnectorPrefetchViewModel hatchConnectorPrefetchViewModel = (HatchConnectorPrefetchViewModel) AnonymousClass004.A14(factory, bodA00, AnonymousClass005.A0Y(bodA00), HatchConnectorPrefetchViewModel.class);
            boolean zA67 = bfm.A67(hatchConnectorPrefetchViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchSettingsScreenKt$ConnectorCatalogPrefetcher$1$1(hatchConnectorPrefetchViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, hatchConnectorPrefetchViewModel);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135762(i);
        }
    }

    public static final void DataControlsCard(Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(683171502);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ee7);
            C1062ATq c1062ATq = C10G.A02;
            Integer numValueOf = Integer.valueOf(R.drawable.lock_wght400_outline_24);
            boolean zA1M = AnonymousClass001.A1M(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new HatchSettingsScreenKt$DataControlsCard$1$1(function0);
                bfm.Ai0(objAaT);
            }
            HatchSettingsCardsKt.HatchSettingsNavigationCard(strA01, numValueOf, (Function0) objAaT, c1062ATq, null, bfm, 3072, 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135772(function0, i);
        }
    }

    public static final void GraduationSection(C07C c07c, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c135793;
        bfm.AgG(523688655);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchGraduationRepository.Companion.getInstance(abstractC3358CGzA0h).state;
                bfm.Ai0(objAaT);
            }
            if (!((HatchGraduationState) C1BO.A07(bfm, (C1BN) objAaT)).isUserGraduationEnabled) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c135793 = new AnonymousClass1(c07c, i);
                    bBbAAc.A06 = c135793;
                }
                return;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            C01N.A02(bfm, AuraDimensionsKt.LocalAuraDimensions, BRg.A00);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchSettingsScreenKt$GraduationSection$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, null, 0L, (G0U) objAaT2, bfm, iA0d & 14, 7);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c135793 = new C135793(c07c, i);
            bBbAAc.A06 = c135793;
        }
    }

    public static final void HatchPauseSettingsSection(C07C c07c, boolean z, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        bfm.AgG(1502349094);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            BS0 bs0 = BRg.A00;
            C01N.A02(bfm, AuraDimensionsKt.LocalAuraDimensions, bs0);
            boolean zA1C = AnonymousClass003.A1C(iA0d) | AnonymousClass003.A1E(iA0d) | AnonymousClass003.A1D(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HatchSettingsScreenKt$HatchPauseSettingsSection$1$1(z, function02, function0);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, null, 0L, (G0U) objAaT, bfm, iA0d & 14, 7);
            C01N.A05(bfm, bs0);
            HatchSettingsDescriptionKt.HatchSettingsDescription(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120f33), null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135802(c07c, z, function0, function02, i);
        }
    }

    public static final void HatchSettingsDeepLinkSubdestinationEffect(HatchSettingsSubdestination hatchSettingsSubdestination, G0U<? super HatchSettingsSubdestination, ? extends Function0<Unit>> g0u, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c135834;
        bfm.AgG(-1880929328);
        int iA0D = (i & 6) == 0 ? AnonymousClass004.A0D(bfm, AnonymousClass003.A0K(hatchSettingsSubdestination)) | i : i;
        if ((i & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            if (hatchSettingsSubdestination == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    c135834 = new C135811(hatchSettingsSubdestination, g0u, i);
                }
            } else {
                Object[] objArr = new Object[0];
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = HatchSettingsScreenKt$HatchSettingsDeepLinkSubdestinationEffect$handled$2$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
                if (MutableState.A0A(mutableStateA0N)) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        c135834 = new C135822(hatchSettingsSubdestination, g0u, i);
                    }
                } else {
                    Function0<Unit> function0Invoke = g0u.invoke(hatchSettingsSubdestination);
                    Unit unit = Unit.INSTANCE;
                    boolean zA1K = AnonymousClass003.A1K(bfm, mutableStateA0N, function0Invoke);
                    Object objAaT2 = bfm.AaT();
                    if (zA1K || objAaT2 == obj) {
                        objAaT2 = new HatchSettingsScreenKt$HatchSettingsDeepLinkSubdestinationEffect$3$1(function0Invoke, mutableStateA0N);
                        bfm.Ai0(objAaT2);
                    }
                    AnonymousClass001.A17(bfm, objAaT2, unit);
                }
            }
            bBbAAc.A06 = c135834;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c135834 = new C135834(hatchSettingsSubdestination, g0u, i);
            bBbAAc.A06 = c135834;
        }
    }

    public static final void InternalSettingsSection(C07C c07c, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        boolean zA1a = AnonymousClass002.A1a(c07c, function0);
        bfm.AgG(-626596468);
        int iA0U = (i & 48) == 0 ? AnonymousClass004.A0U(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0U |= 384;
        } else if ((i & 384) == 0) {
            iA0U |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0U & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA0U)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0D);
            C90l c90l = C90l.A00;
            AnonymousClass007.A0j(bfm, R.string._name_removed__res_0x7f120f10);
            boolean zA1N = AnonymousClass001.A1N(iA0U);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = new HatchSettingsScreenKt$InternalSettingsSection$1$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0o(c90l, bfm, objAaT);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135842(c07c, function0, bRg, i, i2);
        }
    }

    public static final void LogOutConfirmationDialog(Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        bfm.AgG(-2030793871);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120702), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f35), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new C135851(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120702), function02, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ed6), function0), -1179195072), function0, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, ((iA0T << 18) & 3670016) | 196608, 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135862(function0, function02, i);
        }
    }

    public static final void LogOutSection(C07C c07c, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-2146953395);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            boolean zA1O = AnonymousClass001.A1O(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchSettingsScreenKt$LogOutSection$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0p(c07c, bfm, objAaT, iA0d);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135872(c07c, function0, i);
        }
    }

    public static final void RedeemInviteCodeSection(C07C c07c, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(621058021);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f58);
            boolean zA65 = bfm.A65(strA01) | AnonymousClass001.A1N(iA0d);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchSettingsScreenKt$RedeemInviteCodeSection$1$1(strA01, function0);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0q(c07c, (G0U) objAaT, bfm, iA0d & 14);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135882(c07c, function0, i);
        }
    }

    public static final void SupportAndLegalSection(C07C c07c, boolean z, HatchSettingsConfig hatchSettingsConfig, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, BFM bfm, int i) {
        bfm.AgG(853666727);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, hatchSettingsConfig);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function02);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function03);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, function05);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 4269203, 4269202), bfm, iA0d)) {
            C1BO c1boA02 = C2CK.A02(bfm, HatchAppManagerRepository.isManagedByAppManager);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(contextA0H);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchSettingsScreenKt$SupportAndLegalSection$1$1(contextA0H, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, unit);
            boolean zA1W = AnonymousClass002.A1W(bfm, c1boA02, AnonymousClass003.A1D(iA0d) | AnonymousClass003.A1F(458752, iA0d, 131072) | AnonymousClass003.A1E(iA0d), AnonymousClass005.A1L(iA0d)) | AnonymousClass004.A1I(iA0d) | ((29360128 & iA0d) == 8388608);
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                objAaT2 = new HatchSettingsScreenKt$SupportAndLegalSection$2$1(hatchSettingsConfig, z, function03, function0, function02, c1boA02, function05);
                bfm.Ai0(objAaT2);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, null, 0L, (G0U) objAaT2, bfm, iA0d & 14, 7);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135893(c07c, z, hatchSettingsConfig, function0, function02, function03, function04, function05, i);
        }
    }

    public static final /* synthetic */ ConfidentialVmSwitchUiState access$ConfidentialityAwareSettingsSection$lambda$0(C1BO c1bo) {
        return (ConfidentialVmSwitchUiState) c1bo.getValue();
    }

    public static final /* synthetic */ Boolean access$SupportAndLegalSection$lambda$0(C1BO c1bo) {
        return (Boolean) c1bo.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchSettingsScreen(X.BRg r72, com.facebook.aura.settings.HatchSettingsConfig r73, com.facebook.aura.navigation.key.HatchSettingsSubdestination r74, kotlin.jvm.functions.Function0<kotlin.Unit> r75, kotlin.jvm.functions.Function0<kotlin.Unit> r76, kotlin.jvm.functions.Function0<kotlin.Unit> r77, kotlin.jvm.functions.Function0<kotlin.Unit> r78, kotlin.jvm.functions.Function0<kotlin.Unit> r79, kotlin.jvm.functions.Function0<kotlin.Unit> r80, kotlin.jvm.functions.Function0<kotlin.Unit> r81, kotlin.jvm.functions.Function0<kotlin.Unit> r82, kotlin.jvm.functions.Function0<kotlin.Unit> r83, kotlin.jvm.functions.Function0<kotlin.Unit> r84, kotlin.jvm.functions.Function0<kotlin.Unit> r85, kotlin.jvm.functions.Function0<kotlin.Unit> r86, kotlin.jvm.functions.Function0<kotlin.Unit> r87, kotlin.jvm.functions.Function0<kotlin.Unit> r88, kotlin.jvm.functions.Function0<kotlin.Unit> r89, X.G0U<? super X.HtJ<? super kotlin.Unit>, ? extends java.lang.Object> r90, kotlin.jvm.functions.Function0<kotlin.Unit> r91, kotlin.jvm.functions.Function0<kotlin.Unit> r92, kotlin.jvm.functions.Function0<kotlin.Unit> r93, kotlin.jvm.functions.Function0<java.lang.Boolean> r94, kotlin.jvm.functions.Function0<kotlin.Unit> r95, X.BFM r96, int r97, int r98, int r99, int r100) {
        /*
            Method dump skipped, instructions count: 1730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchSettingsScreenKt.HatchSettingsScreen(X.BRg, com.facebook.aura.settings.HatchSettingsConfig, com.facebook.aura.navigation.key.HatchSettingsSubdestination, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BFM, int, int, int, int):void");
    }
}
