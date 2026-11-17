package com.facebook.aura.confidentialvm.model;

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
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3Pi;
import X.C3UX;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.ConfidentialVmSetupGate;
import com.facebook.aura.confidentialvm.model.ConfidentialVmEnrollmentChoiceViewEffect;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmEnrollmentStep;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsRepository;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsState;
import com.facebook.aura.gateway.HatchlingVmType;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ConfidentialVmEnrollmentChoiceViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String TAG = "ConfidentialVmEnrollmentChoiceViewModel";
    public final BLG<UiState> _uiState;
    public final C3Em<ConfidentialVmEnrollmentChoiceViewEffect> _viewEffects;
    public final ConfidentialVmRepository repository;
    public final RegisterPinEntryPoint setupEntryPoint;
    public final ConfidentialVmSetupGate setupGate;
    public final C1BN<UiState> uiState;
    public final C22I<ConfidentialVmEnrollmentChoiceViewEffect> viewEffects;

    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmEnrollmentChoiceViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<ConfidentialVmValuePropsState, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ConfidentialVmValuePropsState confidentialVmValuePropsState) {
            UiState value;
            UiState uiState;
            C7384Etj.A0Y(confidentialVmValuePropsState, 0);
            BLG<UiState> blg = ConfidentialVmEnrollmentChoiceViewModel.this._uiState;
            do {
                value = blg.getValue();
                uiState = value;
            } while (!blg.A6e(value, new UiState(uiState.isResolving, uiState.hasError, confidentialVmValuePropsState)));
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(ConfidentialVmValuePropsState confidentialVmValuePropsState) {
            invoke2(confidentialVmValuePropsState);
            return Unit.INSTANCE;
        }
    }

    public final class Factory extends AuraViewModelFactory<ConfidentialVmEnrollmentChoiceViewModel> {
        public static final int $stable = 8;
        public final RegisterPinEntryPoint setupEntryPoint;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmEnrollmentChoiceViewModel create() {
            return new ConfidentialVmEnrollmentChoiceViewModel(ConfidentialVmRepository.Companion.getInstance(this.userSession), ConfidentialVmSetupGate.Companion.getInstance(this.userSession), this.setupEntryPoint, ConfidentialVmValuePropsRepository.Companion.getInstance(this.userSession));
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, RegisterPinEntryPoint registerPinEntryPoint) {
            AnonymousClass003.A0u(abstractC3358CGz, registerPinEntryPoint);
            this.userSession = abstractC3358CGz;
            this.setupEntryPoint = registerPinEntryPoint;
        }
    }

    public final class UiState extends C06G {
        public static final int $stable = 0;
        public final boolean hasError;
        public final boolean isResolving;
        public final ConfidentialVmValuePropsState valuePropsState;

        public UiState(boolean z, boolean z2, ConfidentialVmValuePropsState confidentialVmValuePropsState) {
            C7384Etj.A0Y(confidentialVmValuePropsState, 2);
            this.isResolving = z;
            this.hasError = z2;
            this.valuePropsState = confidentialVmValuePropsState;
        }

        public final UiState copy(boolean z, boolean z2, ConfidentialVmValuePropsState confidentialVmValuePropsState) {
            C7384Etj.A0Y(confidentialVmValuePropsState, 2);
            return new UiState(z, z2, confidentialVmValuePropsState);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (this.isResolving != uiState.isResolving || this.hasError != uiState.hasError || !C7384Etj.areEqual(this.valuePropsState, uiState.valuePropsState)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, boolean z, boolean z2, ConfidentialVmValuePropsState confidentialVmValuePropsState, int i, Object obj) {
            if ((i & 1) != 0) {
                z = uiState.isResolving;
            }
            if ((i & 2) != 0) {
                z2 = uiState.hasError;
            }
            if ((i & 4) != 0) {
                confidentialVmValuePropsState = uiState.valuePropsState;
            }
            return uiState.copy(z, z2, confidentialVmValuePropsState);
        }

        public final boolean component1() {
            return this.isResolving;
        }

        public final boolean component2() {
            return this.hasError;
        }

        public final ConfidentialVmValuePropsState component3() {
            return this.valuePropsState;
        }

        public final boolean getHasError() {
            return this.hasError;
        }

        public final ConfidentialVmValuePropsState getValuePropsState() {
            return this.valuePropsState;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.valuePropsState, C0KA.A01(C0KA.A02(this.isResolving), this.hasError));
        }

        public final boolean isResolving() {
            return this.isResolving;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(boolean z, boolean z2, ConfidentialVmValuePropsState confidentialVmValuePropsState, int i, C06H c06h) {
            this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), (i & 4) != 0 ? ConfidentialVmValuePropsState.Unresolved.INSTANCE : confidentialVmValuePropsState);
        }

        public UiState() {
            this(false, false, ConfidentialVmValuePropsState.Unresolved.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmEnrollmentChoiceViewModel$onEncryptionEnabledContinue$2", f = "ConfidentialVmEnrollmentChoiceViewModel.kt", l = {81, 84, 86}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmEnrollmentChoiceViewModel$onEncryptionEnabledContinue$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmEnrollmentChoiceViewModel$onEncryptionEnabledContinue$2$WhenMappings */
        /* loaded from: classes4.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConfidentialVmEnrollmentStep.values().length];
                try {
                    AnonymousClass002.A13(ConfidentialVmEnrollmentStep.USE_STORED_SECRET, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(ConfidentialVmEnrollmentStep.ENTER_EXISTING_PIN, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(ConfidentialVmEnrollmentStep.CREATE_PIN, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(ConfidentialVmEnrollmentStep.UNAVAILABLE, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmEnrollmentChoiceViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(ConfidentialVmEnrollmentChoiceViewModel.TAG, "Failed to resolve confidential VM enrollment choice", e2);
                ConfidentialVmEnrollmentChoiceViewModel.this.showError();
            }
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmRepository confidentialVmRepository = ConfidentialVmEnrollmentChoiceViewModel.this.repository;
                this.label = 1;
                obj = confidentialVmRepository.resolveEnrollmentStep(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            int iOrdinal = ((ConfidentialVmEnrollmentStep) obj).ordinal();
            if (iOrdinal == 0) {
                ConfidentialVmEnrollmentChoiceViewModel.this.continueWithStoredCredential();
            } else if (iOrdinal == 1) {
                C3Em<ConfidentialVmEnrollmentChoiceViewEffect> c3Em = ConfidentialVmEnrollmentChoiceViewModel.this._viewEffects;
                ConfidentialVmEnrollmentChoiceViewEffect.EnterExistingPin enterExistingPin = ConfidentialVmEnrollmentChoiceViewEffect.EnterExistingPin.INSTANCE;
                this.label = 2;
                if (c3Em.emit(enterExistingPin, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else if (iOrdinal == 2) {
                C3Em<ConfidentialVmEnrollmentChoiceViewEffect> c3Em2 = ConfidentialVmEnrollmentChoiceViewModel.this._viewEffects;
                ConfidentialVmEnrollmentChoiceViewEffect.CreatePin createPin = ConfidentialVmEnrollmentChoiceViewEffect.CreatePin.INSTANCE;
                this.label = 3;
                if (c3Em2.emit(createPin, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ConfidentialVmEnrollmentChoiceViewModel.this.showError();
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmEnrollmentChoiceViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConfidentialVmEnrollmentChoiceViewModel(ConfidentialVmRepository confidentialVmRepository, ConfidentialVmSetupGate confidentialVmSetupGate, RegisterPinEntryPoint registerPinEntryPoint, ConfidentialVmValuePropsRepository confidentialVmValuePropsRepository) {
        C7384Etj.A0Y(confidentialVmRepository, 0);
        AnonymousClass005.A11(confidentialVmSetupGate, registerPinEntryPoint, confidentialVmValuePropsRepository, 1);
        this.repository = confidentialVmRepository;
        this.setupGate = confidentialVmSetupGate;
        this.setupEntryPoint = registerPinEntryPoint;
        C9286GCn c9286GCn = new C9286GCn(new UiState(false, false, ConfidentialVmValuePropsState.Unresolved.INSTANCE));
        this._uiState = c9286GCn;
        this.uiState = C3Pi.A00(c9286GCn);
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 1);
        this._viewEffects = c9290GCr;
        this.viewEffects = new C3pd(c9290GCr);
        confidentialVmValuePropsRepository.collectIn(AEu.A00(this), new AnonymousClass1());
        confidentialVmValuePropsRepository.refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void continueWithStoredCredential() {
        if (this.setupGate.commitCvmSelectionAfterEscrow()) {
            return;
        }
        showError();
    }

    private final void logOfferClick(HatchComponent hatchComponent) {
        ConfidentialVmAnalytics.INSTANCE.logSetupTap(this.setupEntryPoint, HatchScreen.ONBOARDING_CVM_OFFER, hatchComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        UiState value;
        UiState uiState;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, uiState.copy(false, true, uiState.valuePropsState)));
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final C22I<ConfidentialVmEnrollmentChoiceViewEffect> getViewEffects() {
        return this.viewEffects;
    }

    public final void onEncryptionEnabledContinue() {
        UiState value;
        UiState uiState;
        if (this._uiState.getValue().isResolving) {
            return;
        }
        logOfferClick(HatchComponent.TRY_IT_BUTTON);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, uiState.copy(true, false, uiState.valuePropsState)));
        AnonymousClass001.A1J(new AnonymousClass2(null), AEu.A00(this));
    }

    public final void onLearnMoreClick() {
        logOfferClick(HatchComponent.CVM_LEARN_MORE_LINK);
    }

    public final void onOfferShown() {
        ConfidentialVmAnalytics.INSTANCE.logSetupImpression(this.setupEntryPoint, HatchScreen.ONBOARDING_CVM_OFFER, this._uiState.getValue().hasError ? HatchComponent.CVM_ERROR_STATE : HatchComponent.CVM_SCREEN_VIEW);
    }

    public final void onShown() {
        UiState value;
        UiState uiState;
        if (AnonymousClass001.A1X(this.setupGate.isSetupRequired.getValue())) {
            BLG<UiState> blg = this._uiState;
            do {
                value = blg.getValue();
                uiState = value;
            } while (!blg.A6e(value, uiState.copy(false, uiState.hasError, uiState.valuePropsState)));
        }
    }

    public final void onSkip() {
        UiState value;
        UiState uiState;
        if (this._uiState.getValue().isResolving) {
            return;
        }
        logOfferClick(HatchComponent.NOT_NOW_BUTTON);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, uiState.copy(true, false, uiState.valuePropsState)));
        if (this.setupGate.markSelected(HatchlingVmType.HATCH_VM)) {
            return;
        }
        showError();
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
