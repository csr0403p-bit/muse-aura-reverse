package com.facebook.aura.skills.connect;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9286GCn;
import X.C9290GCr;
import X.C9uG;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.InterfaceC08439ui;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.perf.HatchConnectorAuthTraceId;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.skills.connect.CustomConnectorAuthEffect;
import com.facebook.aura.skills.connect.CustomConnectorConfigResolution;
import com.facebook.aura.skills.connect.CustomConnectorResolvedConfig;
import com.facebook.aura.skills.connect.config.CustomConnectorApiKeyConfig;
import com.facebook.aura.skills.connect.config.CustomConnectorApiKeyValidationError;
import com.facebook.aura.skills.connect.config.CustomConnectorApiKeyValidator;
import com.facebook.aura.skills.connect.config.CustomConnectorLink;
import com.facebook.aura.skills.connect.config.CustomConnectorLinkParser;
import com.facebook.aura.skills.connect.config.CustomConnectorMode;
import com.facebook.aura.skills.connect.config.CustomConnectorOAuthConfig;
import com.facebook.aura.skills.connect.config.CustomConnectorOAuthValidationError;
import com.facebook.aura.skills.connect.config.CustomConnectorOAuthValidator;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepository;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterResponse;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import java.net.URI;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class CustomConnectorAuthViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String ERROR_MISSING_AUTHORIZE_URL = "missing_authorize_url";

    @Deprecated
    public static final String ERROR_MISSING_RESPONSE = "missing_response";

    @Deprecated
    public static final String ERROR_UNSAFE_AUTHORIZE_URL = "unsafe_authorize_url";
    public final C3Em<CustomConnectorAuthEffect> _effects;
    public final BLG<CustomConnectorAuthUiState> _uiState;
    public final HatchConnectorCatalogRepository connectorRepository;
    public final C22I<CustomConnectorAuthEffect> effects;
    public volatile boolean handedOffToBrowser;
    public final CustomConnectorMode linkMode;
    public final HatchSkillOAuthOrigin origin;
    public CustomConnectorResolvedConfig parsedConfig;
    public final CustomConnectorRegisterRepository repository;
    public final String sourceSessionId;
    public final HatchConnectorAuthTraceId traceId;
    public final C1BN<CustomConnectorAuthUiState> uiState;
    public final String url;

    public final class Factory implements InterfaceC08439ui {
        public static final int $stable = 8;
        public final HatchSkillOAuthOrigin origin;
        public final String sourceSessionId;
        public final String url;
        public final AbstractC3358CGz userSession;

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            String str = this.url;
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            return new CustomConnectorAuthViewModel(str, abstractC3358CGz, this.origin, this.sourceSessionId, new CustomConnectorRegisterRepository(abstractC3358CGz));
        }

        public Factory(String str, AbstractC3358CGz abstractC3358CGz, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2) {
            AnonymousClass005.A0x(str, abstractC3358CGz, hatchSkillOAuthOrigin);
            this.url = str;
            this.userSession = abstractC3358CGz;
            this.origin = hatchSkillOAuthOrigin;
            this.sourceSessionId = str2;
        }

        public /* synthetic */ Factory(String str, AbstractC3358CGz abstractC3358CGz, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, int i, C06H c06h) {
            this(str, abstractC3358CGz, hatchSkillOAuthOrigin, AnonymousClass006.A0u(i, str2));
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
            return (T) AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
            return (T) InterfaceC08439ui.A00(this, cls);
        }
    }

    public interface SubmitResult {

        public final class OpenOAuth extends C06G implements SubmitResult {
            public static final int $stable = 0;
            public final String authorizeUrl;

            public OpenOAuth(String str) {
                C7384Etj.A0Y(str, 0);
                this.authorizeUrl = str;
            }

            public final OpenOAuth copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new OpenOAuth(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof OpenOAuth) && C7384Etj.areEqual(this.authorizeUrl, ((OpenOAuth) obj).authorizeUrl));
            }

            public static /* synthetic */ OpenOAuth copy$default(OpenOAuth openOAuth, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openOAuth.authorizeUrl;
                }
                C7384Etj.A0Y(str, 0);
                return new OpenOAuth(str);
            }

            public final String component1() {
                return this.authorizeUrl;
            }

            public final String getAuthorizeUrl() {
                return this.authorizeUrl;
            }

            public int hashCode() {
                return this.authorizeUrl.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Retryable implements SubmitResult {
            public static final int $stable = 0;
            public static final Retryable INSTANCE = new Retryable();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Retryable);
            }

            public String toString() {
                return "Retryable";
            }

            public int hashCode() {
                return -1919883177;
            }
        }

        public final class Success extends C06G implements SubmitResult {
            public static final int $stable = 0;
            public final String connectorName;

            public Success(String str) {
                C7384Etj.A0Y(str, 0);
                this.connectorName = str;
            }

            public final Success copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Success(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.connectorName, ((Success) obj).connectorName));
            }

            public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.connectorName;
                }
                C7384Etj.A0Y(str, 0);
                return new Success(str);
            }

            public final String component1() {
                return this.connectorName;
            }

            public final String getConnectorName() {
                return this.connectorName;
            }

            public int hashCode() {
                return this.connectorName.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.connect.CustomConnectorAuthViewModel$submit$3", f = "CustomConnectorAuthViewModel.kt", l = {303, 304, 307, 311}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.CustomConnectorAuthViewModel$submit$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<HtJ<? super SubmitResult>, Object> $block;
        public Object L$0;
        public int label;
        public final /* synthetic */ CustomConnectorAuthViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(G0U<? super HtJ<? super SubmitResult>, ? extends Object> g0u, CustomConnectorAuthViewModel customConnectorAuthViewModel, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$block = g0u;
            this.this$0 = customConnectorAuthViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$block, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3Em<CustomConnectorAuthEffect> c3Em;
            CustomConnectorAuthEffect openAuthorizeUrl;
            Object objEmit;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                G0U<HtJ<? super SubmitResult>, Object> g0u = this.$block;
                this.label = 1;
                obj = g0u.invoke(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3 && i != 4) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            SubmitResult submitResult = (SubmitResult) obj;
            if (C7384Etj.areEqual(submitResult, SubmitResult.Retryable.INSTANCE)) {
                CustomConnectorAuthViewModel customConnectorAuthViewModel = this.this$0;
                this.L$0 = null;
                this.label = 2;
                objEmit = customConnectorAuthViewModel.showRetryableError(this);
            } else {
                if (submitResult instanceof SubmitResult.Success) {
                    this.this$0.connectorRepository.onResumeAfterAuth(CustomConnectorAuthViewModelKt.toCustomConnectorId(((SubmitResult.Success) submitResult).connectorName));
                    c3Em = this.this$0._effects;
                    openAuthorizeUrl = CustomConnectorAuthEffect.DismissSuccess.INSTANCE;
                    this.L$0 = null;
                    this.label = 3;
                } else {
                    if (!(submitResult instanceof SubmitResult.OpenOAuth)) {
                        throw C3cG.A0q();
                    }
                    this.this$0.handedOffToBrowser = true;
                    c3Em = this.this$0._effects;
                    openAuthorizeUrl = new CustomConnectorAuthEffect.OpenAuthorizeUrl(((SubmitResult.OpenOAuth) submitResult).authorizeUrl);
                    this.L$0 = null;
                    this.label = 4;
                }
                objEmit = c3Em.emit(openAuthorizeUrl, this);
            }
            if (objEmit == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.connect.CustomConnectorAuthViewModel$submitApiKey$2", f = "CustomConnectorAuthViewModel.kt", l = {227}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.CustomConnectorAuthViewModel$submitApiKey$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super SubmitResult>, Object> {
        public final /* synthetic */ String $apiKey;
        public final /* synthetic */ CustomConnectorApiKeyConfig $config;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CustomConnectorApiKeyConfig customConnectorApiKeyConfig, String str, HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
            this.$config = customConnectorApiKeyConfig;
            this.$apiKey = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return CustomConnectorAuthViewModel.this.new AnonymousClass2(this.$config, this.$apiKey, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            CustomConnectorAuthViewModel customConnectorAuthViewModel;
            Object objM2104registerApiKeyBWLJW6A;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                customConnectorAuthViewModel = CustomConnectorAuthViewModel.this;
                CustomConnectorRegisterRepository customConnectorRegisterRepository = customConnectorAuthViewModel.repository;
                CustomConnectorApiKeyConfig customConnectorApiKeyConfig = this.$config;
                String str = this.$apiKey;
                String str2 = customConnectorAuthViewModel.sourceSessionId;
                this.L$0 = customConnectorAuthViewModel;
                this.label = 1;
                objM2104registerApiKeyBWLJW6A = customConnectorRegisterRepository.m2104registerApiKeyBWLJW6A(customConnectorApiKeyConfig, str, str2, this);
                if (objM2104registerApiKeyBWLJW6A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                customConnectorAuthViewModel = (CustomConnectorAuthViewModel) this.L$0;
                objM2104registerApiKeyBWLJW6A = AnonymousClass001.A0q(obj);
            }
            CustomConnectorRegisterResponse customConnectorRegisterResponseRegisteredOrNull = customConnectorAuthViewModel.registeredOrNull(objM2104registerApiKeyBWLJW6A);
            if (customConnectorRegisterResponseRegisteredOrNull == null) {
                return SubmitResult.Retryable.INSTANCE;
            }
            HatchConnectorAuthTraceId hatchConnectorAuthTraceId = CustomConnectorAuthViewModel.this.traceId;
            if (hatchConnectorAuthTraceId != null) {
                HatchConnectorQplLogger hatchConnectorQplLogger = HatchConnectorQplLogger.INSTANCE;
                hatchConnectorQplLogger.markAuthCallbackReceived(hatchConnectorAuthTraceId);
                hatchConnectorQplLogger.endAuthSuccess(hatchConnectorAuthTraceId, false);
            }
            String str3 = customConnectorRegisterResponseRegisteredOrNull.name;
            CustomConnectorApiKeyConfig customConnectorApiKeyConfig2 = this.$config;
            if (C7BY.A0j(str3)) {
                str3 = customConnectorApiKeyConfig2.connector.name;
            }
            return new SubmitResult.Success(str3);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super SubmitResult> htJ) {
            return ((AnonymousClass2) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.connect.CustomConnectorAuthViewModel$submitOAuth$2", f = "CustomConnectorAuthViewModel.kt", l = {253}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.CustomConnectorAuthViewModel$submitOAuth$2, reason: invalid class name and case insensitive filesystem */
    public final class C137882 extends AbstractC07127nr implements G0U<HtJ<? super SubmitResult>, Object> {
        public final /* synthetic */ String $clientId;
        public final /* synthetic */ String $clientSecret;
        public final /* synthetic */ CustomConnectorOAuthConfig $config;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137882(CustomConnectorOAuthConfig customConnectorOAuthConfig, String str, String str2, HtJ<? super C137882> htJ) {
            super(1, htJ);
            this.$config = customConnectorOAuthConfig;
            this.$clientId = str;
            this.$clientSecret = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return CustomConnectorAuthViewModel.this.new C137882(this.$config, this.$clientId, this.$clientSecret, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            CustomConnectorAuthViewModel customConnectorAuthViewModel;
            Object objM2105registerOAuthyxL6bBk;
            HatchConnectorAuthTraceId hatchConnectorAuthTraceId;
            HatchConnectorQplLogger hatchConnectorQplLogger;
            String str;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                customConnectorAuthViewModel = CustomConnectorAuthViewModel.this;
                CustomConnectorRegisterRepository customConnectorRegisterRepository = customConnectorAuthViewModel.repository;
                CustomConnectorOAuthConfig customConnectorOAuthConfig = this.$config;
                String str2 = this.$clientId;
                String str3 = this.$clientSecret;
                String str4 = customConnectorAuthViewModel.sourceSessionId;
                this.L$0 = customConnectorAuthViewModel;
                this.label = 1;
                objM2105registerOAuthyxL6bBk = customConnectorRegisterRepository.m2105registerOAuthyxL6bBk(customConnectorOAuthConfig, str2, str3, str4, this);
                if (objM2105registerOAuthyxL6bBk == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                customConnectorAuthViewModel = (CustomConnectorAuthViewModel) this.L$0;
                objM2105registerOAuthyxL6bBk = AnonymousClass001.A0q(obj);
            }
            CustomConnectorRegisterResponse customConnectorRegisterResponseRegisteredOrNull = customConnectorAuthViewModel.registeredOrNull(objM2105registerOAuthyxL6bBk);
            if (customConnectorRegisterResponseRegisteredOrNull != null) {
                String str5 = customConnectorRegisterResponseRegisteredOrNull.authorizeUrl;
                if (str5 == null || C7BY.A0j(str5)) {
                    hatchConnectorAuthTraceId = CustomConnectorAuthViewModel.this.traceId;
                    if (hatchConnectorAuthTraceId != null) {
                        hatchConnectorQplLogger = HatchConnectorQplLogger.INSTANCE;
                        str = CustomConnectorAuthViewModel.ERROR_MISSING_AUTHORIZE_URL;
                        hatchConnectorQplLogger.markRegisterFailed(hatchConnectorAuthTraceId, str);
                    }
                } else {
                    boolean zIsSafeAuthorizeUrl = CustomConnectorOAuthValidator.INSTANCE.isSafeAuthorizeUrl(str5, this.$config.credential.oauth.issuerDomain);
                    CustomConnectorAuthViewModel customConnectorAuthViewModel2 = CustomConnectorAuthViewModel.this;
                    hatchConnectorAuthTraceId = customConnectorAuthViewModel2.traceId;
                    if (zIsSafeAuthorizeUrl) {
                        if (hatchConnectorAuthTraceId != null) {
                            HatchConnectorQplLogger.INSTANCE.markDirectOAuthRedirectStarted(hatchConnectorAuthTraceId, customConnectorAuthViewModel2.authDomain(str5));
                        }
                        return new SubmitResult.OpenOAuth(str5);
                    }
                    if (hatchConnectorAuthTraceId != null) {
                        hatchConnectorQplLogger = HatchConnectorQplLogger.INSTANCE;
                        str = CustomConnectorAuthViewModel.ERROR_UNSAFE_AUTHORIZE_URL;
                        hatchConnectorQplLogger.markRegisterFailed(hatchConnectorAuthTraceId, str);
                    }
                }
            }
            return SubmitResult.Retryable.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super SubmitResult> htJ) {
            return ((C137882) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void submitOAuth(CustomConnectorOAuthConfig customConnectorOAuthConfig, String str, String str2) {
        CustomConnectorOAuthValidationError customConnectorOAuthValidationErrorValidateClient = CustomConnectorOAuthValidator.INSTANCE.validateClient(str, str2, customConnectorOAuthConfig.credential.oauth.getResolvedAuthMethod());
        if (customConnectorOAuthValidationErrorValidateClient == null) {
            submit(new C137882(customConnectorOAuthConfig, str, str2, null));
            return;
        }
        HatchConnectorAuthTraceId hatchConnectorAuthTraceId = this.traceId;
        if (hatchConnectorAuthTraceId != null) {
            HatchConnectorQplLogger.INSTANCE.markCredentialValidationFailed(hatchConnectorAuthTraceId, AnonymousClass006.A0x(customConnectorOAuthValidationErrorValidateClient));
        }
    }

    public final void onApiKeyChanged(String str) {
        CustomConnectorAuthUiState value;
        C7384Etj.A0Y(str, 0);
        BLG<CustomConnectorAuthUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, withDerivedState(CustomConnectorAuthUiState.copy$default(value, null, null, null, null, str, null, null, false, false, false, false, false, 3055, null))));
    }

    public final void onClientIdChanged(String str) {
        CustomConnectorAuthUiState value;
        C7384Etj.A0Y(str, 0);
        BLG<CustomConnectorAuthUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, withDerivedState(CustomConnectorAuthUiState.copy$default(value, null, null, null, null, null, str, null, false, false, false, false, false, 3039, null))));
    }

    public final void onClientSecretChanged(String str) {
        CustomConnectorAuthUiState value;
        C7384Etj.A0Y(str, 0);
        BLG<CustomConnectorAuthUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, withDerivedState(CustomConnectorAuthUiState.copy$default(value, null, null, null, null, null, null, str, false, false, false, false, false, 3007, null))));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomConnectorMode.values().length];
            try {
                AnonymousClass002.A13(CustomConnectorMode.API_KEY, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(CustomConnectorMode.OAUTH, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String authDomain(String str) {
        Object objA0s;
        try {
            objA0s = new URI(str).getHost();
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        return (String) objA0s;
    }

    private final String authFlowType() {
        int iOrdinal;
        CustomConnectorMode customConnectorMode = this.linkMode;
        if (customConnectorMode == null || (iOrdinal = customConnectorMode.ordinal()) == -1) {
            return null;
        }
        if (iOrdinal == 0) {
            return HatchConnectorQplLogger.AuthType.API_KEY;
        }
        if (iOrdinal == 1) {
            return "oauth";
        }
        throw C3cG.A0q();
    }

    private final void dismissCancel() {
        HatchConnectorAuthTraceId hatchConnectorAuthTraceId;
        if (!this._uiState.getValue().isInvalidLink && (hatchConnectorAuthTraceId = this.traceId) != null) {
            HatchConnectorQplLogger.INSTANCE.endAuthCancel(hatchConnectorAuthTraceId, HatchConnectorQplLogger.CancelPoint.AUTH_DISMISSED);
        }
        this._effects.AhV(CustomConnectorAuthEffect.DismissCancel.INSTANCE);
    }

    private final void failInvalidLink(String str, String str2) {
        AnonymousClass001.A1E(this._uiState, null, new CustomConnectorAuthUiState(null, "", "", "", "", "", "", false, false, true, false, false));
        HatchConnectorAuthTraceId hatchConnectorAuthTraceId = this.traceId;
        if (hatchConnectorAuthTraceId != null) {
            HatchConnectorQplLogger.INSTANCE.endAuthFail(hatchConnectorAuthTraceId, HatchConnectorQplLogger.AuthFailureReason.CONFIG_INVALID, str, str2);
        }
    }

    private final void parseAndValidate() {
        CustomConnectorConfigResolution customConnectorConfigResolutionResolveCustomConnectorConfig = CustomConnectorConfigResolverKt.resolveCustomConnectorConfig(this.url);
        if (customConnectorConfigResolutionResolveCustomConnectorConfig instanceof CustomConnectorConfigResolution.Failure) {
            CustomConnectorConfigResolution.Failure failure = (CustomConnectorConfigResolution.Failure) customConnectorConfigResolutionResolveCustomConnectorConfig;
            failInvalidLink(failure.errorType, failure.detail);
        } else {
            if (!(customConnectorConfigResolutionResolveCustomConnectorConfig instanceof CustomConnectorConfigResolution.Success)) {
                throw C3cG.A0q();
            }
            CustomConnectorResolvedConfig customConnectorResolvedConfig = ((CustomConnectorConfigResolution.Success) customConnectorConfigResolutionResolveCustomConnectorConfig).config;
            this.parsedConfig = customConnectorResolvedConfig;
            showValidatedState(customConnectorResolvedConfig);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomConnectorRegisterResponse registeredOrNull(Object obj) {
        String strCustomConnectorRegisterErrorType;
        Object obj2 = obj;
        if (obj instanceof C10571Hud) {
            obj2 = null;
        }
        CustomConnectorRegisterResponse customConnectorRegisterResponse = (CustomConnectorRegisterResponse) obj2;
        if (customConnectorRegisterResponse != null) {
            HatchConnectorAuthTraceId hatchConnectorAuthTraceId = this.traceId;
            if (hatchConnectorAuthTraceId != null) {
                HatchConnectorQplLogger.INSTANCE.markRegistered(hatchConnectorAuthTraceId, customConnectorRegisterResponse.replaced);
            }
            return customConnectorRegisterResponse;
        }
        Throwable thA00 = HsJ.A00(obj);
        if (thA00 == null || (strCustomConnectorRegisterErrorType = CustomConnectorRegisterRepositoryKt.customConnectorRegisterErrorType(thA00)) == null) {
            strCustomConnectorRegisterErrorType = ERROR_MISSING_RESPONSE;
        }
        HatchConnectorAuthTraceId hatchConnectorAuthTraceId2 = this.traceId;
        if (hatchConnectorAuthTraceId2 != null) {
            HatchConnectorQplLogger.INSTANCE.markRegisterFailed(hatchConnectorAuthTraceId2, strCustomConnectorRegisterErrorType);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showRetryableError(HtJ<? super Unit> htJ) {
        CustomConnectorAuthUiState value;
        BLG<CustomConnectorAuthUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, withDerivedState(CustomConnectorAuthUiState.copy$default(value, null, null, null, null, null, null, null, false, false, false, true, false, 2815, null))));
        return C3cG.A0U(this._effects.emit(CustomConnectorAuthEffect.ShowRetryableError.INSTANCE, htJ));
    }

    private final void showValidatedState(CustomConnectorResolvedConfig customConnectorResolvedConfig) {
        HatchConnectorAuthTraceId hatchConnectorAuthTraceId = this.traceId;
        if (hatchConnectorAuthTraceId != null) {
            HatchConnectorQplLogger.INSTANCE.markAuthMethodStarted(hatchConnectorAuthTraceId, (String) null);
        }
        BLG<CustomConnectorAuthUiState> blg = this._uiState;
        CustomConnectorMode mode = customConnectorResolvedConfig.getMode();
        String connectorName = customConnectorResolvedConfig.getConnectorName();
        String connectorDisplayName = customConnectorResolvedConfig.getConnectorDisplayName();
        String str = (String) AbstractC0878AGe.A0G(customConnectorResolvedConfig.getHosts());
        if (str == null) {
            str = "";
        }
        blg.Af8(withDerivedState(new CustomConnectorAuthUiState(mode, connectorName, connectorDisplayName, str, "", "", "", customConnectorResolvedConfig.getRequiresClientSecret(), false, false, false, false)));
    }

    private final HatchConnectorAuthTraceId startTrace() {
        HatchConnectorQplLogger hatchConnectorQplLogger = HatchConnectorQplLogger.INSTANCE;
        String strAuthFlowType = authFlowType();
        if (strAuthFlowType == null) {
            return null;
        }
        return hatchConnectorQplLogger.startAuth(strAuthFlowType, "chat", "", true);
    }

    private final void submit(G0U<? super HtJ<? super SubmitResult>, ? extends Object> g0u) {
        CustomConnectorAuthUiState value;
        BLG<CustomConnectorAuthUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, withDerivedState(CustomConnectorAuthUiState.copy$default(value, null, null, null, null, null, null, null, false, true, false, false, false, 2815, null))));
        HatchConnectorAuthTraceId hatchConnectorAuthTraceId = this.traceId;
        if (hatchConnectorAuthTraceId != null) {
            HatchConnectorQplLogger.INSTANCE.markCredentialSubmitted(hatchConnectorAuthTraceId);
        }
        AnonymousClass001.A1J(new AnonymousClass3(g0u, this, null), AEu.A00(this));
    }

    private final void submitApiKey(CustomConnectorApiKeyConfig customConnectorApiKeyConfig, String str) {
        CustomConnectorApiKeyValidationError customConnectorApiKeyValidationErrorValidateKey = CustomConnectorApiKeyValidator.INSTANCE.validateKey(str);
        if (customConnectorApiKeyValidationErrorValidateKey == null) {
            submit(new AnonymousClass2(customConnectorApiKeyConfig, str, null));
            return;
        }
        HatchConnectorAuthTraceId hatchConnectorAuthTraceId = this.traceId;
        if (hatchConnectorAuthTraceId != null) {
            HatchConnectorQplLogger.INSTANCE.markCredentialValidationFailed(hatchConnectorAuthTraceId, AnonymousClass006.A0x(customConnectorApiKeyValidationErrorValidateKey));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.skills.connect.CustomConnectorAuthUiState withDerivedState(com.facebook.aura.skills.connect.CustomConnectorAuthUiState r16) {
        /*
            r15 = this;
            r2 = r16
            boolean r0 = r2.isInvalidLink
            if (r0 != 0) goto L4f
            boolean r0 = r2.isSubmitting
            if (r0 != 0) goto L4f
            com.facebook.aura.skills.connect.config.CustomConnectorMode r1 = r2.mode
            r0 = -1
            if (r1 == 0) goto L4f
            int r1 = r1.ordinal()
            if (r1 == r0) goto L4f
            r0 = 0
            if (r1 == r0) goto L4c
            r0 = 1
            if (r1 != r0) goto L51
            java.lang.String r0 = r2.clientId
            java.lang.String r0 = X.AnonymousClass002.A0l(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L4f
            boolean r0 = r2.requiresClientSecret
            if (r0 == 0) goto L37
            java.lang.String r0 = r2.clientSecret
        L2d:
            java.lang.String r0 = X.AnonymousClass002.A0l(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L4f
        L37:
            r14 = 1
        L38:
            r15 = 2047(0x7ff, float:2.868E-42)
            r3 = 0
            r10 = 0
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r11 = r10
            r12 = r10
            r13 = r10
            r16 = r3
            com.facebook.aura.skills.connect.CustomConnectorAuthUiState r0 = com.facebook.aura.skills.connect.CustomConnectorAuthUiState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L4c:
            java.lang.String r0 = r2.apiKey
            goto L2d
        L4f:
            r14 = 0
            goto L38
        L51:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.CustomConnectorAuthViewModel.withDerivedState(com.facebook.aura.skills.connect.CustomConnectorAuthUiState):com.facebook.aura.skills.connect.CustomConnectorAuthUiState");
    }

    public final C22I<CustomConnectorAuthEffect> getEffects() {
        return this.effects;
    }

    public final C1BN<CustomConnectorAuthUiState> getUiState() {
        return this.uiState;
    }

    public final void onAddClick() {
        CustomConnectorResolvedConfig customConnectorResolvedConfig = this.parsedConfig;
        if (customConnectorResolvedConfig != null) {
            CustomConnectorAuthUiState value = this._uiState.getValue();
            if (!value.addEnabled || value.isSubmitting) {
                return;
            }
            HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
            HatchSkillOAuthOrigin hatchSkillOAuthOrigin = this.origin;
            HatchComponent hatchComponent = HatchComponent.SKILL_API_KEY_SUBMITTED;
            String strAuthFlowType = authFlowType();
            hatchInteractionLogger.logClick(hatchSkillOAuthOrigin, hatchComponent, strAuthFlowType != null ? AnonymousClass007.A0c(HatchMetadataKey.AUTH_FLOW_TYPE, strAuthFlowType) : null);
            if (customConnectorResolvedConfig instanceof CustomConnectorResolvedConfig.ApiKey) {
                submitApiKey(((CustomConnectorResolvedConfig.ApiKey) customConnectorResolvedConfig).config, value.apiKey);
            } else {
                if (!(customConnectorResolvedConfig instanceof CustomConnectorResolvedConfig.OAuth)) {
                    throw C3cG.A0q();
                }
                submitOAuth(((CustomConnectorResolvedConfig.OAuth) customConnectorResolvedConfig).config, value.clientId, value.clientSecret);
            }
        }
    }

    public final void onCancelClick() {
        HatchInteractionLogger.INSTANCE.logClick(this.origin, HatchComponent.CANCEL_BUTTON, null);
        dismissCancel();
    }

    @Override // X.AEs
    public void onCleared() {
        HatchConnectorAuthTraceId hatchConnectorAuthTraceId;
        if (this.handedOffToBrowser || (hatchConnectorAuthTraceId = this.traceId) == null) {
            return;
        }
        HatchConnectorQplLogger.INSTANCE.endAuthCancel(hatchConnectorAuthTraceId, HatchConnectorQplLogger.CancelPoint.ABANDONED);
    }

    public final void onCloseClick() {
        HatchInteractionLogger.INSTANCE.logClick(this.origin, HatchComponent.CLOSE_BUTTON, null);
        dismissCancel();
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ CustomConnectorAuthViewModel(String str, AbstractC3358CGz abstractC3358CGz, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, CustomConnectorRegisterRepository customConnectorRegisterRepository, int i, C06H c06h) {
        this(str, abstractC3358CGz, hatchSkillOAuthOrigin, AnonymousClass006.A0u(i, str2), (i & 16) != 0 ? new CustomConnectorRegisterRepository(abstractC3358CGz) : customConnectorRegisterRepository);
    }

    public CustomConnectorAuthViewModel(String str, AbstractC3358CGz abstractC3358CGz, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, CustomConnectorRegisterRepository customConnectorRegisterRepository) {
        CustomConnectorMode customConnectorMode;
        boolean zA1Z = AnonymousClass005.A1Z(str, abstractC3358CGz, hatchSkillOAuthOrigin);
        C7384Etj.A0Y(customConnectorRegisterRepository, 4);
        this.url = str;
        this.origin = hatchSkillOAuthOrigin;
        this.sourceSessionId = str2;
        this.repository = customConnectorRegisterRepository;
        this.connectorRepository = HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz);
        CustomConnectorLink customConnectorLinkTryParse = CustomConnectorLinkParser.INSTANCE.tryParse(str);
        if (customConnectorLinkTryParse != null) {
            customConnectorMode = customConnectorLinkTryParse.mode;
        } else {
            customConnectorMode = null;
        }
        this.linkMode = customConnectorMode;
        C9286GCn c9286GCnA14 = C3cG.A14(new CustomConnectorAuthUiState(null, "", "", "", "", "", "", false, false, false, false, false));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        C9290GCr c9290GCr = new C9290GCr(C79.A01, 0, zA1Z ? 1 : 0);
        this._effects = c9290GCr;
        this.effects = new C3pd(c9290GCr);
        this.traceId = startTrace();
        parseAndValidate();
    }
}
