package com.facebook.aura.confidentialvm.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.BQG;
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
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.confidentialvm.ConfidentialVmSetupGate;
import com.facebook.aura.confidentialvm.HatchVmAccessController;
import com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewEffect;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmStoredEnrollment;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepositoryJsonKt;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ConfidentialVmRegisterPinViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ConfidentialVmRegisterPinUiState> _uiState;
    public final C3Em<ConfidentialVmRegisterPinViewEffect> _viewEffects;
    public final HatchVmAccessController accessController;
    public String chosenPin;
    public final boolean isCvmSetupFlow;
    public final RegisterPinFlow registerPinFlow;
    public final ConfidentialVmRepository repository;
    public final RegisterPinEntryPoint setupEntryPoint;
    public final ConfidentialVmSetupGate setupGate;
    public final C1BN<ConfidentialVmRegisterPinUiState> uiState;
    public final C22I<ConfidentialVmRegisterPinViewEffect> viewEffects;

    public final class ConfidentialVmRegisterPinUiState extends C06G {
        public static final int $stable = 0;
        public final boolean hasReconnectFailed;
        public final boolean isAwaitingReconnect;
        public final boolean isPinMismatch;
        public final boolean isRegistrationLookupUnavailable;
        public final boolean isSubmitting;
        public final String pin;
        public final RegisterPinStep step;

        public static /* synthetic */ ConfidentialVmRegisterPinUiState copy$default(ConfidentialVmRegisterPinUiState confidentialVmRegisterPinUiState, RegisterPinStep registerPinStep, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            RegisterPinStep registerPinStep2 = registerPinStep;
            String str2 = str;
            boolean z6 = z;
            boolean z7 = z2;
            boolean z8 = z3;
            boolean z9 = z4;
            boolean z10 = z5;
            if ((i & 1) != 0) {
                registerPinStep2 = confidentialVmRegisterPinUiState.step;
            }
            if ((i & 2) != 0) {
                str2 = confidentialVmRegisterPinUiState.pin;
            }
            if ((i & 4) != 0) {
                z6 = confidentialVmRegisterPinUiState.isPinMismatch;
            }
            if ((i & 8) != 0) {
                z7 = confidentialVmRegisterPinUiState.isSubmitting;
            }
            if ((i & 16) != 0) {
                z8 = confidentialVmRegisterPinUiState.isAwaitingReconnect;
            }
            if ((i & 32) != 0) {
                z9 = confidentialVmRegisterPinUiState.hasReconnectFailed;
            }
            if ((i & 64) != 0) {
                z10 = confidentialVmRegisterPinUiState.isRegistrationLookupUnavailable;
            }
            AnonymousClass003.A0u(registerPinStep2, str2);
            return new ConfidentialVmRegisterPinUiState(registerPinStep2, str2, z6, z7, z8, z9, z10);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ConfidentialVmRegisterPinUiState) {
                    ConfidentialVmRegisterPinUiState confidentialVmRegisterPinUiState = (ConfidentialVmRegisterPinUiState) obj;
                    if (this.step != confidentialVmRegisterPinUiState.step || !C7384Etj.areEqual(this.pin, confidentialVmRegisterPinUiState.pin) || this.isPinMismatch != confidentialVmRegisterPinUiState.isPinMismatch || this.isSubmitting != confidentialVmRegisterPinUiState.isSubmitting || this.isAwaitingReconnect != confidentialVmRegisterPinUiState.isAwaitingReconnect || this.hasReconnectFailed != confidentialVmRegisterPinUiState.hasReconnectFailed || this.isRegistrationLookupUnavailable != confidentialVmRegisterPinUiState.isRegistrationLookupUnavailable) {
                    }
                }
                return false;
            }
            return true;
        }

        public ConfidentialVmRegisterPinUiState() {
            this(RegisterPinStep.CHOOSE, "", false, false, false, false, false);
        }

        public final RegisterPinStep component1() {
            return this.step;
        }

        public final String component2() {
            return this.pin;
        }

        public final boolean component3() {
            return this.isPinMismatch;
        }

        public final boolean component4() {
            return this.isSubmitting;
        }

        public final boolean component5() {
            return this.isAwaitingReconnect;
        }

        public final boolean component6() {
            return this.hasReconnectFailed;
        }

        public final boolean component7() {
            return this.isRegistrationLookupUnavailable;
        }

        public final boolean getHasReconnectFailed() {
            return this.hasReconnectFailed;
        }

        public final String getPin() {
            return this.pin;
        }

        public final RegisterPinStep getStep() {
            return this.step;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.pin, AnonymousClass005.A0E(this.step)), this.isPinMismatch), this.isSubmitting), this.isAwaitingReconnect), this.hasReconnectFailed), this.isRegistrationLookupUnavailable);
        }

        public final boolean isAwaitingReconnect() {
            return this.isAwaitingReconnect;
        }

        public final boolean isPinComplete() {
            return AnonymousClass002.A1Q(this.pin.length(), 6);
        }

        public final boolean isPinMismatch() {
            return this.isPinMismatch;
        }

        public final boolean isRegistrationLookupUnavailable() {
            return this.isRegistrationLookupUnavailable;
        }

        public final boolean isSubmitting() {
            return this.isSubmitting;
        }

        public final ConfidentialVmRegisterPinUiState copy(RegisterPinStep registerPinStep, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            AnonymousClass003.A0u(registerPinStep, str);
            return new ConfidentialVmRegisterPinUiState(registerPinStep, str, z, z2, z3, z4, z5);
        }

        public String toString() {
            return super.toString();
        }

        public ConfidentialVmRegisterPinUiState(RegisterPinStep registerPinStep, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            AnonymousClass003.A0u(registerPinStep, str);
            this.step = registerPinStep;
            this.pin = str;
            this.isPinMismatch = z;
            this.isSubmitting = z2;
            this.isAwaitingReconnect = z3;
            this.hasReconnectFailed = z4;
            this.isRegistrationLookupUnavailable = z5;
        }

        public /* synthetic */ ConfidentialVmRegisterPinUiState(RegisterPinStep registerPinStep, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, C06H c06h) {
            this((i & 1) != 0 ? RegisterPinStep.CHOOSE : registerPinStep, (i & 2) != 0 ? "" : str, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2), AnonymousClass005.A1Q(i, z3), (i & 32) != 0 ? false : z4, (i & 64) != 0 ? false : z5);
        }
    }

    public final class Factory extends AuraViewModelFactory<ConfidentialVmRegisterPinViewModel> {
        public static final int $stable = 8;
        public final RegisterPinFlow registerPinFlow;
        public final RegisterPinEntryPoint setupEntryPoint;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmRegisterPinViewModel create() {
            return new ConfidentialVmRegisterPinViewModel(ConfidentialVmRepository.Companion.getInstance(this.userSession), ConfidentialVmSetupGate.Companion.getInstance(this.userSession), HatchVmAccessController.Companion.getInstance(this.userSession), this.registerPinFlow, this.setupEntryPoint);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, RegisterPinEntryPoint registerPinEntryPoint, RegisterPinFlow registerPinFlow) {
            AnonymousClass005.A0x(abstractC3358CGz, registerPinEntryPoint, registerPinFlow);
            this.userSession = abstractC3358CGz;
            this.setupEntryPoint = registerPinEntryPoint;
            this.registerPinFlow = registerPinFlow;
        }

        public /* synthetic */ Factory(AbstractC3358CGz abstractC3358CGz, RegisterPinEntryPoint registerPinEntryPoint, RegisterPinFlow registerPinFlow, int i, C06H c06h) {
            this(abstractC3358CGz, registerPinEntryPoint, (i & 4) != 0 ? RegisterPinFlow.PIN_CHANGE : registerPinFlow);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$onRetryReconnect$1", f = "ConfidentialVmRegisterPinViewModel.kt", l = {VoiceSelectionRepositoryJsonKt.MAX_VOICE_ID_LENGTH}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$onRetryReconnect$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRegisterPinViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmRegisterPinViewModel confidentialVmRegisterPinViewModel = ConfidentialVmRegisterPinViewModel.this;
                this.label = 1;
                if (confidentialVmRegisterPinViewModel.reconnectThenAccept(this) == enumC10460Hji) {
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
            return ConfidentialVmRegisterPinViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$onRetryRegistrationLookup$2", f = "ConfidentialVmRegisterPinViewModel.kt", l = {300, 308, 321}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$onRetryRegistrationLookup$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmVestaRegistration confidentialVmVestaRegistration;
            Object objHandleExistingRegistrationFound;
            ConfidentialVmRegisterPinUiState value;
            ConfidentialVmRegisterPinUiState confidentialVmRegisterPinUiState;
            ConfidentialVmRegisterPinUiState value2;
            RegisterPinStep registerPinStep;
            String str;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Object objRefreshVestaRegistration = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(ConfidentialVmRegisterPinViewModelKt.TAG, "Failed to retry Vesta registration lookup", e2);
                confidentialVmVestaRegistration = ConfidentialVmVestaRegistration.UNAVAILABLE;
            }
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmRepository confidentialVmRepository = ConfidentialVmRegisterPinViewModel.this.repository;
                this.label = 1;
                objRefreshVestaRegistration = confidentialVmRepository.refreshVestaRegistration(this);
                if (objRefreshVestaRegistration == enumC10460Hji) {
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
            confidentialVmVestaRegistration = (ConfidentialVmVestaRegistration) objRefreshVestaRegistration;
            int iOrdinal = confidentialVmVestaRegistration.ordinal();
            if (iOrdinal == 0) {
                ConfidentialVmRegisterPinViewModel confidentialVmRegisterPinViewModel = ConfidentialVmRegisterPinViewModel.this;
                this.L$0 = null;
                this.label = 2;
                objHandleExistingRegistrationFound = confidentialVmRegisterPinViewModel.handleExistingRegistrationFound(this);
            } else {
                if (iOrdinal == 1) {
                    BLG<ConfidentialVmRegisterPinUiState> blg = ConfidentialVmRegisterPinViewModel.this._uiState;
                    do {
                        value = blg.getValue();
                        confidentialVmRegisterPinUiState = value;
                    } while (!blg.A6e(value, new ConfidentialVmRegisterPinUiState(RegisterPinStep.CHOOSE, "", false, false, confidentialVmRegisterPinUiState.isAwaitingReconnect, confidentialVmRegisterPinUiState.hasReconnectFailed, false)));
                    return Unit.INSTANCE;
                }
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                BLG<ConfidentialVmRegisterPinUiState> blg2 = ConfidentialVmRegisterPinViewModel.this._uiState;
                do {
                    value2 = blg2.getValue();
                    ConfidentialVmRegisterPinUiState confidentialVmRegisterPinUiState2 = value2;
                    registerPinStep = confidentialVmRegisterPinUiState2.step;
                    str = confidentialVmRegisterPinUiState2.pin;
                    z = confidentialVmRegisterPinUiState2.isPinMismatch;
                    z2 = confidentialVmRegisterPinUiState2.isAwaitingReconnect;
                    z3 = confidentialVmRegisterPinUiState2.hasReconnectFailed;
                    z4 = confidentialVmRegisterPinUiState2.isRegistrationLookupUnavailable;
                    AnonymousClass003.A0u(registerPinStep, str);
                } while (!blg2.A6e(value2, new ConfidentialVmRegisterPinUiState(registerPinStep, str, z, false, z2, z3, z4)));
                C3Em<ConfidentialVmRegisterPinViewEffect> c3Em = ConfidentialVmRegisterPinViewModel.this._viewEffects;
                ConfidentialVmRegisterPinViewEffect.RegistrationLookupRetryFailed registrationLookupRetryFailed = ConfidentialVmRegisterPinViewEffect.RegistrationLookupRetryFailed.INSTANCE;
                this.L$0 = null;
                this.label = 3;
                objHandleExistingRegistrationFound = c3Em.emit(registrationLookupRetryFailed, this);
            }
            if (objHandleExistingRegistrationFound == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$onRetryRegistrationLookup$2$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConfidentialVmVestaRegistration.values().length];
                try {
                    AnonymousClass002.A13(ConfidentialVmVestaRegistration.REGISTERED, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(ConfidentialVmVestaRegistration.NOT_REGISTERED, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(ConfidentialVmVestaRegistration.UNAVAILABLE, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRegisterPinViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmRegisterPinViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel", f = "ConfidentialVmRegisterPinViewModel.kt", l = {274, 283}, m = "reconnectThenAccept", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$reconnectThenAccept$1, reason: invalid class name and case insensitive filesystem */
    public final class C112071 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C112071(HtJ<? super C112071> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRegisterPinViewModel.this.reconnectThenAccept(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$submitPin$2", f = "ConfidentialVmRegisterPinViewModel.kt", l = {183, AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN, 203, HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT, 217, 233, 241, 251, 258}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$submitPin$2, reason: invalid class name and case insensitive filesystem */
    public final class C112082 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $pin;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;

        /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$submitPin$2$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[ConfidentialVmStoredEnrollment.values().length];
                try {
                    AnonymousClass005.A0v(ConfidentialVmStoredEnrollment.UNAVAILABLE, iArr, 1);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass005.A0v(ConfidentialVmStoredEnrollment.NOT_STORED, iArr, 2);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass005.A0v(ConfidentialVmStoredEnrollment.STORED, iArr, 3);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[RegisterPinFlow.values().length];
                try {
                    AnonymousClass005.A0v(RegisterPinFlow.PIN_CHANGE, iArr2, 1);
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    AnonymousClass005.A0v(RegisterPinFlow.ONBOARDING_ENROLLMENT, iArr2, 2);
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    AnonymousClass005.A0v(RegisterPinFlow.ACCESS_CONTROLLED_ENROLLMENT, iArr2, 3);
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112082(String str, HtJ<? super C112082> htJ) {
            super(2, htJ);
            this.$pin = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRegisterPinViewModel.this.new C112082(this.$pin, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 464
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel.C112082.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C112082) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConfidentialVmRegisterPinViewModel(ConfidentialVmRepository confidentialVmRepository, ConfidentialVmSetupGate confidentialVmSetupGate, HatchVmAccessController hatchVmAccessController, RegisterPinFlow registerPinFlow, RegisterPinEntryPoint registerPinEntryPoint) {
        C7384Etj.A0Y(confidentialVmRepository, 0);
        AnonymousClass005.A11(confidentialVmSetupGate, hatchVmAccessController, registerPinFlow, 1);
        this.repository = confidentialVmRepository;
        this.setupGate = confidentialVmSetupGate;
        this.accessController = hatchVmAccessController;
        this.registerPinFlow = registerPinFlow;
        this.setupEntryPoint = registerPinEntryPoint;
        this.isCvmSetupFlow = AnonymousClass006.A1Z(registerPinFlow, RegisterPinFlow.PIN_CHANGE);
        C9286GCn c9286GCn = new C9286GCn(new ConfidentialVmRegisterPinUiState(RegisterPinStep.CHOOSE, "", false, false, false, false, false));
        this._uiState = c9286GCn;
        this.uiState = C3Pi.A00(c9286GCn);
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 1);
        this._viewEffects = c9290GCr;
        this.viewEffects = new C3pd(c9290GCr);
        this.chosenPin = "";
    }

    public final void onPinChange(String str) {
        ConfidentialVmRegisterPinUiState value;
        RegisterPinStep registerPinStep;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C7384Etj.A0Y(str, 0);
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String strA17 = BQG.A17(sb.toString(), 6);
        BLG<ConfidentialVmRegisterPinUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            ConfidentialVmRegisterPinUiState confidentialVmRegisterPinUiState = value;
            registerPinStep = confidentialVmRegisterPinUiState.step;
            z = confidentialVmRegisterPinUiState.isSubmitting;
            z2 = confidentialVmRegisterPinUiState.isAwaitingReconnect;
            z3 = confidentialVmRegisterPinUiState.hasReconnectFailed;
            z4 = confidentialVmRegisterPinUiState.isRegistrationLookupUnavailable;
            AnonymousClass003.A0u(registerPinStep, strA17);
        } while (!blg.A6e(value, new ConfidentialVmRegisterPinUiState(registerPinStep, strA17, false, z, z2, z3, z4)));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RegisterPinStep.values().length];
            try {
                AnonymousClass002.A13(RegisterPinStep.CHOOSE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(RegisterPinStep.CONFIRM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object completeSubmission(ConfidentialVmRegisterPinViewEffect confidentialVmRegisterPinViewEffect, HtJ<? super Unit> htJ) {
        ConfidentialVmRegisterPinUiState value;
        ConfidentialVmRegisterPinUiState confidentialVmRegisterPinUiState;
        BLG<ConfidentialVmRegisterPinUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            confidentialVmRegisterPinUiState = value;
        } while (!blg.A6e(value, new ConfidentialVmRegisterPinUiState(RegisterPinStep.CHOOSE, "", false, false, confidentialVmRegisterPinUiState.isAwaitingReconnect, confidentialVmRegisterPinUiState.hasReconnectFailed, false)));
        Object objEmit = this._viewEffects.emit(confidentialVmRegisterPinViewEffect, htJ);
        return objEmit != EnumC10460Hji.A02 ? Unit.INSTANCE : objEmit;
    }

    private final HatchScreen getPinScreen() {
        ConfidentialVmRegisterPinUiState value = this._uiState.getValue();
        if (value.isRegistrationLookupUnavailable) {
            return HatchScreen.CVM_PIN_LOOKUP_FAILED;
        }
        int iOrdinal = value.step.ordinal();
        if (iOrdinal == 0) {
            return HatchScreen.CVM_PIN_CREATE;
        }
        if (iOrdinal == 1) {
            return HatchScreen.CVM_PIN_CONFIRM;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleExistingRegistrationFound(HtJ<? super Unit> htJ) {
        if (this.registerPinFlow == RegisterPinFlow.ACCESS_CONTROLLED_ENROLLMENT) {
            this.accessController.retry();
        }
        Object objCompleteSubmission = completeSubmission(ConfidentialVmRegisterPinViewEffect.ExistingRegistrationFound.INSTANCE, htJ);
        return objCompleteSubmission != EnumC10460Hji.A02 ? Unit.INSTANCE : objCompleteSubmission;
    }

    private final void logSetupClick(HatchComponent hatchComponent) {
        ConfidentialVmAnalytics.INSTANCE.logSetupTap(this.setupEntryPoint, getPinScreen(), hatchComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reconnectThenAccept(X.HtJ<? super kotlin.Unit> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel.C112071
            if (r0 == 0) goto La3
            r4 = r15
            com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$reconnectThenAccept$1 r4 = (com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel.C112071) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La3
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r5 = 2
            r11 = 1
            if (r0 == 0) goto L26
            if (r0 == r11) goto L56
            if (r0 != r5) goto Laa
            X.Hwg.A00(r1)
        L23:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L26:
            X.Hwg.A00(r1)
            X.BLG<com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState> r2 = r14._uiState
        L2b:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState r0 = (com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState) r0
            com.facebook.aura.confidentialvm.model.RegisterPinStep r7 = r0.step
            java.lang.String r8 = r0.pin
            boolean r9 = r0.isPinMismatch
            boolean r10 = r0.isSubmitting
            boolean r13 = r0.isRegistrationLookupUnavailable
            r12 = 0
            X.AnonymousClass003.A0u(r7, r8)
            com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState r6 = new com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r2.A6e(r1, r6)
            if (r0 == 0) goto L2b
            com.facebook.aura.confidentialvm.HatchVmAccessController r0 = r14.accessController     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> Lb0
            r4.label = r11     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> Lb0
            java.lang.Object r1 = r0.reconnectAfterCredentialAvailableAndAwait(r4)     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> Lb0
            if (r1 != r3) goto L59
            goto Laf
        L56:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> Lb0
        L59:
            com.facebook.aura.confidentialvm.HatchVmAccessState r1 = (com.facebook.aura.confidentialvm.HatchVmAccessState) r1     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> Lb0
            goto L66
        L5c:
            r2 = move-exception
            java.lang.String r1 = "Failed to reconnect VM access after enrollment"
            java.lang.String r0 = "ConfidentialVmRegisterPinViewModel"
            X.CFK.A08(r0, r1, r2)
            com.facebook.aura.confidentialvm.HatchVmAccessState$RetriableFailure r1 = com.facebook.aura.confidentialvm.HatchVmAccessState.RetriableFailure.INSTANCE
        L66:
            boolean r0 = r1 instanceof com.facebook.aura.confidentialvm.HatchVmAccessState.Ready
            if (r0 == 0) goto L81
            com.facebook.aura.confidentialvm.model.ConfidentialVmAnalytics r1 = com.facebook.aura.confidentialvm.model.ConfidentialVmAnalytics.INSTANCE
            com.facebook.aura.confidentialvm.model.RegisterPinFlow r0 = r14.registerPinFlow
            r1.logPinRegistrationAccepted(r0)
            X.3Em<com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewEffect> r2 = r14._viewEffects
            com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewEffect$CredentialAccepted r1 = com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewEffect.CredentialAccepted.INSTANCE
            r0 = 0
            r4.L$0 = r0
            r4.label = r5
            java.lang.Object r0 = r2.emit(r1, r4)
            if (r0 != r3) goto L23
            return r3
        L81:
            X.BLG<com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState> r2 = r14._uiState
        L83:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState r0 = (com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState) r0
            com.facebook.aura.confidentialvm.model.RegisterPinStep r6 = r0.step
            java.lang.String r7 = r0.pin
            boolean r8 = r0.isPinMismatch
            boolean r12 = r0.isRegistrationLookupUnavailable
            r9 = 0
            X.AnonymousClass003.A0u(r6, r7)
            com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState r5 = new com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r2.A6e(r1, r5)
            if (r0 == 0) goto L83
            goto L23
        La3:
            com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$reconnectThenAccept$1 r4 = new com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$reconnectThenAccept$1
            r4.<init>(r15)
            goto L12
        Laa:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Laf:
            return r3
        Lb0:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel.reconnectThenAccept(X.HtJ):java.lang.Object");
    }

    private final void submitPin(String str) {
        ConfidentialVmRegisterPinUiState value;
        RegisterPinStep registerPinStep;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        BLG<ConfidentialVmRegisterPinUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            ConfidentialVmRegisterPinUiState confidentialVmRegisterPinUiState = value;
            registerPinStep = confidentialVmRegisterPinUiState.step;
            str2 = confidentialVmRegisterPinUiState.pin;
            z = confidentialVmRegisterPinUiState.isPinMismatch;
            z2 = confidentialVmRegisterPinUiState.isAwaitingReconnect;
            z3 = confidentialVmRegisterPinUiState.hasReconnectFailed;
            z4 = confidentialVmRegisterPinUiState.isRegistrationLookupUnavailable;
            AnonymousClass003.A0u(registerPinStep, str2);
        } while (!blg.A6e(value, new ConfidentialVmRegisterPinUiState(registerPinStep, str2, z, true, z2, z3, z4)));
        ConfidentialVmAnalytics.INSTANCE.logPinRegistrationSubmitted(this.registerPinFlow);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C112082(str, null), AEu.A00(this));
    }

    public final C1BN<ConfidentialVmRegisterPinUiState> getUiState() {
        return this.uiState;
    }

    public final C22I<ConfidentialVmRegisterPinViewEffect> getViewEffects() {
        return this.viewEffects;
    }

    public final void onBackClick() {
        logSetupClick(HatchComponent.BACK_BUTTON);
    }

    public final void onBackToChoose() {
        ConfidentialVmRegisterPinUiState value;
        ConfidentialVmRegisterPinUiState confidentialVmRegisterPinUiState;
        if (this._uiState.getValue().isSubmitting) {
            return;
        }
        this.chosenPin = "";
        BLG<ConfidentialVmRegisterPinUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            confidentialVmRegisterPinUiState = value;
        } while (!blg.A6e(value, new ConfidentialVmRegisterPinUiState(RegisterPinStep.CHOOSE, "", false, confidentialVmRegisterPinUiState.isSubmitting, confidentialVmRegisterPinUiState.isAwaitingReconnect, confidentialVmRegisterPinUiState.hasReconnectFailed, confidentialVmRegisterPinUiState.isRegistrationLookupUnavailable)));
    }

    public final void onLookupFailureLogOutClick() {
        logSetupClick(HatchComponent.LOGOUT_BUTTON);
        ConfidentialVmAnalytics.INSTANCE.logPinLookupFailureLogOutTap(this.registerPinFlow);
    }

    public final void onPrimaryButtonClick() {
        HatchComponent hatchComponent;
        ConfidentialVmRegisterPinUiState value;
        ConfidentialVmRegisterPinUiState confidentialVmRegisterPinUiState;
        ConfidentialVmRegisterPinUiState value2;
        RegisterPinStep registerPinStep;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ConfidentialVmRegisterPinUiState value3 = this._uiState.getValue();
        if (!value3.isPinComplete() || value3.isSubmitting) {
            return;
        }
        int iOrdinal = value3.step.ordinal();
        if (iOrdinal == 0) {
            hatchComponent = HatchComponent.CONTINUE_BUTTON;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            hatchComponent = HatchComponent.CONFIRM_BUTTON;
        }
        logSetupClick(hatchComponent);
        int iOrdinal2 = value3.step.ordinal();
        if (iOrdinal2 == 0) {
            this.chosenPin = value3.pin;
            BLG<ConfidentialVmRegisterPinUiState> blg = this._uiState;
            do {
                value = blg.getValue();
                confidentialVmRegisterPinUiState = value;
            } while (!blg.A6e(value, new ConfidentialVmRegisterPinUiState(RegisterPinStep.CONFIRM, "", false, confidentialVmRegisterPinUiState.isSubmitting, confidentialVmRegisterPinUiState.isAwaitingReconnect, confidentialVmRegisterPinUiState.hasReconnectFailed, confidentialVmRegisterPinUiState.isRegistrationLookupUnavailable)));
            return;
        }
        if (iOrdinal2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (C7384Etj.areEqual(value3.pin, this.chosenPin)) {
            this.chosenPin = "";
            submitPin(value3.pin);
            return;
        }
        BLG<ConfidentialVmRegisterPinUiState> blg2 = this._uiState;
        do {
            value2 = blg2.getValue();
            ConfidentialVmRegisterPinUiState confidentialVmRegisterPinUiState2 = value2;
            registerPinStep = confidentialVmRegisterPinUiState2.step;
            z = confidentialVmRegisterPinUiState2.isSubmitting;
            z2 = confidentialVmRegisterPinUiState2.isAwaitingReconnect;
            z3 = confidentialVmRegisterPinUiState2.hasReconnectFailed;
            z4 = confidentialVmRegisterPinUiState2.isRegistrationLookupUnavailable;
            AnonymousClass003.A0u(registerPinStep, "");
        } while (!blg2.A6e(value2, new ConfidentialVmRegisterPinUiState(registerPinStep, "", true, z, z2, z3, z4)));
    }

    public final void onRetryReconnect() {
        if (this._uiState.getValue().isAwaitingReconnect) {
            return;
        }
        logSetupClick(HatchComponent.RETRY_BUTTON);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }

    public final void onRetryRegistrationLookup() {
        ConfidentialVmRegisterPinUiState value;
        RegisterPinStep registerPinStep;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this._uiState.getValue().isSubmitting) {
            return;
        }
        logSetupClick(HatchComponent.RETRY_BUTTON);
        BLG<ConfidentialVmRegisterPinUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            ConfidentialVmRegisterPinUiState confidentialVmRegisterPinUiState = value;
            registerPinStep = confidentialVmRegisterPinUiState.step;
            str = confidentialVmRegisterPinUiState.pin;
            z = confidentialVmRegisterPinUiState.isPinMismatch;
            z2 = confidentialVmRegisterPinUiState.isAwaitingReconnect;
            z3 = confidentialVmRegisterPinUiState.hasReconnectFailed;
            z4 = confidentialVmRegisterPinUiState.isRegistrationLookupUnavailable;
            AnonymousClass003.A0u(registerPinStep, str);
        } while (!blg.A6e(value, new ConfidentialVmRegisterPinUiState(registerPinStep, str, z, true, z2, z3, z4)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(null), AEu.A00(this));
    }

    public final void onStepShown() {
        ConfidentialVmAnalytics.INSTANCE.logSetupImpression(this.setupEntryPoint, getPinScreen(), HatchComponent.CVM_SCREEN_VIEW);
    }

    public /* synthetic */ ConfidentialVmRegisterPinViewModel(ConfidentialVmRepository confidentialVmRepository, ConfidentialVmSetupGate confidentialVmSetupGate, HatchVmAccessController hatchVmAccessController, RegisterPinFlow registerPinFlow, RegisterPinEntryPoint registerPinEntryPoint, int i, C06H c06h) {
        this(confidentialVmRepository, confidentialVmSetupGate, hatchVmAccessController, registerPinFlow, (i & 16) != 0 ? null : registerPinEntryPoint);
    }
}
