package com.facebook.aura.assist;

import X.AGE;
import X.AGF;
import X.AKH;
import X.AKJ;
import X.AKT;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.Ap7;
import X.B1V;
import X.BA9;
import X.BFM;
import X.BJt;
import X.C06H;
import X.C1971Avc;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C3cI;
import X.C5303Dfm;
import X.C7384Etj;
import X.C78N;
import X.CFK;
import X.EnumC10573Huf;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC7353EnQ;
import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchClickPoint;
import com.facebook.aura.analytics.hatch.HatchEventSubtype;
import com.facebook.aura.assist.HatchVoiceInteractionSession;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.commands.core.NodePermissionActivity;
import com.facebook.aura.commands.core.NodePermissionActivityKt;
import com.facebook.aura.conversation.constants.HatchConversationConstants;
import com.facebook.aura.conversation.repo.HatchPrimaryConversationRepository;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.LocalResultEventBus;
import com.facebook.aura.navigation.ResultEventBus;
import com.facebook.aura.navigation.ResultEventBusKt;
import com.facebook.aura.navigation.key.AgentComputerScreenKey;
import com.facebook.aura.navigation.key.AgentPermissionDecisionSheetKey;
import com.facebook.aura.navigation.key.AgentPermissionMessageEditorScreenKey;
import com.facebook.aura.navigation.key.AgentPermissionTaskDetailsSheetKey;
import com.facebook.aura.navigation.key.CheckoutInfoSheetKey;
import com.facebook.aura.navigation.key.CheckoutLodgingPolicySheetKey;
import com.facebook.aura.navigation.key.CheckoutPayWithLinkSheetKey;
import com.facebook.aura.navigation.key.CheckoutWalletSheetKey;
import com.facebook.aura.navigation.key.DeliveryCheckoutStopSheetKey;
import com.facebook.aura.navigation.key.FlightCheckoutLegSheetKey;
import com.facebook.aura.navigation.key.FlightCheckoutSummarySheetKey;
import com.facebook.aura.navigation.key.ModelLockSupportSheetKey;
import com.facebook.aura.navigation.key.RemoteBrowserScreenKey;
import com.facebook.aura.navigation.key.ReservationCheckoutDetailsSheetKey;
import com.facebook.aura.navigation.key.ShopifyCheckoutCartSheetKey;
import com.facebook.aura.navigation.key.ShopifyCheckoutSummarySheetKey;
import com.facebook.aura.notification.model.HatchChatLocalNotificationConfig;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.startup.AuraStartupOrchestrator;
import com.facebook.aura.ui.adaptive.AuraAdaptiveInfoKt;
import com.facebook.aura.vds.compose.theme.root.AuraRootKt;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchAssistOverlayActivity extends ComponentActivity {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchAssistOverlayActivity";
    public String assistSessionId;
    public final MutableState<AssistIdentityState> identityState;
    public long invocationToken;
    public BJt invocationViewModelStore;
    public final MutableState<Boolean> isAwaitingUnlock;
    public boolean isUnlockRequested;
    public final AuraNavigator overlayNavigator;
    public final MutableState<HatchAssistOverlayViewModel> overlayViewModelState;
    public HatchChatLocalNotificationConfig.ActiveChatScreen ownActiveChatScreen;
    public HatchChatLocalNotificationConfig.ActiveChatScreen savedActiveChatScreen;
    public AbstractC3358CGz userSession;

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayActivity$onCreate$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {

        /* renamed from: com.facebook.aura.assist.HatchAssistOverlayActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00381 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ C1BO<Boolean> $isStartupComplete$delegate;
            public final /* synthetic */ HatchAssistOverlayViewModel $overlayViewModel;
            public final /* synthetic */ HatchAssistOverlayActivity this$0;

            /* renamed from: com.facebook.aura.assist.HatchAssistOverlayActivity$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00391 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
                public final /* synthetic */ C1BO<Boolean> $isStartupComplete$delegate;
                public final /* synthetic */ HatchAssistOverlayViewModel $overlayViewModel;
                public final /* synthetic */ HatchAssistOverlayActivity this$0;

                /* renamed from: com.facebook.aura.assist.HatchAssistOverlayActivity$onCreate$1$1$1$2, reason: invalid class name */
                public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
                    public final /* synthetic */ HatchAssistOverlayViewModel $overlayViewModel;
                    public final /* synthetic */ HatchAssistOverlayActivity this$0;

                    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayActivity$onCreate$1$1$1$2$1, reason: invalid class name and collision with other inner class name */
                    public final class C00401 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
                        public final /* synthetic */ HatchAssistOverlayViewModel $overlayViewModel;
                        public final /* synthetic */ HatchAssistOverlayActivity this$0;

                        /* renamed from: com.facebook.aura.assist.HatchAssistOverlayActivity$onCreate$1$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
                        public final class C00411 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
                            public final /* synthetic */ HatchAssistOverlayViewModel $overlayViewModel;
                            public final /* synthetic */ HatchAssistOverlayActivity this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C00411(HatchAssistOverlayViewModel hatchAssistOverlayViewModel, HatchAssistOverlayActivity hatchAssistOverlayActivity) {
                                super(2);
                                this.$overlayViewModel = hatchAssistOverlayViewModel;
                                this.this$0 = hatchAssistOverlayActivity;
                            }

                            @Override // X.G0V
                            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                                invoke(bfm, AnonymousClass001.A0F(num));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BFM bfm, int i) {
                                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                                    HatchAssistOverlayViewModel hatchAssistOverlayViewModel = this.$overlayViewModel;
                                    HatchAssistOverlayActivity hatchAssistOverlayActivity = this.this$0;
                                    String strAssistSideChatSessionIdOrNull = hatchAssistOverlayActivity.assistSideChatSessionIdOrNull();
                                    boolean zA67 = bfm.A67(hatchAssistOverlayActivity);
                                    HatchAssistOverlayActivity hatchAssistOverlayActivity2 = this.this$0;
                                    Object objAaT = bfm.AaT();
                                    if (zA67 || objAaT == C78N.A00) {
                                        objAaT = new HatchAssistOverlayActivity$onCreate$1$1$1$2$1$1$1$1(hatchAssistOverlayActivity2);
                                        bfm.Ai0(objAaT);
                                    }
                                    Function0 function0 = (Function0) objAaT;
                                    Object obj = this.this$0;
                                    boolean zA672 = bfm.A67(obj);
                                    Object objAaT2 = bfm.AaT();
                                    if (zA672 || objAaT2 == C78N.A00) {
                                        objAaT2 = new HatchAssistOverlayActivity$onCreate$1$1$1$2$1$1$2$1(obj);
                                        bfm.Ai0(objAaT2);
                                    }
                                    Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT2);
                                    Object obj2 = this.this$0;
                                    boolean zA673 = bfm.A67(obj2);
                                    Object objAaT3 = bfm.AaT();
                                    if (zA673 || objAaT3 == C78N.A00) {
                                        objAaT3 = new HatchAssistOverlayActivity$onCreate$1$1$1$2$1$1$3$1(obj2);
                                        bfm.Ai0(objAaT3);
                                    }
                                    HatchAssistInvocationContentKt.HatchAssistInvocationContent(hatchAssistOverlayViewModel, strAssistSideChatSessionIdOrNull, function0, function02, (G0V) ((InterfaceC7353EnQ) objAaT3), null, bfm, HatchAssistOverlayViewModel.$stable, 32);
                                    return;
                                }
                                bfm.Afo();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00401(HatchAssistOverlayViewModel hatchAssistOverlayViewModel, HatchAssistOverlayActivity hatchAssistOverlayActivity) {
                            super(2);
                            this.$overlayViewModel = hatchAssistOverlayViewModel;
                            this.this$0 = hatchAssistOverlayActivity;
                        }

                        @Override // X.G0V
                        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                            invoke(bfm, AnonymousClass001.A0F(num));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BFM bfm, int i) {
                            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                                AssistCameraHostKt.AssistCameraHost(null, B1V.A00(bfm, new C00411(this.$overlayViewModel, this.this$0), 837447651), bfm, 48, 1);
                            } else {
                                bfm.Afo();
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(HatchAssistOverlayActivity hatchAssistOverlayActivity, HatchAssistOverlayViewModel hatchAssistOverlayViewModel) {
                        super(2);
                        this.this$0 = hatchAssistOverlayActivity;
                        this.$overlayViewModel = hatchAssistOverlayViewModel;
                    }

                    @Override // X.G0V
                    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                        invoke(bfm, AnonymousClass001.A0F(num));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BFM bfm, int i) {
                        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                            bfm.Ag8(19085428, Long.valueOf(this.this$0.invocationToken));
                            AKT.A01(bfm, LocalResultEventBus.INSTANCE.provides(ResultEventBusKt.rememberResultEventBus(bfm, 0)), B1V.A00(bfm, new C00401(this.$overlayViewModel, this.this$0), 532633183), ResultEventBus.$stable | 8 | 48);
                            AnonymousClass001.A1D(bfm);
                            return;
                        }
                        bfm.Afo();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00391(HatchAssistOverlayViewModel hatchAssistOverlayViewModel, HatchAssistOverlayActivity hatchAssistOverlayActivity, C1BO<Boolean> c1bo) {
                    super(2);
                    this.$overlayViewModel = hatchAssistOverlayViewModel;
                    this.this$0 = hatchAssistOverlayActivity;
                    this.$isStartupComplete$delegate = c1bo;
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                    invoke(bfm, AnonymousClass001.A0F(num));
                    return Unit.INSTANCE;
                }

                public final void invoke(BFM bfm, int i) {
                    if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                        if (C1BO.A0F(this.$isStartupComplete$delegate) && this.$overlayViewModel != null) {
                            AnonymousClass003.A0l(bfm, 372030256);
                            AKH<AbstractC3358CGz> akh = LocalUserSessionKt.LocalUserSession;
                            HatchAssistOverlayActivity hatchAssistOverlayActivity = this.this$0;
                            AbstractC3358CGz abstractC3358CGz = hatchAssistOverlayActivity.userSession;
                            if (abstractC3358CGz == null) {
                                C7384Etj.A0b("userSession");
                                throw F60.createAndThrow();
                            }
                            AnonymousClass003.A0p(bfm, new AnonymousClass2(this.this$0, this.$overlayViewModel), new AKJ[]{akh.A04(abstractC3358CGz), LocalUserSessionKt.LocalUserSessionOrNull.A04(abstractC3358CGz), AuraNavigatorKt.LocalNavigator.A04(hatchAssistOverlayActivity.overlayNavigator), AssistIdentityStateKt.LocalAssistIdentityState.A04(hatchAssistOverlayActivity.identityState.getValue())}, -1796626190);
                            return;
                        }
                        bfm.AgE(371923585);
                        boolean zA67 = bfm.A67(this.this$0);
                        HatchAssistOverlayActivity hatchAssistOverlayActivity2 = this.this$0;
                        Object objAaT = bfm.AaT();
                        if (zA67 || objAaT == C78N.A00) {
                            objAaT = new HatchAssistOverlayActivity$onCreate$1$1$1$1$1(hatchAssistOverlayActivity2);
                            bfm.Ai0(objAaT);
                        }
                        HatchAssistLoadingScreenKt.HatchAssistLoadingScreen((Function0) objAaT, null, bfm, 0, 2);
                        AnonymousClass001.A1D(bfm);
                        return;
                    }
                    bfm.Afo();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00381(HatchAssistOverlayViewModel hatchAssistOverlayViewModel, HatchAssistOverlayActivity hatchAssistOverlayActivity, C1BO<Boolean> c1bo) {
                super(2);
                this.$overlayViewModel = hatchAssistOverlayViewModel;
                this.this$0 = hatchAssistOverlayActivity;
                this.$isStartupComplete$delegate = c1bo;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    AuraRootKt.AuraRoot(null, null, B1V.A00(bfm, new C00391(this.$overlayViewModel, this.this$0, this.$isStartupComplete$delegate), 900642226), bfm, 384, 3);
                } else {
                    bfm.Afo();
                }
            }
        }

        public AnonymousClass1() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                if (!MutableState.A0A((MutableState) HatchAssistOverlayActivity.this.isAwaitingUnlock)) {
                    AuraAdaptiveInfoKt.ProvideAuraAdaptiveInfo(B1V.A00(bfm, new C00381(HatchAssistOverlayActivity.this.overlayViewModelState.getValue(), HatchAssistOverlayActivity.this, C2CK.A02(bfm, AuraStartupOrchestrator.isUiBlockingReady)), 723660070), bfm, 6);
                    return;
                }
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayActivity$requestPermissionThenRun$1, reason: invalid class name and case insensitive filesystem */
    public final class C109581 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
        public final /* synthetic */ Function0<Unit> $onGranted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109581(Function0<Unit> function0) {
            super(1);
            this.$onGranted = function0;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(AnonymousClass001.A1X(bool));
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                this.$onGranted.invoke();
            }
        }
    }

    private final void activateOverlay() {
        AnonymousClass004.A1D(true, AuraAppLifecycleManager._isAssistOverlayActive);
        C3cI.A0A(this).setActivityVisible(true);
        if (C3cI.A0A(this).isParked()) {
            C3cI.A0A(this).restore();
        }
        HatchVoiceInteractionSession.Companion.showIdentity$fbandroid_express_aura_java_com_facebook_aura_assist_assist(this.invocationToken, C3cI.A0A(this), this);
        HatchAssistOverlayViewModel value = this.overlayViewModelState.getValue();
        if (value != null) {
            value.onSessionShown(!getIntent().getBooleanExtra(HatchAssistOverlayActivityKt.EXTRA_RESTORE_ASSIST_VOICE, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUnlocked() {
        setShowWhenLocked(false);
        this.isUnlockRequested = false;
        MutableState.A09(false, this.isAwaitingUnlock);
        if (((C5303Dfm) getLifecycle()).A01.A00(EnumC10573Huf.A05)) {
            activateOverlay();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        C7384Etj.A0Y(intent, 0);
        super.onNewIntent(intent);
        setIntent(intent);
        if (intent.getBooleanExtra(HatchAssistOverlayActivityKt.EXTRA_RESTORE_ASSIST_VOICE, false) && intent.getLongExtra(HatchAssistOverlayActivityKt.EXTRA_ASSIST_INVOCATION_TOKEN, 0L) == this.invocationToken) {
            return;
        }
        if (startAuthenticatedInvocation(intent)) {
            dismissKeyguardIfLocked();
        } else {
            HatchVoiceInteractionSession.Companion.launchFullApp(this, null, false);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        AnonymousClass004.A1D(false, AuraAppLifecycleManager._isAssistOverlayActive);
        C3cI.A0A(this).setActivityVisible(false);
        HatchAssistOverlayViewModel value = this.overlayViewModelState.getValue();
        if (value != null) {
            value.endVoiceDictation();
        }
        super.onPause();
    }

    public final void parkVoiceControls$fbandroid_express_aura_java_com_facebook_aura_assist_assist() {
        if (moveTaskToBack(true)) {
            return;
        }
        C3cI.A0A(this).restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String assistSideChatSessionIdOrNull() {
        String str = this.assistSessionId;
        if (HatchConversationConstants.ASSIST_CONVERSATION_SESSION_ID.equals(str)) {
            return null;
        }
        return str;
    }

    private final void clearConversation() {
        HatchAssistOverlayViewModel value = this.overlayViewModelState.getValue();
        if (value != null) {
            value.onSessionHidden();
        }
        this.overlayViewModelState.Af8(null);
        BJt bJt = this.invocationViewModelStore;
        if (bJt != null) {
            bJt.A00();
        }
        this.invocationViewModelStore = null;
        restoreActiveChatScreen();
    }

    private final void clearInvocation() {
        HatchVoiceInteractionSession.Companion.clearIdentity$fbandroid_express_aura_java_com_facebook_aura_assist_assist(this.invocationToken, this);
        clearConversation();
    }

    private final void dismissKeyguardIfLocked() {
        KeyguardManager keyguardManager;
        if (MutableState.A0A((MutableState) this.isAwaitingUnlock) || (keyguardManager = (KeyguardManager) getSystemService(KeyguardManager.class)) == null || !keyguardManager.isKeyguardLocked()) {
            return;
        }
        MutableState.A09(true, this.isAwaitingUnlock);
        setShowWhenLocked(true);
        if (hasWindowFocus()) {
            requestUnlock();
        }
    }

    private final AbstractC3358CGz getAuthenticatedUserSession() {
        AuraUserSessionStore auraUserSessionStore = AuraUserSessionStore.INSTANCE;
        if (auraUserSessionStore.isCurrentUserAuthenticated()) {
            return auraUserSessionStore.getInstance().A00();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestPermissionThenRun(String str, Function0<Unit> function0) {
        G0U<? super Boolean, Unit> g0u = NodePermissionActivity.onFinished;
        NodePermissionActivity.onFinished = new C109581(function0);
        Intent intent = new Intent(this, (Class<?>) NodePermissionActivity.class);
        intent.putExtra(NodePermissionActivityKt.EXTRA_PERMISSIONS, new String[]{str});
        intent.addFlags(268959744);
        try {
            startActivity(intent);
        } catch (Exception e) {
            CFK.A08(TAG, "Failed to launch permission activity", e);
            NodePermissionActivity.onFinished = null;
        }
    }

    private final void requestUnlock() {
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService(KeyguardManager.class);
        if (keyguardManager != null) {
            this.isUnlockRequested = true;
            keyguardManager.requestDismissKeyguard(this, new KeyguardManager.KeyguardDismissCallback() { // from class: com.facebook.aura.assist.HatchAssistOverlayActivity.requestUnlock.1
                @Override // android.app.KeyguardManager.KeyguardDismissCallback
                public void onDismissCancelled() {
                    HatchAssistOverlayActivity.this.finish();
                }

                @Override // android.app.KeyguardManager.KeyguardDismissCallback
                public void onDismissError() {
                    HatchAssistOverlayActivity.this.finish();
                }

                @Override // android.app.KeyguardManager.KeyguardDismissCallback
                public void onDismissSucceeded() {
                    HatchAssistOverlayActivity.this.onUnlocked();
                }
            });
        }
    }

    private final void restoreActiveChatScreen() {
        HatchChatLocalNotificationConfig.ActiveChatScreen activeChatScreen = this.ownActiveChatScreen;
        if (activeChatScreen != null) {
            this.ownActiveChatScreen = null;
            HatchChatLocalNotificationConfig.Companion companion = HatchChatLocalNotificationConfig.Companion;
            if (HatchChatLocalNotificationConfig.activeChatScreen == activeChatScreen) {
                companion.setActiveChatScreen(this.savedActiveChatScreen);
            }
            this.savedActiveChatScreen = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void startConversation() {
        /*
            r11 = this;
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$Companion r1 = com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.Companion
            r7 = r11
            X.CGz r0 = r11.userSession
            java.lang.String r5 = "userSession"
            if (r0 != 0) goto L11
            X.C7384Etj.A0b(r5)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L11:
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r2 = r1.getInstance(r0)
            boolean r0 = X.C3cH.A1P(r2)
            if (r0 != 0) goto L55
            X.1BN<java.lang.Long> r0 = r2.pendingCallStart
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L55
            r1 = 0
            com.facebook.aura.utils.HatchDefaultAssistantUtils r0 = com.facebook.aura.utils.HatchDefaultAssistantUtils.INSTANCE
            boolean r0 = r0.isSideChatForDefaultAssistantEnabled()
            r11 = 1
            if (r0 != 0) goto L2e
        L2d:
            r11 = 0
        L2e:
            java.lang.String r9 = "assist_session_id"
            if (r1 == 0) goto L4e
            java.lang.String r0 = X.C3cG.A0c(r2)
            if (r0 == 0) goto L39
            r9 = r0
        L39:
            r7.assistSessionId = r9
            X.BJt r4 = new X.BJt
            r4.<init>()
            r7.invocationViewModelStore = r4
            X.CGz r8 = r7.userSession
            if (r8 != 0) goto L57
            X.C7384Etj.A0b(r5)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L4e:
            if (r11 == 0) goto L39
            java.lang.String r9 = X.AnonymousClass002.A0k()
            goto L39
        L55:
            r1 = 1
            goto L2d
        L57:
            r10 = 1
            com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$Factory r6 = new com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$Factory
            r6.<init>(r7, r8, r9, r10, r11)
            X.A6K r3 = X.A6K.A00
            X.BON r1 = new X.BON
            r1.<init>(r6, r4, r3)
            java.lang.Class<com.facebook.aura.conversation.viewmodel.HatchConversationViewModel> r0 = com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.class
            X.A6i r0 = X.C3cG.A0x(r0)
            X.AEs r2 = r1.A02(r0)
            com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r2 = (com.facebook.aura.conversation.viewmodel.HatchConversationViewModel) r2
            X.CGz r1 = r7.userSession
            if (r1 != 0) goto L7c
            X.C7384Etj.A0b(r5)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L7c:
            com.facebook.aura.assist.HatchAssistOverlayViewModel$Factory r0 = new com.facebook.aura.assist.HatchAssistOverlayViewModel$Factory
            r0.<init>(r7, r1, r2)
            X.BON r1 = new X.BON
            r1.<init>(r0, r4, r3)
            java.lang.Class<com.facebook.aura.assist.HatchAssistOverlayViewModel> r0 = com.facebook.aura.assist.HatchAssistOverlayViewModel.class
            X.A6i r0 = X.C3cG.A0x(r0)
            X.AEs r1 = r1.A02(r0)
            java.lang.String r0 = r7.assistSessionId
            r7.suppressAssistChatNotifications(r0)
            androidx.compose.runtime.MutableState<com.facebook.aura.assist.HatchAssistOverlayViewModel> r0 = r7.overlayViewModelState
            r0.Af8(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.HatchAssistOverlayActivity.startConversation():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void startInvocation(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r2 = "com.facebook.aura.extra.ASSIST_INVOCATION_TOKEN"
            r0 = 0
            long r1 = r8.getLongExtra(r2, r0)
            java.lang.String r0 = "com.facebook.aura.extra.RESTORE_ASSIST_VOICE"
            r6 = 0
            boolean r0 = r8.getBooleanExtra(r0, r6)
            if (r0 == 0) goto L53
            com.facebook.aura.assist.HatchVoiceInteractionSession$Companion r0 = com.facebook.aura.assist.HatchVoiceInteractionSession.Companion
            com.facebook.aura.assist.AssistIdentityState r5 = r0.retainedIdentity$fbandroid_express_aura_java_com_facebook_aura_assist_assist(r1)
            if (r5 == 0) goto L54
            r7.clearConversation()
        L1c:
            androidx.compose.runtime.MutableState<com.facebook.aura.assist.AssistIdentityState> r4 = r7.identityState
            if (r5 != 0) goto L25
            com.facebook.aura.assist.AssistIdentityState r5 = new com.facebook.aura.assist.AssistIdentityState
            r5.<init>()
        L25:
            boolean r0 = r7.isFinishing()
            if (r0 != 0) goto L3c
            X.F2N r0 = r7.getLifecycle()
            X.Dfm r0 = (X.C5303Dfm) r0
            X.Huf r3 = r0.A01
            X.Huf r0 = X.EnumC10573Huf.A05
            boolean r0 = r3.A00(r0)
            if (r0 == 0) goto L3c
            r6 = 1
        L3c:
            r5.setActivityVisible(r6)
            r4.Af8(r5)
            r7.invocationToken = r1
            r7.startConversation()
            com.facebook.aura.assist.HatchVoiceInteractionSession$Companion r3 = com.facebook.aura.assist.HatchVoiceInteractionSession.Companion
            long r1 = r7.invocationToken
            com.facebook.aura.assist.AssistIdentityState r0 = X.C3cI.A0A(r7)
            r3.showIdentity$fbandroid_express_aura_java_com_facebook_aura_assist_assist(r1, r0, r7)
            return
        L53:
            r5 = 0
        L54:
            r7.clearInvocation()
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.HatchAssistOverlayActivity.startInvocation(android.content.Intent):void");
    }

    private final void suppressAssistChatNotifications(String str) {
        HatchChatLocalNotificationConfig.Companion companion = HatchChatLocalNotificationConfig.Companion;
        this.savedActiveChatScreen = HatchChatLocalNotificationConfig.activeChatScreen;
        boolean zEquals = HatchConversationConstants.ASSIST_CONVERSATION_SESSION_ID.equals(str);
        boolean z = !zEquals;
        if (zEquals) {
            str = null;
        }
        HatchChatLocalNotificationConfig.ActiveChatScreen activeChatScreen = new HatchChatLocalNotificationConfig.ActiveChatScreen(str, z);
        this.ownActiveChatScreen = activeChatScreen;
        companion.setActiveChatScreen(activeChatScreen);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (HatchVoiceInteractionSession.Companion.detachIdentity$fbandroid_express_aura_java_com_facebook_aura_assist_assist(this.invocationToken, this)) {
            clearConversation();
        } else {
            clearInvocation();
            HatchAssistContextHolder.INSTANCE.clearIfCurrent(this.invocationToken);
        }
        super.onDestroy();
    }

    public final void onInvokedAgain$fbandroid_express_aura_java_com_facebook_aura_assist_assist() {
        HatchAssistOverlayViewModel value = this.overlayViewModelState.getValue();
        if (value != null) {
            value.onInvokedAgain();
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchAssistOverlayActivity() {
        AGE ageA01 = AGF.A01();
        this.overlayViewModelState = C3cG.A08(ageA01, null);
        this.identityState = C3cG.A08(ageA01, new AssistIdentityState());
        this.isAwaitingUnlock = C3cG.A08(ageA01, AnonymousClass001.A0h());
        this.assistSessionId = HatchConversationConstants.ASSIST_CONVERSATION_SESSION_ID;
        this.overlayNavigator = new AuraNavigator() { // from class: com.facebook.aura.assist.HatchAssistOverlayActivity$overlayNavigator$1
            public final /* synthetic */ NoOpAssistNavigator $$delegate_0 = NoOpAssistNavigator.INSTANCE;

            @Override // com.facebook.aura.navigation.AuraNavigator
            public void addBeforeBackStackChangeListener(Function0<Unit> function0) {
                C7384Etj.A0Y(function0, 0);
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public boolean isInBackStack(G0U<? super AuraNavKey, Boolean> g0u) {
                C7384Etj.A0Y(g0u, 0);
                return this.$$delegate_0.isInBackStack(g0u);
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public void navigate(AuraNavKey auraNavKey, boolean z) {
                C7384Etj.A0Y(auraNavKey, 0);
                routeOrIgnore(auraNavKey);
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public void popAll(G0U<? super AuraNavKey, Boolean> g0u) {
                C7384Etj.A0Y(g0u, 0);
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public void popTabSubstack(AuraTabRootNavKey auraTabRootNavKey, AuraTabRootNavKey auraTabRootNavKey2) {
                C7384Etj.A0Y(auraTabRootNavKey, 0);
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public void popToTabRoot(AuraTabRootNavKey auraTabRootNavKey) {
                C7384Etj.A0Y(auraTabRootNavKey, 0);
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public void removeBeforeBackStackChangeListener(Function0<Unit> function0) {
                C7384Etj.A0Y(function0, 0);
            }

            private final void routeOrIgnore(AuraNavKey auraNavKey) {
                HatchConversationViewModel hatchConversationViewModel;
                if ((auraNavKey instanceof AgentPermissionDecisionSheetKey) || (auraNavKey instanceof AgentPermissionMessageEditorScreenKey) || (auraNavKey instanceof AgentPermissionTaskDetailsSheetKey) || (auraNavKey instanceof AgentComputerScreenKey) || (auraNavKey instanceof RemoteBrowserScreenKey) || (auraNavKey instanceof CheckoutInfoSheetKey) || (auraNavKey instanceof CheckoutLodgingPolicySheetKey) || (auraNavKey instanceof CheckoutPayWithLinkSheetKey) || (auraNavKey instanceof CheckoutWalletSheetKey) || (auraNavKey instanceof DeliveryCheckoutStopSheetKey) || (auraNavKey instanceof FlightCheckoutLegSheetKey) || (auraNavKey instanceof FlightCheckoutSummarySheetKey) || (auraNavKey instanceof ModelLockSupportSheetKey) || (auraNavKey instanceof ReservationCheckoutDetailsSheetKey) || (auraNavKey instanceof ShopifyCheckoutCartSheetKey) || (auraNavKey instanceof ShopifyCheckoutSummarySheetKey)) {
                    HatchVoiceInteractionSession.Companion companion = HatchVoiceInteractionSession.Companion;
                    HatchAssistOverlayActivity hatchAssistOverlayActivity = this.this$0;
                    String strAssistSideChatSessionIdOrNull = hatchAssistOverlayActivity.assistSideChatSessionIdOrNull();
                    HatchAssistOverlayViewModel value = hatchAssistOverlayActivity.overlayViewModelState.getValue();
                    boolean z = false;
                    if (value != null && (hatchConversationViewModel = value.conversationViewModel) != null && hatchConversationViewModel.isUnsentNewThread()) {
                        z = true;
                    }
                    companion.launchFullApp(hatchAssistOverlayActivity, strAssistSideChatSessionIdOrNull, z);
                    this.this$0.finish();
                }
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public boolean back() {
                return this.$$delegate_0.back();
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public AuraNavKey currentKey(boolean z) {
                return this.$$delegate_0.currentKey(z);
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public AuraTabRootNavKey currentTabRoot() {
                return this.$$delegate_0.currentTabRoot();
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public void dismissBottomSheetStack(int i) {
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public void popLast(int i) {
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public void popToRoot() {
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public void navigateWithContext(AuraNavKey auraNavKey, HatchClickPoint hatchClickPoint, HatchEventSubtype hatchEventSubtype, LaunchFlag launchFlag) {
                AnonymousClass005.A0y(auraNavKey, hatchClickPoint, launchFlag);
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public void reconcileTabs(Set<? extends AuraTabRootNavKey> set, G0U<? super AuraTabRootNavKey, Boolean> g0u) {
                AnonymousClass003.A0u(set, g0u);
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public boolean isInBackStack(AuraNavKey auraNavKey) {
                C7384Etj.A0Y(auraNavKey, 0);
                return this.$$delegate_0.isInBackStack(auraNavKey);
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public void navigate(AuraNavKey auraNavKey, LaunchFlag launchFlag) {
                C7384Etj.A0Y(auraNavKey, 0);
                routeOrIgnore(auraNavKey);
            }

            @Override // com.facebook.aura.navigation.AuraNavigator
            public void popAll(Collection<? extends AuraNavKey> collection) {
                C7384Etj.A0Y(collection, 0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void collapseVoice() {
        C3cI.A0A(this).collapse();
    }

    private final boolean startAuthenticatedInvocation(Intent intent) {
        AbstractC3358CGz authenticatedUserSession = getAuthenticatedUserSession();
        if (authenticatedUserSession == null) {
            return false;
        }
        this.userSession = authenticatedUserSession;
        HatchGatewayServiceManager.INSTANCE.initialize(this, authenticatedUserSession);
        HatchPrimaryConversationRepository.Companion.getInstance(this, authenticatedUserSession).repository.connectIfDisconnected(false);
        startInvocation(intent);
        return true;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BA9.A00(getWindow(), false);
        super.onCreate(bundle);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(134217728);
        getWindow().setNavigationBarColor(0);
        new C1971Avc(getWindow().getDecorView(), getWindow()).A00(false);
        getWindow().setNavigationBarContrastEnforced(false);
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, 0, 0, 0);
            overrideActivityTransition(1, 0, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
        Intent intent = getIntent();
        C7384Etj.A0U(intent);
        if (startAuthenticatedInvocation(intent)) {
            dismissKeyguardIfLocked();
            Ap7.A00(this, B1V.A01(new AnonymousClass1(), -786920439, true));
        } else {
            CFK.A06(TAG, "onCreate: no authenticated session, falling back to full app");
            HatchVoiceInteractionSession.Companion.launchFullApp(this, null, false);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);
        if (MutableState.A0A((MutableState) this.isAwaitingUnlock)) {
            return;
        }
        activateOverlay();
    }

    @Override // android.app.Activity
    public void onTopResumedActivityChanged(boolean z) {
        super.onTopResumedActivityChanged(z);
        AuraAppLifecycleManager.INSTANCE.markTopResumedActivity(System.identityHashCode(this), z, isInPictureInPictureMode());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && MutableState.A0A((MutableState) this.isAwaitingUnlock) && !this.isUnlockRequested) {
            requestUnlock();
        }
    }

    public final void resetAfterVoiceCall$fbandroid_express_aura_java_com_facebook_aura_assist_assist() {
        HatchAssistOverlayViewModel value;
        AssistIdentityState assistIdentityStateA0A = C3cI.A0A(this);
        if (MutableState.A0A(assistIdentityStateA0A.activityVisible$delegate) && assistIdentityStateA0A.getPhase() == AssistIdentityPhase.EXPANDED) {
            clearConversation();
            HatchAssistContextHolder.INSTANCE.clearIfCurrent(this.invocationToken);
            startConversation();
        } else {
            Intent intentPutExtra = new Intent(this, (Class<?>) HatchAssistOverlayActivity.class).putExtra(HatchAssistOverlayActivityKt.EXTRA_ASSIST_INVOCATION_TOKEN, HatchAssistContextHolder.INSTANCE.beginInvocation());
            C7384Etj.A0U(intentPutExtra);
            setIntent(intentPutExtra);
            startInvocation(intentPutExtra);
        }
        if (MutableState.A0A((MutableState) this.isAwaitingUnlock) || (value = this.overlayViewModelState.getValue()) == null) {
            return;
        }
        value.onSessionShown(false);
    }
}
