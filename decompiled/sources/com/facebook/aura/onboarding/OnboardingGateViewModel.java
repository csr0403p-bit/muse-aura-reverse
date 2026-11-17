package com.facebook.aura.onboarding;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.BLL;
import X.Bs8;
import X.C1BN;
import X.C20Z;
import X.C31u;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60Q;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.InterfaceC7359EnW;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.HatchGatewayStateSnapshot;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.onboarding.MC;
import com.facebook.aura.qpl.startup.HatchStartupQpl;
import com.facebook.aura.qpl.startup.HatchStartupTracker;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class OnboardingGateViewModel extends AEs {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(OnboardingGateViewModel.class, "vmConnectionWaitTimeoutMs", "getVmConnectionWaitTimeoutMs()J");
    public final BLG<OnboardingGateUiState> _uiState;
    public volatile OnboardingGateDecision gateDecision;
    public final HatchGatewayConnection gateway;
    public final AtomicReference<OnboardingGateAttempt> pendingAttempt;
    public int resolveAttempt;
    public HoC resolveJob;
    public int retryCount;
    public final OnboardingStateManager stateManager;
    public final C1BN<OnboardingGateUiState> uiState;
    public final AbstractC3358CGz userSession;
    public final C31u vmConnectionWaitTimeoutMs$delegate;
    public final String vmIdAtEntry;

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingGateViewModel$1", f = "OnboardingGateViewModel.kt", l = {103}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingGateViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return OnboardingGateViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return OnboardingGateViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final OnboardingGateViewModel onboardingGateViewModel = OnboardingGateViewModel.this;
                BLG<OnboardingGateUiState> blg = onboardingGateViewModel._uiState;
                C20Z<? super OnboardingGateUiState> c20z = new C20Z() { // from class: com.facebook.aura.onboarding.OnboardingGateViewModel.1.1
                    public final Object emit(OnboardingGateUiState onboardingGateUiState, HtJ<? super Unit> htJ) {
                        onboardingGateViewModel.annotateStartup();
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        onboardingGateViewModel.annotateStartup();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (blg.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingGateViewModel$2", f = "OnboardingGateViewModel.kt", l = {105}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingGateViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return OnboardingGateViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return OnboardingGateViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final OnboardingGateViewModel onboardingGateViewModel = OnboardingGateViewModel.this;
                C1BN<HatchGatewayConnectionState> c1bn = onboardingGateViewModel.gateway.connectionState;
                C20Z<? super HatchGatewayConnectionState> c20z = new C20Z() { // from class: com.facebook.aura.onboarding.OnboardingGateViewModel.2.1
                    public final Object emit(HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Unit> htJ) {
                        if ((hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Connected) && C60Q.A0L(onboardingGateViewModel).isError) {
                            CFK.A03(C3cG.A0R(C60Q.A0I(onboardingGateViewModel.gateway).connectionCycle), OnboardingGateViewModelKt.TAG, "Gateway connected: cycle=%d; resuming gate resolution");
                            onboardingGateViewModel.resolve(OnboardingGateResolveTrigger.AUTO_RECONNECT);
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchGatewayConnectionState) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }
    }

    public final class Factory extends AuraViewModelFactory<OnboardingGateViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public OnboardingGateViewModel create() {
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            return new OnboardingGateViewModel(abstractC3358CGz, OnboardingStateManager.Companion.getInstance(abstractC3358CGz));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingGateViewModel$resolve$3", f = "OnboardingGateViewModel.kt", l = {200, 203, 250}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingGateViewModel$resolve$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ OnboardingGateAttempt $attempt;
        public final /* synthetic */ int $currentResolveAttempt;
        public final /* synthetic */ OnboardingGateResolveTrigger $trigger;
        public int I$0;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public boolean Z$0;
        public boolean Z$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OnboardingGateResolveTrigger onboardingGateResolveTrigger, int i, OnboardingGateAttempt onboardingGateAttempt, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$trigger = onboardingGateResolveTrigger;
            this.$currentResolveAttempt = i;
            this.$attempt = onboardingGateAttempt;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return OnboardingGateViewModel.this.new AnonymousClass3(this.$trigger, this.$currentResolveAttempt, this.$attempt, htJ);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(36:154|(3:4|145|(2:6|(2:8|(12:10|11|143|72|129|73|98|(1:100)|101|(3:103|(2:105|(1:107))|108)(4:111|(3:113|(1:115)|116)(3:121|(1:123)|124)|117|(1:118))|109|110)(2:12|13))(31:14|131|15|152|39|(2:133|41)(1:44)|45|137|46|135|(1:48)(2:49|(1:51)(1:52))|53|(1:(1:56)(1:57))|58|(3:59|(1:61)(1:62)|63)|65|139|68|141|69|(1:71)|143|72|129|73|98|(0)|101|(0)(0)|109|110))(2:18|19))(8:20|(1:22)|23|146|24|25|26|(1:28))|29|150|30|(2:148|32)(1:35)|36|(1:38)|152|39|(0)(0)|45|137|46|135|(0)(0)|53|(0)|58|(3:59|(0)(0)|63)|65|139|68|141|69|(0)|143|72|129|73|98|(0)|101|(0)(0)|109|110) */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x033e, code lost:
        
            r2 = null;
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x0342, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x01c9, code lost:
        
            r9 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0230, code lost:
        
            r9 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0232, code lost:
        
            r9 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0234, code lost:
        
            r9 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0236, code lost:
        
            r9 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0238, code lost:
        
            r9 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x023a, code lost:
        
            r9 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x023c, code lost:
        
            r9 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0249, code lost:
        
            r1 = (com.facebook.aura.json.NetworkException) r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0252, code lost:
        
            r2 = X.C3cG.A0R(r1.httpResponseCode);
            r1 = r1.errorCode;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x0273  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0278  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x02a5  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x033e  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x0342  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0128 A[Catch: Exception -> 0x01c9, CancellationException -> 0x0345, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01c9, blocks: (B:48:0x0128, B:61:0x01a1, B:51:0x012f), top: B:135:0x0126 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x012b A[Catch: Exception -> 0x0238, CancellationException -> 0x0345, TRY_ENTER, TryCatch #4 {Exception -> 0x0238, blocks: (B:46:0x011a, B:53:0x0134, B:58:0x0149, B:59:0x0198, B:63:0x01a6, B:65:0x01be, B:62:0x01a4, B:49:0x012b, B:52:0x0132), top: B:137:0x011a }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01a1 A[Catch: Exception -> 0x01c9, CancellationException -> 0x0345, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01c9, blocks: (B:48:0x0128, B:61:0x01a1, B:51:0x012f), top: B:135:0x0126 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01a4 A[Catch: Exception -> 0x0238, CancellationException -> 0x0345, TRY_ENTER, TryCatch #4 {Exception -> 0x0238, blocks: (B:46:0x011a, B:53:0x0134, B:58:0x0149, B:59:0x0198, B:63:0x01a6, B:65:0x01be, B:62:0x01a4, B:49:0x012b, B:52:0x0132), top: B:137:0x011a }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01f1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0249  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0252  */
        /* JADX WARN: Type inference failed for: r0v2, types: [T, com.facebook.aura.onboarding.OnboardingGateVmWait] */
        /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r3v1, types: [T, com.facebook.aura.onboarding.OnboardingGateVmWait] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instructions count: 839
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.OnboardingGateViewModel.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolve(OnboardingGateResolveTrigger onboardingGateResolveTrigger) {
        HoC hoC = this.resolveJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        int i = this.resolveAttempt + 1;
        this.resolveAttempt = i;
        OnboardingGateAttempt onboardingGateAttempt = new OnboardingGateAttempt(i, onboardingGateResolveTrigger);
        OnboardingGateAttempt andSet = this.pendingAttempt.getAndSet(onboardingGateAttempt);
        if (andSet != null) {
            OnboardingGateLogging.INSTANCE.logAbandoned(andSet, C60Q.A0L(this).loadingPhase, this.gateDecision);
        }
        int i2 = onboardingGateAttempt.number;
        BLG<OnboardingGateUiState> blg = this._uiState;
        while (!blg.A6e(blg.getValue(), new OnboardingGateUiState(false, onboardingGateAttempt.number, OnboardingGateLoadingPhase.WAITING_VM_CONNECTION, null))) {
        }
        CFK.A00(Integer.valueOf(i2), onboardingGateResolveTrigger.getWireValue(), Boolean.valueOf(C60Q.A0L(this).isError), C60Q.A0L(this).loadingPhase, OnboardingGateViewModelKt.TAG, "Gate resolve started: attempt=%d trigger=%s isError=%s loadingPhase=%s");
        BLL bllA00 = AEu.A00(this);
        this.resolveJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new AnonymousClass3(onboardingGateResolveTrigger, i2, onboardingGateAttempt, null), bllA00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void annotateStartup() {
        HatchStartupTracker hatchStartupTracker = HatchStartupTracker.INSTANCE;
        hatchStartupTracker.annotate(HatchStartupPoints.ANNOTATION_ONBOARDING_GATE_STATE, OnboardingGateState.Companion.of(C60Q.A0L(this)).getWireValue());
        HatchStartupQpl.Companion.markerAnnotate(HatchStartupPoints.ANNOTATION_ONBOARDING_GATE_RETRY_COUNT, this.retryCount);
        OnboardingGateDecision onboardingGateDecision = this.gateDecision;
        if (onboardingGateDecision != null) {
            hatchStartupTracker.annotate("onboarding_gate", onboardingGateDecision.getWireValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getVmConnectionWaitTimeoutMs() {
        return C3cG.A05(this.vmConnectionWaitTimeoutMs$delegate.getValue(this, $$delegatedProperties[0]));
    }

    private final void logOnce(OnboardingGateAttempt onboardingGateAttempt, Function0<Unit> function0) {
        if (Bs8.A00(onboardingGateAttempt, null, this.pendingAttempt)) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(String str, int i) {
        OnboardingGateUiState value;
        int i2;
        OnboardingGateLoadingPhase onboardingGateLoadingPhase;
        OnboardingGateDestination onboardingGateDestination;
        BLG<OnboardingGateUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            OnboardingGateUiState onboardingGateUiState = value;
            i2 = onboardingGateUiState.attemptNumber;
            onboardingGateLoadingPhase = onboardingGateUiState.loadingPhase;
            onboardingGateDestination = onboardingGateUiState.destination;
            C7384Etj.A0Y(onboardingGateLoadingPhase, 2);
        } while (!blg.A6e(value, new OnboardingGateUiState(true, i2, onboardingGateLoadingPhase, onboardingGateDestination)));
        HatchGatewayStateSnapshot hatchGatewayStateSnapshotA0I = C60Q.A0I(HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession));
        CFK.A0F(OnboardingGateViewModelKt.TAG, "Error state updated: gateAttempt=%d reason=%s isError=%s gatewayState=%s cycle=%d", Integer.valueOf(i), str, Boolean.valueOf(C60Q.A0L(this).isError), C3cI.A0Y(hatchGatewayStateSnapshotA0I.connection), Integer.valueOf(hatchGatewayStateSnapshotA0I.connectionCycle));
    }

    public final C1BN<OnboardingGateUiState> getUiState() {
        return this.uiState;
    }

    @Override // X.AEs
    public void onCleared() {
        OnboardingGateAttempt andSet = this.pendingAttempt.getAndSet(null);
        if (andSet != null) {
            OnboardingGateLogging.INSTANCE.logAbandoned(andSet, C60Q.A0L(this).loadingPhase, this.gateDecision);
        }
    }

    public final void retry() {
        HatchGatewayStateSnapshot hatchGatewayStateSnapshotA0I = C60Q.A0I(this.gateway);
        CFK.A00(Boolean.valueOf(C60Q.A0L(this).isError), C60Q.A0L(this).loadingPhase, C3cI.A0Y(hatchGatewayStateSnapshotA0I.connection), Integer.valueOf(hatchGatewayStateSnapshotA0I.connectionCycle), OnboardingGateViewModelKt.TAG, "Retry requested: previousError=%s previousLoadingPhase=%s gatewayState=%s cycle=%d forceConnect=true");
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_POST_AUTH, HatchScreen.ONBOARDING_GATE, HatchComponent.RETRY_BUTTON, null, null, null);
        this.retryCount++;
        resolve(OnboardingGateResolveTrigger.RETRY);
    }

    public OnboardingGateViewModel(AbstractC3358CGz abstractC3358CGz, OnboardingStateManager onboardingStateManager) {
        boolean zA1b = AnonymousClass004.A1b(abstractC3358CGz, onboardingStateManager);
        this.userSession = abstractC3358CGz;
        this.stateManager = onboardingStateManager;
        this.vmConnectionWaitTimeoutMs$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigLong(MC.hatch_android_sessionless.onboarding_vm_connection_wait_timeout_ms);
        C9286GCn c9286GCnA14 = C3cG.A14(new OnboardingGateUiState(zA1b, zA1b ? 1 : 0, OnboardingGateLoadingPhase.WAITING_VM_CONNECTION, null));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        HatchGatewayServiceManager hatchGatewayServiceManager = HatchGatewayServiceManager.INSTANCE;
        this.gateway = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        this.vmIdAtEntry = C3cG.A0D(abstractC3358CGz).hatcheryVmIdFlow.getValue();
        this.pendingAttempt = new AtomicReference<>(null);
        BLL bllA00 = AEu.A00(this);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, new AnonymousClass2(null), AnonymousClass001.A0e(this, num, c6ys, anonymousClass1, bllA00));
        resolve(OnboardingGateResolveTrigger.INITIAL);
    }

    public final void onScreenResumed() {
        annotateStartup();
    }
}
