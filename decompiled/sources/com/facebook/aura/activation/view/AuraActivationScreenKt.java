package com.facebook.aura.activation.view;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C20Q;
import X.C3U4;
import X.C3cG;
import X.C78N;
import X.C7bA;
import X.EnumC3085Bxl;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.activation.data.ActivationState;
import com.facebook.aura.activation.data.HatchTosMetadata;
import com.facebook.aura.activation.data.HatchUpsellCell;
import com.facebook.aura.activation.model.AuraActivationViewModel;
import com.facebook.aura.activation.model.AuraInviteCodeViewModel;
import com.facebook.aura.activation.model.AuraNdaViewModel;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchHeaderKt;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.header.view.SettingsHeaderButtonKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.user.provider.AgeCheckMethod;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AuraActivationScreenKt {
    public static final float ACTIVATION_SCREEN_CENTER_ICON_SIZE = 163.0f;
    public static final float ACTIVATION_SCREEN_CENTER_ICON_SIZE_SMALL = 88.0f;
    public static final String TAG = "AuraActivationScreen";
    public static final int WaitlistRefreshMenuItemId = 0;
    public static final int WaitlistSettingsMenuItemId = 1;

    /* renamed from: com.facebook.aura.activation.view.AuraActivationScreenKt$AgeBlockedSupportButton$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
            super(2);
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
            AuraActivationScreenKt.AgeBlockedSupportButton(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraActivationScreenKt$AuraActivationScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$changed3;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $$default1;
        public final /* synthetic */ AuraInviteCodeViewModel.UiState $inviteCodeUiState;
        public final /* synthetic */ boolean $isDisclosureLoading;
        public final /* synthetic */ boolean $isFetchingTosMetadata;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraNdaViewModel.UiState $ndaUiState;
        public final /* synthetic */ Function0<Unit> $onAgeLogOutConfirmationDismissed;
        public final /* synthetic */ G0V<AgeCheckMethod, Integer, Unit> $onAgeMethodPicked;
        public final /* synthetic */ Function0<Unit> $onAgeStepBack;
        public final /* synthetic */ Function0<Unit> $onCCVAgeVerified;
        public final /* synthetic */ Function0<Unit> $onDisclosureAcceptClick;
        public final /* synthetic */ Function0<Unit> $onEnterInviteCodeClick;
        public final /* synthetic */ Function0<Unit> $onInviteCodeBackClick;
        public final /* synthetic */ G0U<String, Unit> $onInviteCodeChange;
        public final /* synthetic */ Function0<Unit> $onInviteCodeContinueClick;
        public final /* synthetic */ G0V<Boolean, String, Unit> $onInviteStepChanged;
        public final /* synthetic */ Function0<Unit> $onJoinWaitlistClick;
        public final /* synthetic */ Function0<Unit> $onLogOutClick;
        public final /* synthetic */ Function0<Unit> $onNavigateBack;
        public final /* synthetic */ Function0<Unit> $onNdaAcceptClick;
        public final /* synthetic */ G0U<String, Unit> $onNdaEmailChange;
        public final /* synthetic */ G0U<String, Unit> $onNdaNameChange;
        public final /* synthetic */ G0U<Boolean, Unit> $onOtherAgeMethods;
        public final /* synthetic */ Function0<Unit> $onRefresh;
        public final /* synthetic */ Function0<Unit> $onRefreshAfterAgeConfirmationLinking;
        public final /* synthetic */ Function0<Unit> $onRefreshFromUser;
        public final /* synthetic */ Function0<Unit> $onSelfieAgeConfirmed;
        public final /* synthetic */ Function0<Unit> $onSettingsClick;
        public final /* synthetic */ Function0<Unit> $onVmProvisioningRetry;
        public final /* synthetic */ Function0<Unit> $onWearablesLinked;
        public final /* synthetic */ Function0<Unit> $onWearablesStepDone;
        public final /* synthetic */ Function0<Unit> $performLogOut;
        public final /* synthetic */ boolean $showWearablesSkip;
        public final /* synthetic */ HatchTosMetadata $tosMetadata;
        public final /* synthetic */ AuraActivationViewModel.UiState $uiState;
        public final /* synthetic */ HatchUpsellCell $upsellCell;
        public final /* synthetic */ C20Q<AuraActivationViewModel.ViewEffect> $viewEffect;
        public final /* synthetic */ boolean $wearablesPhoneProviderLinked;
        public final /* synthetic */ String $wearablesSetupSessionId;
        public final /* synthetic */ String $wearablesWakeWord;

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, AuraNdaViewModel.UiState uiState, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function07, Function0<Unit> function08, Function0<Unit> function09, boolean z, HatchUpsellCell hatchUpsellCell, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v, G0U<? super Boolean, Unit> g0u3, Function0<Unit> function010, Function0<Unit> function011, Function0<Unit> function012, BRg bRg, String str, boolean z2, String str2, boolean z3, boolean z4, HatchTosMetadata hatchTosMetadata, Function0<Unit> function013, Function0<Unit> function014, Function0<Unit> function015, Function0<Unit> function016, Function0<Unit> function017, AuraActivationViewModel.UiState uiState2, C20Q<? extends AuraActivationViewModel.ViewEffect> c20q, Function0<Unit> function018, AuraInviteCodeViewModel.UiState uiState3, G0U<? super String, Unit> g0u4, Function0<Unit> function019, Function0<Unit> function020, G0V<? super Boolean, ? super String, Unit> g0v2, int i, int i2, int i3, int i4, int i5, int i6) {
            super(2);
            this.$onJoinWaitlistClick = function0;
            this.$onEnterInviteCodeClick = function02;
            this.$onSettingsClick = function03;
            this.$onLogOutClick = function04;
            this.$performLogOut = function05;
            this.$onDisclosureAcceptClick = function06;
            this.$ndaUiState = uiState;
            this.$onNdaNameChange = g0u;
            this.$onNdaEmailChange = g0u2;
            this.$onNdaAcceptClick = function07;
            this.$onWearablesLinked = function08;
            this.$onWearablesStepDone = function09;
            this.$showWearablesSkip = z;
            this.$upsellCell = hatchUpsellCell;
            this.$onAgeMethodPicked = g0v;
            this.$onOtherAgeMethods = g0u3;
            this.$onAgeStepBack = function010;
            this.$onAgeLogOutConfirmationDismissed = function011;
            this.$onSelfieAgeConfirmed = function012;
            this.$modifier = bRg;
            this.$wearablesWakeWord = str;
            this.$wearablesPhoneProviderLinked = z2;
            this.$wearablesSetupSessionId = str2;
            this.$isDisclosureLoading = z3;
            this.$isFetchingTosMetadata = z4;
            this.$tosMetadata = hatchTosMetadata;
            this.$onCCVAgeVerified = function013;
            this.$onVmProvisioningRetry = function014;
            this.$onRefresh = function015;
            this.$onRefreshAfterAgeConfirmationLinking = function016;
            this.$onRefreshFromUser = function017;
            this.$uiState = uiState2;
            this.$viewEffect = c20q;
            this.$onNavigateBack = function018;
            this.$inviteCodeUiState = uiState3;
            this.$onInviteCodeChange = g0u4;
            this.$onInviteCodeContinueClick = function019;
            this.$onInviteCodeBackClick = function020;
            this.$onInviteStepChanged = g0v2;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$changed2 = i3;
            this.$$changed3 = i4;
            this.$$default = i5;
            this.$$default1 = i6;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationScreenKt.AuraActivationScreen(this.$onJoinWaitlistClick, this.$onEnterInviteCodeClick, this.$onSettingsClick, this.$onLogOutClick, this.$performLogOut, this.$onDisclosureAcceptClick, this.$ndaUiState, this.$onNdaNameChange, this.$onNdaEmailChange, this.$onNdaAcceptClick, this.$onWearablesLinked, this.$onWearablesStepDone, this.$showWearablesSkip, this.$upsellCell, this.$onAgeMethodPicked, this.$onOtherAgeMethods, this.$onAgeStepBack, this.$onAgeLogOutConfirmationDismissed, this.$onSelfieAgeConfirmed, this.$modifier, this.$wearablesWakeWord, this.$wearablesPhoneProviderLinked, this.$wearablesSetupSessionId, this.$isDisclosureLoading, this.$isFetchingTosMetadata, this.$tosMetadata, this.$onCCVAgeVerified, this.$onVmProvisioningRetry, this.$onRefresh, this.$onRefreshAfterAgeConfirmationLinking, this.$onRefreshFromUser, this.$uiState, this.$viewEffect, this.$onNavigateBack, this.$inviteCodeUiState, this.$onInviteCodeChange, this.$onInviteCodeContinueClick, this.$onInviteCodeBackClick, this.$onInviteStepChanged, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), AnonymousClass011.A01(this.$$changed3), this.$$default, this.$$default1);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraActivationScreenKt$SettingsHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onSettingsClick;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, HatchScreen hatchScreen, int i) {
            super(2);
            this.$onSettingsClick = function0;
            this.$screen = hatchScreen;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationScreenKt.SettingsHeader(this.$onSettingsClick, this.$screen, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraActivationScreenKt$VmProvisioningFailureScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C106972 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraActivationViewModel.VmProvisioningFailureRequest $failureRequest;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLogOutClick;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ Function0<Unit> $onSettingsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106972(AuraActivationViewModel.VmProvisioningFailureRequest vmProvisioningFailureRequest, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$failureRequest = vmProvisioningFailureRequest;
            this.$onRetry = function0;
            this.$onSettingsClick = function02;
            this.$onLogOutClick = function03;
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
            AuraActivationScreenKt.VmProvisioningFailureScreen(this.$failureRequest, this.$onRetry, this.$onSettingsClick, this.$onLogOutClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraActivationScreenKt$WaitlistOverflowHeader$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AHH<AuraContextMenuItem> $menuItems;
        public final /* synthetic */ Function0<Unit> $onRefreshClick;
        public final /* synthetic */ Function0<Unit> $onSettingsClick;
        public final /* synthetic */ MutableState<Boolean> $showContextMenu$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, Function0<Unit> function02, MutableState<Boolean> mutableState, AHH<AuraContextMenuItem> ahh) {
            super(2);
            this.$onRefreshClick = function0;
            this.$onSettingsClick = function02;
            this.$showContextMenu$delegate = mutableState;
            this.$menuItems = ahh;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                Function0<Unit> function0 = this.$onRefreshClick;
                Function0<Unit> function02 = this.$onSettingsClick;
                MutableState<Boolean> mutableState = this.$showContextMenu$delegate;
                AHH<AuraContextMenuItem> ahh = this.$menuItems;
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bs0);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, i2);
                C0z7 c0z7 = C0z7.A00;
                AVy aVyA00 = BOf.A00(bfm, R.drawable.ellipsis_wght400_outline_24, 0);
                String strA0i = AnonymousClass005.A0i(bfm);
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = new AuraActivationScreenKt$WaitlistOverflowHeader$1$1$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA00, strA0i, (Function0) objAaT, null, false, 0.0f, null, null, null, false, false, bfm, AVy.$stable | 384, 0, 2040);
                BRg bRgAQJ = c0z7.AQJ(bs0);
                boolean zA0A = MutableState.A0A((MutableState) mutableState);
                long jA0B = AnonymousClass007.A0B(0.0f, AuraDimensKt.SpacingSmall);
                boolean zA1K = AnonymousClass003.A1K(bfm, function0, function02);
                Object objAaT2 = bfm.AaT();
                if (zA1K || objAaT2 == obj) {
                    objAaT2 = new AuraActivationScreenKt$WaitlistOverflowHeader$1$1$2$1(function0, function02, mutableState);
                    bfm.Ai0(objAaT2);
                }
                G0U g0u = (G0U) objAaT2;
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == obj) {
                    objAaT3 = new AuraActivationScreenKt$WaitlistOverflowHeader$1$1$3$1(mutableState);
                    bfm.Ai0(objAaT3);
                }
                AuraContextMenuKt.m2519AuraContextMenukiaLOpA(bRgAQJ, g0u, (Function0) objAaT3, zA0A, null, jA0B, null, false, new AuraActivationScreenKt$WaitlistOverflowHeader$1$1$4(ahh), false, null, null, null, false, bfm, 384, 0, 16080);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraActivationScreenKt$WaitlistOverflowHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C106982 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onRefreshClick;
        public final /* synthetic */ Function0<Unit> $onSettingsClick;
        public final /* synthetic */ InterfaceC05151eP $this_WaitlistOverflowHeader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106982(InterfaceC05151eP interfaceC05151eP, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$this_WaitlistOverflowHeader = interfaceC05151eP;
            this.$onRefreshClick = function0;
            this.$onSettingsClick = function02;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationScreenKt.WaitlistOverflowHeader(this.$this_WaitlistOverflowHeader, this.$onRefreshClick, this.$onSettingsClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActivationState.values().length];
            try {
                AnonymousClass002.A13(ActivationState.DISCLOSURE_ToS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ActivationState.RETOS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ActivationState.REQUEST_WAITLIST, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ActivationState.REQUEST_INVITE_CODE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ActivationState.ALREADY_WAITLISTED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ActivationState.LIMITED_WAITLIST, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(ActivationState.NDA, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(ActivationState.WEARABLES_LINKING, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(ActivationState.AGE_VERIFICATION, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ActivationState.NAME_REQUIRED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ActivationState.CONFIDENTIAL_VM_SETUP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ActivationState.VM_PROVISIONING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ActivationState.LOADING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ActivationState.GEO_BLOCKED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ActivationState.NO_ACCESS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ActivationState.BLOCKED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ActivationState.FULLY_ACTIVATED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void AgeBlockedSupportButton(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-558720321);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120188);
            BRg bRgA0U = AnonymousClass001.A0U(C3U4.A04(bRg2, AuraDimensKt.SpacingLarge), 44.0f);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new AuraActivationScreenKt$AgeBlockedSupportButton$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = AuraActivationScreenKt$AgeBlockedSupportButton$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM("hatch-age-blocked-get-support", strA01, null, bRgA0U, null, auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, (Function0) objAaT2, null, false, 0, false, 0, bfm, 196614, 0, 48, 132104148);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg2, i, i2);
        }
    }

    public static final void VmProvisioningFailureScreen(AuraActivationViewModel.VmProvisioningFailureRequest vmProvisioningFailureRequest, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2013815352);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, vmProvisioningFailureRequest) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, function03);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA08 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 9363, 9362), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A01;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA02);
            if (vmProvisioningFailureRequest == AuraActivationViewModel.VmProvisioningFailureRequest.LEASE) {
                Object objA0p = AnonymousClass001.A0p(bfm, -1689211529);
                Object obj = C78N.A00;
                MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objA0p, obj, false);
                EnumC3085Bxl enumC3085Bxl = EnumC3085Bxl.ON_STOP;
                Object objAaT = bfm.AaT();
                if (objAaT == obj) {
                    objAaT = new AuraActivationScreenKt$VmProvisioningFailureScreen$1$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                C7bA.A00(bfm, enumC3085Bxl, null, (Function0) objAaT, 390, 2);
                EnumC3085Bxl enumC3085Bxl2 = EnumC3085Bxl.ON_START;
                boolean zA1C = AnonymousClass003.A1C(iA08);
                Object objAaT2 = bfm.AaT();
                if (zA1C || objAaT2 == obj) {
                    objAaT2 = new AuraActivationScreenKt$VmProvisioningFailureScreen$1$2$1(function0, mutableState);
                    bfm.Ai0(objAaT2);
                }
                C7bA.A00(bfm, enumC3085Bxl2, null, (Function0) objAaT2, 6, 2);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120635);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120634);
                BS0 bs0 = BRg.A00;
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == obj) {
                    objAaT3 = AuraActivationScreenKt$VmProvisioningFailureScreen$1$3$1.INSTANCE;
                    bfm.Ai0(objAaT3);
                }
                AuraGatingScreenKt.AuraGatingScreen(AnonymousClass001.A0Y(bs0, objAaT3, false), strA01, strA012, null, null, bfm, 0, 24);
                SettingsHeader(function02, HatchScreen.ONBOARDING_VM_PROVISIONING, bfm, ((iA08 >> 6) & 14) | 48);
            } else {
                bfm.AgE(-1688532319);
                String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b19);
                Object objAaT4 = bfm.AaT();
                if (objAaT4 == C78N.A00) {
                    objAaT4 = AuraActivationScreenKt$VmProvisioningFailureScreen$1$4$1.INSTANCE;
                    bfm.Ai0(objAaT4);
                }
                HatchScreenErrorStateKt.HatchScreenErrorState(strA013, function0, AnonymousClass001.A0Y(c1062ATq, objAaT4, false), HatchSurface.ONBOARDING, null, HatchScreen.ONBOARDING_VM_PROVISIONING, null, bfm, (iA08 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 199680, 80);
                HatchHeaderKt.m994HatchPageHeaderOT94q8g(null, null, function03, null, HatchHeaderTitleAlignment.HIDDEN, false, 0, null, null, false, null, null, null, null, 0L, 0L, null, null, 0, null, null, false, bfm, ((iA08 >> 3) & 896) | RuntimeInternals.IOPRIO_BACKGROUND, 0, 0, 4194283);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C106972(vmProvisioningFailureRequest, function0, function02, function03, bRg2, i, i2);
        }
    }

    public static final float getACTIVATION_SCREEN_CENTER_ICON_SIZE() {
        return ACTIVATION_SCREEN_CENTER_ICON_SIZE;
    }

    public static final float getACTIVATION_SCREEN_CENTER_ICON_SIZE_SMALL() {
        return ACTIVATION_SCREEN_CENTER_ICON_SIZE_SMALL;
    }

    public static final void logWaitlistMenuDismiss() {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.ONBOARDING, HatchSubsurface.DOT_MENU, HatchScreen.ONBOARDING_WAITLIST, HatchComponent.THREE_DOTS_MENU, null, null);
    }

    public static final void SettingsHeader(Function0<Unit> function0, HatchScreen hatchScreen, BFM bfm, int i) {
        bfm.AgG(870997940);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass005.A09(bfm, hatchScreen);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            HatchHeaderTitleAlignment hatchHeaderTitleAlignment = HatchHeaderTitleAlignment.HIDDEN;
            AHD<HeaderButton> ahd = SettingsHeaderButtonKt.SettingsHeaderButtons;
            boolean zA1C = AnonymousClass003.A1C(iA0T) | AnonymousClass001.A1M(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new AuraActivationScreenKt$SettingsHeader$1$1(hatchScreen, function0);
                bfm.Ai0(objAaT);
            }
            HatchHeaderKt.m994HatchPageHeaderOT94q8g(null, null, null, null, hatchHeaderTitleAlignment, false, 0, null, null, false, ahd, (G0U) objAaT, null, null, 0L, 0L, null, null, 0, null, null, false, bfm, 221184, 0, 0, 4191183);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, hatchScreen, i);
        }
    }

    public static final void WaitlistOverflowHeader(InterfaceC05151eP interfaceC05151eP, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        bfm.AgG(-2054743781);
        int iA0U = (i & 48) == 0 ? AnonymousClass004.A0U(bfm, function0) | i : i;
        if ((i & 384) == 0) {
            iA0U |= AnonymousClass004.A0V(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0U & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA0U)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206ae);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205b8);
            boolean zA1K = AnonymousClass003.A1K(bfm, strA01, strA012);
            Object objAaT2 = bfm.AaT();
            if (zA1K || objAaT2 == obj) {
                BS0 bs0 = BRg.A00;
                objAaT2 = AGI.A0E(new AuraContextMenuItem(0, strA01, null, null, null, null, false, false, false, true, false, bs0, 1, 1), new AuraContextMenuItem(1, strA012, null, null, null, null, false, false, false, true, false, bs0, 1, 1));
                bfm.Ai0(objAaT2);
            }
            HatchHeaderKt.m994HatchPageHeaderOT94q8g(null, null, null, null, HatchHeaderTitleAlignment.HIDDEN, false, 0, null, null, false, null, null, null, B1V.A00(bfm, new AnonymousClass1(function0, function02, mutableState, (AHH) objAaT2), -979355598), 0L, 0L, null, null, 0, null, null, false, bfm, 221184, 3072, 0, 4186063);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C106982(interfaceC05151eP, function0, function02, i);
        }
    }

    public static final WaitlistScreenMode toWaitlistScreenMode(ActivationState activationState) {
        int iOrdinal = activationState.ordinal();
        if (iOrdinal != 6) {
            if (iOrdinal == 7) {
                return WaitlistScreenMode.JOINED;
            }
            if (iOrdinal == 8) {
                return WaitlistScreenMode.LIMITED;
            }
        }
        return WaitlistScreenMode.JOIN;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x091e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraActivationScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r83, kotlin.jvm.functions.Function0<kotlin.Unit> r84, kotlin.jvm.functions.Function0<kotlin.Unit> r85, kotlin.jvm.functions.Function0<kotlin.Unit> r86, kotlin.jvm.functions.Function0<kotlin.Unit> r87, kotlin.jvm.functions.Function0<kotlin.Unit> r88, com.facebook.aura.activation.model.AuraNdaViewModel.UiState r89, X.G0U<? super java.lang.String, kotlin.Unit> r90, X.G0U<? super java.lang.String, kotlin.Unit> r91, kotlin.jvm.functions.Function0<kotlin.Unit> r92, kotlin.jvm.functions.Function0<kotlin.Unit> r93, kotlin.jvm.functions.Function0<kotlin.Unit> r94, boolean r95, com.facebook.aura.activation.data.HatchUpsellCell r96, X.G0V<? super com.facebook.aura.user.provider.AgeCheckMethod, ? super java.lang.Integer, kotlin.Unit> r97, X.G0U<? super java.lang.Boolean, kotlin.Unit> r98, kotlin.jvm.functions.Function0<kotlin.Unit> r99, kotlin.jvm.functions.Function0<kotlin.Unit> r100, kotlin.jvm.functions.Function0<kotlin.Unit> r101, X.BRg r102, java.lang.String r103, boolean r104, java.lang.String r105, boolean r106, boolean r107, com.facebook.aura.activation.data.HatchTosMetadata r108, kotlin.jvm.functions.Function0<kotlin.Unit> r109, kotlin.jvm.functions.Function0<kotlin.Unit> r110, kotlin.jvm.functions.Function0<kotlin.Unit> r111, kotlin.jvm.functions.Function0<kotlin.Unit> r112, kotlin.jvm.functions.Function0<kotlin.Unit> r113, com.facebook.aura.activation.model.AuraActivationViewModel.UiState r114, X.C20Q<? extends com.facebook.aura.activation.model.AuraActivationViewModel.ViewEffect> r115, kotlin.jvm.functions.Function0<kotlin.Unit> r116, com.facebook.aura.activation.model.AuraInviteCodeViewModel.UiState r117, X.G0U<? super java.lang.String, kotlin.Unit> r118, kotlin.jvm.functions.Function0<kotlin.Unit> r119, kotlin.jvm.functions.Function0<kotlin.Unit> r120, X.G0V<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> r121, X.BFM r122, int r123, int r124, int r125, int r126, int r127, int r128) {
        /*
            Method dump skipped, instructions count: 2530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraActivationScreenKt.AuraActivationScreen(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.facebook.aura.activation.model.AuraNdaViewModel$UiState, X.G0U, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, com.facebook.aura.activation.data.HatchUpsellCell, X.G0V, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, java.lang.String, boolean, java.lang.String, boolean, boolean, com.facebook.aura.activation.data.HatchTosMetadata, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.facebook.aura.activation.model.AuraActivationViewModel$UiState, X.20Q, kotlin.jvm.functions.Function0, com.facebook.aura.activation.model.AuraInviteCodeViewModel$UiState, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0V, X.BFM, int, int, int, int, int, int):void");
    }
}
