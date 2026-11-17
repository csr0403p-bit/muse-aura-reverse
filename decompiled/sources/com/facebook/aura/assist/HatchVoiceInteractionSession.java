package com.facebook.aura.assist;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C06H;
import X.C7384Etj;
import X.CFK;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Region;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.utils.HatchDefaultAssistantUtils;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVoiceInteractionSession extends VoiceInteractionSession {
    public static final int $stable = 8;
    public static final String AURA_MAIN_ACTIVITY_CLASS_NAME = "com.facebook.aura.main.AuraMainActivity";
    public static final Companion Companion = new Companion();
    public static final String SHOW_IDENTITY = "show_assist_identity";
    public static final String TAG = "HatchVoiceInteraction";
    public static WeakReference<HatchVoiceInteractionSession> activeSession;
    public final HatchVoiceInteractionSessionService appContext;
    public HatchAssistOverlayActivity controlsActivity;
    public AssistIdentityHost identityHost;
    public long invocationToken;
    public boolean overlayShowing;

    public final class Companion {
        public final void clearIdentity$fbandroid_express_aura_java_com_facebook_aura_assist_assist(long j, HatchAssistOverlayActivity hatchAssistOverlayActivity) {
            HatchVoiceInteractionSession hatchVoiceInteractionSession;
            AssistIdentityHost assistIdentityHost;
            C7384Etj.A0Y(hatchAssistOverlayActivity, 1);
            WeakReference<HatchVoiceInteractionSession> weakReference = HatchVoiceInteractionSession.activeSession;
            if (weakReference == null || (hatchVoiceInteractionSession = weakReference.get()) == null || (assistIdentityHost = hatchVoiceInteractionSession.identityHost) == null || assistIdentityHost.token != j || hatchVoiceInteractionSession.controlsActivity != hatchAssistOverlayActivity) {
                return;
            }
            hatchVoiceInteractionSession.clearIdentityHost();
            hatchVoiceInteractionSession.setUiEnabled(false);
        }

        public final boolean detachIdentity$fbandroid_express_aura_java_com_facebook_aura_assist_assist(long j, HatchAssistOverlayActivity hatchAssistOverlayActivity) {
            HatchVoiceInteractionSession hatchVoiceInteractionSession;
            AssistIdentityHost assistIdentityHost;
            C7384Etj.A0Y(hatchAssistOverlayActivity, 1);
            WeakReference<HatchVoiceInteractionSession> weakReference = HatchVoiceInteractionSession.activeSession;
            if (weakReference == null || (hatchVoiceInteractionSession = weakReference.get()) == null || (assistIdentityHost = hatchVoiceInteractionSession.identityHost) == null || assistIdentityHost.token != j || hatchVoiceInteractionSession.controlsActivity != hatchAssistOverlayActivity || !assistIdentityHost.isCallActive() || !assistIdentityHost.state.isParked()) {
                return false;
            }
            hatchVoiceInteractionSession.controlsActivity = null;
            assistIdentityHost.state.detachPresentation();
            return true;
        }

        public final void launchFullApp(Context context, String str, boolean z) {
            C7384Etj.A0Y(context, 0);
            Intent intentAddFlags = new Intent("com.facebook.aura.action.ASSIST").setClassName(context, "com.facebook.aura.main.AuraMainActivity").addFlags(872415232);
            if (str != null) {
                intentAddFlags.putExtra(HatchDefaultAssistantUtils.EXTRA_ASSIST_SIDE_CHAT_SESSION_ID, str);
                if (z) {
                    intentAddFlags.putExtra(HatchDefaultAssistantUtils.EXTRA_ASSIST_SIDE_CHAT_IS_NEW, true);
                }
            }
            C7384Etj.A0U(intentAddFlags);
            try {
                context.startActivity(intentAddFlags);
            } catch (RuntimeException e) {
                CFK.A08(HatchVoiceInteractionSession.TAG, "Failed to launch Hatch from assistant session", e);
            }
        }

        public final AssistIdentityState retainedIdentity$fbandroid_express_aura_java_com_facebook_aura_assist_assist(long j) {
            HatchVoiceInteractionSession hatchVoiceInteractionSession;
            AssistIdentityHost assistIdentityHost;
            WeakReference<HatchVoiceInteractionSession> weakReference = HatchVoiceInteractionSession.activeSession;
            if (weakReference == null || (hatchVoiceInteractionSession = weakReference.get()) == null || (assistIdentityHost = hatchVoiceInteractionSession.identityHost) == null || assistIdentityHost.token != j || !assistIdentityHost.isCallActive()) {
                return null;
            }
            return assistIdentityHost.state;
        }

        public final void showIdentity$fbandroid_express_aura_java_com_facebook_aura_assist_assist(long j, AssistIdentityState assistIdentityState, HatchAssistOverlayActivity hatchAssistOverlayActivity) {
            HatchVoiceInteractionSession hatchVoiceInteractionSession;
            AnonymousClass003.A0x(assistIdentityState, hatchAssistOverlayActivity);
            WeakReference<HatchVoiceInteractionSession> weakReference = HatchVoiceInteractionSession.activeSession;
            if (weakReference == null || (hatchVoiceInteractionSession = weakReference.get()) == null) {
                return;
            }
            hatchVoiceInteractionSession.showIdentity(j, assistIdentityState, hatchAssistOverlayActivity);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchVoiceInteractionSession$showIdentity$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ long $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j) {
            super(0);
            this.$token = j;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchVoiceInteractionSessionService hatchVoiceInteractionSessionService = HatchVoiceInteractionSession.this.appContext;
            hatchVoiceInteractionSessionService.startActivity(new Intent(hatchVoiceInteractionSessionService, (Class<?>) HatchAssistOverlayActivity.class).addFlags(268435456).putExtra(HatchAssistOverlayActivityKt.EXTRA_RESTORE_ASSIST_VOICE, true).putExtra(HatchAssistOverlayActivityKt.EXTRA_ASSIST_INVOCATION_TOKEN, this.$token));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchVoiceInteractionSession$showIdentity$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AssistIdentityState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AssistIdentityState assistIdentityState) {
            super(0);
            this.$state = assistIdentityState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchAssistOverlayActivity hatchAssistOverlayActivity;
            HatchVoiceInteractionSession hatchVoiceInteractionSession = HatchVoiceInteractionSession.this;
            AssistIdentityHost assistIdentityHost = hatchVoiceInteractionSession.identityHost;
            if ((assistIdentityHost != null ? assistIdentityHost.state : null) != this.$state || (hatchAssistOverlayActivity = hatchVoiceInteractionSession.controlsActivity) == null) {
                return;
            }
            hatchAssistOverlayActivity.parkVoiceControls$fbandroid_express_aura_java_com_facebook_aura_assist_assist();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchVoiceInteractionSession$showIdentity$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AssistIdentityState $state;
        public final /* synthetic */ long $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AssistIdentityState assistIdentityState, long j) {
            super(0);
            this.$state = assistIdentityState;
            this.$token = j;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchVoiceInteractionSession hatchVoiceInteractionSession = HatchVoiceInteractionSession.this;
            AssistIdentityHost assistIdentityHost = hatchVoiceInteractionSession.identityHost;
            if ((assistIdentityHost != null ? assistIdentityHost.state : null) == this.$state) {
                HatchAssistOverlayActivity hatchAssistOverlayActivity = hatchVoiceInteractionSession.controlsActivity;
                if (hatchAssistOverlayActivity != null) {
                    hatchAssistOverlayActivity.resetAfterVoiceCall$fbandroid_express_aura_java_com_facebook_aura_assist_assist();
                    return;
                }
                HatchAssistContextHolder.INSTANCE.clearIfCurrent(this.$token);
                HatchVoiceInteractionSession.this.clearIdentityHost();
                HatchVoiceInteractionSession.this.setUiEnabled(false);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceInteractionSession(HatchVoiceInteractionSessionService hatchVoiceInteractionSessionService) {
        super(hatchVoiceInteractionSessionService);
        C7384Etj.A0Y(hatchVoiceInteractionSessionService, 0);
        this.appContext = hatchVoiceInteractionSessionService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearIdentityHost() {
        this.controlsActivity = null;
        AssistIdentityHost assistIdentityHost = this.identityHost;
        if (assistIdentityHost != null) {
            assistIdentityHost.dispose();
        }
        this.identityHost = null;
    }

    @Override // android.service.voice.VoiceInteractionSession
    public void onComputeInsets(VoiceInteractionSession.Insets insets) {
        C7384Etj.A0Y(insets, 0);
        AssistIdentityHost assistIdentityHost = this.identityHost;
        if (assistIdentityHost == null) {
            super.onComputeInsets(insets);
            return;
        }
        insets.contentInsets.setEmpty();
        insets.touchableInsets = 3;
        boolean zIsInteractive = assistIdentityHost.state.isInteractive();
        Region region = insets.touchableRegion;
        if (zIsInteractive) {
            region.set(assistIdentityHost.touchableBounds);
        } else {
            region.setEmpty();
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
    public final void showIdentity(long j, AssistIdentityState assistIdentityState, HatchAssistOverlayActivity hatchAssistOverlayActivity) {
        AssistIdentityHost assistIdentityHost = this.identityHost;
        if ((assistIdentityHost != null ? assistIdentityHost.state : null) == assistIdentityState) {
            this.controlsActivity = hatchAssistOverlayActivity;
            return;
        }
        AbstractC3358CGz authenticatedUserSession = getAuthenticatedUserSession();
        if (authenticatedUserSession != null) {
            clearIdentityHost();
            this.controlsActivity = hatchAssistOverlayActivity;
            this.identityHost = new AssistIdentityHost(j, assistIdentityState, authenticatedUserSession, new AnonymousClass1(j), new AnonymousClass2(assistIdentityState), new AnonymousClass3(assistIdentityState, j));
            Bundle bundle = new Bundle();
            bundle.putBoolean(SHOW_IDENTITY, true);
            show(bundle, 0);
        }
    }

    @Override // android.service.voice.VoiceInteractionSession
    public void onCloseSystemDialogs() {
        AssistIdentityState assistIdentityState;
        AssistIdentityPresentation identity;
        AssistIdentityHost assistIdentityHost = this.identityHost;
        if (assistIdentityHost == null || (assistIdentityState = assistIdentityHost.state) == null || (identity = assistIdentityState.getIdentity()) == null || !identity.showingVoice) {
            super.onCloseSystemDialogs();
        } else {
            assistIdentityState.collapse();
        }
    }

    @Override // android.service.voice.VoiceInteractionSession
    public void onTaskFinished(Intent intent, int i) {
        AssistIdentityState assistIdentityState;
        AssistIdentityPresentation identity;
        AssistIdentityHost assistIdentityHost = this.identityHost;
        if (assistIdentityHost == null || (assistIdentityState = assistIdentityHost.state) == null || (identity = assistIdentityState.getIdentity()) == null || !identity.showingVoice) {
            super.onTaskFinished(intent, i);
        }
    }

    @Override // android.service.voice.VoiceInteractionSession
    public void onCreate() {
        super.onCreate();
        activeSession = new WeakReference<>(this);
        setUiEnabled(false);
    }

    @Override // android.service.voice.VoiceInteractionSession
    public void onDestroy() {
        clearIdentityHost();
        WeakReference<HatchVoiceInteractionSession> weakReference = activeSession;
        if (weakReference != null && weakReference.get() == this) {
            activeSession = null;
        }
        super.onDestroy();
    }

    @Override // android.service.voice.VoiceInteractionSession
    public void onHandleScreenshot(Bitmap bitmap) {
        super.onHandleScreenshot(bitmap);
        if (this.overlayShowing) {
            return;
        }
        HatchAssistContextHolder.INSTANCE.setScreenshot(bitmap);
    }

    @Override // android.service.voice.VoiceInteractionSession
    public void onHide() {
        clearIdentityHost();
        super.onHide();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    @Override // android.service.voice.VoiceInteractionSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPrepareShow(android.os.Bundle r4, int r5) {
        /*
            r3 = this;
            super.onPrepareShow(r4, r5)
            r1 = 1
            r2 = 0
            if (r4 == 0) goto L4a
            java.lang.String r0 = "show_assist_identity"
            boolean r0 = r4.getBoolean(r0)
            if (r0 != r1) goto L4a
            com.facebook.aura.assist.AssistIdentityHost r0 = r3.identityHost
            if (r0 != 0) goto L14
            r1 = 0
        L14:
            r3.setUiEnabled(r1)
            com.facebook.aura.assist.AssistIdentityHost r0 = r3.identityHost
            if (r0 == 0) goto L49
            android.app.Dialog r0 = r3.getWindow()
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L49
            X.BA9.A00(r1, r2)
            r0 = -2147483608(0xffffffff80000028, float:-5.6E-44)
            r1.addFlags(r0)
            r0 = 134217730(0x8000002, float:3.851861E-34)
            r1.clearFlags(r0)
            r1.setNavigationBarColor(r2)
            r1.setNavigationBarContrastEnforced(r2)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setBackgroundDrawable(r0)
            r1.setWindowAnimations(r2)
            r0 = -1
            r1.setLayout(r0, r0)
        L49:
            return
        L4a:
            com.facebook.aura.assist.HatchAssistOverlayActivity r0 = r3.controlsActivity
            if (r0 == 0) goto L57
            X.BLG<java.lang.Boolean> r0 = com.facebook.aura.lifecycle.AuraAppLifecycleManager._isAssistOverlayActive
            boolean r1 = X.AnonymousClass003.A1Z(r0)
            r0 = 1
            if (r1 != 0) goto L58
        L57:
            r0 = 0
        L58:
            r3.overlayShowing = r0
            if (r0 != 0) goto L49
            r3.clearIdentityHost()
            r3.setUiEnabled(r2)
            java.lang.String r1 = "HatchVoiceInteraction"
            java.lang.String r0 = "onPrepareShow entry"
            X.CFK.A05(r1, r0)
            com.facebook.aura.startup.AuraStartupOrchestrator r1 = com.facebook.aura.startup.AuraStartupOrchestrator.INSTANCE
            com.facebook.aura.startup.appjob.ScopeFilter r0 = com.facebook.aura.startup.appjob.ScopeFilter.FULL
            r1.start(r0)
            com.facebook.aura.assist.HatchAssistContextHolder r0 = com.facebook.aura.assist.HatchAssistContextHolder.INSTANCE
            long r0 = r0.beginInvocation()
            r3.invocationToken = r0
            X.CGz r2 = r3.getAuthenticatedUserSession()
            if (r2 == 0) goto L49
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            com.facebook.aura.assist.HatchVoiceInteractionSessionService r0 = r3.appContext
            r1.initialize(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.HatchVoiceInteractionSession.onPrepareShow(android.os.Bundle, int):void");
    }

    @Override // android.service.voice.VoiceInteractionSession
    public void onShow(Bundle bundle, int i) {
        super.onShow(bundle, i);
        if (bundle != null && bundle.getBoolean(SHOW_IDENTITY)) {
            AssistIdentityHost assistIdentityHost = this.identityHost;
            if (assistIdentityHost != null) {
                Context context = getContext();
                C7384Etj.A0U(context);
                setContentView(assistIdentityHost.createView(context));
                return;
            }
            return;
        }
        if (this.overlayShowing) {
            HatchAssistOverlayActivity hatchAssistOverlayActivity = this.controlsActivity;
            if (hatchAssistOverlayActivity != null) {
                hatchAssistOverlayActivity.onInvokedAgain$fbandroid_express_aura_java_com_facebook_aura_assist_assist();
                return;
            }
            return;
        }
        CFK.A05(TAG, "onShow entry");
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.MAIN_CHAT, HatchComponent.SYSTEM_ASSISTANT, null, null, null);
        if (getAuthenticatedUserSession() == null) {
            CFK.A06(TAG, "onShow: no authenticated session, launching full app");
            Companion companion = Companion;
            Context context2 = getContext();
            C7384Etj.A0U(context2);
            companion.launchFullApp(context2, null, false);
            hide();
            return;
        }
        Intent intentPutExtra = new Intent(this.appContext, (Class<?>) HatchAssistOverlayActivity.class).addFlags(268435456).putExtra(HatchAssistOverlayActivityKt.EXTRA_ASSIST_INVOCATION_TOKEN, this.invocationToken);
        C7384Etj.A0U(intentPutExtra);
        try {
            this.appContext.startActivity(intentPutExtra);
        } catch (RuntimeException e) {
            CFK.A08(TAG, "Failed to launch assist overlay activity", e);
            Companion companion2 = Companion;
            Context context3 = getContext();
            C7384Etj.A0U(context3);
            companion2.launchFullApp(context3, null, false);
        }
    }
}
