package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AbstractC10627Hzt;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C06H;
import X.C10533Hqc;
import X.C20Z;
import X.C27a;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3rb;
import X.C60I;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C8eO;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.backgroundwork.api.BackgroundWorkContentClaim;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.common.identifiers.AuraDeviceId;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.model.BrowserTaskExecution;
import com.facebook.aura.model.BrowserTaskExecutionKind;
import com.facebook.aura.model.BrowserTaskIdKt;
import com.facebook.aura.model.BrowserTaskPresentation;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class LocalBrowserPendingTaskHold {
    public static final int $stable = 8;

    @Deprecated
    public static final long BACKGROUND_HOLD_MS = 60000;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String TAG = "LocalBrowserPendingTaskHold";
    public final C27a job;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;
    public HoC watch;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold", f = "LocalBrowserPendingTaskHold.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY}, m = "hold", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
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
            return LocalBrowserPendingTaskHold.this.hold(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$2", f = "LocalBrowserPendingTaskHold.kt", l = {102}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ BackgroundWorkContentClaim $claim;
        public final /* synthetic */ LocalBrowserTaskRegistry $registry;
        public final /* synthetic */ BrowserTaskRepository $repository;
        public final /* synthetic */ String $taskId;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public final /* synthetic */ LocalBrowserPendingTaskHold this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BrowserTaskRepository browserTaskRepository, String str, LocalBrowserTaskRegistry localBrowserTaskRegistry, LocalBrowserPendingTaskHold localBrowserPendingTaskHold, BackgroundWorkContentClaim backgroundWorkContentClaim, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$repository = browserTaskRepository;
            this.$taskId = str;
            this.$registry = localBrowserTaskRegistry;
            this.this$0 = localBrowserPendingTaskHold;
            this.$claim = backgroundWorkContentClaim;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$repository, this.$taskId, this.$registry, this.this$0, this.$claim, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HoC hoCA02;
            HoC hoCA022;
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserPendingTaskHold$hold$2$pending$1 localBrowserPendingTaskHold$hold$2$pending$1 = new LocalBrowserPendingTaskHold$hold$2$pending$1(this.$repository, this.$taskId, this.$registry, this.this$0, this.$claim, null);
                C6ys c6ys = C6ys.A00;
                Integer num = C79.A00;
                hoCA02 = GAo.A02(num, c6ys, localBrowserPendingTaskHold$hold$2$pending$1, c3ux);
                hoCA022 = GAo.A02(num, c6ys, new LocalBrowserPendingTaskHold$hold$2$expiry$1(hoCA02, null), c3ux);
                this.L$0 = null;
                this.L$1 = hoCA02;
                this.L$2 = hoCA022;
                this.label = 1;
                if (hoCA02.APQ(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                hoCA022 = (HoC) this.L$2;
                hoCA02 = (HoC) this.L$1;
                Hwg.A00(obj);
            }
            hoCA022.A5w(null);
            return Boolean.valueOf(hoCA02.isCancelled());
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$holdPendingTasks$2", f = "LocalBrowserPendingTaskHold.kt", l = {61}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$holdPendingTasks$2, reason: invalid class name and case insensitive filesystem */
    public final class C124352 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$holdPendingTasks$2$1", f = "LocalBrowserPendingTaskHold.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$holdPendingTasks$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0W<List<? extends BrowserTaskPresentation>, List<? extends LocalBrowserTaskRecordJson>, HtJ<? super List<? extends BrowserTaskPresentation>>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(3, htJ);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<BrowserTaskPresentation> list, List<LocalBrowserTaskRecordJson> list2, HtJ<? super List<BrowserTaskPresentation>> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = list;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return obj2;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(List<? extends BrowserTaskPresentation> list, List<? extends LocalBrowserTaskRecordJson> list2, HtJ<? super List<? extends BrowserTaskPresentation>> htJ) {
                return invoke2((List<BrowserTaskPresentation>) list, (List<LocalBrowserTaskRecordJson>) list2, (HtJ<? super List<BrowserTaskPresentation>>) htJ);
            }
        }

        public C124352(HtJ<? super C124352> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C124352 c124352 = LocalBrowserPendingTaskHold.this.new C124352(htJ);
            c124352.L$0 = obj;
            return c124352;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            final C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final BrowserTaskRepository companion = BrowserTaskRepository.Companion.getInstance(LocalBrowserPendingTaskHold.this.userSession);
                companion.start();
                final LocalBrowserTaskRegistry companion2 = LocalBrowserTaskRegistry.Companion.getInstance(LocalBrowserPendingTaskHold.this.userSession);
                final ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
                C60I c60iA03 = C3rb.A03(new AnonymousClass1(null), companion.activeTasks, companion2.records);
                final LocalBrowserPendingTaskHold localBrowserPendingTaskHold = LocalBrowserPendingTaskHold.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold.holdPendingTasks.2.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((List<BrowserTaskPresentation>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(List<BrowserTaskPresentation> list, HtJ<? super Unit> htJ) {
                        LocalBrowserPendingTaskHold localBrowserPendingTaskHold2 = localBrowserPendingTaskHold;
                        LocalBrowserTaskRegistry localBrowserTaskRegistry = companion2;
                        ConcurrentHashMap.KeySetView<String, Boolean> keySetView = keySetViewNewKeySet;
                        C3UX c3ux2 = c3ux;
                        BrowserTaskRepository browserTaskRepository = companion;
                        for (BrowserTaskPresentation browserTaskPresentation : list) {
                            String str = browserTaskPresentation.browserTaskId;
                            if (localBrowserPendingTaskHold2.isPending(browserTaskPresentation, localBrowserTaskRegistry) && keySetView.add(str)) {
                                AnonymousClass001.A1J(new LocalBrowserPendingTaskHold$holdPendingTasks$2$2$1$1(localBrowserPendingTaskHold2, browserTaskRepository, localBrowserTaskRegistry, str, keySetView, null), c3ux2);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 1;
                if (c60iA03.collect(c20z, this) == enumC10460Hji) {
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
            return ((C124352) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$setActive$1", f = "LocalBrowserPendingTaskHold.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$setActive$1, reason: invalid class name and case insensitive filesystem */
    public final class C124361 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C124361(HtJ<? super C124361> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserPendingTaskHold.this.new C124361(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserPendingTaskHold localBrowserPendingTaskHold = LocalBrowserPendingTaskHold.this;
                this.label = 1;
                if (localBrowserPendingTaskHold.holdPendingTasks(this) == enumC10460Hji) {
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
            return LocalBrowserPendingTaskHold.this.new C124361(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public LocalBrowserPendingTaskHold(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        C8eO c8eO = new C8eO(null);
        this.job = c8eO;
        this.scope = C3cH.A0y(C3cG.A0v().plus(c8eO), new LocalBrowserPendingTaskHold$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object holdPendingTasks(HtJ<? super Unit> htJ) {
        return C3cG.A0U(AbstractC10627Hzt.A00(new C124352(null), htJ));
    }

    public final synchronized void close() {
        this.watch = null;
        this.job.A5w(null);
    }

    public final synchronized void setActive(boolean z) {
        HoC hoC = this.watch;
        C10533Hqc c10533HqcA11 = null;
        if (z) {
            if (hoC == null) {
                c10533HqcA11 = AnonymousClass001.A11(new C124361(null), this.scope);
            }
        } else if (hoC != null) {
            hoC.A5w(null);
        }
        this.watch = c10533HqcA11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.aura.backgroundwork.api.BackgroundWorkClaim] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.facebook.aura.backgroundwork.api.BackgroundWorkClaim] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hold(com.facebook.aura.browsertask.data.BrowserTaskRepository r16, com.facebook.aura.localbrowser.LocalBrowserTaskRegistry r17, java.lang.String r18, X.HtJ<? super java.lang.Boolean> r19) {
        /*
            r15 = this;
            r3 = r19
            boolean r0 = r3 instanceof com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold.AnonymousClass1
            r6 = r15
            if (r0 == 0) goto L25
            r5 = r3
            com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.label = r2
        L15:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L2f
            java.lang.Object r1 = r5.L$3
            com.facebook.aura.backgroundwork.api.BackgroundWorkClaim r1 = (com.facebook.aura.backgroundwork.api.BackgroundWorkClaim) r1
            goto L2b
        L25:
            com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$1
            r5.<init>(r3)
            goto L15
        L2b:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> L73
            goto L6f
        L2f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L34:
            X.Hwg.A00(r2)
            com.facebook.aura.backgroundwork.api.BackgroundWork r2 = com.facebook.aura.backgroundwork.api.BackgroundWork.INSTANCE
            X.CGz r1 = r15.userSession
            r14 = r16
            r7 = r18
            com.facebook.aura.model.BrowserTaskPresentation r8 = r14.presentation(r7)
            r9 = 0
            r12 = 0
            r10 = r9
            r11 = r9
            r13 = r12
            com.facebook.aura.backgroundwork.api.BackgroundWorkContent r0 = com.facebook.aura.localbrowser.LocalBrowserBackgroundWorkKt.localBrowserBackgroundWorkContent(r7, r8, r9, r10, r11, r12, r13)
            com.facebook.aura.backgroundwork.api.BackgroundWorkContentClaim r1 = r2.claim(r1, r0)
            com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$2 r13 = new com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$2     // Catch: java.lang.Throwable -> L73
            r16 = r17
            r15 = r7
            r18 = r1
            r19 = r9
            r17 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L73
            r5.L$0 = r9     // Catch: java.lang.Throwable -> L73
            r5.L$1 = r9     // Catch: java.lang.Throwable -> L73
            r5.L$2 = r9     // Catch: java.lang.Throwable -> L73
            r5.L$3 = r1     // Catch: java.lang.Throwable -> L73
            r5.label = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r2 = X.Hxb.A00(r13, r5)     // Catch: java.lang.Throwable -> L73
            if (r2 != r4) goto L6f
            return r4
        L6f:
            r1.release()
            return r2
        L73:
            r0 = move-exception
            r1.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold.hold(com.facebook.aura.browsertask.data.BrowserTaskRepository, com.facebook.aura.localbrowser.LocalBrowserTaskRegistry, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPending(BrowserTaskPresentation browserTaskPresentation, LocalBrowserTaskRegistry localBrowserTaskRegistry) {
        if (browserTaskPresentation.isTerminal()) {
            return false;
        }
        BrowserTaskExecution browserTaskExecution = browserTaskPresentation.execution;
        if (browserTaskExecution.kind != BrowserTaskExecutionKind.LOCAL_DEVICE || !C7384Etj.areEqual(browserTaskExecution.deviceId, AuraDeviceId.INSTANCE.getNodeId())) {
            return false;
        }
        List<LocalBrowserTaskRecordJson> value = localBrowserTaskRegistry.records.getValue();
        if ((value instanceof Collection) && C3cG.A1N(value)) {
            return true;
        }
        for (LocalBrowserTaskRecordJson localBrowserTaskRecordJson : value) {
            if (BrowserTaskIdKt.logicalBrowserTaskId(localBrowserTaskRecordJson.taskId).equals(browserTaskPresentation.browserTaskId) && (localBrowserTaskRecordJson.outcome == null || localBrowserTaskRecordJson.stopPending)) {
                return false;
            }
        }
        return true;
    }
}
