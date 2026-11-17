package com.facebook.aura.localbrowser;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC10623Hzj;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass441;
import X.AnonymousClass603;
import X.BLG;
import X.C1BN;
import X.C20Q;
import X.C3Es;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C3rb;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAX;
import X.GCV;
import X.HtJ;
import X.Hu1;
import X.Hwg;
import X.HzR;
import com.facebook.aura.browsertask.control.BrowserTaskControlTransport;
import com.facebook.aura.browsertask.control.BrowserTaskStopKt;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.common.coroutines.LazyStartSingleFlightImpl;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.model.BrowserTaskIdKt;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class LocalBrowserMissingTaskViewModel extends AEs {
    public static final int $stable = 8;
    public final String browserTaskId;
    public final HzR<Unit> closeEvents;
    public final C20Q<Unit> closeScreen;
    public final LocalBrowserTaskRegistry registry;
    public final BrowserTaskRepository repository;
    public final SingleFlight stopFlight;
    public final BLG<LocalBrowserStopStatus> stopStatus;
    public final BrowserTaskControlTransport transport;
    public final C1BN<LocalBrowserMissingTaskUiState> uiState;

    public final class Factory extends AuraViewModelFactory<LocalBrowserMissingTaskViewModel> {
        public static final int $stable = 8;
        public final String taskId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public LocalBrowserMissingTaskViewModel create() {
            return new LocalBrowserMissingTaskViewModel(this.userSession, this.taskId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.taskId = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserMissingTaskViewModel$stop$1", f = "LocalBrowserMissingTaskViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserMissingTaskViewModel$stop$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserMissingTaskViewModel$stop$1$1", f = "LocalBrowserMissingTaskViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures, 53}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserMissingTaskViewModel$stop$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02041 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ LocalBrowserMissingTaskViewModel this$0;

            @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserMissingTaskViewModel$stop$1$1$1", f = "LocalBrowserMissingTaskViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.localbrowser.LocalBrowserMissingTaskViewModel$stop$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C02051 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
                public int label;
                public final /* synthetic */ LocalBrowserMissingTaskViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C02051(LocalBrowserMissingTaskViewModel localBrowserMissingTaskViewModel, HtJ<? super C02051> htJ) {
                    super(2, htJ);
                    this.this$0 = localBrowserMissingTaskViewModel;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new C02051(this.this$0, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    if (i == 0) {
                        Hwg.A00(obj);
                        LocalBrowserMissingTaskViewModel localBrowserMissingTaskViewModel = this.this$0;
                        BrowserTaskControlTransport browserTaskControlTransport = localBrowserMissingTaskViewModel.transport;
                        String str = localBrowserMissingTaskViewModel.browserTaskId;
                        this.label = 1;
                        obj = BrowserTaskStopKt.stopWithRetry(browserTaskControlTransport, str, this);
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
                public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                    return new C02051(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02041(LocalBrowserMissingTaskViewModel localBrowserMissingTaskViewModel, HtJ<? super C02041> htJ) {
                super(1, htJ);
                this.this$0 = localBrowserMissingTaskViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C02041(this.this$0, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new C02041(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                BLG<LocalBrowserStopStatus> blg;
                LocalBrowserStopStatus localBrowserStopStatus;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C02051 c02051 = new C02051(this.this$0, C3cI.A14(this.this$0.stopStatus, LocalBrowserStopStatus.STOPPING));
                    this.label = 1;
                    obj = GAX.A01(this, c02051, 30000L);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                        blg = this.this$0.stopStatus;
                        localBrowserStopStatus = LocalBrowserStopStatus.NONE;
                        AnonymousClass002.A1I(blg, localBrowserStopStatus);
                        return Unit.INSTANCE;
                    }
                    Hwg.A00(obj);
                }
                boolean zA1P = C3cG.A1P(obj, true);
                LocalBrowserMissingTaskViewModel localBrowserMissingTaskViewModel = this.this$0;
                if (!zA1P) {
                    blg = localBrowserMissingTaskViewModel.stopStatus;
                    localBrowserStopStatus = LocalBrowserStopStatus.FAILED;
                    AnonymousClass002.A1I(blg, localBrowserStopStatus);
                    return Unit.INSTANCE;
                }
                localBrowserMissingTaskViewModel.repository.dismiss(localBrowserMissingTaskViewModel.browserTaskId);
                HzR<Unit> hzR = this.this$0.closeEvents;
                Unit unit = Unit.INSTANCE;
                this.label = 2;
                if (hzR.AcU(unit, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                blg = this.this$0.stopStatus;
                localBrowserStopStatus = LocalBrowserStopStatus.NONE;
                AnonymousClass002.A1I(blg, localBrowserStopStatus);
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserMissingTaskViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    try {
                        if (i == 0) {
                            Hwg.A00(obj);
                            LocalBrowserMissingTaskViewModel localBrowserMissingTaskViewModel = LocalBrowserMissingTaskViewModel.this;
                            SingleFlight singleFlight = localBrowserMissingTaskViewModel.stopFlight;
                            C02041 c02041 = new C02041(localBrowserMissingTaskViewModel, null);
                            this.label = 1;
                            if (singleFlight.invoke(Unit.INSTANCE, c02041, this) == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        } else {
                            if (i != 1) {
                                throw AnonymousClass001.A0n();
                            }
                            Hwg.A00(obj);
                        }
                    } catch (Exception unused) {
                        AnonymousClass002.A1I(LocalBrowserMissingTaskViewModel.this.stopStatus, LocalBrowserStopStatus.FAILED);
                    }
                    if (LocalBrowserMissingTaskViewModel.this.stopStatus.getValue() == LocalBrowserStopStatus.STOPPING) {
                        AnonymousClass002.A1I(LocalBrowserMissingTaskViewModel.this.stopStatus, LocalBrowserStopStatus.NONE);
                    }
                    return Unit.INSTANCE;
                } catch (CancellationException e) {
                    throw e;
                }
            } finally {
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return LocalBrowserMissingTaskViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final LocalBrowserMissingTaskUiState currentUiState() {
        return buildUiState(this.registry.records.getValue(), this.repository.activeTasks.getValue(), this.stopStatus.getValue());
    }

    public final C20Q<Unit> getCloseScreen() {
        return this.closeScreen;
    }

    public final C1BN<LocalBrowserMissingTaskUiState> getUiState() {
        return this.uiState;
    }

    @Override // X.AEs
    public void onCleared() {
        this.closeEvents.A6R(null);
    }

    public LocalBrowserMissingTaskViewModel(AbstractC3358CGz abstractC3358CGz, String str) {
        boolean zA1a = AnonymousClass002.A1a(abstractC3358CGz, str);
        this.browserTaskId = BrowserTaskIdKt.logicalBrowserTaskId(str);
        BrowserTaskRepository companion = BrowserTaskRepository.Companion.getInstance(abstractC3358CGz);
        this.repository = companion;
        LocalBrowserTaskRegistry companion2 = LocalBrowserTaskRegistry.Companion.getInstance(abstractC3358CGz);
        this.registry = companion2;
        this.transport = new BrowserTaskControlTransport(abstractC3358CGz);
        OnDuplicateCall.Join join = OnDuplicateCall.Join.INSTANCE;
        C7384Etj.A0Y(join, zA1a ? 1 : 0);
        this.stopFlight = new LazyStartSingleFlightImpl(join);
        C9286GCn c9286GCnA14 = C3cG.A14(LocalBrowserStopStatus.NONE);
        this.stopStatus = c9286GCnA14;
        GCV gcvA00 = AbstractC10623Hzj.A00(C79.A00, -2);
        this.closeEvents = gcvA00;
        this.closeScreen = Hu1.A01(gcvA00);
        AnonymousClass603 anonymousClass603A00 = C3rb.A00(new LocalBrowserMissingTaskViewModel$uiState$1(this), companion2.records, companion.activeTasks, c9286GCnA14);
        this.uiState = AnonymousClass441.A00(currentUiState(), AEu.A00(this), anonymousClass603A00, new C3Es(5000L, LinkEncryptedPairingKt.LINK_COUNTER_MAX));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.localbrowser.LocalBrowserMissingTaskUiState buildUiState(java.util.List<com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson> r8, java.util.List<com.facebook.aura.model.BrowserTaskPresentation> r9, com.facebook.aura.localbrowser.LocalBrowserStopStatus r10) {
        /*
            r7 = this;
            java.util.ListIterator r2 = X.C3cG.A0n(r8)
        L4:
            boolean r0 = r2.hasPrevious()
            r4 = 0
            if (r0 == 0) goto L76
            java.lang.Object r6 = r2.previous()
            r0 = r6
            com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson r0 = (com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson) r0
            java.lang.String r0 = r0.taskId
            java.lang.String r1 = com.facebook.aura.model.BrowserTaskIdKt.logicalBrowserTaskId(r0)
            java.lang.String r0 = r7.browserTaskId
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4
        L20:
            com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson r6 = (com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson) r6
            if (r6 == 0) goto L74
            com.facebook.aura.localbrowser.LocalBrowserTaskOutcome r1 = r6.outcome
            if (r1 == 0) goto L74
            boolean r0 = r1.getLeavesRunToJarvis()
            if (r0 != 0) goto L74
            r4 = r1
        L2f:
            r5 = 1
            if (r6 != 0) goto L40
            com.facebook.aura.localbrowser.LocalBrowserStopStatus r0 = com.facebook.aura.localbrowser.LocalBrowserStopStatus.FAILED
            if (r10 == r0) goto L72
            boolean r0 = r9 instanceof java.util.Collection
            if (r0 == 0) goto L52
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L52
        L40:
            r1 = 0
            if (r6 == 0) goto L49
            boolean r0 = r6.stopPending
            if (r0 != r5) goto L4f
            com.facebook.aura.localbrowser.LocalBrowserStopStatus r10 = com.facebook.aura.localbrowser.LocalBrowserStopStatus.REPORTING
        L49:
            com.facebook.aura.localbrowser.LocalBrowserMissingTaskUiState r0 = new com.facebook.aura.localbrowser.LocalBrowserMissingTaskUiState
            r0.<init>(r4, r1, r10)
            return r0
        L4f:
            com.facebook.aura.localbrowser.LocalBrowserStopStatus r10 = com.facebook.aura.localbrowser.LocalBrowserStopStatus.NONE
            goto L49
        L52:
            java.util.Iterator r3 = r9.iterator()
        L56:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r2 = r3.next()
            com.facebook.aura.model.BrowserTaskPresentation r2 = (com.facebook.aura.model.BrowserTaskPresentation) r2
            java.lang.String r1 = r2.browserTaskId
            java.lang.String r0 = r7.browserTaskId
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L56
            boolean r0 = com.facebook.aura.browsertask.data.BrowserTaskStateKt.canStopBrowserTask(r2)
            if (r0 == 0) goto L56
        L72:
            r1 = 1
            goto L49
        L74:
            r6 = r4
            goto L2f
        L76:
            r6 = r4
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserMissingTaskViewModel.buildUiState(java.util.List, java.util.List, com.facebook.aura.localbrowser.LocalBrowserStopStatus):com.facebook.aura.localbrowser.LocalBrowserMissingTaskUiState");
    }

    public final void stop() {
        if (currentUiState().canStop) {
            AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
        }
    }
}
