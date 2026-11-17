package com.facebook.aura.activation.model;

import X.A6H;
import X.A6J;
import X.A6N;
import X.AEs;
import X.AEu;
import X.AGI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass603;
import X.BLG;
import X.Bs8;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C10543Hqv;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3rb;
import X.C7384Etj;
import X.C78T;
import X.C7BY;
import X.CFK;
import X.CH0;
import X.EnumC10460Hji;
import X.Ey9;
import X.F2X;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.G2l;
import X.GAo;
import X.Ht9;
import X.HtJ;
import X.HwV;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.InterfaceC2349BUy;
import com.facebook.aura.activation.data.ActivationState;
import com.facebook.aura.activation.data.HatchActivationWaitlistInviteCopy;
import com.facebook.aura.activation.model.AgeStep;
import com.facebook.aura.activation.repo.AuraActivationRepository;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.ageverification.intf.AgeCheckStep;
import com.facebook.aura.ageverification.intf.AgeCheckVia;
import com.facebook.aura.ageverification.intf.AgeVerification;
import com.facebook.aura.ageverification.intf.AgeVerificationIntegration;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionLogger;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.ConfidentialVmSetupGate;
import com.facebook.aura.confidentialvm.HatchVmAccessController;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchVmRepository;
import com.facebook.aura.gateway.HatchlingVmType;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.perf.HatchActivationQplLogger;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.startup.HatchGatewayStartupRequirement;
import com.facebook.aura.user.provider.AgeCheckLayout;
import com.facebook.aura.user.provider.AgeCheckMethod;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import com.facebook.aura.user.provider.HatchActivationWaitlistInviteCopyStore;
import com.facebook.aura.user.repo.AuraUserRepository;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.utils.MC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AuraActivationViewModel extends AEs {
    public static final Companion Companion = new Companion();
    public final BLG<UiState> _uiState;
    public final C3Em<ViewEffect> _viewEffect;
    public final AuraActivationRepository activationRepository;
    public final AtomicReference<AgeCheckSource> ageBlockedAfter;
    public boolean ageCaptureFilesCleared;
    public final AtomicReference<AgeCheckSource> ageCheckRefreshInFlight;
    public final C1BN<String> ageChoice;
    public AgeCheckVia ageStepVia;
    public final ConfidentialVmSetupGate confidentialVmSetupGate;
    public final AuraUserData defaultUserData;
    public AgeStep entryAgeStep;
    public final AtomicBoolean hasLeasedVmForActivation;
    public final ActivationState initialActivationState;
    public final AuraUserData initialUserData;
    public final BLG<Boolean> inviteCodeRequested;
    public final BLG<Boolean> isVmConnectionCacheReady;
    public final C20Q<Boolean> isVmReadyForAdmission;
    public final C20Q<Boolean> isWearablesStepOutstanding;
    public final AtomicBoolean leasedAfterEmptyInventory;
    public final boolean ownsInitialGatewayConnect;
    public String pendingAgeMethodPoint;
    public boolean pointsNextAgeStep;
    public final AtomicBoolean provisioningInFlight;
    public final A6N savedStateHandle;
    public HxE<String, ? extends AgeStep> shownAgeStep;
    public final AtomicBoolean startupGatewayConnectPending;
    public final C1BN<UiState> uiState;
    public final AuraUserRepository userRepository;
    public final AbstractC3358CGz userSession;
    public final C22I<ViewEffect> viewEffect;
    public final AuraViewerDataProvider viewerDataProvider;
    public final HatchVmAccessController vmAccessController;
    public final AtomicInteger vmProvisioningAttempt;
    public final HatchActivationWaitlistInviteCopyStore waitlistInviteCopyStore;
    public final BLG<Boolean> wearablesStepRequested;
    public final BLG<Boolean> wearablesStepResolved;

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$1", f = "AuraActivationViewModel.kt", l = {223}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final /* synthetic */ class C00031 implements C20Z, InterfaceC2349BUy {
            public final /* synthetic */ ActivationStepLogging $tmp0;

            public C00031(ActivationStepLogging activationStepLogging) {
                this.$tmp0 = activationStepLogging;
            }

            public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                this.$tmp0.onAppForegroundChanged(z);
                return Unit.INSTANCE;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof C20Z) && (obj instanceof InterfaceC2349BUy)) {
                    return C3cI.A1V(obj, getFunctionDelegate());
                }
                return false;
            }

            @Override // X.InterfaceC2349BUy
            public final Ht9<?> getFunctionDelegate() {
                return new F2X(2, this.$tmp0, ActivationStepLogging.class, "onAppForegroundChanged", "onAppForegroundChanged(Z)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                this.$tmp0.onAppForegroundChanged(AnonymousClass001.A1X(obj));
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<Boolean> c20q = AuraAppLifecycleManager.isAppInForegroundFlow;
                C00031 c00031 = new C00031(ActivationStepLogging.INSTANCE);
                this.label = 1;
                if (c20q.collect(c00031, this) == enumC10460Hji) {
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
            return new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$2", f = "AuraActivationViewModel.kt", l = {228}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraActivationViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final AuraActivationViewModel auraActivationViewModel = AuraActivationViewModel.this;
                C1BN<HatchActivationWaitlistInviteCopy> c1bn = auraActivationViewModel.waitlistInviteCopyStore.copy;
                C20Z<? super HatchActivationWaitlistInviteCopy> c20z = new C20Z() { // from class: com.facebook.aura.activation.model.AuraActivationViewModel.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchActivationWaitlistInviteCopy) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HatchActivationWaitlistInviteCopy hatchActivationWaitlistInviteCopy, HtJ<? super Unit> htJ) {
                        UiState value;
                        BLG<UiState> blg = auraActivationViewModel._uiState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, UiState.copy$default(value, null, null, false, false, false, 0, null, false, false, false, hatchActivationWaitlistInviteCopy, null, false, 0, 15359, null)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AuraActivationViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$3", f = "AuraActivationViewModel.kt", l = {276}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$3$1, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass1 extends F2X implements G2j {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(4, HwV.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(AuraUserData auraUserData, String str, boolean z, HtJ<? super HwV<AuraUserData, String, Boolean>> htJ) {
                return new HwV(auraUserData, str, Boolean.valueOf(z));
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return new HwV(obj, obj2, obj3);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$3$2", f = "AuraActivationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$3$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G2l<HwV<? extends AuraUserData, ? extends String, ? extends Boolean>, Boolean, Boolean, Boolean, Boolean, HtJ<? super ActivationSnapshot>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public /* synthetic */ boolean Z$1;
            public /* synthetic */ boolean Z$2;
            public /* synthetic */ boolean Z$3;
            public int label;
            public final /* synthetic */ AuraActivationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AuraActivationViewModel auraActivationViewModel, HtJ<? super AnonymousClass2> htJ) {
                super(6, htJ);
                this.this$0 = auraActivationViewModel;
            }

            public final Object invoke(HwV<AuraUserData, String, Boolean> hwV, boolean z, boolean z2, boolean z3, boolean z4, HtJ<? super ActivationSnapshot> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, htJ);
                anonymousClass2.L$0 = hwV;
                anonymousClass2.Z$0 = z;
                anonymousClass2.Z$1 = z2;
                anonymousClass2.Z$2 = z3;
                anonymousClass2.Z$3 = z4;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HwV hwV = (HwV) this.L$0;
                boolean z = this.Z$0;
                boolean z2 = this.Z$1;
                boolean z3 = this.Z$2;
                boolean z4 = this.Z$3;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                AuraUserData auraUserData = (AuraUserData) hwV.first;
                String str = (String) hwV.second;
                boolean zA1X = AnonymousClass001.A1X(hwV.third);
                if (auraUserData == null) {
                    auraUserData = this.this$0.defaultUserData;
                }
                ActivationState activationStateResolveActivationState = this.this$0.resolveActivationState(auraUserData, z, z2, z3, z4);
                AgeStep ageStepResolveAgeStep = this.this$0.resolveAgeStep(auraUserData, str);
                if (!zA1X && str == null) {
                    ageStepResolveAgeStep = null;
                }
                return new ActivationSnapshot(auraUserData, activationStateResolveActivationState, z4, str, ageStepResolveAgeStep);
            }

            @Override // X.G2l
            public /* bridge */ /* synthetic */ Object invoke(HwV<? extends AuraUserData, ? extends String, ? extends Boolean> hwV, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, HtJ<? super ActivationSnapshot> htJ) {
                return invoke((HwV<AuraUserData, String, Boolean>) hwV, AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), AnonymousClass001.A1X(bool3), AnonymousClass001.A1X(bool4), htJ);
            }
        }

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraActivationViewModel.this.new AnonymousClass3(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                final C10543Hqv c10543HqvA10 = C3cG.A10(obj);
                AuraActivationViewModel auraActivationViewModel = AuraActivationViewModel.this;
                AnonymousClass603 anonymousClass603 = new AnonymousClass603(3, new AnonymousClass2(auraActivationViewModel, null), new C20Q[]{C3rb.A00(AnonymousClass1.INSTANCE, auraActivationViewModel.viewerDataProvider.userData, auraActivationViewModel.ageChoice, auraActivationViewModel.userRepository.hasFinishedFetch), auraActivationViewModel.isWearablesStepOutstanding, auraActivationViewModel.confidentialVmSetupGate.isSetupRequired, auraActivationViewModel.isVmReadyForAdmission, auraActivationViewModel.inviteCodeRequested});
                final AuraActivationViewModel auraActivationViewModel2 = AuraActivationViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.activation.model.AuraActivationViewModel.3.3

                    /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$3$3$WhenMappings */
                    public abstract /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[ActivationState.values().length];
                            try {
                                AnonymousClass002.A13(ActivationState.VM_PROVISIONING, iArr);
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                AnonymousClass002.A14(ActivationState.FULLY_ACTIVATED, iArr);
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((ActivationSnapshot) obj2, (HtJ<? super Unit>) htJ);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
                    /* JADX WARN: Type inference failed for: r7v0, types: [T, com.facebook.aura.activation.data.ActivationState, java.lang.Enum, java.lang.Object] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(com.facebook.aura.activation.model.ActivationSnapshot r29, X.HtJ<? super kotlin.Unit> r30) {
                        /*
                            Method dump skipped, instructions count: 329
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraActivationViewModel.AnonymousClass3.C00043.emit(com.facebook.aura.activation.model.ActivationSnapshot, X.HtJ):java.lang.Object");
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (anonymousClass603.collect(c20z, this) == enumC10460Hji) {
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
            return AuraActivationViewModel.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$4", f = "AuraActivationViewModel.kt", l = {343}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraActivationViewModel.this.new AnonymousClass4(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraActivationRepository auraActivationRepository = AuraActivationViewModel.this.activationRepository;
                this.label = 1;
                if (auraActivationRepository.refreshTosStatus(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            AuraUserData value2 = AuraActivationViewModel.this.viewerDataProvider.userData.getValue();
            if (value2 == null) {
                value2 = AuraActivationViewModel.this.defaultUserData;
            }
            AuraActivationViewModel auraActivationViewModel = AuraActivationViewModel.this;
            ActivationState activationStateResolveActivationState$default = AuraActivationViewModel.resolveActivationState$default(auraActivationViewModel, value2, false, C3cH.A1R(auraActivationViewModel.confidentialVmSetupGate.isSetupRequired), AuraActivationViewModel.this.currentVmAdmissionReadiness(), false, 18, null);
            AuraActivationViewModel auraActivationViewModel2 = AuraActivationViewModel.this;
            BLG<UiState> blg = auraActivationViewModel2._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, UiState.copy$default(value, value2, activationStateResolveActivationState$default, auraActivationViewModel2.showsAgeBlockedScreen(value2, activationStateResolveActivationState$default), false, false, 0, null, false, auraActivationViewModel2.showsActivationSubscriptionUpgradeCard(value2), false, null, null, false, 0, 16112, null)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AuraActivationViewModel.this.new AnonymousClass4(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<AuraActivationViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AuraActivationViewModel create(A6J a6j) {
            C7384Etj.A0Y(a6j, 0);
            return new AuraActivationViewModel(AuraViewerDataProvider.Companion.getInstance(this.userSession), AuraActivationRepository.Companion.getInstance(this.userSession), AuraUserRepository.Companion.getInstance(this.userSession), ConfidentialVmSetupGate.Companion.getInstance(this.userSession), HatchVmAccessController.Companion.getInstance(this.userSession), this.userSession, A6H.A00(a6j));
        }
    }

    public final class UiState extends C06G {
        public final ActivationState activationState;
        public final AgeStep ageStep;
        public final boolean canReturnToWaitlist;
        public final int failedSelfieAgeRefreshes;
        public final boolean isJoiningWaitlist;
        public final boolean isVerifyingCachedTosRequired;
        public final boolean provisionsConfidentialVm;
        public final boolean showAgeBlockedScreen;
        public final boolean showsActivationSubscriptionUpgradeCard;
        public final boolean showsAgeLogOutConfirmation;
        public final AuraUserData userData;
        public final VmProvisioningFailureRequest vmProvisioningFailureRequest;
        public final HatchActivationWaitlistInviteCopy waitlistInviteCopy;
        public final int waitlistJoinCelebrationId;

        public static /* synthetic */ UiState copy$default(UiState uiState, AuraUserData auraUserData, ActivationState activationState, boolean z, boolean z2, boolean z3, int i, VmProvisioningFailureRequest vmProvisioningFailureRequest, boolean z4, boolean z5, boolean z6, HatchActivationWaitlistInviteCopy hatchActivationWaitlistInviteCopy, AgeStep ageStep, boolean z7, int i2, int i3, Object obj) {
            AuraUserData auraUserData2 = auraUserData;
            ActivationState activationState2 = activationState;
            boolean z8 = z2;
            boolean z9 = z3;
            int i4 = i;
            VmProvisioningFailureRequest vmProvisioningFailureRequest2 = vmProvisioningFailureRequest;
            boolean z10 = z4;
            boolean z11 = z5;
            boolean z12 = z6;
            HatchActivationWaitlistInviteCopy hatchActivationWaitlistInviteCopy2 = hatchActivationWaitlistInviteCopy;
            AgeStep ageStep2 = ageStep;
            boolean z13 = z7;
            int i5 = i2;
            if ((i3 & 1) != 0) {
                auraUserData2 = uiState.userData;
            }
            if ((i3 & 2) != 0) {
                activationState2 = uiState.activationState;
            }
            if ((i3 & 4) != 0) {
                z = uiState.showAgeBlockedScreen;
            }
            if ((i3 & 8) != 0) {
                z8 = uiState.isVerifyingCachedTosRequired;
            }
            if ((i3 & 16) != 0) {
                z9 = uiState.isJoiningWaitlist;
            }
            if ((i3 & 32) != 0) {
                i4 = uiState.waitlistJoinCelebrationId;
            }
            if ((i3 & 64) != 0) {
                vmProvisioningFailureRequest2 = uiState.vmProvisioningFailureRequest;
            }
            if ((i3 & 128) != 0) {
                z10 = uiState.canReturnToWaitlist;
            }
            if ((i3 & 256) != 0) {
                z11 = uiState.showsActivationSubscriptionUpgradeCard;
            }
            if ((i3 & 512) != 0) {
                z12 = uiState.provisionsConfidentialVm;
            }
            if ((i3 & 1024) != 0) {
                hatchActivationWaitlistInviteCopy2 = uiState.waitlistInviteCopy;
            }
            if ((i3 & 2048) != 0) {
                ageStep2 = uiState.ageStep;
            }
            if ((i3 & 4096) != 0) {
                z13 = uiState.showsAgeLogOutConfirmation;
            }
            if ((i3 & 8192) != 0) {
                i5 = uiState.failedSelfieAgeRefreshes;
            }
            AnonymousClass003.A0u(auraUserData2, activationState2);
            return new UiState(auraUserData2, activationState2, z, z8, z9, i4, vmProvisioningFailureRequest2, z10, z11, z12, hatchActivationWaitlistInviteCopy2, ageStep2, z13, i5);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (!C7384Etj.areEqual(this.userData, uiState.userData) || this.activationState != uiState.activationState || this.showAgeBlockedScreen != uiState.showAgeBlockedScreen || this.isVerifyingCachedTosRequired != uiState.isVerifyingCachedTosRequired || this.isJoiningWaitlist != uiState.isJoiningWaitlist || this.waitlistJoinCelebrationId != uiState.waitlistJoinCelebrationId || this.vmProvisioningFailureRequest != uiState.vmProvisioningFailureRequest || this.canReturnToWaitlist != uiState.canReturnToWaitlist || this.showsActivationSubscriptionUpgradeCard != uiState.showsActivationSubscriptionUpgradeCard || this.provisionsConfidentialVm != uiState.provisionsConfidentialVm || !C7384Etj.areEqual(this.waitlistInviteCopy, uiState.waitlistInviteCopy) || !C7384Etj.areEqual(this.ageStep, uiState.ageStep) || this.showsAgeLogOutConfirmation != uiState.showsAgeLogOutConfirmation || this.failedSelfieAgeRefreshes != uiState.failedSelfieAgeRefreshes) {
                    }
                }
                return false;
            }
            return true;
        }

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ActivationState.values().length];
                try {
                    AnonymousClass002.A13(ActivationState.REQUEST_WAITLIST, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(ActivationState.ALREADY_WAITLISTED, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(ActivationState.LIMITED_WAITLIST, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(ActivationState.REQUEST_INVITE_CODE, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    AnonymousClass002.A17(ActivationState.NAME_REQUIRED, iArr);
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ UiState(AuraUserData auraUserData, ActivationState activationState, boolean z, boolean z2, boolean z3, int i, VmProvisioningFailureRequest vmProvisioningFailureRequest, boolean z4, boolean z5, boolean z6, HatchActivationWaitlistInviteCopy hatchActivationWaitlistInviteCopy, AgeStep ageStep, boolean z7, int i2, int i3, C06H c06h) {
            this(auraUserData, activationState, C3cG.A1K(i3 & 4, z), C3cG.A1K(i3 & 8, z2), C3cI.A1S(i3, z3), (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? null : vmProvisioningFailureRequest, C3cH.A1N(i3, z4), C3cG.A1K(i3 & 256, z5), C3cG.A1K(i3 & 512, z6), (i3 & 1024) != 0 ? null : hatchActivationWaitlistInviteCopy, (i3 & 2048) != 0 ? null : ageStep, C3cG.A1K(i3 & 4096, z7), (i3 & 8192) != 0 ? 0 : i2);
        }

        public final AuraUserData component1() {
            return this.userData;
        }

        public final boolean component10() {
            return this.provisionsConfidentialVm;
        }

        public final HatchActivationWaitlistInviteCopy component11() {
            return this.waitlistInviteCopy;
        }

        public final AgeStep component12() {
            return this.ageStep;
        }

        public final boolean component13() {
            return this.showsAgeLogOutConfirmation;
        }

        public final int component14() {
            return this.failedSelfieAgeRefreshes;
        }

        public final ActivationState component2() {
            return this.activationState;
        }

        public final boolean component3() {
            return this.showAgeBlockedScreen;
        }

        public final boolean component4() {
            return this.isVerifyingCachedTosRequired;
        }

        public final boolean component5() {
            return this.isJoiningWaitlist;
        }

        public final int component6() {
            return this.waitlistJoinCelebrationId;
        }

        public final VmProvisioningFailureRequest component7() {
            return this.vmProvisioningFailureRequest;
        }

        public final boolean component8() {
            return this.canReturnToWaitlist;
        }

        public final boolean component9() {
            return this.showsActivationSubscriptionUpgradeCard;
        }

        public final ActivationState getActivationState() {
            return this.activationState;
        }

        public final AgeStep getAgeStep() {
            return this.ageStep;
        }

        public final boolean getCanReturnToWaitlist() {
            return this.canReturnToWaitlist;
        }

        public final int getFailedSelfieAgeRefreshes() {
            return this.failedSelfieAgeRefreshes;
        }

        public final boolean getProvisionsConfidentialVm() {
            return this.provisionsConfidentialVm;
        }

        public final HatchActivationWaitlistInviteCopy.Screen getScreenCopy() {
            HatchActivationWaitlistInviteCopy hatchActivationWaitlistInviteCopy;
            int iOrdinal = this.activationState.ordinal();
            if (iOrdinal == 6) {
                HatchActivationWaitlistInviteCopy hatchActivationWaitlistInviteCopy2 = this.waitlistInviteCopy;
                if (hatchActivationWaitlistInviteCopy2 != null) {
                    return hatchActivationWaitlistInviteCopy2.waitlistChoice;
                }
                return null;
            }
            if (iOrdinal == 7) {
                HatchActivationWaitlistInviteCopy hatchActivationWaitlistInviteCopy3 = this.waitlistInviteCopy;
                if (hatchActivationWaitlistInviteCopy3 != null) {
                    return hatchActivationWaitlistInviteCopy3.waitlisted;
                }
                return null;
            }
            if (iOrdinal == 8) {
                HatchActivationWaitlistInviteCopy hatchActivationWaitlistInviteCopy4 = this.waitlistInviteCopy;
                if (hatchActivationWaitlistInviteCopy4 != null) {
                    return hatchActivationWaitlistInviteCopy4.waitlistedLimited;
                }
                return null;
            }
            if (iOrdinal != 5) {
                if (iOrdinal != 13 || (hatchActivationWaitlistInviteCopy = this.waitlistInviteCopy) == null) {
                    return null;
                }
                return hatchActivationWaitlistInviteCopy.nameDialog;
            }
            HatchActivationWaitlistInviteCopy hatchActivationWaitlistInviteCopy5 = this.waitlistInviteCopy;
            if (hatchActivationWaitlistInviteCopy5 != null) {
                return hatchActivationWaitlistInviteCopy5.enterInviteCode;
            }
            return null;
        }

        public final boolean getShowAgeBlockedScreen() {
            return this.showAgeBlockedScreen;
        }

        public final boolean getShowsActivationSubscriptionUpgradeCard() {
            return this.showsActivationSubscriptionUpgradeCard;
        }

        public final boolean getShowsAgeLogOutConfirmation() {
            return this.showsAgeLogOutConfirmation;
        }

        public final AuraUserData getUserData() {
            return this.userData;
        }

        public final VmProvisioningFailureRequest getVmProvisioningFailureRequest() {
            return this.vmProvisioningFailureRequest;
        }

        public final HatchActivationWaitlistInviteCopy getWaitlistInviteCopy() {
            return this.waitlistInviteCopy;
        }

        public final int getWaitlistJoinCelebrationId() {
            return this.waitlistJoinCelebrationId;
        }

        public int hashCode() {
            return C0KA.A01((((C0KA.A01(C0KA.A01(C0KA.A01((((C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.activationState, AnonymousClass005.A0E(this.userData)), this.showAgeBlockedScreen), this.isVerifyingCachedTosRequired), this.isJoiningWaitlist) + this.waitlistJoinCelebrationId) * 31) + AnonymousClass006.A0D(this.vmProvisioningFailureRequest)) * 31, this.canReturnToWaitlist), this.showsActivationSubscriptionUpgradeCard), this.provisionsConfidentialVm) + AnonymousClass006.A0D(this.waitlistInviteCopy)) * 31) + C3cH.A02(this.ageStep)) * 31, this.showsAgeLogOutConfirmation) + this.failedSelfieAgeRefreshes;
        }

        public final boolean isJoiningWaitlist() {
            return this.isJoiningWaitlist;
        }

        public final boolean isVerifyingCachedTosRequired() {
            return this.isVerifyingCachedTosRequired;
        }

        public final UiState copy(AuraUserData auraUserData, ActivationState activationState, boolean z, boolean z2, boolean z3, int i, VmProvisioningFailureRequest vmProvisioningFailureRequest, boolean z4, boolean z5, boolean z6, HatchActivationWaitlistInviteCopy hatchActivationWaitlistInviteCopy, AgeStep ageStep, boolean z7, int i2) {
            AnonymousClass003.A0u(auraUserData, activationState);
            return new UiState(auraUserData, activationState, z, z2, z3, i, vmProvisioningFailureRequest, z4, z5, z6, hatchActivationWaitlistInviteCopy, ageStep, z7, i2);
        }

        public final boolean isAwaitingScreenCopy() {
            if (getScreenCopy() != null) {
                return false;
            }
            ActivationState activationState = this.activationState;
            return activationState.isWaitlistSurface() || activationState == ActivationState.REQUEST_INVITE_CODE || activationState == ActivationState.NAME_REQUIRED;
        }

        public String toString() {
            return super.toString();
        }

        public UiState(AuraUserData auraUserData, ActivationState activationState, boolean z, boolean z2, boolean z3, int i, VmProvisioningFailureRequest vmProvisioningFailureRequest, boolean z4, boolean z5, boolean z6, HatchActivationWaitlistInviteCopy hatchActivationWaitlistInviteCopy, AgeStep ageStep, boolean z7, int i2) {
            AnonymousClass003.A0u(auraUserData, activationState);
            this.userData = auraUserData;
            this.activationState = activationState;
            this.showAgeBlockedScreen = z;
            this.isVerifyingCachedTosRequired = z2;
            this.isJoiningWaitlist = z3;
            this.waitlistJoinCelebrationId = i;
            this.vmProvisioningFailureRequest = vmProvisioningFailureRequest;
            this.canReturnToWaitlist = z4;
            this.showsActivationSubscriptionUpgradeCard = z5;
            this.provisionsConfidentialVm = z6;
            this.waitlistInviteCopy = hatchActivationWaitlistInviteCopy;
            this.ageStep = ageStep;
            this.showsAgeLogOutConfirmation = z7;
            this.failedSelfieAgeRefreshes = i2;
        }
    }

    public interface ViewEffect {

        public final class JoinWaitlistFailed implements ViewEffect {
            public static final JoinWaitlistFailed INSTANCE = new JoinWaitlistFailed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof JoinWaitlistFailed);
            }

            public String toString() {
                return "JoinWaitlistFailed";
            }

            public int hashCode() {
                return -1367129118;
            }
        }

        public final class LogOut implements ViewEffect {
            public static final LogOut INSTANCE = new LogOut();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof LogOut);
            }

            public String toString() {
                return "LogOut";
            }

            public int hashCode() {
                return 1474502610;
            }
        }

        public final class NavigateBack implements ViewEffect {
            public static final NavigateBack INSTANCE = new NavigateBack();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateBack);
            }

            public String toString() {
                return "NavigateBack";
            }

            public int hashCode() {
                return 1644753504;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class VmProvisioningFailureRequest {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ VmProvisioningFailureRequest[] $VALUES;
        public static final VmProvisioningFailureRequest FETCH;
        public static final VmProvisioningFailureRequest LEASE;
        public static final VmProvisioningFailureRequest UNKNOWN;

        static {
            VmProvisioningFailureRequest vmProvisioningFailureRequest = new VmProvisioningFailureRequest("FETCH", 0);
            FETCH = vmProvisioningFailureRequest;
            VmProvisioningFailureRequest vmProvisioningFailureRequest2 = new VmProvisioningFailureRequest("LEASE", 1);
            LEASE = vmProvisioningFailureRequest2;
            VmProvisioningFailureRequest vmProvisioningFailureRequest3 = new VmProvisioningFailureRequest("UNKNOWN", 2);
            UNKNOWN = vmProvisioningFailureRequest3;
            VmProvisioningFailureRequest[] vmProvisioningFailureRequestArr = {vmProvisioningFailureRequest, vmProvisioningFailureRequest2, vmProvisioningFailureRequest3};
            $VALUES = vmProvisioningFailureRequestArr;
            $ENTRIES = C3cG.A0w(vmProvisioningFailureRequestArr);
        }

        public static Ey9<VmProvisioningFailureRequest> getEntries() {
            return $ENTRIES;
        }

        public static VmProvisioningFailureRequest valueOf(String str) {
            return (VmProvisioningFailureRequest) Enum.valueOf(VmProvisioningFailureRequest.class, str);
        }

        public static VmProvisioningFailureRequest[] values() {
            return (VmProvisioningFailureRequest[]) $VALUES.clone();
        }

        public VmProvisioningFailureRequest(String str, int i) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$clearAgeCaptureFiles$1", f = "AuraActivationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$clearAgeCaptureFiles$1, reason: invalid class name and case insensitive filesystem */
    public final class C106631 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AgeVerificationIntegration $integration;
        public int label;
        public final /* synthetic */ AuraActivationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106631(AgeVerificationIntegration ageVerificationIntegration, AuraActivationViewModel auraActivationViewModel, HtJ<? super C106631> htJ) {
            super(2, htJ);
            this.$integration = ageVerificationIntegration;
            this.this$0 = auraActivationViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C106631(this.$integration, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            this.$integration.clearCaptureFiles(((CH0) this.this$0.userSession).A01);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C106631) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$connectGatewayIfProvisioned$1", f = "AuraActivationViewModel.kt", l = {867, 870}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$connectGatewayIfProvisioned$1, reason: invalid class name and case insensitive filesystem */
    public final class C106641 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public boolean Z$0;
        public boolean Z$1;
        public int label;

        public C106641(HtJ<? super C106641> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraActivationViewModel.this.new C106641(htJ);
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x00a9: IF  (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:44:0x00ba (LINE:169), block:B:39:0x00a9 */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z;
            boolean zCompareAndSet;
            HatchGatewayConnection gateway;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                if (z) {
                    HatchGatewayStartupRequirement hatchGatewayStartupRequirement = HatchGatewayStartupRequirement.INSTANCE;
                    String message = e2.getMessage();
                    if (message == null) {
                        message = C3cI.A0Y(e2);
                    }
                    hatchGatewayStartupRequirement.reportGatewayConnectFailure(message);
                }
                CFK.A08(AuraActivationViewModelKt.TAG, "Failed to connect gateway after activation resolved", e2);
            }
            if (i == 0) {
                Hwg.A00(obj);
                zCompareAndSet = AuraActivationViewModel.this.startupGatewayConnectPending.compareAndSet(true, false);
                if (zCompareAndSet) {
                    HatchGatewayStartupRequirement.INSTANCE.reportGatewayConnectStart();
                }
                AuraUserData value = AuraActivationViewModel.this.viewerDataProvider.userData.getValue();
                if (value != null && AnonymousClass002.A1b(value.hasProvisionedVm, true)) {
                    gateway = HatchGatewayServiceManager.INSTANCE.getGateway(AuraActivationViewModel.this.userSession);
                    if (!gateway.isConnected()) {
                        C78T c78tA0y = AnonymousClass001.A0y();
                        AuraActivationViewModel$connectGatewayIfProvisioned$1$connectStarted$1 auraActivationViewModel$connectGatewayIfProvisioned$1$connectStarted$1 = new AuraActivationViewModel$connectGatewayIfProvisioned$1$connectStarted$1(gateway, null);
                        this.L$0 = gateway;
                        this.Z$0 = zCompareAndSet;
                        this.label = 1;
                        obj = GAo.A00(this, c78tA0y, auraActivationViewModel$connectGatewayIfProvisioned$1$connectStarted$1);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else if (zCompareAndSet) {
                        HatchGatewayStartupRequirement.INSTANCE.reportGatewayConnectSuccess();
                    }
                } else if (zCompareAndSet) {
                    HatchGatewayStartupRequirement.INSTANCE.reportGatewayConnectFailure("VM is not provisioned");
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                boolean z2 = this.Z$0;
                Hwg.A00(obj);
                HatchGatewayStartupRequirement.INSTANCE.reportGatewayConnectSuccess();
                return Unit.INSTANCE;
            }
            zCompareAndSet = this.Z$0;
            gateway = (HatchGatewayConnection) this.L$0;
            Hwg.A00(obj);
            boolean zA1X = AnonymousClass001.A1X(obj);
            if (zCompareAndSet) {
                if (zA1X || gateway.isConnected()) {
                    this.L$0 = null;
                    this.Z$0 = zCompareAndSet;
                    this.Z$1 = zA1X;
                    this.label = 2;
                    if (gateway.awaitConnected(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    HatchGatewayStartupRequirement.INSTANCE.reportGatewayConnectSuccess();
                } else {
                    HatchGatewayStartupRequirement.INSTANCE.reportGatewayConnectFailure("Connect was rejected");
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AuraActivationViewModel.this.new C106641(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel", f = "AuraActivationViewModel.kt", l = {835, 843}, m = "leaseVmWithRetries", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$leaseVmWithRetries$1, reason: invalid class name and case insensitive filesystem */
    public final class C106651 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C106651(HtJ<? super C106651> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraActivationViewModel.this.leaseVmWithRetries(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$onJoinWaitlistClick$2", f = "AuraActivationViewModel.kt", l = {981}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$onJoinWaitlistClick$2, reason: invalid class name and case insensitive filesystem */
    public final class C106662 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $source;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106662(String str, HtJ<? super C106662> htJ) {
            super(2, htJ);
            this.$source = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraActivationViewModel.this.new C106662(this.$source, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 361
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraActivationViewModel.C106662.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C106662) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$onWearablesLinked$1, reason: invalid class name and case insensitive filesystem */
    public final class C106671 extends AbstractC7559F3s implements G0U<AuraUserData, AuraUserData> {
        public static final C106671 INSTANCE = new C106671();

        public C106671() {
            super(1);
        }

        @Override // X.G0U
        public final AuraUserData invoke(AuraUserData auraUserData) {
            C7384Etj.A0Y(auraUserData, 0);
            return AuraUserData.copy$default(auraUserData, null, null, null, null, null, null, false, false, null, null, false, true, false, null, false, null, null, null, null, null, null, null, null, null, 16775167, null);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$refresh$1", f = "AuraActivationViewModel.kt", l = {373}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C106681 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ActivationState $previousState;
        public final /* synthetic */ String $trigger;
        public int label;
        public final /* synthetic */ AuraActivationViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$refresh$1$1", f = "AuraActivationViewModel.kt", l = {MC.xe_feta_entrypoint_rl.__CONFIG__}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$refresh$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00051 extends AbstractC07127nr implements G0U<HtJ<? super AuraUserData>, Object> {
            public int label;
            public final /* synthetic */ AuraActivationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00051(AuraActivationViewModel auraActivationViewModel, HtJ<? super C00051> htJ) {
                super(1, htJ);
                this.this$0 = auraActivationViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C00051(this.this$0, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super AuraUserData> htJ) {
                return new C00051(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    AuraUserRepository auraUserRepository = this.this$0.userRepository;
                    this.label = 1;
                    obj = auraUserRepository.fetchUser(false, this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106681(ActivationState activationState, String str, AuraActivationViewModel auraActivationViewModel, HtJ<? super C106681> htJ) {
            super(2, htJ);
            this.$previousState = activationState;
            this.$trigger = str;
            this.this$0 = auraActivationViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C106681(this.$previousState, this.$trigger, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchActivationQplLogger hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
                ActivationState activationState = this.$previousState;
                String str = this.$trigger;
                C00051 c00051 = new C00051(this.this$0, null);
                this.label = 1;
                if (hatchActivationQplLogger.traceStatusRefresh(activationState, str, c00051, this) == enumC10460Hji) {
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
            return ((C106681) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$refreshAfterServerAgeCheck$1", f = "AuraActivationViewModel.kt", l = {530}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$refreshAfterServerAgeCheck$1, reason: invalid class name and case insensitive filesystem */
    public final class C106691 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ActivationState $previousState;
        public final /* synthetic */ AgeCheckSource $source;
        public int label;
        public final /* synthetic */ AuraActivationViewModel this$0;

        /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$refreshAfterServerAgeCheck$1$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AgeCheckSource.values().length];
                try {
                    AnonymousClass002.A13(AgeCheckSource.LINKING, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(AgeCheckSource.SELFIE, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106691(ActivationState activationState, AgeCheckSource ageCheckSource, AuraActivationViewModel auraActivationViewModel, HtJ<? super C106691> htJ) {
            super(2, htJ);
            this.$previousState = activationState;
            this.$source = ageCheckSource;
            this.this$0 = auraActivationViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C106691(this.$previousState, this.$source, this.this$0, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Exception {
            /*
                r22 = this;
                r2 = r23
                X.Hji r7 = X.EnumC10460Hji.A02
                r5 = r22
                int r0 = r5.label
                r8 = 0
                r6 = 1
                r10 = 0
                if (r0 == 0) goto L67
                if (r0 != r6) goto L8d
                X.Hwg.A00(r2)
            L12:
                com.facebook.aura.user.provider.AuraUserData r2 = (com.facebook.aura.user.provider.AuraUserData) r2
                if (r2 == 0) goto L28
                com.facebook.aura.activation.data.ActivationState$Companion r1 = com.facebook.aura.activation.data.ActivationState.Companion
                X.5as r0 = r2.ageConfirmationStatus
                boolean r0 = r1.isBlocked(r0)
                if (r0 != 0) goto L64
                X.5as r0 = r2.ageConfirmationStatus
                boolean r0 = r1.isAgeVerifiedRequired(r0)
                if (r0 == 0) goto L64
            L28:
                com.facebook.aura.activation.model.AuraActivationViewModel r0 = r5.this$0
                java.util.concurrent.atomic.AtomicReference<com.facebook.aura.activation.model.AgeCheckSource> r1 = r0.ageCheckRefreshInFlight
                com.facebook.aura.activation.model.AgeCheckSource r0 = r5.$source
                X.Bs8.A00(r0, r8, r1)
                com.facebook.aura.activation.model.AgeCheckSource r1 = r5.$source
                com.facebook.aura.activation.model.AgeCheckSource r0 = com.facebook.aura.activation.model.AgeCheckSource.SELFIE
                if (r1 != r0) goto L64
                com.facebook.aura.activation.model.AuraActivationViewModel r0 = r5.this$0
                X.BLG<com.facebook.aura.activation.model.AuraActivationViewModel$UiState> r2 = r0._uiState
            L3b:
                java.lang.Object r1 = r2.getValue()
                r7 = r1
                com.facebook.aura.activation.model.AuraActivationViewModel$UiState r7 = (com.facebook.aura.activation.model.AuraActivationViewModel.UiState) r7
                int r0 = r7.failedSelfieAgeRefreshes
                int r21 = r0 + 1
                r22 = 8191(0x1fff, float:1.1478E-41)
                r9 = r8
                r11 = r10
                r12 = r10
                r13 = r10
                r14 = r8
                r15 = r10
                r16 = r10
                r17 = r10
                r18 = r8
                r19 = r8
                r20 = r10
                r23 = r8
                com.facebook.aura.activation.model.AuraActivationViewModel$UiState r0 = com.facebook.aura.activation.model.AuraActivationViewModel.UiState.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                boolean r0 = r2.A6e(r1, r0)
                if (r0 == 0) goto L3b
            L64:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L67:
                X.Hwg.A00(r2)
                com.facebook.aura.perf.HatchActivationQplLogger r4 = com.facebook.aura.perf.HatchActivationQplLogger.INSTANCE
                com.facebook.aura.activation.data.ActivationState r3 = r5.$previousState
                com.facebook.aura.activation.model.AgeCheckSource r0 = r5.$source
                int r0 = r0.ordinal()
                if (r0 == r10) goto L8a
                if (r0 != r6) goto L92
                java.lang.String r2 = "selfie_age_check"
            L7a:
                com.facebook.aura.activation.model.AuraActivationViewModel r1 = r5.this$0
                com.facebook.aura.activation.model.AuraActivationViewModel$refreshAfterServerAgeCheck$1$result$1 r0 = new com.facebook.aura.activation.model.AuraActivationViewModel$refreshAfterServerAgeCheck$1$result$1
                r0.<init>(r1, r8)
                r5.label = r6
                java.lang.Object r2 = r4.traceStatusRefresh(r3, r2, r0, r5)
                if (r2 != r7) goto L12
                return r7
            L8a:
                java.lang.String r2 = "account_linking_return"
                goto L7a
            L8d:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L92:
                kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraActivationViewModel.C106691.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C106691) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$resolveVmCredentials$1", f = "AuraActivationViewModel.kt", l = {720, 746, 763, 788}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$resolveVmCredentials$1, reason: invalid class name and case insensitive filesystem */
    public final class C106701 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$resolveVmCredentials$1$2", f = "AuraActivationViewModel.kt", l = {763}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$resolveVmCredentials$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchVmRepository.FetchAndCacheLeasedVmResult>, Object> {
            public final /* synthetic */ HatchlingVmType $vmTypeAtAttemptStart;
            public int label;
            public final /* synthetic */ AuraActivationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AuraActivationViewModel auraActivationViewModel, HatchlingVmType hatchlingVmType, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.this$0 = auraActivationViewModel;
                this.$vmTypeAtAttemptStart = hatchlingVmType;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.this$0, this.$vmTypeAtAttemptStart, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    AuraActivationViewModel auraActivationViewModel = this.this$0;
                    HatchlingVmType hatchlingVmType = this.$vmTypeAtAttemptStart;
                    this.label = 1;
                    obj = auraActivationViewModel.leaseVmWithRetries(hatchlingVmType, this);
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
            public final Object invoke(C3UX c3ux, HtJ<? super HatchVmRepository.FetchAndCacheLeasedVmResult> htJ) {
                return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$resolveVmCredentials$1$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<AuraUserData, AuraUserData> {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(1);
            }

            @Override // X.G0U
            public final AuraUserData invoke(AuraUserData auraUserData) {
                C7384Etj.A0Y(auraUserData, 0);
                return AuraUserData.copy$default(auraUserData, null, null, null, null, AnonymousClass001.A0i(), null, false, false, null, null, false, false, false, null, false, null, null, null, null, null, null, null, null, null, 16777199, null);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$resolveVmCredentials$1$4", f = "AuraActivationViewModel.kt", l = {788}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$resolveVmCredentials$1$4, reason: invalid class name */
        public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ HatchGatewayConnection $gateway;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(HatchGatewayConnection hatchGatewayConnection, HtJ<? super AnonymousClass4> htJ) {
                super(2, htJ);
                this.$gateway = hatchGatewayConnection;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass4(this.$gateway, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchGatewayConnection hatchGatewayConnection = this.$gateway;
                    this.label = 1;
                    obj = hatchGatewayConnection.fetchAndConnect(true, false, null, this);
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
            public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                return new AnonymousClass4(this.$gateway, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C106701(HtJ<? super C106701> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraActivationViewModel.this.new C106701(htJ);
        }

        /* JADX WARN: Failed to calculate best type for var: r2v0 ??
        java.lang.NullPointerException
         */
        /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException
         */
        /* JADX WARN: Not initialized variable reg: 2, insn: 0x02e7: MOVE (r10 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:743), block:B:100:0x02c6 */
        /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x010b A[Catch: Exception -> 0x02c5, CancellationException -> 0x02ed, all -> 0x02ef, TryCatch #4 {CancellationException -> 0x02ed, Exception -> 0x02c5, blocks: (B:57:0x01d7, B:58:0x01da, B:60:0x01e2, B:62:0x01eb, B:64:0x01f3, B:66:0x01fb, B:67:0x0202, B:69:0x0208, B:70:0x020f, B:72:0x0215, B:74:0x0220, B:75:0x0229, B:83:0x026e, B:91:0x0289, B:86:0x0279, B:88:0x0281, B:90:0x0285, B:92:0x028a, B:94:0x0294, B:47:0x0186, B:48:0x0189, B:50:0x0191, B:52:0x019b, B:54:0x01a6, B:37:0x013e, B:38:0x0141, B:29:0x0107, B:31:0x010b, B:33:0x010f, B:41:0x0146, B:44:0x014f, B:96:0x02ab, B:25:0x00f9, B:27:0x0103, B:34:0x0123), top: B:109:0x0014, outer: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01e2 A[Catch: Exception -> 0x02c5, CancellationException -> 0x02ed, all -> 0x02ef, TryCatch #4 {CancellationException -> 0x02ed, Exception -> 0x02c5, blocks: (B:57:0x01d7, B:58:0x01da, B:60:0x01e2, B:62:0x01eb, B:64:0x01f3, B:66:0x01fb, B:67:0x0202, B:69:0x0208, B:70:0x020f, B:72:0x0215, B:74:0x0220, B:75:0x0229, B:83:0x026e, B:91:0x0289, B:86:0x0279, B:88:0x0281, B:90:0x0285, B:92:0x028a, B:94:0x0294, B:47:0x0186, B:48:0x0189, B:50:0x0191, B:52:0x019b, B:54:0x01a6, B:37:0x013e, B:38:0x0141, B:29:0x0107, B:31:0x010b, B:33:0x010f, B:41:0x0146, B:44:0x014f, B:96:0x02ab, B:25:0x00f9, B:27:0x0103, B:34:0x0123), top: B:109:0x0014, outer: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01f3 A[Catch: Exception -> 0x02c5, CancellationException -> 0x02ed, all -> 0x02ef, TryCatch #4 {CancellationException -> 0x02ed, Exception -> 0x02c5, blocks: (B:57:0x01d7, B:58:0x01da, B:60:0x01e2, B:62:0x01eb, B:64:0x01f3, B:66:0x01fb, B:67:0x0202, B:69:0x0208, B:70:0x020f, B:72:0x0215, B:74:0x0220, B:75:0x0229, B:83:0x026e, B:91:0x0289, B:86:0x0279, B:88:0x0281, B:90:0x0285, B:92:0x028a, B:94:0x0294, B:47:0x0186, B:48:0x0189, B:50:0x0191, B:52:0x019b, B:54:0x01a6, B:37:0x013e, B:38:0x0141, B:29:0x0107, B:31:0x010b, B:33:0x010f, B:41:0x0146, B:44:0x014f, B:96:0x02ab, B:25:0x00f9, B:27:0x0103, B:34:0x0123), top: B:109:0x0014, outer: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0279 A[Catch: Exception -> 0x02c5, CancellationException -> 0x02ed, all -> 0x02ef, TRY_ENTER, TryCatch #4 {CancellationException -> 0x02ed, Exception -> 0x02c5, blocks: (B:57:0x01d7, B:58:0x01da, B:60:0x01e2, B:62:0x01eb, B:64:0x01f3, B:66:0x01fb, B:67:0x0202, B:69:0x0208, B:70:0x020f, B:72:0x0215, B:74:0x0220, B:75:0x0229, B:83:0x026e, B:91:0x0289, B:86:0x0279, B:88:0x0281, B:90:0x0285, B:92:0x028a, B:94:0x0294, B:47:0x0186, B:48:0x0189, B:50:0x0191, B:52:0x019b, B:54:0x01a6, B:37:0x013e, B:38:0x0141, B:29:0x0107, B:31:0x010b, B:33:0x010f, B:41:0x0146, B:44:0x014f, B:96:0x02ab, B:25:0x00f9, B:27:0x0103, B:34:0x0123), top: B:109:0x0014, outer: #4 }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [X.Hqv, int] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                Method dump skipped, instructions count: 772
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraActivationViewModel.C106701.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AuraActivationViewModel.this.new C106701(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$sendViewEffect$1", f = "AuraActivationViewModel.kt", l = {685}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationViewModel$sendViewEffect$1, reason: invalid class name and case insensitive filesystem */
    public final class C106711 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ViewEffect $viewEffect;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106711(ViewEffect viewEffect, HtJ<? super C106711> htJ) {
            super(2, htJ);
            this.$viewEffect = viewEffect;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraActivationViewModel.this.new C106711(this.$viewEffect, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C3Em<ViewEffect> c3Em = AuraActivationViewModel.this._viewEffect;
                ViewEffect viewEffect = this.$viewEffect;
                this.label = 1;
                if (c3Em.emit(viewEffect, this) == enumC10460Hji) {
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
            return ((C106711) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AuraActivationViewModel(com.facebook.aura.user.provider.AuraViewerDataProvider r37, com.facebook.aura.activation.repo.AuraActivationRepository r38, com.facebook.aura.user.repo.AuraUserRepository r39, com.facebook.aura.confidentialvm.ConfidentialVmSetupGate r40, com.facebook.aura.confidentialvm.HatchVmAccessController r41, X.AbstractC3358CGz r42, X.A6N r43) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraActivationViewModel.<init>(com.facebook.aura.user.provider.AuraViewerDataProvider, com.facebook.aura.activation.repo.AuraActivationRepository, com.facebook.aura.user.repo.AuraUserRepository, com.facebook.aura.confidentialvm.ConfidentialVmSetupGate, com.facebook.aura.confidentialvm.HatchVmAccessController, X.CGz, X.A6N):void");
    }

    public final void onAgeMethodPicked(AgeCheckMethod ageCheckMethod, int i) {
        int iA0E = AnonymousClass001.A0E(ageCheckMethod, 0);
        if (iA0E != 0 && iA0E != 1) {
            if (iA0E != 2 && iA0E != 3) {
                throw C3cG.A0q();
            }
        } else {
            String strName = ageCheckMethod.name();
            if (isCurrentAgeChoice(strName)) {
                return;
            }
            AgeCheckFunnelLogging.INSTANCE.methodSelected(ageCheckMethod, i);
            pushAgeChoice(strName, AgeCheckVia.PICK);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[AgeCheckMethod.values().length];
            try {
                AnonymousClass005.A0v(AgeCheckMethod.SELFIE, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(AgeCheckMethod.CREDIT_CARD, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(AgeCheckMethod.FACEBOOK, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(AgeCheckMethod.INSTAGRAM, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AgeCheckLayout.values().length];
            try {
                AnonymousClass005.A0v(AgeCheckLayout.LEAD_METHOD, iArr2, 1);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(AgeCheckLayout.METHOD_SELECTOR, iArr2, 2);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AgeCheckSource.values().length];
            try {
                AnonymousClass005.A0v(AgeCheckSource.LINKING, iArr3, 1);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(AgeCheckSource.SELFIE, iArr3, 2);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ActivationState.values().length];
            try {
                AnonymousClass005.A0v(ActivationState.LOADING, iArr4, 1);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(ActivationState.RETOS, iArr4, 2);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass005.A0v(ActivationState.NO_ACCESS, iArr4, 3);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass005.A0v(ActivationState.BLOCKED, iArr4, 4);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass002.A17(ActivationState.GEO_BLOCKED, iArr4);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass002.A18(ActivationState.REQUEST_INVITE_CODE, iArr4);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AnonymousClass006.A1G(ActivationState.REQUEST_WAITLIST, iArr4);
            } catch (NoSuchFieldError unused15) {
            }
            try {
                AnonymousClass006.A1H(ActivationState.ALREADY_WAITLISTED, iArr4);
            } catch (NoSuchFieldError unused16) {
            }
            try {
                AnonymousClass006.A1I(ActivationState.LIMITED_WAITLIST, iArr4);
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[ActivationState.DISCLOSURE_ToS.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[ActivationState.NDA.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[ActivationState.WEARABLES_LINKING.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[ActivationState.AGE_VERIFICATION.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[ActivationState.NAME_REQUIRED.ordinal()] = 14;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[ActivationState.VM_PROVISIONING.ordinal()] = 15;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[ActivationState.CONFIDENTIAL_VM_SETUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[ActivationState.FULLY_ACTIVATED.ordinal()] = 17;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AgeStep ageStepFor(AgeCheckMethod ageCheckMethod, boolean z) {
        return ageCheckMethod == AgeCheckMethod.SELFIE ? new AgeStep.Selfie(z) : AgeStep.Card.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearAgeCaptureFiles() {
        if (this.ageCaptureFilesCleared) {
            return;
        }
        this.ageCaptureFilesCleared = true;
        AgeVerificationIntegration integration = AgeVerification.INSTANCE.getIntegration();
        if (integration != null) {
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C106631(integration, this, null), AEu.A00(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean currentVmAdmissionReadiness() {
        AuraUserData value = this.viewerDataProvider.userData.getValue();
        return AuraActivationViewModelKt.resolveVmAdmissionReadiness(value != null ? value.isVmTypeSelectionRequired : null, this.vmAccessController.state.getValue(), AnonymousClass003.A1Z(this.isVmConnectionCacheReady));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchlingVmType getEffectiveVmType() {
        HatchlingVmType selectedVmType = this.confidentialVmSetupGate.getSelectedVmType();
        return selectedVmType == null ? HatchlingVmType.HATCH_VM : selectedVmType;
    }

    private final AgeCheckStep getFunnelStep(AgeStep ageStep) {
        if (C7384Etj.areEqual(ageStep, AgeStep.Card.INSTANCE)) {
            return AgeCheckStep.CCV_FORM;
        }
        if (ageStep instanceof AgeStep.Selfie) {
            return ((AgeStep.Selfie) ageStep).picked ? AgeCheckStep.SELFIE_INTRO_PICKED : AgeCheckStep.SELFIE_INTRO;
        }
        if (ageStep instanceof AgeStep.Methods) {
            return AgeCheckStep.METHOD_LIST;
        }
        throw C3cG.A0q();
    }

    private final String getQplPoint(AgeStep ageStep) {
        if (C7384Etj.areEqual(ageStep, AgeStep.Card.INSTANCE)) {
            return "age_method_card";
        }
        if (ageStep instanceof AgeStep.Selfie) {
            return "age_method_selfie";
        }
        if (ageStep instanceof AgeStep.Methods) {
            return null;
        }
        throw C3cG.A0q();
    }

    private final boolean isCurrentAgeChoice(String str) {
        String value = this.ageChoice.getValue();
        return C7384Etj.areEqual(value != null ? C7BY.A0R(value, value, '/') : null, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.activation.model.AgeStep latchAgeStep(com.facebook.aura.activation.data.ActivationState r6, com.facebook.aura.activation.data.ActivationState r7, java.lang.String r8, com.facebook.aura.activation.model.AgeStep r9) {
        /*
            r5 = this;
            com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.AGE_VERIFICATION
            r4 = 1
            r2 = 0
            if (r6 == r0) goto L18
            r5.shownAgeStep = r2
            r5.entryAgeStep = r2
            r5.pointsNextAgeStep = r4
            r5.pendingAgeMethodPoint = r2
            if (r7 != r0) goto L17
            X.A6N r1 = r5.savedStateHandle
            java.lang.String r0 = "age_step_choice"
            r1.A02(r0, r2)
        L17:
            return r9
        L18:
            X.HxE<java.lang.String, ? extends com.facebook.aura.activation.model.AgeStep> r1 = r5.shownAgeStep
            if (r1 == 0) goto L29
            A r0 = r1.first
            B r1 = r1.second
            com.facebook.aura.activation.model.AgeStep r1 = (com.facebook.aura.activation.model.AgeStep) r1
            boolean r0 = X.C7384Etj.areEqual(r0, r8)
            if (r0 == 0) goto L29
            return r1
        L29:
            r3 = 0
            if (r8 != 0) goto L57
            com.facebook.aura.activation.model.AgeStep r0 = r5.entryAgeStep
            if (r0 == 0) goto L58
            r9 = r0
        L31:
            X.HxE r0 = X.C3cG.A0r(r8, r9)
            r5.shownAgeStep = r0
            if (r4 == 0) goto L3b
            r5.entryAgeStep = r9
        L3b:
            com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging r2 = com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging.INSTANCE
            com.facebook.aura.ageverification.intf.AgeCheckStep r1 = r5.getFunnelStep(r9)
            com.facebook.aura.ageverification.intf.AgeCheckVia r0 = r5.ageStepVia
            r2.ageStepShown(r1, r0)
            com.facebook.aura.ageverification.intf.AgeCheckVia r0 = com.facebook.aura.ageverification.intf.AgeCheckVia.SERVER_REFRESH
            r5.ageStepVia = r0
            boolean r0 = r5.pointsNextAgeStep
            if (r0 == 0) goto L17
            r5.pointsNextAgeStep = r3
            java.lang.String r0 = r5.getQplPoint(r9)
            r5.pendingAgeMethodPoint = r0
            return r9
        L57:
            r4 = 0
        L58:
            if (r9 != 0) goto L31
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraActivationViewModel.latchAgeStep(com.facebook.aura.activation.data.ActivationState, com.facebook.aura.activation.data.ActivationState, java.lang.String, com.facebook.aura.activation.model.AgeStep):com.facebook.aura.activation.model.AgeStep");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006d -> B:12:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object leaseVmWithRetries(com.facebook.aura.gateway.HatchlingVmType r10, X.HtJ<? super com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.facebook.aura.activation.model.AuraActivationViewModel.C106651
            if (r0 == 0) goto L75
            r7 = r11
            com.facebook.aura.activation.model.AuraActivationViewModel$leaseVmWithRetries$1 r7 = (com.facebook.aura.activation.model.AuraActivationViewModel.C106651) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r2 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L70
            if (r0 == r5) goto L41
            if (r0 != r6) goto L7b
            int r4 = r7.I$0
            java.lang.Object r10 = r7.L$0
            com.facebook.aura.gateway.HatchlingVmType r10 = (com.facebook.aura.gateway.HatchlingVmType) r10
            X.Hwg.A00(r2)
        L29:
            int r4 = r4 + 1
            com.facebook.aura.gateway.HatchVmRepository r3 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            X.CGz r2 = r9.userSession
            com.facebook.aura.gateway.VmFetchSource r1 = com.facebook.aura.gateway.VmFetchSource.ACTIVATION
            r7.L$0 = r10
            r0 = 0
            r7.L$1 = r0
            r7.I$0 = r4
            r7.label = r5
            java.lang.Object r2 = r3.leaseAndCacheVm(r2, r10, r1, r7)
            if (r2 != r8) goto L4a
            return r8
        L41:
            int r4 = r7.I$0
            java.lang.Object r10 = r7.L$0
            com.facebook.aura.gateway.HatchlingVmType r10 = (com.facebook.aura.gateway.HatchlingVmType) r10
            X.Hwg.A00(r2)
        L4a:
            com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult r2 = (com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult) r2
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult.Failure
            if (r0 == 0) goto L80
            r1 = r2
            com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult$Failure r1 = (com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult.Failure) r1
            boolean r0 = r1.isRetryable()
            if (r0 == 0) goto L80
            r0 = 3
            if (r4 >= r0) goto L80
            long r2 = r1.retryAfterMs
            long r0 = (long) r4
            long r2 = r2 * r0
            r7.L$0 = r10
            r0 = 0
            r7.L$1 = r0
            r7.I$0 = r4
            r7.label = r6
            java.lang.Object r0 = X.C7Bq.A01(r2, r7)
            if (r0 != r8) goto L29
            return r8
        L70:
            X.Hwg.A00(r2)
            r4 = 0
            goto L29
        L75:
            com.facebook.aura.activation.model.AuraActivationViewModel$leaseVmWithRetries$1 r7 = new com.facebook.aura.activation.model.AuraActivationViewModel$leaseVmWithRetries$1
            r7.<init>(r11)
            goto L12
        L7b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraActivationViewModel.leaseVmWithRetries(com.facebook.aura.gateway.HatchlingVmType, X.HtJ):java.lang.Object");
    }

    private final void logNativeAgeConfirmationOutcome(String str) {
        HatchImpressionLogger.INSTANCE.logImpression(HatchOrigin.HATCH, HatchSurface.AGE_CONFIRMATION, null, HatchScreen.CCV_SCREEN, HatchComponent.AGE_CONFIRMATION_OUTCOME, null, AnonymousClass007.A0c(HatchMetadataKey.RESULT, str), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logServerAgeCheckOutcomeIfNeeded(AuraUserData auraUserData, ActivationState activationState) {
        AgeCheckSource ageCheckSource = this.ageCheckRefreshInFlight.get();
        if (activationState != ActivationState.AGE_VERIFICATION || ageCheckSource == null) {
            return;
        }
        ActivationState.Companion companion = ActivationState.Companion;
        if (companion.isBlocked(auraUserData.ageConfirmationStatus)) {
            if (Bs8.A00(ageCheckSource, null, this.ageCheckRefreshInFlight)) {
                int iOrdinal = ageCheckSource.ordinal();
                if (iOrdinal == 0) {
                    logNativeAgeConfirmationOutcome("blocked");
                    HatchActivationQplLogger.INSTANCE.endAgeConfirmationFail("blocked_after_linking", null);
                } else {
                    if (iOrdinal != 1) {
                        throw C3cG.A0q();
                    }
                    HatchActivationQplLogger.INSTANCE.endAgeConfirmationFail("blocked_after_selfie", null);
                }
                this.ageBlockedAfter.set(ageCheckSource);
                return;
            }
            return;
        }
        if (companion.isAgeVerifiedRequired(auraUserData.ageConfirmationStatus) || !Bs8.A00(ageCheckSource, null, this.ageCheckRefreshInFlight)) {
            return;
        }
        int iOrdinal2 = ageCheckSource.ordinal();
        if (iOrdinal2 == 0) {
            logNativeAgeConfirmationOutcome("verified");
        } else {
            if (iOrdinal2 != 1) {
                throw C3cG.A0q();
            }
            HatchActivationQplLogger.INSTANCE.pointFlow("selfie_age_confirmed");
        }
        HatchActivationQplLogger hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
        hatchActivationQplLogger.endAgeConfirmationSuccess();
        hatchActivationQplLogger.pointFlow("age_confirmed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markVmProvisioningFailed(String str, String str2, HatchlingVmType hatchlingVmType, String str3, boolean z) {
        UiState value;
        String str4 = str;
        String str5 = str3;
        HatchActivationQplLogger.INSTANCE.pointActivationStepFailed("vm_resolution", "request_error", str4, str2, str5);
        VmProvisioningFailureRequest vmProvisioningFailureRequest = AuraActivationViewModelKt.VM_REQUEST_TYPE_FETCH.equals(str5) ? VmProvisioningFailureRequest.FETCH : "lease_vm".equals(str5) ? VmProvisioningFailureRequest.LEASE : VmProvisioningFailureRequest.UNKNOWN;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, UiState.copy$default(value, null, null, false, false, false, 0, vmProvisioningFailureRequest, false, false, false, null, null, false, 0, 16319, null)));
        if (this._uiState.getValue().activationState == ActivationState.VM_PROVISIONING) {
            HatchImpressionLogger hatchImpressionLogger = HatchImpressionLogger.INSTANCE;
            HatchOrigin hatchOrigin = HatchOrigin.ONBOARDING;
            HatchSurface hatchSurface = HatchSurface.ONBOARDING;
            HatchSubsurface hatchSubsurface = HatchSubsurface.ONBOARDING_POST_AUTH;
            HatchScreen hatchScreen = HatchScreen.ONBOARDING_VM_PROVISIONING;
            HatchComponent hatchComponent = HatchComponent.VM_PROVISIONING_ERROR;
            String value2 = HatchMetadataKey.FAILURE_REASON.getValue();
            if (z) {
                str4 = AuraActivationViewModelKt.FAILURE_REASON_NO_VMS;
            }
            HxE hxEA0r = C3cG.A0r(value2, str4);
            String value3 = HatchMetadataKey.REQUEST_TYPE.getValue();
            if (str3 == null) {
                str5 = "none";
            }
            hatchImpressionLogger.logImpression(hatchOrigin, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, C3cH.A0n(HatchMetadataKey.VM_TYPE.getValue(), hatchlingVmType.getResponseWire(), hxEA0r, C3cG.A0r(value3, str5), C3cG.A0r(HatchMetadataKey.ATTEMPT_NUMBER.getValue(), String.valueOf(this.vmProvisioningAttempt.get()))), null);
        }
    }

    private final void refreshAfterServerAgeCheck(AgeCheckSource ageCheckSource) {
        if (Bs8.A00(null, ageCheckSource, this.ageCheckRefreshInFlight)) {
            ActivationState activationState = this._uiState.getValue().activationState;
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C106691(activationState, ageCheckSource, this, null), AEu.A00(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r1 == 3) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.activation.model.AgeStep resolveAgeStep(com.facebook.aura.user.provider.AuraUserData r9, java.lang.String r10) {
        /*
            r8 = this;
            com.facebook.aura.ageverification.intf.AgeVerification r0 = com.facebook.aura.ageverification.intf.AgeVerification.INSTANCE
            com.facebook.aura.ageverification.intf.AgeVerificationIntegration r0 = r0.getIntegration()
            if (r0 != 0) goto Lb
            com.facebook.aura.activation.model.AgeStep$Card r0 = com.facebook.aura.activation.model.AgeStep.Card.INSTANCE
            return r0
        Lb:
            java.util.List<com.facebook.aura.user.provider.AgeCheckMethod> r6 = r9.ageVerificationMethods
            r4 = 1
            r3 = 0
            if (r10 == 0) goto L2e
            r0 = 47
            java.lang.String r5 = X.C7BY.A0R(r10, r10, r0)
        L17:
            r7 = 0
            if (r5 != 0) goto L56
            com.facebook.aura.user.provider.AgeCheckLayout r0 = r9.ageVerificationLayout
            r1 = -1
            if (r0 == 0) goto L48
            int r0 = r0.ordinal()
            if (r0 == r1) goto L48
            if (r0 == r7) goto L30
            if (r0 == r4) goto L43
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L2e:
            r5 = r3
            goto L17
        L30:
            java.lang.Object r2 = X.AbstractC0878AGe.A0G(r6)
            com.facebook.aura.user.provider.AgeCheckMethod r2 = (com.facebook.aura.user.provider.AgeCheckMethod) r2
            if (r2 == 0) goto L51
            int r1 = r2.ordinal()
            r0 = 2
            if (r1 == r0) goto L43
            r0 = 3
            if (r1 == r0) goto L43
            goto L51
        L43:
            com.facebook.aura.activation.model.AgeStep r0 = r8.methodsAgeStep(r6)
            return r0
        L48:
            com.facebook.aura.user.provider.AgeCheckMethod r2 = com.facebook.aura.user.provider.AgeCheckMethod.SELFIE
            boolean r0 = r6.contains(r2)
            if (r0 != 0) goto L51
            r2 = r3
        L51:
            com.facebook.aura.activation.model.AgeStep r0 = r8.ageStepFor(r2, r7)
            return r0
        L56:
            java.lang.String r0 = "OTHER_METHODS"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L8d
            java.lang.String r0 = "SELFIE_UNAVAILABLE"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L8d
            X.Ey9 r0 = com.facebook.aura.user.provider.AgeCheckMethod.getEntries()
            java.util.Iterator r2 = r0.iterator()
        L6e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.user.provider.AgeCheckMethod r0 = (com.facebook.aura.user.provider.AgeCheckMethod) r0
            java.lang.String r0 = r0.name()
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L6e
            r3 = r1
        L86:
            com.facebook.aura.user.provider.AgeCheckMethod r3 = (com.facebook.aura.user.provider.AgeCheckMethod) r3
            com.facebook.aura.activation.model.AgeStep r0 = r8.ageStepFor(r3, r4)
            return r0
        L8d:
            com.facebook.aura.user.provider.AgeCheckMethod r0 = com.facebook.aura.user.provider.AgeCheckMethod.SELFIE
            java.util.List r0 = X.AbstractC0878AGe.A0b(r6, r0)
            com.facebook.aura.activation.model.AgeStep r0 = r8.methodsAgeStep(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraActivationViewModel.resolveAgeStep(com.facebook.aura.user.provider.AuraUserData, java.lang.String):com.facebook.aura.activation.model.AgeStep");
    }

    private final void setAgeChoice(String str) {
        this.savedStateHandle.A02(AuraActivationViewModelKt.KEY_AGE_CHOICE, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean showsActivationSubscriptionUpgradeCard(AuraUserData auraUserData) {
        return AnonymousClass002.A1b(auraUserData.isVmTypeSelectionRequired, true) && AnonymousClass002.A1b(auraUserData.hasProvisionedVm, false) && HatchUtil.INSTANCE.isSvmToCvmActivationFlowEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean showsAgeBlockedScreen(AuraUserData auraUserData, ActivationState activationState) {
        return activationState != ActivationState.RETOS && ActivationState.Companion.isBlocked(auraUserData.ageConfirmationStatus);
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final C22I<ViewEffect> getViewEffect() {
        return this.viewEffect;
    }

    public final void onAgeLogOutConfirmationDismissed() {
        UiState value;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, UiState.copy$default(value, null, null, false, false, false, 0, null, false, false, false, null, null, false, 0, 12287, null)));
    }

    public final void onAgeStepBack() {
        UiState value;
        String value2 = this.ageChoice.getValue();
        if (value2 != null) {
            if (!AuraActivationViewModelKt.SELFIE_UNAVAILABLE.equals(C7BY.A0R(value2, value2, '/'))) {
                this.ageStepVia = AgeCheckVia.BACK;
                String strA0T = C7BY.A0T(value2, "", '/');
                setAgeChoice(strA0T.length() != 0 ? strA0T : null);
                return;
            }
        }
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, UiState.copy$default(value, null, null, false, false, false, 0, null, false, false, false, null, null, true, 0, 12287, null)));
    }

    public final void onBackClick() {
        sendViewEffect(ViewEffect.NavigateBack.INSTANCE);
    }

    @Override // X.AEs
    public void onCleared() {
        HatchActivationQplLogger.INSTANCE.endFlowCancel("view_model_cleared");
    }

    public final void onEnterInviteCodeClick() {
        AnonymousClass004.A1D(true, this.inviteCodeRequested);
    }

    public final void onInviteCodeBackClick() {
        AnonymousClass004.A1D(false, this.inviteCodeRequested);
    }

    public final void onJoinWaitlistClick() {
        UiState value;
        if (this._uiState.getValue().activationState == ActivationState.REQUEST_WAITLIST) {
            HatchActivationQplLogger hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
            hatchActivationQplLogger.pointFlow("waitlist_join_tapped");
            hatchActivationQplLogger.annotateFlow(PhotosSearchHandlerKt.PARAM_SOURCE, "HATCH_MOBILE");
            BLG<UiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, UiState.copy$default(value, null, null, false, false, true, 0, null, false, false, false, null, null, false, 0, 16367, null)));
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C106662("HATCH_MOBILE", null), AEu.A00(this));
        }
    }

    public final void onLinkingReturned() {
        refreshAfterServerAgeCheck(AgeCheckSource.LINKING);
    }

    public final void onLogOutClick() {
        UiState value = this._uiState.getValue();
        if (value.activationState == ActivationState.VM_PROVISIONING && value.vmProvisioningFailureRequest != null) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, null, HatchScreen.ONBOARDING_VM_PROVISIONING, HatchComponent.BACK_BUTTON, null, AnonymousClass006.A10(HatchMetadataKey.ATTEMPT_NUMBER.getValue(), String.valueOf(this.vmProvisioningAttempt.get())), null);
        }
        sendViewEffect(ViewEffect.LogOut.INSTANCE);
    }

    public final void onOtherAgeMethods(boolean z) {
        String str;
        AgeCheckVia ageCheckVia;
        if (z) {
            str = AuraActivationViewModelKt.OTHER_AGE_METHODS;
            ageCheckVia = AgeCheckVia.TRY_ANOTHER_METHOD;
        } else {
            str = AuraActivationViewModelKt.SELFIE_UNAVAILABLE;
            ageCheckVia = AgeCheckVia.SERVER_REFRESH;
        }
        pushAgeChoice(str, ageCheckVia);
    }

    public final void onSelfieAgeConfirmed() {
        refreshAfterServerAgeCheck(AgeCheckSource.SELFIE);
    }

    public final void onWearablesLinked() {
        AnonymousClass004.A1D(true, this.wearablesStepResolved);
        this.viewerDataProvider.atomicUpdate(C106671.INSTANCE);
    }

    public final void onWearablesStepDone() {
        AnonymousClass004.A1D(true, this.wearablesStepResolved);
    }

    public final void refresh(boolean z) {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C106681(this._uiState.getValue().activationState, z ? "manual_refresh" : "on_resume", this, null), AEu.A00(this));
    }

    public final void setWearablesStepRequested(boolean z) {
        if (z) {
            AnonymousClass004.A1D(false, this.wearablesStepResolved);
        }
        AnonymousClass004.A1D(z, this.wearablesStepRequested);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void connectGatewayIfProvisioned() {
        AnonymousClass001.A1J(new C106641(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logActivationStateChange(ActivationState activationState) {
        HatchActivationQplLogger hatchActivationQplLogger;
        String str;
        String str2;
        String str3;
        int iOrdinal;
        int iOrdinal2;
        switch (activationState.ordinal()) {
            case 0:
                hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
                str = "access_loading_shown";
                break;
            case 1:
                hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
                str = "retos_screen_shown";
                break;
            case 2:
                HatchActivationQplLogger.INSTANCE.pointFlow("gating_screen_shown");
                return;
            case 3:
                AgeCheckSource andSet = this.ageBlockedAfter.getAndSet(null);
                HatchActivationQplLogger hatchActivationQplLogger2 = HatchActivationQplLogger.INSTANCE;
                hatchActivationQplLogger2.pointFlow("age_blocked_screen_shown");
                if (andSet == null || (iOrdinal2 = andSet.ordinal()) == -1) {
                    str2 = "stated_age";
                } else if (iOrdinal2 == 0) {
                    str2 = "account_linking";
                } else {
                    if (iOrdinal2 != 1) {
                        throw C3cG.A0q();
                    }
                    str2 = "selfie";
                }
                hatchActivationQplLogger2.annotateFlow("block_source", str2);
                if (andSet == null || (iOrdinal = andSet.ordinal()) == -1) {
                    str3 = "age_blocked_stated";
                } else if (iOrdinal == 0) {
                    str3 = "age_blocked_linking";
                } else {
                    if (iOrdinal != 1) {
                        throw C3cG.A0q();
                    }
                    str3 = "age_blocked_selfie";
                }
                hatchActivationQplLogger2.endFlowFail(str3, "age_blocked");
                return;
            case 4:
                hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
                hatchActivationQplLogger.pointFlow("gating_screen_shown");
                str = "geo_gated_screen_shown";
                break;
            case 5:
                hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
                str = "invite_code_screen_shown";
                break;
            case 6:
            case 7:
            case 8:
                HatchActivationQplLogger hatchActivationQplLogger3 = HatchActivationQplLogger.INSTANCE;
                hatchActivationQplLogger3.pointFlow("waitlist_screen_shown");
                hatchActivationQplLogger3.annotateFlow("is_already_joined", AnonymousClass006.A1Z(activationState, ActivationState.REQUEST_WAITLIST));
                hatchActivationQplLogger3.annotateFlow("is_at_capacity", activationState == ActivationState.LIMITED_WAITLIST);
                return;
            case 9:
                hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
                str = "disclosure_screen_shown";
                break;
            case 10:
                hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
                str = "nda_screen_shown";
                break;
            case 11:
                hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
                str = "wearables_linking_screen_shown";
                break;
            case 12:
                hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
                str = "age_confirmation_screen_shown";
                break;
            case 13:
                hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
                str = "name_confirmation_screen_shown";
                break;
            case 14:
                hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
                str = "confidential_vm_setup_screen_shown";
                break;
            case 15:
                hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
                str = "vm_resolution_shown";
                break;
            case 16:
                HatchActivationQplLogger.INSTANCE.endFlowSuccess();
                return;
            default:
                throw C3cG.A0q();
        }
        hatchActivationQplLogger.pointFlow(str);
    }

    public static /* synthetic */ void markVmProvisioningFailed$default(AuraActivationViewModel auraActivationViewModel, String str, String str2, HatchlingVmType hatchlingVmType, String str3, boolean z, int i, Object obj) {
        auraActivationViewModel.markVmProvisioningFailed(str, str2, hatchlingVmType, AnonymousClass006.A0u(i, str3), C3cI.A1S(i, z));
    }

    private final AgeStep methodsAgeStep(List<? extends AgeCheckMethod> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (AgeCheckMethod ageCheckMethod : list) {
            if (ageCheckMethod == AgeCheckMethod.SELFIE || ageCheckMethod == AgeCheckMethod.CREDIT_CARD) {
                arrayListA0h.add(ageCheckMethod);
            } else {
                arrayListA0h2.add(ageCheckMethod);
            }
        }
        return (!arrayListA0h2.isEmpty() || arrayListA0h.size() > 1) ? new AgeStep.Methods(AGI.A07(arrayListA0h), AGI.A07(arrayListA0h2)) : ageStepFor((AgeCheckMethod) AbstractC0878AGe.A0K(arrayListA0h), false);
    }

    private final void pushAgeChoice(String str, AgeCheckVia ageCheckVia) {
        if (isCurrentAgeChoice(str)) {
            return;
        }
        String value = this.ageChoice.getValue();
        this.ageStepVia = ageCheckVia;
        this.pointsNextAgeStep = true;
        if (value != null) {
            str = FGI.A0U(value, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str);
        }
        setAgeChoice(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivationState resolveActivationState(AuraUserData auraUserData, boolean z, boolean z2, boolean z3, boolean z4) {
        ActivationState currentActivationState = auraUserData.getCurrentActivationState(z, z2, z4);
        return (currentActivationState != ActivationState.FULLY_ACTIVATED || auraUserData.hasCompletedHatchActivation || !AnonymousClass002.A1b(auraUserData.hasProvisionedVm, true) || z3) ? currentActivationState : ActivationState.VM_PROVISIONING;
    }

    public static /* synthetic */ ActivationState resolveActivationState$default(AuraActivationViewModel auraActivationViewModel, AuraUserData auraUserData, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        return auraActivationViewModel.resolveActivationState(auraUserData, AnonymousClass001.A1Q(i, z), z2, z3, AnonymousClass005.A1Q(i, z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolveVmCredentials() {
        AnonymousClass001.A1J(new C106701(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendViewEffect(ViewEffect viewEffect) {
        AnonymousClass001.A1J(new C106711(viewEffect, null), AEu.A00(this));
    }

    public final void retryVmProvisioning() {
        resolveVmCredentials();
    }
}
