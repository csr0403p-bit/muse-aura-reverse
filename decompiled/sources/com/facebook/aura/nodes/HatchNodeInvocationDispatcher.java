package com.facebook.aura.nodes;

import X.ATD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AbstractC7606F5t;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BQG;
import X.C10543Hqv;
import X.C27i;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C8eM;
import X.C8eO;
import X.CFK;
import X.EnumC10460Hji;
import X.F0C;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.GCQ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.nodes.api.HatchNodeInvocationHandler;
import com.facebook.aura.nodes.api.HatchNodeInvocationResult;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchNodeInvocationDispatcher {
    public final C8eM capacity;
    public HoC connection;
    public long connectionGeneration;
    public final Context context;
    public final F0C handlers$delegate;
    public final Object lock;
    public final G2j<String, HatchNodeInvocationResult, HatchNodeInvocationHandler, HtJ<? super Unit>, Object> reply;
    public final C3UX scope;

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeInvocationDispatcher$dispatch$2", f = "HatchNodeInvocationDispatcher.kt", l = {82, 86, 96}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeInvocationDispatcher$dispatch$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $arguments;
        public final /* synthetic */ String $command;
        public final /* synthetic */ long $deadline;
        public final /* synthetic */ long $generation;
        public final /* synthetic */ HatchNodeInvocationHandler $handler;
        public final /* synthetic */ String $id;
        public final /* synthetic */ int $maxArguments;
        public final /* synthetic */ HoC $owner;
        public final /* synthetic */ long $replyDeadline;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ HatchNodeInvocationDispatcher this$0;

        @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeInvocationDispatcher$dispatch$2$1", f = "HatchNodeInvocationDispatcher.kt", l = {103, AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.nodes.HatchNodeInvocationDispatcher$dispatch$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ String $arguments;
            public final /* synthetic */ String $command;
            public final /* synthetic */ long $deadline;
            public final /* synthetic */ long $generation;
            public final /* synthetic */ HatchNodeInvocationHandler $handler;
            public final /* synthetic */ String $id;
            public final /* synthetic */ C10543Hqv<HatchNodeInvocationResult> $ownedResult;
            public final /* synthetic */ HoC $owner;
            public final /* synthetic */ long $replyDeadline;
            public long J$0;
            public Object L$0;
            public int label;
            public final /* synthetic */ HatchNodeInvocationDispatcher this$0;

            @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeInvocationDispatcher$dispatch$2$1$1", f = "HatchNodeInvocationDispatcher.kt", l = {AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.nodes.HatchNodeInvocationDispatcher$dispatch$2$1$1, reason: invalid class name and collision with other inner class name */
            public final class C02501 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                public final /* synthetic */ String $command;
                public final /* synthetic */ HatchNodeInvocationHandler $handler;
                public final /* synthetic */ String $id;
                public final /* synthetic */ HatchNodeInvocationResult $result;
                public int label;
                public final /* synthetic */ HatchNodeInvocationDispatcher this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C02501(HatchNodeInvocationDispatcher hatchNodeInvocationDispatcher, String str, String str2, HatchNodeInvocationResult hatchNodeInvocationResult, HatchNodeInvocationHandler hatchNodeInvocationHandler, HtJ<? super C02501> htJ) {
                    super(2, htJ);
                    this.this$0 = hatchNodeInvocationDispatcher;
                    this.$command = str;
                    this.$id = str2;
                    this.$result = hatchNodeInvocationResult;
                    this.$handler = hatchNodeInvocationHandler;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new C02501(this.this$0, this.$command, this.$id, this.$result, this.$handler, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    if (i == 0) {
                        Hwg.A00(obj);
                        HatchNodeInvocationDispatcher hatchNodeInvocationDispatcher = this.this$0;
                        String str = this.$command;
                        String str2 = this.$id;
                        HatchNodeInvocationResult hatchNodeInvocationResult = this.$result;
                        HatchNodeInvocationHandler hatchNodeInvocationHandler = this.$handler;
                        this.label = 1;
                        if (hatchNodeInvocationDispatcher.respond(str, str2, hatchNodeInvocationResult, hatchNodeInvocationHandler, this) == enumC10460Hji) {
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
                    return ((C02501) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(long j, HatchNodeInvocationDispatcher hatchNodeInvocationDispatcher, HoC hoC, long j2, HatchNodeInvocationHandler hatchNodeInvocationHandler, String str, String str2, String str3, long j3, C10543Hqv<HatchNodeInvocationResult> c10543Hqv, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.$deadline = j;
                this.this$0 = hatchNodeInvocationDispatcher;
                this.$owner = hoC;
                this.$replyDeadline = j2;
                this.$handler = hatchNodeInvocationHandler;
                this.$command = str;
                this.$id = str2;
                this.$arguments = str3;
                this.$generation = j3;
                this.$ownedResult = c10543Hqv;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.$deadline, this.this$0, this.$owner, this.$replyDeadline, this.$handler, this.$command, this.$id, this.$arguments, this.$generation, this.$ownedResult, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r30) {
                /*
                    r29 = this;
                    r11 = r30
                    X.Hji r5 = X.EnumC10460Hji.A02
                    r6 = r29
                    int r0 = r6.label
                    r16 = 0
                    java.lang.String r13 = "deadline_exceeded"
                    r4 = 2
                    r12 = 1
                    if (r0 == 0) goto L1e
                    if (r0 == r12) goto L1a
                    if (r0 != r4) goto Lb0
                    X.Hwg.A00(r11)
                L17:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                L1a:
                    X.Hwg.A00(r11)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6e java.lang.Exception -> L73 java.util.concurrent.CancellationException -> Lb6
                    goto L6b
                L1e:
                    X.Hwg.A00(r11)
                    long r7 = r6.$deadline     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6e java.lang.Exception -> L73 java.util.concurrent.CancellationException -> Lb6
                    long r2 = X.C3cH.A04(r7)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6e java.lang.Exception -> L73 java.util.concurrent.CancellationException -> Lb6
                    int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                    if (r0 > 0) goto L33
                    java.lang.String r0 = "The command expired before dispatch."
                    com.facebook.aura.nodes.api.HatchNodeInvocationResult$Failure r11 = new com.facebook.aura.nodes.api.HatchNodeInvocationResult$Failure     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6e java.lang.Exception -> L73 java.util.concurrent.CancellationException -> Lb6
                    r11.<init>(r13, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6e java.lang.Exception -> L73 java.util.concurrent.CancellationException -> Lb6
                    goto L82
                L33:
                    com.facebook.aura.nodes.api.HatchNodeInvocationHandler r0 = r6.$handler     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6e java.lang.Exception -> L73 java.util.concurrent.CancellationException -> Lb6
                    r19 = r0
                    com.facebook.aura.nodes.HatchNodeInvocationDispatcher r0 = r6.this$0     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6e java.lang.Exception -> L73 java.util.concurrent.CancellationException -> Lb6
                    r20 = r0
                    java.lang.String r0 = r6.$command     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6e java.lang.Exception -> L73 java.util.concurrent.CancellationException -> Lb6
                    r18 = r0
                    java.lang.String r15 = r6.$id     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6e java.lang.Exception -> L73 java.util.concurrent.CancellationException -> Lb6
                    java.lang.String r14 = r6.$arguments     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6e java.lang.Exception -> L73 java.util.concurrent.CancellationException -> Lb6
                    long r0 = r6.$generation     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> Lb6
                    X.HoC r11 = r6.$owner     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> Lb6
                    X.Hqv<com.facebook.aura.nodes.api.HatchNodeInvocationResult> r10 = r6.$ownedResult     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> Lb6
                    r30 = 0
                    com.facebook.aura.nodes.HatchNodeInvocationDispatcher$dispatch$2$1$result$1 r9 = new com.facebook.aura.nodes.HatchNodeInvocationDispatcher$dispatch$2$1$result$1     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> Lb6
                    r26 = r0
                    r28 = r11
                    r29 = r10
                    r21 = r18
                    r22 = r15
                    r23 = r14
                    r24 = r7
                    r18 = r9
                    r18.<init>(r19, r20, r21, r22, r23, r24, r26, r28, r29, r30)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> Lb6
                    r6.J$0 = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> Lb6
                    r6.label = r12     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> Lb6
                    java.lang.Object r11 = X.GAX.A00(r6, r9, r2)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> Lb6
                    if (r11 != r5) goto L6b
                    goto Lb5
                L6b:
                    com.facebook.aura.nodes.api.HatchNodeInvocationResult r11 = (com.facebook.aura.nodes.api.HatchNodeInvocationResult) r11     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70 java.lang.Exception -> L75 java.util.concurrent.CancellationException -> Lb6
                    goto L82
                L6e:
                    r16 = 0
                L70:
                    java.lang.String r0 = "The command timed out. Its effect may be unobserved."
                    goto L7d
                L73:
                    r16 = 0
                L75:
                    r0 = 71
                    java.lang.String r13 = X.C60N.A00(r0)
                    java.lang.String r0 = "The command failed. Its effect may be unobserved."
                L7d:
                    com.facebook.aura.nodes.api.HatchNodeInvocationResult$Failure r11 = new com.facebook.aura.nodes.api.HatchNodeInvocationResult$Failure
                    r11.<init>(r13, r0)
                L82:
                    X.HoC r0 = r6.$owner
                    boolean r0 = r0.isActive()
                    if (r0 == 0) goto L17
                    long r0 = r6.$replyDeadline
                    long r0 = X.C3cH.A04(r0)
                    int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
                    if (r2 <= 0) goto L17
                    com.facebook.aura.nodes.HatchNodeInvocationDispatcher r8 = r6.this$0
                    java.lang.String r9 = r6.$command
                    java.lang.String r10 = r6.$id
                    com.facebook.aura.nodes.api.HatchNodeInvocationHandler r12 = r6.$handler
                    r2 = 0
                    com.facebook.aura.nodes.HatchNodeInvocationDispatcher$dispatch$2$1$1 r7 = new com.facebook.aura.nodes.HatchNodeInvocationDispatcher$dispatch$2$1$1
                    r13 = r2
                    r7.<init>(r8, r9, r10, r11, r12, r13)
                    r6.L$0 = r2
                    r6.J$0 = r0
                    r6.label = r4
                    java.lang.Object r0 = X.GAX.A00(r6, r7, r0)
                    if (r0 != r5) goto L17
                    return r5
                Lb0:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                Lb5:
                    return r5
                Lb6:
                    r0 = move-exception
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeInvocationDispatcher.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchNodeInvocationHandler hatchNodeInvocationHandler, HatchNodeInvocationDispatcher hatchNodeInvocationDispatcher, String str, String str2, int i, String str3, long j, HoC hoC, long j2, long j3, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$handler = hatchNodeInvocationHandler;
            this.this$0 = hatchNodeInvocationDispatcher;
            this.$id = str;
            this.$arguments = str2;
            this.$maxArguments = i;
            this.$command = str3;
            this.$deadline = j;
            this.$owner = hoC;
            this.$replyDeadline = j2;
            this.$generation = j3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$handler, this.this$0, this.$id, this.$arguments, this.$maxArguments, this.$command, this.$deadline, this.$owner, this.$replyDeadline, this.$generation, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeInvocationDispatcher.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    public final void dispatch(String str, String str2, String str3, Long l) {
        boolean z;
        int maxArgumentBytes;
        HoC hoC = null;
        Long lValueOf = null;
        ?? A1a = AnonymousClass002.A1a(str, str2);
        synchronized (this.lock) {
            HoC hoC2 = this.connection;
            if (hoC2 != null) {
                lValueOf = Long.valueOf(this.connectionGeneration);
                hoC = hoC2;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            long jLongValue = lValueOf.longValue();
            List<HatchNodeInvocationHandler> handlers = getHandlers();
            ArrayList arrayListA0h = C3cG.A0h();
            for (HatchNodeInvocationHandler hatchNodeInvocationHandler : handlers) {
                if (hatchNodeInvocationHandler.getCommands().contains(str)) {
                    arrayListA0h.add(hatchNodeInvocationHandler);
                }
            }
            HatchNodeInvocationHandler hatchNodeInvocationHandler2 = (HatchNodeInvocationHandler) AbstractC0878AGe.A0K(arrayListA0h);
            long jA07 = ATD.A07(hatchNodeInvocationHandler2 != null ? hatchNodeInvocationHandler2.getMaxTimeoutMs() : 30000L, 1L, 120000L);
            if (hatchNodeInvocationHandler2 != null) {
                maxArgumentBytes = hatchNodeInvocationHandler2.getMaxArgumentBytes();
                if (maxArgumentBytes < A1a) {
                    maxArgumentBytes = 1;
                } else if (maxArgumentBytes > 2097152) {
                    maxArgumentBytes = 2097152;
                }
            } else {
                maxArgumentBytes = 65536;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() + ATD.A07(l != null ? l.longValue() : 30000L, 1L, jA07);
            AnonymousClass001.A1J(new AnonymousClass2(hatchNodeInvocationHandler2, this, str2, str3, maxArgumentBytes, str, jElapsedRealtime - 1000, hoC, jElapsedRealtime, jLongValue, null), C3cH.A0y(this.scope.AEA(), hoC));
        }
    }

    public final boolean handles(String str) {
        C7384Etj.A0Y(str, 0);
        List<HatchNodeInvocationHandler> handlers = getHandlers();
        if (!(handlers instanceof Collection) || !handlers.isEmpty()) {
            Iterator<HatchNodeInvocationHandler> it = handlers.iterator();
            while (it.hasNext()) {
                if (it.next().getCommands().contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean preservesArgumentEnvelope(String str) {
        C7384Etj.A0Y(str, 0);
        Iterator<HatchNodeInvocationHandler> it = getHandlers().iterator();
        HatchNodeInvocationHandler hatchNodeInvocationHandler = null;
        HatchNodeInvocationHandler hatchNodeInvocationHandler2 = null;
        boolean z = false;
        while (true) {
            if (it.hasNext()) {
                HatchNodeInvocationHandler next = it.next();
                if (next.getCommands().contains(str)) {
                    if (z) {
                        break;
                    }
                    hatchNodeInvocationHandler2 = next;
                    z = true;
                }
            } else if (z) {
                hatchNodeInvocationHandler = hatchNodeInvocationHandler2;
            }
        }
        HatchNodeInvocationHandler hatchNodeInvocationHandler3 = hatchNodeInvocationHandler;
        return hatchNodeInvocationHandler3 != null && hatchNodeInvocationHandler3.getPreservesArgumentEnvelope();
    }

    public static final /* synthetic */ HatchNodeInvocationResult access$failure(HatchNodeInvocationDispatcher hatchNodeInvocationDispatcher, String str, String str2) {
        return new HatchNodeInvocationResult.Failure(str, str2);
    }

    private final HatchNodeInvocationResult failure(String str, String str2) {
        return new HatchNodeInvocationResult.Failure(str, str2);
    }

    private final List<HatchNodeInvocationHandler> getHandlers() {
        return (List) this.handlers$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, HatchNodeInvocationResult hatchNodeInvocationResult, HatchNodeInvocationHandler hatchNodeInvocationHandler, HtJ<? super Unit> htJ) {
        String str3;
        HatchNodeInvocationResult.Failure failure;
        if (!(hatchNodeInvocationResult instanceof HatchNodeInvocationResult.Failure) || (failure = (HatchNodeInvocationResult.Failure) hatchNodeInvocationResult) == null || (str3 = failure.code) == null) {
            str3 = PairsInviteMailboxKt.OUTCOME_OK;
        }
        CFK.A05(HatchNodeInvocationDispatcherKt.TAG, FGI.A0j("invoke.result command=", str, AbstractC7606F5t.A00(5), BQG.A17(str2, 8), " outcome=", str3));
        return C3cG.A0U(this.reply.invoke(str2, hatchNodeInvocationResult, hatchNodeInvocationHandler, htJ));
    }

    public final void connectionChanged(boolean z) {
        synchronized (this.lock) {
            HoC hoC = this.connection;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.connectionGeneration++;
            this.connection = z ? new C8eO((HoC) C3cH.A0t(this.scope)) : null;
        }
    }

    public final Long currentConnectionGeneration() {
        Long lValueOf;
        synchronized (this.lock) {
            HoC hoC = this.connection;
            lValueOf = null;
            if (hoC != null) {
                if (!hoC.isActive()) {
                    hoC = null;
                }
                if (hoC != null) {
                    lValueOf = Long.valueOf(this.connectionGeneration);
                }
            }
        }
        return lValueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchNodeInvocationDispatcher(Context context, AbstractC3358CGz abstractC3358CGz, C3UX c3ux, G2j<? super String, ? super HatchNodeInvocationResult, ? super HatchNodeInvocationHandler, ? super HtJ<? super Unit>, ? extends Object> g2j) {
        AnonymousClass005.A14(context, abstractC3358CGz, c3ux, g2j);
        this.context = context;
        this.scope = c3ux;
        this.reply = g2j;
        this.handlers$delegate = AbstractC5321DgF.A03(new HatchNodeInvocationDispatcher$handlers$2(abstractC3358CGz));
        this.lock = C3cG.A0T();
        int i = GCQ.A00;
        this.capacity = new C27i(4);
    }
}
