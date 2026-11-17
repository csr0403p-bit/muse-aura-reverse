package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HnJ;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmStefiPath;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistState;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.json.HatchProblemJsonKt;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.http.RequestType;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ConfidentialVmWaitlistRepository implements InterfaceC7549F2g {
    public static final String CONFLICT_PROBLEM_TYPE = "cvm_waitlist_conflict";
    public static final Companion Companion = new Companion();
    public static final String NOT_ELIGIBLE_PROBLEM_TYPE = "cvm_waitlist_not_eligible";
    public final BLG<ConfidentialVmWaitlistState> _state;
    public final C3UX scope;
    public final SingleFlight singleFlight;
    public final C1BN<ConfidentialVmWaitlistState> state;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository", f = "ConfidentialVmWaitlistRepository.kt", l = {69, 71}, m = AuraDeeplinkRouteMapper.JOIN_ROUTE, v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$join$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmWaitlistRepository.this.join(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$refresh$1", f = "ConfidentialVmWaitlistRepository.kt", l = {57}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C113321 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$refresh$1$1", f = "ConfidentialVmWaitlistRepository.kt", l = {59}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$refresh$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00891 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public Object L$0;
            public int label;
            public final /* synthetic */ ConfidentialVmWaitlistRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00891(ConfidentialVmWaitlistRepository confidentialVmWaitlistRepository, HtJ<? super C00891> htJ) {
                super(1, htJ);
                this.this$0 = confidentialVmWaitlistRepository;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C00891(this.this$0, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new C00891(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                BLG<ConfidentialVmWaitlistState> blg;
                Object objM488fetch0E7RQCE;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    ConfidentialVmWaitlistRepository confidentialVmWaitlistRepository = this.this$0;
                    blg = confidentialVmWaitlistRepository._state;
                    ConfidentialVmStefiPath.CvmWaitlist cvmWaitlist = ConfidentialVmStefiPath.CvmWaitlist.INSTANCE;
                    RequestType requestType = RequestType.GET;
                    this.L$0 = blg;
                    this.label = 1;
                    objM488fetch0E7RQCE = confidentialVmWaitlistRepository.m488fetch0E7RQCE(cvmWaitlist, requestType, this);
                    if (objM488fetch0E7RQCE == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    blg = (BLG) this.L$0;
                    objM488fetch0E7RQCE = AnonymousClass001.A0q(obj);
                }
                blg.Af8(HsJ.A00(objM488fetch0E7RQCE) == null ? this.this$0.toState((ConfidentialVmWaitlistJson) objM488fetch0E7RQCE) : ConfidentialVmWaitlistState.Failed.INSTANCE);
                return Unit.INSTANCE;
            }
        }

        public C113321(HtJ<? super C113321> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmWaitlistRepository.this.new C113321(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmWaitlistRepository confidentialVmWaitlistRepository = ConfidentialVmWaitlistRepository.this;
                SingleFlight singleFlight = confidentialVmWaitlistRepository.singleFlight;
                C00891 c00891 = new C00891(confidentialVmWaitlistRepository, null);
                this.label = 1;
                if (singleFlight.invoke(Unit.INSTANCE, c00891, this) == enumC10460Hji) {
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
            return ConfidentialVmWaitlistRepository.this.new C113321(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* renamed from: fetch-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m488fetch0E7RQCE(com.facebook.aura.network.api.StefiHatchPath r7, com.facebook.aura.network.http.RequestType r8, X.HtJ<? super X.HsJ<com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistJson>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$fetch$1
            if (r0 == 0) goto L3c
            r5 = r9
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$fetch$1 r5 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$fetch$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L42
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$fetch$2 r0 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$fetch$2
            r0.<init>(r7, r8, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3c:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$fetch$1 r5 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$fetch$1
            r5.<init>(r6, r9)
            goto L12
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository.m488fetch0E7RQCE(com.facebook.aura.network.api.StefiHatchPath, com.facebook.aura.network.http.RequestType, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfidentialVmWaitlistState.Loaded toState(ConfidentialVmWaitlistJson confidentialVmWaitlistJson) {
        String str = confidentialVmWaitlistJson.status;
        return new ConfidentialVmWaitlistState.Loaded("waitlisted".equals(str) ? ConfidentialVmWaitlistStatus.WAITLISTED : "admitted".equals(str) ? ConfidentialVmWaitlistStatus.ADMITTED : null, confidentialVmWaitlistJson.show_cvm_waitlist);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }

    public final C1BN<ConfidentialVmWaitlistState> getState() {
        return this.state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object join(X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistJoinFailure> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository.AnonymousClass1
            if (r0 == 0) goto L8f
            r4 = r9
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$join$1 r4 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r7 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r6 = 2
            r3 = 1
            if (r0 == 0) goto L47
            if (r0 == r3) goto L61
            if (r0 != r6) goto La8
            java.lang.Object r1 = r4.L$1
            X.Hqv r1 = (X.C10543Hqv) r1
            java.lang.Object r2 = r4.L$0
            X.Hqv r2 = (X.C10543Hqv) r2
            java.lang.Object r0 = X.AnonymousClass001.A0q(r7)
        L2c:
            r1.element = r0
        L2e:
            T r1 = r2.element
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto L96
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistJson r1 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistJson) r1
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistState$Loaded r1 = r8.toState(r1)
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistStatus r0 = r1.status
            if (r0 == 0) goto La5
            X.BLG<com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistState> r0 = r8._state
            X.AnonymousClass002.A1I(r0, r1)
            r5 = 0
        L46:
            return r5
        L47:
            X.Hwg.A00(r7)
            X.Hqv r2 = new X.Hqv
            r2.<init>()
            com.facebook.aura.confidentialvm.repository.ConfidentialVmStefiPath$CvmWaitlistJoin r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmStefiPath.CvmWaitlistJoin.INSTANCE
            com.facebook.aura.network.http.RequestType r0 = com.facebook.aura.network.http.RequestType.POST
            r4.L$0 = r2
            r4.L$1 = r2
            r4.label = r3
            java.lang.Object r0 = r8.m488fetch0E7RQCE(r1, r0, r4)
            if (r0 == r5) goto L46
            r1 = r2
            goto L6d
        L61:
            java.lang.Object r1 = r4.L$1
            X.Hqv r1 = (X.C10543Hqv) r1
            java.lang.Object r2 = r4.L$0
            X.Hqv r2 = (X.C10543Hqv) r2
            java.lang.Object r0 = X.AnonymousClass001.A0q(r7)
        L6d:
            r1.element = r0
            T r0 = r2.element
            java.lang.String r1 = r8.problemType(r0)
            java.lang.String r0 = "cvm_waitlist_conflict"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            com.facebook.aura.confidentialvm.repository.ConfidentialVmStefiPath$CvmWaitlistJoin r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmStefiPath.CvmWaitlistJoin.INSTANCE
            com.facebook.aura.network.http.RequestType r0 = com.facebook.aura.network.http.RequestType.POST
            r4.L$0 = r2
            r4.L$1 = r2
            r4.label = r6
            java.lang.Object r0 = r8.m488fetch0E7RQCE(r1, r0, r4)
            if (r0 == r5) goto L46
            r1 = r2
            goto L2c
        L8f:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$join$1 r4 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$join$1
            r4.<init>(r9)
            goto L12
        L96:
            java.lang.String r1 = r8.problemType(r1)
            java.lang.String r0 = "cvm_waitlist_not_eligible"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La5
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistJoinFailure r5 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistJoinFailure.NOT_ELIGIBLE
            return r5
        La5:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistJoinFailure r5 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistJoinFailure.FAILED
            return r5
        La8:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository.join(X.HtJ):java.lang.Object");
    }

    public final void refresh() {
        this._state.Af8(ConfidentialVmWaitlistState.Unresolved.INSTANCE);
        AnonymousClass001.A1J(new C113321(null), this.scope);
    }

    public final class Companion {
        public final ConfidentialVmWaitlistRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConfidentialVmWaitlistRepository) abstractC3358CGz.A03(ConfidentialVmWaitlistRepository.class, new ConfidentialVmWaitlistRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ ConfidentialVmWaitlistRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    private final String problemType(Object obj) {
        Throwable thA00 = HsJ.A00(obj);
        HatchProblemJson hatchProblemJsonHatchProblemOf = HatchProblemJsonKt.hatchProblemOf((!(thA00 instanceof NetworkException) || thA00 == null) ? null : thA00.getMessage());
        if (hatchProblemJsonHatchProblemOf != null) {
            return hatchProblemJsonHatchProblemOf.type;
        }
        return null;
    }

    public ConfidentialVmWaitlistRepository(AbstractC3358CGz abstractC3358CGz) {
        this.scope = AnonymousClass007.A0k();
        this.singleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        C9286GCn c9286GCnA01 = HnJ.A01(ConfidentialVmWaitlistState.Unresolved.INSTANCE);
        this._state = c9286GCnA01;
        this.state = new C3Pi(null, c9286GCnA01);
    }
}
