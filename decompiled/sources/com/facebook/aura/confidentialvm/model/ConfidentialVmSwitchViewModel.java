package com.facebook.aura.confidentialvm.model;

import X.A6H;
import X.A6J;
import X.A6M;
import X.A6N;
import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC10623Hzj;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.BGK;
import X.BLG;
import X.BQI;
import X.C06H;
import X.C0881AGi;
import X.C0943AIw;
import X.C10650I0u;
import X.C1BN;
import X.C20Q;
import X.C3Ek;
import X.C3UX;
import X.C3pU;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GCV;
import X.HtJ;
import X.Hu1;
import X.Hwg;
import X.HzP;
import X.HzR;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchStep;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsRepository;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsState;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmArtifact;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchDataSource;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchDestination;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistJoinFailure;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmSwitchViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String DATA_CHOICE_KEY = "data_choice";

    @Deprecated
    public static final String DIRECTION_KEY = "direction";

    @Deprecated
    public static final String ENTRY_POINT_KEY = "entry_point";

    @Deprecated
    public static final String TAG = "ConfidentialVmSwitchViewModel";
    public final HzR<ConfidentialVmSwitchStep> _steps;
    public final BLG<ConfidentialVmSwitchUiState> _uiState;
    public final ConfidentialVmSwitchDataSource dataSource;
    public final ConfidentialVmDowngradeOperation downgradeOperation;
    public HatchScreen lastImpressedIntroScreen;
    public final ConfidentialVmMigrationOperation migrationOperation;
    public final ConfidentialVmSwitchOperation operation;
    public final ConfidentialVmRepository repository;
    public final A6N savedStateHandle;
    public final C20Q<ConfidentialVmSwitchStep> steps;
    public final C1BN<ConfidentialVmSwitchUiState> uiState;
    public final ConfidentialVmValuePropsRepository valuePropsRepository;
    public final AuraViewerDataProvider viewerDataProvider;
    public final ConfidentialVmWaitlistRepository waitlistRepository;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$1", f = "ConfidentialVmSwitchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<ConfidentialVmSwitchDestination, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = ConfidentialVmSwitchViewModel.this.new AnonymousClass1(htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmSwitchUiState value;
            ConfidentialVmSwitchDestination confidentialVmSwitchDestination = (ConfidentialVmSwitchDestination) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            BLG<ConfidentialVmSwitchUiState> blg = ConfidentialVmSwitchViewModel.this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(value, confidentialVmSwitchDestination, null, null, null, null, null, false, false, false, false, false, null, null, false, null, false, 65534, null)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(ConfidentialVmSwitchDestination confidentialVmSwitchDestination, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(confidentialVmSwitchDestination, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<ConfidentialVmValuePropsState, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ConfidentialVmValuePropsState confidentialVmValuePropsState) {
            ConfidentialVmSwitchUiState value;
            C7384Etj.A0Y(confidentialVmValuePropsState, 0);
            BLG<ConfidentialVmSwitchUiState> blg = ConfidentialVmSwitchViewModel.this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(value, null, null, null, null, null, null, false, false, false, false, false, null, confidentialVmValuePropsState, false, null, false, 61439, null)));
        }

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(ConfidentialVmValuePropsState confidentialVmValuePropsState) {
            invoke2(confidentialVmValuePropsState);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$3", f = "ConfidentialVmSwitchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<AuraUserData, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = ConfidentialVmSwitchViewModel.this.new AnonymousClass3(htJ);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmSwitchUiState value;
            ConfidentialVmSwitchUiState confidentialVmSwitchUiState;
            AuraUserData auraUserData = (AuraUserData) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            BLG<ConfidentialVmSwitchUiState> blg = ConfidentialVmSwitchViewModel.this._uiState;
            do {
                value = blg.getValue();
                confidentialVmSwitchUiState = value;
            } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(confidentialVmSwitchUiState, null, null, null, null, null, null, false, false, false, false, false, null, null, ConfidentialVmSwitchViewModel.Companion.shouldShowGlassesUnavailableNotice(confidentialVmSwitchUiState.direction, auraUserData), null, false, 57343, null)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(AuraUserData auraUserData, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(auraUserData, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<ConfidentialVmSwitchViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmSwitchViewModel create(A6J a6j) {
            C7384Etj.A0Y(a6j, 0);
            return new ConfidentialVmSwitchViewModel(ConfidentialVmSwitchDataSource.Companion.getInstance(this.userSession), ConfidentialVmRepository.Companion.getInstance(this.userSession), ConfidentialVmSwitchOperation.Companion.getInstance(this.userSession), ConfidentialVmWaitlistRepository.Companion.getInstance(this.userSession), ConfidentialVmMigrationOperation.Companion.getInstance(this.userSession), ConfidentialVmDowngradeOperation.Companion.getInstance(this.userSession), ConfidentialVmValuePropsRepository.Companion.getInstance(this.userSession), AuraViewerDataProvider.Companion.getInstance(this.userSession), A6H.A00(a6j));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$joinWaitlist$2", f = "ConfidentialVmSwitchViewModel.kt", l = {423}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$joinWaitlist$2, reason: invalid class name and case insensitive filesystem */
    public final class C112132 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C112132(HtJ<? super C112132> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmSwitchViewModel.this.new C112132(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmSwitchUiState value;
            Object objJoin = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objJoin);
                ConfidentialVmWaitlistRepository confidentialVmWaitlistRepository = ConfidentialVmSwitchViewModel.this.waitlistRepository;
                this.label = 1;
                objJoin = confidentialVmWaitlistRepository.join(this);
                if (objJoin == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objJoin);
            }
            ConfidentialVmWaitlistJoinFailure confidentialVmWaitlistJoinFailure = (ConfidentialVmWaitlistJoinFailure) objJoin;
            ConfidentialVmAnalytics.INSTANCE.logWaitlistJoinResult(confidentialVmWaitlistJoinFailure, ConfidentialVmSwitchViewModel.this.getEntryPoint());
            BLG<ConfidentialVmSwitchUiState> blg = ConfidentialVmSwitchViewModel.this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(value, null, null, null, null, null, null, false, false, false, false, false, confidentialVmWaitlistJoinFailure, null, false, null, false, 62463, null)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmSwitchViewModel.this.new C112132(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$loadArtifactsToReview$2", f = "ConfidentialVmSwitchViewModel.kt", l = {474, 485}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$loadArtifactsToReview$2, reason: invalid class name and case insensitive filesystem */
    public final class C112142 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C112142(HtJ<? super C112142> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmSwitchViewModel.this.new C112142(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmSwitchUiState value;
            ConfidentialVmSwitchUiState confidentialVmSwitchUiState;
            AHD ahdA07;
            ArrayList arrayListA0i;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                obj = C0881AGi.A00;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            List list = (List) obj;
            BLG<ConfidentialVmSwitchUiState> blg = ConfidentialVmSwitchViewModel.this._uiState;
            do {
                value = blg.getValue();
                confidentialVmSwitchUiState = value;
                ahdA07 = AGI.A07(list);
                arrayListA0i = AnonymousClass003.A0i(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(((ConfidentialVmArtifact) it.next()).id);
                }
            } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(confidentialVmSwitchUiState, null, null, null, null, ahdA07, AGI.A09(arrayListA0i), false, false, false, false, false, null, null, false, null, false, 65423, null)));
            boolean zIsEmpty = list.isEmpty();
            ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = ConfidentialVmSwitchViewModel.this;
            if (zIsEmpty) {
                confidentialVmSwitchViewModel.resolveCredential();
            } else {
                HzR<ConfidentialVmSwitchStep> hzR = confidentialVmSwitchViewModel._steps;
                ConfidentialVmSwitchStep.ReviewArtifacts reviewArtifacts = ConfidentialVmSwitchStep.ReviewArtifacts.INSTANCE;
                this.L$0 = null;
                this.label = 2;
                if (hzR.AcU(reviewArtifacts, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmSwitchViewModel.this.new C112142(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$onDataTransferConfirmed$2", f = "ConfidentialVmSwitchViewModel.kt", l = {696}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$onDataTransferConfirmed$2, reason: invalid class name and case insensitive filesystem */
    public final class C112152 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public boolean Z$0;
        public int label;

        public C112152(HtJ<? super C112152> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmSwitchViewModel.this.new C112152(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmSwitchUiState value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                boolean zCommit = ConfidentialVmSwitchViewModel.this.migrationOperation.commit();
                BLG<ConfidentialVmSwitchUiState> blg = ConfidentialVmSwitchViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(value, null, null, null, null, null, null, false, false, false, !zCommit, false, null, null, false, null, false, 65023, null)));
                if (zCommit) {
                    HzR<ConfidentialVmSwitchStep> hzR = ConfidentialVmSwitchViewModel.this._steps;
                    ConfidentialVmSwitchStep.DataTransferProgress dataTransferProgress = new ConfidentialVmSwitchStep.DataTransferProgress(ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM);
                    this.Z$0 = zCommit;
                    this.label = 1;
                    if (hzR.AcU(dataTransferProgress, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    ConfidentialVmAnalytics.INSTANCE.logSwitchErrorImpression(HatchScreen.CVM_TRANSFER_CONFIRM, ConfidentialVmSwitchViewModel.this.getEntryPoint(), AnonymousClass006.A0c(ConfidentialVmSwitchViewModel.this).direction);
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
            return ConfidentialVmSwitchViewModel.this.new C112152(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$resolveCredential$2", f = "ConfidentialVmSwitchViewModel.kt", l = {637, 652}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$resolveCredential$2, reason: invalid class name and case insensitive filesystem */
    public final class C112162 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public C112162(HtJ<? super C112162> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmSwitchViewModel.this.new C112162(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmSwitchStep confidentialVmSwitchStep;
            ConfidentialVmSwitchUiState value;
            Object objResolveCredentialStep = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(ConfidentialVmSwitchViewModel.TAG, "Failed to resolve confidential VM credential", e2);
                confidentialVmSwitchStep = null;
            }
            if (i == 0) {
                Hwg.A00(objResolveCredentialStep);
                ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = ConfidentialVmSwitchViewModel.this;
                this.label = 1;
                objResolveCredentialStep = confidentialVmSwitchViewModel.resolveCredentialStep(this);
                if (objResolveCredentialStep == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objResolveCredentialStep);
                    return Unit.INSTANCE;
                }
                Hwg.A00(objResolveCredentialStep);
            }
            confidentialVmSwitchStep = (ConfidentialVmSwitchStep) objResolveCredentialStep;
            BLG<ConfidentialVmSwitchUiState> blg = ConfidentialVmSwitchViewModel.this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(value, null, null, null, null, null, null, false, false, false, AnonymousClass002.A1Y(confidentialVmSwitchStep), false, null, null, false, null, false, 64895, null)));
            if (confidentialVmSwitchStep == null) {
                ConfidentialVmAnalytics.INSTANCE.logCredentialErrorImpression(AnonymousClass006.A0c(ConfidentialVmSwitchViewModel.this).dataChoice, ConfidentialVmSwitchViewModel.this.getEntryPoint(), AnonymousClass006.A0c(ConfidentialVmSwitchViewModel.this).direction);
            }
            if (confidentialVmSwitchStep != null) {
                HzR<ConfidentialVmSwitchStep> hzR = ConfidentialVmSwitchViewModel.this._steps;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (hzR.AcU(confidentialVmSwitchStep, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmSwitchViewModel.this.new C112162(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel", f = "ConfidentialVmSwitchViewModel.kt", l = {712, 721}, m = "resolveCredentialStep", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$resolveCredentialStep$1, reason: invalid class name and case insensitive filesystem */
    public final class C112171 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C112171(HtJ<? super C112171> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmSwitchViewModel.this.resolveCredentialStep(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$startDowngrade$2", f = "ConfidentialVmSwitchViewModel.kt", l = {610, 613}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$startDowngrade$2, reason: invalid class name and case insensitive filesystem */
    public final class C112182 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public boolean Z$0;
        public int label;

        public C112182(HtJ<? super C112182> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmSwitchViewModel.this.new C112182(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmSwitchUiState value;
            Object objCommit = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objCommit);
                ConfidentialVmDowngradeOperation confidentialVmDowngradeOperation = ConfidentialVmSwitchViewModel.this.downgradeOperation;
                this.label = 1;
                objCommit = confidentialVmDowngradeOperation.commit(this);
                if (objCommit == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objCommit);
                    return Unit.INSTANCE;
                }
                Hwg.A00(objCommit);
            }
            boolean zA1X = AnonymousClass001.A1X(objCommit);
            BLG<ConfidentialVmSwitchUiState> blg = ConfidentialVmSwitchViewModel.this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(value, null, null, null, null, null, null, false, false, false, !zA1X, false, null, null, false, null, false, 64767, null)));
            if (zA1X) {
                HzR<ConfidentialVmSwitchStep> hzR = ConfidentialVmSwitchViewModel.this._steps;
                ConfidentialVmSwitchStep.DataTransferProgress dataTransferProgress = new ConfidentialVmSwitchStep.DataTransferProgress(ConfidentialVmSwitchDirection.TO_SECURE_VM);
                this.Z$0 = zA1X;
                this.label = 2;
                if (hzR.AcU(dataTransferProgress, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
                confidentialVmAnalytics.logDowngradeCouldNotStart();
                confidentialVmAnalytics.logSwitchErrorImpression(HatchScreen.CVM_TRANSFER_CONFIRM, ConfidentialVmSwitchViewModel.this.getEntryPoint(), AnonymousClass006.A0c(ConfidentialVmSwitchViewModel.this).direction);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmSwitchViewModel.this.new C112182(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$startFreshDowngrade$2", f = "ConfidentialVmSwitchViewModel.kt", l = {600}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$startFreshDowngrade$2, reason: invalid class name and case insensitive filesystem */
    public final class C112192 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C112192(HtJ<? super C112192> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmSwitchViewModel.this.new C112192(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HzR<ConfidentialVmSwitchStep> hzR = ConfidentialVmSwitchViewModel.this._steps;
                ConfidentialVmSwitchStep.Progress progress = new ConfidentialVmSwitchStep.Progress(ConfidentialVmSwitchDirection.TO_SECURE_VM);
                this.label = 1;
                if (hzR.AcU(progress, this) == enumC10460Hji) {
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
            return ConfidentialVmSwitchViewModel.this.new C112192(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConfidentialVmSwitchViewModel(ConfidentialVmSwitchDataSource confidentialVmSwitchDataSource, ConfidentialVmRepository confidentialVmRepository, ConfidentialVmSwitchOperation confidentialVmSwitchOperation, ConfidentialVmWaitlistRepository confidentialVmWaitlistRepository, ConfidentialVmMigrationOperation confidentialVmMigrationOperation, ConfidentialVmDowngradeOperation confidentialVmDowngradeOperation, ConfidentialVmValuePropsRepository confidentialVmValuePropsRepository, AuraViewerDataProvider auraViewerDataProvider, A6N a6n) {
        boolean zA1b = AnonymousClass004.A1b(confidentialVmSwitchDataSource, confidentialVmRepository);
        AnonymousClass005.A16(confidentialVmSwitchOperation, confidentialVmWaitlistRepository, confidentialVmMigrationOperation, confidentialVmDowngradeOperation, 2);
        AnonymousClass005.A13(confidentialVmValuePropsRepository, auraViewerDataProvider, a6n, 6);
        this.dataSource = confidentialVmSwitchDataSource;
        this.repository = confidentialVmRepository;
        this.operation = confidentialVmSwitchOperation;
        this.waitlistRepository = confidentialVmWaitlistRepository;
        this.migrationOperation = confidentialVmMigrationOperation;
        this.downgradeOperation = confidentialVmDowngradeOperation;
        this.valuePropsRepository = confidentialVmValuePropsRepository;
        this.viewerDataProvider = auraViewerDataProvider;
        this.savedStateHandle = a6n;
        ConfidentialVmSwitchDirection confidentialVmSwitchDirection = (ConfidentialVmSwitchDirection) a6n.A01("direction");
        confidentialVmSwitchDirection = confidentialVmSwitchDirection == null ? ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM : confidentialVmSwitchDirection;
        C9286GCn c9286GCn = new C9286GCn(new ConfidentialVmSwitchUiState(this.dataSource.getCurrentDestination(), confidentialVmSwitchDirection, (ConfidentialVmSwitchEntryPoint) this.savedStateHandle.A01("entry_point"), (ConfidentialVmDataChoice) this.savedStateHandle.A01(DATA_CHOICE_KEY), AHI.A01, C0943AIw.A03, zA1b, zA1b, zA1b, zA1b, zA1b, null, ConfidentialVmValuePropsState.Unresolved.INSTANCE, Companion.shouldShowGlassesUnavailableNotice(confidentialVmSwitchDirection, this.viewerDataProvider.userData.getValue()), null, zA1b));
        this._uiState = c9286GCn;
        this.uiState = AnonymousClass441.A00(withDataMigrationCopy((ConfidentialVmSwitchUiState) c9286GCn.getValue()), AEu.A00(this), new ConfidentialVmSwitchViewModel$special$$inlined$map$1(c9286GCn, this), C3Ek.A00);
        GCV gcvA00 = AbstractC10623Hzj.A00(C79.A00, -2);
        this._steps = gcvA00;
        this.steps = Hu1.A01(gcvA00);
        C3pU.A02(AEu.A00(this), new C10650I0u(new AnonymousClass1(null), confidentialVmSwitchDataSource.destination, 5));
        confidentialVmValuePropsRepository.collectIn(AEu.A00(this), new AnonymousClass2());
        C3pU.A02(AEu.A00(this), new C10650I0u(new AnonymousClass3(null), auraViewerDataProvider.userData, 5));
    }

    public final void onArtifactToggled(String str) {
        ConfidentialVmSwitchUiState value;
        ConfidentialVmSwitchUiState confidentialVmSwitchUiState;
        BQI<String> bqi;
        C7384Etj.A0Y(str, 0);
        BLG<ConfidentialVmSwitchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            confidentialVmSwitchUiState = value;
            bqi = confidentialVmSwitchUiState.selectedArtifactIds;
        } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(confidentialVmSwitchUiState, null, null, null, null, null, AGI.A09(bqi.contains(str) ? BGK.A04(str, bqi) : BGK.A02(str, bqi)), false, false, false, false, false, null, null, false, null, false, 65503, null)));
    }

    public final void onCredentialReady(RegisterPinEntryPoint registerPinEntryPoint) {
        C7384Etj.A0Y(registerPinEntryPoint, 0);
        this._steps.AhZ(registerPinEntryPoint == RegisterPinEntryPoint.SVM_TO_CVM_DATA_TRANSFER ? ConfidentialVmSwitchStep.DataTransferConfirm.INSTANCE : new ConfidentialVmSwitchStep.Progress(ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM));
    }

    public final void onDataChoiceSelected(ConfidentialVmDataChoice confidentialVmDataChoice) {
        ConfidentialVmSwitchUiState value;
        C7384Etj.A0Y(confidentialVmDataChoice, 0);
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        confidentialVmAnalytics.logDataChoiceOptionTap(confidentialVmDataChoice, getEntryPoint(), AnonymousClass006.A0c(this).direction);
        confidentialVmAnalytics.logSwitchBackDataChoiceOptionTap(confidentialVmDataChoice, AnonymousClass006.A0c(this).direction);
        this.savedStateHandle.A02(DATA_CHOICE_KEY, confidentialVmDataChoice);
        BLG<ConfidentialVmSwitchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(value, null, null, null, confidentialVmDataChoice, null, null, false, false, false, false, false, null, null, false, null, false, 65015, null)));
    }

    public final void onIntroDestinationShown(ConfidentialVmSwitchDestination confidentialVmSwitchDestination) {
        C7384Etj.A0Y(confidentialVmSwitchDestination, 0);
        this.lastImpressedIntroScreen = ConfidentialVmAnalytics.INSTANCE.logIntroImpression(confidentialVmSwitchDestination, getEntryPoint(), this.lastImpressedIntroScreen);
    }

    public final void onIntroShown(ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint) {
        ConfidentialVmSwitchUiState value;
        C7384Etj.A0Y(confidentialVmSwitchEntryPoint, 0);
        this.savedStateHandle.A02("entry_point", confidentialVmSwitchEntryPoint);
        this.lastImpressedIntroScreen = null;
        BLG<ConfidentialVmSwitchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(value, null, null, null, null, null, null, false, false, false, false, false, null, null, false, null, false, 63487, null)));
        this.dataSource.refresh();
        this.valuePropsRepository.refresh();
    }

    public final void onScreenShown(HatchScreen hatchScreen) {
        C7384Etj.A0Y(hatchScreen, 0);
        ConfidentialVmAnalytics.INSTANCE.logSwitchScreenView(hatchScreen, getEntryPoint(), AnonymousClass006.A0c(this).direction);
    }

    public final void onSwitchBackConfirmed(ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint) {
        C7384Etj.A0Y(confidentialVmSwitchEntryPoint, 0);
        if (confidentialVmSwitchEntryPoint == ConfidentialVmSwitchEntryPoint.SETTINGS) {
            HatchClientCvmEventLogger.INSTANCE.logSwitchBackClick();
        }
        this.savedStateHandle.A02("entry_point", confidentialVmSwitchEntryPoint);
        this.valuePropsRepository.refresh();
        startDataChoice(ConfidentialVmSwitchDirection.TO_SECURE_VM);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ConfidentialVmSwitchDestination.values().length];
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDestination.CVM_SUBSCRIBE, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDestination.CVM_SWITCH_INTRO, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDestination.CVM_JOIN_WAITLIST, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ConfidentialVmSwitchDestination.CVM_ON_WAITLIST, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ConfidentialVmSwitchDestination.CVM_LOADING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ConfidentialVmSwitchDestination.CVM_UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(ConfidentialVmSwitchDestination.CVM_ENCRYPTION_SETTINGS, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(ConfidentialVmSwitchDestination.NONE, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConfidentialVmDataChoice.values().length];
            try {
                AnonymousClass005.A0v(ConfidentialVmDataChoice.START_FRESH, iArr2, 1);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmDataChoice.UPGRADE_MIGRATION, iArr2, 2);
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ConfidentialVmVestaRegistration.values().length];
            try {
                AnonymousClass005.A0v(ConfidentialVmVestaRegistration.REGISTERED, iArr3, 1);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmVestaRegistration.NOT_REGISTERED, iArr3, 2);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmVestaRegistration.UNAVAILABLE, iArr3, 3);
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfidentialVmSwitchEntryPoint getEntryPoint() {
        return (ConfidentialVmSwitchEntryPoint) this.savedStateHandle.A01("entry_point");
    }

    private final void joinWaitlist() {
        ConfidentialVmSwitchUiState value;
        if (AnonymousClass006.A0c(this).isJoiningWaitlist) {
            return;
        }
        BLG<ConfidentialVmSwitchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(value, null, null, null, null, null, null, false, false, false, false, true, null, null, false, null, false, 62463, null)));
        AnonymousClass001.A1J(new C112132(null), AEu.A00(this));
    }

    private final void loadArtifactsToReview() {
        ConfidentialVmSwitchUiState value;
        if (AnonymousClass006.A0c(this).isContinuingDataChoice()) {
            return;
        }
        BLG<ConfidentialVmSwitchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(value, null, null, null, null, null, null, true, false, false, false, false, null, null, false, null, false, 64959, null)));
        AnonymousClass001.A1J(new C112142(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolveCredential() {
        ConfidentialVmSwitchUiState value;
        if (AnonymousClass006.A0c(this).isResolvingCredential) {
            return;
        }
        BLG<ConfidentialVmSwitchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(value, null, null, null, null, null, null, false, true, false, false, false, null, null, false, null, false, 64895, null)));
        AnonymousClass001.A1J(new C112162(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveCredentialStep(X.HtJ<? super com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchStep> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel.C112171
            if (r0 == 0) goto L6e
            r7 = r10
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$resolveCredentialStep$1 r7 = (com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel.C112171) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r8 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 0
            r4 = 2
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L3b
            if (r0 == r3) goto L49
            if (r0 != r4) goto L80
            java.lang.Object r1 = r7.L$0
            com.facebook.aura.navigation.key.RegisterPinEntryPoint r1 = (com.facebook.aura.navigation.key.RegisterPinEntryPoint) r1
            X.Hwg.A00(r8)
        L29:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r8 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration) r8
            int r0 = r8.ordinal()
            if (r0 == r2) goto L7a
            if (r0 == r3) goto L74
            if (r0 == r4) goto L85
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L3b:
            X.Hwg.A00(r8)
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation r0 = r9.operation
            r7.label = r3
            java.lang.Object r8 = r0.canSwitch(r7)
            if (r8 != r6) goto L4c
            return r6
        L49:
            X.Hwg.A00(r8)
        L4c:
            boolean r0 = X.AnonymousClass001.A1X(r8)
            if (r0 == 0) goto L85
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState r0 = X.AnonymousClass006.A0c(r9)
            com.facebook.aura.confidentialvm.model.ConfidentialVmDataChoice r1 = r0.dataChoice
            com.facebook.aura.confidentialvm.model.ConfidentialVmDataChoice r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmDataChoice.UPGRADE_MIGRATION
            if (r1 != r0) goto L6b
            com.facebook.aura.navigation.key.RegisterPinEntryPoint r1 = com.facebook.aura.navigation.key.RegisterPinEntryPoint.SVM_TO_CVM_DATA_TRANSFER
        L5e:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository r0 = r9.repository
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = r0.getVestaRegistration(r7)
            if (r8 != r6) goto L29
            return r6
        L6b:
            com.facebook.aura.navigation.key.RegisterPinEntryPoint r1 = com.facebook.aura.navigation.key.RegisterPinEntryPoint.SVM_TO_CVM_SWITCH
            goto L5e
        L6e:
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$resolveCredentialStep$1 r7 = new com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel$resolveCredentialStep$1
            r7.<init>(r10)
            goto L12
        L74:
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchStep$CreatePin r0 = new com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchStep$CreatePin
            r0.<init>(r1)
            return r0
        L7a:
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchStep$EnterPin r0 = new com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchStep$EnterPin
            r0.<init>(r1)
            return r0
        L80:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L85:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel.resolveCredentialStep(X.HtJ):java.lang.Object");
    }

    private final void startDataChoice(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        ConfidentialVmSwitchUiState value;
        ConfidentialVmSwitchDestination confidentialVmSwitchDestination;
        ConfidentialVmValuePropsState value2;
        A6N a6n = this.savedStateHandle;
        A6M a6m = a6n.A00;
        a6m.A04.remove(DATA_CHOICE_KEY);
        a6m.A01.remove(DATA_CHOICE_KEY);
        a6m.A02.remove(DATA_CHOICE_KEY);
        a6n.A01.remove(DATA_CHOICE_KEY);
        this.savedStateHandle.A02("direction", confidentialVmSwitchDirection);
        BLG<ConfidentialVmSwitchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            confidentialVmSwitchDestination = value.destination;
            value2 = this.valuePropsRepository.state.getValue();
        } while (!blg.A6e(value, new ConfidentialVmSwitchUiState(confidentialVmSwitchDestination, confidentialVmSwitchDirection, getEntryPoint(), null, AHI.A01, C0943AIw.A03, false, false, false, false, false, null, value2, Companion.shouldShowGlassesUnavailableNotice(confidentialVmSwitchDirection, this.viewerDataProvider.userData.getValue()), null, false)));
    }

    private final void startDowngrade() {
        ConfidentialVmSwitchUiState value;
        if (AnonymousClass006.A0c(this).isStartingDowngrade) {
            return;
        }
        BLG<ConfidentialVmSwitchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(value, null, null, null, null, null, null, false, false, true, false, false, null, null, false, null, false, 64767, null)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C112182(null), AEu.A00(this));
    }

    private final void startFreshDowngrade() {
        ConfidentialVmSwitchUiState value;
        if (AnonymousClass006.A0c(this).isStartingDowngrade) {
            return;
        }
        BLG<ConfidentialVmSwitchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(value, null, null, null, null, null, null, false, false, true, false, false, null, null, false, null, false, 64767, null)));
        AnonymousClass001.A1J(new C112192(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState withDataMigrationCopy(com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState r22) {
        /*
            r21 = this;
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState$Companion r3 = com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState.Companion
            boolean r1 = r3.isMigrateOptionEnabled()
            r0 = 0
            r4 = r22
            if (r1 == 0) goto L1b
            boolean r2 = r4.isSwitchingBack()
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsState r1 = r4.valuePropsState
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValueProps r1 = r1.getValueProps()
            if (r2 == 0) goto L51
            if (r1 == 0) goto L1b
            com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationCopy r0 = r1.dataMigrationToSecureVm
        L1b:
            boolean r1 = r4.isSwitchingBack()
            if (r1 == 0) goto L33
            boolean r1 = r3.isMigrateOptionEnabled()
            if (r1 == 0) goto L33
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsState r2 = r4.valuePropsState
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsState$Unresolved r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsState.Unresolved.INSTANCE
            boolean r1 = X.C7384Etj.areEqual(r2, r1)
            r20 = 1
            if (r1 != 0) goto L35
        L33:
            r20 = 0
        L35:
            r21 = 16383(0x3fff, float:2.2957E-41)
            r5 = 0
            r11 = 0
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r5
            r17 = r5
            r18 = r11
            r19 = r0
            r22 = r5
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        L51:
            if (r1 == 0) goto L1b
            com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationCopy r0 = r1.dataMigrationToConfidentialVm
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel.withDataMigrationCopy(com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState):com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState");
    }

    public final C20Q<ConfidentialVmSwitchStep> getSteps() {
        return this.steps;
    }

    public final C1BN<ConfidentialVmSwitchUiState> getUiState() {
        return this.uiState;
    }

    public final void onChangeRecoveryPinClick() {
        HatchClientCvmEventLogger.INSTANCE.logRecoveryPinChangeClick();
    }

    public final void onDataChoiceBackClick() {
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        confidentialVmAnalytics.logSwitchBackDismissTap(AnonymousClass006.A0c(this).direction);
        confidentialVmAnalytics.logSwitchTap(HatchScreen.CVM_DATA_CHOICE, HatchComponent.BACK_BUTTON, getEntryPoint(), AnonymousClass006.A0c(this).direction, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDataChoiceContinue() {
        /*
            r22 = this;
            r2 = r22
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState r0 = X.AnonymousClass006.A0c(r2)
            com.facebook.aura.confidentialvm.model.ConfidentialVmDataChoice r0 = r0.dataChoice
            if (r0 == 0) goto L17
            X.BLG<com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState> r0 = r2._uiState
            r0.getValue()
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState$Companion r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState.Companion
            boolean r0 = r0.isMigrateOptionEnabled()
            if (r0 != 0) goto L4c
        L17:
            X.A6N r1 = r2.savedStateHandle
            java.lang.String r0 = "data_choice"
            com.facebook.aura.confidentialvm.model.ConfidentialVmDataChoice r8 = com.facebook.aura.confidentialvm.model.ConfidentialVmDataChoice.START_FRESH
            r1.A02(r0, r8)
            X.BLG<com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState> r3 = r2._uiState
        L22:
            java.lang.Object r1 = r3.getValue()
            r4 = r1
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState r4 = (com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState) r4
            r21 = 65015(0xfdf7, float:9.1105E-41)
            r5 = 0
            r11 = 0
            r6 = r5
            r7 = r5
            r9 = r5
            r10 = r5
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r5
            r17 = r5
            r18 = r11
            r19 = r5
            r20 = r11
            r22 = r5
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = r3.A6e(r1, r0)
            if (r0 == 0) goto L22
        L4c:
            com.facebook.aura.confidentialvm.model.ConfidentialVmAnalytics r4 = com.facebook.aura.confidentialvm.model.ConfidentialVmAnalytics.INSTANCE
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState r0 = X.AnonymousClass006.A0c(r2)
            com.facebook.aura.confidentialvm.model.ConfidentialVmDataChoice r3 = r0.dataChoice
            com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint r1 = r2.getEntryPoint()
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState r0 = X.AnonymousClass006.A0c(r2)
            com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection r0 = r0.direction
            r4.logDataChoiceContinueTap(r3, r1, r0)
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState r0 = X.AnonymousClass006.A0c(r2)
            com.facebook.aura.confidentialvm.model.ConfidentialVmDataChoice r1 = r0.dataChoice
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState r0 = X.AnonymousClass006.A0c(r2)
            com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection r0 = r0.direction
            r4.logSwitchBackDataChoiceContinue(r1, r0)
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState r0 = X.AnonymousClass006.A0c(r2)
            com.facebook.aura.confidentialvm.model.ConfidentialVmDataChoice r1 = r0.dataChoice
            r0 = -1
            if (r1 == 0) goto L96
            int r1 = r1.ordinal()
            if (r1 == r0) goto L96
            r0 = 1
            if (r1 == r0) goto L97
            r0 = 0
            if (r1 != r0) goto La0
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState r0 = X.AnonymousClass006.A0c(r2)
            boolean r0 = r0.isSwitchingBack()
            if (r0 == 0) goto L9c
            X.HzR<com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchStep> r1 = r2._steps
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchStep$DataTransferConfirm r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchStep.DataTransferConfirm.INSTANCE
        L93:
            r1.AhZ(r0)
        L96:
            return
        L97:
            X.HzR<com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchStep> r1 = r2._steps
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchStep$ConfirmDelete r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchStep.ConfirmDelete.INSTANCE
            goto L93
        L9c:
            r2.resolveCredential()
            return
        La0:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel.onDataChoiceContinue():void");
    }

    public final void onDataChoiceLearnMoreClick() {
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        confidentialVmAnalytics.logSwitchBackLearnMoreTap(AnonymousClass006.A0c(this).direction);
        confidentialVmAnalytics.logSwitchTap(HatchScreen.CVM_DATA_CHOICE, HatchComponent.CVM_LEARN_MORE_LINK, getEntryPoint(), AnonymousClass006.A0c(this).direction, null);
    }

    public final void onDataChoiceNotNowClick() {
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        confidentialVmAnalytics.logSwitchBackDismissTap(AnonymousClass006.A0c(this).direction);
        confidentialVmAnalytics.logSwitchTap(HatchScreen.CVM_DATA_CHOICE, HatchComponent.NOT_NOW_BUTTON, getEntryPoint(), AnonymousClass006.A0c(this).direction, null);
    }

    public final void onDataChoiceShown() {
        if (C7384Etj.areEqual(this.valuePropsRepository.state.getValue(), ConfidentialVmValuePropsState.Unresolved.INSTANCE)) {
            this.valuePropsRepository.refresh();
        }
    }

    public final void onDataTransferConfirmed() {
        ConfidentialVmSwitchUiState value;
        ConfidentialVmAnalytics.INSTANCE.logSwitchTap(HatchScreen.CVM_TRANSFER_CONFIRM, HatchComponent.CVM_TRANSFER_BUTTON, getEntryPoint(), AnonymousClass006.A0c(this).direction, null);
        this._uiState.getValue();
        if (ConfidentialVmSwitchUiState.Companion.isMigrateOptionEnabled()) {
            if (AnonymousClass006.A0c(this).isSwitchingBack()) {
                startDowngrade();
                return;
            } else {
                AnonymousClass001.A1I(AnonymousClass001.A0y(), new C112152(null), AEu.A00(this));
                return;
            }
        }
        A6N a6n = this.savedStateHandle;
        A6M a6m = a6n.A00;
        a6m.A04.remove(DATA_CHOICE_KEY);
        a6m.A01.remove(DATA_CHOICE_KEY);
        a6m.A02.remove(DATA_CHOICE_KEY);
        a6n.A01.remove(DATA_CHOICE_KEY);
        BLG<ConfidentialVmSwitchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(value, null, null, null, null, null, null, false, false, false, false, false, null, null, false, null, false, 65015, null)));
        this._steps.AhZ(ConfidentialVmSwitchStep.ReturnToDataChoice.INSTANCE);
    }

    public final void onDeleteConfirmed() {
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        confidentialVmAnalytics.logSwitchTap(HatchScreen.CVM_DELETE_DATA_SHEET, HatchComponent.DELETE_CONFIRM_BUTTON, getEntryPoint(), AnonymousClass006.A0c(this).direction, null);
        confidentialVmAnalytics.logSwitchBackDeleteConfirmed(AnonymousClass006.A0c(this).direction);
        if (AnonymousClass006.A0c(this).isSwitchingBack()) {
            startFreshDowngrade();
        } else {
            resolveCredential();
        }
    }

    public final void onDeleteSheetCancelClick() {
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        confidentialVmAnalytics.logSwitchBackDeleteCancelTap(AnonymousClass006.A0c(this).direction);
        confidentialVmAnalytics.logSwitchTap(HatchScreen.CVM_DELETE_DATA_SHEET, HatchComponent.DELETE_CANCEL_BUTTON, getEntryPoint(), AnonymousClass006.A0c(this).direction, null);
    }

    public final void onDeleteSheetDownloadClick() {
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        confidentialVmAnalytics.logSwitchBackDownloadTap(AnonymousClass006.A0c(this).direction);
        confidentialVmAnalytics.logSwitchTap(HatchScreen.CVM_DELETE_DATA_SHEET, HatchComponent.DOWNLOAD_BUTTON, getEntryPoint(), AnonymousClass006.A0c(this).direction, null);
    }

    public final void onEncryptionSettingsShown() {
        HatchClientCvmEventLogger.INSTANCE.logCvmEncryptionSettingsView();
    }

    public final void onGlassesUnavailableNoticeShown() {
        ConfidentialVmAnalytics.INSTANCE.logGlassesUnavailableNoticeView(getEntryPoint(), AnonymousClass006.A0c(this).direction);
    }

    public final void onIntroBackClick() {
        ConfidentialVmAnalytics.INSTANCE.logIntroTap(AnonymousClass006.A0c(this).destination, HatchComponent.BACK_BUTTON, getEntryPoint());
    }

    public final void onIntroLearnMoreClick() {
        ConfidentialVmAnalytics.INSTANCE.logIntroTap(AnonymousClass006.A0c(this).destination, HatchComponent.CVM_LEARN_MORE_LINK, getEntryPoint());
    }

    public final void onIntroLegalLinkClick() {
        ConfidentialVmAnalytics.INSTANCE.logIntroTap(AnonymousClass006.A0c(this).destination, HatchComponent.LEGAL_LINK, getEntryPoint());
    }

    public final void onIntroPrimaryClick() {
        ConfidentialVmAnalytics.INSTANCE.logIntroPrimaryTap(AnonymousClass006.A0c(this).destination, getEntryPoint());
        onIntroContinue();
    }

    public final void onIntroSecondaryClick() {
        ConfidentialVmAnalytics.INSTANCE.logIntroTap(AnonymousClass006.A0c(this).destination, HatchComponent.NOT_NOW_BUTTON, getEntryPoint());
    }

    public final void onReviewArtifactsBackClick() {
        ConfidentialVmAnalytics.INSTANCE.logSwitchTap(HatchScreen.CVM_REVIEW_ARTIFACTS, HatchComponent.BACK_BUTTON, getEntryPoint(), AnonymousClass006.A0c(this).direction, null);
    }

    public final void onReviewArtifactsConfirm() {
        ConfidentialVmAnalytics.INSTANCE.logSwitchTap(HatchScreen.CVM_REVIEW_ARTIFACTS, HatchComponent.CONFIRM_BUTTON, getEntryPoint(), AnonymousClass006.A0c(this).direction, null);
        resolveCredential();
    }

    public final void onSubscribed(boolean z) {
        this._steps.AhZ(z ? ConfidentialVmSwitchStep.DataChoiceAfterSubscribing.INSTANCE : ConfidentialVmSwitchStep.Close.INSTANCE);
    }

    public final void onToggleAllArtifactsClick() {
        ConfidentialVmSwitchUiState value;
        ConfidentialVmSwitchUiState confidentialVmSwitchUiState;
        BQI bqiA09;
        BLG<ConfidentialVmSwitchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            confidentialVmSwitchUiState = value;
            if (confidentialVmSwitchUiState.selectedArtifactIds.isEmpty()) {
                AHD<ConfidentialVmArtifact> ahd = confidentialVmSwitchUiState.artifacts;
                ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                Iterator it = ahd.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(((ConfidentialVmArtifact) it.next()).id);
                }
                bqiA09 = AGI.A09(arrayListA0i);
            } else {
                bqiA09 = C0943AIw.A03;
            }
        } while (!blg.A6e(value, ConfidentialVmSwitchUiState.copy$default(confidentialVmSwitchUiState, null, null, null, null, null, bqiA09, false, false, false, false, false, null, null, false, null, false, 65503, null)));
    }

    public final void onTransferConfirmBackClick() {
        ConfidentialVmAnalytics.INSTANCE.logSwitchTap(HatchScreen.CVM_TRANSFER_CONFIRM, HatchComponent.BACK_BUTTON, getEntryPoint(), AnonymousClass006.A0c(this).direction, null);
    }

    public final class Companion {
        public final boolean shouldShowGlassesUnavailableNotice(ConfidentialVmSwitchDirection confidentialVmSwitchDirection, AuraUserData auraUserData) {
            C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
            return confidentialVmSwitchDirection == ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM && auraUserData != null && auraUserData.hasLinkedWearables;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final ConfidentialVmSwitchDirection getDirection() {
        return AnonymousClass006.A0c(this).direction;
    }

    public final void onIntroContinue() {
        int iOrdinal = AnonymousClass006.A0c(this).destination.ordinal();
        if (iOrdinal == 3) {
            joinWaitlist();
            return;
        }
        if (iOrdinal == 6) {
            this.dataSource.refresh();
            return;
        }
        ConfidentialVmSwitchStep confidentialVmSwitchStepStepAfterIntro = ConfidentialVmSwitchViewModelKt.stepAfterIntro(AnonymousClass006.A0c(this).destination);
        if (confidentialVmSwitchStepStepAfterIntro != null) {
            startDataChoice(ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM);
            this._steps.AhZ(confidentialVmSwitchStepStepAfterIntro);
        }
    }

    public final void onSettingsClick(Function0<Unit> function0, Function0<Unit> function02) {
        AnonymousClass003.A0u(function0, function02);
        switch (AnonymousClass006.A0c(this).destination.ordinal()) {
            case 0:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                function0.invoke();
                return;
            case 7:
                function02.invoke();
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
