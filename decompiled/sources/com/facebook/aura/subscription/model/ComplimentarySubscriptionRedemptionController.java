package com.facebook.aura.subscription.model;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BLG;
import X.C06H;
import X.C0953AJg;
import X.C20Q;
import X.C3UX;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GDB;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC0962AJp;
import X.InterfaceC7549F2g;
import com.facebook.aura.navigation.key.ComplimentaryRedeemEntryPoint;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.RedeemComplimentarySubscriptionResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ComplimentarySubscriptionRedemptionController implements InterfaceC7549F2g {
    public final BLG<InterfaceC0962AJp<String, ComplimentarySubscriptionRedemptionState>> _states;
    public final C20Q<Boolean> isRedeeming;
    public final AuraSubscriptionRepository repository;
    public final C3UX scope;
    public static final Companion Companion = new Companion();
    public static final int $stable = AuraSubscriptionRepository.$stable;

    @DebugMetadata(c = "com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionController$activate$1", f = "ComplimentarySubscriptionRedemptionController.kt", l = {68}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionController$activate$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super RedeemComplimentarySubscriptionResult>, Object> {
        public final /* synthetic */ String $action;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.$action = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ComplimentarySubscriptionRedemptionController.this.new AnonymousClass1(this.$action, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSubscriptionRepository auraSubscriptionRepository = ComplimentarySubscriptionRedemptionController.this.repository;
                String str = this.$action;
                this.label = 1;
                obj = auraSubscriptionRepository.activateComplimentarySubscription(str, this);
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
        public final Object invoke(HtJ<? super RedeemComplimentarySubscriptionResult> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionController$redeem$1", f = "ComplimentarySubscriptionRedemptionController.kt", l = {56}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionController$redeem$1, reason: invalid class name and case insensitive filesystem */
    public final class C141371 extends AbstractC07127nr implements G0U<HtJ<? super RedeemComplimentarySubscriptionResult>, Object> {
        public int label;

        public C141371(HtJ<? super C141371> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ComplimentarySubscriptionRedemptionController.this.new C141371(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super RedeemComplimentarySubscriptionResult> htJ) {
            return ComplimentarySubscriptionRedemptionController.this.new C141371(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSubscriptionRepository auraSubscriptionRepository = ComplimentarySubscriptionRedemptionController.this.repository;
                this.label = 1;
                obj = auraSubscriptionRepository.redeemComplimentarySubscription(this);
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
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionController$run$1", f = "ComplimentarySubscriptionRedemptionController.kt", l = {90, 94}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionController$run$1, reason: invalid class name and case insensitive filesystem */
    public final class C141381 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ComplimentaryRedeemEntryPoint $entryPoint;
        public final /* synthetic */ String $planPickerEntryPoint;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ G0U<HtJ<? super RedeemComplimentarySubscriptionResult>, Object> $redeem;
        public int label;
        public final /* synthetic */ ComplimentarySubscriptionRedemptionController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141381(G0U<? super HtJ<? super RedeemComplimentarySubscriptionResult>, ? extends Object> g0u, ComplimentarySubscriptionRedemptionController complimentarySubscriptionRedemptionController, ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint, String str, String str2, HtJ<? super C141381> htJ) {
            super(2, htJ);
            this.$redeem = g0u;
            this.this$0 = complimentarySubscriptionRedemptionController;
            this.$entryPoint = complimentaryRedeemEntryPoint;
            this.$presentationId = str;
            this.$planPickerEntryPoint = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C141381(this.$redeem, this.this$0, this.$entryPoint, this.$presentationId, this.$planPickerEntryPoint, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0029 A[LOOP:0: B:18:0x0029->B:47:?, LOOP_START] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0059 A[LOOP:1: B:26:0x0059->B:49:?, LOOP_START] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r2 = 2
                r3 = 0
                r1 = 1
                if (r0 == 0) goto L76
                if (r0 == r1) goto L84
                if (r0 != r2) goto Lac
                X.Hwg.A00(r7)
            L10:
                boolean r0 = r7 instanceof com.facebook.aura.subscription.repo.SubscriptionDetailsState.Success
                if (r0 == 0) goto L21
                com.facebook.aura.subscription.repo.SubscriptionDetailsState$Success r7 = (com.facebook.aura.subscription.repo.SubscriptionDetailsState.Success) r7
                if (r7 == 0) goto L21
                com.facebook.aura.subscription.repo.SubscriptionDetails r0 = r7.details
                if (r0 == 0) goto L21
                boolean r0 = r0.isComplimentary
                if (r0 != r1) goto L21
            L20:
                r3 = 1
            L21:
                com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionController r0 = r6.this$0
                X.BLG<X.AJp<java.lang.String, com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionState>> r5 = r0._states
                java.lang.String r4 = r6.$presentationId
                if (r3 == 0) goto L59
            L29:
                java.lang.Object r2 = r5.getValue()
                r1 = r2
                X.AJp r1 = (X.InterfaceC0962AJp) r1
                com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionState r0 = com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionState.COMPLETED
                X.AJp r0 = r1.AYj(r4, r0)
                boolean r0 = r5.A6e(r2, r0)
                if (r0 == 0) goto L29
                com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
                r0 = 2131890370(0x7f1210c2, float:1.941543E38)
                r1.showToast(r0)
                com.facebook.aura.subscription.model.ComplimentaryRedeemAnalytics r2 = com.facebook.aura.subscription.model.ComplimentaryRedeemAnalytics.INSTANCE
                com.facebook.aura.navigation.key.ComplimentaryRedeemEntryPoint r1 = r6.$entryPoint
                java.lang.String r0 = r6.$presentationId
                r2.logRedeemSucceeded(r1, r0)
            L4d:
                java.lang.String r1 = r6.$planPickerEntryPoint
                if (r1 == 0) goto L56
                com.facebook.aura.subscription.model.ComplimentaryRedeemAnalytics r0 = com.facebook.aura.subscription.model.ComplimentaryRedeemAnalytics.INSTANCE
                r2.logPlanPickerClaimResult(r1, r3)
            L56:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L59:
                java.lang.Object r2 = r5.getValue()
                r1 = r2
                X.AJp r1 = (X.InterfaceC0962AJp) r1
                com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionState r0 = com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionState.FAILED
                X.AJp r0 = r1.AYj(r4, r0)
                boolean r0 = r5.A6e(r2, r0)
                if (r0 == 0) goto L59
                com.facebook.aura.subscription.model.ComplimentaryRedeemAnalytics r2 = com.facebook.aura.subscription.model.ComplimentaryRedeemAnalytics.INSTANCE
                com.facebook.aura.navigation.key.ComplimentaryRedeemEntryPoint r1 = r6.$entryPoint
                java.lang.String r0 = r6.$presentationId
                r2.logRedeemFailed(r1, r0)
                goto L4d
            L76:
                X.Hwg.A00(r7)
                X.G0U<X.HtJ<? super com.facebook.aura.subscription.repo.RedeemComplimentarySubscriptionResult>, java.lang.Object> r0 = r6.$redeem
                r6.label = r1
                java.lang.Object r7 = r0.invoke(r6)
                if (r7 != r4) goto L87
                return r4
            L84:
                X.Hwg.A00(r7)
            L87:
                com.facebook.aura.subscription.repo.RedeemComplimentarySubscriptionResult$Redeemed r0 = com.facebook.aura.subscription.repo.RedeemComplimentarySubscriptionResult.Redeemed.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r7, r0)
                if (r0 != 0) goto L20
                com.facebook.aura.subscription.repo.RedeemComplimentarySubscriptionResult$Failed r0 = com.facebook.aura.subscription.repo.RedeemComplimentarySubscriptionResult.Failed.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r7, r0)
                if (r0 != 0) goto L21
                com.facebook.aura.subscription.repo.RedeemComplimentarySubscriptionResult$Ambiguous r0 = com.facebook.aura.subscription.repo.RedeemComplimentarySubscriptionResult.Ambiguous.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r7, r0)
                if (r0 == 0) goto Lb1
                com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionController r0 = r6.this$0
                com.facebook.aura.subscription.repo.AuraSubscriptionRepository r0 = r0.repository
                r6.label = r2
                java.lang.Object r7 = r0.fetchSubscriptionDetailsState(r6)
                if (r7 != r4) goto L10
                return r4
            Lac:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            Lb1:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionController.C141381.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C141381) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void run(String str, ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint, String str2, G0U<? super HtJ<? super RedeemComplimentarySubscriptionResult>, ? extends Object> g0u) {
        InterfaceC0962AJp<String, ComplimentarySubscriptionRedemptionState> value;
        InterfaceC0962AJp<String, ComplimentarySubscriptionRedemptionState> interfaceC0962AJp;
        BLG<InterfaceC0962AJp<String, ComplimentarySubscriptionRedemptionState>> blg = this._states;
        do {
            value = blg.getValue();
            interfaceC0962AJp = value;
        } while (!blg.A6e(value, interfaceC0962AJp.containsKey(str) ? interfaceC0962AJp : interfaceC0962AJp.AYj(str, ComplimentarySubscriptionRedemptionState.LOADING)));
        if (interfaceC0962AJp.containsKey(str)) {
            return;
        }
        AnonymousClass001.A1J(new C141381(g0u, this, complimentaryRedeemEntryPoint, str, str2, null), this.scope);
    }

    public final ComplimentarySubscriptionRedemptionState currentState(String str) {
        C7384Etj.A0Y(str, 0);
        ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState = this._states.getValue().get(str);
        return complimentarySubscriptionRedemptionState == null ? ComplimentarySubscriptionRedemptionState.ENABLED : complimentarySubscriptionRedemptionState;
    }

    public final void dismissFailure(String str) {
        InterfaceC0962AJp<String, ComplimentarySubscriptionRedemptionState> value;
        InterfaceC0962AJp<String, ComplimentarySubscriptionRedemptionState> interfaceC0962AJpAaZ;
        C7384Etj.A0Y(str, 0);
        BLG<InterfaceC0962AJp<String, ComplimentarySubscriptionRedemptionState>> blg = this._states;
        do {
            value = blg.getValue();
            interfaceC0962AJpAaZ = value;
            if (interfaceC0962AJpAaZ.get(str) == ComplimentarySubscriptionRedemptionState.FAILED) {
                interfaceC0962AJpAaZ = interfaceC0962AJpAaZ.AaZ(str);
            }
        } while (!blg.A6e(value, interfaceC0962AJpAaZ));
    }

    public final void redeem(String str) {
        C7384Etj.A0Y(str, 0);
        run(str, ComplimentaryRedeemEntryPoint.CHAT_CARD, null, new C141371(null));
    }

    public final C20Q<ComplimentarySubscriptionRedemptionState> stateFor(String str) {
        C7384Etj.A0Y(str, 0);
        return GDB.A01(new ComplimentarySubscriptionRedemptionController$stateFor$$inlined$map$1(this._states, str));
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }

    public final C20Q<Boolean> isRedeeming() {
        return this.isRedeeming;
    }

    public final class Companion {
        public final ComplimentarySubscriptionRedemptionController getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ComplimentarySubscriptionRedemptionController) abstractC3358CGz.A03(ComplimentarySubscriptionRedemptionController.class, new ComplimentarySubscriptionRedemptionController$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ ComplimentarySubscriptionRedemptionController(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public final void activate(String str, String str2, ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint, String str3) {
        AnonymousClass005.A0x(str, str2, complimentaryRedeemEntryPoint);
        run(str, complimentaryRedeemEntryPoint, str3, new AnonymousClass1(str2, null));
    }

    public ComplimentarySubscriptionRedemptionController(AbstractC3358CGz abstractC3358CGz) {
        this.repository = AuraSubscriptionRepository.Companion.getInstance(abstractC3358CGz);
        this.scope = AnonymousClass007.A0k();
        C9286GCn c9286GCnA01 = HnJ.A01(C0953AJg.A00());
        this._states = c9286GCnA01;
        this.isRedeeming = GDB.A01(new ComplimentarySubscriptionRedemptionController$special$$inlined$map$1(c9286GCnA01));
    }
}
