package com.facebook.aura.devices.link.ordering;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BLG;
import X.C10649I0t;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C3pd;
import X.C3rb;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C7Bq;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.checkout.ui.HatchAddressSuggestion;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderEffect;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderEvent;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderResult;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import com.facebook.aura.navigation.key.HatchLinkOrderEntryPoint;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchLinkOrderViewModel extends AEs {
    public static final int $stable = 8;
    public final C3Em<Unit> _dismiss;
    public final BLG<HatchLinkOrderFormState> _state;
    public HoC addressSuggestionsJob;
    public final C22I<Unit> dismiss;
    public final HatchLinkOrderEntryPoint entryPoint;
    public volatile SubscriptionDetailsState entrySubscriptionState;
    public final AtomicBoolean hasLoggedExit;
    public final boolean isPostPurchase;
    public final C1BN<HatchLinkOrderFormState> state;
    public final AbstractC3358CGz userSession;

    public final class Factory extends AuraViewModelFactory<HatchLinkOrderViewModel> {
        public static final int $stable = 8;
        public final HatchLinkOrderEntryPoint entryPoint;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchLinkOrderViewModel create() {
            return new HatchLinkOrderViewModel(this.userSession, this.entryPoint);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint) {
            AnonymousClass003.A0u(abstractC3358CGz, hatchLinkOrderEntryPoint);
            this.userSession = abstractC3358CGz;
            this.entryPoint = hatchLinkOrderEntryPoint;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$checkEligibility$1", f = "HatchLinkOrderViewModel.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$checkEligibility$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchLinkOrderViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchLinkOrderViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            AuraSubscriptionRepository companion;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                companion = AuraSubscriptionRepository.Companion.getInstance(HatchLinkOrderViewModel.this.userSession);
                HatchLinkOrderViewModel hatchLinkOrderViewModel = HatchLinkOrderViewModel.this;
                this.L$0 = companion;
                this.label = 1;
                obj = hatchLinkOrderViewModel.fetchFreshSubscriptionState(companion, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                companion = (AuraSubscriptionRepository) this.L$0;
                Hwg.A00(obj);
            }
            SubscriptionDetailsState value = (SubscriptionDetailsState) obj;
            if (value == null) {
                value = companion.subscriptionDetailsState.getValue();
            }
            HatchLinkOrderViewModel.this.entrySubscriptionState = value;
            HatchLinkOrderRepository hatchLinkOrderRepository = HatchLinkOrderRepository.INSTANCE;
            HatchLinkOrderBlockReason hatchLinkOrderBlockReasonEntryBlockReason = hatchLinkOrderRepository.entryBlockReason(value);
            HatchLinkOrderLogger.INSTANCE.logOpened(HatchLinkOrderViewModel.this.entryPoint, hatchLinkOrderBlockReasonEntryBlockReason);
            HatchLinkOrderViewModel.this.onEvent(new HatchLinkOrderEvent.EligibilityResolved(hatchLinkOrderBlockReasonEntryBlockReason, hatchLinkOrderBlockReasonEntryBlockReason == HatchLinkOrderBlockReason.NO_SUBSCRIPTION && hatchLinkOrderRepository.canSubscribe(value), hatchLinkOrderRepository.isTestEnvironment(value)));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel", f = "HatchLinkOrderViewModel.kt", l = {97}, m = "fetchFreshSubscriptionState", v = 2)
    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$fetchFreshSubscriptionState$1, reason: invalid class name and case insensitive filesystem */
    public final class C115941 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C115941(HtJ<? super C115941> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchLinkOrderViewModel.this.fetchFreshSubscriptionState(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$fetchFreshSubscriptionState$2", f = "HatchLinkOrderViewModel.kt", l = {98}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$fetchFreshSubscriptionState$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SubscriptionDetailsState>, Object> {
        public final /* synthetic */ AuraSubscriptionRepository $subscriptionRepository;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraSubscriptionRepository auraSubscriptionRepository, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$subscriptionRepository = auraSubscriptionRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$subscriptionRepository, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super SubscriptionDetailsState> htJ) {
            return new AnonymousClass2(this.$subscriptionRepository, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSubscriptionRepository auraSubscriptionRepository = this.$subscriptionRepository;
                this.label = 1;
                obj = auraSubscriptionRepository.fetchSubscriptionDetailsState(this);
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

    @DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$loadSavedDetails$1", f = "HatchLinkOrderViewModel.kt", l = {245}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$loadSavedDetails$1, reason: invalid class name and case insensitive filesystem */
    public final class C115951 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C115951(HtJ<? super C115951> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchLinkOrderViewModel.this.new C115951(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchLinkOrderViewModel.this.new C115951(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchLinkSavedDetails hatchLinkSavedDetails;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchLinkWalletAccountInfoRepository hatchLinkWalletAccountInfoRepository = HatchLinkWalletAccountInfoRepository.INSTANCE;
                    this.label = 1;
                    obj = hatchLinkWalletAccountInfoRepository.fetchSavedDetails(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                hatchLinkSavedDetails = (HatchLinkSavedDetails) obj;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(HatchLinkOrderViewModelKt.TAG, "Saved shipping details fetch failed; falling back to empty form", e2);
                hatchLinkSavedDetails = null;
            }
            HatchLinkOrderViewModel.this.onEvent(new HatchLinkOrderEvent.SavedDetailsLoaded(hatchLinkSavedDetails));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$observeSubscriptionActivation$1", f = "HatchLinkOrderViewModel.kt", l = {126}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$observeSubscriptionActivation$1, reason: invalid class name and case insensitive filesystem */
    public final class C115961 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AuraSubscriptionRepository $subscriptionRepository;
        public int label;
        public final /* synthetic */ HatchLinkOrderViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115961(AuraSubscriptionRepository auraSubscriptionRepository, HatchLinkOrderViewModel hatchLinkOrderViewModel, HtJ<? super C115961> htJ) {
            super(2, htJ);
            this.$subscriptionRepository = auraSubscriptionRepository;
            this.this$0 = hatchLinkOrderViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C115961(this.$subscriptionRepository, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSubscriptionRepository auraSubscriptionRepository = this.$subscriptionRepository;
                C10649I0t c10649I0t = new C10649I0t(C3rb.A03(new HatchLinkOrderViewModel$observeSubscriptionActivation$1$event$1(auraSubscriptionRepository, null), auraSubscriptionRepository.subscriptionDetailsState, auraSubscriptionRepository.isSettlingPurchase), 2);
                this.label = 1;
                obj = AbstractC9777Gfy.A02(c10649I0t, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchLinkOrderEvent hatchLinkOrderEvent = (HatchLinkOrderEvent) obj;
            HatchLinkOrderLogger.INSTANCE.logOpened(this.this$0.entryPoint, C7384Etj.areEqual(hatchLinkOrderEvent, HatchLinkOrderEvent.ActivationTimedOut.INSTANCE) ? HatchLinkOrderBlockReason.SUBSCRIPTION_NOT_READY : HatchLinkOrderRepository.INSTANCE.blockReason(this.this$0.userSession));
            this.this$0.onEvent(hatchLinkOrderEvent);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C115961) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$onAddressQueryChange$1", f = "HatchLinkOrderViewModel.kt", l = {AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN, 193}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$onAddressQueryChange$1, reason: invalid class name and case insensitive filesystem */
    public final class C115971 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $trimmed;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115971(String str, HtJ<? super C115971> htJ) {
            super(2, htJ);
            this.$trimmed = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchLinkOrderViewModel.this.new C115971(this.$trimmed, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            AHD ahd;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(HatchLinkOrderViewModelKt.TAG, "Address suggestions fetch failed", e2);
                ahd = AHI.A01;
            }
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(300L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    ahd = (AHD) obj;
                    HatchLinkOrderViewModel.this.setAddressSuggestions(ahd);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            C78T c78tA0y = AnonymousClass001.A0y();
            HatchLinkOrderViewModel$onAddressQueryChange$1$suggestions$1 hatchLinkOrderViewModel$onAddressQueryChange$1$suggestions$1 = new HatchLinkOrderViewModel$onAddressQueryChange$1$suggestions$1(this.$trimmed, null);
            this.label = 2;
            obj = GAo.A00(this, c78tA0y, hatchLinkOrderViewModel$onAddressQueryChange$1$suggestions$1);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
            ahd = (AHD) obj;
            HatchLinkOrderViewModel.this.setAddressSuggestions(ahd);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C115971) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$submit$1", f = "HatchLinkOrderViewModel.kt", l = {262, 278}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$submit$1, reason: invalid class name and case insensitive filesystem */
    public final class C115981 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C115981(HtJ<? super C115981> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchLinkOrderViewModel.this.new C115981(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchLinkOrderViewModel.this.new C115981(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchLinkOrderResult failed;
            HatchLinkOrderResult failed2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            String str = HatchLinkOrderViewModelKt.ORDER_REQUEST_FAILED;
            try {
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    String message = e2.getMessage();
                    if (message == null) {
                        message = HatchLinkOrderViewModelKt.ORDER_REQUEST_FAILED;
                    }
                    failed2 = new HatchLinkOrderResult.Failed(message, HatchLinkOrderSubmitError.GENERIC);
                }
            } catch (CancellationException e3) {
                throw e3;
            } catch (Exception e4) {
                String message2 = e4.getMessage();
                if (message2 != null) {
                    str = message2;
                }
                failed = new HatchLinkOrderResult.Failed(str, HatchLinkOrderSubmitError.GENERIC);
            }
            if (i == 0) {
                Hwg.A00(obj);
                HatchLinkOrderRepository hatchLinkOrderRepository = HatchLinkOrderRepository.INSTANCE;
                SubscriptionDetailsState value = HatchLinkOrderViewModel.this.entrySubscriptionState;
                if (value == null) {
                    value = AuraSubscriptionRepository.Companion.getInstance(HatchLinkOrderViewModel.this.userSession).subscriptionDetailsState.getValue();
                }
                HatchLinkOrderInput hatchLinkOrderInput = HatchLinkOrderViewModel.this._state.getValue().input;
                this.label = 1;
                obj = hatchLinkOrderRepository.createOrder(value, hatchLinkOrderInput, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    failed = (HatchLinkOrderResult) obj;
                    HatchLinkOrderViewModel.this.onEvent(new HatchLinkOrderEvent.SubmitFinished(failed));
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            failed2 = (HatchLinkOrderResult) obj;
            HatchLinkOrderLogger.INSTANCE.logSubmitResult(failed2);
            if (failed2 instanceof HatchLinkOrderResult.Success) {
                AuraSubscriptionRepository.Companion.getInstance(HatchLinkOrderViewModel.this.userSession).notifyHomeLinkOrderPlaced();
            }
            HatchLinkOrderViewModel$submit$1$result$1 hatchLinkOrderViewModel$submit$1$result$1 = new HatchLinkOrderViewModel$submit$1$result$1(HatchLinkOrderRepository.INSTANCE);
            this.L$0 = null;
            this.label = 2;
            obj = HatchLinkOrderStatusResolverKt.resolveCreatedOrderStatus(failed2, hatchLinkOrderViewModel$submit$1$result$1, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
            failed = (HatchLinkOrderResult) obj;
            HatchLinkOrderViewModel.this.onEvent(new HatchLinkOrderEvent.SubmitFinished(failed));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchLinkOrderViewModel(AbstractC3358CGz abstractC3358CGz, HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint) {
        boolean z = false;
        boolean zA1a = AnonymousClass002.A1a(abstractC3358CGz, hatchLinkOrderEntryPoint);
        this.userSession = abstractC3358CGz;
        this.entryPoint = hatchLinkOrderEntryPoint;
        boolean zA1Z = AnonymousClass002.A1Z(hatchLinkOrderEntryPoint, HatchLinkOrderEntryPoint.POST_PURCHASE);
        this.isPostPurchase = zA1Z;
        C9286GCn c9286GCnA14 = C3cG.A14(new HatchLinkOrderFormState(zA1Z ? new HatchLinkPostPurchaseState(HatchLinkSubscriptionActivation.WAITING, false, HatchLinkOrderDetailsPreparation.NOT_STARTED) : null, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, !zA1Z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 261118, 0 == true ? 1 : 0));
        this._state = c9286GCnA14;
        this.state = C3cG.A11(c9286GCnA14);
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, zA1a ? 1 : 0);
        this._dismiss = c9290GCr;
        this.dismiss = new C3pd(c9290GCr);
        this.hasLoggedExit = new AtomicBoolean(false);
        if (zA1Z) {
            observeSubscriptionActivation();
        } else {
            checkEligibility();
        }
    }

    public final void onAddressQueryChange(String str) {
        C7384Etj.A0Y(str, 0);
        HtJ htJA13 = AnonymousClass006.A13(this.addressSuggestionsJob);
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() < 3) {
            setAddressSuggestions(AHI.A01);
        } else {
            this.addressSuggestionsJob = AnonymousClass001.A11(new C115971(strA0l, htJA13), AEu.A00(this));
        }
    }

    public final void onEvent(HatchLinkOrderEvent hatchLinkOrderEvent) {
        C7384Etj.A0Y(hatchLinkOrderEvent, 0);
        if ((hatchLinkOrderEvent instanceof HatchLinkOrderEvent.AddAddressPressed) || (hatchLinkOrderEvent instanceof HatchLinkOrderEvent.SaveAddressPressed) || (hatchLinkOrderEvent instanceof HatchLinkOrderEvent.BackPressed)) {
            clearAddressSuggestions();
        }
        HatchLinkOrderEffect hatchLinkOrderEffectReduceAtomically = reduceAtomically(hatchLinkOrderEvent);
        if (C7384Etj.areEqual(hatchLinkOrderEffectReduceAtomically, HatchLinkOrderEffect.PrepareDetails.INSTANCE)) {
            onEvent(new HatchLinkOrderEvent.DetailsPrepared(HatchLinkOrderRepository.INSTANCE.blockReason(this.userSession)));
            return;
        }
        if (C7384Etj.areEqual(hatchLinkOrderEffectReduceAtomically, HatchLinkOrderEffect.LoadSavedDetails.INSTANCE)) {
            loadSavedDetails();
            return;
        }
        if (C7384Etj.areEqual(hatchLinkOrderEffectReduceAtomically, HatchLinkOrderEffect.Submit.INSTANCE)) {
            submit();
        } else if (C7384Etj.areEqual(hatchLinkOrderEffectReduceAtomically, HatchLinkOrderEffect.Dismiss.INSTANCE)) {
            this._dismiss.AhV(Unit.INSTANCE);
        } else if (hatchLinkOrderEffectReduceAtomically != null) {
            throw C3cG.A0q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchFreshSubscriptionState(com.facebook.aura.subscription.repo.AuraSubscriptionRepository r7, X.HtJ<? super com.facebook.aura.subscription.repo.SubscriptionDetailsState> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel.C115941
            if (r0 == 0) goto L1f
            r5 = r8
            com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$fetchFreshSubscriptionState$1 r5 = (com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel.C115941) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L25
            goto L3d
        L1f:
            com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$fetchFreshSubscriptionState$1 r5 = new com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$fetchFreshSubscriptionState$1
            r5.<init>(r8)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r4)
            com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$fetchFreshSubscriptionState$2 r0 = new com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$fetchFreshSubscriptionState$2     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> L4c
            r0.<init>(r7, r3)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> L4c
            r5.L$0 = r3     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> L4c
            r5.label = r1     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> L4c
            java.lang.Object r4 = X.C8j4.A0s(r0, r5)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> L4c
            if (r4 != r2) goto L40
            return r2
        L3d:
            X.Hwg.A00(r4)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> L4c
        L40:
            com.facebook.aura.subscription.repo.SubscriptionDetailsState r4 = (com.facebook.aura.subscription.repo.SubscriptionDetailsState) r4     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> L4c
            return r4
        L43:
            r2 = move-exception
            java.lang.String r1 = "Subscription fetch failed; checking eligibility against the cache"
            java.lang.String r0 = "HatchLinkOrderViewModel"
            X.CFK.A0A(r0, r1, r2)
            return r3
        L4c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel.fetchFreshSubscriptionState(com.facebook.aura.subscription.repo.AuraSubscriptionRepository, X.HtJ):java.lang.Object");
    }

    private final void observeSubscriptionActivation() {
        AuraSubscriptionRepository companion = AuraSubscriptionRepository.Companion.getInstance(this.userSession);
        AnonymousClass001.A1J(new C115961(companion, this, null), AEu.A00(this));
    }

    private final HatchLinkOrderEffect reduceAtomically(HatchLinkOrderEvent hatchLinkOrderEvent) {
        HatchLinkOrderFormState value;
        HatchLinkOrderTransition hatchLinkOrderTransitionReduce;
        do {
            value = this._state.getValue();
            hatchLinkOrderTransitionReduce = HatchLinkOrderStateMachine.INSTANCE.reduce(value, hatchLinkOrderEvent);
        } while (!this._state.A6e(value, hatchLinkOrderTransitionReduce.state));
        if (C7384Etj.areEqual(hatchLinkOrderTransitionReduce.effect, HatchLinkOrderEffect.Submit.INSTANCE)) {
            HatchLinkOrderLogger.INSTANCE.logSubmit();
        } else if ((hatchLinkOrderEvent instanceof HatchLinkOrderEvent.SubmitPressed) && value.step == HatchLinkOrderStep.DETAILS && !hatchLinkOrderTransitionReduce.state.invalidFields.isEmpty()) {
            HatchLinkOrderLogger.INSTANCE.logValidationFailure();
        } else if (C7384Etj.areEqual(hatchLinkOrderTransitionReduce.effect, HatchLinkOrderEffect.Dismiss.INSTANCE)) {
            logExit();
        }
        return hatchLinkOrderTransitionReduce.effect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAddressSuggestions(AHD<HatchAddressSuggestion> ahd) {
        HatchLinkOrderFormState value;
        BLG<HatchLinkOrderFormState> blg = this._state;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchLinkOrderFormState.copy$default(value, null, null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, null, ahd, 131071, null)));
    }

    public final void clearAddressSuggestions() {
        this.addressSuggestionsJob = C3cI.A15(this.addressSuggestionsJob);
        setAddressSuggestions(AHI.A01);
    }

    public final boolean consumeActivationTimeout() {
        HatchLinkOrderFormState value;
        HatchLinkPostPurchaseState hatchLinkPostPurchaseState;
        do {
            value = this._state.getValue();
            hatchLinkPostPurchaseState = value.postPurchase;
            if ((hatchLinkPostPurchaseState != null ? hatchLinkPostPurchaseState.activation : null) != HatchLinkSubscriptionActivation.TIMED_OUT) {
                return false;
            }
        } while (!this._state.A6e(value, HatchLinkOrderFormState.copy$default(value, hatchLinkPostPurchaseState.copy(HatchLinkSubscriptionActivation.TIMEOUT_HANDLED, hatchLinkPostPurchaseState.continueRequested, hatchLinkPostPurchaseState.detailsPreparation), null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, null, null, 262142, null)));
        return true;
    }

    public final C22I<Unit> getDismiss() {
        return this.dismiss;
    }

    public final C1BN<HatchLinkOrderFormState> getState() {
        return this.state;
    }

    public final void logExit() {
        HatchLinkOrderFormState value = this._state.getValue();
        if (value.step != HatchLinkOrderStep.CONFIRMED) {
            boolean z = false;
            if (this.hasLoggedExit.compareAndSet(false, true)) {
                HatchLinkOrderLogger hatchLinkOrderLogger = HatchLinkOrderLogger.INSTANCE;
                if (value.blockReason != null && !value.offersPlans) {
                    z = true;
                }
                hatchLinkOrderLogger.logExit(z);
            }
        }
    }

    private final void checkEligibility() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }

    private final void loadSavedDetails() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C115951(null), AEu.A00(this));
    }

    private final void submit() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C115981(null), AEu.A00(this));
    }
}
