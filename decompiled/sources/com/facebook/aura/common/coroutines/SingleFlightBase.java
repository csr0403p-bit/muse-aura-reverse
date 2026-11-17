package com.facebook.aura.common.coroutines;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
import X.C27k;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C78T;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GBM;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class SingleFlightBase implements SingleFlight {
    public final OnDuplicateCall strategy;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.common.coroutines.SingleFlightBase$handleCancel$2", f = "SingleFlight.kt", l = {241}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.common.coroutines.SingleFlightBase$handleCancel$2, reason: invalid class name */
    public final class AnonymousClass2<T> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SingleFlightResult<? extends T>>, Object> {
        public final /* synthetic */ G0U<HtJ<? super SingleFlightResult<? extends T>>, Object> $action;
        public final /* synthetic */ Object $key;
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
            return SingleFlightBase.this.new AnonymousClass2(this.$key, this.$action, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SingleFlightBase.this.cancelAndRemoveJob(this.$key);
                SingleFlightBase singleFlightBase = SingleFlightBase.this;
                Object obj2 = this.$key;
                G0U<HtJ<? super SingleFlightResult<? extends T>>, Object> g0u = this.$action;
                this.label = 1;
                obj = singleFlightBase.handleJoin(obj2, g0u, this);
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
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.common.coroutines.SingleFlightBase$handleJoin$2", f = "SingleFlight.kt", l = {233}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.common.coroutines.SingleFlightBase$handleJoin$2, reason: invalid class name and case insensitive filesystem */
    public final class C111402<T> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SingleFlightResult<? extends T>>, Object> {
        public final /* synthetic */ G0U<HtJ<? super SingleFlightResult<? extends T>>, Object> $action;
        public final /* synthetic */ Object $key;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C111402(Object obj, G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u, HtJ<? super C111402> htJ) {
            super(2, htJ);
            this.$key = obj;
            this.$action = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C111402 c111402 = SingleFlightBase.this.new C111402(this.$key, this.$action, htJ);
            c111402.L$0 = obj;
            return c111402;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C78T orPutJob = SingleFlightBase.this.getOrPutJob(this.$key, this.$action, c3ux);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = ((GBM) orPutJob).A0E(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super SingleFlightResult<? extends T>> htJ) {
            return ((C111402) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.common.coroutines.SingleFlightBase$handleSkip$2", f = "SingleFlight.kt", l = {249}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.common.coroutines.SingleFlightBase$handleSkip$2, reason: invalid class name and case insensitive filesystem */
    public final class C111412<T> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SingleFlightResult<? extends T>>, Object> {
        public final /* synthetic */ G0U<HtJ<? super SingleFlightResult<? extends T>>, Object> $action;
        public final /* synthetic */ Object $key;
        public final /* synthetic */ Function0<Boolean> $predicate;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.common.coroutines.SingleFlightBase$handleSkip$2$1", f = "SingleFlight.kt", l = {251}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.common.coroutines.SingleFlightBase$handleSkip$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super SingleFlightResult<? extends T>>, Object> {
            public final /* synthetic */ G0U<HtJ<? super SingleFlightResult<? extends T>>, Object> $action;
            public final /* synthetic */ Function0<Boolean> $predicate;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function0<Boolean> function0, G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.$predicate = function0;
                this.$action = g0u;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.$predicate, this.$action, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    if (AnonymousClass003.A1Y(this.$predicate)) {
                        return SingleFlightResult.Skipped.INSTANCE;
                    }
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

            @Override // X.G0U
            public final Object invoke(HtJ<? super SingleFlightResult<? extends T>> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C111412(Object obj, Function0<Boolean> function0, G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u, HtJ<? super C111412> htJ) {
            super(2, htJ);
            this.$key = obj;
            this.$predicate = function0;
            this.$action = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SingleFlightBase.this.new C111412(this.$key, this.$predicate, this.$action, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SingleFlightBase singleFlightBase = SingleFlightBase.this;
                Object obj2 = this.$key;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$predicate, this.$action, null);
                this.label = 1;
                obj = singleFlightBase.handleJoin(obj2, anonymousClass1, this);
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
            return ((C111412) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.common.coroutines.SingleFlightBase$wrapAction$1", f = "SingleFlight.kt", l = {217}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.common.coroutines.SingleFlightBase$wrapAction$1, reason: invalid class name */
    public final class AnonymousClass1<T> extends AbstractC07127nr implements G0U<HtJ<? super SingleFlightResult<? extends T>>, Object> {
        public final /* synthetic */ G0U<HtJ<? super T>, Object> $action;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.$action = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.$action, htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super SingleFlightResult<? extends T>> htJ) {
            return new AnonymousClass1(this.$action, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                G0U<HtJ<? super T>, Object> g0u = this.$action;
                this.label = 1;
                obj = g0u.invoke(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Hwg.A00(obj);
            }
            return new SingleFlightResult.Result(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object handleCancel(Object obj, G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u, HtJ<? super SingleFlightResult<? extends T>> htJ) {
        return Hxb.A00(new AnonymousClass2(obj, g0u, null), htJ);
    }

    public static /* synthetic */ <T> Object handleJoin$suspendImpl(SingleFlightBase singleFlightBase, Object obj, G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u, HtJ<? super SingleFlightResult<? extends T>> htJ) {
        return Hxb.A00(singleFlightBase.new C111402(obj, g0u, null), htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object handleSkip(Object obj, G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u, Function0<Boolean> function0, HtJ<? super SingleFlightResult<? extends T>> htJ) {
        return Hxb.A00(new C111412(obj, function0, g0u, null), htJ);
    }

    private final <T> G0U<HtJ<? super SingleFlightResult<? extends T>>, Object> wrapAction(G0U<? super HtJ<? super T>, ? extends Object> g0u) {
        return new AnonymousClass1(g0u, null);
    }

    public abstract void cancelAndRemoveJob(Object obj);

    public abstract <T> C27k<SingleFlightResult<T>> getOrPutJob(Object obj, G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u, C3UX c3ux);

    public /* synthetic */ SingleFlightBase(OnDuplicateCall onDuplicateCall, int i, C06H c06h) {
        this((i & 1) != 0 ? OnDuplicateCall.Join.INSTANCE : onDuplicateCall);
    }

    public static /* synthetic */ <T> Object invoke$suspendImpl(SingleFlightBase singleFlightBase, Object obj, G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super SingleFlightResult<? extends T>> htJ) {
        OnDuplicateCall onDuplicateCall = singleFlightBase.strategy;
        if (C7384Etj.areEqual(onDuplicateCall, OnDuplicateCall.Join.INSTANCE)) {
            return singleFlightBase.handleJoin(obj, new AnonymousClass1(g0u, null), htJ);
        }
        if (C7384Etj.areEqual(onDuplicateCall, OnDuplicateCall.Cancel.INSTANCE)) {
            return singleFlightBase.handleCancel(obj, new AnonymousClass1(g0u, null), htJ);
        }
        if (onDuplicateCall instanceof OnDuplicateCall.SkipWhen) {
            return singleFlightBase.handleSkip(obj, new AnonymousClass1(g0u, null), ((OnDuplicateCall.SkipWhen) singleFlightBase.strategy).predicate, htJ);
        }
        throw C3cG.A0q();
    }

    public <T> Object handleJoin(Object obj, G0U<? super HtJ<? super SingleFlightResult<? extends T>>, ? extends Object> g0u, HtJ<? super SingleFlightResult<? extends T>> htJ) {
        return handleJoin$suspendImpl(this, obj, g0u, htJ);
    }

    @Override // com.facebook.aura.common.coroutines.SingleFlight
    public <T> Object invoke(Object obj, G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super SingleFlightResult<? extends T>> htJ) {
        return invoke$suspendImpl(this, obj, g0u, htJ);
    }

    public SingleFlightBase(OnDuplicateCall onDuplicateCall) {
        C7384Etj.A0Y(onDuplicateCall, 0);
        this.strategy = onDuplicateCall;
    }

    public SingleFlightBase() {
        this(OnDuplicateCall.Join.INSTANCE);
    }
}
