package com.facebook.aura.common.coroutines;

import X.AbstractC07127nr;
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
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class LazyStartSingleFlightImpl extends SingleFlightBase {
    public final ConcurrentHashMap<Object, C27k<?>> jobs;

    /* renamed from: com.facebook.aura.common.coroutines.LazyStartSingleFlightImpl$getOrPutJob$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public final /* synthetic */ C27k<?> $job;
        public final /* synthetic */ Object $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, C27k<?> c27k) {
            super(1);
            this.$key = obj;
            this.$job = c27k;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            LazyStartSingleFlightImpl.this.jobs.remove(this.$key, this.$job);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.common.coroutines.SingleFlightBase
    public void cancelAndRemoveJob(Object obj) {
        C7384Etj.A0Y(obj, 0);
        AnonymousClass002.A1K(this.jobs.remove(obj));
    }

    @Override // com.facebook.aura.common.coroutines.SingleFlight
    public void forget(Object obj) {
        C7384Etj.A0Y(obj, 0);
        this.jobs.remove(obj);
    }

    @Override // com.facebook.aura.common.coroutines.SingleFlight
    public boolean hasActiveJobForKey(Object obj) {
        C7384Etj.A0Y(obj, 0);
        C27k<?> c27k = this.jobs.get(obj);
        return c27k != null && c27k.isActive();
    }

    public /* synthetic */ LazyStartSingleFlightImpl(OnDuplicateCall onDuplicateCall, int i, C06H c06h) {
        this((i & 1) != 0 ? OnDuplicateCall.Join.INSTANCE : onDuplicateCall);
    }

    @Override // com.facebook.aura.common.coroutines.SingleFlight
    public void clearAndCancelAll() {
        for (C27k<?> c27k : this.jobs.values()) {
            C7384Etj.A0U(c27k);
            c27k.A5w(null);
        }
        this.jobs.clear();
    }

    @Override // com.facebook.aura.common.coroutines.SingleFlightBase
    public <T> C27k<SingleFlightResult<T>> getOrPutJob(Object obj, final G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u, final C3UX c3ux) {
        AnonymousClass005.A0x(obj, g0u, c3ux);
        C27k<SingleFlightResult<T>> c27k = (C27k) this.jobs.compute(obj, new BiFunction() { // from class: com.facebook.aura.common.coroutines.LazyStartSingleFlightImpl$getOrPutJob$job$1

            @DebugMetadata(c = "com.facebook.aura.common.coroutines.LazyStartSingleFlightImpl$getOrPutJob$job$1$2", f = "SingleFlight.kt", l = {182}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.common.coroutines.LazyStartSingleFlightImpl$getOrPutJob$job$1$2, reason: invalid class name */
            public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SingleFlightResult<? extends T>>, Object> {
                public final /* synthetic */ G0U<HtJ<? super SingleFlightResult<? extends T>>, Object> $action;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u, HtJ<? super AnonymousClass2> htJ) {
                    super(2, htJ);
                    this.$action = g0u;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new AnonymousClass2(this.$action, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    if (i == 0) {
                        Hwg.A00(obj);
                        G0U<HtJ<? super SingleFlightResult<? extends T>>, Object> g0u = this.$action;
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
                    return obj;
                }

                @Override // X.G0V
                public final Object invoke(C3UX c3ux, HtJ<? super SingleFlightResult<? extends T>> htJ) {
                    return new AnonymousClass2(this.$action, htJ).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // java.util.function.BiFunction
            public final C27k<?> apply(Object obj2, C27k<?> c27k2) {
                if (c27k2 != null && !c27k2.isCancelled() && !c27k2.AOG()) {
                    return c27k2;
                }
                C3UX c3ux2 = c3ux;
                return GAo.A01(C79.A01, C6ys.A00, new AnonymousClass2(g0u, null), c3ux2);
            }
        });
        if (c27k == null) {
            throw C3cG.A0Q(AnonymousClass001.A0v(" was not stored", C3cG.A0f(obj, "SingleFlight job for ")));
        }
        c27k.AO5(new AnonymousClass1(obj, c27k));
        return c27k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStartSingleFlightImpl(OnDuplicateCall onDuplicateCall) {
        super(onDuplicateCall);
        C7384Etj.A0Y(onDuplicateCall, 0);
        this.jobs = new ConcurrentHashMap<>();
    }

    public LazyStartSingleFlightImpl() {
        this(OnDuplicateCall.Join.INSTANCE);
    }
}
