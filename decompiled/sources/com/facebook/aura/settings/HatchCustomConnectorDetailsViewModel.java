package com.facebook.aura.settings;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.BLG;
import X.C06H;
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
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class HatchCustomConnectorDetailsViewModel extends AEs {
    public static final int $stable = 8;
    public final C3Em<String> _disconnectCompleted;
    public final BLG<CustomConnectorDetailsUiState> _uiState;
    public final C22I<String> disconnectCompleted;
    public final SingleFlight disconnectSingleFlight;
    public final HatchConnectorCatalogRepository repository;
    public final C1BN<CustomConnectorDetailsUiState> uiState;

    public final class Factory extends AuraViewModelFactory<HatchCustomConnectorDetailsViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchCustomConnectorDetailsViewModel create() {
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            return new HatchCustomConnectorDetailsViewModel(abstractC3358CGz, HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchCustomConnectorDetailsViewModel$disconnect$1", f = "HatchCustomConnectorDetailsViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchCustomConnectorDetailsViewModel$disconnect$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $connectorName;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.settings.HatchCustomConnectorDetailsViewModel$disconnect$1$1", f = "HatchCustomConnectorDetailsViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft, R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.settings.HatchCustomConnectorDetailsViewModel$disconnect$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03461 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ String $connectorName;
            public int label;
            public final /* synthetic */ HatchCustomConnectorDetailsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03461(HatchCustomConnectorDetailsViewModel hatchCustomConnectorDetailsViewModel, String str, HtJ<? super C03461> htJ) {
                super(1, htJ);
                this.this$0 = hatchCustomConnectorDetailsViewModel;
                this.$connectorName = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C03461(this.this$0, this.$connectorName, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C9286GCn.A00(null, new CustomConnectorDetailsUiState(this.$connectorName), (C9286GCn) this.this$0._uiState);
                    HatchConnectorCatalogRepository hatchConnectorCatalogRepository = this.this$0.repository;
                    String str = this.$connectorName;
                    this.label = 1;
                    obj = hatchConnectorCatalogRepository.disconnectSkill(str, null, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
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
                boolean zA1X = AnonymousClass001.A1X(obj);
                BLG<CustomConnectorDetailsUiState> blg = this.this$0._uiState;
                CustomConnectorDetailsUiState customConnectorDetailsUiState = new CustomConnectorDetailsUiState(null);
                C9286GCn c9286GCn = (C9286GCn) blg;
                if (zA1X) {
                    C9286GCn.A00(null, customConnectorDetailsUiState, c9286GCn);
                    C3Em<String> c3Em = this.this$0._disconnectCompleted;
                    String str2 = this.$connectorName;
                    this.label = 2;
                    if (c3Em.emit(str2, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    C9286GCn.A00(null, customConnectorDetailsUiState, c9286GCn);
                    ToastApi.INSTANCE.showToast(com.facebook.aura.R.string._name_removed__res_0x7f120e97);
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((C03461) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$connectorName = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCustomConnectorDetailsViewModel.this.new AnonymousClass1(this.$connectorName, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchCustomConnectorDetailsViewModel hatchCustomConnectorDetailsViewModel = HatchCustomConnectorDetailsViewModel.this;
                SingleFlight singleFlight = hatchCustomConnectorDetailsViewModel.disconnectSingleFlight;
                String str = this.$connectorName;
                C03461 c03461 = new C03461(hatchCustomConnectorDetailsViewModel, str, null);
                this.label = 1;
                if (singleFlight.invoke(str, c03461, this) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void disconnect(String str) {
        C7384Etj.A0Y(str, 0);
        if (this._uiState.getValue().disconnectingConnectorName == null) {
            AnonymousClass001.A1J(new AnonymousClass1(str, null), AEu.A00(this));
        }
    }

    public final C22I<String> getDisconnectCompleted() {
        return this.disconnectCompleted;
    }

    public final C1BN<CustomConnectorDetailsUiState> getUiState() {
        return this.uiState;
    }

    public HatchCustomConnectorDetailsViewModel(AbstractC3358CGz abstractC3358CGz, HatchConnectorCatalogRepository hatchConnectorCatalogRepository) {
        this.repository = hatchConnectorCatalogRepository;
        this.disconnectSingleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        C9286GCn c9286GCn = new C9286GCn(new CustomConnectorDetailsUiState(null));
        this._uiState = c9286GCn;
        this.uiState = new C3Pi(null, c9286GCn);
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 1);
        this._disconnectCompleted = c9290GCr;
        this.disconnectCompleted = new C3pd(c9290GCr);
    }

    public /* synthetic */ HatchCustomConnectorDetailsViewModel(AbstractC3358CGz abstractC3358CGz, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, C06H c06h) {
        this(abstractC3358CGz, hatchConnectorCatalogRepository);
    }
}
