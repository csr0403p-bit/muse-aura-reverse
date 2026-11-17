package com.facebook.aura.skills.connect;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C07C;
import X.C0A8;
import X.C0v5;
import X.C10G;
import X.C11T;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.HzP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.ccv.HatchAccountLinkingTarget;
import com.facebook.aura.connectorconsent.ConnectorConsentUiModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.model.ConsentBulletIcon;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.OAuthLinkedAccount;
import com.facebook.aura.skills.repo.OAuthLinkedAccountGroup;
import com.facebook.aura.skills.repo.OAuthLinkedAccountGroupIcon;
import com.facebook.aura.skills.view.common.HatchConnectorIconKt;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.base.ComponentsKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class SkillConnectBottomSheetKt {

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$LinkedAccountGroup$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $compactAccounts;
        public final /* synthetic */ OAuthLinkedAccountGroup $group;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OAuthLinkedAccountGroup oAuthLinkedAccountGroup, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$group = oAuthLinkedAccountGroup;
            this.$compactAccounts = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SkillConnectBottomSheetKt.LinkedAccountGroup(this.$group, this.$compactAccounts, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$LinkedAccountGroupHeader$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ OAuthLinkedAccountGroupIcon $icon;
        public final /* synthetic */ boolean $isExpandable;
        public final /* synthetic */ boolean $isExpanded;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onToggle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, OAuthLinkedAccountGroupIcon oAuthLinkedAccountGroupIcon, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$label = str;
            this.$icon = oAuthLinkedAccountGroupIcon;
            this.$isExpandable = z;
            this.$isExpanded = z2;
            this.$onToggle = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SkillConnectBottomSheetKt.LinkedAccountGroupHeader(this.$label, this.$icon, this.$isExpandable, this.$isExpanded, this.$onToggle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$LinkedAccountGroups$2, reason: invalid class name and case insensitive filesystem */
    public final class C137912 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $compactAccounts;
        public final /* synthetic */ List<OAuthLinkedAccountGroup> $groups;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C07C $this_LinkedAccountGroups;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137912(C07C c07c, List<OAuthLinkedAccountGroup> list, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$this_LinkedAccountGroups = c07c;
            this.$groups = list;
            this.$compactAccounts = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SkillConnectBottomSheetKt.LinkedAccountGroups(this.$this_LinkedAccountGroups, this.$groups, this.$compactAccounts, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$LinkedAccountRow$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C137922 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $clickEnabled;
        public final /* synthetic */ boolean $compact;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $profilePictureUrl;
        public final /* synthetic */ boolean $selected;
        public final /* synthetic */ String $username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137922(String str, String str2, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, boolean z3, int i, int i2) {
            super(2);
            this.$username = str;
            this.$profilePictureUrl = str2;
            this.$selected = z;
            this.$clickEnabled = z2;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$compact = z3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SkillConnectBottomSheetKt.LinkedAccountRow(this.$username, this.$profilePictureUrl, this.$selected, this.$clickEnabled, this.$onClick, this.$modifier, this.$compact, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$LinkedAccountsLoadingRow$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C137932 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137932(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            SkillConnectBottomSheetKt.LinkedAccountsLoadingRow(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$LinkedAccountsSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C137942 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C07C $this_LinkedAccountsSection;
        public final /* synthetic */ SkillConnectUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137942(C07C c07c, SkillConnectUiState skillConnectUiState, BRg bRg, int i, int i2) {
            super(2);
            this.$this_LinkedAccountsSection = c07c;
            this.$uiState = skillConnectUiState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SkillConnectBottomSheetKt.LinkedAccountsSection(this.$this_LinkedAccountsSection, this.$uiState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$SkillAlreadyConnectedOrDisconnectedSheetContent$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C137952 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $bodyRes;
        public final /* synthetic */ boolean $goToSettingsLoading;
        public final /* synthetic */ Function0<Unit> $onGoToSettings;
        public final /* synthetic */ Skill $skill;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137952(Skill skill, Function0<Unit> function0, int i, boolean z, int i2, int i3) {
            super(2);
            this.$skill = skill;
            this.$onGoToSettings = function0;
            this.$bodyRes = i;
            this.$goToSettingsLoading = z;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SkillConnectBottomSheetKt.SkillAlreadyConnectedOrDisconnectedSheetContent(this.$skill, this.$onGoToSettings, this.$bodyRes, this.$goToSettingsLoading, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$SkillConnectSheetContent$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAccountLinkingTarget $accountLinkingTarget;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ C1BO<SkillConnectUiState> $linkedAccountsUiState$delegate;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ SkillConnectViewModel $viewModel;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                bfm.Afo();
                return;
            }
            LinkedAccountsTitle linkedAccountsTitle = this.$linkedAccountsUiState$delegate.getValue().linkedAccountsTitle;
            boolean zA1Z = AnonymousClass006.A1Z(this.$linkedAccountsUiState$delegate.getValue().connectButtonState, ConnectButtonState.LOADING);
            boolean zA1U = AnonymousClass002.A1U(bfm, this.$origin) | bfm.A67(this.$viewModel);
            HatchAccountLinkingTarget hatchAccountLinkingTarget = this.$accountLinkingTarget;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$context, bfm.A63(hatchAccountLinkingTarget != null ? hatchAccountLinkingTarget.ordinal() : -1) | zA1U);
            SkillConnectViewModel skillConnectViewModel = this.$viewModel;
            HatchSkillOAuthOrigin hatchSkillOAuthOrigin = this.$origin;
            HatchAccountLinkingTarget hatchAccountLinkingTarget2 = this.$accountLinkingTarget;
            Context context = this.$context;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new SkillConnectBottomSheetKt$SkillConnectSheetContent$7$1$1(skillConnectViewModel, hatchSkillOAuthOrigin, hatchAccountLinkingTarget2, context);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA1U2 = AnonymousClass002.A1U(bfm, this.$origin) | bfm.A67(this.$viewModel);
            SkillConnectViewModel skillConnectViewModel2 = this.$viewModel;
            HatchSkillOAuthOrigin hatchSkillOAuthOrigin2 = this.$origin;
            Object objAaT2 = bfm.AaT();
            if (zA1U2 || objAaT2 == C78N.A00) {
                objAaT2 = new SkillConnectBottomSheetKt$SkillConnectSheetContent$7$2$1(skillConnectViewModel2, hatchSkillOAuthOrigin2);
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            boolean zA1U3 = AnonymousClass002.A1U(bfm, this.$origin) | bfm.A67(this.$viewModel);
            SkillConnectViewModel skillConnectViewModel3 = this.$viewModel;
            HatchSkillOAuthOrigin hatchSkillOAuthOrigin3 = this.$origin;
            Object objAaT3 = bfm.AaT();
            if (zA1U3 || objAaT3 == C78N.A00) {
                objAaT3 = new SkillConnectBottomSheetKt$SkillConnectSheetContent$7$3$1(skillConnectViewModel3, hatchSkillOAuthOrigin3);
                bfm.Ai0(objAaT3);
            }
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingLargePlusMicro;
            LinkedAccountsTitleAccessoryKt.LinkedAccountsTitleAccessory(linkedAccountsTitle, zA1Z, function0, g0u, (Function0) objAaT3, C3U4.A0C(bs0, f, AuraDimensKt.SpacingXsmall, f, 0.0f), bfm, 0, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, SkillConnectViewModel skillConnectViewModel, HatchAccountLinkingTarget hatchAccountLinkingTarget, Context context, C1BO<SkillConnectUiState> c1bo) {
            super(3);
            this.$origin = hatchSkillOAuthOrigin;
            this.$viewModel = skillConnectViewModel;
            this.$accountLinkingTarget = hatchAccountLinkingTarget;
            this.$context = context;
            this.$linkedAccountsUiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$SkillConnectSheetContent$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<SkillConnectUiState> $linkedAccountsUiState$delegate;
        public final /* synthetic */ ConnectorConsentUiModel $model;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            if (this.$linkedAccountsUiState$delegate.getValue().showsLinkedAccountList) {
                bfm.AgE(-341349800);
                if (this.$linkedAccountsUiState$delegate.getValue().linkedAccountGroups.isEmpty()) {
                    bfm.AgE(-341109581);
                    SkillConnectBottomSheetKt.LinkedAccountsSection(c07c, this.$linkedAccountsUiState$delegate.getValue(), null, bfm, (iA0d & 14) | (SkillConnectUiState.$stable << 3), 2);
                } else {
                    bfm.AgE(-341291706);
                    SkillConnectBottomSheetKt.LinkedAccountGroups(c07c, this.$linkedAccountsUiState$delegate.getValue().linkedAccountGroups, this.$linkedAccountsUiState$delegate.getValue().compactAccounts, null, bfm, iA0d & 14, 4);
                }
                BBI bbiA07 = C3cG.A07(bfm);
                if (this.$linkedAccountsUiState$delegate.getValue().compactAccounts && this.$model.calloutParagraphs.isEmpty()) {
                    bfm.AgE(-340891589);
                } else {
                    C01N.A08(bfm, C3cG.A09(bfm, -340948288), 16.0f);
                }
                BBI.A0R(bbiA07, false);
            } else {
                bfm.AgE(-340885637);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(ConnectorConsentUiModel connectorConsentUiModel, C1BO<SkillConnectUiState> c1bo) {
            super(3);
            this.$model = connectorConsentUiModel;
            this.$linkedAccountsUiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$SkillConnectSheetContent$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchComponent $cancelComponent;
        public final /* synthetic */ HatchComponent $connectComponent;
        public final /* synthetic */ Function0<Unit> $onConnectSuccess;
        public final /* synthetic */ Function0<Unit> $onConsentAccepted;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ Skill $skill;
        public final /* synthetic */ String $sourceSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(Skill skill, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str, HatchComponent hatchComponent, HatchComponent hatchComponent2, int i, int i2) {
            super(2);
            this.$skill = skill;
            this.$onConsentAccepted = function0;
            this.$onConnectSuccess = function02;
            this.$onDismiss = function03;
            this.$origin = hatchSkillOAuthOrigin;
            this.$sourceSessionId = str;
            this.$connectComponent = hatchComponent;
            this.$cancelComponent = hatchComponent2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SkillConnectBottomSheetKt.SkillConnectSheetContent(this.$skill, this.$onConsentAccepted, this.$onConnectSuccess, this.$onDismiss, this.$origin, this.$sourceSessionId, this.$connectComponent, this.$cancelComponent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$SkillSheetIcon$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $iconUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i) {
            super(2);
            this.$iconUrl = str;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SkillConnectBottomSheetKt.SkillSheetIcon(this.$iconUrl, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.connect.SkillConnectBottomSheetKt", f = "SkillConnectBottomSheet.kt", l = {273, 281}, m = "handleSkillConnectAction", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$handleSkillConnectAction$1, reason: invalid class name and case insensitive filesystem */
    public final class C137961 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SkillConnectBottomSheetKt.handleSkillConnectAction(null, null, null, null, null, null, null, null, null, null, null, this);
        }

        public C137961(HtJ<? super C137961> htJ) {
            super(htJ);
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$handleSkillConnectAction$2, reason: invalid class name and case insensitive filesystem */
    public final class C137972 extends AbstractC7559F3s implements G0U<Integer, Unit> {
        public final /* synthetic */ SkillConnectViewModel $connectViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137972(SkillConnectViewModel skillConnectViewModel) {
            super(1);
            this.$connectViewModel = skillConnectViewModel;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            AnonymousClass005.A0w(num);
            this.$connectViewModel.onAccountLinkDismissed();
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            this.$connectViewModel.onAccountLinkDismissed();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ConsentBulletIcon.values().length];
            try {
                AnonymousClass005.A0v(ConsentBulletIcon.STORAGE, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(ConsentBulletIcon.DATA_TYPES, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(ConsentBulletIcon.CAUTION, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(ConsentBulletIcon.SETTINGS, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(ConsentBulletIcon.WARNING, iArr, 5);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ConsentBulletIcon.CONNECTOR, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(ConsentBulletIcon.SMART_GLASSES, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(ConsentBulletIcon.INFO, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(ConsentBulletIcon.UNSPECIFIED, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OAuthLinkedAccountGroupIcon.values().length];
            try {
                AnonymousClass005.A0v(OAuthLinkedAccountGroupIcon.UNSPECIFIED, iArr2, 1);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass005.A0v(OAuthLinkedAccountGroupIcon.FACEBOOK, iArr2, 2);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass005.A0v(OAuthLinkedAccountGroupIcon.INSTAGRAM, iArr2, 3);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass005.A0v(OAuthLinkedAccountGroupIcon.BUSINESS, iArr2, 4);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass005.A0v(OAuthLinkedAccountGroupIcon.META, iArr2, 5);
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void LinkedAccountGroup(OAuthLinkedAccountGroup oAuthLinkedAccountGroup, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1327904093);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, oAuthLinkedAccountGroup) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA65 = bfm.A65(oAuthLinkedAccountGroup.key);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA02);
            String str = oAuthLinkedAccountGroup.label;
            OAuthLinkedAccountGroupIcon oAuthLinkedAccountGroupIcon = oAuthLinkedAccountGroup.icon;
            boolean z2 = !oAuthLinkedAccountGroup.accounts.isEmpty();
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA652 = bfm.A65(mutableState);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = new SkillConnectBottomSheetKt$LinkedAccountGroup$1$1$1(mutableState);
                bfm.Ai0(objAaT2);
            }
            LinkedAccountGroupHeader(str, oAuthLinkedAccountGroupIcon, z2, zA0A, (Function0) objAaT2, null, bfm, 0, 32);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(1091499335);
                for (OAuthLinkedAccount oAuthLinkedAccount : oAuthLinkedAccountGroup.accounts) {
                    String str2 = oAuthLinkedAccount.username;
                    String str3 = oAuthLinkedAccount.profilePictureUrl;
                    Object objAaT3 = bfm.AaT();
                    if (objAaT3 == C78N.A00) {
                        objAaT3 = SkillConnectBottomSheetKt$LinkedAccountGroup$1$2$1$1.INSTANCE;
                        bfm.Ai0(objAaT3);
                    }
                    LinkedAccountRow(str2, str3, false, false, (Function0) objAaT3, null, z, bfm, ((iA0T << 15) & 3670016) | 28032, 32);
                }
            } else {
                bfm.AgE(1091808777);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(oAuthLinkedAccountGroup, z, bRg2, i, i2);
        }
    }

    public static final void LinkedAccountGroupHeader(String str, OAuthLinkedAccountGroupIcon oAuthLinkedAccountGroupIcon, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BS0 bs0A09;
        BRg bRgA0Y;
        BRg bRgA0Q = bRg;
        bfm.AgG(-1107455220);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass005.A09(bfm, oAuthLinkedAccountGroupIcon);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRgA0Q);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            int i4 = R.string._name_removed__res_0x7f120277;
            if (z2) {
                i4 = R.string._name_removed__res_0x7f120278;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i4);
            int i5 = R.string._name_removed__res_0x7f12087a;
            if (z2) {
                i5 = R.string._name_removed__res_0x7f120879;
            }
            String strA012 = AbstractC2271BQs.A01(bfm, i5);
            BRg bRgA0V = AnonymousClass001.A0V(AnonymousClass001.A0R(bRgA0Q), 48.0f);
            if (z) {
                bs0A09 = C3cG.A09(bfm, 1741012926);
                BRg bRgA05 = C0v5.A05(bs0A09, strA012, function0, true);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new SkillConnectBottomSheetKt$LinkedAccountGroupHeader$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                bRgA0Y = AnonymousClass001.A0Y(bRgA05, objAaT, false);
            } else {
                bs0A09 = C3cG.A09(bfm, 1741321438);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = SkillConnectBottomSheetKt$LinkedAccountGroupHeader$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                bRgA0Y = AnonymousClass001.A0Y(bs0A09, objAaT2, true);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            BRg bRgA06 = C3U4.A06(bRgA0V.then(bRgA0Y), 8.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(12.0f), bfm, oAuthLinkedAccountGroupIcon == OAuthLinkedAccountGroupIcon.META ? C2VU.A05 : C2VU.A04, 6);
            int iA02 = C3cG.A02(bbiA07.A06);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA02);
            C90m c90m = C90m.A00;
            AVy aVyA00 = BOf.A00(bfm, linkedAccountGroupIconRes(oAuthLinkedAccountGroupIcon), 0);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long jA06 = C3cH.A06(bfm, auraTheme);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            int i6 = AVy.$stable;
            AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, auraIconSize, null, jA06, null, bfm, (i6 << 3) | 3456, 33);
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0O(c90m, bs0A09, true), C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            if (z) {
                bfm.AgE(484981270);
                AuraIconKt.m2567AuraIconFHprtrg(C11T.A00(bs0A09, z2 ? 180.0f : 0.0f), BOf.A00(bfm, R.drawable.caret_down_filled_24, 0), AuraIconSize.X_SMALL, null, auraTheme.getColors(bfm, 6).secondaryIcon.enabled, null, bfm, (i6 << 3) | 3456, 32);
            } else {
                bfm.AgE(485267834);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbiA07, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, oAuthLinkedAccountGroupIcon, z, z2, function0, bRgA0Q, i, i2);
        }
    }

    public static final void LinkedAccountGroups(C07C c07c, List<OAuthLinkedAccountGroup> list, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1178810586);
        int iA06 = (i & 48) == 0 ? AnonymousClass002.A06(AnonymousClass004.A1Y(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 384) == 0) {
            iA06 |= AnonymousClass004.A0p(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA06 |= 3072;
        } else if ((i & 3072) == 0) {
            iA06 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA06 & 1169, 1168), bfm, iA06)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            ComponentsKt.m2403AuraVerticalSpacer8Feqmps(12.0f, bfm, 6);
            BRg bRgA07 = C3U4.A07(AnonymousClass005.A0T(bfm, C10G.A0A(AnonymousClass001.A0R(bRg2), Float.NaN, 320.0f)), AuraDimensKt.SpacingLargePlusMicro);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 4.0f, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, 1744182551);
            while (itA0w.hasNext()) {
                OAuthLinkedAccountGroup oAuthLinkedAccountGroup = (OAuthLinkedAccountGroup) itA0w.next();
                bfm.Ag8(1701995907, oAuthLinkedAccountGroup.key);
                LinkedAccountGroup(oAuthLinkedAccountGroup, z, null, bfm, (iA06 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            if (z) {
                bfm.AgE(-2000709528);
            } else {
                bfm.AgE(-2000743163);
                ComponentsKt.m2403AuraVerticalSpacer8Feqmps(12.0f, bfm, 6);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137912(c07c, list, z, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0090 A[PHI: r43
  0x0090: PHI (r43v3 boolean) = (r43v2 boolean), (r43v5 boolean) binds: [B:34:0x0088, B:36:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LinkedAccountRow(java.lang.String r47, java.lang.String r48, boolean r49, boolean r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, X.BRg r52, boolean r53, X.BFM r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt.LinkedAccountRow(java.lang.String, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, X.BRg, boolean, X.BFM, int, int):void");
    }

    public static final void LinkedAccountsSection(C07C c07c, SkillConnectUiState skillConnectUiState, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-854136818);
        int iA06 = (i & 48) == 0 ? AnonymousClass002.A06(AnonymousClass004.A1Y(skillConnectUiState, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA06 |= 384;
        } else if ((i & 384) == 0) {
            iA06 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA06 & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA06)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            ComponentsKt.m2403AuraVerticalSpacer8Feqmps(12.0f, bfm, 6);
            BRg bRgA07 = C3U4.A07(AnonymousClass005.A0T(bfm, C11U.A01(C10G.A0A(AnonymousClass001.A0R(bRg2), Float.NaN, 320.0f), AuraTheme.INSTANCE.getDimensions(bfm, 6).sectionCornerRadius)), AuraDimensKt.SpacingLargePlusMicro);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0D);
            C90l c90l = C90l.A00;
            boolean z = (iA06 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA06 & 64) != 0 && bfm.A67(skillConnectUiState));
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new SkillConnectBottomSheetKt$LinkedAccountsSection$1$1$1(skillConnectUiState);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, 6, 7);
            BBI.A0R(bbi, true);
            ComponentsKt.m2403AuraVerticalSpacer8Feqmps(12.0f, bfm, 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137942(c07c, skillConnectUiState, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SkillAlreadyConnectedOrDisconnectedSheetContent(com.facebook.aura.skills.model.Skill r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, int r52, boolean r53, X.BFM r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt.SkillAlreadyConnectedOrDisconnectedSheetContent(com.facebook.aura.skills.model.Skill, kotlin.jvm.functions.Function0, int, boolean, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SkillConnectSheetContent(com.facebook.aura.skills.model.Skill r43, kotlin.jvm.functions.Function0<kotlin.Unit> r44, kotlin.jvm.functions.Function0<kotlin.Unit> r45, kotlin.jvm.functions.Function0<kotlin.Unit> r46, com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin r47, java.lang.String r48, com.facebook.aura.analytics.hatch.HatchComponent r49, com.facebook.aura.analytics.hatch.HatchComponent r50, X.BFM r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt.SkillConnectSheetContent(com.facebook.aura.skills.model.Skill, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin, java.lang.String, com.facebook.aura.analytics.hatch.HatchComponent, com.facebook.aura.analytics.hatch.HatchComponent, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object handleSkillConnectAction(com.facebook.aura.skills.connect.repository.SkillConnectAction r6, com.facebook.aura.skills.model.Skill r7, com.facebook.aura.skills.connect.SkillConnectUiState r8, com.facebook.aura.skills.connect.SkillConnectViewModel r9, com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin r10, java.lang.String r11, android.content.Context r12, com.facebook.aura.navigation.AuraNavigator r13, kotlin.jvm.functions.Function0<kotlin.Unit> r14, kotlin.jvm.functions.Function0<kotlin.Unit> r15, kotlin.jvm.functions.Function0<kotlin.Unit> r16, X.HtJ<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt.handleSkillConnectAction(com.facebook.aura.skills.connect.repository.SkillConnectAction, com.facebook.aura.skills.model.Skill, com.facebook.aura.skills.connect.SkillConnectUiState, com.facebook.aura.skills.connect.SkillConnectViewModel, com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin, java.lang.String, android.content.Context, com.facebook.aura.navigation.AuraNavigator, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    public static final void launchAuthMethod(AuraNavKey auraNavKey, AuraNavigator auraNavigator) {
        HatchConnectorQplLogger.INSTANCE.markAuthMethodStarted(null);
        auraNavigator.navigate(auraNavKey, LaunchFlag.NAVIGATE);
    }

    public static final void LinkedAccountsLoadingRow(BFM bfm, int i) {
        bfm.AgG(-410440148);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA0B = C3U4.A0B(C10G.A02, 16.0f, 36.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(bs0, 18.0f), null, 0L, bfm, 6, 6);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d3b);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).subheadlineMedium;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0C(bs0, 12.0f, 0.0f, 0.0f, 0.0f), C3cH.A06(bfm, auraTheme), c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137932(i);
        }
    }

    public static final void SkillSheetIcon(String str, BFM bfm, int i) {
        bfm.AgG(-730675853);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(str, null, null, 48.0f, 14.0f, 0, 0.0f, null, null, bfm, (iA0d & 14) | 27696, 484);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, i);
        }
    }

    public static final /* synthetic */ SkillConnectUiState access$SkillConnectSheetContent$lambda$3(C1BO c1bo) {
        return (SkillConnectUiState) c1bo.getValue();
    }

    public static final int consentBulletIconRes(ConsentBulletIcon consentBulletIcon) {
        switch (consentBulletIcon.ordinal()) {
            case 0:
            case 4:
                return R.drawable.toggles_outline_24_wght400;
            case 1:
                return R.drawable.arrows_repeat_outline_24_wght400;
            case 2:
                return R.drawable.standings_outline_24_wght400;
            case 3:
                return R.drawable.eye_wght400_outline_24;
            case 5:
                return R.drawable.settings_gear_android_wght400_outline_24;
            case 6:
                return R.drawable.rectanglealert_outline_24_wght400_light;
            case 7:
                return R.drawable.dots_connector_outline;
            case 8:
                return R.drawable.ic_smart_glasses_outline;
            default:
                throw C3cG.A0q();
        }
    }

    public static final int linkedAccountGroupIconRes(OAuthLinkedAccountGroupIcon oAuthLinkedAccountGroupIcon) {
        int iOrdinal = oAuthLinkedAccountGroupIcon.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.circle_info_wght400_outline_24;
        }
        if (iOrdinal == 1) {
            return R.drawable.facebook_outline_24_wght400;
        }
        if (iOrdinal == 2) {
            return R.drawable.instagram_outline_24_wght400;
        }
        if (iOrdinal == 3) {
            return R.drawable.ads_manager_outline_24_wght400;
        }
        if (iOrdinal == 4) {
            return R.drawable.ic_meta_infinity;
        }
        throw C3cG.A0q();
    }
}
