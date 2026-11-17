package com.facebook.aura.ccv.nativeflow.ui;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.ageverification.intf.AgeCheckFailure;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.ageverification.intf.AgeCheckResult;
import com.facebook.aura.ageverification.intf.AgeCheckStep;
import com.facebook.aura.ageverification.intf.AgeCheckVia;
import com.facebook.aura.ccv.nativeflow.HatchAgeConfirmationLinkingClient;
import com.facebook.aura.ccv.nativeflow.HatchLinkableAccountType;
import com.facebook.aura.ccv.nativeflow.HatchLinkingNextAction;
import com.facebook.aura.ccv.nativeflow.HatchLinkingWebAuthResult;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.user.provider.AgeCheckMethod;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchAgeLinkingViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<HatchAgeLinkingState> _state;
    public HoC resolveJob;
    public final SingleFlight startFlight;
    public HoC startJob;
    public final C1BN<HatchAgeLinkingState> state;

    public final class Factory extends AuraViewModelFactory<HatchAgeLinkingViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new HatchAgeLinkingViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchAgeLinkingViewModel create() {
            return new HatchAgeLinkingViewModel(this.userSession);
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingViewModel$finish$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<HatchAgeLinkingState, HatchAgeLinkingState> {
        public final /* synthetic */ HatchCcvLinkingError $error;

        @Override // X.G0U
        public final HatchAgeLinkingState invoke(HatchAgeLinkingState hatchAgeLinkingState) {
            C7384Etj.A0Y(hatchAgeLinkingState, 0);
            return new HatchAgeLinkingState(false, null, null, hatchAgeLinkingState.optionsVersion, this.$error, hatchAgeLinkingState.attempt, hatchAgeLinkingState.attemptId);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchCcvLinkingError hatchCcvLinkingError) {
            super(1);
            this.$error = hatchCcvLinkingError;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingViewModel$onLaunchSkipped$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HatchAgeLinkingState, HatchAgeLinkingState> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public final HatchAgeLinkingState invoke(HatchAgeLinkingState hatchAgeLinkingState) {
            C7384Etj.A0Y(hatchAgeLinkingState, 0);
            return new HatchAgeLinkingState(hatchAgeLinkingState.isResolving, hatchAgeLinkingState.account, hatchAgeLinkingState.launch, hatchAgeLinkingState.optionsVersion, hatchAgeLinkingState.error, hatchAgeLinkingState.attempt, null);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingViewModel$onReturned$3", f = "HatchAgeLinking.kt", l = {117}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingViewModel$onReturned$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $attemptId;
        public final /* synthetic */ HatchAgeLinkingState $current;
        public final /* synthetic */ AgeCheckMethod $method;
        public int label;
        public final /* synthetic */ HatchAgeLinkingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, AgeCheckMethod ageCheckMethod, HatchAgeLinkingViewModel hatchAgeLinkingViewModel, HatchAgeLinkingState hatchAgeLinkingState, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$attemptId = str;
            this.$method = ageCheckMethod;
            this.this$0 = hatchAgeLinkingViewModel;
            this.$current = hatchAgeLinkingState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$attemptId, this.$method, this.this$0, this.$current, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAgeConfirmationLinkingClient hatchAgeConfirmationLinkingClient = HatchAgeConfirmationLinkingClient.INSTANCE;
                String str = this.$attemptId;
                this.label = 1;
                obj = hatchAgeConfirmationLinkingClient.completeWebAuth(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchLinkingNextAction hatchLinkingNextAction = (HatchLinkingNextAction) obj;
            AgeCheckMethod ageCheckMethod = this.$method;
            if (ageCheckMethod != null) {
                this.this$0.logLinkingResult(ageCheckMethod, hatchLinkingNextAction);
            }
            if (hatchLinkingNextAction == HatchLinkingNextAction.RESTART_LINKING) {
                this.this$0.optionsChanged(this.$current.attempt);
            }
            HatchAgeLinkingViewModel hatchAgeLinkingViewModel = this.this$0;
            hatchAgeLinkingViewModel.finish(this.$current.attempt, hatchAgeLinkingViewModel.toLinkingError(hatchLinkingNextAction));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingViewModel$optionsChanged$1, reason: invalid class name and case insensitive filesystem */
    public final class C110241 extends AbstractC7559F3s implements G0U<HatchAgeLinkingState, HatchAgeLinkingState> {
        public static final C110241 INSTANCE = new C110241();

        public C110241() {
            super(1);
        }

        @Override // X.G0U
        public final HatchAgeLinkingState invoke(HatchAgeLinkingState hatchAgeLinkingState) {
            C7384Etj.A0Y(hatchAgeLinkingState, 0);
            return new HatchAgeLinkingState(hatchAgeLinkingState.isResolving, hatchAgeLinkingState.account, hatchAgeLinkingState.launch, hatchAgeLinkingState.optionsVersion + 1, hatchAgeLinkingState.error, hatchAgeLinkingState.attempt, hatchAgeLinkingState.attemptId);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingViewModel$start$1", f = "HatchAgeLinking.kt", l = {59}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingViewModel$start$1, reason: invalid class name and case insensitive filesystem */
    public final class C110251 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchLinkableAccountType $accountType;
        public final /* synthetic */ int $attempt;
        public final /* synthetic */ AgeCheckMethod $method;
        public final /* synthetic */ boolean $reportsNotOffered;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingViewModel$start$1$1", f = "HatchAgeLinking.kt", l = {60}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingViewModel$start$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00571 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchLinkableAccountType $accountType;
            public final /* synthetic */ int $attempt;
            public final /* synthetic */ AgeCheckMethod $method;
            public final /* synthetic */ boolean $reportsNotOffered;
            public int label;
            public final /* synthetic */ HatchAgeLinkingViewModel this$0;

            /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingViewModel$start$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00581 extends AbstractC7559F3s implements G0U<HatchAgeLinkingState, HatchAgeLinkingState> {
                public final /* synthetic */ HatchLinkableAccountType $accountType;
                public final /* synthetic */ HatchLinkingWebAuthResult $result;

                @Override // X.G0U
                public final HatchAgeLinkingState invoke(HatchAgeLinkingState hatchAgeLinkingState) {
                    C7384Etj.A0Y(hatchAgeLinkingState, 0);
                    return new HatchAgeLinkingState(hatchAgeLinkingState.isResolving, hatchAgeLinkingState.account, this.$accountType, hatchAgeLinkingState.optionsVersion, hatchAgeLinkingState.error, hatchAgeLinkingState.attempt, ((HatchLinkingWebAuthResult.Available) this.$result).attemptId);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00581(HatchLinkableAccountType hatchLinkableAccountType, HatchLinkingWebAuthResult hatchLinkingWebAuthResult) {
                    super(1);
                    this.$accountType = hatchLinkableAccountType;
                    this.$result = hatchLinkingWebAuthResult;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00571(HatchLinkableAccountType hatchLinkableAccountType, HatchAgeLinkingViewModel hatchAgeLinkingViewModel, int i, AgeCheckMethod ageCheckMethod, boolean z, HtJ<? super C00571> htJ) {
                super(1, htJ);
                this.$accountType = hatchLinkableAccountType;
                this.this$0 = hatchAgeLinkingViewModel;
                this.$attempt = i;
                this.$method = ageCheckMethod;
                this.$reportsNotOffered = z;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C00571(this.$accountType, this.this$0, this.$attempt, this.$method, this.$reportsNotOffered, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HatchAgeLinkingViewModel hatchAgeLinkingViewModel;
                int i;
                HatchCcvLinkingError hatchCcvLinkingError;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i2 = this.label;
                if (i2 == 0) {
                    Hwg.A00(obj);
                    HatchAgeConfirmationLinkingClient hatchAgeConfirmationLinkingClient = HatchAgeConfirmationLinkingClient.INSTANCE;
                    HatchLinkableAccountType hatchLinkableAccountType = this.$accountType;
                    this.label = 1;
                    obj = hatchAgeConfirmationLinkingClient.fetchWebAuthUrl(hatchLinkableAccountType, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i2 != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                HatchLinkingWebAuthResult hatchLinkingWebAuthResult = (HatchLinkingWebAuthResult) obj;
                if (hatchLinkingWebAuthResult instanceof HatchLinkingWebAuthResult.Available) {
                    this.this$0.updateAttempt(this.$attempt, new C00581(this.$accountType, hatchLinkingWebAuthResult));
                } else {
                    if (C7384Etj.areEqual(hatchLinkingWebAuthResult, HatchLinkingWebAuthResult.NotOffered.INSTANCE)) {
                        AgeCheckFunnelLogging.INSTANCE.attemptResult(this.$method, AgeCheckResult.NOT_OFFERED, AgeCheckFailure.NOT_ELIGIBLE, null, null);
                        this.this$0.optionsChanged(this.$attempt);
                        hatchAgeLinkingViewModel = this.this$0;
                        i = this.$attempt;
                        hatchCcvLinkingError = this.$reportsNotOffered ? HatchCcvLinkingError.ACCOUNT_NOT_ELIGIBLE : null;
                    } else {
                        if (!C7384Etj.areEqual(hatchLinkingWebAuthResult, HatchLinkingWebAuthResult.Failed.INSTANCE)) {
                            throw C3cG.A0q();
                        }
                        AgeCheckFunnelLogging.INSTANCE.attemptResult(this.$method, AgeCheckResult.ERROR, AgeCheckFailure.GENERIC, null, null);
                        hatchAgeLinkingViewModel = this.this$0;
                        i = this.$attempt;
                        hatchCcvLinkingError = HatchCcvLinkingError.GENERIC;
                    }
                    hatchAgeLinkingViewModel.finish(i, hatchCcvLinkingError);
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((C00571) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110251(HatchLinkableAccountType hatchLinkableAccountType, int i, AgeCheckMethod ageCheckMethod, boolean z, HtJ<? super C110251> htJ) {
            super(2, htJ);
            this.$accountType = hatchLinkableAccountType;
            this.$attempt = i;
            this.$method = ageCheckMethod;
            this.$reportsNotOffered = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAgeLinkingViewModel.this.new C110251(this.$accountType, this.$attempt, this.$method, this.$reportsNotOffered, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAgeLinkingViewModel hatchAgeLinkingViewModel = HatchAgeLinkingViewModel.this;
                SingleFlight singleFlight = hatchAgeLinkingViewModel.startFlight;
                C00571 c00571 = new C00571(this.$accountType, hatchAgeLinkingViewModel, this.$attempt, this.$method, this.$reportsNotOffered, null);
                this.label = 1;
                if (singleFlight.invoke(Unit.INSTANCE, c00571, this) == enumC10460Hji) {
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
            return ((C110251) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchAgeLinkingViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        C9286GCn c9286GCnA14 = C3cG.A14(new HatchAgeLinkingState(false, null, null, 0, null, 0, null));
        this._state = c9286GCnA14;
        this.state = C3cG.A11(c9286GCnA14);
        this.startFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void logLinkingResult(AgeCheckMethod ageCheckMethod, HatchLinkingNextAction hatchLinkingNextAction) {
        AgeCheckResult ageCheckResult;
        AgeCheckFailure ageCheckFailure;
        HxE hxEA0r;
        int iA0M = AnonymousClass003.A0M(hatchLinkingNextAction);
        if (iA0M == -1) {
            ageCheckResult = AgeCheckResult.ERROR;
            ageCheckFailure = AgeCheckFailure.GENERIC;
        } else {
            if (iA0M == 1) {
                hxEA0r = C3cG.A0r(AgeCheckResult.VERIFIED, null);
                AgeCheckResult ageCheckResult2 = (AgeCheckResult) hxEA0r.first;
                AgeCheckFailure ageCheckFailure2 = (AgeCheckFailure) hxEA0r.second;
                if (hatchLinkingNextAction != null && hatchLinkingNextAction != HatchLinkingNextAction.PENDING) {
                    AgeCheckFunnelLogging.INSTANCE.attemptSubmitted(ageCheckMethod, null);
                }
                AgeCheckFunnelLogging.INSTANCE.attemptResult(ageCheckMethod, ageCheckResult2, ageCheckFailure2, null, null);
            }
            if (iA0M == 2) {
                ageCheckResult = AgeCheckResult.BLOCKED;
                ageCheckFailure = AgeCheckFailure.GENERIC;
            } else if (iA0M == 0) {
                ageCheckResult = AgeCheckResult.CANCELLED;
                ageCheckFailure = AgeCheckFailure.CANCELLED;
            } else if (iA0M == 4) {
                ageCheckResult = AgeCheckResult.FAILED_RETRYABLE;
                ageCheckFailure = AgeCheckFailure.RESTART_LINKING;
            } else {
                if (iA0M != 3) {
                    throw C3cG.A0q();
                }
                ageCheckResult = AgeCheckResult.NOT_OFFERED;
                ageCheckFailure = AgeCheckFailure.NOT_ELIGIBLE;
            }
        }
        hxEA0r = C3cG.A0r(ageCheckResult, ageCheckFailure);
        AgeCheckResult ageCheckResult22 = (AgeCheckResult) hxEA0r.first;
        AgeCheckFailure ageCheckFailure22 = (AgeCheckFailure) hxEA0r.second;
        if (hatchLinkingNextAction != null) {
            AgeCheckFunnelLogging.INSTANCE.attemptSubmitted(ageCheckMethod, null);
        }
        AgeCheckFunnelLogging.INSTANCE.attemptResult(ageCheckMethod, ageCheckResult22, ageCheckFailure22, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchCcvLinkingError toLinkingError(HatchLinkingNextAction hatchLinkingNextAction) {
        int iOrdinal;
        if (hatchLinkingNextAction == null || (iOrdinal = hatchLinkingNextAction.ordinal()) == -1) {
            return HatchCcvLinkingError.GENERIC;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 0 || iOrdinal == 4) {
            return null;
        }
        if (iOrdinal == 3) {
            return HatchCcvLinkingError.ACCOUNT_NOT_ELIGIBLE;
        }
        throw C3cG.A0q();
    }

    public final void onAccountPicked(AgeCheckMethod ageCheckMethod, int i) {
        HatchLinkableAccountType hatchLinkableAccountType;
        C7384Etj.A0Y(ageCheckMethod, 0);
        if (this._state.getValue().account == null) {
            AgeCheckFunnelLogging.INSTANCE.methodSelected(ageCheckMethod, i);
            int iOrdinal = ageCheckMethod.ordinal();
            if (iOrdinal == 2) {
                hatchLinkableAccountType = HatchLinkableAccountType.FACEBOOK;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 0 && iOrdinal != 1) {
                        throw C3cG.A0q();
                    }
                    return;
                }
                hatchLinkableAccountType = HatchLinkableAccountType.INSTAGRAM;
            }
            start(hatchLinkableAccountType, true);
        }
    }

    public final void start(HatchLinkableAccountType hatchLinkableAccountType, boolean z) {
        HatchAgeLinkingState value;
        HatchAgeLinkingState hatchAgeLinkingState;
        HatchAgeLinkingState hatchAgeLinkingState2;
        C7384Etj.A0Y(hatchLinkableAccountType, 0);
        BLG<HatchAgeLinkingState> blg = this._state;
        do {
            value = blg.getValue();
            hatchAgeLinkingState = value;
            if (hatchAgeLinkingState.account != null) {
                hatchAgeLinkingState2 = hatchAgeLinkingState;
            } else {
                hatchAgeLinkingState2 = new HatchAgeLinkingState(hatchAgeLinkingState.isResolving, hatchLinkableAccountType, hatchAgeLinkingState.launch, hatchAgeLinkingState.optionsVersion, hatchAgeLinkingState.error, hatchAgeLinkingState.attempt + 1, hatchAgeLinkingState.attemptId);
            }
        } while (!blg.A6e(value, hatchAgeLinkingState2));
        if (hatchAgeLinkingState.account == null) {
            int i = hatchAgeLinkingState.attempt + 1;
            AgeCheckMethod ageCheckMethod = HatchAgeLinkingKt.getAgeCheckMethod(hatchLinkableAccountType);
            AgeCheckFunnelLogging.INSTANCE.attemptStarted(ageCheckMethod);
            BLL bllA00 = AEu.A00(this);
            this.startJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C110251(hatchLinkableAccountType, i, ageCheckMethod, z, null), bllA00);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[AgeCheckMethod.values().length];
            try {
                AnonymousClass005.A0v(AgeCheckMethod.FACEBOOK, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(AgeCheckMethod.INSTAGRAM, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(AgeCheckMethod.SELFIE, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(AgeCheckMethod.CREDIT_CARD, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchLinkableAccountType.values().length];
            try {
                AnonymousClass005.A0v(HatchLinkableAccountType.FACEBOOK, iArr2, 1);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkableAccountType.INSTAGRAM, iArr2, 2);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[HatchLinkingNextAction.values().length];
            try {
                AnonymousClass005.A0v(HatchLinkingNextAction.CONTINUE, iArr3, 1);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkingNextAction.BLOCKED, iArr3, 2);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkingNextAction.PENDING, iArr3, 3);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkingNextAction.RESTART_LINKING, iArr3, 4);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass002.A17(HatchLinkingNextAction.USE_CREDIT_CARD, iArr3);
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finish(int i, HatchCcvLinkingError hatchCcvLinkingError) {
        updateAttempt(i, new AnonymousClass1(hatchCcvLinkingError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void optionsChanged(int i) {
        updateAttempt(i, C110241.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAttempt(int i, G0U<? super HatchAgeLinkingState, HatchAgeLinkingState> g0u) {
        HatchAgeLinkingState value;
        HatchAgeLinkingState hatchAgeLinkingStateInvoke;
        BLG<HatchAgeLinkingState> blg = this._state;
        do {
            value = blg.getValue();
            hatchAgeLinkingStateInvoke = value;
            if (hatchAgeLinkingStateInvoke.attempt == i) {
                hatchAgeLinkingStateInvoke = g0u.invoke(hatchAgeLinkingStateInvoke);
            }
        } while (!blg.A6e(value, hatchAgeLinkingStateInvoke));
    }

    public final C1BN<HatchAgeLinkingState> getState() {
        return this.state;
    }

    public final void onErrorDismissed() {
        HatchAgeLinkingState value;
        HatchAgeLinkingState hatchAgeLinkingState;
        BLG<HatchAgeLinkingState> blg = this._state;
        do {
            value = blg.getValue();
            hatchAgeLinkingState = value;
        } while (!blg.A6e(value, new HatchAgeLinkingState(hatchAgeLinkingState.isResolving, hatchAgeLinkingState.account, hatchAgeLinkingState.launch, hatchAgeLinkingState.optionsVersion, null, hatchAgeLinkingState.attempt, hatchAgeLinkingState.attemptId)));
    }

    public final void onLaunchSkipped() {
        int i = this._state.getValue().attempt;
        HatchLinkableAccountType hatchLinkableAccountType = this._state.getValue().account;
        if (hatchLinkableAccountType != null) {
            AgeCheckFunnelLogging.INSTANCE.attemptCancelled(HatchAgeLinkingKt.getAgeCheckMethod(hatchLinkableAccountType));
        }
        updateAttempt(i, AnonymousClass2.INSTANCE);
        finish(i, null);
    }

    public final void onLaunched() {
        HatchAgeLinkingState value;
        HatchAgeLinkingState hatchAgeLinkingState;
        int iOrdinal;
        AgeCheckFunnelLogging ageCheckFunnelLogging;
        AgeCheckStep ageCheckStep;
        HatchLinkableAccountType hatchLinkableAccountType = this._state.getValue().launch;
        if (hatchLinkableAccountType != null && (iOrdinal = hatchLinkableAccountType.ordinal()) != -1) {
            if (iOrdinal == 1) {
                ageCheckFunnelLogging = AgeCheckFunnelLogging.INSTANCE;
                ageCheckStep = AgeCheckStep.LINKING_FACEBOOK;
            } else {
                if (iOrdinal != 0) {
                    throw C3cG.A0q();
                }
                ageCheckFunnelLogging = AgeCheckFunnelLogging.INSTANCE;
                ageCheckStep = AgeCheckStep.LINKING_INSTAGRAM;
            }
            ageCheckFunnelLogging.stepShown(ageCheckStep, AgeCheckVia.PICK);
        }
        BLG<HatchAgeLinkingState> blg = this._state;
        do {
            value = blg.getValue();
            hatchAgeLinkingState = value;
        } while (!blg.A6e(value, new HatchAgeLinkingState(hatchAgeLinkingState.isResolving, hatchAgeLinkingState.account, null, hatchAgeLinkingState.optionsVersion, hatchAgeLinkingState.error, hatchAgeLinkingState.attempt, hatchAgeLinkingState.attemptId)));
    }

    public final void onReturned() {
        HatchAgeLinkingState value;
        HatchAgeLinkingState hatchAgeLinkingState;
        AgeCheckFunnelLogging ageCheckFunnelLogging = AgeCheckFunnelLogging.INSTANCE;
        ageCheckFunnelLogging.linkingReturned();
        HatchAgeLinkingState value2 = this._state.getValue();
        HatchLinkableAccountType hatchLinkableAccountType = value2.account;
        AgeCheckMethod ageCheckMethod = hatchLinkableAccountType != null ? HatchAgeLinkingKt.getAgeCheckMethod(hatchLinkableAccountType) : null;
        String str = value2.attemptId;
        if (str == null) {
            if (ageCheckMethod != null) {
                ageCheckFunnelLogging.attemptCancelled(ageCheckMethod);
            }
            finish(value2.attempt, null);
            return;
        }
        BLG<HatchAgeLinkingState> blg = this._state;
        do {
            value = blg.getValue();
            hatchAgeLinkingState = value;
            if (hatchAgeLinkingState.attempt == value2.attempt) {
                hatchAgeLinkingState = new HatchAgeLinkingState(true, hatchAgeLinkingState.account, hatchAgeLinkingState.launch, hatchAgeLinkingState.optionsVersion, null, hatchAgeLinkingState.attempt, null);
            }
        } while (!blg.A6e(value, hatchAgeLinkingState));
        this.resolveJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new AnonymousClass3(str, ageCheckMethod, this, value2, null), AEu.A00(this));
    }

    public final void reset() {
        HatchAgeLinkingState value;
        HatchAgeLinkingState hatchAgeLinkingState;
        HatchLinkableAccountType hatchLinkableAccountType = this._state.getValue().account;
        if (hatchLinkableAccountType != null) {
            AgeCheckFunnelLogging.INSTANCE.attemptCancelled(HatchAgeLinkingKt.getAgeCheckMethod(hatchLinkableAccountType));
        }
        this.startFlight.clearAndCancelAll();
        HoC hoC = this.startJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        HoC hoC2 = this.resolveJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        BLG<HatchAgeLinkingState> blg = this._state;
        do {
            value = blg.getValue();
            hatchAgeLinkingState = value;
        } while (!blg.A6e(value, new HatchAgeLinkingState(false, null, null, hatchAgeLinkingState.optionsVersion, null, hatchAgeLinkingState.attempt + 1, null)));
    }
}
