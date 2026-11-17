package com.facebook.aura.confidentialvm;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass603;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3pU;
import X.C3rb;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.F1F;
import X.F2X;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2k;
import X.GAo;
import X.GDB;
import X.HnJ;
import X.HtJ;
import X.HwV;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.agentpermission.MC;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.components.reactions.AuraPressureReleaseKt;
import com.facebook.aura.confidentialvm.HatchVmAccessState;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.gateway.HatchCvmAuthenticationState;
import com.facebook.aura.gateway.HatchCvmChipBudgetGate;
import com.facebook.aura.gateway.HatchCvmChipSelectionResponseClass;
import com.facebook.aura.gateway.HatchCvmReplacePoller;
import com.facebook.aura.gateway.HatchCvmReplaceSource;
import com.facebook.aura.gateway.HatchCvmReplaceStore;
import com.facebook.aura.gateway.HatchCvmReplaceStoreKt;
import com.facebook.aura.gateway.HatchCvmReplacement;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.HatchGatewayStateSnapshot;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.gateway.connection.ConnectRequestResult;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import com.facebook.aura.widgets.MC;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchVmAccessController implements InterfaceC7549F2g {
    public static final long BID_RETRY_DELAY_MS = 5000;
    public static final Companion Companion = new Companion();
    public static final int ENROLLMENT_ELSEWHERE_MAX_RECONNECTS = 40;
    public static final long ENROLLMENT_ELSEWHERE_RETRY_MS = 15000;
    public static final String TAG = "HatchVmAccessController";
    public static final long UNLOCK_OUTCOME_TIMEOUT_MS = 120000;
    public final BLG<HatchVmAccessState> _state;
    public final ConcurrentHashMap.KeySetView<String, Boolean> attemptedAutomaticCredentialVmIds;
    public final HatchCvmChipBudgetGate chipBudgetGate;
    public final BLG<Integer> credentialArrivals;
    public final BLG<Boolean> credentialReconnectInFlight;
    public volatile HxE<String, Integer> enrollmentElsewhere;
    public final HatchGatewayConnection gateway;
    public final C20Q<HatchVmAccessInputs> inputs;
    public volatile HatchVmPeerType lastReadyPeerType;
    public volatile HatchVmAccessState lastTerminalFailure;
    public final BLG<Boolean> localConnectionFailure;
    public final AtomicReference<String> loggedMaintenanceAttemptId;
    public final ConfidentialVmRepository repository;
    public final C3UX scope;
    public volatile HatchVmAccessState shownAccessError;
    public final C1BN<HatchVmAccessState> state;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$1", f = "HatchVmAccessController.kt", l = {138}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$1$1", f = "HatchVmAccessController.kt", l = {146, 150, 155, 169, 170}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00751 extends AbstractC07127nr implements G0V<HatchVmAccessInputs, HtJ<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public Object L$1;
            public Object L$2;
            public int label;
            public final /* synthetic */ HatchVmAccessController this$0;

            @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$1$1$1", f = "HatchVmAccessController.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00761 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
                public /* synthetic */ boolean Z$0;
                public int label;

                public C00761(HtJ<? super C00761> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C00761 c00761 = new C00761(htJ);
                    c00761.Z$0 = AnonymousClass001.A1X(obj);
                    return c00761;
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    boolean z = this.Z$0;
                    if (this.label == 0) {
                        return AnonymousClass001.A0k(obj, z);
                    }
                    throw AnonymousClass001.A0n();
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                    return invoke(AnonymousClass001.A1X(bool), htJ);
                }

                public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                    return ((C00761) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00751(HatchVmAccessController hatchVmAccessController, HtJ<? super C00751> htJ) {
                super(2, htJ);
                this.this$0 = hatchVmAccessController;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C00751 c00751 = new C00751(this.this$0, htJ);
                c00751.L$0 = obj;
                return c00751;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[Catch: Exception -> 0x0117, CancellationException -> 0x012b, TRY_ENTER, TryCatch #2 {CancellationException -> 0x012b, Exception -> 0x0117, blocks: (B:56:0x00f2, B:57:0x00f5, B:59:0x00fb, B:60:0x010f, B:52:0x00d9, B:53:0x00dc, B:36:0x0088, B:37:0x008b, B:38:0x0091, B:40:0x009f, B:42:0x00b1, B:43:0x00b3, B:44:0x00b6, B:47:0x00c0, B:49:0x00c8, B:28:0x006a, B:29:0x006d, B:32:0x0074, B:33:0x0079, B:19:0x004c, B:20:0x004f, B:23:0x0057, B:25:0x005d, B:16:0x003d), top: B:67:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[Catch: Exception -> 0x0117, CancellationException -> 0x012b, TryCatch #2 {CancellationException -> 0x012b, Exception -> 0x0117, blocks: (B:56:0x00f2, B:57:0x00f5, B:59:0x00fb, B:60:0x010f, B:52:0x00d9, B:53:0x00dc, B:36:0x0088, B:37:0x008b, B:38:0x0091, B:40:0x009f, B:42:0x00b1, B:43:0x00b3, B:44:0x00b6, B:47:0x00c0, B:49:0x00c8, B:28:0x006a, B:29:0x006d, B:32:0x0074, B:33:0x0079, B:19:0x004c, B:20:0x004f, B:23:0x0057, B:25:0x005d, B:16:0x003d), top: B:67:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x009f A[Catch: Exception -> 0x0117, CancellationException -> 0x012b, TryCatch #2 {CancellationException -> 0x012b, Exception -> 0x0117, blocks: (B:56:0x00f2, B:57:0x00f5, B:59:0x00fb, B:60:0x010f, B:52:0x00d9, B:53:0x00dc, B:36:0x0088, B:37:0x008b, B:38:0x0091, B:40:0x009f, B:42:0x00b1, B:43:0x00b3, B:44:0x00b6, B:47:0x00c0, B:49:0x00c8, B:28:0x006a, B:29:0x006d, B:32:0x0074, B:33:0x0079, B:19:0x004c, B:20:0x004f, B:23:0x0057, B:25:0x005d, B:16:0x003d), top: B:67:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00c0 A[Catch: Exception -> 0x0117, CancellationException -> 0x012b, TryCatch #2 {CancellationException -> 0x012b, Exception -> 0x0117, blocks: (B:56:0x00f2, B:57:0x00f5, B:59:0x00fb, B:60:0x010f, B:52:0x00d9, B:53:0x00dc, B:36:0x0088, B:37:0x008b, B:38:0x0091, B:40:0x009f, B:42:0x00b1, B:43:0x00b3, B:44:0x00b6, B:47:0x00c0, B:49:0x00c8, B:28:0x006a, B:29:0x006d, B:32:0x0074, B:33:0x0079, B:19:0x004c, B:20:0x004f, B:23:0x0057, B:25:0x005d, B:16:0x003d), top: B:67:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00d8 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00f1 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00fb A[Catch: Exception -> 0x0117, CancellationException -> 0x012b, TryCatch #2 {CancellationException -> 0x012b, Exception -> 0x0117, blocks: (B:56:0x00f2, B:57:0x00f5, B:59:0x00fb, B:60:0x010f, B:52:0x00d9, B:53:0x00dc, B:36:0x0088, B:37:0x008b, B:38:0x0091, B:40:0x009f, B:42:0x00b1, B:43:0x00b3, B:44:0x00b6, B:47:0x00c0, B:49:0x00c8, B:28:0x006a, B:29:0x006d, B:32:0x0074, B:33:0x0079, B:19:0x004c, B:20:0x004f, B:23:0x0057, B:25:0x005d, B:16:0x003d), top: B:67:0x0010 }] */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r16) {
                /*
                    Method dump skipped, instructions count: 301
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.HatchVmAccessController.AnonymousClass1.C00751.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(HatchVmAccessInputs hatchVmAccessInputs, HtJ<? super Unit> htJ) {
                return ((C00751) create(hatchVmAccessInputs, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchVmAccessController.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchVmAccessController hatchVmAccessController = HatchVmAccessController.this;
                C20Q<HatchVmAccessInputs> c20q = hatchVmAccessController.inputs;
                C00751 c00751 = new C00751(hatchVmAccessController, null);
                this.label = 1;
                if (C3pU.A00(this, c00751, c20q) == enumC10460Hji) {
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
            return HatchVmAccessController.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$2", f = "HatchVmAccessController.kt", l = {201}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public final /* synthetic */ class AnonymousClass1 extends F2X implements G0W {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(3, HxE.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(AnonymousClass001.A0F(obj), AnonymousClass001.A0F(obj2), (HtJ<? super HxE<Integer, Integer>>) obj3);
            }

            public final Object invoke(int i, int i2, HtJ<? super HxE<Integer, Integer>> htJ) {
                return new HxE(new Integer(i), new Integer(i2));
            }
        }

        @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$2$2", f = "HatchVmAccessController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$2$2, reason: invalid class name and collision with other inner class name */
        public final class C00772 extends AbstractC07127nr implements G2k<HatchCvmReplacement, Boolean, HxE<? extends Integer, ? extends Integer>, Set<? extends String>, HtJ<? super HwV<? extends HatchCvmReplacement.Active, ? extends Boolean, ? extends HxE<? extends Integer, ? extends Integer>>>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public /* synthetic */ Object L$2;
            public /* synthetic */ boolean Z$0;
            public int label;
            public final /* synthetic */ HatchVmAccessController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00772(HatchVmAccessController hatchVmAccessController, HtJ<? super C00772> htJ) {
                super(5, htJ);
                this.this$0 = hatchVmAccessController;
            }

            public final Object invoke(HatchCvmReplacement hatchCvmReplacement, boolean z, HxE<Integer, Integer> hxE, Set<String> set, HtJ<? super HwV<HatchCvmReplacement.Active, Boolean, HxE<Integer, Integer>>> htJ) {
                C00772 c00772 = new C00772(this.this$0, htJ);
                c00772.L$0 = hatchCvmReplacement;
                c00772.Z$0 = z;
                c00772.L$1 = hxE;
                c00772.L$2 = set;
                return c00772.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HatchCvmReplacement hatchCvmReplacement = (HatchCvmReplacement) this.L$0;
                boolean z = this.Z$0;
                Object obj2 = this.L$1;
                Set set = (Set) this.L$2;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                HatchCvmReplacement.Active activeForVm = HatchCvmReplaceStoreKt.forVm(hatchCvmReplacement, C3cH.A0a(HatchGatewayPrefsStore.Companion, this.this$0.userSession));
                if (activeForVm == null || !HatchCvmReplaceStoreKt.isAwaitingChipSelection(activeForVm) || set.contains(activeForVm.vmId)) {
                    return null;
                }
                return new HwV(activeForVm, Boolean.valueOf(z), obj2);
            }

            @Override // X.G2k
            public /* bridge */ /* synthetic */ Object invoke(HatchCvmReplacement hatchCvmReplacement, Boolean bool, HxE<? extends Integer, ? extends Integer> hxE, Set<? extends String> set, HtJ<? super HwV<? extends HatchCvmReplacement.Active, ? extends Boolean, ? extends HxE<? extends Integer, ? extends Integer>>> htJ) {
                return invoke(hatchCvmReplacement, AnonymousClass001.A1X(bool), (HxE<Integer, Integer>) hxE, (Set<String>) set, (HtJ<? super HwV<HatchCvmReplacement.Active, Boolean, HxE<Integer, Integer>>>) htJ);
            }
        }

        /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$2$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<HwV<? extends HatchCvmReplacement.Active, ? extends Boolean, ? extends HxE<? extends Integer, ? extends Integer>>, HwV<? extends String, ? extends Boolean, ? extends HxE<? extends Integer, ? extends Integer>>> {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final HwV<String, Boolean, HxE<Integer, Integer>> invoke2(HwV<HatchCvmReplacement.Active, Boolean, HxE<Integer, Integer>> hwV) {
                if (hwV == null) {
                    return null;
                }
                HatchCvmReplacement.Active active = hwV.first;
                return new HwV<>(active.attemptId, hwV.second, hwV.third);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ HwV<? extends String, ? extends Boolean, ? extends HxE<? extends Integer, ? extends Integer>> invoke(HwV<? extends HatchCvmReplacement.Active, ? extends Boolean, ? extends HxE<? extends Integer, ? extends Integer>> hwV) {
                return invoke2((HwV<HatchCvmReplacement.Active, Boolean, HxE<Integer, Integer>>) hwV);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$2$4", f = "HatchVmAccessController.kt", l = {201}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$2$4, reason: invalid class name */
        public final class AnonymousClass4 extends AbstractC07127nr implements G0V<HwV<? extends HatchCvmReplacement.Active, ? extends Boolean, ? extends HxE<? extends Integer, ? extends Integer>>, HtJ<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public Object L$1;
            public int label;
            public final /* synthetic */ HatchVmAccessController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(HatchVmAccessController hatchVmAccessController, HtJ<? super AnonymousClass4> htJ) {
                super(2, htJ);
                this.this$0 = hatchVmAccessController;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, htJ);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(HwV<? extends HatchCvmReplacement.Active, ? extends Boolean, ? extends HxE<? extends Integer, ? extends Integer>> hwV, HtJ<? super Unit> htJ) {
                return invoke2((HwV<HatchCvmReplacement.Active, Boolean, HxE<Integer, Integer>>) hwV, htJ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HwV hwV = (HwV) this.L$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    if (hwV != null) {
                        HatchVmAccessController hatchVmAccessController = this.this$0;
                        HatchCvmReplacement.Active active = (HatchCvmReplacement.Active) hwV.first;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (hatchVmAccessController.bidUntilSettled(active, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(HwV<HatchCvmReplacement.Active, Boolean, HxE<Integer, Integer>> hwV, HtJ<? super Unit> htJ) {
                return ((AnonymousClass4) create(hwV, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchVmAccessController.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<HatchCvmReplacement> c1bn = HatchCvmReplaceStore.Companion.getInstance(HatchVmAccessController.this.userSession).replacement;
                C20Q c20qA01 = GDB.A01(AuraAppLifecycleManager.isAppInForegroundFlow);
                HatchVmAccessController hatchVmAccessController = HatchVmAccessController.this;
                BLG<Integer> blg = hatchVmAccessController.credentialArrivals;
                HatchCvmChipBudgetGate hatchCvmChipBudgetGate = hatchVmAccessController.chipBudgetGate;
                C20Q c20qA00 = GDB.A00(AnonymousClass3.INSTANCE, GDB.A01, C3rb.A01(new C00772(hatchVmAccessController, null), c1bn, c20qA01, C3rb.A03(AnonymousClass1.INSTANCE, blg, hatchCvmChipBudgetGate.retryRequests), hatchCvmChipBudgetGate.settingUpVmIds));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(HatchVmAccessController.this, null);
                this.label = 1;
                if (C3pU.A00(this, anonymousClass4, c20qA00) == enumC10460Hji) {
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
            return HatchVmAccessController.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$3", f = "HatchVmAccessController.kt", l = {HatchWidgetWebViewKt.HTTP_NO_CONTENT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchVmAccessController.this.new AnonymousClass3(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<HatchCvmReplacement> c1bn = HatchCvmReplaceStore.Companion.getInstance(HatchVmAccessController.this.userSession).replacement;
                final HatchVmAccessController hatchVmAccessController = HatchVmAccessController.this;
                C20Z<? super HatchCvmReplacement> c20z = new C20Z() { // from class: com.facebook.aura.confidentialvm.HatchVmAccessController.3.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchCvmReplacement) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HatchCvmReplacement hatchCvmReplacement, HtJ<? super Unit> htJ) {
                        String strA0a = C3cH.A0a(HatchGatewayPrefsStore.Companion, hatchVmAccessController.userSession);
                        if (strA0a != null) {
                            hatchVmAccessController.chipBudgetGate.onReplacement(strA0a, hatchCvmReplacement);
                        }
                        return Unit.INSTANCE;
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchVmAccessController.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$4", f = "HatchVmAccessController.kt", l = {219}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$4$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HatchCvmReplacement.Active, String> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            public AnonymousClass2() {
                super(1);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ String invoke(HatchCvmReplacement.Active active) {
                HatchCvmReplacement.Active active2 = active;
                if (active2 != null) {
                    return active2.attemptId;
                }
                return null;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String invoke2(HatchCvmReplacement.Active active) {
                if (active != null) {
                    return active.attemptId;
                }
                return null;
            }
        }

        /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$4$4, reason: invalid class name and collision with other inner class name */
        public final class C00784<T> implements C20Z {
            public final /* synthetic */ HatchVmAccessController this$0;

            @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$4$4$1", f = "HatchVmAccessController.kt", l = {225}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$4$4$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                public final /* synthetic */ ConnectRequestResult $request;
                public int label;
                public final /* synthetic */ HatchVmAccessController this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(HatchVmAccessController hatchVmAccessController, ConnectRequestResult connectRequestResult, HtJ<? super AnonymousClass1> htJ) {
                    super(2, htJ);
                    this.this$0 = hatchVmAccessController;
                    this.$request = connectRequestResult;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new AnonymousClass1(this.this$0, this.$request, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    if (i == 0) {
                        Hwg.A00(obj);
                        HatchVmAccessController hatchVmAccessController = this.this$0;
                        ConnectRequestResult.Accepted accepted = (ConnectRequestResult.Accepted) this.$request;
                        this.label = 1;
                        if (hatchVmAccessController.logUnlockOutcome(accepted, this) == enumC10460Hji) {
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
                    return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            public C00784(HatchVmAccessController hatchVmAccessController) {
                this.this$0 = hatchVmAccessController;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((HatchCvmReplacement.Active) obj, (HtJ<? super Unit>) htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.facebook.aura.gateway.HatchCvmReplacement.Active r9, X.HtJ<? super kotlin.Unit> r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof com.facebook.aura.confidentialvm.HatchVmAccessController$4$4$emit$1
                    if (r0 == 0) goto L25
                    r6 = r10
                    com.facebook.aura.confidentialvm.HatchVmAccessController$4$4$emit$1 r6 = (com.facebook.aura.confidentialvm.HatchVmAccessController$4$4$emit$1) r6
                    int r2 = r6.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L25
                    int r2 = r2 - r1
                    r6.label = r2
                L12:
                    java.lang.Object r4 = r6.result
                    X.Hji r7 = X.EnumC10460Hji.A02
                    int r0 = r6.label
                    r5 = 0
                    java.lang.String r3 = "HatchVmAccessController"
                    r2 = 1
                    if (r0 == 0) goto L30
                    if (r0 != r2) goto L2b
                    java.lang.Object r9 = r6.L$0
                    com.facebook.aura.gateway.HatchCvmReplacement$Active r9 = (com.facebook.aura.gateway.HatchCvmReplacement.Active) r9
                    goto L54
                L25:
                    com.facebook.aura.confidentialvm.HatchVmAccessController$4$4$emit$1 r6 = new com.facebook.aura.confidentialvm.HatchVmAccessController$4$4$emit$1
                    r6.<init>(r8, r10)
                    goto L12
                L2b:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                L30:
                    X.Hwg.A00(r4)
                    java.lang.String r1 = "CVM replacement locked; connecting to unlock %s"
                    java.lang.String r0 = r9.attemptId
                    X.CFK.A03(r0, r3, r1)
                    com.facebook.aura.confidentialvm.HatchVmAccessController r0 = r8.this$0
                    r0.lastTerminalFailure = r5
                    com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger r1 = com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger.INSTANCE
                    com.facebook.aura.analytics.hatch.HatchClientCvmOutcome r0 = com.facebook.aura.analytics.hatch.HatchClientCvmOutcome.ATTEMPT
                    r1.logCvmReplacementUnlock(r0)
                    com.facebook.aura.confidentialvm.HatchVmAccessController r0 = r8.this$0     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    com.facebook.aura.gateway.HatchGatewayConnection r0 = r0.gateway     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    r6.L$0 = r9     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    r6.label = r2     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    java.lang.Object r4 = r0.requestConnect(r2, r2, r5, r6)     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    if (r4 != r7) goto L57
                    return r7
                L54:
                    X.Hwg.A00(r4)     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                L57:
                    com.facebook.aura.gateway.connection.ConnectRequestResult r4 = (com.facebook.aura.gateway.connection.ConnectRequestResult) r4     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    boolean r0 = r4 instanceof com.facebook.aura.gateway.connection.ConnectRequestResult.Accepted     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    if (r0 == 0) goto L6a
                    com.facebook.aura.confidentialvm.HatchVmAccessController r2 = r8.this$0     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    X.3UX r1 = r2.scope     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    com.facebook.aura.confidentialvm.HatchVmAccessController$4$4$1 r0 = new com.facebook.aura.confidentialvm.HatchVmAccessController$4$4$1     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    r0.<init>(r2, r4, r5)     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    X.AnonymousClass001.A1J(r0, r1)     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    goto L99
                L6a:
                    com.facebook.aura.gateway.connection.ConnectRequestResult$Rejected r0 = com.facebook.aura.gateway.connection.ConnectRequestResult.Rejected.INSTANCE     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    boolean r0 = X.C7384Etj.areEqual(r4, r0)     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    if (r0 == 0) goto L85
                    java.lang.String r1 = "CVM replacement unlock connect not started for attempt %s"
                    java.lang.String r0 = r9.attemptId     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    X.CFK.A0H(r3, r1, r0)     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger r1 = com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger.INSTANCE     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    com.facebook.aura.analytics.hatch.HatchClientCvmOutcome r0 = com.facebook.aura.analytics.hatch.HatchClientCvmOutcome.FAILURE     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    r1.logCvmReplacementUnlock(r0)     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    goto L99
                L85:
                    kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                    throw r0     // Catch: java.lang.Exception -> L8a java.util.concurrent.CancellationException -> L9c
                L8a:
                    r2 = move-exception
                    java.lang.String r1 = r9.attemptId
                    java.lang.String r0 = "Failed to connect for locked CVM replacement "
                    X.C3cH.A1B(r0, r1, r3, r2)
                    com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger r1 = com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger.INSTANCE
                    com.facebook.aura.analytics.hatch.HatchClientCvmOutcome r0 = com.facebook.aura.analytics.hatch.HatchClientCvmOutcome.FAILURE
                    r1.logCvmReplacementUnlock(r0)
                L99:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                L9c:
                    r0 = move-exception
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.HatchVmAccessController.AnonymousClass4.C00784.emit(com.facebook.aura.gateway.HatchCvmReplacement$Active, X.HtJ):java.lang.Object");
            }
        }

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchVmAccessController.this.new AnonymousClass4(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<HatchCvmReplacement> c1bn = HatchCvmReplaceStore.Companion.getInstance(HatchVmAccessController.this.userSession).replacement;
                HatchVmAccessController hatchVmAccessController = HatchVmAccessController.this;
                HatchVmAccessController$4$invokeSuspend$$inlined$mapNotNull$1 hatchVmAccessController$4$invokeSuspend$$inlined$mapNotNull$1 = new HatchVmAccessController$4$invokeSuspend$$inlined$mapNotNull$1(GDB.A00(AnonymousClass2.INSTANCE, GDB.A01, new HatchVmAccessController$4$invokeSuspend$$inlined$map$1(c1bn, hatchVmAccessController)));
                C00784 c00784 = new C00784(hatchVmAccessController);
                this.label = 1;
                if (hatchVmAccessController$4$invokeSuspend$$inlined$mapNotNull$1.collect(c00784, this) == enumC10460Hji) {
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
            return HatchVmAccessController.this.new AnonymousClass4(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$5", f = "HatchVmAccessController.kt", l = {256}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$5$1", f = "HatchVmAccessController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$5$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G2k<HatchVmAccessState, HatchCvmReplacement, String, Boolean, HtJ<? super HwV<? extends HatchVmAccessState, ? extends HatchCvmReplacement.Active, ? extends Boolean>>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public /* synthetic */ Object L$2;
            public /* synthetic */ boolean Z$0;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(5, htJ);
            }

            public final Object invoke(HatchVmAccessState hatchVmAccessState, HatchCvmReplacement hatchCvmReplacement, String str, boolean z, HtJ<? super HwV<? extends HatchVmAccessState, HatchCvmReplacement.Active, Boolean>> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = hatchVmAccessState;
                anonymousClass1.L$1 = hatchCvmReplacement;
                anonymousClass1.L$2 = str;
                anonymousClass1.Z$0 = z;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                HatchCvmReplacement hatchCvmReplacement = (HatchCvmReplacement) this.L$1;
                String str = (String) this.L$2;
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return new HwV(obj2, HatchCvmReplaceStoreKt.forVm(hatchCvmReplacement, str), Boolean.valueOf(z));
            }

            @Override // X.G2k
            public /* bridge */ /* synthetic */ Object invoke(HatchVmAccessState hatchVmAccessState, HatchCvmReplacement hatchCvmReplacement, String str, Boolean bool, HtJ<? super HwV<? extends HatchVmAccessState, ? extends HatchCvmReplacement.Active, ? extends Boolean>> htJ) {
                return invoke(hatchVmAccessState, hatchCvmReplacement, str, AnonymousClass001.A1X(bool), (HtJ<? super HwV<? extends HatchVmAccessState, HatchCvmReplacement.Active, Boolean>>) htJ);
            }
        }

        public AnonymousClass5(HtJ<? super AnonymousClass5> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchVmAccessController.this.new AnonymousClass5(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchVmAccessController hatchVmAccessController = HatchVmAccessController.this;
                AnonymousClass603 anonymousClass603A01 = C3rb.A01(new AnonymousClass1(null), hatchVmAccessController._state, HatchCvmReplaceStore.Companion.getInstance(hatchVmAccessController.userSession).replacement, HatchGatewayPrefsStore.Companion.getInstance(HatchVmAccessController.this.userSession).hatcheryVmIdFlow, AuraAppLifecycleManager.isAppInForegroundFlow);
                final HatchVmAccessController hatchVmAccessController2 = HatchVmAccessController.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.confidentialvm.HatchVmAccessController.5.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HwV<? extends HatchVmAccessState, HatchCvmReplacement.Active, Boolean>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HwV<? extends HatchVmAccessState, HatchCvmReplacement.Active, Boolean> hwV, HtJ<? super Unit> htJ) {
                        HatchVmAccessState hatchVmAccessState = (HatchVmAccessState) hwV.first;
                        HatchCvmReplacement.Active active = hwV.second;
                        if (AnonymousClass001.A1X(hwV.third)) {
                            hatchVmAccessController2.logAccessGateView(hatchVmAccessState, active);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (anonymousClass603A01.collect(c20z, this) == enumC10460Hji) {
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
            return HatchVmAccessController.this.new AnonymousClass5(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$6", f = "HatchVmAccessController.kt", l = {264}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass6(HtJ<? super AnonymousClass6> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchVmAccessController.this.new AnonymousClass6(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final F1F f1f = new F1F();
                C1BN<HatchCvmReplacement> c1bn = HatchCvmReplaceStore.Companion.getInstance(HatchVmAccessController.this.userSession).replacement;
                final HatchVmAccessController hatchVmAccessController = HatchVmAccessController.this;
                C20Z<? super HatchCvmReplacement> c20z = new C20Z() { // from class: com.facebook.aura.confidentialvm.HatchVmAccessController.6.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchCvmReplacement) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HatchCvmReplacement hatchCvmReplacement, HtJ<? super Unit> htJ) {
                        HatchGatewayPrefsStore.Companion companion = HatchGatewayPrefsStore.Companion;
                        if (HatchCvmReplaceStoreKt.forVm(hatchCvmReplacement, C3cH.A0a(companion, hatchVmAccessController.userSession)) == null && f1f.element) {
                            CFK.A05(HatchVmAccessController.TAG, "CVM replacement no longer active for selected VM");
                        }
                        boolean z = false;
                        if (f1f.element && (hatchCvmReplacement instanceof HatchCvmReplacement.None) && (hatchVmAccessController.gateway.gatewayState.getValue().connection instanceof HatchGatewayConnectionState.Error)) {
                            CFK.A05(HatchVmAccessController.TAG, "CVM replacement cleared; reconnecting");
                            hatchVmAccessController.reconnect(false);
                        }
                        F1F f1f2 = f1f;
                        if (HatchCvmReplaceStoreKt.forVm(hatchCvmReplacement, C3cH.A0a(companion, hatchVmAccessController.userSession)) != null) {
                            z = true;
                        }
                        f1f2.element = z;
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchVmAccessController.this.new AnonymousClass6(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController", f = "HatchVmAccessController.kt", l = {440}, m = "applyStoredCredentialContinuation", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$applyStoredCredentialContinuation$1, reason: invalid class name and case insensitive filesystem */
    public final class C111931 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C111931(HtJ<? super C111931> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmAccessController.this.applyStoredCredentialContinuation(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController", f = "HatchVmAccessController.kt", l = {AuraPressureReleaseKt.PRESSURE_TOTAL_MS, MC.hatch_android_widgets.__CONFIG__, 640}, m = "bidUntilSettled", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$bidUntilSettled$1, reason: invalid class name and case insensitive filesystem */
    public final class C111941 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C111941(HtJ<? super C111941> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmAccessController.this.bidUntilSettled(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController", f = "HatchVmAccessController.kt", l = {371}, m = "enrollmentElsewhereVmId", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$enrollmentElsewhereVmId$1, reason: invalid class name and case insensitive filesystem */
    public final class C111951 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C111951(HtJ<? super C111951> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmAccessController.this.enrollmentElsewhereVmId(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController", f = "HatchVmAccessController.kt", l = {293}, m = "logUnlockOutcome", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$logUnlockOutcome$1, reason: invalid class name and case insensitive filesystem */
    public final class C111961 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C111961(HtJ<? super C111961> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmAccessController.this.logUnlockOutcome(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$onVmPush$1", f = "HatchVmAccessController.kt", l = {529, 539}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$onVmPush$1, reason: invalid class name and case insensitive filesystem */
    public final class C111971 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $vmId;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111971(String str, HtJ<? super C111971> htJ) {
            super(2, htJ);
            this.$vmId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchVmAccessController.this.new C111971(this.$vmId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchGatewayPrefsStore companion;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(HatchVmAccessController.TAG, "Failed to refresh VM access after push", e2);
            }
            if (i == 0) {
                Hwg.A00(obj);
                companion = HatchGatewayPrefsStore.Companion.getInstance(HatchVmAccessController.this.userSession);
                if (!C7384Etj.areEqual(C3cG.A0a(companion), this.$vmId)) {
                    return Unit.INSTANCE;
                }
                HatchCvmReplaceStore companion2 = HatchCvmReplaceStore.Companion.getInstance(HatchVmAccessController.this.userSession);
                String str = this.$vmId;
                HatchCvmReplaceSource hatchCvmReplaceSource = HatchCvmReplaceSource.PUSH;
                this.L$0 = companion;
                this.L$1 = null;
                this.label = 1;
                obj = companion2.refresh(str, hatchCvmReplaceSource, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                companion = (HatchGatewayPrefsStore) this.L$0;
                Hwg.A00(obj);
            }
            HatchCvmReplacement hatchCvmReplacement = (HatchCvmReplacement) obj;
            if (hatchCvmReplacement == null) {
                return Unit.INSTANCE;
            }
            if (!C7384Etj.areEqual(C3cG.A0a(companion), this.$vmId)) {
                return Unit.INSTANCE;
            }
            if (hatchCvmReplacement.equals(HatchCvmReplacement.Unknown.INSTANCE) || hatchCvmReplacement.equals(HatchCvmReplacement.NotFound.INSTANCE)) {
                return Unit.INSTANCE;
            }
            if (hatchCvmReplacement instanceof HatchCvmReplacement.Active) {
                if (!HatchCvmReplaceStoreKt.isAwaitingChipPinnedUnlock((HatchCvmReplacement.Active) hatchCvmReplacement)) {
                    return Unit.INSTANCE;
                }
            } else if (!hatchCvmReplacement.equals(HatchCvmReplacement.None.INSTANCE)) {
                throw C3cG.A0q();
            }
            if (!HatchVmAccessController.this.gateway.recoverFromSuspectedDeadConnection("vm_locked_notification")) {
                HatchGatewayConnection hatchGatewayConnection = HatchVmAccessController.this.gateway;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                if (hatchGatewayConnection.fetchAndConnect(true, true, null, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C111971) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController", f = "HatchVmAccessController.kt", l = {357}, m = "pinAcceptedBidForEnrollment", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$pinAcceptedBidForEnrollment$1, reason: invalid class name and case insensitive filesystem */
    public final class C111981 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C111981(HtJ<? super C111981> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmAccessController.this.pinAcceptedBidForEnrollment(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$reconnect$1", f = "HatchVmAccessController.kt", l = {555}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$reconnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C111991 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $force;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111991(boolean z, HtJ<? super C111991> htJ) {
            super(2, htJ);
            this.$force = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchVmAccessController.this.new C111991(this.$force, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean zA1X;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchGatewayConnection hatchGatewayConnection = HatchVmAccessController.this.gateway;
                    boolean z = this.$force;
                    this.label = 1;
                    obj = hatchGatewayConnection.fetchAndConnect(z, false, null, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                zA1X = AnonymousClass001.A1X(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(HatchVmAccessController.TAG, "Failed to reconnect VM access", e2);
                zA1X = false;
            }
            AnonymousClass004.A1D(!zA1X, HatchVmAccessController.this.localConnectionFailure);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C111991) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController", f = "HatchVmAccessController.kt", l = {585, MC.muse_checkout_promos.__CONFIG__}, m = "reconnectAfterCredentialAvailableAndAwait", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$reconnectAfterCredentialAvailableAndAwait$1, reason: invalid class name and case insensitive filesystem */
    public final class C112001 extends HzP {
        public int I$0;
        public int label;
        public /* synthetic */ Object result;

        public C112001(HtJ<? super C112001> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmAccessController.this.reconnectAfterCredentialAvailableAndAwait(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$reconnectAfterCredentialAvailableAndAwait$3", f = "HatchVmAccessController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$reconnectAfterCredentialAvailableAndAwait$3, reason: invalid class name and case insensitive filesystem */
    public final class C112013 extends AbstractC07127nr implements G0V<HxE<? extends Integer, ? extends HatchVmAccessState>, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ int $startedCycle;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112013(int i, HtJ<? super C112013> htJ) {
            super(2, htJ);
            this.$startedCycle = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C112013 c112013 = new C112013(this.$startedCycle, htJ);
            c112013.L$0 = obj;
            return c112013;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(HxE<? extends Integer, ? extends HatchVmAccessState> hxE, HtJ<? super Boolean> htJ) {
            return invoke2((HxE<Integer, ? extends HatchVmAccessState>) hxE, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HxE hxE = (HxE) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(HatchVmAccessControllerKt.completesCredentialReconnect(AnonymousClass001.A0F(hxE.first), (HatchVmAccessState) hxE.second, this.$startedCycle));
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HxE<Integer, ? extends HatchVmAccessState> hxE, HtJ<? super Boolean> htJ) {
            return ((C112013) create(hxE, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController", f = "HatchVmAccessController.kt", l = {395, 414, 423, 427}, m = "resolvePublicState", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessController$resolvePublicState$1, reason: invalid class name and case insensitive filesystem */
    public final class C112021 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C112021(HtJ<? super C112021> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmAccessController.this.resolvePublicState(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logAccessGateView(HatchVmAccessState hatchVmAccessState, HatchCvmReplacement.Active active) {
        if (active != null) {
            this.shownAccessError = null;
            if (HatchVmAccessControllerKt.showsMaintenance(active, hatchVmAccessState)) {
                HatchClientCvmEventLogger.INSTANCE.logCvmMaintenanceView(active.attemptId, this.loggedMaintenanceAttemptId);
                return;
            }
            return;
        }
        if (!C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.AttestationFailure.INSTANCE) && !C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.SecurityFailure.INSTANCE)) {
            hatchVmAccessState = null;
        } else if (hatchVmAccessState != null && !hatchVmAccessState.equals(this.shownAccessError)) {
            HatchClientCvmEventLogger.INSTANCE.logCvmAccessErrorView();
        }
        this.shownAccessError = hatchVmAccessState;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.lastReadyPeerType = null;
        this.lastTerminalFailure = null;
        this.attemptedAutomaticCredentialVmIds.clear();
        this.enrollmentElsewhere = null;
        this._state.Af8(HatchVmAccessState.AwaitingEligibility.INSTANCE);
        Hxb.A03(null, this.scope);
    }

    public final void onVmPush(String str) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass001.A1J(new C111971(str, null), this.scope);
    }

    public final void retry() {
        this.enrollmentElsewhere = null;
        reconnect(true);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StoredCredentialContinuation.values().length];
            try {
                AnonymousClass005.A0v(StoredCredentialContinuation.SHOW_PROMPT, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(StoredCredentialContinuation.RETRIABLE_FAILURE, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(StoredCredentialContinuation.SECURITY_FAILURE, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(StoredCredentialContinuation.RETRY, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchCvmChipSelectionResponseClass.values().length];
            try {
                AnonymousClass005.A0v(HatchCvmChipSelectionResponseClass.ACCEPTED, iArr2, 1);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(HatchCvmChipSelectionResponseClass.RETRY, iArr2, 2);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(HatchCvmChipSelectionResponseClass.UNKNOWN, iArr2, 3);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(HatchCvmChipSelectionResponseClass.STAND_DOWN, iArr2, 4);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass002.A17(HatchCvmChipSelectionResponseClass.FATAL, iArr2);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object applyStoredCredentialContinuation(com.facebook.aura.confidentialvm.HatchVmAccessInputs r9, com.facebook.aura.confidentialvm.HatchVmAccessState r10, X.HtJ<? super com.facebook.aura.confidentialvm.HatchVmAccessState> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.facebook.aura.confidentialvm.HatchVmAccessController.C111931
            if (r0 == 0) goto L71
            r7 = r11
            com.facebook.aura.confidentialvm.HatchVmAccessController$applyStoredCredentialContinuation$1 r7 = (com.facebook.aura.confidentialvm.HatchVmAccessController.C111931) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L4a
            if (r0 != r3) goto Lb5
            java.lang.Object r2 = r7.L$3
            java.lang.Object r4 = r7.L$2
            java.lang.Object r10 = r7.L$1
            X.Hwg.A00(r1)
        L27:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRvKeyResolution r1 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRvKeyResolution) r1
            java.util.concurrent.ConcurrentHashMap$KeySetView<java.lang.String, java.lang.Boolean> r0 = r8.attemptedAutomaticCredentialVmIds
            boolean r0 = r0.contains(r2)
            com.facebook.aura.confidentialvm.StoredCredentialContinuation r1 = com.facebook.aura.confidentialvm.HatchVmAccessControllerKt.storedCredentialContinuation(r1, r0)
            com.facebook.aura.confidentialvm.StoredCredentialContinuation r0 = com.facebook.aura.confidentialvm.StoredCredentialContinuation.RETRY
            if (r1 == r0) goto L81
            int r1 = r1.ordinal()
            if (r1 == r5) goto Lb2
            r0 = 2
            if (r1 == r0) goto L7e
            r0 = 3
            if (r1 == r0) goto Lba
            if (r1 == r3) goto L77
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L4a:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.HatchGatewayStateSnapshot r0 = r9.gatewayState
            com.facebook.aura.gateway.HatchCvmAuthenticationState r4 = r0.authentication
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r8.gateway
            java.lang.String r0 = r0.currentWsUrl
            if (r0 == 0) goto Lba
            java.lang.String r2 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.extractHatcheryVMId(r0)
            if (r2 == 0) goto Lba
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository r1 = r8.repository
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r10
            r7.L$2 = r4
            r7.L$3 = r2
            r7.label = r3
            java.lang.Object r1 = r1.resolveRvKey(r2, r7)
            if (r1 != r6) goto L27
            return r6
        L71:
            com.facebook.aura.confidentialvm.HatchVmAccessController$applyStoredCredentialContinuation$1 r7 = new com.facebook.aura.confidentialvm.HatchVmAccessController$applyStoredCredentialContinuation$1
            r7.<init>(r11)
            goto L12
        L77:
            java.lang.String r0 = "handled above"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L7e:
            com.facebook.aura.confidentialvm.HatchVmAccessState$RetriableFailure r0 = com.facebook.aura.confidentialvm.HatchVmAccessState.RetriableFailure.INSTANCE
            return r0
        L81:
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r8.gateway
            java.lang.String r0 = r0.currentWsUrl
            if (r0 == 0) goto Lb3
            java.lang.String r0 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.extractHatcheryVMId(r0)
        L8b:
            boolean r0 = X.C7384Etj.areEqual(r0, r2)
            if (r0 == 0) goto Lae
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r8.gateway
            X.1BN<com.facebook.aura.gateway.HatchGatewayStateSnapshot> r0 = r0.gatewayState
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.gateway.HatchGatewayStateSnapshot r0 = (com.facebook.aura.gateway.HatchGatewayStateSnapshot) r0
            com.facebook.aura.gateway.HatchCvmAuthenticationState r0 = r0.authentication
            boolean r0 = X.C7384Etj.areEqual(r0, r4)
            if (r0 == 0) goto Lae
            java.util.concurrent.ConcurrentHashMap$KeySetView<java.lang.String, java.lang.Boolean> r0 = r8.attemptedAutomaticCredentialVmIds
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto Lba
            r8.reconnect(r3)
        Lae:
            com.facebook.aura.confidentialvm.HatchVmAccessState r10 = r8.loadingState()
        Lb2:
            return r10
        Lb3:
            r0 = 0
            goto L8b
        Lb5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lba:
            com.facebook.aura.confidentialvm.HatchVmAccessState$SecurityFailure r0 = com.facebook.aura.confidentialvm.HatchVmAccessState.SecurityFailure.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.HatchVmAccessController.applyStoredCredentialContinuation(com.facebook.aura.confidentialvm.HatchVmAccessInputs, com.facebook.aura.confidentialvm.HatchVmAccessState, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchVmAccessState awaitEnrollmentElsewhere(String str) {
        HxE<String, Integer> hxE = this.enrollmentElsewhere;
        if (hxE == null || !C3cG.A1O(str, hxE)) {
            this.enrollmentElsewhere = AnonymousClass002.A0p(str, 0);
            CFK.A03(HatcheryVMIdUtilsKt.vmIdForLog(str), TAG, "Waiting for another device to enroll vm=%s");
        } else {
            int iA0F = AnonymousClass001.A0F(hxE.second);
            if (iA0F >= 40) {
                HatchVmAccessState value = this._state.getValue();
                HatchVmAccessState.SecurityFailure securityFailure = HatchVmAccessState.SecurityFailure.INSTANCE;
                if (!C7384Etj.areEqual(value, securityFailure)) {
                    CFK.A0H(TAG, "No device enrolled vm=%s after %d reconnects", HatcheryVMIdUtilsKt.vmIdForLog(str), Integer.valueOf(iA0F));
                }
                return stickyTerminalFailure(securityFailure);
            }
        }
        return loadingState();
    }

    private final String awaitedEnrollmentVmId(HatchGatewayStateSnapshot hatchGatewayStateSnapshot) {
        String str;
        if ((C7384Etj.areEqual(hatchGatewayStateSnapshot.authentication, HatchCvmAuthenticationState.EnrollmentRequired.INSTANCE) || HatchVmAccessControllerKt.isFreshKeyUnpinned(hatchGatewayStateSnapshot)) && (str = this.gateway.currentWsUrl) != null) {
            return HatcheryVMIdUtilsKt.extractHatcheryVMId(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (X.C7384Etj.areEqual((r1 == null || !com.facebook.aura.gateway.HatchCvmReplaceStoreKt.isAwaitingChipSelection(r1)) ? null : r1.attemptId, r2.attemptId) == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0100 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bidUntilSettled(com.facebook.aura.gateway.HatchCvmReplacement.Active r17, X.HtJ<? super kotlin.Unit> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.HatchVmAccessController.bidUntilSettled(com.facebook.aura.gateway.HatchCvmReplacement$Active, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object enrollmentElsewhereVmId(com.facebook.aura.gateway.HatchGatewayStateSnapshot r8, X.HtJ<? super java.lang.String> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.confidentialvm.HatchVmAccessController.C111951
            if (r0 == 0) goto L4a
            r6 = r9
            com.facebook.aura.confidentialvm.HatchVmAccessController$enrollmentElsewhereVmId$1 r6 = (com.facebook.aura.confidentialvm.HatchVmAccessController.C111951) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L26
            if (r1 != r4) goto L51
            java.lang.Object r2 = r6.L$2
            X.Hwg.A00(r0)
        L23:
            if (r0 != 0) goto L50
            return r2
        L26:
            X.Hwg.A00(r0)
            java.lang.String r2 = r7.awaitedEnrollmentVmId(r8)
            if (r2 != 0) goto L30
            return r3
        L30:
            X.78T r1 = X.AnonymousClass001.A0y()
            com.facebook.aura.confidentialvm.HatchVmAccessController$enrollmentElsewhereVmId$2$1 r0 = new com.facebook.aura.confidentialvm.HatchVmAccessController$enrollmentElsewhereVmId$2$1
            r0.<init>(r2, r3)
            r6.L$0 = r3
            r6.L$1 = r3
            r6.L$2 = r2
            r6.L$3 = r3
            r6.label = r4
            java.lang.Object r0 = X.GAo.A00(r6, r1, r0)
            if (r0 != r5) goto L23
            return r5
        L4a:
            com.facebook.aura.confidentialvm.HatchVmAccessController$enrollmentElsewhereVmId$1 r6 = new com.facebook.aura.confidentialvm.HatchVmAccessController$enrollmentElsewhereVmId$1
            r6.<init>(r9)
            goto L12
        L50:
            return r3
        L51:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.HatchVmAccessController.enrollmentElsewhereVmId(com.facebook.aura.gateway.HatchGatewayStateSnapshot, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFinished(HatchGatewayConnectionState hatchGatewayConnectionState) {
        return (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Connected) || (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Error);
    }

    private final HatchVmAccessState loadingState() {
        HatchVmPeerType hatchVmPeerType = this.lastReadyPeerType;
        return hatchVmPeerType != null ? new HatchVmAccessState.Resuming(hatchVmPeerType) : HatchVmAccessState.Resolving.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object logUnlockOutcome(com.facebook.aura.gateway.connection.ConnectRequestResult.Accepted r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.confidentialvm.HatchVmAccessController.C111961
            if (r0 == 0) goto L74
            r4 = r9
            com.facebook.aura.confidentialvm.HatchVmAccessController$logUnlockOutcome$1 r4 = (com.facebook.aura.confidentialvm.HatchVmAccessController.C111961) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r6 = 1
            if (r0 == 0) goto L33
            if (r0 != r6) goto L7a
            X.Hwg.A00(r2)
        L20:
            if (r2 == 0) goto L2d
            com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger r1 = com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger.INSTANCE
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connected
            if (r0 == 0) goto L30
            com.facebook.aura.analytics.hatch.HatchClientCvmOutcome r0 = com.facebook.aura.analytics.hatch.HatchClientCvmOutcome.SUCCESS
        L2a:
            r1.logCvmReplacementUnlock(r0)
        L2d:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L30:
            com.facebook.aura.analytics.hatch.HatchClientCvmOutcome r0 = com.facebook.aura.analytics.hatch.HatchClientCvmOutcome.FAILURE
            goto L2a
        L33:
            X.Hwg.A00(r2)
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r7.gateway
            X.1BN<com.facebook.aura.gateway.HatchGatewayStateSnapshot> r0 = r0.gatewayState
            java.lang.Object r2 = r0.getValue()
            com.facebook.aura.gateway.HatchGatewayStateSnapshot r2 = (com.facebook.aura.gateway.HatchGatewayStateSnapshot) r2
            boolean r0 = r8.startedFreshCycle
            if (r0 != 0) goto L53
            int r1 = r2.connectionCycle
            int r0 = r8.connectionCycle
            if (r1 != r0) goto L53
            com.facebook.aura.gateway.HatchGatewayConnectionState r0 = r2.connection
            boolean r0 = r7.isFinished(r0)
            r3 = 1
            if (r0 != 0) goto L54
        L53:
            r3 = 0
        L54:
            int r1 = r8.connectionCycle
            if (r3 == 0) goto L5a
            int r1 = r1 + 1
        L5a:
            r0 = 0
            com.facebook.aura.confidentialvm.HatchVmAccessController$logUnlockOutcome$connection$1 r2 = new com.facebook.aura.confidentialvm.HatchVmAccessController$logUnlockOutcome$connection$1
            r2.<init>(r7, r1, r0)
            r4.L$0 = r0
            r4.L$1 = r0
            r4.I$0 = r3
            r4.I$1 = r1
            r4.label = r6
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            java.lang.Object r2 = X.GAX.A01(r4, r2, r0)
            if (r2 != r5) goto L20
            return r5
        L74:
            com.facebook.aura.confidentialvm.HatchVmAccessController$logUnlockOutcome$1 r4 = new com.facebook.aura.confidentialvm.HatchVmAccessController$logUnlockOutcome$1
            r4.<init>(r9)
            goto L12
        L7a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.HatchVmAccessController.logUnlockOutcome(com.facebook.aura.gateway.connection.ConnectRequestResult$Accepted, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pinAcceptedBidForEnrollment(com.facebook.aura.gateway.HatchGatewayStateSnapshot r9, X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.confidentialvm.HatchVmAccessController.C111981
            if (r0 == 0) goto L63
            r7 = r10
            com.facebook.aura.confidentialvm.HatchVmAccessController$pinAcceptedBidForEnrollment$1 r7 = (com.facebook.aura.confidentialvm.HatchVmAccessController.C111981) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r6 = r7.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r4 = 1
            if (r0 == 0) goto L37
            if (r0 != r4) goto L69
            java.lang.Object r0 = r7.L$1
            java.lang.String r3 = X.C3cG.A0d(r0, r6)
        L23:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L36
            java.lang.String r2 = "Pinned this device's accepted bid for enrollment vm=%s"
            java.lang.String r1 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.vmIdForLog(r3)
            java.lang.String r0 = "HatchVmAccessController"
            X.CFK.A03(r1, r0, r2)
        L36:
            return r6
        L37:
            X.Hwg.A00(r6)
            boolean r0 = com.facebook.aura.confidentialvm.HatchVmAccessControllerKt.isFreshKeyUnpinned(r9)
            if (r0 == 0) goto L6e
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r8.gateway
            java.lang.String r0 = r0.currentWsUrl
            if (r0 == 0) goto L6e
            java.lang.String r3 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.extractHatcheryVMId(r0)
            if (r3 == 0) goto L6e
            X.78T r2 = X.AnonymousClass001.A0y()
            r1 = 0
            com.facebook.aura.confidentialvm.HatchVmAccessController$pinAcceptedBidForEnrollment$pinned$1 r0 = new com.facebook.aura.confidentialvm.HatchVmAccessController$pinAcceptedBidForEnrollment$pinned$1
            r0.<init>(r3, r1)
            r7.L$0 = r1
            r7.L$1 = r3
            r7.label = r4
            java.lang.Object r6 = X.GAo.A00(r7, r2, r0)
            if (r6 != r5) goto L23
            return r5
        L63:
            com.facebook.aura.confidentialvm.HatchVmAccessController$pinAcceptedBidForEnrollment$1 r7 = new com.facebook.aura.confidentialvm.HatchVmAccessController$pinAcceptedBidForEnrollment$1
            r7.<init>(r10)
            goto L12
        L69:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L6e:
            java.lang.Boolean r5 = X.AnonymousClass001.A0h()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.HatchVmAccessController.pinAcceptedBidForEnrollment(com.facebook.aura.gateway.HatchGatewayStateSnapshot, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishState(HatchVmAccessState hatchVmAccessState) {
        String strExtractHatcheryVMId;
        if (hatchVmAccessState instanceof HatchVmAccessState.Ready) {
            this.lastReadyPeerType = ((HatchVmAccessState.Ready) hatchVmAccessState).peerType;
            this.enrollmentElsewhere = null;
            String str = this.gateway.currentWsUrl;
            if (str != null && (strExtractHatcheryVMId = HatcheryVMIdUtilsKt.extractHatcheryVMId(str)) != null) {
                this.attemptedAutomaticCredentialVmIds.remove(strExtractHatcheryVMId);
            }
        } else if (C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.AwaitingEligibility.INSTANCE)) {
            this.lastReadyPeerType = null;
        }
        this._state.Af8(hatchVmAccessState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reconnect(boolean z) {
        C9286GCn.A00(null, AnonymousClass001.A0h(), (C9286GCn) this.localConnectionFailure);
        this.lastTerminalFailure = null;
        AnonymousClass001.A1J(new C111991(z, null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchVmAccessState reduceAccessState(HatchVmAccessInputs hatchVmAccessInputs) {
        if (hatchVmAccessInputs.connectionFailed && !(hatchVmAccessInputs.gatewayState.connection instanceof HatchGatewayConnectionState.Connected)) {
            return HatchVmAccessState.RetriableFailure.INSTANCE;
        }
        try {
            return HatchVmAccessControllerKt.reduceHatchVmAccessState(hatchVmAccessInputs.userData, hatchVmAccessInputs.gatewayState, this.lastReadyPeerType);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            CFK.A08(TAG, "Failed to reduce VM access state", e2);
            return HatchVmAccessState.RetriableFailure.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (X.AnonymousClass001.A1X(r5) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolvePublicState(com.facebook.aura.confidentialvm.HatchVmAccessInputs r10, X.HtJ<? super com.facebook.aura.confidentialvm.HatchVmAccessState> r11) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.HatchVmAccessController.resolvePublicState(com.facebook.aura.confidentialvm.HatchVmAccessInputs, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchVmAccessState stickyTerminalFailure(HatchVmAccessState hatchVmAccessState) {
        if (C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.RetriableFailure.INSTANCE) || C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.SecurityFailure.INSTANCE) || C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.AttestationFailure.INSTANCE)) {
            this.lastTerminalFailure = hatchVmAccessState;
            return hatchVmAccessState;
        }
        if (C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.Resolving.INSTANCE) || (hatchVmAccessState instanceof HatchVmAccessState.Resuming)) {
            HatchVmAccessState hatchVmAccessState2 = this.lastTerminalFailure;
            if (hatchVmAccessState2 != null) {
                return hatchVmAccessState2;
            }
        } else {
            this.lastTerminalFailure = null;
        }
        return hatchVmAccessState;
    }

    public final C1BN<HatchVmAccessState> getState() {
        return this.state;
    }

    public final void reconnectAfterCredentialAvailable() {
        BLG<Integer> blg = this.credentialArrivals;
        AnonymousClass002.A1I(blg, Integer.valueOf(AnonymousClass001.A0F(blg.getValue()) + 1));
        reconnect(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reconnectAfterCredentialAvailableAndAwait(X.HtJ<? super com.facebook.aura.confidentialvm.HatchVmAccessState> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.HatchVmAccessController.C112001
            if (r0 == 0) goto L22
            r5 = r8
            com.facebook.aura.confidentialvm.HatchVmAccessController$reconnectAfterCredentialAvailableAndAwait$1 r5 = (com.facebook.aura.confidentialvm.HatchVmAccessController.C112001) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 == r2) goto L55
            if (r0 != r3) goto L28
            goto L79
        L22:
            com.facebook.aura.confidentialvm.HatchVmAccessController$reconnectAfterCredentialAvailableAndAwait$1 r5 = new com.facebook.aura.confidentialvm.HatchVmAccessController$reconnectAfterCredentialAvailableAndAwait$1
            r5.<init>(r8)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            X.BLG<java.lang.Integer> r1 = r7.credentialArrivals
            java.lang.Object r0 = r1.getValue()
            int r0 = X.AnonymousClass001.A0F(r0)
            int r0 = r0 + 1
            java.lang.Integer r0 = X.C3cG.A0R(r0)
            X.AnonymousClass001.A1E(r1, r4, r0)
            X.BLG<java.lang.Boolean> r0 = r7.credentialReconnectInFlight
            X.AnonymousClass003.A14(r0, r2)
            r7.lastTerminalFailure = r4
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r7.gateway     // Catch: java.lang.Throwable -> L99
            r5.label = r2     // Catch: java.lang.Throwable -> L99
            java.lang.Object r1 = r0.forceReconnectForCredential(r5)     // Catch: java.lang.Throwable -> L99
            if (r1 != r6) goto L58
            return r6
        L55:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L99
        L58:
            com.facebook.aura.gateway.connection.ConnectRequestResult r1 = (com.facebook.aura.gateway.connection.ConnectRequestResult) r1     // Catch: java.lang.Throwable -> L99
            boolean r0 = r1 instanceof com.facebook.aura.gateway.connection.ConnectRequestResult.Accepted     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L83
            com.facebook.aura.gateway.connection.ConnectRequestResult$Accepted r1 = (com.facebook.aura.gateway.connection.ConnectRequestResult.Accepted) r1     // Catch: java.lang.Throwable -> L99
            int r2 = r1.connectionCycle     // Catch: java.lang.Throwable -> L99
            X.20Q<com.facebook.aura.confidentialvm.HatchVmAccessInputs> r0 = r7.inputs     // Catch: java.lang.Throwable -> L99
            com.facebook.aura.confidentialvm.HatchVmAccessController$reconnectAfterCredentialAvailableAndAwait$$inlined$map$1 r1 = new com.facebook.aura.confidentialvm.HatchVmAccessController$reconnectAfterCredentialAvailableAndAwait$$inlined$map$1     // Catch: java.lang.Throwable -> L99
            r1.<init>(r0, r7)     // Catch: java.lang.Throwable -> L99
            com.facebook.aura.confidentialvm.HatchVmAccessController$reconnectAfterCredentialAvailableAndAwait$3 r0 = new com.facebook.aura.confidentialvm.HatchVmAccessController$reconnectAfterCredentialAvailableAndAwait$3     // Catch: java.lang.Throwable -> L99
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L99
            r5.I$0 = r2     // Catch: java.lang.Throwable -> L99
            r5.label = r3     // Catch: java.lang.Throwable -> L99
            java.lang.Object r1 = X.AbstractC9777Gfy.A00(r5, r0, r1)     // Catch: java.lang.Throwable -> L99
            if (r1 != r6) goto L7c
            return r6
        L79:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L99
        L7c:
            X.HxE r1 = (X.HxE) r1     // Catch: java.lang.Throwable -> L99
            B r2 = r1.second     // Catch: java.lang.Throwable -> L99
            com.facebook.aura.confidentialvm.HatchVmAccessState r2 = (com.facebook.aura.confidentialvm.HatchVmAccessState) r2     // Catch: java.lang.Throwable -> L99
            goto L8d
        L83:
            com.facebook.aura.gateway.connection.ConnectRequestResult$Rejected r0 = com.facebook.aura.gateway.connection.ConnectRequestResult.Rejected.INSTANCE     // Catch: java.lang.Throwable -> L99
            boolean r0 = X.C7384Etj.areEqual(r1, r0)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L94
            com.facebook.aura.confidentialvm.HatchVmAccessState$RetriableFailure r2 = com.facebook.aura.confidentialvm.HatchVmAccessState.RetriableFailure.INSTANCE     // Catch: java.lang.Throwable -> L99
        L8d:
            X.BLG<java.lang.Boolean> r1 = r7.credentialReconnectInFlight
            r0 = 0
            X.AnonymousClass003.A14(r1, r0)
            return r2
        L94:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()     // Catch: java.lang.Throwable -> L99
            throw r0     // Catch: java.lang.Throwable -> L99
        L99:
            r2 = move-exception
            X.BLG<java.lang.Boolean> r1 = r7.credentialReconnectInFlight
            r0 = 0
            X.AnonymousClass003.A14(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.HatchVmAccessController.reconnectAfterCredentialAvailableAndAwait(X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final HatchVmAccessController getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchVmAccessController) abstractC3358CGz.A03(HatchVmAccessController.class, new HatchVmAccessController$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchVmAccessController(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(abstractC3358CGz);
        this.gateway = gateway;
        HzC hzCA0x = C3cH.A0x(C3cG.A0v());
        this.scope = hzCA0x;
        C9286GCn c9286GCnA01 = HnJ.A01(HatchVmAccessState.AwaitingEligibility.INSTANCE);
        this._state = c9286GCnA01;
        this.state = C3cG.A11(c9286GCnA01);
        this.repository = ConfidentialVmRepository.Companion.getInstance(abstractC3358CGz);
        C9286GCn c9286GCnA14 = C3cG.A14(false);
        this.localConnectionFailure = c9286GCnA14;
        C9286GCn c9286GCnA142 = C3cG.A14(false);
        this.credentialReconnectInFlight = c9286GCnA142;
        this.credentialArrivals = C3cG.A14(0);
        this.chipBudgetGate = HatchCvmChipBudgetGate.Companion.getInstance(abstractC3358CGz);
        this.attemptedAutomaticCredentialVmIds = ConcurrentHashMap.newKeySet();
        this.loggedMaintenanceAttemptId = new AtomicReference<>(null);
        this.inputs = new AnonymousClass603(3, new HatchVmAccessController$inputs$2(null), new C20Q[]{AuraViewerDataProvider.Companion.getInstance(abstractC3358CGz).userData, gateway.gatewayState, c9286GCnA14, c9286GCnA142, C3rb.A03(new HatchVmAccessController$inputs$1(null), HatchCvmReplaceStore.Companion.getInstance(abstractC3358CGz).replacement, C3cG.A0D(abstractC3358CGz).hatcheryVmIdFlow)});
        HatchCvmReplacePoller.Companion.getInstance(abstractC3358CGz);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, anonymousClass1, hzCA0x);
        GAo.A02(num, c6ys, new AnonymousClass2(null), hzCA0x);
        GAo.A02(num, c6ys, new AnonymousClass3(null), hzCA0x);
        GAo.A02(num, c6ys, new AnonymousClass4(null), hzCA0x);
        GAo.A02(num, c6ys, new AnonymousClass5(null), hzCA0x);
        GAo.A02(num, c6ys, new AnonymousClass6(null), hzCA0x);
    }

    public /* synthetic */ HatchVmAccessController(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
