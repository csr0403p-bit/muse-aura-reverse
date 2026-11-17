package com.facebook.aura.gateway.connection;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AbstractC7607F5u;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C10533Hqc;
import X.C1BN;
import X.C20Z;
import X.C2zT;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3pU;
import X.C60O;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7Bq;
import X.C9286GCn;
import X.CFK;
import X.CUB;
import X.EnumC10460Hji;
import X.Ey9;
import X.G0U;
import X.G0V;
import X.G0W;
import X.GAo;
import X.GBM;
import X.GCV;
import X.HnJ;
import X.Ho5;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.HzR;
import X.InterfaceC10560Hsz;
import com.facebook.aura.gateway.connection.ConnectionEffect;
import com.facebook.aura.gateway.connection.ConnectionEvent;
import com.facebook.aura.gateway.connection.ConnectionPhase;
import com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class ConnectionEngine {
    public final BLG<ConnectionPhase> _phase;
    public final BLG<ConnectionPhaseSnapshot> _phaseSnapshot;
    public final Function0<Integer> aggressiveMaxRetryCount;
    public final Function0<Long> aggressiveRetryDelayMs;
    public final HzR<Command> commands;
    public final ConnectionConfig config;
    public final ConnectSourceTracker connectSourceTracker;
    public final ConnectionEngineHost host;
    public boolean lastForeground;
    public Long lastNetworkRecoveryDialNs;
    public boolean lastOnline;
    public String lastValidatedTransport;
    public final Function0<ConnectionLifecycleSnapshot> lifecycleSnapshot;
    public final HoC loopJob;
    public final Function0<Long> monotonicNowNs;
    public final Function0<Long> now;
    public final G0U<Throwable, Unit> onError;
    public final G0V<ConnectionPhase, Integer, Unit> onPhaseChanged;
    public final Set<InterfaceC10560Hsz<ConnectionDemandOutcome>> pendingDemands;
    public final C1BN<ConnectionPhase> phase;
    public final C1BN<ConnectionPhaseSnapshot> phaseSnapshot;
    public final Function0<Long> restartReconnectDelayMs;
    public final C3UX scope;
    public ConnectionState state;
    public final Map<TimerKey, HoC> timers;
    public final Function0<Long> vmWakeRetryDelayMs;

    @DebugMetadata(c = "com.facebook.aura.gateway.connection.ConnectionEngine$10", f = "ConnectionEngine.kt", l = {173}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$10$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ Command $command;
            public final /* synthetic */ ConnectionEngine this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ConnectionEngine connectionEngine, Command command) {
                super(0);
                this.this$0 = connectionEngine;
                this.$command = command;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ConnectionEngine connectionEngine = this.this$0;
                Command.Connect connect = (Command.Connect) this.$command;
                connectionEngine.apply(new ConnectionEvent.ConnectRequested(connect.force, connect.joinInFlight));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$10$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ Command $command;
            public final /* synthetic */ ConnectionEngine this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ConnectionEngine connectionEngine, Command command) {
                super(0);
                this.this$0 = connectionEngine;
                this.$command = command;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ConnectionEngine connectionEngine = this.this$0;
                Command.AcquireForDemand acquireForDemand = (Command.AcquireForDemand) this.$command;
                connectionEngine.acquireForDemand(acquireForDemand.lifecycle, acquireForDemand.ack);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass10(HtJ<? super AnonymousClass10> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionEngine.this.new AnonymousClass10(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionEngine.this.new AnonymousClass10(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
        
            if (r5 != com.facebook.aura.gateway.connection.ConnectionPhase.ReconnectActivity.ACTIVE) goto L42;
         */
        /* JADX WARN: Path cross not found for [B:35:0x00cf, B:42:0x00e3], limit reached: 104 */
        /* JADX WARN: Path cross not found for [B:42:0x00e3, B:50:0x00f8], limit reached: 104 */
        /* JADX WARN: Path cross not found for [B:50:0x00f8, B:33:0x00cb], limit reached: 104 */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00fd A[Catch: all -> 0x0149, CancellationException -> 0x0194, TryCatch #5 {CancellationException -> 0x0194, all -> 0x0149, blocks: (B:9:0x001e, B:13:0x0035, B:64:0x012e, B:65:0x013c, B:19:0x006e, B:21:0x0076, B:22:0x007d, B:24:0x0081, B:25:0x008d, B:27:0x0091, B:29:0x009c, B:31:0x00bd, B:33:0x00cb, B:35:0x00cf, B:37:0x00d9, B:39:0x00dd, B:40:0x00df, B:42:0x00e3, B:44:0x00e7, B:46:0x00f1, B:51:0x00f9, B:53:0x00fd, B:56:0x0106, B:58:0x010e, B:57:0x010c, B:59:0x0114, B:61:0x0118, B:62:0x0127, B:16:0x004d, B:18:0x005e, B:11:0x0027, B:15:0x0046, B:12:0x002e), top: B:99:0x001e, inners: #0, #2, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x010c A[Catch: all -> 0x0149, CancellationException -> 0x0194, TryCatch #5 {CancellationException -> 0x0194, all -> 0x0149, blocks: (B:9:0x001e, B:13:0x0035, B:64:0x012e, B:65:0x013c, B:19:0x006e, B:21:0x0076, B:22:0x007d, B:24:0x0081, B:25:0x008d, B:27:0x0091, B:29:0x009c, B:31:0x00bd, B:33:0x00cb, B:35:0x00cf, B:37:0x00d9, B:39:0x00dd, B:40:0x00df, B:42:0x00e3, B:44:0x00e7, B:46:0x00f1, B:51:0x00f9, B:53:0x00fd, B:56:0x0106, B:58:0x010e, B:57:0x010c, B:59:0x0114, B:61:0x0118, B:62:0x0127, B:16:0x004d, B:18:0x005e, B:11:0x0027, B:15:0x0046, B:12:0x002e), top: B:99:0x001e, inners: #0, #2, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x016f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x016d -> B:6:0x0010). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 414
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.connection.ConnectionEngine.AnonymousClass10.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$11, reason: invalid class name */
    public final class AnonymousClass11 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public AnonymousClass11() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ConnectionEngine.this.commands.A5w(null);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.connection.ConnectionEngine$12", f = "ConnectionEngine.kt", l = {250}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$12, reason: invalid class name */
    public final class AnonymousClass12 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ NetworkSource $network;
        public int label;
        public final /* synthetic */ ConnectionEngine this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(NetworkSource networkSource, ConnectionEngine connectionEngine, HtJ<? super AnonymousClass12> htJ) {
            super(2, htJ);
            this.$network = networkSource;
            this.this$0 = connectionEngine;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass12(this.$network, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BN<Boolean> c1bnIsOnline = this.$network.isOnline();
                    final ConnectionEngine connectionEngine = this.this$0;
                    C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.gateway.connection.ConnectionEngine.12.1
                        public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                            ConnectionEngine connectionEngine2 = connectionEngine;
                            if (z != connectionEngine2.lastOnline) {
                                connectionEngine2.lastOnline = z;
                                connectionEngine2.post(new ConnectionEvent.NetworkChanged(z));
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                        }
                    };
                    this.label = 1;
                    if (c1bnIsOnline.collect(c20z, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                throw new KotlinNothingValueException();
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                this.this$0.reportError(th);
                return Unit.INSTANCE;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass12) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.connection.ConnectionEngine$13", f = "ConnectionEngine.kt", l = {813}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$13, reason: invalid class name */
    public final class AnonymousClass13 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ NetworkSource $network;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ ConnectionEngine this$0;

        @DebugMetadata(c = "com.facebook.aura.gateway.connection.ConnectionEngine$13$1", f = "ConnectionEngine.kt", l = {268}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$13$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<String, HtJ<? super Unit>, Object> {
            public int I$0;
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ ConnectionEngine this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ConnectionEngine connectionEngine, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = connectionEngine;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, htJ);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.L$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    boolean zAreEqual = C7384Etj.areEqual(str, this.this$0.lastValidatedTransport);
                    int i2 = !zAreEqual ? 1 : 0;
                    this.this$0.lastValidatedTransport = str;
                    if (!zAreEqual && str != null) {
                        this.L$0 = null;
                        this.I$0 = i2;
                        this.label = 1;
                        if (C7Bq.A01(2000L, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                this.this$0.post(ConnectionEvent.NetworkRecovered.INSTANCE);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(String str, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(NetworkSource networkSource, ConnectionEngine connectionEngine, HtJ<? super AnonymousClass13> htJ) {
            super(2, htJ);
            this.$network = networkSource;
            this.this$0 = connectionEngine;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass13(this.$network, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BN<String> validatedTransport = this.$network.getValidatedTransport();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    C7384Etj.A0Z(validatedTransport, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (C3pU.A00(this, anonymousClass1, validatedTransport) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                throw C3cG.A0Q("SharedFlow never completes, this call should never return.");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                this.this$0.reportError(th);
                return Unit.INSTANCE;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass13) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.connection.ConnectionEngine$14", f = "ConnectionEngine.kt", l = {280}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$14, reason: invalid class name */
    public final class AnonymousClass14 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AppLifecycleSource $lifecycle;
        public int label;
        public final /* synthetic */ ConnectionEngine this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(AppLifecycleSource appLifecycleSource, ConnectionEngine connectionEngine, HtJ<? super AnonymousClass14> htJ) {
            super(2, htJ);
            this.$lifecycle = appLifecycleSource;
            this.this$0 = connectionEngine;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass14(this.$lifecycle, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BN<Boolean> c1bnIsForeground = this.$lifecycle.isForeground();
                    final ConnectionEngine connectionEngine = this.this$0;
                    C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.gateway.connection.ConnectionEngine.14.1
                        public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                            ConnectionEngine connectionEngine2 = connectionEngine;
                            if (z != connectionEngine2.lastForeground) {
                                connectionEngine2.lastForeground = z;
                                connectionEngine2.refreshLifecycle();
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                        }
                    };
                    this.label = 1;
                    if (c1bnIsForeground.collect(c20z, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                throw new KotlinNothingValueException();
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                this.this$0.reportError(th);
                return Unit.INSTANCE;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass14) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<ConnectionLifecycleSnapshot> {
        public final /* synthetic */ AppLifecycleSource $lifecycle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AppLifecycleSource appLifecycleSource) {
            super(0);
            this.$lifecycle = appLifecycleSource;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ConnectionLifecycleSnapshot invoke() {
            return new ConnectionLifecycleSnapshot(C3cH.A1R(this.$lifecycle.isForeground()), false, false, false, false, false);
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements Function0<Long> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return null;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements Function0<Long> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return null;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements Function0<Integer> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return null;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements Function0<Long> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return null;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<ConnectionPhase, Integer, Unit> {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        public AnonymousClass9() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(ConnectionPhase connectionPhase, Integer num) {
            num.intValue();
            return Unit.INSTANCE;
        }

        public final void invoke(ConnectionPhase connectionPhase, int i) {
        }
    }

    public interface Command {

        public final class AcquireForDemand extends C06G implements Command {
            public final InterfaceC10560Hsz<ConnectionDemandOutcome> ack;
            public final ConnectionLifecycleSnapshot lifecycle;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof AcquireForDemand) {
                        AcquireForDemand acquireForDemand = (AcquireForDemand) obj;
                        if (!C7384Etj.areEqual(this.lifecycle, acquireForDemand.lifecycle) || !C7384Etj.areEqual(this.ack, acquireForDemand.ack)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ AcquireForDemand copy$default(AcquireForDemand acquireForDemand, ConnectionLifecycleSnapshot connectionLifecycleSnapshot, InterfaceC10560Hsz interfaceC10560Hsz, int i, Object obj) {
                if ((i & 1) != 0) {
                    connectionLifecycleSnapshot = acquireForDemand.lifecycle;
                }
                if ((i & 2) != 0) {
                    interfaceC10560Hsz = acquireForDemand.ack;
                }
                AnonymousClass003.A0u(connectionLifecycleSnapshot, interfaceC10560Hsz);
                return new AcquireForDemand(connectionLifecycleSnapshot, interfaceC10560Hsz);
            }

            public final ConnectionLifecycleSnapshot component1() {
                return this.lifecycle;
            }

            public final InterfaceC10560Hsz<ConnectionDemandOutcome> component2() {
                return this.ack;
            }

            public final InterfaceC10560Hsz<ConnectionDemandOutcome> getAck() {
                return this.ack;
            }

            public final ConnectionLifecycleSnapshot getLifecycle() {
                return this.lifecycle;
            }

            public int hashCode() {
                return AnonymousClass005.A0G(this.ack, AnonymousClass005.A0E(this.lifecycle));
            }

            public AcquireForDemand(ConnectionLifecycleSnapshot connectionLifecycleSnapshot, InterfaceC10560Hsz<ConnectionDemandOutcome> interfaceC10560Hsz) {
                AnonymousClass003.A0u(connectionLifecycleSnapshot, interfaceC10560Hsz);
                this.lifecycle = connectionLifecycleSnapshot;
                this.ack = interfaceC10560Hsz;
            }

            public final AcquireForDemand copy(ConnectionLifecycleSnapshot connectionLifecycleSnapshot, InterfaceC10560Hsz<ConnectionDemandOutcome> interfaceC10560Hsz) {
                AnonymousClass003.A0u(connectionLifecycleSnapshot, interfaceC10560Hsz);
                return new AcquireForDemand(connectionLifecycleSnapshot, interfaceC10560Hsz);
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Connect extends C06G implements Command {
            public final InterfaceC10560Hsz<ConnectRequestResult> ack;
            public final boolean force;
            public final boolean joinInFlight;
            public final String source;

            public Connect(boolean z, boolean z2, InterfaceC10560Hsz<ConnectRequestResult> interfaceC10560Hsz, String str) {
                C7384Etj.A0Y(interfaceC10560Hsz, 2);
                this.force = z;
                this.joinInFlight = z2;
                this.ack = interfaceC10560Hsz;
                this.source = str;
            }

            public final Connect copy(boolean z, boolean z2, InterfaceC10560Hsz<ConnectRequestResult> interfaceC10560Hsz, String str) {
                C7384Etj.A0Y(interfaceC10560Hsz, 2);
                return new Connect(z, z2, interfaceC10560Hsz, str);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Connect) {
                        Connect connect = (Connect) obj;
                        if (this.force != connect.force || this.joinInFlight != connect.joinInFlight || !C7384Etj.areEqual(this.ack, connect.ack) || !C7384Etj.areEqual(this.source, connect.source)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Connect copy$default(Connect connect, boolean z, boolean z2, InterfaceC10560Hsz interfaceC10560Hsz, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = connect.force;
                }
                if ((i & 2) != 0) {
                    z2 = connect.joinInFlight;
                }
                if ((i & 4) != 0) {
                    interfaceC10560Hsz = connect.ack;
                }
                if ((i & 8) != 0) {
                    str = connect.source;
                }
                C7384Etj.A0Y(interfaceC10560Hsz, 2);
                return new Connect(z, z2, interfaceC10560Hsz, str);
            }

            public final boolean component1() {
                return this.force;
            }

            public final boolean component2() {
                return this.joinInFlight;
            }

            public final InterfaceC10560Hsz<ConnectRequestResult> component3() {
                return this.ack;
            }

            public final String component4() {
                return this.source;
            }

            public final InterfaceC10560Hsz<ConnectRequestResult> getAck() {
                return this.ack;
            }

            public final boolean getForce() {
                return this.force;
            }

            public final boolean getJoinInFlight() {
                return this.joinInFlight;
            }

            public final String getSource() {
                return this.source;
            }

            public int hashCode() {
                return AnonymousClass005.A0F(this.ack, C0KA.A01(C0KA.A02(this.force), this.joinInFlight)) + AnonymousClass006.A0G(this.source);
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Post extends C06G implements Command {
            public final ConnectionEvent event;

            public Post(ConnectionEvent connectionEvent) {
                C7384Etj.A0Y(connectionEvent, 0);
                this.event = connectionEvent;
            }

            public final Post copy(ConnectionEvent connectionEvent) {
                C7384Etj.A0Y(connectionEvent, 0);
                return new Post(connectionEvent);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Post) && C7384Etj.areEqual(this.event, ((Post) obj).event));
            }

            public static /* synthetic */ Post copy$default(Post post, ConnectionEvent connectionEvent, int i, Object obj) {
                if ((i & 1) != 0) {
                    connectionEvent = post.event;
                }
                C7384Etj.A0Y(connectionEvent, 0);
                return new Post(connectionEvent);
            }

            public final ConnectionEvent component1() {
                return this.event;
            }

            public final ConnectionEvent getEvent() {
                return this.event;
            }

            public int hashCode() {
                return this.event.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class PrepareTransport implements Command {
            public static final PrepareTransport INSTANCE = new PrepareTransport();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof PrepareTransport);
            }

            public String toString() {
                return "PrepareTransport";
            }

            public int hashCode() {
                return 562831901;
            }
        }

        public final class Shutdown implements Command {
            public static final Shutdown INSTANCE = new Shutdown();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Shutdown);
            }

            public String toString() {
                return "Shutdown";
            }

            public int hashCode() {
                return -805711471;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TimerKey {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ TimerKey[] $VALUES;
        public static final TimerKey EXHAUSTION;
        public static final TimerKey HANDSHAKE;
        public static final TimerKey KEEPALIVE;
        public static final TimerKey RECONNECT;
        public static final TimerKey STABILITY;

        static {
            TimerKey timerKey = new TimerKey("HANDSHAKE", 0);
            HANDSHAKE = timerKey;
            TimerKey timerKey2 = new TimerKey("KEEPALIVE", 1);
            KEEPALIVE = timerKey2;
            TimerKey timerKey3 = new TimerKey("RECONNECT", 2);
            RECONNECT = timerKey3;
            TimerKey timerKey4 = new TimerKey("STABILITY", 3);
            STABILITY = timerKey4;
            TimerKey timerKey5 = new TimerKey("EXHAUSTION", 4);
            EXHAUSTION = timerKey5;
            TimerKey[] timerKeyArr = {timerKey, timerKey2, timerKey3, timerKey4, timerKey5};
            $VALUES = timerKeyArr;
            $ENTRIES = C3cG.A0w(timerKeyArr);
        }

        public static Ey9<TimerKey> getEntries() {
            return $ENTRIES;
        }

        public static TimerKey valueOf(String str) {
            return (TimerKey) Enum.valueOf(TimerKey.class, str);
        }

        public static TimerKey[] values() {
            return (TimerKey[]) $VALUES.clone();
        }

        public TimerKey(String str, int i) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.connection.ConnectionEngine", f = "ConnectionEngine.kt", l = {331}, m = "acquireForDemand", v = 2)
    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$acquireForDemand$1, reason: invalid class name and case insensitive filesystem */
    public final class C121421 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C121421(HtJ<? super C121421> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionEngine.this.acquireForDemand(this);
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$apply$2, reason: invalid class name and case insensitive filesystem */
    public final class C121432 extends AbstractC7559F3s implements G0U<ConnectionEffect, CharSequence> {
        public static final C121432 INSTANCE = new C121432();

        public C121432() {
            super(1);
        }

        @Override // X.G0U
        public final CharSequence invoke(ConnectionEffect connectionEffect) {
            C7384Etj.A0Y(connectionEffect, 0);
            return connectionEffect.getClass().getSimpleName();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.connection.ConnectionEngine", f = "ConnectionEngine.kt", l = {313}, m = "connect", v = 2)
    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$connect$1, reason: invalid class name and case insensitive filesystem */
    public final class C121441 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public C121441(HtJ<? super C121441> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionEngine.this.connect(false, false, null, this);
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$perform$1, reason: invalid class name and case insensitive filesystem */
    public final class C121451 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ ConnectionEffect $effect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121451(ConnectionEffect connectionEffect) {
            super(0);
            this.$effect = connectionEffect;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ConnectionEngine.this.post(new ConnectionEvent.TransportConnecting(((ConnectionEffect.OpenTransport) this.$effect).epoch));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$perform$10, reason: invalid class name and case insensitive filesystem */
    public final class C1214610 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ ConnectionEffect $effect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1214610(ConnectionEffect connectionEffect) {
            super(0);
            this.$effect = connectionEffect;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ConnectionEngine.this.post(new ConnectionEvent.KeepaliveTick(((ConnectionEffect.ScheduleKeepaliveTimer) this.$effect).epoch));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$perform$11, reason: invalid class name and case insensitive filesystem */
    public final class C1214711 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ ConnectionEffect $effect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1214711(ConnectionEffect connectionEffect) {
            super(0);
            this.$effect = connectionEffect;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ConnectionEngine.this.post(new ConnectionEvent.ReconnectTimerFired(((ConnectionEffect.ScheduleReconnectTimer) this.$effect).epoch));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$perform$12, reason: invalid class name and case insensitive filesystem */
    public final class C1214812 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ ConnectionEffect $effect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1214812(ConnectionEffect connectionEffect) {
            super(0);
            this.$effect = connectionEffect;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ConnectionEngine.this.post(new ConnectionEvent.StabilityElapsed(((ConnectionEffect.ScheduleStabilityTimer) this.$effect).epoch));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$perform$13, reason: invalid class name and case insensitive filesystem */
    public final class C1214913 extends AbstractC7559F3s implements Function0<Unit> {
        public C1214913() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ConnectionEngine.this.post(ConnectionEvent.ExhaustionCooldownElapsed.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$perform$14, reason: invalid class name and case insensitive filesystem */
    public final class C1215014 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
        public C1215014() {
            super(1);
        }

        public final void invoke(boolean z) {
            ConnectionEngine.this.post(new ConnectionEvent.ResetFinished(z));
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(AnonymousClass001.A1X(bool));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$perform$2, reason: invalid class name and case insensitive filesystem */
    public final class C121512 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ ConnectionEffect $effect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121512(ConnectionEffect connectionEffect) {
            super(0);
            this.$effect = connectionEffect;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ConnectionEngine.this.post(new ConnectionEvent.TransportSubscribing(((ConnectionEffect.OpenTransport) this.$effect).epoch));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$perform$3, reason: invalid class name and case insensitive filesystem */
    public final class C121523 extends AbstractC7559F3s implements G0U<String, Unit> {
        public final /* synthetic */ ConnectionEffect $effect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121523(ConnectionEffect connectionEffect) {
            super(1);
            this.$effect = connectionEffect;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            ConnectionEngine.this.post(new ConnectionEvent.TransportOpened(((ConnectionEffect.OpenTransport) this.$effect).epoch, str));
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$perform$4, reason: invalid class name and case insensitive filesystem */
    public final class C121534 extends AbstractC7559F3s implements G0V<Integer, String, Unit> {
        public final /* synthetic */ ConnectionEffect $effect;

        public final void invoke(int i, String str) {
            C7384Etj.A0Y(str, 1);
            ConnectionEngine.this.post(new ConnectionEvent.TransportClosed(((ConnectionEffect.OpenTransport) this.$effect).epoch, i, str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121534(ConnectionEffect connectionEffect) {
            super(2);
            this.$effect = connectionEffect;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str) {
            invoke(AnonymousClass001.A0F(num), str);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$perform$5, reason: invalid class name and case insensitive filesystem */
    public final class C121545 extends AbstractC7559F3s implements G0W<String, Integer, HatchNoiseHandshakeOutcome, Unit> {
        public final /* synthetic */ ConnectionEffect $effect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121545(ConnectionEffect connectionEffect) {
            super(3);
            this.$effect = connectionEffect;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str, Integer num, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome) {
            ConnectionEngine.this.post(new ConnectionEvent.TransportFailed(((ConnectionEffect.OpenTransport) this.$effect).epoch, str, num, hatchNoiseHandshakeOutcome));
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome) {
            invoke2(str, num, hatchNoiseHandshakeOutcome);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$perform$6, reason: invalid class name and case insensitive filesystem */
    public final class C121556 extends AbstractC7559F3s implements G0V<String, String, Unit> {
        public final /* synthetic */ ConnectionEffect $effect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121556(ConnectionEffect connectionEffect) {
            super(2);
            this.$effect = connectionEffect;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            ConnectionEngine.this.post(new ConnectionEvent.UrlUnavailable(((ConnectionEffect.OpenTransport) this.$effect).epoch, str, str2));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
            invoke2(str, str2);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$perform$7, reason: invalid class name and case insensitive filesystem */
    public final class C121567 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ ConnectionEffect $effect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121567(ConnectionEffect connectionEffect) {
            super(0);
            this.$effect = connectionEffect;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ConnectionEngine.this.post(new ConnectionEvent.PauseDetected(((ConnectionEffect.RunPauseStatusCheck) this.$effect).epoch));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$perform$8, reason: invalid class name and case insensitive filesystem */
    public final class C121578 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ ConnectionEffect $effect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121578(ConnectionEffect connectionEffect) {
            super(0);
            this.$effect = connectionEffect;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ConnectionEngine.this.post(new ConnectionEvent.HandshakeStalled(((ConnectionEffect.StartHandshakeWatchdog) this.$effect).epoch));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$perform$9, reason: invalid class name and case insensitive filesystem */
    public final class C121589 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ ConnectionEffect $effect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121589(ConnectionEffect connectionEffect) {
            super(0);
            this.$effect = connectionEffect;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ConnectionEngine.this.post(new ConnectionEvent.SubscribeAckStalled(((ConnectionEffect.StartSubscribeWatchdog) this.$effect).epoch));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$resolvePendingDemands$1, reason: invalid class name and case insensitive filesystem */
    public final class C121591 extends AbstractC7559F3s implements G0U<InterfaceC10560Hsz<ConnectionDemandOutcome>, Boolean> {
        public static final C121591 INSTANCE = new C121591();

        public C121591() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(InterfaceC10560Hsz<ConnectionDemandOutcome> interfaceC10560Hsz) {
            C7384Etj.A0Y(interfaceC10560Hsz, 0);
            return C3cG.A0P(interfaceC10560Hsz.isActive());
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.connection.ConnectionEngine$scheduleTimer$1", f = "ConnectionEngine.kt", l = {803}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$scheduleTimer$1, reason: invalid class name and case insensitive filesystem */
    public final class C121601 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $delayMs;
        public final /* synthetic */ Function0<Unit> $onFire;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121601(long j, Function0<Unit> function0, HtJ<? super C121601> htJ) {
            super(2, htJ);
            this.$delayMs = j;
            this.$onFire = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C121601(this.$delayMs, this.$onFire, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                long j = this.$delayMs;
                this.label = 1;
                if (C7Bq.A01(j, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.$onFire.invoke();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C121601) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void noteKeepaliveTimedOut(long j, boolean z, Presence presence, long j2) {
        C7384Etj.A0Y(presence, 2);
        post(new ConnectionEvent.KeepaliveTimedOut(j, z, presence, j2));
    }

    public final void noteServiceNotice(int i, String str) {
        C7384Etj.A0Y(str, 1);
        post(new ConnectionEvent.ServiceNoticeReceived(i, str));
    }

    public final void recoverFromSuspectedDeadConnection(String str) {
        C7384Etj.A0Y(str, 0);
        post(new ConnectionEvent.SuspectedDeadConnection(str));
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Long> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngine$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements Function0<Long> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        public AnonymousClass8() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(System.nanoTime());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(System.nanoTime());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionEngine(ConnectionEngineHost connectionEngineHost, AppLifecycleSource appLifecycleSource, NetworkSource networkSource, C3UX c3ux, ConnectionConfig connectionConfig, Function0<Long> function0, Function0<ConnectionLifecycleSnapshot> function02, G0U<? super Throwable, Unit> g0u, Function0<Long> function03, Function0<Long> function04, Function0<Integer> function05, Function0<Long> function06, Function0<Long> function07, G0V<? super ConnectionPhase, ? super Integer, Unit> g0v) {
        boolean zA1b = AnonymousClass004.A1b(connectionEngineHost, appLifecycleSource);
        AnonymousClass005.A16(networkSource, c3ux, connectionConfig, function0, 2);
        AnonymousClass005.A13(function02, g0u, function03, 6);
        C3cH.A18(function04, function05);
        C7384Etj.A0Y(function06, 11);
        C7384Etj.A0Y(function07, 12);
        C7384Etj.A0Y(g0v, 13);
        this.host = connectionEngineHost;
        this.scope = c3ux;
        this.config = connectionConfig;
        this.now = function0;
        this.lifecycleSnapshot = function02;
        this.onError = g0u;
        this.aggressiveRetryDelayMs = function03;
        this.vmWakeRetryDelayMs = function04;
        this.aggressiveMaxRetryCount = function05;
        this.restartReconnectDelayMs = function06;
        this.monotonicNowNs = function07;
        this.onPhaseChanged = g0v;
        Integer num = C79.A00;
        this.commands = new GCV(Integer.MAX_VALUE, null);
        this.timers = C3cG.A0j();
        this.pendingDemands = C3cG.A0k();
        this.connectSourceTracker = new ConnectSourceTracker();
        ConnectionLifecycleSnapshot connectionLifecycleSnapshotInvoke = function02.invoke();
        ConnectionState connectionState = ConnectionState.INITIAL;
        boolean zA1R = C3cH.A1R(networkSource.isOnline());
        ConnectionState connectionStateCopy$default = ConnectionState.copy$default(connectionState, null, 0L, zA1b ? 1 : 0, zA1b ? 1 : 0, null, zA1b ? 1 : 0, null, zA1b ? 1 : 0, zA1b, zA1b ? 1 : 0, zA1b, 0L, zA1b, connectionLifecycleSnapshotInvoke.isAppForeground, connectionLifecycleSnapshotInvoke.isBackgroundSessionActive, connectionLifecycleSnapshotInvoke.isAssistOverlayActive, connectionLifecycleSnapshotInvoke.isNodeOperationActive, zA1R, connectionLifecycleSnapshotInvoke.isAgentExecutionActive, connectionLifecycleSnapshotInvoke.isLiveSessionActive, 8191, null);
        this.state = connectionStateCopy$default;
        this.lastOnline = connectionStateCopy$default.isOnline;
        this.lastForeground = connectionStateCopy$default.isAppForeground;
        this.lastValidatedTransport = networkSource.getValidatedTransport().getValue();
        C9286GCn c9286GCnA01 = HnJ.A01(this.state.phase);
        this._phase = c9286GCnA01;
        this.phase = C3cG.A11(c9286GCnA01);
        ConnectionState connectionState2 = this.state;
        C9286GCn c9286GCnA14 = C3cG.A14(new ConnectionPhaseSnapshot(connectionState2.phase, connectionState2.connectionCycle));
        this._phaseSnapshot = c9286GCnA14;
        this.phaseSnapshot = C3cG.A11(c9286GCnA14);
        AnonymousClass10 anonymousClass10 = new AnonymousClass10(null);
        C6ys c6ys = C6ys.A00;
        C10533Hqc c10533HqcA02 = GAo.A02(num, c6ys, anonymousClass10, c3ux);
        this.loopJob = c10533HqcA02;
        c10533HqcA02.AO5(new AnonymousClass11());
        GAo.A02(num, c6ys, new AnonymousClass12(networkSource, this, null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass13(networkSource, this, null), c3ux);
        GAo.A02(num, c6ys, new AnonymousClass14(appLifecycleSource, this, null), c3ux);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void apply(com.facebook.aura.gateway.connection.ConnectionEvent r56) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.connection.ConnectionEngine.apply(com.facebook.aura.gateway.connection.ConnectionEvent):void");
    }

    private final void cancelTimer(TimerKey timerKey) {
        HoC hoCRemove = this.timers.remove(timerKey);
        if (hoCRemove != null) {
            hoCRemove.A5w(null);
        }
    }

    private final String describeEvent(ConnectionEvent connectionEvent) {
        StringBuilder sbA0g;
        boolean z;
        String str;
        if (connectionEvent instanceof ConnectionEvent.ConnectRequested) {
            ConnectionEvent.ConnectRequested connectRequested = (ConnectionEvent.ConnectRequested) connectionEvent;
            boolean z2 = connectRequested.force;
            z = connectRequested.joinInFlight;
            sbA0g = C60O.A10("ConnectRequested(force=", z2);
            str = ",joinInFlight=";
        } else {
            if (!(connectionEvent instanceof ConnectionEvent.LifecycleChanged)) {
                if (connectionEvent instanceof ConnectionEvent.NetworkChanged) {
                    z = ((ConnectionEvent.NetworkChanged) connectionEvent).online;
                    sbA0g = C60O.A0x("NetworkChanged(online=");
                    sbA0g.append(z);
                    return AnonymousClass001.A0v(")", sbA0g);
                }
                if (connectionEvent instanceof ConnectionEvent.ServiceNoticeReceived) {
                    sbA0g = C60O.A0y("ServiceNoticeReceived(code=", ((ConnectionEvent.ServiceNoticeReceived) connectionEvent).code);
                } else {
                    boolean z3 = connectionEvent instanceof ConnectionEvent.Epoched;
                    String simpleName = connectionEvent.getClass().getSimpleName();
                    if (!z3) {
                        return simpleName;
                    }
                    long epoch = ((ConnectionEvent.Epoched) connectionEvent).getEpoch();
                    sbA0g = C3cG.A0g(simpleName);
                    sbA0g.append("(epoch=");
                    sbA0g.append(epoch);
                }
                return AnonymousClass001.A0v(")", sbA0g);
            }
            ConnectionLifecycleSnapshot connectionLifecycleSnapshot = ((ConnectionEvent.LifecycleChanged) connectionEvent).snapshot;
            boolean z4 = connectionLifecycleSnapshot.isAppForeground;
            boolean z5 = connectionLifecycleSnapshot.isBackgroundSessionActive;
            boolean z6 = connectionLifecycleSnapshot.isAssistOverlayActive;
            boolean z7 = connectionLifecycleSnapshot.isNodeOperationActive;
            boolean z8 = connectionLifecycleSnapshot.isAgentExecutionActive;
            z = connectionLifecycleSnapshot.isLiveSessionActive;
            sbA0g = C60O.A10("LifecycleChanged(foreground=", z4);
            sbA0g.append(", backgroundSession=");
            sbA0g.append(z5);
            sbA0g.append(", assistOverlay=");
            sbA0g.append(z6);
            sbA0g.append(", nodeOperation=");
            sbA0g.append(z7);
            sbA0g.append(", agentExecution=");
            sbA0g.append(z8);
            str = ", liveSession=";
        }
        sbA0g.append(str);
        sbA0g.append(z);
        return AnonymousClass001.A0v(")", sbA0g);
    }

    private final String describePhase(ConnectionPhase connectionPhase) {
        Object obj;
        StringBuilder sbA10;
        String str;
        if (connectionPhase instanceof ConnectionPhase.Reconnecting) {
            ConnectionPhase.Reconnecting reconnecting = (ConnectionPhase.Reconnecting) connectionPhase;
            int i = reconnecting.attempt;
            obj = reconnecting.activity;
            sbA10 = C60O.A0y("Reconnecting(attempt=", i);
            str = ",activity=";
        } else {
            if (!(connectionPhase instanceof ConnectionPhase.Failed)) {
                return C3cI.A0Y(connectionPhase);
            }
            ConnectionPhase.Failed failed = (ConnectionPhase.Failed) connectionPhase;
            boolean z = failed.retriesExhausted;
            obj = failed.cause;
            sbA10 = C60O.A10("Failed(retriesExhausted=", z);
            str = ",cause=";
        }
        sbA10.append(str);
        sbA10.append(obj);
        return AnonymousClass001.A0v(")", sbA10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failPendingDemands(ConnectionDemandOutcome connectionDemandOutcome) {
        Iterator<InterfaceC10560Hsz<ConnectionDemandOutcome>> it = this.pendingDemands.iterator();
        while (it.hasNext()) {
            ((GBM) ((InterfaceC10560Hsz) it.next())).A0R(connectionDemandOutcome);
        }
        this.pendingDemands.clear();
    }

    private final void perform(ConnectionEffect connectionEffect, ConnectionConfig connectionConfig) {
        TimerKey timerKey;
        TimerKey timerKey2;
        long j;
        Function0<Unit> c1214913;
        Function0<Unit> c1214812;
        ConnectionPhase.Reconnecting reconnecting;
        if (connectionEffect instanceof ConnectionEffect.OpenTransport) {
            ConnectionState connectionState = this.state;
            ConnectionEffect.OpenTransport openTransport = (ConnectionEffect.OpenTransport) connectionEffect;
            CFK.A00(Integer.valueOf(connectionState.reconnectAttempt), Integer.valueOf(openTransport.connectionCycle), Boolean.valueOf(connectionState.isOnline), Boolean.valueOf(connectionState.isAppForeground), ConnectionEngineKt.TAG, "connection attempt: opening transport (attempt=%d, cycle=%d, online=%b, foreground=%b)");
            this.host.openTransport(openTransport.epoch, openTransport.connectionCycle, openTransport.forceCredentialRefresh, new C121451(connectionEffect), new C121512(connectionEffect), new C121523(connectionEffect), new C121534(connectionEffect), new C121545(connectionEffect), new C121556(connectionEffect));
            return;
        }
        if (C7384Etj.areEqual(connectionEffect, ConnectionEffect.EnsurePrimarySubscribePending.INSTANCE)) {
            this.host.ensurePrimarySubscribePending();
            return;
        }
        if (connectionEffect instanceof ConnectionEffect.SetVmStarting) {
            this.host.setVmStarting(((ConnectionEffect.SetVmStarting) connectionEffect).isStarting);
            return;
        }
        if (connectionEffect instanceof ConnectionEffect.FailConnectAttempt) {
            ConnectionEffect.FailConnectAttempt failConnectAttempt = (ConnectionEffect.FailConnectAttempt) connectionEffect;
            this.host.failConnectAttempt(failConnectAttempt.errorType, failConnectAttempt.errorMessage);
            return;
        }
        if (connectionEffect instanceof ConnectionEffect.ContinueVmWakeWait) {
            this.host.continueVmWakeWait(((ConnectionEffect.ContinueVmWakeWait) connectionEffect).retryCount);
            return;
        }
        if (connectionEffect instanceof ConnectionEffect.FailBadGatewayAttempt) {
            ConnectionEffect.FailBadGatewayAttempt failBadGatewayAttempt = (ConnectionEffect.FailBadGatewayAttempt) connectionEffect;
            this.host.failBadGatewayAttempt(failBadGatewayAttempt.errorType, failBadGatewayAttempt.errorMessage, failBadGatewayAttempt.vmWakeWaitEndReason);
            return;
        }
        if (connectionEffect instanceof ConnectionEffect.CancelConnectAttempt) {
            this.host.cancelConnectAttempt(((ConnectionEffect.CancelConnectAttempt) connectionEffect).reason);
            return;
        }
        if (connectionEffect instanceof ConnectionEffect.RecordKeepaliveDrop) {
            ConnectionEffect.RecordKeepaliveDrop recordKeepaliveDrop = (ConnectionEffect.RecordKeepaliveDrop) connectionEffect;
            this.host.recordKeepaliveDrop(recordKeepaliveDrop.latePong, recordKeepaliveDrop.presence, recordKeepaliveDrop.waitMs);
            return;
        }
        if (C7384Etj.areEqual(connectionEffect, ConnectionEffect.CloseTransport.INSTANCE)) {
            this.host.closeTransport();
            return;
        }
        if (connectionEffect instanceof ConnectionEffect.RunPauseStatusCheck) {
            this.host.runPauseStatusCheck(((ConnectionEffect.RunPauseStatusCheck) connectionEffect).epoch, new C121567(connectionEffect));
            return;
        }
        if (C7384Etj.areEqual(connectionEffect, ConnectionEffect.ResetDeltaState.INSTANCE)) {
            this.host.resetDeltaState();
            return;
        }
        if (C7384Etj.areEqual(connectionEffect, ConnectionEffect.FailPendingRpcRequests.INSTANCE)) {
            this.host.failPendingRpcRequests();
            return;
        }
        if (C7384Etj.areEqual(connectionEffect, ConnectionEffect.NotifyIntentionalDisconnect.INSTANCE)) {
            this.host.onIntentionalDisconnect();
            return;
        }
        if (connectionEffect instanceof ConnectionEffect.SendKeepalivePing) {
            this.host.sendKeepalivePing(((ConnectionEffect.SendKeepalivePing) connectionEffect).presence);
            return;
        }
        if (connectionEffect instanceof ConnectionEffect.StartHandshakeWatchdog) {
            timerKey2 = TimerKey.HANDSHAKE;
            j = connectionConfig.handshakeStallTimeoutMs;
            c1214812 = new C121578(connectionEffect);
        } else {
            if (!(connectionEffect instanceof ConnectionEffect.StartSubscribeWatchdog)) {
                if (C7384Etj.areEqual(connectionEffect, ConnectionEffect.CancelHandshakeWatchdog.INSTANCE)) {
                    timerKey = TimerKey.HANDSHAKE;
                } else if (connectionEffect instanceof ConnectionEffect.ScheduleKeepaliveTimer) {
                    timerKey2 = TimerKey.KEEPALIVE;
                    j = connectionConfig.keepaliveIntervalMs;
                    c1214812 = new C1214610(connectionEffect);
                } else if (C7384Etj.areEqual(connectionEffect, ConnectionEffect.CancelKeepaliveTimer.INSTANCE)) {
                    timerKey = TimerKey.KEEPALIVE;
                } else if (connectionEffect instanceof ConnectionEffect.ScheduleReconnectTimer) {
                    ConnectionEffect.ScheduleReconnectTimer scheduleReconnectTimer = (ConnectionEffect.ScheduleReconnectTimer) connectionEffect;
                    boolean z = scheduleReconnectTimer.jitter;
                    long jA01 = scheduleReconnectTimer.delayMs;
                    if (z) {
                        jA01 = (long) (jA01 * CUB.A01.A01());
                    }
                    Long lValueOf = Long.valueOf(jA01);
                    ConnectionState connectionState2 = this.state;
                    Integer numValueOf = Integer.valueOf(connectionState2.reconnectAttempt);
                    ReconnectMode reconnectMode = connectionState2.reconnectMode;
                    Integer numValueOf2 = Integer.valueOf(ConnectionStateKt.reconnectBudget(connectionState2, connectionConfig));
                    ConnectionState connectionState3 = this.state;
                    CFK.A0G(ConnectionEngineKt.TAG, "reconnect scheduled in %dms (attempt=%d, mode=%s, maxAttempts=%d, cycle=%d, epoch=%d)", lValueOf, numValueOf, reconnectMode, numValueOf2, Integer.valueOf(connectionState3.connectionCycle), Long.valueOf(connectionState3.epoch));
                    long jLongValue = this.monotonicNowNs.invoke().longValue();
                    if (jA01 > 0) {
                        try {
                            long j2 = scheduleReconnectTimer.epoch;
                            ConnectionState connectionState4 = this.state;
                            if (j2 == connectionState4.epoch) {
                                ConnectionPhase connectionPhase = connectionState4.phase;
                                ConnectionPhase.ReconnectActivity reconnectActivity = null;
                                if ((connectionPhase instanceof ConnectionPhase.Reconnecting) && (reconnecting = (ConnectionPhase.Reconnecting) connectionPhase) != null) {
                                    reconnectActivity = reconnecting.activity;
                                }
                                if (reconnectActivity == ConnectionPhase.ReconnectActivity.AWAITING_RETRY) {
                                    prepareTransportIfEligible();
                                }
                            }
                        } catch (Throwable th) {
                            long jLongValue2 = (this.monotonicNowNs.invoke().longValue() - jLongValue) / 1000000;
                            TimerKey timerKey3 = TimerKey.RECONNECT;
                            long j3 = jA01 - jLongValue2;
                            if (j3 < 0) {
                                j3 = 0;
                            }
                            scheduleTimer(timerKey3, j3, new C1214711(connectionEffect));
                            throw th;
                        }
                    }
                    long jLongValue3 = (this.monotonicNowNs.invoke().longValue() - jLongValue) / 1000000;
                    timerKey2 = TimerKey.RECONNECT;
                    j = jA01 - jLongValue3;
                    if (j < 0) {
                        j = 0;
                    }
                    c1214812 = new C1214711(connectionEffect);
                } else if (C7384Etj.areEqual(connectionEffect, ConnectionEffect.CancelReconnectTimer.INSTANCE)) {
                    timerKey = TimerKey.RECONNECT;
                } else if (connectionEffect instanceof ConnectionEffect.ScheduleStabilityTimer) {
                    timerKey2 = TimerKey.STABILITY;
                    j = connectionConfig.connectionStabilityThresholdMs;
                    c1214812 = new C1214812(connectionEffect);
                } else if (C7384Etj.areEqual(connectionEffect, ConnectionEffect.CancelStabilityTimer.INSTANCE)) {
                    timerKey = TimerKey.STABILITY;
                } else {
                    if (connectionEffect instanceof ConnectionEffect.ScheduleExhaustionCooldown) {
                        timerKey2 = TimerKey.EXHAUSTION;
                        j = ((ConnectionEffect.ScheduleExhaustionCooldown) connectionEffect).delayMs;
                        c1214913 = new C1214913();
                        scheduleTimer(timerKey2, j, c1214913);
                    }
                    if (!C7384Etj.areEqual(connectionEffect, ConnectionEffect.CancelExhaustionCooldown.INSTANCE)) {
                        if (connectionEffect instanceof ConnectionEffect.EmitConnectionClosed) {
                            ConnectionEffect.EmitConnectionClosed emitConnectionClosed = (ConnectionEffect.EmitConnectionClosed) connectionEffect;
                            this.host.emitConnectionClosed(emitConnectionClosed.code, emitConnectionClosed.reason);
                            return;
                        } else {
                            if (!C7384Etj.areEqual(connectionEffect, ConnectionEffect.PerformReset.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.host.performReset(new C1215014());
                            return;
                        }
                    }
                    timerKey = TimerKey.EXHAUSTION;
                }
                cancelTimer(timerKey);
                return;
            }
            timerKey2 = TimerKey.HANDSHAKE;
            j = connectionConfig.subscribeAckTimeoutMs;
            c1214812 = new C121589(connectionEffect);
        }
        c1214913 = c1214812;
        scheduleTimer(timerKey2, j, c1214913);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void post(ConnectionEvent connectionEvent) {
        Throwable thA10;
        Ho5 ho5;
        if (this.loopJob.isActive()) {
            Object objAhZ = this.commands.AhZ(new Command.Post(connectionEvent));
            if (!(objAhZ instanceof C2zT)) {
                return;
            }
            if (!(objAhZ instanceof Ho5) || (ho5 = (Ho5) objAhZ) == null || (thA10 = ho5.A00) == null) {
                thA10 = AbstractC7607F5u.A10(connectionEvent, "ConnectionEngine dropped event: ");
            }
        } else {
            thA10 = AbstractC7607F5u.A10(connectionEvent, "ConnectionEngine dropped event after shutdown: ");
        }
        reportError(thA10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareTransportIfEligible() {
        ConnectionState connectionState = this.state;
        if (connectionState.isOnline && connectionState.isAppForeground && !connectionState.intentionalDisconnect) {
            ConnectionPhase connectionPhase = connectionState.phase;
            if (!C7384Etj.areEqual(connectionPhase, ConnectionPhase.Idle.INSTANCE) && !C7384Etj.areEqual(connectionPhase, ConnectionPhase.Connecting.INSTANCE)) {
                if (connectionPhase instanceof ConnectionPhase.Reconnecting) {
                    if (((ConnectionPhase.Reconnecting) connectionPhase).activity != ConnectionPhase.ReconnectActivity.AWAITING_RETRY) {
                        return;
                    }
                } else {
                    if (!(connectionPhase instanceof ConnectionPhase.Failed)) {
                        if (!C7384Etj.areEqual(connectionPhase, ConnectionPhase.Offline.INSTANCE) && !C7384Etj.areEqual(connectionPhase, ConnectionPhase.Connected.INSTANCE) && !C7384Etj.areEqual(connectionPhase, ConnectionPhase.StorageRecoveryConnected.INSTANCE) && !C7384Etj.areEqual(connectionPhase, ConnectionPhase.Paused.INSTANCE) && !C7384Etj.areEqual(connectionPhase, ConnectionPhase.Resetting.INSTANCE)) {
                            throw C3cG.A0q();
                        }
                        return;
                    }
                    if (((ConnectionPhase.Failed) connectionPhase).retriesExhausted) {
                        return;
                    }
                }
            }
            try {
                this.host.prepareTransport();
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                reportError(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportError(Throwable th) {
        try {
            this.onError.invoke(th);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void resolvePendingDemands() {
        /*
            r2 = this;
            java.util.Set<X.Hsz<com.facebook.aura.gateway.connection.ConnectionDemandOutcome>> r1 = r2.pendingDemands
            com.facebook.aura.gateway.connection.ConnectionEngine$resolvePendingDemands$1 r0 = com.facebook.aura.gateway.connection.ConnectionEngine.C121591.INSTANCE
            X.AbstractC0882AGj.A0t(r1, r0)
            java.util.Set<X.Hsz<com.facebook.aura.gateway.connection.ConnectionDemandOutcome>> r0 = r2.pendingDemands
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1e
            com.facebook.aura.gateway.connection.ConnectionState r0 = r2.state
            com.facebook.aura.gateway.connection.ConnectionPhase r1 = r0.phase
            boolean r0 = com.facebook.aura.gateway.connection.ConnectionStateKt.allowsLifecycleConnection(r0)
            if (r0 != 0) goto L1f
            com.facebook.aura.gateway.connection.ConnectionDemandOutcome r0 = com.facebook.aura.gateway.connection.ConnectionDemandOutcome.BACKGROUND
        L1b:
            r2.failPendingDemands(r0)
        L1e:
            return
        L1f:
            com.facebook.aura.gateway.connection.ConnectionState r0 = r2.state
            boolean r0 = r0.isOnline
            if (r0 != 0) goto L28
            com.facebook.aura.gateway.connection.ConnectionDemandOutcome r0 = com.facebook.aura.gateway.connection.ConnectionDemandOutcome.OFFLINE
            goto L1b
        L28:
            com.facebook.aura.gateway.connection.ConnectionPhase$Connected r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Connected.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L33
            com.facebook.aura.gateway.connection.ConnectionDemandOutcome r0 = com.facebook.aura.gateway.connection.ConnectionDemandOutcome.CONNECTED
            goto L1b
        L33:
            com.facebook.aura.gateway.connection.ConnectionPhase$StorageRecoveryConnected r0 = com.facebook.aura.gateway.connection.ConnectionPhase.StorageRecoveryConnected.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L63
            com.facebook.aura.gateway.connection.ConnectionPhase$Paused r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Paused.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L46
            com.facebook.aura.gateway.connection.ConnectionDemandOutcome r0 = com.facebook.aura.gateway.connection.ConnectionDemandOutcome.PAUSED
            goto L1b
        L46:
            com.facebook.aura.gateway.connection.ConnectionPhase$Resetting r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Resetting.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L63
            com.facebook.aura.gateway.connection.ConnectionPhase$Idle r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Idle.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L63
            boolean r0 = r1 instanceof com.facebook.aura.gateway.connection.ConnectionPhase.Failed
            if (r0 == 0) goto L1e
            com.facebook.aura.gateway.connection.ConnectionPhase$Failed r1 = (com.facebook.aura.gateway.connection.ConnectionPhase.Failed) r1
            boolean r0 = r1.retriesExhausted
            if (r0 == 0) goto L63
            com.facebook.aura.gateway.connection.ConnectionDemandOutcome r0 = com.facebook.aura.gateway.connection.ConnectionDemandOutcome.RETRY_EXHAUSTED
            goto L1b
        L63:
            com.facebook.aura.gateway.connection.ConnectionDemandOutcome r0 = com.facebook.aura.gateway.connection.ConnectionDemandOutcome.UNAVAILABLE
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.connection.ConnectionEngine.resolvePendingDemands():void");
    }

    private final void scheduleTimer(TimerKey timerKey, long j, Function0<Unit> function0) {
        HoC hoCRemove = this.timers.remove(timerKey);
        if (hoCRemove != null) {
            hoCRemove.A5w(null);
        }
        this.timers.put(timerKey, AnonymousClass001.A11(new C121601(j, function0, null), this.scope));
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0080: INVOKE (r7 I:X.HsS) INTERFACE call: X.HsS.dispose():void A[MD:():void (m)] (LINE:128), block:B:26:0x0080 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acquireForDemand(X.HtJ<? super com.facebook.aura.gateway.connection.ConnectionDemandOutcome> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.gateway.connection.ConnectionEngine.C121421
            if (r0 == 0) goto L22
            r5 = r9
            com.facebook.aura.gateway.connection.ConnectionEngine$acquireForDemand$1 r5 = (com.facebook.aura.gateway.connection.ConnectionEngine.C121421) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L28
            java.lang.Object r7 = r5.L$1
            X.HsS r7 = (X.HsS) r7
            goto L76
        L22:
            com.facebook.aura.gateway.connection.ConnectionEngine$acquireForDemand$1 r5 = new com.facebook.aura.gateway.connection.ConnectionEngine$acquireForDemand$1
            r5.<init>(r9)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r0)
            X.78T r1 = r5.getContext()
            X.GQE r0 = X.HoC.A00
            X.78X r0 = r1.get(r0)
            X.HoC r0 = (X.HoC) r0
            X.GAt r3 = new X.GAt
            r3.<init>(r0)
            X.HoC r1 = r8.loopJob
            com.facebook.aura.gateway.connection.ConnectionEngine$acquireForDemand$onLoopDone$1 r0 = new com.facebook.aura.gateway.connection.ConnectionEngine$acquireForDemand$onLoopDone$1
            r0.<init>(r3)
            X.HsS r7 = r1.AO5(r0)
            X.HzR<com.facebook.aura.gateway.connection.ConnectionEngine$Command> r2 = r8.commands     // Catch: java.lang.Throwable -> L7f
            kotlin.jvm.functions.Function0<com.facebook.aura.gateway.connection.ConnectionLifecycleSnapshot> r0 = r8.lifecycleSnapshot     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r1 = r0.invoke()     // Catch: java.lang.Throwable -> L7f
            com.facebook.aura.gateway.connection.ConnectionLifecycleSnapshot r1 = (com.facebook.aura.gateway.connection.ConnectionLifecycleSnapshot) r1     // Catch: java.lang.Throwable -> L7f
            com.facebook.aura.gateway.connection.ConnectionEngine$Command$AcquireForDemand r0 = new com.facebook.aura.gateway.connection.ConnectionEngine$Command$AcquireForDemand     // Catch: java.lang.Throwable -> L7f
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r2.AhZ(r0)     // Catch: java.lang.Throwable -> L7f
            boolean r0 = r0 instanceof X.C2zT     // Catch: java.lang.Throwable -> L7f
            r0 = r0 ^ 1
            if (r0 != 0) goto L68
            com.facebook.aura.gateway.connection.ConnectionDemandOutcome r0 = com.facebook.aura.gateway.connection.ConnectionDemandOutcome.UNAVAILABLE     // Catch: java.lang.Throwable -> L7f
            goto L7b
        L68:
            r0 = 0
            r5.L$0 = r0     // Catch: java.lang.Throwable -> L7f
            r5.L$1 = r7     // Catch: java.lang.Throwable -> L7f
            r5.label = r4     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r3.A0E(r5)     // Catch: java.lang.Throwable -> L7f
            if (r0 != r6) goto L79
            return r6
        L76:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L7f
        L79:
            com.facebook.aura.gateway.connection.ConnectionDemandOutcome r0 = (com.facebook.aura.gateway.connection.ConnectionDemandOutcome) r0     // Catch: java.lang.Throwable -> L7f
        L7b:
            r7.dispose()
            return r0
        L7f:
            r0 = move-exception
            r7.dispose()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.connection.ConnectionEngine.acquireForDemand(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connect(boolean r8, boolean r9, java.lang.String r10, X.HtJ<? super com.facebook.aura.gateway.connection.ConnectRequestResult> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.facebook.aura.gateway.connection.ConnectionEngine.C121441
            if (r0 == 0) goto L22
            r4 = r11
            com.facebook.aura.gateway.connection.ConnectionEngine$connect$1 r4 = (com.facebook.aura.gateway.connection.ConnectionEngine.C121441) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 != r3) goto L28
            java.lang.Object r2 = r4.L$2
            X.HsS r2 = (X.HsS) r2
            goto L74
        L22:
            com.facebook.aura.gateway.connection.ConnectionEngine$connect$1 r4 = new com.facebook.aura.gateway.connection.ConnectionEngine$connect$1
            r4.<init>(r11)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r0)
            X.78T r1 = r4.getContext()
            X.GQE r0 = X.HoC.A00
            X.78X r0 = r1.get(r0)
            X.HoC r0 = (X.HoC) r0
            X.GAt r6 = new X.GAt
            r6.<init>(r0)
            X.HoC r1 = r7.loopJob
            com.facebook.aura.gateway.connection.ConnectionEngine$connect$onLoopDone$1 r0 = new com.facebook.aura.gateway.connection.ConnectionEngine$connect$onLoopDone$1
            r0.<init>(r6)
            X.HsS r2 = r1.AO5(r0)
            X.HzR<com.facebook.aura.gateway.connection.ConnectionEngine$Command> r1 = r7.commands     // Catch: java.lang.Throwable -> L7d
            com.facebook.aura.gateway.connection.ConnectionEngine$Command$Connect r0 = new com.facebook.aura.gateway.connection.ConnectionEngine$Command$Connect     // Catch: java.lang.Throwable -> L7d
            r0.<init>(r8, r9, r6, r10)     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r1.AhZ(r0)     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0 instanceof X.C2zT     // Catch: java.lang.Throwable -> L7d
            r0 = r0 ^ 1
            if (r0 != 0) goto L60
            com.facebook.aura.gateway.connection.ConnectRequestResult$Rejected r0 = com.facebook.aura.gateway.connection.ConnectRequestResult.Rejected.INSTANCE     // Catch: java.lang.Throwable -> L7d
            goto L79
        L60:
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Throwable -> L7d
            r4.L$1 = r0     // Catch: java.lang.Throwable -> L7d
            r4.L$2 = r2     // Catch: java.lang.Throwable -> L7d
            r4.Z$0 = r8     // Catch: java.lang.Throwable -> L7d
            r4.Z$1 = r9     // Catch: java.lang.Throwable -> L7d
            r4.label = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r6.A0E(r4)     // Catch: java.lang.Throwable -> L7d
            if (r0 != r5) goto L77
            return r5
        L74:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L7d
        L77:
            com.facebook.aura.gateway.connection.ConnectRequestResult r0 = (com.facebook.aura.gateway.connection.ConnectRequestResult) r0     // Catch: java.lang.Throwable -> L7d
        L79:
            r2.dispose()
            return r0
        L7d:
            r0 = move-exception
            r2.dispose()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.connection.ConnectionEngine.connect(boolean, boolean, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void disconnect() {
        post(ConnectionEvent.DisconnectRequested.INSTANCE);
    }

    public final void enterStorageRecovery() {
        post(ConnectionEvent.StorageRecoveryConnected.INSTANCE);
    }

    public final String getConnectSource() {
        return this.connectSourceTracker.value;
    }

    public final C1BN<ConnectionPhase> getPhase() {
        return this.phase;
    }

    public final C1BN<ConnectionPhaseSnapshot> getPhaseSnapshot() {
        return this.phaseSnapshot;
    }

    public final void noteVmState(long j, boolean z) {
        post(new ConnectionEvent.VmStateResolved(j, z));
    }

    public final void pause() {
        post(ConnectionEvent.PauseRequested.INSTANCE);
    }

    public final void prepareTransport() {
        if (this.loopJob.isActive()) {
            this.commands.AhZ(Command.PrepareTransport.INSTANCE);
        }
    }

    public final void refreshLifecycle() {
        post(new ConnectionEvent.LifecycleChanged(this.lifecycleSnapshot.invoke()));
    }

    public final void reset() {
        post(ConnectionEvent.ResetRequested.INSTANCE);
    }

    public final void shutdown() {
        this.commands.AhZ(Command.Shutdown.INSTANCE);
    }

    public static /* synthetic */ Object connect$default(ConnectionEngine connectionEngine, boolean z, boolean z2, String str, HtJ htJ, int i, Object obj) {
        boolean zA1P = AnonymousClass001.A1P(i, z);
        boolean zA1Q = AnonymousClass001.A1Q(i, z2);
        if ((i & 4) != 0) {
            str = null;
        }
        return connectionEngine.connect(zA1P, zA1Q, str, htJ);
    }

    public /* synthetic */ ConnectionEngine(ConnectionEngineHost connectionEngineHost, AppLifecycleSource appLifecycleSource, NetworkSource networkSource, C3UX c3ux, ConnectionConfig connectionConfig, Function0 function0, Function0 function02, G0U g0u, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, G0V g0v, int i, C06H c06h) {
        this(connectionEngineHost, appLifecycleSource, networkSource, c3ux, (i & 16) != 0 ? ConnectionConfig.DEFAULT : connectionConfig, (i & 32) != 0 ? AnonymousClass1.INSTANCE : function0, (i & 64) != 0 ? new AnonymousClass2(appLifecycleSource) : function02, (i & 128) != 0 ? AnonymousClass3.INSTANCE : g0u, (i & 256) != 0 ? AnonymousClass4.INSTANCE : function03, (i & 512) != 0 ? AnonymousClass5.INSTANCE : function04, (i & 1024) != 0 ? AnonymousClass6.INSTANCE : function05, (i & 2048) != 0 ? AnonymousClass7.INSTANCE : function06, (i & 4096) != 0 ? AnonymousClass8.INSTANCE : function07, (i & 8192) != 0 ? AnonymousClass9.INSTANCE : g0v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void acquireForDemand(com.facebook.aura.gateway.connection.ConnectionLifecycleSnapshot r4, X.InterfaceC10560Hsz<com.facebook.aura.gateway.connection.ConnectionDemandOutcome> r5) {
        /*
            r3 = this;
            boolean r0 = r5.isActive()
            if (r0 == 0) goto L1d
            com.facebook.aura.gateway.connection.ConnectionEvent$LifecycleChanged r0 = new com.facebook.aura.gateway.connection.ConnectionEvent$LifecycleChanged
            r0.<init>(r4)
            r3.apply(r0)
            com.facebook.aura.gateway.connection.ConnectionState r0 = r3.state
            com.facebook.aura.gateway.connection.ConnectionPhase r1 = r0.phase
            boolean r0 = com.facebook.aura.gateway.connection.ConnectionStateKt.allowsLifecycleConnection(r0)
            if (r0 != 0) goto L1e
            com.facebook.aura.gateway.connection.ConnectionDemandOutcome r0 = com.facebook.aura.gateway.connection.ConnectionDemandOutcome.BACKGROUND
        L1a:
            X.C3cG.A1F(r5, r0)
        L1d:
            return
        L1e:
            com.facebook.aura.gateway.connection.ConnectionPhase$Paused r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Paused.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L29
            com.facebook.aura.gateway.connection.ConnectionDemandOutcome r0 = com.facebook.aura.gateway.connection.ConnectionDemandOutcome.PAUSED
            goto L1a
        L29:
            com.facebook.aura.gateway.connection.ConnectionPhase$Resetting r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Resetting.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L54
            com.facebook.aura.gateway.connection.ConnectionPhase$StorageRecoveryConnected r0 = com.facebook.aura.gateway.connection.ConnectionPhase.StorageRecoveryConnected.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L54
            com.facebook.aura.gateway.connection.ConnectionState r2 = r3.state
            boolean r0 = r2.intentionalDisconnect
            if (r0 != 0) goto L54
            boolean r0 = r2.isOnline
            if (r0 != 0) goto L46
            com.facebook.aura.gateway.connection.ConnectionDemandOutcome r0 = com.facebook.aura.gateway.connection.ConnectionDemandOutcome.OFFLINE
            goto L1a
        L46:
            boolean r2 = r1 instanceof com.facebook.aura.gateway.connection.ConnectionPhase.Failed
            if (r2 == 0) goto L57
            r0 = r1
            com.facebook.aura.gateway.connection.ConnectionPhase$Failed r0 = (com.facebook.aura.gateway.connection.ConnectionPhase.Failed) r0
            boolean r0 = r0.retriesExhausted
            if (r0 == 0) goto L57
            com.facebook.aura.gateway.connection.ConnectionDemandOutcome r0 = com.facebook.aura.gateway.connection.ConnectionDemandOutcome.RETRY_EXHAUSTED
            goto L1a
        L54:
            com.facebook.aura.gateway.connection.ConnectionDemandOutcome r0 = com.facebook.aura.gateway.connection.ConnectionDemandOutcome.UNAVAILABLE
            goto L1a
        L57:
            java.util.Set<X.Hsz<com.facebook.aura.gateway.connection.ConnectionDemandOutcome>> r0 = r3.pendingDemands
            r0.add(r5)
            com.facebook.aura.gateway.connection.ConnectionPhase$Connected r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Connected.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L74
            java.lang.String r0 = "noise_http_demand_without_channel"
            com.facebook.aura.gateway.connection.ConnectionEvent$SuspectedDeadConnection r2 = new com.facebook.aura.gateway.connection.ConnectionEvent$SuspectedDeadConnection
            r2.<init>(r0)
        L6b:
            com.facebook.aura.gateway.connection.ConnectionEvent r2 = (com.facebook.aura.gateway.connection.ConnectionEvent) r2
            r3.apply(r2)
        L70:
            r3.resolvePendingDemands()
            return
        L74:
            com.facebook.aura.gateway.connection.ConnectionPhase$Idle r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Idle.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto Lbf
            com.facebook.aura.gateway.connection.ConnectionPhase$Offline r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Offline.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto Lbf
            if (r2 != 0) goto Lbf
            boolean r0 = r1 instanceof com.facebook.aura.gateway.connection.ConnectionPhase.Reconnecting
            if (r0 == 0) goto L9a
            com.facebook.aura.gateway.connection.ConnectionPhase$Reconnecting r1 = (com.facebook.aura.gateway.connection.ConnectionPhase.Reconnecting) r1
            com.facebook.aura.gateway.connection.ConnectionPhase$ReconnectActivity r1 = r1.activity
            com.facebook.aura.gateway.connection.ConnectionPhase$ReconnectActivity r0 = com.facebook.aura.gateway.connection.ConnectionPhase.ReconnectActivity.PARKED
            if (r1 != r0) goto L70
            r1 = 1
            r0 = 0
            com.facebook.aura.gateway.connection.ConnectionEvent$ConnectRequested r2 = new com.facebook.aura.gateway.connection.ConnectionEvent$ConnectRequested
            r2.<init>(r1, r0)
            goto L6b
        L9a:
            com.facebook.aura.gateway.connection.ConnectionPhase$Connecting r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Connecting.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L70
            com.facebook.aura.gateway.connection.ConnectionPhase$StorageRecoveryConnected r0 = com.facebook.aura.gateway.connection.ConnectionPhase.StorageRecoveryConnected.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L70
            com.facebook.aura.gateway.connection.ConnectionPhase$Paused r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Paused.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L70
            com.facebook.aura.gateway.connection.ConnectionPhase$Resetting r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Resetting.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L70
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        Lbf:
            r0 = 0
            com.facebook.aura.gateway.connection.ConnectionEvent$ConnectRequested r2 = new com.facebook.aura.gateway.connection.ConnectionEvent$ConnectRequested
            r2.<init>(r0, r0)
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.connection.ConnectionEngine.acquireForDemand(com.facebook.aura.gateway.connection.ConnectionLifecycleSnapshot, X.Hsz):void");
    }
}
