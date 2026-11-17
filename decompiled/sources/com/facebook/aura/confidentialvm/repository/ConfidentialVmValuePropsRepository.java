package com.facebook.aura.confidentialvm.repository;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.BLG;
import X.C06H;
import X.C10650I0u;
import X.C1BN;
import X.C2yI;
import X.C3Pi;
import X.C3UX;
import X.C3pU;
import X.C7384Etj;
import X.C7438Evz;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAX;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ConfidentialVmValuePropsRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final long FETCH_TIMEOUT_MS = 5000;
    public final BLG<ConfidentialVmValuePropsState> _state;
    public final C3UX scope;
    public final SingleFlight singleFlight;
    public final C1BN<ConfidentialVmValuePropsState> state;

    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsRepository$collectIn$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0V {
        public AnonymousClass1(Object obj) {
            super(2, obj, C2yI.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/facebook/aura/confidentialvm/repository/ConfidentialVmValuePropsState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // X.G0V
        public final Object invoke(ConfidentialVmValuePropsState confidentialVmValuePropsState, HtJ<? super Unit> htJ) {
            ((G0U) this.receiver).invoke(confidentialVmValuePropsState);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsRepository$refresh$1", f = "ConfidentialVmValuePropsRepository.kt", l = {126}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsRepository$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C112561 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsRepository$refresh$1$1", f = "ConfidentialVmValuePropsRepository.kt", l = {128}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsRepository$refresh$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00861 extends AbstractC07127nr implements G0U<HtJ<? super Object>, Object> {
            public int label;
            public final /* synthetic */ ConfidentialVmValuePropsRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00861(ConfidentialVmValuePropsRepository confidentialVmValuePropsRepository, HtJ<? super C00861> htJ) {
                super(1, htJ);
                this.this$0 = confidentialVmValuePropsRepository;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C00861(this.this$0, htJ);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(HtJ<Object> htJ) {
                return new C00861(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    ConfidentialVmValuePropsRepository$refresh$1$1$json$1 confidentialVmValuePropsRepository$refresh$1$1$json$1 = new ConfidentialVmValuePropsRepository$refresh$1$1$json$1(null);
                    this.label = 1;
                    obj = GAX.A01(this, confidentialVmValuePropsRepository$refresh$1$1$json$1, 5000L);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                ConfidentialVmValuePropsJson confidentialVmValuePropsJson = (ConfidentialVmValuePropsJson) obj;
                BLG<ConfidentialVmValuePropsState> blg = this.this$0._state;
                if (confidentialVmValuePropsJson == null) {
                    return Boolean.valueOf(blg.A6e(ConfidentialVmValuePropsState.Unresolved.INSTANCE, new ConfidentialVmValuePropsState.Resolved(null)));
                }
                AnonymousClass001.A1E(blg, null, new ConfidentialVmValuePropsState.Resolved(ConfidentialVmValuePropsRepositoryKt.toValueProps(confidentialVmValuePropsJson)));
                return Unit.INSTANCE;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(HtJ<? super Object> htJ) {
                return invoke2((HtJ<Object>) htJ);
            }
        }

        public C112561(HtJ<? super C112561> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmValuePropsRepository.this.new C112561(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmValuePropsRepository confidentialVmValuePropsRepository = ConfidentialVmValuePropsRepository.this;
                SingleFlight singleFlight = confidentialVmValuePropsRepository.singleFlight;
                C00861 c00861 = new C00861(confidentialVmValuePropsRepository, null);
                this.label = 1;
                if (singleFlight.invoke(Unit.INSTANCE, c00861, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            ConfidentialVmValuePropsRepository.this._state.A6e(ConfidentialVmValuePropsState.Unresolved.INSTANCE, new ConfidentialVmValuePropsState.Resolved(null));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmValuePropsRepository.this.new C112561(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }

    public final C1BN<ConfidentialVmValuePropsState> getState() {
        return this.state;
    }

    public final void refresh() {
        this._state.A6e(new ConfidentialVmValuePropsState.Resolved(null), ConfidentialVmValuePropsState.Unresolved.INSTANCE);
        AnonymousClass001.A1J(new C112561(null), this.scope);
    }

    public final class Companion {
        public final ConfidentialVmValuePropsRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConfidentialVmValuePropsRepository) abstractC3358CGz.A03(ConfidentialVmValuePropsRepository.class, new ConfidentialVmValuePropsRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ ConfidentialVmValuePropsRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public final void collectIn(C3UX c3ux, G0U<? super ConfidentialVmValuePropsState, Unit> g0u) {
        AnonymousClass003.A0u(c3ux, g0u);
        C3pU.A02(c3ux, new C10650I0u(new AnonymousClass1(g0u), this.state, 5));
    }

    public ConfidentialVmValuePropsRepository(AbstractC3358CGz abstractC3358CGz) {
        this.scope = AnonymousClass007.A0k();
        this.singleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        C9286GCn c9286GCnA01 = HnJ.A01(ConfidentialVmValuePropsState.Unresolved.INSTANCE);
        this._state = c9286GCnA01;
        this.state = new C3Pi(null, c9286GCnA01);
    }
}
