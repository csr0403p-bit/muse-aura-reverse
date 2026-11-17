package com.facebook.aura.gateway.service;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass602;
import X.BV6;
import X.C10533Hqc;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3rb;
import X.C4o7;
import X.C60P;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.GAo;
import X.GDB;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import android.content.Context;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.gateway.HatchAgentExecution;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayPreconnect;
import com.facebook.aura.gateway.NodeForegroundServiceState;
import com.facebook.aura.gateway.connection.ConnectionDemandOutcome;
import com.facebook.aura.gateway.service.HatchForegroundService;
import com.facebook.aura.gateway.service.NoiseHttpDemandFence;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.main.HatchActiveSessionHostKt;
import com.facebook.aura.network.noise.AuraNoiseConnectionDemandRejectionReason;
import com.facebook.aura.network.noise.AuraNoiseVmTransport;
import com.facebook.aura.nodes.transport.HatchNodeOperationLease;
import com.facebook.aura.nodes.transport.HatchNodeServiceState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.user.provider.HatchGatewayConnectOwnership;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class HatchGatewayServiceManager {
    public static Context appContext;
    public static HoC leaseObserverJob;
    public static HoC lifecycleObserverJob;
    public static boolean signOutCallbackRegistered;
    public static final HatchGatewayServiceManager INSTANCE = new HatchGatewayServiceManager();
    public static final C3UX scope = C78T.A00();
    public static final NoiseHttpDemandFence<AbstractC3358CGz> noiseHttpDemandFence = new NoiseHttpDemandFence<>();

    @DebugMetadata(c = "com.facebook.aura.gateway.service.HatchGatewayServiceManager", f = "HatchGatewayServiceManager.kt", l = {293}, m = "handleNoiseHttpDemand", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.HatchGatewayServiceManager$handleNoiseHttpDemand$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayServiceManager.this.handleNoiseHttpDemand(null, 0L, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.service.HatchGatewayServiceManager$onAppForeground$1", f = "HatchGatewayServiceManager.kt", l = {225}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.HatchGatewayServiceManager$onAppForeground$1, reason: invalid class name and case insensitive filesystem */
    public final class C121631 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gw;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121631(HatchGatewayConnection hatchGatewayConnection, HtJ<? super C121631> htJ) {
            super(2, htJ);
            this.$gw = hatchGatewayConnection;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C121631(this.$gw, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C121631(this.$gw, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchGatewayConnection hatchGatewayConnection = this.$gw;
                    this.label = 1;
                    if (hatchGatewayConnection.fetchAndConnect(false, false, null, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (Exception e) {
                CFK.A04(HatchGatewayServiceManagerKt.TAG, FGI.A0M("Failed to reconnect after foreground return: ", e.getMessage()));
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.gateway.service.HatchGatewayServiceManager$registerNoiseHttpDemandHandler$1, reason: invalid class name and case insensitive filesystem */
    public final class C121641 extends AbstractC7559F3s implements G0V<Long, String, Boolean> {
        public final /* synthetic */ NoiseHttpDemandFence.SessionToken<AbstractC3358CGz> $token;

        public final Boolean invoke(long j, String str) {
            C7384Etj.A0Y(str, 1);
            Long lValueOf = Long.valueOf(j);
            CFK.A03(lValueOf, HatchGatewayServiceManagerKt.TAG, "Noise HTTP connection demand received: id=%d");
            C3UX c3ux = HatchGatewayServiceManager.scope;
            C10533Hqc c10533HqcA02 = GAo.A02(C79.A01, C6ys.A00, new HatchGatewayServiceManager$registerNoiseHttpDemandHandler$1$job$1(this.$token, j, str, null), c3ux);
            NoiseHttpDemandFence.Installation<AbstractC3358CGz> installationTryInstall = HatchGatewayServiceManager.noiseHttpDemandFence.tryInstall(this.$token, j, c10533HqcA02);
            if (!installationTryInstall.accepted) {
                c10533HqcA02.A5w(null);
                return false;
            }
            NoiseHttpDemandFence.Demand<AbstractC3358CGz> demand = installationTryInstall.replacedDemand;
            if (demand != null) {
                CFK.A0H(HatchGatewayServiceManagerKt.TAG, "Noise HTTP connection demand superseded before completion: old=%d new=%d", Long.valueOf(demand.id), lValueOf);
                HatchGatewayServiceManager.rejectNoiseHttpDemand$default(HatchGatewayServiceManager.INSTANCE, demand, AuraNoiseConnectionDemandRejectionReason.INTERNAL, false, 4, null);
            }
            c10533HqcA02.Afv();
            return true;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121641(NoiseHttpDemandFence.SessionToken<AbstractC3358CGz> sessionToken) {
            super(2);
            this.$token = sessionToken;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Boolean invoke(Long l, String str) {
            return invoke(C3cG.A05(l), str);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.service.HatchGatewayServiceManager$startLeaseEscalationObserver$1", f = "HatchGatewayServiceManager.kt", l = {HatchMessageShareDocumentRenderer.CONTENT_TOP_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.HatchGatewayServiceManager$startLeaseEscalationObserver$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C121651 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.gateway.service.HatchGatewayServiceManager$startLeaseEscalationObserver$1$1", f = "HatchGatewayServiceManager.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.gateway.service.HatchGatewayServiceManager$startLeaseEscalationObserver$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01741 extends AbstractC07127nr implements G0W<Boolean, Boolean, HtJ<? super HxE<? extends Boolean, ? extends Boolean>>, Object> {
            public /* synthetic */ boolean Z$0;
            public /* synthetic */ boolean Z$1;
            public int label;

            public C01741(HtJ<? super C01741> htJ) {
                super(3, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                boolean z2 = this.Z$1;
                if (this.label == 0) {
                    return AnonymousClass002.A0q(AnonymousClass001.A0k(obj, z), z2);
                }
                throw AnonymousClass001.A0n();
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, HtJ<? super HxE<? extends Boolean, ? extends Boolean>> htJ) {
                return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), (HtJ<? super HxE<Boolean, Boolean>>) htJ);
            }

            public final Object invoke(boolean z, boolean z2, HtJ<? super HxE<Boolean, Boolean>> htJ) {
                C01741 c01741 = new C01741(htJ);
                c01741.Z$0 = z;
                c01741.Z$1 = z2;
                return c01741.invokeSuspend(Unit.INSTANCE);
            }
        }

        public C121651(HtJ<? super C121651> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C121651(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass602 anonymousClass602A00 = C4o7.A00(AnonymousClass2.INSTANCE, GDB.A01(C3rb.A03(new C01741(null), HatchNodeOperationLease.isHeldFlow, HatchNodeOperationLease.hasHostLease)));
                Object obj2 = new C20Z() { // from class: com.facebook.aura.gateway.service.HatchGatewayServiceManager.startLeaseEscalationObserver.1.3
                    public final Object emit(HxE<Boolean, Boolean> hxE, HtJ<? super Unit> htJ) {
                        Context context;
                        boolean zA1X = AnonymousClass001.A1X(hxE.first);
                        if ((AnonymousClass001.A1X(hxE.second) || (zA1X && !NodeForegroundServiceState.INSTANCE.isForeground())) && (context = HatchGatewayServiceManager.appContext) != null) {
                            HatchForegroundService.Companion.refreshLease(context);
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj3, HtJ htJ) {
                        return emit((HxE<Boolean, Boolean>) obj3, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (anonymousClass602A00.collect(obj2, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.facebook.aura.gateway.service.HatchGatewayServiceManager$startLeaseEscalationObserver$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HxE<? extends Boolean, ? extends Boolean>, Long> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            public AnonymousClass2() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Long invoke2(HxE<Boolean, Boolean> hxE) {
                C7384Etj.A0Y(hxE, 0);
                return Long.valueOf(AnonymousClass001.A1X(hxE.second) ? 0L : 3000L);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Long invoke(HxE<? extends Boolean, ? extends Boolean> hxE) {
                return invoke2((HxE<Boolean, Boolean>) hxE);
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C121651(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.service.HatchGatewayServiceManager$startLifecycleObserver$1", f = "HatchGatewayServiceManager.kt", l = {167}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.HatchGatewayServiceManager$startLifecycleObserver$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C121661 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C121661(HtJ<? super C121661> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C121661(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<Boolean> c20q = AuraAppLifecycleManager.isAppInForegroundFlow;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.gateway.service.HatchGatewayServiceManager.startLifecycleObserver.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        HatchGatewayServiceManager hatchGatewayServiceManager = HatchGatewayServiceManager.INSTANCE;
                        if (z) {
                            hatchGatewayServiceManager.onAppForeground();
                        } else {
                            hatchGatewayServiceManager.gateway();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20q.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C121661(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleNoiseHttpDemand(com.facebook.aura.gateway.service.NoiseHttpDemandFence.SessionToken<X.AbstractC3358CGz> r12, long r13, java.lang.String r15, X.HtJ<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.service.HatchGatewayServiceManager.handleNoiseHttpDemand(com.facebook.aura.gateway.service.NoiseHttpDemandFence$SessionToken, long, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final HatchGatewayConnection getGateway(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectionDemandOutcome.values().length];
            try {
                AnonymousClass002.A13(ConnectionDemandOutcome.CONNECTED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectionDemandOutcome.BACKGROUND, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConnectionDemandOutcome.OFFLINE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ConnectionDemandOutcome.PAUSED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ConnectionDemandOutcome.RETRY_EXHAUSTED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ConnectionDemandOutcome.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void completeNoiseHttpDemand(NoiseHttpDemandFence.SessionToken<AbstractC3358CGz> sessionToken, long j) {
        noiseHttpDemandFence.take(sessionToken, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchGatewayConnection gateway() {
        AbstractC3358CGz abstractC3358CGzCurrentSession = noiseHttpDemandFence.currentSession();
        if (abstractC3358CGzCurrentSession == null) {
            return null;
        }
        return HatchGatewayConnection.Companion.getInstance(abstractC3358CGzCurrentSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAppForeground() {
        HatchGatewayConnectOwnership companion;
        HatchForegroundService.Companion.onAppVisibilityChanged$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service(true);
        HatchGatewayConnection hatchGatewayConnectionGateway = gateway();
        if (hatchGatewayConnectionGateway != null) {
            hatchGatewayConnectionGateway.setAssistOverlayActive(false);
        }
        gateway();
        AbstractC3358CGz abstractC3358CGzCurrentSession = noiseHttpDemandFence.currentSession();
        if (abstractC3358CGzCurrentSession != null && (companion = HatchGatewayConnectOwnership.Companion.getInstance(abstractC3358CGzCurrentSession)) != null && companion.consumeInitialForegroundEmissionSkip()) {
            CFK.A05(HatchActiveSessionHostKt.TAG, AnonymousClass007.A0a("foreground initial connect skipped owner=", companion.owner));
            return;
        }
        HatchGatewayConnection hatchGatewayConnectionGateway2 = gateway();
        if (hatchGatewayConnectionGateway2 == null || hatchGatewayConnectionGateway2.isConnected()) {
            return;
        }
        AnonymousClass001.A1J(new C121631(hatchGatewayConnectionGateway2, null), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerNoiseHttpDemandHandler(NoiseHttpDemandFence.SessionToken<AbstractC3358CGz> sessionToken) {
        AuraNoiseVmTransport.INSTANCE.registerConnectionDemandHandler(new C121641(sessionToken));
    }

    private final void rejectNoiseHttpDemand(NoiseHttpDemandFence.Demand<AbstractC3358CGz> demand, AuraNoiseConnectionDemandRejectionReason auraNoiseConnectionDemandRejectionReason, boolean z) {
        if (z) {
            demand.job.A5w(null);
        }
        long j = demand.id;
        CFK.A02(Long.valueOf(j), auraNoiseConnectionDemandRejectionReason, HatchGatewayServiceManagerKt.TAG, "Noise HTTP connection demand rejected: id=%d reason=%s");
        AuraNoiseVmTransport.INSTANCE.rejectConnectionDemand(j, auraNoiseConnectionDemandRejectionReason);
    }

    private final void startLeaseEscalationObserver() {
        HtJ htJA13 = AnonymousClass006.A13(leaseObserverJob);
        leaseObserverJob = AnonymousClass001.A11(new C121651(htJA13), scope);
    }

    private final void startLifecycleObserver() {
        HtJ htJA13 = AnonymousClass006.A13(lifecycleObserverJob);
        lifecycleObserverJob = AnonymousClass001.A11(new C121661(htJA13), scope);
    }

    public final void onAppBackgrounded$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service() {
        Context context = appContext;
        if (context != null) {
            HatchForegroundService.Companion companion = HatchForegroundService.Companion;
            companion.onAppVisibilityChanged$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service(false);
            AbstractC3358CGz abstractC3358CGzCurrentSession = noiseHttpDemandFence.currentSession();
            if (abstractC3358CGzCurrentSession == null || AnonymousClass001.A1X(HatchNodeServiceState.isForeground.getValue()) || !companion.hasBackgroundAgentWork$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service(abstractC3358CGzCurrentSession)) {
                return;
            }
            companion.refreshLease(context);
        }
    }

    public final void reset() {
        HatchGatewayConnection companion;
        NoiseHttpDemandFence.Invalidation<AbstractC3358CGz> invalidationInvalidate = noiseHttpDemandFence.invalidate(HatchGatewayServiceManager$reset$invalidated$1.INSTANCE, HatchGatewayServiceManager$reset$invalidated$2.INSTANCE);
        AbstractC3358CGz abstractC3358CGz = invalidationInvalidate.session;
        if (abstractC3358CGz != null) {
            HatchGatewayPreconnect.INSTANCE.cancelParkedGatewayTransport(abstractC3358CGz);
        }
        AbstractC3358CGz abstractC3358CGz2 = invalidationInvalidate.session;
        if (abstractC3358CGz2 != null && (companion = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz2)) != null) {
            companion.clearUserData();
        }
        HoC hoC = lifecycleObserverJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        lifecycleObserverJob = null;
        HoC hoC2 = leaseObserverJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        leaseObserverJob = null;
        Context context = appContext;
        appContext = null;
        if (context != null) {
            HatchForegroundService.Companion.stopService(context);
        }
    }

    private final void onAppBackground() {
        gateway();
    }

    private final String persistedGatewayUrl(AbstractC3358CGz abstractC3358CGz) {
        String strA1K = C60P.A1K(abstractC3358CGz);
        if (strA1K.length() <= 0) {
            return null;
        }
        return strA1K;
    }

    public static /* synthetic */ void rejectNoiseHttpDemand$default(HatchGatewayServiceManager hatchGatewayServiceManager, NoiseHttpDemandFence.Demand demand, AuraNoiseConnectionDemandRejectionReason auraNoiseConnectionDemandRejectionReason, boolean z, int i, Object obj) {
        hatchGatewayServiceManager.rejectNoiseHttpDemand((NoiseHttpDemandFence.Demand<AbstractC3358CGz>) demand, auraNoiseConnectionDemandRejectionReason, BV6.A1U(i, z));
    }

    public final void beginAgentExecution(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
        AnonymousClass003.A0v(abstractC3358CGz, str2);
        if (appContext == null || !AuraSessionManager.INSTANCE.isCurrentSession(abstractC3358CGz)) {
            return;
        }
        HatchAgentExecution.Companion.getInstance(abstractC3358CGz).beginRequest(str2, str);
    }

    public final void initialize(Context context, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1Y = C60P.A1Y(context, abstractC3358CGz);
        NoiseHttpDemandFence.SessionUpdate<AbstractC3358CGz> session = noiseHttpDemandFence.setSession(abstractC3358CGz, HatchGatewayServiceManager$initialize$sessionUpdate$1.INSTANCE);
        appContext = context.getApplicationContext();
        if (session.changed) {
            HatchGatewayPreconnect.INSTANCE.cancelParkedTransportFromOtherSession(abstractC3358CGz);
            NoiseHttpDemandFence.Demand<AbstractC3358CGz> demand = session.replacedDemand;
            if (demand != null) {
                INSTANCE.rejectNoiseHttpDemand(demand, AuraNoiseConnectionDemandRejectionReason.SESSION_ENDED, zA1Y);
            }
        }
        if (!signOutCallbackRegistered) {
            signOutCallbackRegistered = zA1Y;
            AuraSessionManager.INSTANCE.addSignOutCallback(new Runnable() { // from class: com.facebook.aura.gateway.service.HatchGatewayServiceManager.initialize.2
                @Override // java.lang.Runnable
                public final void run() {
                    HatchGatewayServiceManager.INSTANCE.reset();
                }
            });
        }
        if (session.wasInitialized) {
            return;
        }
        startLifecycleObserver();
        startLeaseEscalationObserver();
    }

    public final void onAssistOverlayDismissed() {
        HatchGatewayConnection hatchGatewayConnectionGateway = gateway();
        if (hatchGatewayConnectionGateway != null) {
            hatchGatewayConnectionGateway.setAssistOverlayActive(false);
        }
        if (AuraAppLifecycleManager.INSTANCE.isAppInForeground()) {
            return;
        }
        onAppBackgrounded$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service();
    }

    private final void rejectNoiseHttpDemand(NoiseHttpDemandFence.SessionToken<AbstractC3358CGz> sessionToken, long j, AuraNoiseConnectionDemandRejectionReason auraNoiseConnectionDemandRejectionReason) {
        NoiseHttpDemandFence.Demand<AbstractC3358CGz> demandTake = noiseHttpDemandFence.take(sessionToken, j);
        if (demandTake != null) {
            rejectNoiseHttpDemand(demandTake, auraNoiseConnectionDemandRejectionReason, false);
        }
    }
}
