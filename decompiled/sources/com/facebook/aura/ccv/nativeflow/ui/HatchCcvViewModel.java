package com.facebook.aura.ccv.nativeflow.ui;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0885AGm;
import X.AbstractC10623Hzj;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFI;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C20Q;
import X.C22I;
import X.C27k;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.GCV;
import X.HtJ;
import X.Hu1;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.HzR;
import android.content.Context;
import com.facebook.aura.ageverification.intf.AgeCheckFailure;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.ageverification.intf.AgeCheckResult;
import com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient;
import com.facebook.aura.ccv.nativeflow.HatchCardFieldError;
import com.facebook.aura.ccv.nativeflow.HatchCardFormattingKt;
import com.facebook.aura.ccv.nativeflow.HatchCardValidationKt;
import com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig;
import com.facebook.aura.ccv.nativeflow.HatchCcvCountryOptions;
import com.facebook.aura.ccv.nativeflow.HatchCcvError;
import com.facebook.aura.ccv.nativeflow.HatchCcvResult;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutCharge;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClient;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutSession;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutStartResult;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutUnavailableReason;
import com.facebook.aura.ccv.nativeflow.HatchLinkingOptions;
import com.facebook.aura.ccv.nativeflow.HatchPostalValidationRule;
import com.facebook.aura.ccv.nativeflow.HatchThreeDSChallengeResult;
import com.facebook.aura.ccv.nativeflow.HatchThreeDSStepUp;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewEffect;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.payments.cardvalidation.HatchCardFieldFormat;
import com.facebook.aura.payments.cardvalidation.HatchCardNetwork;
import com.facebook.aura.payments.cardvalidation.HatchCardNetworkKt;
import com.facebook.aura.qpl.module.MC;
import com.facebook.aura.user.provider.AgeCheckMethod;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchCcvViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<HatchCcvUiState> _uiState;
    public final HzR<Unit> _verified;
    public final C3Em<HatchCcvViewEffect> _viewEffect;
    public final HatchCheckoutClient checkoutClient;
    public final AtomicReference<PendingThreeDSChallenge> pendingThreeDSChallenge;
    public volatile C27k<HatchCheckoutSession> sessionDeferred;
    public final C1BN<HatchCcvUiState> uiState;
    public final C20Q<Unit> verified;
    public final C22I<HatchCcvViewEffect> viewEffect;

    public final class Factory extends AuraViewModelFactory<HatchCcvViewModel> {
        public static final int $stable = 8;
        public final Context context;

        public Factory(Context context) {
            C7384Etj.A0Y(context, 0);
            this.context = context;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchCcvViewModel create() {
            return new HatchCcvViewModel(new HatchCheckoutClient(AnonymousClass001.A0I(this.context)));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel", f = "HatchCcvViewModel.kt", l = {187, 191}, m = "awaitCheckoutSession", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel$awaitCheckoutSession$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCcvViewModel.this.awaitCheckoutSession(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel$fetchLinkingOptions$1", f = "HatchCcvViewModel.kt", l = {203}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel$fetchLinkingOptions$1, reason: invalid class name and case insensitive filesystem */
    public final class C110371 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C110371(HtJ<? super C110371> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCcvViewModel.this.new C110371(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchCcvViewModel.this.new C110371(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAgeConfirmationLinkingClient hatchAgeConfirmationLinkingClient = HatchAgeConfirmationLinkingClient.INSTANCE;
                this.label = 1;
                obj = hatchAgeConfirmationLinkingClient.fetchLinkingOptions(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchLinkingOptions hatchLinkingOptions = (HatchLinkingOptions) obj;
            if (hatchLinkingOptions != null) {
                HatchCcvViewModel.this.applyOptions(hatchLinkingOptions);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel$fetchLinkingOptionsAndStartCheckout$1", f = "HatchCcvViewModel.kt", l = {93}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel$fetchLinkingOptionsAndStartCheckout$1, reason: invalid class name and case insensitive filesystem */
    public final class C110381 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C110381(HtJ<? super C110381> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCcvViewModel.this.new C110381(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchCcvViewModel.this.new C110381(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAgeConfirmationLinkingClient hatchAgeConfirmationLinkingClient = HatchAgeConfirmationLinkingClient.INSTANCE;
                this.label = 1;
                obj = hatchAgeConfirmationLinkingClient.fetchLinkingOptions(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchLinkingOptions hatchLinkingOptions = (HatchLinkingOptions) obj;
            if (hatchLinkingOptions != null) {
                HatchCcvViewModel.this.applyOptions(hatchLinkingOptions);
            }
            if (HatchCcvViewModel.this.sessionDeferred == null) {
                HatchCcvViewModel.this.startCheckout();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel$finishThreeDSChallenge$1", f = "HatchCcvViewModel.kt", l = {550}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel$finishThreeDSChallenge$1, reason: invalid class name and case insensitive filesystem */
    public final class C110391 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ PendingThreeDSChallenge $challenge;
        public final /* synthetic */ HatchCcvResult.ThreeDSStepUpRequired $stepUpRequired;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110391(HatchCcvResult.ThreeDSStepUpRequired threeDSStepUpRequired, PendingThreeDSChallenge pendingThreeDSChallenge, HtJ<? super C110391> htJ) {
            super(2, htJ);
            this.$stepUpRequired = threeDSStepUpRequired;
            this.$challenge = pendingThreeDSChallenge;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCcvViewModel.this.new C110391(this.$stepUpRequired, this.$challenge, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchCcvViewModel hatchCcvViewModel;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                hatchCcvViewModel = HatchCcvViewModel.this;
                HatchCheckoutClient hatchCheckoutClient = hatchCcvViewModel.checkoutClient;
                HatchCheckoutCharge hatchCheckoutCharge = this.$stepUpRequired.charge;
                this.L$0 = hatchCcvViewModel;
                this.label = 1;
                obj = hatchCheckoutClient.finalizeAfterChallenge(hatchCheckoutCharge, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                hatchCcvViewModel = (HatchCcvViewModel) this.L$0;
                Hwg.A00(obj);
            }
            PendingThreeDSChallenge pendingThreeDSChallenge = this.$challenge;
            hatchCcvViewModel.onCheckoutResult((HatchCcvResult) obj, pendingThreeDSChallenge.uplSessionId, pendingThreeDSChallenge.billingCountry);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C110391) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel$startCheckout$1", f = "HatchCcvViewModel.kt", l = {104}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel$startCheckout$1, reason: invalid class name and case insensitive filesystem */
    public final class C110401 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchCheckoutSession>, Object> {
        public int label;

        public C110401(HtJ<? super C110401> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCcvViewModel.this.new C110401(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchCheckoutSession> htJ) {
            return HatchCcvViewModel.this.new C110401(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchCcvUiState value;
            HatchCcvUiState value2;
            HatchCcvUiState value3;
            HatchCcvUiState value4;
            HatchCcvUiState value5;
            Object objStartCheckout = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objStartCheckout);
                HatchCheckoutClient hatchCheckoutClient = HatchCcvViewModel.this.checkoutClient;
                this.label = 1;
                objStartCheckout = hatchCheckoutClient.startCheckout(this);
                if (objStartCheckout == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objStartCheckout);
            }
            HatchCheckoutStartResult hatchCheckoutStartResult = (HatchCheckoutStartResult) objStartCheckout;
            if (!(hatchCheckoutStartResult instanceof HatchCheckoutStartResult.Opened)) {
                if (!(hatchCheckoutStartResult instanceof HatchCheckoutStartResult.Failed)) {
                    throw C3cG.A0q();
                }
                CFK.A04(HatchCcvViewModelKt.TAG, "checkout/init did not open");
                HatchCcvViewModel.this._viewEffect.AhV(new HatchCcvViewEffect.CheckoutUnavailable(((HatchCheckoutStartResult.Failed) hatchCheckoutStartResult).reason));
                BLG<HatchCcvUiState> blg = HatchCcvViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, HatchCcvUiState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, HatchCcvCheckoutPhase.UNAVAILABLE, null, null, null, null, null, 264241151, null)));
                return null;
            }
            HatchCheckoutSession hatchCheckoutSession = ((HatchCheckoutStartResult.Opened) hatchCheckoutStartResult).session;
            HatchCcvViewModel.this.applySupportedCardTypes(hatchCheckoutSession.supportedCardTypes);
            HatchCcvViewModel.this.applyScreenContent(hatchCheckoutSession.screenTitle, hatchCheckoutSession.screenSubtitle);
            HatchCcvCountryOptions hatchCcvCountryOptions = hatchCheckoutSession.countryOptions;
            if (hatchCcvCountryOptions == null) {
                CFK.A04(HatchCcvViewModelKt.TAG, "checkout/init opened without a usable country configuration");
                HatchCcvLogging.INSTANCE.logFormConfigMissing(hatchCheckoutSession.uplSessionId);
                HatchCcvViewModel.this._viewEffect.AhV(new HatchCcvViewEffect.CheckoutUnavailable(HatchCheckoutUnavailableReason.SERVER_ERROR));
                BLG<HatchCcvUiState> blg2 = HatchCcvViewModel.this._uiState;
                do {
                    value5 = blg2.getValue();
                } while (!blg2.A6e(value5, HatchCcvUiState.copy$default(value5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, HatchCcvCheckoutPhase.UNAVAILABLE, null, null, null, null, null, 264241151, null)));
                return null;
            }
            HatchCcvViewModel.this.applyCountryOptions(hatchCcvCountryOptions);
            String str = hatchCheckoutSession.amount;
            String str2 = hatchCheckoutSession.currency;
            if (str == null || str2 == null) {
                CFK.A04(HatchCcvViewModelKt.TAG, "checkout/init opened without a charge amount");
                HatchCcvViewModel.this._viewEffect.AhV(new HatchCcvViewEffect.CheckoutUnavailable(HatchCheckoutUnavailableReason.NO_AMOUNT));
                BLG<HatchCcvUiState> blg3 = HatchCcvViewModel.this._uiState;
                do {
                    value2 = blg3.getValue();
                } while (!blg3.A6e(value2, HatchCcvUiState.copy$default(value2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, HatchCcvCheckoutPhase.UNAVAILABLE, null, null, null, null, null, 264241151, null)));
                return null;
            }
            BLG<HatchCcvUiState> blg4 = HatchCcvViewModel.this._uiState;
            do {
                value3 = blg4.getValue();
            } while (!blg4.A6e(value3, HatchCcvUiState.copy$default(value3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, str2, null, null, false, null, false, false, null, null, null, null, null, null, 268386303, null)));
            HatchCcvLogging.INSTANCE.logFormConfig(hatchCcvCountryOptions, hatchCheckoutSession.uplSessionId);
            BLG<HatchCcvUiState> blg5 = HatchCcvViewModel.this._uiState;
            do {
                value4 = blg5.getValue();
            } while (!blg5.A6e(value4, HatchCcvUiState.copy$default(value4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, HatchCcvCheckoutPhase.READY, null, null, null, null, null, 264241151, null)));
            return hatchCheckoutSession;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel$submitCard$2", f = "HatchCcvViewModel.kt", l = {393, MC.mwa_qpl_metadata.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel$submitCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchCcvUiState $state;
        public final /* synthetic */ HxE<String, String> $wireExpiry;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchCcvUiState hatchCcvUiState, HxE<String, String> hxE, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$state = hatchCcvUiState;
            this.$wireExpiry = hxE;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCcvViewModel.this.new AnonymousClass2(this.$state, this.$wireExpiry, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchCheckoutSession hatchCheckoutSession;
            HatchCcvUiState value;
            HatchCcvUiState value2;
            HatchCcvUiState value3;
            Object objAwaitCheckoutSession = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objAwaitCheckoutSession);
                HatchCcvViewModel hatchCcvViewModel = HatchCcvViewModel.this;
                this.label = 1;
                objAwaitCheckoutSession = hatchCcvViewModel.awaitCheckoutSession(this);
                if (objAwaitCheckoutSession == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    value = (HatchCcvUiState) this.L$1;
                    hatchCheckoutSession = (HatchCheckoutSession) this.L$0;
                    Hwg.A00(objAwaitCheckoutSession);
                    HatchCcvViewModel.this.onCheckoutResult((HatchCcvResult) objAwaitCheckoutSession, hatchCheckoutSession.uplSessionId, value.billingCountry);
                    return Unit.INSTANCE;
                }
                Hwg.A00(objAwaitCheckoutSession);
            }
            hatchCheckoutSession = (HatchCheckoutSession) objAwaitCheckoutSession;
            if (hatchCheckoutSession == null) {
                AgeCheckFunnelLogging.INSTANCE.attemptResult(AgeCheckMethod.CREDIT_CARD, AgeCheckResult.ERROR, AgeCheckFailure.CHECKOUT_UNAVAILABLE, null, null);
                BLG<HatchCcvUiState> blg = HatchCcvViewModel.this._uiState;
                do {
                    value3 = blg.getValue();
                } while (!blg.A6e(value3, HatchCcvUiState.copy$default(value3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, HatchCcvError.CHECKOUT_INIT, null, null, null, null, 257949695, null)));
            } else {
                value = HatchCcvViewModel.this._uiState.getValue();
                HxE<HatchCardFieldError, HatchPostalValidationRule> hxEValidatePostalField = HatchCardValidationKt.validatePostalField(value.zip, value.postalField);
                HatchCardFieldError hatchCardFieldError = hxEValidatePostalField.first;
                HatchPostalValidationRule hatchPostalValidationRule = hxEValidatePostalField.second;
                if (hatchCardFieldError == null && hatchPostalValidationRule == null) {
                    String str = hatchCheckoutSession.amount;
                    String str2 = hatchCheckoutSession.currency;
                    if (str == null || str2 == null) {
                        str = value.chargeAmount;
                        str2 = value.chargeCurrency;
                    }
                    AgeCheckFunnelLogging.INSTANCE.attemptSubmitted(AgeCheckMethod.CREDIT_CARD, hatchCheckoutSession.uplSessionId);
                    HatchCheckoutClient hatchCheckoutClient = HatchCcvViewModel.this.checkoutClient;
                    String strDigitsOnly = HatchCardNetworkKt.digitsOnly(this.$state.cardNumber);
                    String str3 = this.$state.securityCode;
                    HxE<String, String> hxE = this.$wireExpiry;
                    String str4 = hxE.first;
                    String str5 = hxE.second;
                    String str6 = value.zip;
                    String str7 = value.billingCountry;
                    this.L$0 = hatchCheckoutSession;
                    this.L$1 = value;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.label = 2;
                    objAwaitCheckoutSession = hatchCheckoutClient.submitCard(hatchCheckoutSession, strDigitsOnly, str3, str4, str5, str6, str7, str, str2, this);
                    if (objAwaitCheckoutSession == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    HatchCcvViewModel.this.onCheckoutResult((HatchCcvResult) objAwaitCheckoutSession, hatchCheckoutSession.uplSessionId, value.billingCountry);
                } else {
                    HatchCcvLogging.INSTANCE.logValidationRejected(value.billingCountry, AbstractC0885AGm.A0z(hatchCardFieldError), hatchPostalValidationRule);
                    BLG<HatchCcvUiState> blg2 = HatchCcvViewModel.this._uiState;
                    do {
                        value2 = blg2.getValue();
                    } while (!blg2.A6e(value2, HatchCcvUiState.copy$default(value2, null, null, null, null, null, null, null, null, null, null, hatchCardFieldError, hatchPostalValidationRule != null ? hatchPostalValidationRule.errorMessage : null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 266335231, null)));
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchCcvViewModel(HatchCheckoutClient hatchCheckoutClient) {
        C7384Etj.A0Y(hatchCheckoutClient, 0);
        this.checkoutClient = hatchCheckoutClient;
        C9286GCn c9286GCnA14 = C3cG.A14(new HatchCcvUiState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 268435455, null));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        Integer num = C79.A00;
        C9290GCr c9290GCrA12 = C3cG.A12(num, 0, 1);
        this._viewEffect = c9290GCrA12;
        this.viewEffect = C3pd.A00(c9290GCrA12);
        GCV gcvA00 = AbstractC10623Hzj.A00(num, -1);
        this._verified = gcvA00;
        this.verified = Hu1.A01(gcvA00);
        this.pendingThreeDSChallenge = new AtomicReference<>(null);
        fetchLinkingOptionsAndStartCheckout();
    }

    public final void onBillingCountrySelected(String str) {
        HatchCcvUiState value;
        HatchCcvUiState hatchCcvUiStateWithSubmitEnabled;
        Object next;
        C7384Etj.A0Y(str, 0);
        HatchCcvLogging.INSTANCE.logCountrySelected(str);
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchCcvUiStateWithSubmitEnabled = value;
            if (!str.equals(hatchCcvUiStateWithSubmitEnabled.billingCountry)) {
                Iterator it = hatchCcvUiStateWithSubmitEnabled.countries.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (str.equals(((HatchCcvCountryConfig) next).country)) {
                            break;
                        }
                    }
                }
                HatchCcvCountryConfig hatchCcvCountryConfig = (HatchCcvCountryConfig) next;
                hatchCcvUiStateWithSubmitEnabled = withSubmitEnabled(HatchCcvUiState.copy$default(hatchCcvUiStateWithSubmitEnabled, null, null, null, "", null, null, null, null, null, null, null, null, null, null, null, null, str, null, false, hatchCcvCountryConfig != null ? hatchCcvCountryConfig.postalField : null, false, false, null, null, null, null, null, null, 267842551, null));
            }
        } while (!blg.A6e(value, hatchCcvUiStateWithSubmitEnabled));
    }

    public final void onCardNumberChange(String str) {
        HatchCcvUiState value;
        HatchCcvUiState hatchCcvUiState;
        C7384Etj.A0Y(str, 0);
        HatchCardFieldFormat hatchCardFieldFormat = HatchCardFieldFormat.INSTANCE;
        String strNumber = hatchCardFieldFormat.number(str);
        HatchCardNetwork hatchCardNetworkForDigits = HatchCardNetwork.Companion.forDigits(HatchCardNetworkKt.digitsOnly(strNumber));
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchCcvUiState = value;
        } while (!blg.A6e(value, withSubmitEnabled(HatchCcvUiState.copy$default(hatchCcvUiState, strNumber, null, hatchCardFieldFormat.securityCode(hatchCcvUiState.securityCode, strNumber), null, hatchCardNetworkForDigits, null, null, HatchCardValidationKt.unsupportedBrandError(HatchCardNetworkKt.digitsOnly(strNumber), hatchCcvUiState.supportedCardTypes), null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 209714538, null))));
    }

    public final void onExpiryChange(String str) {
        HatchCcvUiState value;
        HatchCcvUiState hatchCcvUiState;
        C7384Etj.A0Y(str, 0);
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchCcvUiState = value;
        } while (!blg.A6e(value, withSubmitEnabled(HatchCcvUiState.copy$default(hatchCcvUiState, null, HatchCardFieldFormat.INSTANCE.expiration(str, hatchCcvUiState.expiry), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 209714941, null))));
    }

    public final void onSecurityCodeChange(String str) {
        HatchCcvUiState value;
        HatchCcvUiState hatchCcvUiState;
        C7384Etj.A0Y(str, 0);
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchCcvUiState = value;
        } while (!blg.A6e(value, withSubmitEnabled(HatchCcvUiState.copy$default(hatchCcvUiState, null, null, HatchCardFieldFormat.INSTANCE.securityCode(str, hatchCcvUiState.cardNumber), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 209714683, null))));
    }

    public final void onThreeDSChallengeFinished(HatchThreeDSChallengeResult hatchThreeDSChallengeResult) {
        HatchCcvUiState value;
        C7384Etj.A0Y(hatchThreeDSChallengeResult, 0);
        PendingThreeDSChallenge andSet = this.pendingThreeDSChallenge.getAndSet(null);
        if (andSet != null) {
            BLG<HatchCcvUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchCcvUiState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 134217727, null)));
            finishThreeDSChallenge(andSet, hatchThreeDSChallengeResult);
        }
    }

    public final void onZipChange(String str) {
        HatchCcvUiState value;
        HatchCcvUiState hatchCcvUiState;
        C7384Etj.A0Y(str, 0);
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchCcvUiState = value;
        } while (!blg.A6e(value, withSubmitEnabled(HatchCcvUiState.copy$default(hatchCcvUiState, null, null, null, HatchCardFormattingKt.formatZip(str, hatchCcvUiState.billingCountry), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 209712119, null))));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HatchCcvError.values().length];
            try {
                AnonymousClass005.A0v(HatchCcvError.CARD_SAVE, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchCcvError.THREE_DS_STEP_UP, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(HatchCcvError.CHECKOUT_INIT, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(HatchCcvError.ENCRYPTION_KEY, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(HatchCcvError.PTT_GENERATION, iArr, 5);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(HatchCcvError.FINALIZE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchThreeDSChallengeResult.values().length];
            try {
                AnonymousClass005.A0v(HatchThreeDSChallengeResult.AUTHENTICATED, iArr2, 1);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(HatchThreeDSChallengeResult.AUTH_FAILED, iArr2, 2);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass005.A0v(HatchThreeDSChallengeResult.DISMISSED, iArr2, 3);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(HatchThreeDSChallengeResult.INVALID_URL, iArr2, 4);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass005.A0v(HatchThreeDSChallengeResult.NOT_PRESENTED, iArr2, 5);
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyCountryOptions(HatchCcvCountryOptions hatchCcvCountryOptions) {
        HatchCcvUiState value;
        HatchCcvUiState hatchCcvUiState;
        AHD<HatchCcvCountryConfig> ahd;
        boolean zIsCountrySelectable;
        HatchCcvCountryConfig hatchCcvCountryConfigConfigFor;
        String str = hatchCcvCountryOptions.defaultCountry;
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchCcvUiState = value;
            ahd = hatchCcvCountryOptions.countries;
            zIsCountrySelectable = hatchCcvCountryOptions.isCountrySelectable();
            hatchCcvCountryConfigConfigFor = hatchCcvCountryOptions.configFor(str);
        } while (!blg.A6e(value, withSubmitEnabled(HatchCcvUiState.copy$default(hatchCcvUiState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, ahd, zIsCountrySelectable, hatchCcvCountryConfigConfigFor != null ? hatchCcvCountryConfigConfigFor.postalField : null, false, false, null, null, null, null, null, null, 267452415, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyOptions(HatchLinkingOptions hatchLinkingOptions) {
        HatchCcvUiState value;
        HatchCcvUiState hatchCcvUiState;
        AHD ahdA07;
        String str;
        String str2;
        String str3;
        String str4;
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchCcvUiState = value;
            ahdA07 = AGI.A07(hatchLinkingOptions.accountTypes);
            str = hatchLinkingOptions.screenTitle;
            if (str == null) {
                str = hatchCcvUiState.screenTitle;
            }
            str2 = hatchLinkingOptions.screenSubtitle;
            if (str2 == null) {
                str2 = hatchCcvUiState.screenSubtitle;
            }
            str3 = hatchLinkingOptions.chargeAmount;
            if (str3 == null) {
                str3 = hatchCcvUiState.chargeAmount;
            }
            str4 = hatchLinkingOptions.chargeCurrency;
            if (str4 == null) {
                str4 = hatchCcvUiState.chargeCurrency;
            }
        } while (!blg.A6e(value, withSubmitEnabled(HatchCcvUiState.copy$default(hatchCcvUiState, null, null, null, null, null, null, null, null, null, null, null, null, str, str2, str3, str4, null, null, false, null, false, false, null, null, null, null, ahdA07, null, 201265151, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyScreenContent(String str, String str2) {
        HatchCcvUiState value;
        HatchCcvUiState hatchCcvUiState;
        if (str == null && str2 == null) {
            return;
        }
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchCcvUiState = value;
        } while (!blg.A6e(value, HatchCcvUiState.copy$default(hatchCcvUiState, null, null, null, null, null, null, null, null, null, null, null, null, str == null ? hatchCcvUiState.screenTitle : str, str2 == null ? hatchCcvUiState.screenSubtitle : str2, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 268423167, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySupportedCardTypes(List<String> list) {
        HatchCcvUiState value;
        HatchCcvUiState hatchCcvUiState;
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchCcvUiState = value;
        } while (!blg.A6e(value, withSubmitEnabled(HatchCcvUiState.copy$default(HatchCcvUiState.copy$default(hatchCcvUiState, null, null, null, null, null, AGI.A07(list), AGI.A07(HatchCardNetwork.Companion.acceptedNetworks(list)), null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 268435359, null), null, null, null, null, null, null, null, HatchCardValidationKt.unsupportedBrandError(HatchCardNetworkKt.digitsOnly(hatchCcvUiState.cardNumber), list), null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 268435327, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitCheckoutSession(X.HtJ<? super com.facebook.aura.ccv.nativeflow.HatchCheckoutSession> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel.AnonymousClass1
            if (r0 == 0) goto L4a
            r5 = r7
            com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel$awaitCheckoutSession$1 r5 = (com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r3 = r5.label
            r2 = 2
            r1 = 1
            if (r3 == 0) goto L24
            if (r3 == r1) goto L34
            if (r3 != r2) goto L50
            X.Hwg.A00(r0)
        L23:
            return r0
        L24:
            X.Hwg.A00(r0)
            X.27k<com.facebook.aura.ccv.nativeflow.HatchCheckoutSession> r0 = r6.sessionDeferred
            if (r0 == 0) goto L3a
            r5.label = r1
            java.lang.Object r0 = X.C3cG.A0W(r0, r5)
            if (r0 != r4) goto L37
            return r4
        L34:
            X.Hwg.A00(r0)
        L37:
            if (r0 == 0) goto L3a
            return r0
        L3a:
            r6.startCheckout()
            X.27k<com.facebook.aura.ccv.nativeflow.HatchCheckoutSession> r0 = r6.sessionDeferred
            if (r0 == 0) goto L55
            r5.label = r2
            java.lang.Object r0 = X.C3cG.A0W(r0, r5)
            if (r0 != r4) goto L23
            return r4
        L4a:
            com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel$awaitCheckoutSession$1 r5 = new com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel$awaitCheckoutSession$1
            r5.<init>(r7)
            goto L12
        L50:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L55:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.ui.HatchCcvViewModel.awaitCheckoutSession(X.HtJ):java.lang.Object");
    }

    private final void clearCardFields() {
        HatchCcvUiState value;
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchCcvUiState.copy$default(value, "", null, "", null, HatchCardNetwork.UNKNOWN, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 267386858, null)));
    }

    private final void finishThreeDSChallenge(PendingThreeDSChallenge pendingThreeDSChallenge, HatchThreeDSChallengeResult hatchThreeDSChallengeResult) {
        HatchCcvResult.ThreeDSStepUpRequired threeDSStepUpRequired = pendingThreeDSChallenge.stepUpRequired;
        HatchCcvLogging.INSTANCE.logThreeDSStepUpOutcome(hatchThreeDSChallengeResult, pendingThreeDSChallenge.uplSessionId, pendingThreeDSChallenge.billingCountry);
        int iOrdinal = hatchThreeDSChallengeResult.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C110391(threeDSStepUpRequired, pendingThreeDSChallenge, null), AEu.A00(this));
        } else {
            if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                throw C3cG.A0q();
            }
            onCheckoutResult(new HatchCcvResult.Failed(HatchCcvError.THREE_DS_STEP_UP, null, null), pendingThreeDSChallenge.uplSessionId, pendingThreeDSChallenge.billingCountry);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCheckoutResult(HatchCcvResult hatchCcvResult, String str, String str2) {
        HatchCcvUiState value;
        HatchCcvUiState value2;
        if (hatchCcvResult instanceof HatchCcvResult.Success) {
            AgeCheckFunnelLogging.INSTANCE.attemptResult(AgeCheckMethod.CREDIT_CARD, AgeCheckResult.VERIFIED, null, null, str);
        } else if (!(hatchCcvResult instanceof HatchCcvResult.Pending)) {
            if (hatchCcvResult instanceof HatchCcvResult.Failed) {
                HatchCcvResult.Failed failed = (HatchCcvResult.Failed) hatchCcvResult;
                logCardFailure(failed.error, str);
                BLG<HatchCcvUiState> blg = this._uiState;
                do {
                    value2 = blg.getValue();
                } while (!blg.A6e(value2, HatchCcvUiState.copy$default(value2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, failed.error, failed.serverTitle, failed.serverMessage, null, null, 207618047, null)));
                return;
            }
            if (hatchCcvResult instanceof HatchCcvResult.ThreeDSStepUpRequired) {
                startThreeDSChallenge(new PendingThreeDSChallenge((HatchCcvResult.ThreeDSStepUpRequired) hatchCcvResult, str, str2));
                return;
            } else {
                if (!C7384Etj.areEqual(hatchCcvResult, HatchCcvResult.InvalidThreeDSStepUp.INSTANCE)) {
                    throw C3cG.A0q();
                }
                HatchCcvLogging hatchCcvLogging = HatchCcvLogging.INSTANCE;
                hatchCcvLogging.logThreeDSStepUpAttempt(str, str2);
                hatchCcvLogging.logThreeDSStepUpOutcome(HatchThreeDSChallengeResult.INVALID_URL, str, str2);
                onCheckoutResult(new HatchCcvResult.Failed(HatchCcvError.THREE_DS_STEP_UP, null, null), str, str2);
                return;
            }
        }
        BLG<HatchCcvUiState> blg2 = this._uiState;
        do {
            value = blg2.getValue();
        } while (!blg2.A6e(value, HatchCcvUiState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 266338303, null)));
        clearCardFields();
        this._verified.AhZ(Unit.INSTANCE);
    }

    private final void startThreeDSChallenge(PendingThreeDSChallenge pendingThreeDSChallenge) {
        HatchCcvUiState value;
        HatchThreeDSStepUp hatchThreeDSStepUp = pendingThreeDSChallenge.stepUpRequired.stepUp;
        HatchCcvLogging.INSTANCE.logThreeDSStepUpAttempt(pendingThreeDSChallenge.uplSessionId, pendingThreeDSChallenge.billingCountry);
        this.pendingThreeDSChallenge.set(pendingThreeDSChallenge);
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchCcvUiState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, hatchThreeDSStepUp, 134217727, null)));
    }

    private final void submitCard() {
        HxE<String, String> hxEExpirationToWireParts;
        HatchCcvUiState value;
        HatchCcvUiState value2 = this._uiState.getValue();
        if (value2.isSubmitting || (hxEExpirationToWireParts = HatchCardFieldFormat.INSTANCE.expirationToWireParts(value2.expiry)) == null) {
            return;
        }
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchCcvUiState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, true, null, null, null, null, null, null, 207618047, null)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(value2, hxEExpirationToWireParts, null), AEu.A00(this));
    }

    private final HatchCcvUiState withSubmitEnabled(HatchCcvUiState hatchCcvUiState) {
        return HatchCcvUiState.copy$default(hatchCcvUiState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, HatchCardValidationKt.isCardFormComplete(hatchCcvUiState.cardNumber, hatchCcvUiState.expiry, hatchCcvUiState.securityCode, hatchCcvUiState.zip, hatchCcvUiState.postalField, hatchCcvUiState.supportedCardTypes), false, null, null, null, null, null, null, 267386879, null);
    }

    public final boolean canStartLinking() {
        return !this._uiState.getValue().isSubmitting;
    }

    public final C1BN<HatchCcvUiState> getUiState() {
        return this.uiState;
    }

    public final C20Q<Unit> getVerified() {
        return this.verified;
    }

    public final C22I<HatchCcvViewEffect> getViewEffect() {
        return this.viewEffect;
    }

    public final void onCardNumberBlur() {
        HatchCcvUiState value;
        HatchCcvUiState hatchCcvUiState;
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchCcvUiState = value;
        } while (!blg.A6e(value, HatchCcvUiState.copy$default(hatchCcvUiState, null, null, null, null, null, null, null, HatchCcvViewModelKt.nullIfEmptyField(HatchCardValidationKt.validatePan(hatchCcvUiState.cardNumber, hatchCcvUiState.supportedCardTypes)), null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 268435327, null)));
    }

    @Override // X.AEs
    public void onCleared() {
        PendingThreeDSChallenge andSet = this.pendingThreeDSChallenge.getAndSet(null);
        if (andSet != null) {
            HatchCcvLogging.INSTANCE.logThreeDSStepUpOutcome(HatchThreeDSChallengeResult.NOT_PRESENTED, andSet.uplSessionId, andSet.billingCountry);
        }
        AnonymousClass001.A1E(this._uiState, null, new HatchCcvUiState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 268435455, null));
    }

    public final void onExpiryBlur() {
        HatchCcvUiState value;
        HatchCcvUiState hatchCcvUiState;
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchCcvUiState = value;
        } while (!blg.A6e(value, HatchCcvUiState.copy$default(hatchCcvUiState, null, null, null, null, null, null, null, null, HatchCcvViewModelKt.nullIfEmptyField(HatchCardValidationKt.validateExpiry(hatchCcvUiState.expiry)), null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 268435199, null)));
    }

    public final void onFormHidden() {
        AgeCheckFunnelLogging.INSTANCE.attemptCancelled(AgeCheckMethod.CREDIT_CARD);
    }

    public final void onRetryCheckout() {
        HatchCcvUiState value;
        if (this._uiState.getValue().checkoutPhase == HatchCcvCheckoutPhase.UNAVAILABLE) {
            BLG<HatchCcvUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchCcvUiState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, HatchCcvCheckoutPhase.LOADING, null, null, null, null, null, 264241151, null)));
            this.sessionDeferred = null;
            startCheckout();
        }
    }

    public final void onSecurityCodeBlur() {
        HatchCcvUiState value;
        HatchCcvUiState hatchCcvUiState;
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchCcvUiState = value;
        } while (!blg.A6e(value, HatchCcvUiState.copy$default(hatchCcvUiState, null, null, null, null, null, null, null, null, null, HatchCcvViewModelKt.nullIfEmptyField(HatchCardValidationKt.validateSecurityCode(hatchCcvUiState.securityCode, hatchCcvUiState.cardNumber)), null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 268434943, null)));
    }

    public final void onSubmit() {
        HatchCcvUiState value;
        HatchCcvUiState value2 = this._uiState.getValue();
        if (value2.isSubmitting) {
            return;
        }
        HatchCardFieldError hatchCardFieldErrorValidatePan = HatchCardValidationKt.validatePan(value2.cardNumber, value2.supportedCardTypes);
        HatchCardFieldError hatchCardFieldErrorValidateExpiry = HatchCardValidationKt.validateExpiry(value2.expiry);
        HatchCardFieldError hatchCardFieldErrorValidateSecurityCode = HatchCardValidationKt.validateSecurityCode(value2.securityCode, value2.cardNumber);
        HxE<HatchCardFieldError, HatchPostalValidationRule> hxEValidatePostalField = HatchCardValidationKt.validatePostalField(value2.zip, value2.postalField);
        HatchCardFieldError hatchCardFieldError = hxEValidatePostalField.first;
        HatchPostalValidationRule hatchPostalValidationRule = hxEValidatePostalField.second;
        List<? extends HatchCardFieldError> listA0F = BFI.A0F(new HatchCardFieldError[]{hatchCardFieldErrorValidatePan, hatchCardFieldErrorValidateExpiry, hatchCardFieldErrorValidateSecurityCode, hatchCardFieldError});
        if (listA0F.isEmpty() && hatchPostalValidationRule == null) {
            AgeCheckFunnelLogging.INSTANCE.attemptStarted(AgeCheckMethod.CREDIT_CARD);
            submitCard();
        } else {
            HatchCcvLogging.INSTANCE.logValidationRejected(value2.billingCountry, listA0F, hatchPostalValidationRule);
            BLG<HatchCcvUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchCcvUiState.copy$default(value, null, null, null, null, null, null, null, hatchCardFieldErrorValidatePan, hatchCardFieldErrorValidateExpiry, hatchCardFieldErrorValidateSecurityCode, hatchCardFieldError, hatchPostalValidationRule != null ? hatchPostalValidationRule.errorMessage : null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 268431487, null)));
        }
    }

    public final void onSubmitErrorDismissed() {
        HatchCcvUiState value;
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchCcvUiState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 209715199, null)));
    }

    public final void onZipBlur() {
        HatchCcvUiState value;
        HatchCcvUiState hatchCcvUiState;
        HatchCardFieldError hatchCardFieldError;
        HatchPostalValidationRule hatchPostalValidationRule;
        BLG<HatchCcvUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchCcvUiState = value;
            HxE<HatchCardFieldError, HatchPostalValidationRule> hxEValidatePostalField = HatchCardValidationKt.validatePostalField(hatchCcvUiState.zip, hatchCcvUiState.postalField);
            hatchCardFieldError = hxEValidatePostalField.first;
            hatchPostalValidationRule = hxEValidatePostalField.second;
        } while (!blg.A6e(value, HatchCcvUiState.copy$default(hatchCcvUiState, null, null, null, null, null, null, null, null, null, null, hatchCardFieldError != null ? HatchCcvViewModelKt.nullIfEmptyField(hatchCardFieldError) : null, hatchPostalValidationRule != null ? hatchPostalValidationRule.errorMessage : null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, null, 268432383, null)));
    }

    private final void fetchLinkingOptionsAndStartCheckout() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C110381(null), AEu.A00(this));
    }

    private final void logCardFailure(HatchCcvError hatchCcvError, String str) {
        AgeCheckResult ageCheckResult;
        AgeCheckFailure ageCheckFailure;
        switch (hatchCcvError.ordinal()) {
            case 0:
                ageCheckResult = AgeCheckResult.ERROR;
                ageCheckFailure = AgeCheckFailure.CHECKOUT_UNAVAILABLE;
                break;
            case 1:
            case 2:
            case 4:
                ageCheckResult = AgeCheckResult.ERROR;
                ageCheckFailure = AgeCheckFailure.CHECKOUT_SERVER_ERROR;
                break;
            case 3:
                ageCheckResult = AgeCheckResult.FAILED_RETRYABLE;
                ageCheckFailure = AgeCheckFailure.CARD_DECLINED;
                break;
            case 5:
                ageCheckResult = AgeCheckResult.FAILED_RETRYABLE;
                ageCheckFailure = AgeCheckFailure.THREE_DS_FAILED;
                break;
            default:
                throw C3cG.A0q();
        }
        AgeCheckFunnelLogging.INSTANCE.attemptResult(AgeCheckMethod.CREDIT_CARD, ageCheckResult, ageCheckFailure, null, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCheckout() {
        BLL bllA00 = AEu.A00(this);
        this.sessionDeferred = GAo.A01(C79.A00, AnonymousClass001.A0y(), new C110401(null), bllA00);
    }

    public final void fetchLinkingOptions() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C110371(null), AEu.A00(this));
    }

    public final void onCancel() {
        clearCardFields();
        this._viewEffect.AhV(HatchCcvViewEffect.Cancelled.INSTANCE);
    }
}
