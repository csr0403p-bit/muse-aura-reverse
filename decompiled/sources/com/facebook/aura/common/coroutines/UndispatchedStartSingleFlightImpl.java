package com.facebook.aura.common.coroutines;

import X.AbstractC07127nr;
import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06H;
import X.C27k;
import X.C3UX;
import X.C3cG;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.EnumC10460Hji;
import X.F0C;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class UndispatchedStartSingleFlightImpl extends SingleFlightBase {
    public final ConcurrentHashMap<Object, F0C<C27k<SingleFlightResult<?>>>> jobs;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.common.coroutines.UndispatchedStartSingleFlightImpl$handleJoin$2", f = "SingleFlight.kt", l = {VoiceCallForegroundService.AVATAR_TARGET_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.common.coroutines.UndispatchedStartSingleFlightImpl$handleJoin$2, reason: invalid class name */
    public final class AnonymousClass2<T> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SingleFlightResult<? extends T>>, Object> {
        public final /* synthetic */ G0U<HtJ<? super SingleFlightResult<? extends T>>, Object> $action;
        public final /* synthetic */ Object $key;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Object obj, G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$key = obj;
            this.$action = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = UndispatchedStartSingleFlightImpl.this.new AnonymousClass2(this.$key, this.$action, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C27k<SingleFlightResult<T>> orPutJob = UndispatchedStartSingleFlightImpl.this.getOrPutJob(this.$key, this.$action, c3ux);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = C3cG.A0W(orPutJob, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            UndispatchedStartSingleFlightImpl.this.forget(this.$key);
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super SingleFlightResult<? extends T>> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.facebook.aura.common.coroutines.UndispatchedStartSingleFlightImpl$wrapAsync$1, reason: invalid class name */
    public final class AnonymousClass1<T> extends AbstractC7559F3s implements Function0<C27k<? extends SingleFlightResult<? extends T>>> {
        public final /* synthetic */ G0U<HtJ<? super SingleFlightResult<? extends T>>, Object> $action;
        public final /* synthetic */ C3UX $coroutineScope;
        public final /* synthetic */ Object $key;
        public final /* synthetic */ UndispatchedStartSingleFlightImpl this$0;

        @DebugMetadata(c = "com.facebook.aura.common.coroutines.UndispatchedStartSingleFlightImpl$wrapAsync$1$1", f = "SingleFlight.kt", l = {119}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.common.coroutines.UndispatchedStartSingleFlightImpl$wrapAsync$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00661 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SingleFlightResult<? extends T>>, Object> {
            public final /* synthetic */ G0U<HtJ<? super SingleFlightResult<? extends T>>, Object> $action;
            public final /* synthetic */ Object $key;
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ UndispatchedStartSingleFlightImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00661(G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u, UndispatchedStartSingleFlightImpl undispatchedStartSingleFlightImpl, Object obj, HtJ<? super C00661> htJ) {
                super(2, htJ);
                this.$action = g0u;
                this.this$0 = undispatchedStartSingleFlightImpl;
                this.$key = obj;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C00661 c00661 = new C00661(this.$action, this.this$0, this.$key, htJ);
                c00661.L$0 = obj;
                return c00661;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        G0U<HtJ<? super SingleFlightResult<? extends T>>, Object> g0u = this.$action;
                        this.L$0 = obj2;
                        this.label = 1;
                        obj = g0u.invoke(this);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                    SingleFlightResult singleFlightResult = (SingleFlightResult) obj;
                    if (C7384Etj.areEqual(this.this$0.jobs.get(this.$key), obj2)) {
                        this.this$0.jobs.remove(this.$key);
                    }
                    return singleFlightResult;
                } finally {
                }
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super SingleFlightResult<? extends T>> htJ) {
                return ((C00661) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C3UX c3ux, G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u, UndispatchedStartSingleFlightImpl undispatchedStartSingleFlightImpl, Object obj) {
            super(0);
            this.$coroutineScope = c3ux;
            this.$action = g0u;
            this.this$0 = undispatchedStartSingleFlightImpl;
            this.$key = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C27k<SingleFlightResult<T>> invoke() {
            C3UX c3ux = this.$coroutineScope;
            return GAo.A01(C79.A0K, C6ys.A00, new C00661(this.$action, this.this$0, this.$key, null), c3ux);
        }
    }

    @Override // com.facebook.aura.common.coroutines.SingleFlightBase
    public void cancelAndRemoveJob(Object obj) {
        C7384Etj.A0Y(obj, 0);
        F0C<C27k<SingleFlightResult<?>>> f0cRemove = this.jobs.remove(obj);
        if (f0cRemove != null) {
            AnonymousClass002.A1K(f0cRemove.getValue());
        }
    }

    @Override // com.facebook.aura.common.coroutines.SingleFlight
    public void forget(Object obj) {
        C7384Etj.A0Y(obj, 0);
        this.jobs.remove(obj);
    }

    @Override // com.facebook.aura.common.coroutines.SingleFlightBase
    public <T> Object handleJoin(Object obj, G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u, HtJ<? super SingleFlightResult<? extends T>> htJ) {
        return Hxb.A00(new AnonymousClass2(obj, g0u, null), htJ);
    }

    @Override // com.facebook.aura.common.coroutines.SingleFlight
    public boolean hasActiveJobForKey(Object obj) {
        C27k<SingleFlightResult<?>> value;
        C7384Etj.A0Y(obj, 0);
        F0C<C27k<SingleFlightResult<?>>> f0c = this.jobs.get(obj);
        return (f0c == null || (value = f0c.getValue()) == null || !value.isActive()) ? false : true;
    }

    public /* synthetic */ UndispatchedStartSingleFlightImpl(OnDuplicateCall onDuplicateCall, int i, C06H c06h) {
        this((i & 1) != 0 ? OnDuplicateCall.Join.INSTANCE : onDuplicateCall);
    }

    private final <T> F0C<C27k<SingleFlightResult<T>>> wrapAsync(Object obj, C3UX c3ux, G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u) {
        return AbstractC5321DgF.A03(new AnonymousClass1(c3ux, g0u, this, obj));
    }

    @Override // com.facebook.aura.common.coroutines.SingleFlight
    public void clearAndCancelAll() {
        for (F0C<C27k<SingleFlightResult<?>>> f0c : this.jobs.values()) {
            C7384Etj.A0U(f0c);
            f0c.getValue().A5w(null);
        }
        this.jobs.clear();
    }

    @Override // com.facebook.aura.common.coroutines.SingleFlightBase
    public <T> C27k<SingleFlightResult<T>> getOrPutJob(Object obj, G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u, C3UX c3ux) {
        F0C<C27k<SingleFlightResult<T>>> f0cWrapAsync;
        AnonymousClass005.A0x(obj, g0u, c3ux);
        ConcurrentHashMap<Object, F0C<C27k<SingleFlightResult<?>>>> concurrentHashMap = this.jobs;
        F0C f0cPutIfAbsent = concurrentHashMap.get(obj);
        if (f0cPutIfAbsent == null && (f0cPutIfAbsent = concurrentHashMap.putIfAbsent(obj, (f0cWrapAsync = wrapAsync(obj, c3ux, g0u)))) == null) {
            f0cPutIfAbsent = f0cWrapAsync;
        }
        C27k<SingleFlightResult<T>> c27k = (C27k) f0cPutIfAbsent.getValue();
        C7384Etj.A0Z(c27k, "null cannot be cast to non-null type kotlinx.coroutines.Deferred<com.facebook.aura.common.coroutines.SingleFlightResult<T of com.facebook.aura.common.coroutines.UndispatchedStartSingleFlightImpl.getOrPutJob>>");
        return c27k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndispatchedStartSingleFlightImpl(OnDuplicateCall onDuplicateCall) {
        super(onDuplicateCall);
        C7384Etj.A0Y(onDuplicateCall, 0);
        this.jobs = new ConcurrentHashMap<>();
    }

    public UndispatchedStartSingleFlightImpl() {
        this(OnDuplicateCall.Join.INSTANCE);
    }
}
