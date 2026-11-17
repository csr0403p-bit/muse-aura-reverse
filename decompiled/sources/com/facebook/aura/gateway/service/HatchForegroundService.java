package com.facebook.aura.gateway.service;

import X.AGH;
import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass602;
import X.BLG;
import X.C06H;
import X.C10650I0u;
import X.C1BN;
import X.C20Q;
import X.C31u;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60N;
import X.C7384Etj;
import X.CFK;
import X.EG6;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC7359EnW;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.backgroundwork.api.BackgroundWork;
import com.facebook.aura.backgroundwork.api.BackgroundWorkContent;
import com.facebook.aura.backgroundwork.api.BackgroundWorkHeadline;
import com.facebook.aura.backgroundwork.api.BackgroundWorkState;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.gateway.HatchAgentExecution;
import com.facebook.aura.gateway.HatchBackgroundSession;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.MC;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.model.HatchGatewayEventKt;
import com.facebook.aura.nodes.transport.HatchNodeOperationLease;
import com.facebook.aura.nodes.transport.HatchNodeServiceState;
import com.facebook.aura.notifications.suppression.HatchNotificationSuppression;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchForegroundService extends Service {
    public static final String ACTION_DISABLE = "action_disable";
    public static final String ACTION_ENABLE = "action_enable";
    public static final String ACTION_LEASE_REFRESH = "action_lease_refresh";
    public static final String ACTION_STOP = "action_stop";
    public static final String CHANNEL_ID = "aura_run_in_background";
    public static final String EXTRA_IMMEDIATE_NOTIFICATION = "extra_immediate_notification";
    public static final int NOTIFICATION_ID = 9004;
    public static final String TAG = "HatchForegroundService";
    public String alertedNeedsUserKey;
    public FittedNotificationImages fitted;
    public Bitmap fittedSource;
    public int lastStartId;
    public HoC observerJob;
    public PostedNotification postedNotification;
    public final C3UX scope = C3cH.A0x(AnonymousClass001.A0y());
    public static final Companion Companion = new Companion();
    public static final C31u<Object, Integer> backgroundTurnHoldSeconds$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_browser.android_background_turn_hold_seconds);
    public static final BLG<Long> turnHoldDeadline = C3cG.A13();

    public final class Companion {
        public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {C3cG.A0y(Companion.class, "backgroundTurnHoldSeconds", "getBackgroundTurnHoldSeconds()I")};

        public final void disableBackground(Context context) {
            C7384Etj.A0Y(context, 0);
            Intent intent = new Intent(context, (Class<?>) HatchForegroundService.class);
            intent.setAction(HatchForegroundService.ACTION_DISABLE);
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                CFK.A06(HatchForegroundService.TAG, "disableBackground start blocked");
            }
        }

        public final boolean hasBackgroundAgentWork$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return BackgroundWork.INSTANCE.activeHeadline(abstractC3358CGz).getValue() != null || holdsAgentTurn(abstractC3358CGz);
        }

        public final void refreshLease(Context context) {
            C7384Etj.A0Y(context, 0);
            startForLease(context, "lease_refresh", false);
        }

        public final boolean startForBrowserWake(Context context) {
            C7384Etj.A0Y(context, 0);
            return startForLease(context, "browser_wake", true);
        }

        public final void stopService(Context context) {
            C7384Etj.A0Y(context, 0);
            Intent intent = new Intent(context, (Class<?>) HatchForegroundService.class);
            intent.setAction(HatchForegroundService.ACTION_STOP);
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                CFK.A06(HatchForegroundService.TAG, "stopService start blocked");
            }
        }

        private final int getBackgroundTurnHoldSeconds() {
            return AnonymousClass001.A0F(HatchForegroundService.backgroundTurnHoldSeconds$delegate.getValue(this, $$delegatedProperties[0]));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean holdsAgentTurn(AbstractC3358CGz abstractC3358CGz) {
            if (!C3cH.A1R(BackgroundWork.INSTANCE.standingBy(abstractC3358CGz)) || !HatchAgentExecution.Companion.getInstance(abstractC3358CGz).isActive()) {
                return false;
            }
            Long value = HatchForegroundService.turnHoldDeadline.getValue();
            return value == null || SystemClock.elapsedRealtime() < value.longValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void recordStartFailure(String str, String str2) {
            try {
                HatchAppEventLogger.INSTANCE.logEvent("foreground_service_start_failure", null, "gateway", "error", "foreground_service", AGH.A0D(C3cG.A0r("failure_stage", str), C3cG.A0r("exception_class", str2), C3cG.A0r("api_level", String.valueOf(Build.VERSION.SDK_INT)), C3cH.A0r("app_foreground", AuraAppLifecycleManager.INSTANCE.isAppInForeground()), C3cH.A0r("operation_lease", C3cH.A1R(HatchNodeOperationLease.hasOperationLease)), C3cH.A0r("host_lease", C3cH.A1R(HatchNodeOperationLease.hasHostLease))), null);
            } catch (Throwable th) {
                C3cG.A0s(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean startForLease(Context context, String str, boolean z) {
            StringBuilder sbA0g;
            String str2;
            Intent intent = new Intent(context, (Class<?>) HatchForegroundService.class);
            intent.setAction(HatchForegroundService.ACTION_LEASE_REFRESH);
            if (z) {
                intent.putExtra(HatchForegroundService.EXTRA_IMMEDIATE_NOTIFICATION, true);
            }
            try {
                context.startForegroundService(intent);
                return true;
            } catch (ForegroundServiceStartNotAllowedException unused) {
                recordStartFailure(str, "start_not_allowed");
                sbA0g = C3cG.A0g(str);
                str2 = " FGS start blocked";
                CFK.A06(HatchForegroundService.TAG, AnonymousClass001.A0v(str2, sbA0g));
                return false;
            } catch (SecurityException unused2) {
                recordStartFailure(str, "security");
                sbA0g = C3cG.A0g(str);
                str2 = " FGS start denied";
                CFK.A06(HatchForegroundService.TAG, AnonymousClass001.A0v(str2, sbA0g));
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C20Q<Unit> turnHoldExpiry() {
            return AbstractC05633ui.A00(new HatchForegroundService$Companion$turnHoldExpiry$1(null), HatchForegroundService.turnHoldDeadline);
        }

        public final void onAppVisibilityChanged$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service(boolean z) {
            Long lValueOf;
            BLG<Long> blg = HatchForegroundService.turnHoldDeadline;
            if (z) {
                lValueOf = null;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int backgroundTurnHoldSeconds = getBackgroundTurnHoldSeconds();
                if (backgroundTurnHoldSeconds < 0) {
                    backgroundTurnHoldSeconds = 0;
                }
                lValueOf = Long.valueOf(jElapsedRealtime + (backgroundTurnHoldSeconds * 1000));
            }
            blg.Af8(lValueOf);
        }

        public final void startPersistent(Context context) {
            String str;
            String strA00 = C60N.A00(28);
            C7384Etj.A0Y(context, 0);
            Intent intent = new Intent(context, (Class<?>) HatchForegroundService.class);
            intent.setAction(HatchForegroundService.ACTION_ENABLE);
            try {
                context.startForegroundService(intent);
            } catch (ForegroundServiceStartNotAllowedException unused) {
                recordStartFailure(strA00, "start_not_allowed");
                str = "startPersistent FGS start blocked";
                CFK.A06(HatchForegroundService.TAG, str);
            } catch (SecurityException unused2) {
                recordStartFailure(strA00, "security");
                str = "startPersistent FGS start denied";
                CFK.A06(HatchForegroundService.TAG, str);
            }
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.service.HatchForegroundService", f = "HatchForegroundService.kt", l = {218}, m = "restoreRunInBackground", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.HatchForegroundService$restoreRunInBackground$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchForegroundService.this.restoreRunInBackground(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.service.HatchForegroundService$resurfaceOnNewRequest$1", f = "HatchForegroundService.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.HatchForegroundService$resurfaceOnNewRequest$1, reason: invalid class name and case insensitive filesystem */
    public final class C121611 extends AbstractC07127nr implements G0V<Integer, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AbstractC3358CGz $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121611(AbstractC3358CGz abstractC3358CGz, HtJ<? super C121611> htJ) {
            super(2, htJ);
            this.$session = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C121611(this.$session, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            BackgroundWork.INSTANCE.resurfaceActive(this.$session);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, HtJ<? super Unit> htJ) {
            return invoke(AnonymousClass001.A0F(num), htJ);
        }

        public final Object invoke(int i, HtJ<? super Unit> htJ) {
            return new C121611(this.$session, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1", f = "HatchForegroundService.kt", l = {230, 233, 269}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1, reason: invalid class name and case insensitive filesystem */
    public final class C121621 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$1", f = "HatchForegroundService.kt", l = {231}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01711 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AuraSessionManager.SessionState>, Object> {
            public int label;

            @DebugMetadata(c = "com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$1$1", f = "HatchForegroundService.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C01721 extends AbstractC07127nr implements G0V<AuraSessionManager.SessionState, HtJ<? super Boolean>, Object> {
                public /* synthetic */ Object L$0;
                public int label;

                public C01721(HtJ<? super C01721> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C01721 c01721 = new C01721(htJ);
                    c01721.L$0 = obj;
                    return c01721;
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    Object obj2 = this.L$0;
                    if (this.label != 0) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return C3cG.A0P(obj2 instanceof AuraSessionManager.SessionState.Initializing);
                }

                @Override // X.G0V
                public final Object invoke(AuraSessionManager.SessionState sessionState, HtJ<? super Boolean> htJ) {
                    C01721 c01721 = new C01721(htJ);
                    c01721.L$0 = sessionState;
                    return c01721.invokeSuspend(Unit.INSTANCE);
                }
            }

            public C01711(HtJ<? super C01711> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C01711(htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BN<AuraSessionManager.SessionState> c1bn = AuraSessionManager.state;
                    C01721 c01721 = new C01721(null);
                    this.label = 1;
                    obj = AbstractC9777Gfy.A00(this, c01721, c1bn);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return obj;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super AuraSessionManager.SessionState> htJ) {
                return new C01711(htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C121621(HtJ<? super C121621> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchForegroundService.this.new C121621(htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x009f A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r1 = r13.label
                r5 = 3
                r6 = 2
                r0 = 1
                r3 = 0
                if (r1 == 0) goto L16
                if (r1 == r0) goto L29
                if (r1 == r6) goto L37
                if (r1 != r5) goto La0
                X.Hwg.A00(r14)
            L13:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L16:
                X.Hwg.A00(r14)
                com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$1 r2 = new com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$1
                r2.<init>(r3)
                r13.label = r0
                r0 = 30000(0x7530, double:1.4822E-319)
                java.lang.Object r0 = X.GAX.A01(r13, r2, r0)
                if (r0 != r4) goto L2c
                return r4
            L29:
                X.Hwg.A00(r14)
            L2c:
                com.facebook.aura.gateway.service.HatchForegroundService r0 = com.facebook.aura.gateway.service.HatchForegroundService.this
                r13.label = r6
                java.lang.Object r0 = com.facebook.aura.gateway.service.HatchForegroundService.access$restoreRunInBackground(r0, r13)
                if (r0 != r4) goto L3a
                return r4
            L37:
                X.Hwg.A00(r14)
            L3a:
                X.1BN<com.facebook.aura.auth.AuraSessionManager$SessionState> r1 = com.facebook.aura.auth.AuraSessionManager.state
                com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$map$1 r0 = new com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$map$1
                r0.<init>(r1)
                X.20Q r2 = X.GDB.A01(r0)
                com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$1 r0 = new com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$1
                r0.<init>(r3)
                X.3pS r7 = X.AbstractC05633ui.A00(r0, r2)
                com.facebook.aura.gateway.service.HatchForegroundService r1 = com.facebook.aura.gateway.service.HatchForegroundService.this
                com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$2 r0 = new com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$2
                r0.<init>(r3, r1)
                X.3pS r11 = X.AbstractC05633ui.A00(r0, r2)
                com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$3 r0 = new com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$3
                r0.<init>(r3)
                X.3pS r8 = X.AbstractC05633ui.A00(r0, r2)
                com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$4 r0 = new com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$4
                r0.<init>(r3)
                X.3pS r9 = X.AbstractC05633ui.A00(r0, r2)
                com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$5 r0 = new com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$invokeSuspend$$inlined$flatMapLatest$5
                r0.<init>(r3)
                X.3pS r10 = X.AbstractC05633ui.A00(r0, r2)
                X.1BN<java.lang.Boolean> r6 = com.facebook.aura.nodes.transport.HatchNodeOperationLease.hasOperationLease
                com.facebook.aura.gateway.service.HatchForegroundService$Companion r0 = com.facebook.aura.gateway.service.HatchForegroundService.Companion
                X.20Q r12 = com.facebook.aura.gateway.service.HatchForegroundService.Companion.access$turnHoldExpiry(r0)
                X.20Q[] r0 = new X.C20Q[]{r6, r7, r8, r9, r10, r11, r12}
                X.3ua r2 = X.AbstractC05633ui.A01(r0)
                com.facebook.aura.gateway.service.HatchForegroundService r1 = com.facebook.aura.gateway.service.HatchForegroundService.this
                com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$2 r0 = new com.facebook.aura.gateway.service.HatchForegroundService$startLeaseObserver$1$2
                r0.<init>()
                r13.L$0 = r3
                r13.L$1 = r3
                r13.L$2 = r3
                r13.L$3 = r3
                r13.L$4 = r3
                r13.L$5 = r3
                r13.label = r5
                java.lang.Object r0 = r2.collect(r0, r13)
                if (r0 != r4) goto L13
                return r4
            La0:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.service.HatchForegroundService.C121621.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchForegroundService.this.new C121621(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final int handleEnable() {
        if (!promoteToForeground(false)) {
            return 2;
        }
        HatchBackgroundSession.INSTANCE.start();
        startLeaseObserver();
        return 3;
    }

    private final String agentName() {
        AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
        if (currentSession != null) {
            HatchGatewayServiceManager hatchGatewayServiceManager = HatchGatewayServiceManager.INSTANCE;
            String trimmedName = HatchGatewayEventKt.getTrimmedName(C3cH.A0R(HatchGatewayConnection.Companion.getInstance(currentSession)));
            if (trimmedName != null) {
                return trimmedName;
            }
        }
        return HatchAppName.value;
    }

    private final BackgroundWorkHeadline backgroundWorkHeadline() {
        AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
        if (currentSession != null) {
            return BackgroundWork.INSTANCE.activeHeadline(currentSession).getValue();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6 A[PHI: r8
  0x00e6: PHI (r8v1 boolean) = (r8v0 boolean), (r8v5 boolean) binds: [B:3:0x0009, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.EG6 baseNotification(com.facebook.aura.gateway.service.PostedNotification r11, boolean r12) {
        /*
            r10 = this;
            com.facebook.aura.backgroundwork.api.BackgroundWorkContent r4 = r11.content
            com.facebook.aura.backgroundwork.api.BackgroundWorkState r1 = r4.state
            com.facebook.aura.backgroundwork.api.BackgroundWorkState r0 = com.facebook.aura.backgroundwork.api.BackgroundWorkState.NEEDS_USER
            r7 = 1
            r6 = 0
            r8 = 0
            if (r1 != r0) goto Le6
            r8 = 1
            com.facebook.aura.notifications.attention.AttentionNotifications r1 = com.facebook.aura.notifications.attention.AttentionNotifications.INSTANCE
            android.content.Context r0 = X.AnonymousClass001.A0I(r10)
            boolean r0 = r1.isActionRequiredChannelEnabled(r0)
            if (r0 == 0) goto Le6
            java.lang.String r5 = "aura_action_required"
        L1a:
            android.content.Context r1 = X.AnonymousClass001.A0I(r10)
            java.lang.String r0 = r4.openUri
            r9 = 9004(0x232c, float:1.2617E-41)
            android.app.PendingIntent r1 = com.facebook.aura.notifications.attention.AttentionNotificationsKt.openUriOrAppPendingIntent(r1, r9, r0)
            android.content.Context r0 = r10.getApplicationContext()
            X.EG6 r3 = new X.EG6
            r3.<init>(r0, r5)
            r0 = 2131231193(0x7f0801d9, float:1.807846E38)
            if (r8 == 0) goto L37
            r0 = 2131231012(0x7f080124, float:1.8078093E38)
        L37:
            r3.A03(r0)
            android.app.Notification r2 = r3.A07
            int r0 = r2.flags
            r0 = r0 | 2
            r2.flags = r0
            r3.A0S = r6
            boolean r0 = r10.shouldAlertNeedsUser(r4)
            r0 = r0 ^ 1
            r3.A0T = r0
            r3.A09 = r1
            com.facebook.aura.gateway.service.HatchForegroundServiceDismissReceiver$Companion r1 = com.facebook.aura.gateway.service.HatchForegroundServiceDismissReceiver.Companion
            android.content.Context r0 = X.AnonymousClass001.A0I(r10)
            android.app.PendingIntent r0 = r1.createPendingIntent(r0, r9)
            r2.deleteIntent = r0
            java.lang.String r0 = r4.title
            r3.A08(r0)
            java.lang.String r0 = r4.text
            r3.A07(r0)
            if (r8 == 0) goto L6b
            r0 = -1535732(0xffffffffffe8910c, float:NaN)
            r3.A00 = r0
        L6b:
            if (r12 == 0) goto L6f
            r3.A01 = r7
        L6f:
            int r0 = r11.othersCount
            if (r0 <= 0) goto L8e
            android.content.res.Resources r8 = r10.getResources()
            r2 = 2131755057(0x7f100031, float:1.9140983E38)
            int r1 = r11.othersCount
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r8.getQuantityString(r2, r1, r0)
            java.lang.CharSequence r0 = X.EG6.A00(r0)
            r3.A0H = r0
        L8e:
            java.lang.String r2 = r4.openUri
            r8 = 0
            if (r2 == 0) goto Lad
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r4.onStop
            if (r0 == 0) goto Lad
            com.facebook.aura.gateway.service.HatchForegroundServiceStopReceiver$Companion r1 = com.facebook.aura.gateway.service.HatchForegroundServiceStopReceiver.Companion
            android.content.Context r0 = X.AnonymousClass001.A0I(r10)
            android.app.PendingIntent r1 = r1.createPendingIntent(r0, r9, r2)
            if (r1 == 0) goto Lad
            r0 = 2131888918(0x7f120b16, float:1.9412485E38)
            java.lang.String r0 = r10.getString(r0)
            r3.A04(r1, r0, r6)
        Lad:
            android.graphics.Bitmap r0 = r4.image
            if (r0 == 0) goto Le5
            com.facebook.aura.gateway.service.FittedNotificationImages r2 = r10.fittedImages(r0)
            android.graphics.Bitmap r0 = r2.largeIcon
            r3.A05(r0)
            androidx.core.app.NotificationCompat$BigPictureStyle r1 = new androidx.core.app.NotificationCompat$BigPictureStyle
            r1.<init>()
            android.graphics.Bitmap r0 = r2.bigPicture
            r1.A06(r0)
            r1.A00 = r8
            r1.A01 = r7
            r3.A06(r1)
            r3.A05 = r6
            android.content.Context r0 = r10.getApplicationContext()
            X.EG6 r1 = X.C3cI.A08(r0, r5)
            java.lang.String r0 = r4.title
            r1.A08(r0)
            java.lang.String r0 = r4.text
            r1.A07(r0)
            android.app.Notification r0 = r1.A01()
            r3.A08 = r0
        Le5:
            return r3
        Le6:
            java.lang.String r5 = "aura_run_in_background"
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.service.HatchForegroundService.baseNotification(com.facebook.aura.gateway.service.PostedNotification, boolean):X.EG6");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Notification buildNotification(PostedNotification postedNotification, boolean z) {
        return postedNotification.runInBackground ? buildRunInBackgroundNotification(postedNotification, z) : buildNodeWorkNotification(postedNotification, z);
    }

    private final void disable() {
        AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
        if (currentSession != null) {
            C3cG.A0D(currentSession).setRunInBackgroundEnabled(false);
            HatchAgentExecution.Companion.getInstance(currentSession).stopAll();
        }
        NodeCommandService.Companion.cancelAll(AnonymousClass001.A0I(this));
        stop();
    }

    private final FittedNotificationImages fittedImages(Bitmap bitmap) {
        FittedNotificationImages fittedNotificationImages = this.fitted;
        if (fittedNotificationImages != null && this.fittedSource == bitmap) {
            return fittedNotificationImages;
        }
        FittedNotificationImages fittedNotificationImagesFitNotificationImages = BackgroundWorkNotificationPartsKt.fitNotificationImages(bitmap);
        this.fittedSource = bitmap;
        this.fitted = fittedNotificationImagesFitNotificationImages;
        return fittedNotificationImagesFitNotificationImages;
    }

    private final boolean holdsAgentTurn() {
        AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
        return currentSession != null && Companion.holdsAgentTurn(currentSession);
    }

    private final boolean isSessionInitializing() {
        return AuraSessionManager.state.getValue() instanceof AuraSessionManager.SessionState.Initializing;
    }

    private final boolean notificationDismissed() {
        AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
        if (currentSession == null) {
            return false;
        }
        return C3cH.A1R(BackgroundWork.INSTANCE.activeDismissed(currentSession));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean promoteToForeground(boolean z) {
        String str;
        resurfaceNotification();
        PostedNotification postedNotificationCurrentNotification = currentNotification();
        try {
            startForeground(NOTIFICATION_ID, buildNotification(postedNotificationCurrentNotification, z));
            this.postedNotification = postedNotificationCurrentNotification;
            HatchNodeServiceState.INSTANCE.running();
            return true;
        } catch (ForegroundServiceStartNotAllowedException unused) {
            Companion.recordStartFailure("promote", "start_not_allowed");
            str = "startForeground blocked for background running, stopping self";
            CFK.A06(TAG, str);
            HatchNodeServiceState.INSTANCE.stopped();
            stopSelfResult(this.lastStartId);
            return false;
        } catch (SecurityException unused2) {
            Companion.recordStartFailure("promote", "security");
            str = "startForeground denied, stopping self";
            CFK.A06(TAG, str);
            HatchNodeServiceState.INSTANCE.stopped();
            stopSelfResult(this.lastStartId);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object restoreRunInBackground(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.gateway.service.HatchForegroundService.AnonymousClass1
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.gateway.service.HatchForegroundService$restoreRunInBackground$1 r4 = (com.facebook.aura.gateway.service.HatchForegroundService.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r5 = 1
            if (r0 == 0) goto L2d
            if (r0 != r5) goto L28
            goto L24
        L1e:
            com.facebook.aura.gateway.service.HatchForegroundService$restoreRunInBackground$1 r4 = new com.facebook.aura.gateway.service.HatchForegroundService$restoreRunInBackground$1
            r4.<init>(r7)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L6c java.lang.Exception -> L6e
            goto L7e
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.auth.AuraSessionManager r0 = com.facebook.aura.auth.AuraSessionManager.INSTANCE
            X.CGz r2 = r0.getCurrentSession()
            if (r2 == 0) goto L7e
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r0 = X.C3cG.A0D(r2)
            boolean r0 = r0.getRunInBackgroundEnabled()
            if (r0 == 0) goto L7e
            com.facebook.aura.gateway.HatchBackgroundSession r0 = com.facebook.aura.gateway.HatchBackgroundSession.INSTANCE
            r0.start()
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L6c java.lang.Exception -> L6e
            android.content.Context r0 = X.AnonymousClass001.A0I(r6)     // Catch: java.util.concurrent.CancellationException -> L6c java.lang.Exception -> L6e
            r1.initialize(r0, r2)     // Catch: java.util.concurrent.CancellationException -> L6c java.lang.Exception -> L6e
            com.facebook.aura.gateway.HatchNodeClientAttachment r1 = com.facebook.aura.gateway.HatchNodeClientAttachment.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L6c java.lang.Exception -> L6e
            android.content.Context r0 = X.AnonymousClass001.A0I(r6)     // Catch: java.util.concurrent.CancellationException -> L6c java.lang.Exception -> L6e
            r1.ensureAttached(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L6c java.lang.Exception -> L6e
            com.facebook.aura.gateway.HatchGatewayConnection$Companion r0 = com.facebook.aura.gateway.HatchGatewayConnection.Companion     // Catch: java.util.concurrent.CancellationException -> L6c java.lang.Exception -> L6e
            com.facebook.aura.gateway.HatchGatewayConnection r2 = r0.getInstance(r2)     // Catch: java.util.concurrent.CancellationException -> L6c java.lang.Exception -> L6e
            r1 = 0
            r4.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L6c java.lang.Exception -> L6e
            r4.label = r5     // Catch: java.util.concurrent.CancellationException -> L6c java.lang.Exception -> L6e
            r0 = 0
            java.lang.Object r0 = r2.fetchAndConnect(r0, r0, r1, r4)     // Catch: java.util.concurrent.CancellationException -> L6c java.lang.Exception -> L6e
            if (r0 != r3) goto L7e
            return r3
        L6c:
            r0 = move-exception
            throw r0
        L6e:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "Run in background gateway connect failed: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "HatchForegroundService"
            X.CFK.A06(r0, r1)
        L7e:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.service.HatchForegroundService.restoreRunInBackground(X.HtJ):java.lang.Object");
    }

    private final void resurfaceNotification() {
        AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
        if (currentSession != null) {
            BackgroundWork.INSTANCE.resurfaceActive(currentSession);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C20Q<Integer> resurfaceOnNewRequest(AbstractC3358CGz abstractC3358CGz) {
        return new C10650I0u(new C121611(abstractC3358CGz, null), AnonymousClass602.A00(HatchAgentExecution.Companion.getInstance(abstractC3358CGz).requestCount), 5);
    }

    private final boolean runInBackgroundEnabled() {
        AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
        if (currentSession != null) {
            return C3cG.A0D(currentSession).getRunInBackgroundEnabled();
        }
        return false;
    }

    private final boolean shouldAlertNeedsUser(BackgroundWorkContent backgroundWorkContent) {
        if (backgroundWorkContent.state != BackgroundWorkState.NEEDS_USER) {
            this.alertedNeedsUserKey = null;
        } else {
            String str = backgroundWorkContent.openUri;
            if (str == null) {
                str = backgroundWorkContent.title;
            }
            if (!C7384Etj.areEqual(str, this.alertedNeedsUserKey)) {
                this.alertedNeedsUserKey = str;
                if (!AuraAppLifecycleManager.INSTANCE.isAppInForeground() && !HatchNotificationSuppression.voiceCallActive) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void startLeaseObserver() {
        HoC hoC = this.observerJob;
        if (hoC == null || !hoC.isActive()) {
            this.observerJob = AnonymousClass001.A11(new C121621(null), this.scope);
        }
    }

    private final int stickiness() {
        return ((AuraSessionManager.state.getValue() instanceof AuraSessionManager.SessionState.Initializing) || runInBackgroundEnabled()) ? 3 : 2;
    }

    private final void stop() {
        HatchNodeServiceState.INSTANCE.stopped();
        HoC hoC = this.observerJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.observerJob = null;
        HatchBackgroundSession.INSTANCE.end();
        stopForeground(1);
        this.postedNotification = null;
        this.alertedNeedsUserKey = null;
        stopSelfResult(this.lastStartId);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        this.lastStartId = i2;
        if (intent != null && (action = intent.getAction()) != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -854210643) {
                if (iHashCode != -244403745) {
                    if (iHashCode == 1583723627 && action.equals(ACTION_STOP)) {
                        stop();
                        return 2;
                    }
                } else if (action.equals(ACTION_DISABLE)) {
                    disable();
                    return 2;
                }
            } else if (action.equals(ACTION_LEASE_REFRESH)) {
                return handleLeaseRefresh(intent.getBooleanExtra(EXTRA_IMMEDIATE_NOTIFICATION, false));
            }
        }
        return handleEnable();
    }

    private final Notification buildNodeWorkNotification(PostedNotification postedNotification, boolean z) {
        ensureNotificationChannel();
        Notification notificationA01 = baseNotification(postedNotification, z).A01();
        C7384Etj.A0U(notificationA01);
        return notificationA01;
    }

    private final Notification buildRunInBackgroundNotification(PostedNotification postedNotification, boolean z) {
        ensureNotificationChannel();
        Context applicationContext = getApplicationContext();
        Intent intent = new Intent(getApplicationContext(), (Class<?>) HatchForegroundService.class);
        intent.setAction(ACTION_DISABLE);
        PendingIntent service = PendingIntent.getService(applicationContext, 0, intent, 201326592);
        EG6 eg6BaseNotification = baseNotification(postedNotification, z);
        eg6BaseNotification.A04(service, getString(R.string._name_removed__res_0x7f120b18), 0);
        Notification notificationA01 = eg6BaseNotification.A01();
        C7384Etj.A0U(notificationA01);
        return notificationA01;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[PHI: r3
  0x0027: PHI (r3v2 com.facebook.aura.backgroundwork.api.BackgroundWorkContent) = 
  (r3v0 com.facebook.aura.backgroundwork.api.BackgroundWorkContent)
  (r3v3 com.facebook.aura.backgroundwork.api.BackgroundWorkContent)
 binds: [B:7:0x001e, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.gateway.service.PostedNotification currentNotification() {
        /*
            r10 = this;
            com.facebook.aura.backgroundwork.api.BackgroundWorkHeadline r0 = r10.backgroundWorkHeadline()
            boolean r2 = r10.runInBackgroundEnabled()
            if (r0 == 0) goto Le
            com.facebook.aura.backgroundwork.api.BackgroundWorkContent r3 = r0.content
            if (r3 != 0) goto L27
        Le:
            java.lang.String r4 = r10.defaultTitle()
            r5 = 0
            com.facebook.aura.backgroundwork.api.BackgroundWorkState r9 = com.facebook.aura.backgroundwork.api.BackgroundWorkState.RUNNING
            r10 = 0
            com.facebook.aura.backgroundwork.api.BackgroundWorkContent r3 = new com.facebook.aura.backgroundwork.api.BackgroundWorkContent
            r6 = r5
            r7 = r5
            r8 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            if (r0 != 0) goto L27
            r1 = 0
        L21:
            com.facebook.aura.gateway.service.PostedNotification r0 = new com.facebook.aura.gateway.service.PostedNotification
            r0.<init>(r2, r3, r1)
            return r0
        L27:
            int r1 = r0.othersCount
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.service.HatchForegroundService.currentNotification():com.facebook.aura.gateway.service.PostedNotification");
    }

    private final String defaultTitle() {
        int i;
        Object[] objArr;
        String strAgentName;
        if (runInBackgroundEnabled() || !holdsAgentTurn()) {
            i = R.string._name_removed__res_0x7f120b15;
            objArr = new Object[1];
            strAgentName = HatchAppName.value;
        } else {
            i = R.string._name_removed__res_0x7f120b13;
            strAgentName = agentName();
            objArr = new Object[1];
        }
        objArr[0] = strAgentName;
        return getString(i, objArr);
    }

    private final void ensureNotificationChannel() {
        Object systemService = getApplicationContext().getSystemService("notification");
        C7384Etj.A0Z(systemService, C60N.A00(26));
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationManager.getNotificationChannel(CHANNEL_ID) == null) {
            notificationManager.createNotificationChannel(new NotificationChannel(CHANNEL_ID, "Running in background", 2));
        }
    }

    private final int handleLeaseRefresh(boolean z) {
        if (!promoteToForeground(z)) {
            return 2;
        }
        startLeaseObserver();
        return stickiness();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshForegroundState() {
        if (!shouldRun()) {
            stop();
        } else if (notificationDismissed()) {
            this.postedNotification = null;
        } else {
            if (currentNotification().equals(this.postedNotification)) {
                return;
            }
            promoteToForeground(false);
        }
    }

    private final boolean shouldRun() {
        AbstractC3358CGz currentSession;
        return runInBackgroundEnabled() || C3cH.A1R(HatchNodeOperationLease.hasOperationLease) || ((currentSession = AuraSessionManager.INSTANCE.getCurrentSession()) != null && Companion.hasBackgroundAgentWork$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service(currentSession));
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.observerJob = C3cI.A15(this.observerJob);
        HatchNodeServiceState.INSTANCE.stopped();
    }
}
