package com.facebook.aura.settings;

import X.A3q;
import X.AEs;
import X.AEu;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BGK;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3Pi;
import X.C3UX;
import X.C3pd;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9286GCn;
import X.C9290GCr;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchAppEventLoggingContext;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.settings.CredentialCaptureResult;
import com.facebook.aura.toast.api.ToastApi;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchCredentialsViewModel extends AEs {
    public static final int $stable = 8;
    public final C3Em<Unit> _captureCompleted;
    public final BLG<SecureStorageCaptureUiState> _captureState;
    public final BLG<SecureStorageCatalogUiState> _catalogState;
    public final BLG<SecureStorageCredentialDetailsUiState> _credentialDetailsState;
    public final C3Em<String> _credentialUpdateCompleted;
    public final BLG<Set<String>> _externalGrantCapturesInFlight;
    public final C3Em<ExternalProviderGrantRequest> _externalProviderGrantRequests;
    public final C3Em<Unit> _verificationCodeCaptureCompleted;
    public final BLG<SecureStorageVerificationCodeCaptureUiState> _verificationCodeCaptureState;
    public final C22I<Unit> captureCompleted;
    public final C1BN<SecureStorageCaptureUiState> captureState;
    public final SingleFlight catalogLoadSingleFlight;
    public boolean catalogLoaded;
    public final C1BN<SecureStorageCatalogUiState> catalogState;
    public final C1BN<SecureStorageCredentialDetailsUiState> credentialDetailsState;
    public final C22I<String> credentialUpdateCompleted;
    public final C1BN<Set<String>> externalGrantCapturesInFlight;
    public final C22I<ExternalProviderGrantRequest> externalProviderGrantRequests;
    public final HatchCredentialsRepository repository;
    public final Map<String, ExternalGrantCapture> retryableExternalGrantCaptures;
    public final C22I<Unit> verificationCodeCaptureCompleted;
    public final C1BN<SecureStorageVerificationCodeCaptureUiState> verificationCodeCaptureState;

    public final class Factory extends AuraViewModelFactory<HatchCredentialsViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchCredentialsViewModel create() {
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            return new HatchCredentialsViewModel(abstractC3358CGz, new HatchCredentialsRepository(abstractC3358CGz));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsViewModel$deleteCredential$1", f = "HatchCredentialsViewModel.kt", l = {470}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchCredentialsViewModel$deleteCredential$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $id;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$id = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCredentialsViewModel.this.new AnonymousClass1(this.$id, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            SecureStorageCredentialDetailsUiState value;
            Object objM1943deletegIAlus;
            SecureStorageCredentialDetailsUiState value2;
            SecureStorageCredentialDetailsUiState value3;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<SecureStorageCredentialDetailsUiState> blg = HatchCredentialsViewModel.this._credentialDetailsState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, SecureStorageCredentialDetailsUiState.copy$default(value, null, null, false, false, null, false, false, false, false, false, true, false, false, 7167, null)));
                HatchCredentialsRepository hatchCredentialsRepository = HatchCredentialsViewModel.this.repository;
                String str = this.$id;
                this.label = 1;
                objM1943deletegIAlus = hatchCredentialsRepository.m1943deletegIAlus(str, this);
                if (objM1943deletegIAlus == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1943deletegIAlus = AnonymousClass002.A0j(obj);
            }
            String str2 = this.$id;
            HatchCredentialsViewModel hatchCredentialsViewModel = HatchCredentialsViewModel.this;
            Throwable thA00 = HsJ.A00(objM1943deletegIAlus);
            SecureStorageLogging secureStorageLogging = SecureStorageLogging.INSTANCE;
            if (thA00 == null) {
                secureStorageLogging.detailClick(HatchComponent.SECURE_STORAGE_DELETE_COMPLETED, str2);
                if (C06G.A0s(hatchCredentialsViewModel, str2)) {
                    BLG<SecureStorageCredentialDetailsUiState> blg2 = hatchCredentialsViewModel._credentialDetailsState;
                    do {
                        value3 = blg2.getValue();
                    } while (!blg2.A6e(value3, SecureStorageCredentialDetailsUiState.copy$default(value3, null, null, false, false, null, false, false, false, false, false, false, true, false, 5119, null)));
                    hatchCredentialsViewModel.loadCredentials();
                }
            } else {
                secureStorageLogging.detailClick(HatchComponent.SECURE_STORAGE_DELETE_FAILED, str2);
                if (C06G.A0s(hatchCredentialsViewModel, str2)) {
                    BLG<SecureStorageCredentialDetailsUiState> blg3 = hatchCredentialsViewModel._credentialDetailsState;
                    do {
                        value2 = blg3.getValue();
                    } while (!blg3.A6e(value2, SecureStorageCredentialDetailsUiState.copy$default(value2, null, null, false, false, null, false, false, false, false, false, false, false, false, 7167, null)));
                    ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120e9c);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsViewModel", f = "HatchCredentialsViewModel.kt", l = {169}, m = "loadCatalog", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchCredentialsViewModel$loadCatalog$1, reason: invalid class name and case insensitive filesystem */
    public final class C134981 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C134981(HtJ<? super C134981> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCredentialsViewModel.this.loadCatalog(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsViewModel$loadCatalog$3", f = "HatchCredentialsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchCredentialsViewModel$loadCatalog$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HoC>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsViewModel$loadCatalog$3$1", f = "HatchCredentialsViewModel.kt", l = {172}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.settings.HatchCredentialsViewModel$loadCatalog$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ HatchCredentialsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchCredentialsViewModel hatchCredentialsViewModel, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = hatchCredentialsViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object objM1942catalogAllIoAF18A;
                SecureStorageCatalogUiState value;
                SecureStorageCatalogUiState secureStorageCatalogUiState;
                SecureStorageCatalogUiState value2;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchCredentialsRepository hatchCredentialsRepository = this.this$0.repository;
                    this.label = 1;
                    objM1942catalogAllIoAF18A = hatchCredentialsRepository.m1942catalogAllIoAF18A(this);
                    if (objM1942catalogAllIoAF18A == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM1942catalogAllIoAF18A = AnonymousClass001.A0q(obj);
                }
                HatchCredentialsViewModel hatchCredentialsViewModel = this.this$0;
                if (HsJ.A00(objM1942catalogAllIoAF18A) == null) {
                    AHD ahd = (AHD) objM1942catalogAllIoAF18A;
                    hatchCredentialsViewModel.catalogLoaded = true;
                    BLG<SecureStorageCatalogUiState> blg = hatchCredentialsViewModel._catalogState;
                    do {
                        value2 = blg.getValue();
                    } while (!blg.A6e(value2, HatchCredentialsViewModelKt.withCandidates(value2, ahd)));
                } else {
                    BLG<SecureStorageCatalogUiState> blg2 = hatchCredentialsViewModel._catalogState;
                    do {
                        value = blg2.getValue();
                        secureStorageCatalogUiState = value;
                    } while (!blg2.A6e(value, secureStorageCatalogUiState.copy(secureStorageCatalogUiState.candidates, secureStorageCatalogUiState.storedCandidates, secureStorageCatalogUiState.onePasswordLogins, secureStorageCatalogUiState.passwordsEntryPoint, secureStorageCatalogUiState.customConnectors, secureStorageCatalogUiState.isLoading, true)));
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new AnonymousClass1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsViewModel$loadCatalog$3$2", f = "HatchCredentialsViewModel.kt", l = {183}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.settings.HatchCredentialsViewModel$loadCatalog$3$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ HatchCredentialsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HatchCredentialsViewModel hatchCredentialsViewModel, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.this$0 = hatchCredentialsViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object objM1945listCustomConnectorsIoAF18A;
                SecureStorageCatalogUiState value;
                SecureStorageCatalogUiState secureStorageCatalogUiState;
                SecureStorageCatalogUiState value2;
                SecureStorageCatalogUiState secureStorageCatalogUiState2;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchCredentialsRepository hatchCredentialsRepository = this.this$0.repository;
                    this.label = 1;
                    objM1945listCustomConnectorsIoAF18A = hatchCredentialsRepository.m1945listCustomConnectorsIoAF18A(this);
                    if (objM1945listCustomConnectorsIoAF18A == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM1945listCustomConnectorsIoAF18A = AnonymousClass001.A0q(obj);
                }
                HatchCredentialsViewModel hatchCredentialsViewModel = this.this$0;
                if (HsJ.A00(objM1945listCustomConnectorsIoAF18A) == null) {
                    AHD<CustomConnectorCandidate> ahd = (AHD) objM1945listCustomConnectorsIoAF18A;
                    BLG<SecureStorageCatalogUiState> blg = hatchCredentialsViewModel._catalogState;
                    do {
                        value2 = blg.getValue();
                        secureStorageCatalogUiState2 = value2;
                    } while (!blg.A6e(value2, secureStorageCatalogUiState2.copy(secureStorageCatalogUiState2.candidates, secureStorageCatalogUiState2.storedCandidates, secureStorageCatalogUiState2.onePasswordLogins, secureStorageCatalogUiState2.passwordsEntryPoint, ahd, secureStorageCatalogUiState2.isLoading, secureStorageCatalogUiState2.hasError)));
                } else {
                    BLG<SecureStorageCatalogUiState> blg2 = hatchCredentialsViewModel._catalogState;
                    do {
                        value = blg2.getValue();
                        secureStorageCatalogUiState = value;
                    } while (!blg2.A6e(value, secureStorageCatalogUiState.copy(secureStorageCatalogUiState.candidates, secureStorageCatalogUiState.storedCandidates, secureStorageCatalogUiState.onePasswordLogins, secureStorageCatalogUiState.passwordsEntryPoint, secureStorageCatalogUiState.customConnectors, secureStorageCatalogUiState.isLoading, true)));
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new AnonymousClass2(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = HatchCredentialsViewModel.this.new AnonymousClass3(htJ);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(HatchCredentialsViewModel.this, null);
            C6ys c6ys = C6ys.A00;
            Integer num = C79.A00;
            GAo.A02(num, c6ys, anonymousClass1, c3ux);
            return GAo.A02(num, c6ys, new AnonymousClass2(HatchCredentialsViewModel.this, null), c3ux);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HoC> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsViewModel$loadCredentialDetails$1", f = "HatchCredentialsViewModel.kt", l = {407}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchCredentialsViewModel$loadCredentialDetails$1, reason: invalid class name and case insensitive filesystem */
    public final class C134991 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $id;
        public final /* synthetic */ boolean $isRetry;
        public final /* synthetic */ HatchAppEventLoggingContext $loggingContext;
        public final /* synthetic */ boolean $openedFromChat;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134991(String str, boolean z, boolean z2, HatchAppEventLoggingContext hatchAppEventLoggingContext, HtJ<? super C134991> htJ) {
            super(2, htJ);
            this.$id = str;
            this.$isRetry = z;
            this.$openedFromChat = z2;
            this.$loggingContext = hatchAppEventLoggingContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCredentialsViewModel.this.new C134991(this.$id, this.$isRetry, this.$openedFromChat, this.$loggingContext, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1944detailsgIAlus;
            BLG<SecureStorageCredentialDetailsUiState> blg;
            SecureStorageCredentialDetailsUiState secureStorageCredentialDetailsUiState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass001.A1E(HatchCredentialsViewModel.this._credentialDetailsState, null, new SecureStorageCredentialDetailsUiState(this.$id, null, false, true, null, false, true, true, false, false, false, false, false));
                HatchCredentialsRepository hatchCredentialsRepository = HatchCredentialsViewModel.this.repository;
                String str = this.$id;
                this.label = 1;
                objM1944detailsgIAlus = hatchCredentialsRepository.m1944detailsgIAlus(str, this);
                if (objM1944detailsgIAlus == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1944detailsgIAlus = AnonymousClass002.A0j(obj);
            }
            String str2 = this.$id;
            boolean z = this.$isRetry;
            boolean z2 = this.$openedFromChat;
            HatchAppEventLoggingContext hatchAppEventLoggingContext = this.$loggingContext;
            HatchCredentialsViewModel hatchCredentialsViewModel = HatchCredentialsViewModel.this;
            Throwable thA00 = HsJ.A00(objM1944detailsgIAlus);
            if (thA00 == null) {
                CredentialDetails credentialDetails = (CredentialDetails) objM1944detailsgIAlus;
                SecureStorageLogging.INSTANCE.detailsLoadResult(str2, z, z2, null, hatchAppEventLoggingContext);
                if (C06G.A0s(hatchCredentialsViewModel, str2)) {
                    blg = hatchCredentialsViewModel._credentialDetailsState;
                    String str3 = credentialDetails.username;
                    boolean z3 = credentialDetails.passwordPresent;
                    boolean z4 = credentialDetails.available;
                    CredentialAgentPermission credentialAgentPermission = credentialDetails.agentPermission;
                    boolean z5 = credentialDetails.isFromOnePassword;
                    secureStorageCredentialDetailsUiState = new SecureStorageCredentialDetailsUiState(str2, str3, z3, z4, credentialAgentPermission, z5, !z5, false, true, false, false, false, false);
                    AnonymousClass002.A1I(blg, secureStorageCredentialDetailsUiState);
                }
            } else {
                SecureStorageLogging.INSTANCE.detailsLoadResult(str2, z, z2, thA00, hatchAppEventLoggingContext);
                if (C06G.A0s(hatchCredentialsViewModel, str2)) {
                    blg = hatchCredentialsViewModel._credentialDetailsState;
                    secureStorageCredentialDetailsUiState = new SecureStorageCredentialDetailsUiState(str2, null, false, true, null, false, true, false, false, true, false, false, false);
                    AnonymousClass002.A1I(blg, secureStorageCredentialDetailsUiState);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134991) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsViewModel$loadCredentials$1", f = "HatchCredentialsViewModel.kt", l = {157}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchCredentialsViewModel$loadCredentials$1, reason: invalid class name and case insensitive filesystem */
    public final class C135001 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsViewModel$loadCredentials$1$1", f = "HatchCredentialsViewModel.kt", l = {157}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.settings.HatchCredentialsViewModel$loadCredentials$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03451 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ HatchCredentialsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03451(HatchCredentialsViewModel hatchCredentialsViewModel, HtJ<? super C03451> htJ) {
                super(1, htJ);
                this.this$0 = hatchCredentialsViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C03451(this.this$0, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new C03451(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchCredentialsViewModel hatchCredentialsViewModel = this.this$0;
                    this.label = 1;
                    if (hatchCredentialsViewModel.loadCatalog(this) == enumC10460Hji) {
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
        }

        public C135001(HtJ<? super C135001> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCredentialsViewModel.this.new C135001(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchCredentialsViewModel hatchCredentialsViewModel = HatchCredentialsViewModel.this;
                SingleFlight singleFlight = hatchCredentialsViewModel.catalogLoadSingleFlight;
                C03451 c03451 = new C03451(hatchCredentialsViewModel, null);
                this.label = 1;
                if (singleFlight.invoke(Unit.INSTANCE, c03451, this) == enumC10460Hji) {
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
            return HatchCredentialsViewModel.this.new C135001(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsViewModel$requestExternalProviderGrant$3", f = "HatchCredentialsViewModel.kt", l = {283, 287}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchCredentialsViewModel$requestExternalProviderGrant$3, reason: invalid class name and case insensitive filesystem */
    public final class C135013 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $authProvider;
        public final /* synthetic */ String $captureAuthorization;
        public final /* synthetic */ String $key;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135013(String str, String str2, String str3, HtJ<? super C135013> htJ) {
            super(2, htJ);
            this.$captureAuthorization = str;
            this.$authProvider = str2;
            this.$key = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCredentialsViewModel.this.new C135013(this.$captureAuthorization, this.$authProvider, this.$key, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:8:0x0015->B:22:?, LOOP_END, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r4 = 2
                r3 = 1
                if (r0 == 0) goto L1e
                if (r0 == r3) goto L32
                if (r0 != r4) goto L4e
                X.Hwg.A00(r7)
            Lf:
                com.facebook.aura.settings.HatchCredentialsViewModel r0 = com.facebook.aura.settings.HatchCredentialsViewModel.this
                X.BLG<java.util.Set<java.lang.String>> r2 = r0._externalGrantCapturesInFlight
                java.lang.String r1 = r6.$key
            L15:
                boolean r0 = X.AnonymousClass007.A1N(r1, r2)
                if (r0 == 0) goto L15
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L1e:
                X.Hwg.A00(r7)
                com.facebook.aura.settings.HatchCredentialsViewModel r0 = com.facebook.aura.settings.HatchCredentialsViewModel.this
                com.facebook.aura.settings.HatchCredentialsRepository r2 = r0.repository
                java.lang.String r1 = r6.$captureAuthorization
                java.lang.String r0 = r6.$authProvider
                r6.label = r3
                java.lang.Object r7 = r2.requestExternalProviderGrant(r1, r0, r6)
                if (r7 != r5) goto L35
                return r5
            L32:
                X.Hwg.A00(r7)
            L35:
                com.facebook.aura.settings.ExternalProviderGrantResult r7 = (com.facebook.aura.settings.ExternalProviderGrantResult) r7
                com.facebook.aura.settings.HatchCredentialsViewModel r0 = com.facebook.aura.settings.HatchCredentialsViewModel.this
                X.3Em<com.facebook.aura.settings.ExternalProviderGrantRequest> r2 = r0._externalProviderGrantRequests
                java.lang.String r0 = r6.$key
                com.facebook.aura.settings.ExternalProviderGrantRequest r1 = new com.facebook.aura.settings.ExternalProviderGrantRequest
                r1.<init>(r0, r7)
                r0 = 0
                r6.L$0 = r0
                r6.label = r4
                java.lang.Object r0 = r2.emit(r1, r6)
                if (r0 != r5) goto Lf
                return r5
            L4e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchCredentialsViewModel.C135013.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C135013) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsViewModel$saveCredential$1", f = "HatchCredentialsViewModel.kt", l = {236, 251, 253}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchCredentialsViewModel$saveCredential$1, reason: invalid class name and case insensitive filesystem */
    public final class C135021 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $captureAuthorization;
        public final /* synthetic */ List<CredentialCaptureFieldJson> $fields;
        public final /* synthetic */ String $idempotencyKey;
        public final /* synthetic */ boolean $isFromChat;
        public final /* synthetic */ String $pageUrl;
        public final /* synthetic */ boolean $saveToSecureStorage;
        public final /* synthetic */ String $sessionId;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135021(String str, String str2, List<CredentialCaptureFieldJson> list, String str3, String str4, boolean z, boolean z2, HtJ<? super C135021> htJ) {
            super(2, htJ);
            this.$pageUrl = str;
            this.$idempotencyKey = str2;
            this.$fields = list;
            this.$sessionId = str3;
            this.$captureAuthorization = str4;
            this.$saveToSecureStorage = z;
            this.$isFromChat = z2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCredentialsViewModel.this.new C135021(this.$pageUrl, this.$idempotencyKey, this.$fields, this.$sessionId, this.$captureAuthorization, this.$saveToSecureStorage, this.$isFromChat, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r12.label
                r3 = 3
                r4 = 2
                r1 = 1
                if (r0 == 0) goto L1d
                if (r0 == r1) goto L4d
                if (r0 == r4) goto L7e
                if (r0 != r3) goto Lbe
                X.Hwg.A00(r13)
            L12:
                com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
                r0 = 2131889840(0x7f120eb0, float:1.9414355E38)
                r1.showToast(r0)
            L1a:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
            L1d:
                X.Hwg.A00(r13)
                com.facebook.aura.settings.HatchCredentialsViewModel r0 = com.facebook.aura.settings.HatchCredentialsViewModel.this
                X.BLG<com.facebook.aura.settings.SecureStorageCaptureUiState> r6 = r0._captureState
                r5 = 0
                com.facebook.aura.settings.SecureStorageCaptureUiState r0 = new com.facebook.aura.settings.SecureStorageCaptureUiState
                r0.<init>(r1, r5, r5)
                X.AnonymousClass001.A1E(r6, r5, r0)
                com.facebook.aura.settings.HatchCredentialsViewModel r0 = com.facebook.aura.settings.HatchCredentialsViewModel.this
                com.facebook.aura.settings.HatchCredentialsRepository r5 = r0.repository
                java.lang.String r6 = r12.$pageUrl
                java.lang.String r7 = r12.$idempotencyKey
                java.util.List<com.facebook.aura.settings.CredentialCaptureFieldJson> r8 = r12.$fields
                java.lang.String r9 = r12.$sessionId
                java.lang.String r10 = r12.$captureAuthorization
                boolean r0 = r12.$saveToSecureStorage
                if (r0 == 0) goto L4a
                java.lang.String r11 = "persist"
            L41:
                r12.label = r1
                java.lang.Object r13 = r5.capture(r6, r7, r8, r9, r10, r11, r12)
                if (r13 != r2) goto L50
                return r2
            L4a:
                java.lang.String r11 = "ephemeral_ttl"
                goto L41
            L4d:
                X.Hwg.A00(r13)
            L50:
                com.facebook.aura.settings.CredentialCaptureResult r13 = (com.facebook.aura.settings.CredentialCaptureResult) r13
                boolean r0 = r13 instanceof com.facebook.aura.settings.CredentialCaptureResult.Success
                if (r0 == 0) goto L94
                com.facebook.aura.settings.SecureStorageLogging r5 = com.facebook.aura.settings.SecureStorageLogging.INSTANCE
                com.facebook.aura.analytics.hatch.HatchComponent r1 = com.facebook.aura.analytics.hatch.HatchComponent.SECURE_STORAGE_ADD_COMPLETED
                boolean r0 = r12.$isFromChat
                r5.addLoginClick(r1, r0)
                com.facebook.aura.settings.HatchCredentialsViewModel r0 = com.facebook.aura.settings.HatchCredentialsViewModel.this
                X.BLG<com.facebook.aura.settings.SecureStorageCaptureUiState> r6 = r0._captureState
                r5 = 0
                r1 = 0
                com.facebook.aura.settings.SecureStorageCaptureUiState r0 = new com.facebook.aura.settings.SecureStorageCaptureUiState
                r0.<init>(r1, r5, r5)
                X.AnonymousClass001.A1E(r6, r5, r0)
                com.facebook.aura.settings.HatchCredentialsViewModel r0 = com.facebook.aura.settings.HatchCredentialsViewModel.this
                X.3Em<kotlin.Unit> r1 = r0._captureCompleted
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                r12.L$0 = r5
                r12.label = r4
                java.lang.Object r0 = r1.emit(r0, r12)
                if (r0 != r2) goto L81
                return r2
            L7e:
                X.Hwg.A00(r13)
            L81:
                com.facebook.aura.settings.HatchCredentialsViewModel r0 = com.facebook.aura.settings.HatchCredentialsViewModel.this
                r0.loadCredentials()
                r0 = 0
                r12.L$0 = r0
                r12.label = r3
                r0 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r0 = X.C7Bq.A01(r0, r12)
                if (r0 != r2) goto L12
                return r2
            L94:
                boolean r0 = r13 instanceof com.facebook.aura.settings.CredentialCaptureResult.Error
                if (r0 == 0) goto Lc3
                com.facebook.aura.settings.SecureStorageLogging r3 = com.facebook.aura.settings.SecureStorageLogging.INSTANCE
                boolean r2 = r12.$isFromChat
                com.facebook.aura.settings.CredentialCaptureResult$Error r13 = (com.facebook.aura.settings.CredentialCaptureResult.Error) r13
                com.facebook.aura.settings.CredentialCaptureError r1 = r13.error
                com.facebook.aura.settings.CredentialCaptureError r0 = com.facebook.aura.settings.CredentialCaptureError.INVALID
                if (r1 != r0) goto Lbb
                java.lang.String r0 = "invalid_request"
            La6:
                r3.addLoginFailed(r2, r0)
                com.facebook.aura.settings.HatchCredentialsViewModel r0 = com.facebook.aura.settings.HatchCredentialsViewModel.this
                X.BLG<com.facebook.aura.settings.SecureStorageCaptureUiState> r4 = r0._captureState
                com.facebook.aura.settings.CredentialCaptureError r3 = r13.error
                r2 = 0
                r1 = 0
                com.facebook.aura.settings.SecureStorageCaptureUiState r0 = new com.facebook.aura.settings.SecureStorageCaptureUiState
                r0.<init>(r1, r2, r3)
                X.AnonymousClass001.A1E(r4, r2, r0)
                goto L1a
            Lbb:
                java.lang.String r0 = "request_failed"
                goto La6
            Lbe:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            Lc3:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchCredentialsViewModel.C135021.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C135021) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsViewModel$submitExternalGrant$2", f = "HatchCredentialsViewModel.kt", l = {318}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchCredentialsViewModel$submitExternalGrant$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ExternalGrantCapture $capture;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ExternalGrantCapture externalGrantCapture, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$capture = externalGrantCapture;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCredentialsViewModel.this.new AnonymousClass2(this.$capture, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Set<String> value;
            ToastApi toastApi;
            int iCredentialCaptureErrorResource;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchCredentialsRepository hatchCredentialsRepository = HatchCredentialsViewModel.this.repository;
                ExternalGrantCapture externalGrantCapture = this.$capture;
                String str = externalGrantCapture.pageUrl;
                String str2 = externalGrantCapture.idempotencyKey;
                String str3 = externalGrantCapture.authProvider;
                String str4 = externalGrantCapture.grant;
                String str5 = externalGrantCapture.sessionId;
                String str6 = externalGrantCapture.captureAuthorization;
                this.label = 1;
                obj = hatchCredentialsRepository.captureExternalGrant(str, str2, str3, str4, str5, str6, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            CredentialCaptureResult credentialCaptureResult = (CredentialCaptureResult) obj;
            boolean z = credentialCaptureResult instanceof CredentialCaptureResult.Error;
            if (z && ((CredentialCaptureResult.Error) credentialCaptureResult).retryable) {
                Map<String, ExternalGrantCapture> map = HatchCredentialsViewModel.this.retryableExternalGrantCaptures;
                ExternalGrantCapture externalGrantCapture2 = this.$capture;
                map.put(externalGrantCapture2.key, externalGrantCapture2);
            } else {
                HatchCredentialsViewModel.this.retryableExternalGrantCaptures.remove(this.$capture.key);
            }
            BLG<Set<String>> blg = HatchCredentialsViewModel.this._externalGrantCapturesInFlight;
            ExternalGrantCapture externalGrantCapture3 = this.$capture;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, BGK.A04(externalGrantCapture3.key, value)));
            if (credentialCaptureResult instanceof CredentialCaptureResult.Success) {
                HatchCredentialsViewModel.this.loadCredentials();
                toastApi = ToastApi.INSTANCE;
                iCredentialCaptureErrorResource = R.string._name_removed__res_0x7f120eb0;
            } else {
                if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
                toastApi = ToastApi.INSTANCE;
                iCredentialCaptureErrorResource = HatchCredentialCaptureErrorKt.credentialCaptureErrorResource(((CredentialCaptureResult.Error) credentialCaptureResult).error);
            }
            toastApi.showToast(iCredentialCaptureErrorResource);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsViewModel$submitVerificationCode$1", f = "HatchCredentialsViewModel.kt", l = {372, 383}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchCredentialsViewModel$submitVerificationCode$1, reason: invalid class name and case insensitive filesystem */
    public final class C135031 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $captureAuthorization;
        public final /* synthetic */ String $idempotencyKey;
        public final /* synthetic */ String $pageUrl;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ String $trimmedCode;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135031(String str, String str2, String str3, String str4, String str5, HtJ<? super C135031> htJ) {
            super(2, htJ);
            this.$pageUrl = str;
            this.$trimmedCode = str2;
            this.$idempotencyKey = str3;
            this.$sessionId = str4;
            this.$captureAuthorization = str5;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCredentialsViewModel.this.new C135031(this.$pageUrl, this.$trimmedCode, this.$idempotencyKey, this.$sessionId, this.$captureAuthorization, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass001.A1E(HatchCredentialsViewModel.this._verificationCodeCaptureState, null, new SecureStorageVerificationCodeCaptureUiState(true, null, null));
                HatchCredentialsRepository hatchCredentialsRepository = HatchCredentialsViewModel.this.repository;
                String str = this.$pageUrl;
                String str2 = this.$trimmedCode;
                String str3 = this.$idempotencyKey;
                String str4 = this.$sessionId;
                String str5 = this.$captureAuthorization;
                this.label = 1;
                obj = hatchCredentialsRepository.captureVerificationCode(str, str2, str3, str4, str5, this);
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
            CredentialCaptureResult credentialCaptureResult = (CredentialCaptureResult) obj;
            if (credentialCaptureResult instanceof CredentialCaptureResult.Success) {
                SecureStorageLogging.INSTANCE.verificationClick(HatchComponent.SECURE_STORAGE_ADD_COMPLETED);
                AnonymousClass001.A1E(HatchCredentialsViewModel.this._verificationCodeCaptureState, null, new SecureStorageVerificationCodeCaptureUiState(false, null, null));
                C3Em<Unit> c3Em = HatchCredentialsViewModel.this._verificationCodeCaptureCompleted;
                Unit unit = Unit.INSTANCE;
                this.L$0 = null;
                this.label = 2;
                if (c3Em.emit(unit, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (!(credentialCaptureResult instanceof CredentialCaptureResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                CredentialCaptureResult.Error error = (CredentialCaptureResult.Error) credentialCaptureResult;
                SecureStorageLogging.INSTANCE.verificationFailed(error.error == CredentialCaptureError.INVALID ? HatchCredentialsViewModelKt.SECURE_STORAGE_FAILURE_INVALID_REQUEST : HatchCredentialsViewModelKt.SECURE_STORAGE_FAILURE_REQUEST_FAILED);
                AnonymousClass001.A1E(HatchCredentialsViewModel.this._verificationCodeCaptureState, null, new SecureStorageVerificationCodeCaptureUiState(false, null, error.error));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C135031) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchCredentialsViewModel$updateCredential$1", f = "HatchCredentialsViewModel.kt", l = {523, 541}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchCredentialsViewModel$updateCredential$1, reason: invalid class name and case insensitive filesystem */
    public final class C135041 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ CredentialAgentPermission $agentPermission;
        public final /* synthetic */ boolean $agentPermissionChanged;
        public final /* synthetic */ boolean $credentialFieldsChanged;
        public final /* synthetic */ String $id;
        public final /* synthetic */ String $password;
        public final /* synthetic */ String $username;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135041(String str, String str2, String str3, CredentialAgentPermission credentialAgentPermission, boolean z, boolean z2, HtJ<? super C135041> htJ) {
            super(2, htJ);
            this.$id = str;
            this.$username = str2;
            this.$password = str3;
            this.$agentPermission = credentialAgentPermission;
            this.$credentialFieldsChanged = z;
            this.$agentPermissionChanged = z2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCredentialsViewModel.this.new C135041(this.$id, this.$username, this.$password, this.$agentPermission, this.$credentialFieldsChanged, this.$agentPermissionChanged, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            SecureStorageCredentialDetailsUiState value;
            Object objM1946updateyxL6bBk;
            SecureStorageCredentialDetailsUiState value2;
            SecureStorageCredentialDetailsUiState value3;
            SecureStorageCredentialDetailsUiState secureStorageCredentialDetailsUiState;
            String str;
            boolean z;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<SecureStorageCredentialDetailsUiState> blg = HatchCredentialsViewModel.this._credentialDetailsState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, SecureStorageCredentialDetailsUiState.copy$default(value, null, null, false, false, null, false, false, false, false, false, false, false, true, 4095, null)));
                HatchCredentialsRepository hatchCredentialsRepository = HatchCredentialsViewModel.this.repository;
                String str2 = this.$id;
                String str3 = this.$username;
                boolean z2 = this.$credentialFieldsChanged;
                if (!z2) {
                    str3 = null;
                }
                String str4 = this.$password;
                if (!z2) {
                    str4 = null;
                }
                CredentialAgentPermission credentialAgentPermission = this.$agentPermissionChanged ? this.$agentPermission : null;
                this.label = 1;
                objM1946updateyxL6bBk = hatchCredentialsRepository.m1946updateyxL6bBk(str2, str3, str4, credentialAgentPermission, this);
                if (objM1946updateyxL6bBk == enumC10460Hji) {
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
                objM1946updateyxL6bBk = AnonymousClass002.A0j(obj);
            }
            String str5 = this.$id;
            HatchCredentialsViewModel hatchCredentialsViewModel = HatchCredentialsViewModel.this;
            boolean z3 = this.$credentialFieldsChanged;
            String str6 = this.$username;
            if (HsJ.A00(objM1946updateyxL6bBk) == null) {
                CredentialAgentPermission credentialAgentPermission2 = (CredentialAgentPermission) objM1946updateyxL6bBk;
                SecureStorageLogging.INSTANCE.detailClick(HatchComponent.SECURE_STORAGE_UPDATE_COMPLETED, str5);
                if (C06G.A0s(hatchCredentialsViewModel, str5)) {
                    BLG<SecureStorageCredentialDetailsUiState> blg2 = hatchCredentialsViewModel._credentialDetailsState;
                    do {
                        value3 = blg2.getValue();
                        secureStorageCredentialDetailsUiState = value3;
                        if (z3) {
                            str = str6;
                            z = true;
                        } else {
                            str = secureStorageCredentialDetailsUiState.username;
                            z = secureStorageCredentialDetailsUiState.passwordPresent;
                        }
                    } while (!blg2.A6e(value3, SecureStorageCredentialDetailsUiState.copy$default(secureStorageCredentialDetailsUiState, null, str, z, false, credentialAgentPermission2 == null ? secureStorageCredentialDetailsUiState.agentPermission : credentialAgentPermission2, false, false, false, false, false, false, false, false, 4073, null)));
                    C3Em<String> c3Em = hatchCredentialsViewModel._credentialUpdateCompleted;
                    this.L$0 = null;
                    this.label = 2;
                    if (c3Em.emit(str5, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            } else {
                SecureStorageLogging.INSTANCE.updateFailed(str5, HatchCredentialsViewModelKt.SECURE_STORAGE_FAILURE_REQUEST_FAILED);
                if (C06G.A0s(hatchCredentialsViewModel, str5)) {
                    BLG<SecureStorageCredentialDetailsUiState> blg3 = hatchCredentialsViewModel._credentialDetailsState;
                    do {
                        value2 = blg3.getValue();
                    } while (!blg3.A6e(value2, SecureStorageCredentialDetailsUiState.copy$default(value2, null, null, false, false, null, false, false, false, false, false, false, false, false, 4095, null)));
                    ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120eb6);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C135041) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void captureExternalGrant(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A14(str, str2, str3, str4);
        if (AnonymousClass006.A1a(str, this._externalGrantCapturesInFlight)) {
            return;
        }
        submitExternalGrant(new ExternalGrantCapture(str, str2, str3, str4, AnonymousClass002.A0k(), str5, str6));
    }

    public final void clearCredentialDetails(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(this._credentialDetailsState.getValue().credentialId)) {
            AnonymousClass001.A1E(this._credentialDetailsState, null, new SecureStorageCredentialDetailsUiState(null, null, false, true, null, false, true, false, false, false, false, false, false));
        }
    }

    public final void deleteCredential(String str) {
        C7384Etj.A0Y(str, 0);
        SecureStorageCredentialDetailsUiState value = this._credentialDetailsState.getValue();
        if (!str.equals(value.credentialId) || value.isDeleting || value.isDeleted || value.isUpdating) {
            return;
        }
        AnonymousClass001.A1J(new AnonymousClass1(str, null), AEu.A00(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadCredentialDetails(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            r0 = 0
            r4 = r8
            X.C7384Etj.A0Y(r8, r0)
            r3 = r7
            X.BLG<com.facebook.aura.settings.SecureStorageCredentialDetailsUiState> r0 = r7._credentialDetailsState
            java.lang.Object r2 = r0.getValue()
            com.facebook.aura.settings.SecureStorageCredentialDetailsUiState r2 = (com.facebook.aura.settings.SecureStorageCredentialDetailsUiState) r2
            java.lang.String r0 = r2.credentialId
            boolean r1 = r8.equals(r0)
            if (r1 == 0) goto L1f
            boolean r0 = r2.isLoading
            if (r0 != 0) goto L1e
            boolean r0 = r2.isLoaded
            if (r0 == 0) goto L1f
        L1e:
            return
        L1f:
            if (r1 == 0) goto L26
            boolean r0 = r2.hasError
            r5 = 1
            if (r0 != 0) goto L27
        L26:
            r5 = 0
        L27:
            com.facebook.aura.analytics.hatch.HatchAppEventLogger r0 = com.facebook.aura.analytics.hatch.HatchAppEventLogger.INSTANCE
            com.facebook.aura.analytics.hatch.HatchAppEventLoggingContext r7 = r0.captureContext()
            X.BLL r0 = X.AEu.A00(r3)
            r8 = 0
            com.facebook.aura.settings.HatchCredentialsViewModel$loadCredentialDetails$1 r2 = new com.facebook.aura.settings.HatchCredentialsViewModel$loadCredentialDetails$1
            r6 = r9
            r2.<init>(r4, r5, r6, r7, r8)
            X.AnonymousClass001.A1J(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchCredentialsViewModel.loadCredentialDetails(java.lang.String, boolean):void");
    }

    public final void requestExternalProviderGrant(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        if (AnonymousClass006.A1a(str3, this._externalGrantCapturesInFlight)) {
            return;
        }
        ExternalGrantCapture externalGrantCapture = this.retryableExternalGrantCaptures.get(str3);
        if (externalGrantCapture != null) {
            submitExternalGrant(externalGrantCapture);
            return;
        }
        while (!AnonymousClass007.A1O(str3, this._externalGrantCapturesInFlight)) {
        }
        AnonymousClass001.A1J(new C135013(str, str2, str3, null), AEu.A00(this));
    }

    public final void saveCredential(String str, String str2, String str3, boolean z, String str4, String str5, String str6, boolean z2) {
        BLG<SecureStorageCaptureUiState> blg;
        SecureStorageCaptureError secureStorageCaptureError;
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        AnonymousClass002.A1C(str3, 2, str4);
        if (this._captureState.getValue().isSaving) {
            return;
        }
        String strNormalizePageUrl = HatchCredentialsViewModelKt.normalizePageUrl(str);
        if (strNormalizePageUrl == null) {
            blg = this._captureState;
            secureStorageCaptureError = SecureStorageCaptureError.INVALID_WEBSITE;
        } else {
            if (str2.length() == 0 || str3.length() == 0) {
                return;
            }
            if (HatchCredentialsViewModelKt.isSecureStorageUsernameTooLong(str2)) {
                blg = this._captureState;
                secureStorageCaptureError = SecureStorageCaptureError.USERNAME_TOO_LONG;
            } else {
                if (!HatchCredentialsViewModelKt.isSecureStoragePasswordTooLong(str3)) {
                    List listAsList = Arrays.asList(new CredentialCaptureFieldJson("username", str2, true), new CredentialCaptureFieldJson(HatchConnectorQplLogger.AuthType.PASSWORD, str3, true));
                    AnonymousClass001.A1J(new C135021(strNormalizePageUrl, str4, listAsList, str5, str6, z, z2, null), AEu.A00(this));
                    return;
                }
                blg = this._captureState;
                secureStorageCaptureError = SecureStorageCaptureError.PASSWORD_TOO_LONG;
            }
        }
        AnonymousClass001.A1E(blg, null, new SecureStorageCaptureUiState(false, secureStorageCaptureError, null));
    }

    public final void submitVerificationCode(String str, String str2, String str3, String str4, String str5) {
        BLG<SecureStorageVerificationCodeCaptureUiState> blg;
        AnonymousClass005.A10(str, str2, str3);
        if (this._verificationCodeCaptureState.getValue().isSubmitting) {
            return;
        }
        String strA0l = AnonymousClass002.A0l(str2);
        if (strA0l.length() != 0) {
            SecureStorageVerificationCodeCaptureError secureStorageVerificationCodeCaptureErrorVerificationCodeValidationError = HatchCredentialsViewModelKt.verificationCodeValidationError(strA0l);
            if (secureStorageVerificationCodeCaptureErrorVerificationCodeValidationError != null) {
                blg = this._verificationCodeCaptureState;
            } else {
                String strNormalizePageUrl = HatchCredentialsViewModelKt.normalizePageUrl(str);
                if (strNormalizePageUrl != null) {
                    AnonymousClass001.A1J(new C135031(strNormalizePageUrl, strA0l, str3, str4, str5, null), AEu.A00(this));
                    return;
                } else {
                    blg = this._verificationCodeCaptureState;
                    secureStorageVerificationCodeCaptureErrorVerificationCodeValidationError = SecureStorageVerificationCodeCaptureError.SUBMIT_FAILED;
                }
            }
            AnonymousClass001.A1E(blg, null, new SecureStorageVerificationCodeCaptureUiState(false, secureStorageVerificationCodeCaptureErrorVerificationCodeValidationError, null));
        }
    }

    public final void updateCredential(String str, String str2, String str3, CredentialAgentPermission credentialAgentPermission) {
        AnonymousClass005.A0x(str, str2, str3);
        SecureStorageCredentialDetailsUiState value = this._credentialDetailsState.getValue();
        if (!str.equals(value.credentialId) || value.isUpdating || value.isDeleting || value.isDeleted) {
            return;
        }
        boolean z = value.canEditCredentialFields && !(str2.equals(value.username) && C7BY.A0j(str3));
        boolean zA1Z = AnonymousClass006.A1Z(credentialAgentPermission, value.agentPermission);
        if (z) {
            if (C7BY.A0j(str2) || C7BY.A0j(str3)) {
                SecureStorageLogging.INSTANCE.updateFailed(str, HatchCredentialsViewModelKt.SECURE_STORAGE_FAILURE_VALIDATION);
                ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120eb7);
                return;
            }
        } else if (!zA1Z) {
            this._credentialUpdateCompleted.AhV(str);
            return;
        }
        AnonymousClass001.A1J(new C135041(str, str2, str3, credentialAgentPermission, z, zA1Z, null), AEu.A00(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchCredentialsViewModel(AbstractC3358CGz abstractC3358CGz, HatchCredentialsRepository hatchCredentialsRepository) {
        this.repository = hatchCredentialsRepository;
        boolean z = false;
        C9286GCn c9286GCn = new C9286GCn(new SecureStorageCatalogUiState(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 127, 0 == true ? 1 : 0));
        this._catalogState = c9286GCn;
        this.catalogState = new C3Pi(null, c9286GCn);
        this.catalogLoadSingleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        C9286GCn c9286GCn2 = new C9286GCn(new SecureStorageCaptureUiState(false, null, null));
        this._captureState = c9286GCn2;
        this.captureState = new C3Pi(null, c9286GCn2);
        C9286GCn c9286GCn3 = new C9286GCn(new SecureStorageVerificationCodeCaptureUiState(false, null, null));
        this._verificationCodeCaptureState = c9286GCn3;
        this.verificationCodeCaptureState = new C3Pi(null, c9286GCn3);
        C9286GCn c9286GCn4 = new C9286GCn(new SecureStorageCredentialDetailsUiState(null, null, false, true, null, false, true, false, false, false, false, false, false));
        this._credentialDetailsState = c9286GCn4;
        this.credentialDetailsState = new C3Pi(null, c9286GCn4);
        C9286GCn c9286GCnA01 = HnJ.A01(A3q.A00);
        this._externalGrantCapturesInFlight = c9286GCnA01;
        this.externalGrantCapturesInFlight = new C3Pi(null, c9286GCnA01);
        this.retryableExternalGrantCaptures = new LinkedHashMap();
        Integer num = C79.A00;
        C9290GCr c9290GCr = new C9290GCr(num, 0, 1);
        this._externalProviderGrantRequests = c9290GCr;
        this.externalProviderGrantRequests = new C3pd(c9290GCr);
        C9290GCr c9290GCr2 = new C9290GCr(num, 0, 1);
        this._captureCompleted = c9290GCr2;
        this.captureCompleted = new C3pd(c9290GCr2);
        C9290GCr c9290GCr3 = new C9290GCr(num, 0, 1);
        this._verificationCodeCaptureCompleted = c9290GCr3;
        this.verificationCodeCaptureCompleted = new C3pd(c9290GCr3);
        C9290GCr c9290GCr4 = new C9290GCr(num, 0, 1);
        this._credentialUpdateCompleted = c9290GCr4;
        this.credentialUpdateCompleted = new C3pd(c9290GCr4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadCatalog(X.HtJ<? super kotlin.Unit> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.facebook.aura.settings.HatchCredentialsViewModel.C134981
            if (r0 == 0) goto L87
            r3 = r15
            com.facebook.aura.settings.HatchCredentialsViewModel$loadCatalog$1 r3 = (com.facebook.aura.settings.HatchCredentialsViewModel.C134981) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L87
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r1 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r12 = 1
            if (r0 == 0) goto L57
            if (r0 != r12) goto L8d
            X.Hwg.A00(r1)
        L20:
            X.BLG<com.facebook.aura.settings.SecureStorageCatalogUiState> r1 = r14._catalogState
        L22:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            com.facebook.aura.settings.SecureStorageCatalogUiState r3 = (com.facebook.aura.settings.SecureStorageCatalogUiState) r3
            boolean r0 = r3.hasError
            if (r0 == 0) goto L3e
            X.AHD<com.facebook.aura.settings.CredentialCandidate> r0 = r3.candidates
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3e
            X.AHD<com.facebook.aura.settings.CustomConnectorCandidate> r0 = r3.customConnectors
            boolean r0 = r0.isEmpty()
            r10 = 1
            if (r0 != 0) goto L3f
        L3e:
            r10 = 0
        L3f:
            X.AHD<com.facebook.aura.settings.CredentialCandidate> r4 = r3.candidates
            X.AHD<com.facebook.aura.settings.CredentialCandidate> r5 = r3.storedCandidates
            X.AHD<com.facebook.aura.settings.CredentialCandidate> r6 = r3.onePasswordLogins
            com.facebook.aura.settings.PasswordsEntryPoint r7 = r3.passwordsEntryPoint
            X.AHD<com.facebook.aura.settings.CustomConnectorCandidate> r8 = r3.customConnectors
            r9 = 0
            com.facebook.aura.settings.SecureStorageCatalogUiState r0 = r3.copy(r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = r1.A6e(r2, r0)
            if (r0 == 0) goto L22
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L57:
            X.Hwg.A00(r1)
            X.BLG<com.facebook.aura.settings.SecureStorageCatalogUiState> r5 = r14._catalogState
        L5c:
            java.lang.Object r4 = r5.getValue()
            r6 = r4
            com.facebook.aura.settings.SecureStorageCatalogUiState r6 = (com.facebook.aura.settings.SecureStorageCatalogUiState) r6
            r1 = 0
            X.AHD<com.facebook.aura.settings.CredentialCandidate> r7 = r6.candidates
            X.AHD<com.facebook.aura.settings.CredentialCandidate> r8 = r6.storedCandidates
            X.AHD<com.facebook.aura.settings.CredentialCandidate> r9 = r6.onePasswordLogins
            com.facebook.aura.settings.PasswordsEntryPoint r10 = r6.passwordsEntryPoint
            X.AHD<com.facebook.aura.settings.CustomConnectorCandidate> r11 = r6.customConnectors
            r13 = 0
            com.facebook.aura.settings.SecureStorageCatalogUiState r0 = r6.copy(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r5.A6e(r4, r0)
            if (r0 == 0) goto L5c
            com.facebook.aura.settings.HatchCredentialsViewModel$loadCatalog$3 r0 = new com.facebook.aura.settings.HatchCredentialsViewModel$loadCatalog$3
            r0.<init>(r1)
            r3.label = r12
            java.lang.Object r0 = X.Hxb.A00(r0, r3)
            if (r0 != r2) goto L20
            return r2
        L87:
            com.facebook.aura.settings.HatchCredentialsViewModel$loadCatalog$1 r3 = new com.facebook.aura.settings.HatchCredentialsViewModel$loadCatalog$1
            r3.<init>(r15)
            goto L12
        L8d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchCredentialsViewModel.loadCatalog(X.HtJ):java.lang.Object");
    }

    private final void submitExternalGrant(ExternalGrantCapture externalGrantCapture) {
        Set<String> value;
        BLG<Set<String>> blg = this._externalGrantCapturesInFlight;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, BGK.A02(externalGrantCapture.key, value)));
        AnonymousClass001.A1J(new AnonymousClass2(externalGrantCapture, null), AEu.A00(this));
    }

    public final void clearCaptureError() {
        SecureStorageCaptureUiState value;
        if (this._captureState.getValue().error == null && this._captureState.getValue().captureError == null) {
            return;
        }
        BLG<SecureStorageCaptureUiState> blg = this._captureState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, new SecureStorageCaptureUiState(value.isSaving, null, null)));
    }

    public final void clearVerificationCodeCaptureError() {
        SecureStorageVerificationCodeCaptureUiState value;
        if (this._verificationCodeCaptureState.getValue().error == null && this._verificationCodeCaptureState.getValue().captureError == null) {
            return;
        }
        BLG<SecureStorageVerificationCodeCaptureUiState> blg = this._verificationCodeCaptureState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, new SecureStorageVerificationCodeCaptureUiState(value.isSubmitting, null, null)));
    }

    public final C22I<Unit> getCaptureCompleted() {
        return this.captureCompleted;
    }

    public final C1BN<SecureStorageCaptureUiState> getCaptureState() {
        return this.captureState;
    }

    public final C1BN<SecureStorageCatalogUiState> getCatalogState() {
        return this.catalogState;
    }

    public final C1BN<SecureStorageCredentialDetailsUiState> getCredentialDetailsState() {
        return this.credentialDetailsState;
    }

    public final C22I<String> getCredentialUpdateCompleted() {
        return this.credentialUpdateCompleted;
    }

    public final C1BN<Set<String>> getExternalGrantCapturesInFlight() {
        return this.externalGrantCapturesInFlight;
    }

    public final C22I<ExternalProviderGrantRequest> getExternalProviderGrantRequests() {
        return this.externalProviderGrantRequests;
    }

    public final C22I<Unit> getVerificationCodeCaptureCompleted() {
        return this.verificationCodeCaptureCompleted;
    }

    public final C1BN<SecureStorageVerificationCodeCaptureUiState> getVerificationCodeCaptureState() {
        return this.verificationCodeCaptureState;
    }

    public final void loadCredentialsIfNeeded() {
        if (this.catalogLoaded) {
            return;
        }
        loadCredentials();
    }

    public final void resetCaptureState() {
        AnonymousClass001.A1E(this._captureState, null, new SecureStorageCaptureUiState(false, null, null));
    }

    public final void resetVerificationCodeCaptureState() {
        AnonymousClass001.A1E(this._verificationCodeCaptureState, null, new SecureStorageVerificationCodeCaptureUiState(false, null, null));
    }

    public final void loadCredentials() {
        AnonymousClass001.A1J(new C135001(null), AEu.A00(this));
    }

    public /* synthetic */ HatchCredentialsViewModel(AbstractC3358CGz abstractC3358CGz, HatchCredentialsRepository hatchCredentialsRepository, C06H c06h) {
        this(abstractC3358CGz, hatchCredentialsRepository);
    }
}
