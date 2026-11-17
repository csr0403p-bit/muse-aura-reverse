package com.facebook.aura.deeplink;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C1BN;
import X.C3UX;
import X.C3cF;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C9286GCn;
import X.CFK;
import X.G0V;
import X.HrH;
import X.HtJ;
import X.HwN;
import X.Hwg;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.facebook.aura.analytics.hatch.HatchAppOpenLogger;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.analytics.hatch.HatchWidgetTelemetry;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.api.ComposerLaunchAction;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.conversation.widget.api.InboundLinkOpener;
import com.facebook.aura.conversation.widget.api.InboundLinkOrigin;
import com.facebook.aura.deeplink.HatchDeferredDeeplinks;
import com.facebook.aura.lifecycle.AppOpenedListeners;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.notifications.attention.AttentionNotifications;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchIntentViewModel extends AEs {
    public static final int $stable = 8;
    public static final String ACTION_ASSIST = "com.facebook.aura.action.ASSIST";
    public static final String ACTION_SHARE = "com.facebook.aura.action.SHARE";
    public static final long COMPOSER_LAUNCH_TTL_MS = 30000;
    public static final Companion Companion = new Companion();
    public static final String EXTRA_ASSIST_QUERY = "com.facebook.aura.extra.ASSIST_QUERY";
    public static final String EXTRA_DEEPLINK_OPENER = "com.facebook.aura.extra.DEEPLINK_OPENER";
    public static final String EXTRA_DEEPLINK_SOURCE_APPLICATION = "com.facebook.aura.extra.DEEPLINK_SOURCE_APPLICATION";
    public static final long INBOUND_LINK_TTL_MS = 30000;
    public static final String TAG = "AuraDeeplinkViewModel";
    public final BLG<ComposerLaunch> _pendingComposerLaunch;
    public final BLG<PendingDeeplink> _pendingDeeplink;
    public final BLG<InboundLink> _pendingInboundLink;
    public final AuraDeeplinkAccessValidator accessValidator;
    public boolean hasHandledLaunchIntent;
    public final C1BN<ComposerLaunch> pendingComposerLaunch;
    public final C1BN<PendingDeeplink> pendingDeeplink;
    public final C1BN<InboundLink> pendingInboundLink;
    public PendingAcceptedIntent pendingIntent;

    /* loaded from: classes.dex */
    public final class ComposerLaunch extends C06G {
        public static final int $stable = 0;
        public final ComposerLaunchAction action;
        public final long receivedAtMs;

        public ComposerLaunch(ComposerLaunchAction composerLaunchAction, long j) {
            C7384Etj.A0Y(composerLaunchAction, 0);
            this.action = composerLaunchAction;
            this.receivedAtMs = j;
        }

        public final ComposerLaunch copy(ComposerLaunchAction composerLaunchAction, long j) {
            C7384Etj.A0Y(composerLaunchAction, 0);
            return new ComposerLaunch(composerLaunchAction, j);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ComposerLaunch) {
                    ComposerLaunch composerLaunch = (ComposerLaunch) obj;
                    if (this.action != composerLaunch.action || this.receivedAtMs != composerLaunch.receivedAtMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ComposerLaunch copy$default(ComposerLaunch composerLaunch, ComposerLaunchAction composerLaunchAction, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                composerLaunchAction = composerLaunch.action;
            }
            if ((i & 2) != 0) {
                j = composerLaunch.receivedAtMs;
            }
            C7384Etj.A0Y(composerLaunchAction, 0);
            return new ComposerLaunch(composerLaunchAction, j);
        }

        public final ComposerLaunchAction component1() {
            return this.action;
        }

        public final long component2() {
            return this.receivedAtMs;
        }

        public final ComposerLaunchAction getAction() {
            return this.action;
        }

        public final long getReceivedAtMs() {
            return this.receivedAtMs;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.receivedAtMs, AnonymousClass005.A0E(this.action));
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes2.dex */
    public final class Factory extends AuraViewModelFactory<HatchIntentViewModel> {
        public static final int $stable = 8;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new HatchIntentViewModel();
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchIntentViewModel create() {
            return new HatchIntentViewModel();
        }
    }

    /* loaded from: classes.dex */
    public final class InboundLink extends C06G {
        public static final int $stable = 8;
        public final InboundLinkOrigin origin;
        public final long receivedAtMs;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof InboundLink) {
                    InboundLink inboundLink = (InboundLink) obj;
                    if (!C7384Etj.areEqual(this.url, inboundLink.url) || !C7384Etj.areEqual(this.origin, inboundLink.origin) || this.receivedAtMs != inboundLink.receivedAtMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ InboundLink copy$default(InboundLink inboundLink, String str, InboundLinkOrigin inboundLinkOrigin, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inboundLink.url;
            }
            if ((i & 2) != 0) {
                inboundLinkOrigin = inboundLink.origin;
            }
            if ((i & 4) != 0) {
                j = inboundLink.receivedAtMs;
            }
            return inboundLink.copy(str, inboundLinkOrigin, j);
        }

        public final String component1() {
            return this.url;
        }

        public final InboundLinkOrigin component2() {
            return this.origin;
        }

        public final long component3() {
            return this.receivedAtMs;
        }

        public final InboundLinkOrigin getOrigin() {
            return this.origin;
        }

        public final long getReceivedAtMs() {
            return this.receivedAtMs;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.receivedAtMs, AnonymousClass005.A0F(this.origin, AnonymousClass001.A0G(this.url)));
        }

        public InboundLink(String str, InboundLinkOrigin inboundLinkOrigin, long j) {
            AnonymousClass003.A0u(str, inboundLinkOrigin);
            this.url = str;
            this.origin = inboundLinkOrigin;
            this.receivedAtMs = j;
        }

        public final InboundLink copy(String str, InboundLinkOrigin inboundLinkOrigin, long j) {
            AnonymousClass003.A0u(str, inboundLinkOrigin);
            return new InboundLink(str, inboundLinkOrigin, j);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class PendingAcceptedIntent {
        public final Intent intent;
        public final String sourceApplication;

        public PendingAcceptedIntent(Intent intent, String str) {
            C7384Etj.A0Y(intent, 0);
            this.intent = intent;
            this.sourceApplication = str;
        }

        public final Intent getIntent() {
            return this.intent;
        }

        public final String getSourceApplication() {
            return this.sourceApplication;
        }
    }

    /* loaded from: classes.dex */
    public interface PendingDeeplink {

        public final class ConnectorAccountLink extends C06G implements PendingDeeplink {
            public static final int $stable = 0;
            public final String connectorId;

            public ConnectorAccountLink(String str) {
                C7384Etj.A0Y(str, 0);
                this.connectorId = str;
            }

            public final ConnectorAccountLink copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new ConnectorAccountLink(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof ConnectorAccountLink) && C7384Etj.areEqual(this.connectorId, ((ConnectorAccountLink) obj).connectorId));
            }

            public static /* synthetic */ ConnectorAccountLink copy$default(ConnectorAccountLink connectorAccountLink, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = connectorAccountLink.connectorId;
                }
                C7384Etj.A0Y(str, 0);
                return new ConnectorAccountLink(str);
            }

            public final String component1() {
                return this.connectorId;
            }

            public final String getConnectorId() {
                return this.connectorId;
            }

            public int hashCode() {
                return this.connectorId.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Navigation extends C06G implements PendingDeeplink {
            public static final int $stable = 0;
            public final AuraNavKey baseKey;
            public final ComposerLaunch composerLaunch;
            public final InboundLink inboundLink;
            public final AuraNavKey key;
            public final LaunchFlag launchFlag;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Navigation) {
                        Navigation navigation = (Navigation) obj;
                        if (!C7384Etj.areEqual(this.key, navigation.key) || this.launchFlag != navigation.launchFlag || !C7384Etj.areEqual(this.baseKey, navigation.baseKey) || !C7384Etj.areEqual(this.inboundLink, navigation.inboundLink) || !C7384Etj.areEqual(this.composerLaunch, navigation.composerLaunch)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Navigation copy$default(Navigation navigation, AuraNavKey auraNavKey, LaunchFlag launchFlag, AuraNavKey auraNavKey2, InboundLink inboundLink, ComposerLaunch composerLaunch, int i, Object obj) {
                if ((i & 1) != 0) {
                    auraNavKey = navigation.key;
                }
                if ((i & 2) != 0) {
                    launchFlag = navigation.launchFlag;
                }
                if ((i & 4) != 0) {
                    auraNavKey2 = navigation.baseKey;
                }
                if ((i & 8) != 0) {
                    inboundLink = navigation.inboundLink;
                }
                if ((i & 16) != 0) {
                    composerLaunch = navigation.composerLaunch;
                }
                return navigation.copy(auraNavKey, launchFlag, auraNavKey2, inboundLink, composerLaunch);
            }

            public final AuraNavKey component1() {
                return this.key;
            }

            public final LaunchFlag component2() {
                return this.launchFlag;
            }

            public final AuraNavKey component3() {
                return this.baseKey;
            }

            public final InboundLink component4() {
                return this.inboundLink;
            }

            public final ComposerLaunch component5() {
                return this.composerLaunch;
            }

            public final AuraNavKey getBaseKey() {
                return this.baseKey;
            }

            public final ComposerLaunch getComposerLaunch() {
                return this.composerLaunch;
            }

            public final InboundLink getInboundLink() {
                return this.inboundLink;
            }

            public final AuraNavKey getKey() {
                return this.key;
            }

            public final LaunchFlag getLaunchFlag() {
                return this.launchFlag;
            }

            public int hashCode() {
                return ((((AnonymousClass005.A0F(this.launchFlag, AnonymousClass005.A0E(this.key)) + AnonymousClass006.A0D(this.baseKey)) * 31) + AnonymousClass006.A0D(this.inboundLink)) * 31) + C06G.A04(this.composerLaunch);
            }

            public Navigation(AuraNavKey auraNavKey, LaunchFlag launchFlag, AuraNavKey auraNavKey2, InboundLink inboundLink, ComposerLaunch composerLaunch) {
                AnonymousClass003.A0u(auraNavKey, launchFlag);
                this.key = auraNavKey;
                this.launchFlag = launchFlag;
                this.baseKey = auraNavKey2;
                this.inboundLink = inboundLink;
                this.composerLaunch = composerLaunch;
            }

            public final Navigation copy(AuraNavKey auraNavKey, LaunchFlag launchFlag, AuraNavKey auraNavKey2, InboundLink inboundLink, ComposerLaunch composerLaunch) {
                AnonymousClass003.A0u(auraNavKey, launchFlag);
                return new Navigation(auraNavKey, launchFlag, auraNavKey2, inboundLink, composerLaunch);
            }

            public String toString() {
                return super.toString();
            }

            public /* synthetic */ Navigation(AuraNavKey auraNavKey, LaunchFlag launchFlag, AuraNavKey auraNavKey2, InboundLink inboundLink, ComposerLaunch composerLaunch, int i, C06H c06h) {
                this(auraNavKey, (i & 2) != 0 ? LaunchFlag.NAVIGATE : launchFlag, (i & 4) != 0 ? null : auraNavKey2, (i & 8) != 0 ? null : inboundLink, (i & 16) != 0 ? null : composerLaunch);
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.deeplink.HatchIntentViewModel$notifyAppOpened$1", f = "HatchIntentViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.deeplink.HatchIntentViewModel$notifyAppOpened$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $appContext;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$appContext = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$appContext, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            AppOpenedListeners.INSTANCE.notifyAppOpened(this.$appContext);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass1(this.$appContext, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r2.equals("android.intent.action.ASSIST") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (r2.equals("com.facebook.aura.action.ASSIST") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        handleAssistIntent(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleAcceptedIntent(X.AbstractC3358CGz r6, android.content.Intent r7, java.lang.String r8, com.facebook.aura.conversation.widget.api.InboundLinkOrigin r9, java.lang.Long r10) {
        /*
            r5 = this;
            r3 = r5
            r4 = r6
            r5 = r7
            if (r6 != 0) goto L1e
            r3.handleIntentSessionless(r7)
            java.lang.String r0 = "com.facebook.aura.extra.COMPOSER_LAUNCH_ACTION"
            r7.removeExtra(r0)
            com.facebook.aura.deeplink.HatchIntentViewModel$PendingAcceptedIntent r0 = new com.facebook.aura.deeplink.HatchIntentViewModel$PendingAcceptedIntent
            r0.<init>(r7, r8)
            r3.pendingIntent = r0
            com.facebook.aura.analytics.hatch.HatchAppOpenLogger r1 = com.facebook.aura.analytics.hatch.HatchAppOpenLogger.INSTANCE
            android.net.Uri r0 = r7.getData()
            r1.logLoggedOutAppOpen(r0, r8)
            return
        L1e:
            r0 = 0
            r3.pendingIntent = r0
            java.lang.String r0 = "hatch_notif_target_user_id"
            java.lang.String r1 = r7.getStringExtra(r0)
            r7.removeExtra(r0)
            r0 = r4
            X.CH0 r0 = (X.CH0) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L3e
            com.facebook.aura.analytics.waterfall.HatchNMEEntrypointAttribution r1 = com.facebook.aura.analytics.waterfall.HatchNMEEntrypointAttribution.INSTANCE
            android.net.Uri r0 = r7.getData()
            r1.logClick(r0)
        L3e:
            java.lang.String r2 = r7.getAction()
            if (r2 == 0) goto L6b
            int r1 = r2.hashCode()
            r0 = -1688682223(0xffffffff9b58c111, float:-1.7929484E-22)
            if (r1 == r0) goto L71
            r0 = 1566545774(0x5d5f976e, float:1.0069667E18)
            if (r1 == r0) goto L63
            r0 = 1901467671(0x71561817, float:1.06014264E30)
            if (r1 != r0) goto L6b
            java.lang.String r0 = "com.facebook.aura.action.SHARE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L6b
            r3.setAssistNavTarget(r6)
            return
        L63:
            java.lang.String r0 = "android.intent.action.ASSIST"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L79
        L6b:
            r6 = r9
            r7 = r10
            r3.handleSessionedIntent(r4, r5, r6, r7, r8)
            return
        L71:
            java.lang.String r0 = "com.facebook.aura.action.ASSIST"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L6b
        L79:
            r3.handleAssistIntent(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.deeplink.HatchIntentViewModel.handleAcceptedIntent(X.CGz, android.content.Intent, java.lang.String, com.facebook.aura.conversation.widget.api.InboundLinkOrigin, java.lang.Long):void");
    }

    public final void handleIntent(Context context, AbstractC3358CGz abstractC3358CGz, Intent intent, boolean z) {
        AnonymousClass003.A0v(context, intent);
        notifyAppOpened(AnonymousClass001.A0I(context));
        if (intent.getData() != null && !z && this.accessValidator.isSecurityEnabled() && this.accessValidator.validate(context, intent, AnonymousClass002.A1X(abstractC3358CGz)) != AuraDeeplinkAccessResult.ALLOWED) {
            CFK.A06(TAG, "handleIntent: rejecting unauthorized deeplink");
            return;
        }
        InboundLinkOrigin inboundLinkOrigin = inboundLinkOrigin(intent, z);
        String stringExtra = intent.getStringExtra(EXTRA_DEEPLINK_SOURCE_APPLICATION);
        HatchNotificationDeeplinkHandler.INSTANCE.maybeLogNotificationClick(intent);
        AttentionNotifications.INSTANCE.cancelOpenedApproval(context, intent);
        HatchWidgetTelemetry.INSTANCE.maybeLogWidgetOpen(intent);
        handleAcceptedIntent(abstractC3358CGz, intent, stringExtra, inboundLinkOrigin, C3cI.A0O());
    }

    public final void handleTrustedIntent(AbstractC3358CGz abstractC3358CGz, Intent intent) {
        AnonymousClass003.A0u(abstractC3358CGz, intent);
        handleAcceptedIntent(abstractC3358CGz, intent, null, null, null);
    }

    public final void markLaunchIntentHandled() {
        this.hasHandledLaunchIntent = true;
    }

    public final void onDeeplinkHandled(PendingDeeplink pendingDeeplink) {
        PendingDeeplink.Navigation navigation;
        C7384Etj.A0Y(pendingDeeplink, 0);
        if (C9286GCn.A00(pendingDeeplink, HwN.A01, (C9286GCn) this._pendingDeeplink) && (pendingDeeplink instanceof PendingDeeplink.Navigation) && (navigation = (PendingDeeplink.Navigation) pendingDeeplink) != null) {
            InboundLink inboundLink = navigation.inboundLink;
            if (inboundLink != null) {
                AnonymousClass002.A1I(this._pendingInboundLink, inboundLink);
            }
            ComposerLaunch composerLaunch = navigation.composerLaunch;
            if (composerLaunch != null) {
                AnonymousClass002.A1I(this._pendingComposerLaunch, composerLaunch);
            }
        }
    }

    public final void onSessionActivated(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        PendingAcceptedIntent pendingAcceptedIntent = this.pendingIntent;
        if (pendingAcceptedIntent != null) {
            handleAcceptedIntent(abstractC3358CGz, pendingAcceptedIntent.intent, pendingAcceptedIntent.sourceApplication, null, null);
        }
    }

    public final boolean takeComposerLaunch(ComposerLaunch composerLaunch) {
        C7384Etj.A0Y(composerLaunch, 0);
        return C9286GCn.A00(composerLaunch, HwN.A01, (C9286GCn) this._pendingComposerLaunch) && SystemClock.elapsedRealtime() - composerLaunch.receivedAtMs <= 30000;
    }

    public final boolean takeInboundLink(InboundLink inboundLink) {
        C7384Etj.A0Y(inboundLink, 0);
        return C9286GCn.A00(inboundLink, HwN.A01, (C9286GCn) this._pendingInboundLink) && SystemClock.elapsedRealtime() - inboundLink.receivedAtMs <= 30000;
    }

    public static /* synthetic */ void handleAcceptedIntent$default(HatchIntentViewModel hatchIntentViewModel, AbstractC3358CGz abstractC3358CGz, Intent intent, String str, InboundLinkOrigin inboundLinkOrigin, Long l, int i, Object obj) {
        if ((i & 8) != 0) {
            inboundLinkOrigin = null;
        }
        if ((i & 16) != 0) {
            l = null;
        }
        hatchIntentViewModel.handleAcceptedIntent(abstractC3358CGz, intent, str, inboundLinkOrigin, l);
    }

    private final void handleAssistIntent(AbstractC3358CGz abstractC3358CGz, Intent intent) {
        String stringExtra = intent.getStringExtra("com.facebook.aura.extra.ASSIST_QUERY");
        if (stringExtra != null && !C7BY.A0j(stringExtra)) {
            HatchPendingMessage.INSTANCE.setPendingComposerText(stringExtra, HatchComposerEntryPoint.ASSIST);
        }
        String strA00 = C3cF.A00(32);
        String stringExtra2 = intent.getStringExtra(strA00);
        if (stringExtra2 == null || C7BY.A0j(stringExtra2)) {
            stringExtra2 = null;
        }
        intent.removeExtra(strA00);
        String strA002 = C3cF.A00(31);
        boolean booleanExtra = intent.getBooleanExtra(strA002, false);
        intent.removeExtra(strA002);
        if (stringExtra2 == null) {
            HatchPendingMessage.INSTANCE.notifyMainChatAssistLaunch();
            setAssistNavTarget(abstractC3358CGz);
        } else {
            setPendingDeeplink(new PendingDeeplink.Navigation(new ConversationScreenKey(stringExtra2, null, booleanExtra, null, null, false), LaunchFlag.NAVIGATE, ConversationTabScreenKey.INSTANCE, null, null), abstractC3358CGz);
        }
    }

    private final void handleMappedRoute(AuraDeeplinkRoute auraDeeplinkRoute, AbstractC3358CGz abstractC3358CGz, InboundLink inboundLink, ComposerLaunch composerLaunch) {
        setPendingDeeplink(new PendingDeeplink.Navigation(auraDeeplinkRoute.key, auraDeeplinkRoute.launchFlag, auraDeeplinkRoute.baseKey, inboundLink, composerLaunch), abstractC3358CGz);
    }

    public static /* synthetic */ void handleMappedRoute$default(HatchIntentViewModel hatchIntentViewModel, AuraDeeplinkRoute auraDeeplinkRoute, AbstractC3358CGz abstractC3358CGz, InboundLink inboundLink, ComposerLaunch composerLaunch, int i, Object obj) {
        if ((i & 4) != 0) {
            inboundLink = null;
        }
        if ((i & 8) != 0) {
            composerLaunch = null;
        }
        hatchIntentViewModel.handleMappedRoute(auraDeeplinkRoute, abstractC3358CGz, inboundLink, composerLaunch);
    }

    private final void handleSessionedIntent(AbstractC3358CGz abstractC3358CGz, Intent intent, InboundLinkOrigin inboundLinkOrigin, Long l, String str) {
        HatchAppOpenLogger hatchAppOpenLogger = HatchAppOpenLogger.INSTANCE;
        InboundLink inboundLink = null;
        ComposerLaunch composerLaunch = null;
        hatchAppOpenLogger.logAppOpen(intent.getData(), null, str, null, null);
        Uri data = intent.getData();
        if (data != null) {
            Uri uriUriForLogging = hatchAppOpenLogger.uriForLogging(data);
            String string = uriUriForLogging != null ? uriUriForLogging.toString() : null;
            data.getHost();
            AuraDeeplinkRouteMapper auraDeeplinkRouteMapper = AuraDeeplinkRouteMapper.INSTANCE;
            String strConnectorAccountLinkIdentifierForUri = auraDeeplinkRouteMapper.connectorAccountLinkIdentifierForUri(data);
            if (strConnectorAccountLinkIdentifierForUri != null) {
                setPendingDeeplink(new PendingDeeplink.ConnectorAccountLink(strConnectorAccountLinkIdentifierForUri), abstractC3358CGz);
                return;
            }
            String strRouteNameResolvedAfterActivation = auraDeeplinkRouteMapper.routeNameResolvedAfterActivation(data);
            if (strRouteNameResolvedAfterActivation != null) {
                this._pendingDeeplink.Af8(null);
                HatchDeferredDeeplinks.Companion.getInstance(abstractC3358CGz).park$fbandroid_express_aura_java_com_facebook_aura_deeplink_deeplink(new HatchDeferredDeeplinks.Link(data, strRouteNameResolvedAfterActivation));
                return;
            }
            AuraDeeplinkRoute auraDeeplinkRouteRouteForSessionedUri = auraDeeplinkRouteMapper.routeForSessionedUri(data, abstractC3358CGz);
            if (auraDeeplinkRouteRouteForSessionedUri == null) {
                if (auraDeeplinkRouteMapper.isAppLaunchUri(data)) {
                    return;
                }
                HatchHtmlDiagnostics.INSTANCE.logError(HatchHtmlSurface.INBOUND_DEEPLINK, HatchHtmlErrorCode.NO_ROUTE, string, null, null, null);
                return;
            }
            AuraNavKey auraNavKey = auraDeeplinkRouteRouteForSessionedUri.key;
            ConversationTabScreenKey conversationTabScreenKey = ConversationTabScreenKey.INSTANCE;
            if (C7384Etj.areEqual(auraNavKey, conversationTabScreenKey) && inboundLinkOrigin != null && l != null) {
                inboundLink = new InboundLink(C60O.A0o(data), inboundLinkOrigin, l.longValue());
            }
            ComposerLaunchAction composerLaunchActionFromIntent = ComposerLaunchAction.Companion.fromIntent(intent);
            if (composerLaunchActionFromIntent != null && C7384Etj.areEqual(auraDeeplinkRouteRouteForSessionedUri.key, conversationTabScreenKey)) {
                composerLaunch = new ComposerLaunch(composerLaunchActionFromIntent, SystemClock.elapsedRealtime());
            }
            intent.removeExtra(ComposerLaunchAction.EXTRA);
            handleMappedRoute(auraDeeplinkRouteRouteForSessionedUri, abstractC3358CGz, inboundLink, composerLaunch);
        }
    }

    private final InboundLinkOrigin inboundLinkOrigin(Intent intent, boolean z) {
        InboundLinkOpener next;
        InboundLinkOrigin metaApp;
        if (z) {
            metaApp = InboundLinkOrigin.HomeScreenWidget.INSTANCE;
        } else {
            String stringExtra = intent.getStringExtra(EXTRA_DEEPLINK_OPENER);
            Iterator<InboundLinkOpener> it = InboundLinkOpener.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.name().equals(stringExtra)) {
                    break;
                }
            }
            InboundLinkOpener inboundLinkOpener = next;
            if (inboundLinkOpener != null) {
                metaApp = new InboundLinkOrigin.MetaApp(inboundLinkOpener);
            } else {
                if (!intent.hasExtra("hatch_notif_origin")) {
                    return null;
                }
                metaApp = InboundLinkOrigin.Notification.INSTANCE;
            }
        }
        return metaApp;
    }

    private final void setAssistNavTarget(AbstractC3358CGz abstractC3358CGz) {
        setPendingDeeplink(new PendingDeeplink.Navigation(ConversationTabScreenKey.INSTANCE, LaunchFlag.REPLACE_BACKSTACK, null, null, null), abstractC3358CGz);
    }

    private final void setPendingDeeplink(PendingDeeplink pendingDeeplink, AbstractC3358CGz abstractC3358CGz) {
        if (abstractC3358CGz != null) {
            HatchDeferredDeeplinks.Companion.getInstance(abstractC3358CGz).drop$fbandroid_express_aura_java_com_facebook_aura_deeplink_deeplink();
        }
        this._pendingDeeplink.Af8(pendingDeeplink);
    }

    public final boolean getHasHandledLaunchIntent() {
        return this.hasHandledLaunchIntent;
    }

    public final C1BN<ComposerLaunch> getPendingComposerLaunch() {
        return this.pendingComposerLaunch;
    }

    public final C1BN<PendingDeeplink> getPendingDeeplink() {
        return this.pendingDeeplink;
    }

    public final C1BN<InboundLink> getPendingInboundLink() {
        return this.pendingInboundLink;
    }

    public final boolean isLaunchIntentFinished(AbstractC3358CGz abstractC3358CGz) {
        if (this.hasHandledLaunchIntent && this.pendingIntent == null && this._pendingDeeplink.getValue() == null) {
            return abstractC3358CGz == null || HatchDeferredDeeplinks.Companion.getInstance(abstractC3358CGz).awaitingActivation.getValue() == null;
        }
        return false;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchIntentViewModel() {
        HrH hrH = HwN.A01;
        C9286GCn c9286GCnA14 = C3cG.A14(hrH);
        this._pendingDeeplink = c9286GCnA14;
        this.pendingDeeplink = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(hrH);
        this._pendingInboundLink = c9286GCnA142;
        this.pendingInboundLink = C3cG.A11(c9286GCnA142);
        C9286GCn c9286GCnA143 = C3cG.A14(hrH);
        this._pendingComposerLaunch = c9286GCnA143;
        this.pendingComposerLaunch = C3cG.A11(c9286GCnA143);
        this.accessValidator = new AuraDeeplinkAccessValidator();
    }

    private final void handleIntentSessionless(Intent intent) {
        AuraDeeplinkRoute auraDeeplinkRouteRouteForSessionlessUri;
        Uri data = intent.getData();
        if (data == null || (auraDeeplinkRouteRouteForSessionlessUri = AuraDeeplinkRouteMapper.INSTANCE.routeForSessionlessUri(data)) == null) {
            return;
        }
        handleMappedRoute(auraDeeplinkRouteRouteForSessionlessUri, null, null, null);
    }

    private final void notifyAppOpened(Context context) {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(context, null), AEu.A00(this));
    }

    public final void resolveAfterActivation(HatchDeferredDeeplinks.Link link, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(link, abstractC3358CGz);
        if (HatchDeferredDeeplinks.Companion.getInstance(abstractC3358CGz).take$fbandroid_express_aura_java_com_facebook_aura_deeplink_deeplink(link)) {
            AuraDeeplinkRoute auraDeeplinkRouteRouteForSessionedUri = AuraDeeplinkRouteMapper.INSTANCE.routeForSessionedUri(link.uri, abstractC3358CGz);
            if (auraDeeplinkRouteRouteForSessionedUri != null) {
                handleMappedRoute(auraDeeplinkRouteRouteForSessionedUri, abstractC3358CGz, null, null);
                return;
            }
            HatchHtmlDiagnostics hatchHtmlDiagnostics = HatchHtmlDiagnostics.INSTANCE;
            HatchHtmlSurface hatchHtmlSurface = HatchHtmlSurface.INBOUND_DEEPLINK;
            HatchHtmlErrorCode hatchHtmlErrorCode = HatchHtmlErrorCode.NO_ROUTE;
            Uri uriUriForLogging = HatchAppOpenLogger.INSTANCE.uriForLogging(link.uri);
            hatchHtmlDiagnostics.logError(hatchHtmlSurface, hatchHtmlErrorCode, uriUriForLogging != null ? uriUriForLogging.toString() : null, null, null, null);
        }
    }

    private final void handleShareIntent(AbstractC3358CGz abstractC3358CGz) {
        setAssistNavTarget(abstractC3358CGz);
    }
}
