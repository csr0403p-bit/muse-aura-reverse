package com.facebook.aura.whatsapp.viewmodel;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.login.nativeflow.NativeLoginAccountResolverKt;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import com.facebook.aura.whatsapp.repository.WhatsAppCompanionLinkResult;
import com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository;
import com.facebook.aura.whatsapp.repository.WhatsAppCompanionStatus;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class WhatsAppCompanionViewModel extends AEs {
    public static final Companion Companion = new Companion();
    public static final int MAX_POLL_ATTEMPTS = 60;
    public static final long POLL_INTERVAL_MS = 2000;
    public final BLG<WhatsAppCompanionUiState> _uiState;
    public final String connectorId;
    public final HatchConnectorCatalogRepository connectorRepository;
    public String lastPhoneNumber;
    public final HatchSkillOAuthOrigin origin;
    public final WhatsAppCompanionRepository repository;
    public final C1BN<WhatsAppCompanionUiState> uiState;

    public final class Factory extends AuraViewModelFactory<WhatsAppCompanionViewModel> {
        public final String connectorId;
        public final HatchSkillOAuthOrigin origin;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public WhatsAppCompanionViewModel create() {
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            return new WhatsAppCompanionViewModel(abstractC3358CGz, this.connectorId, this.origin, new WhatsAppCompanionRepository(abstractC3358CGz));
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
            AnonymousClass005.A0x(abstractC3358CGz, str, hatchSkillOAuthOrigin);
            this.userSession = abstractC3358CGz;
            this.connectorId = str;
            this.origin = hatchSkillOAuthOrigin;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.whatsapp.viewmodel.WhatsAppCompanionViewModel$onPhoneSubmit$2", f = "WhatsAppCompanionViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.whatsapp.viewmodel.WhatsAppCompanionViewModel$onPhoneSubmit$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $phoneNumber;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$phoneNumber = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return WhatsAppCompanionViewModel.this.new AnonymousClass2(this.$phoneNumber, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            WhatsAppCompanionUiState value;
            WhatsAppCompanionUiState whatsAppCompanionUiState;
            WhatsAppCompanionUiState value2;
            WhatsAppCompanionUiState whatsAppCompanionUiState2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                WhatsAppCompanionRepository whatsAppCompanionRepository = WhatsAppCompanionViewModel.this.repository;
                String str = this.$phoneNumber;
                this.label = 1;
                obj = whatsAppCompanionRepository.requestLinkCode(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            WhatsAppCompanionLinkResult whatsAppCompanionLinkResult = (WhatsAppCompanionLinkResult) obj;
            if (!whatsAppCompanionLinkResult.success || whatsAppCompanionLinkResult.linkCode == null) {
                BLG<WhatsAppCompanionUiState> blg = WhatsAppCompanionViewModel.this._uiState;
                do {
                    value = blg.getValue();
                    whatsAppCompanionUiState = value;
                } while (!blg.A6e(value, whatsAppCompanionUiState.copy(whatsAppCompanionUiState.phase, whatsAppCompanionUiState.linkCode, whatsAppCompanionUiState.isPolling, whatsAppCompanionUiState.isConnected, WhatsAppCompanionErrorType.LINK_CODE_FAILED)));
                WhatsAppCompanionViewModel.this.logClick(HatchComponent.SKILL_WHATSAPP_COMPANION_AUTH_FAILED);
                HatchConnectorQplLogger.INSTANCE.endAuthFail("server_error", AnonymousClass001.A0u("LINK_CODE_FAILED"), null);
            } else {
                BLG<WhatsAppCompanionUiState> blg2 = WhatsAppCompanionViewModel.this._uiState;
                do {
                    value2 = blg2.getValue();
                    whatsAppCompanionUiState2 = value2;
                } while (!blg2.A6e(value2, whatsAppCompanionUiState2.copy(whatsAppCompanionUiState2.phase, whatsAppCompanionLinkResult.linkCode, whatsAppCompanionUiState2.isPolling, whatsAppCompanionUiState2.isConnected, whatsAppCompanionUiState2.errorType)));
                WhatsAppCompanionViewModel.startPolling$default(WhatsAppCompanionViewModel.this, false, 1, null);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.whatsapp.viewmodel.WhatsAppCompanionViewModel$startPolling$1", f = "WhatsAppCompanionViewModel.kt", l = {AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 131, 142}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.whatsapp.viewmodel.WhatsAppCompanionViewModel$startPolling$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $skipInitialDelay;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public boolean Z$0;
        public int label;

        /* renamed from: com.facebook.aura.whatsapp.viewmodel.WhatsAppCompanionViewModel$startPolling$1$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WhatsAppCompanionStatus.values().length];
                try {
                    AnonymousClass002.A13(WhatsAppCompanionStatus.CONNECTED, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(WhatsAppCompanionStatus.FAILED, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(WhatsAppCompanionStatus.PENDING, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$skipInitialDelay = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return WhatsAppCompanionViewModel.this.new AnonymousClass1(this.$skipInitialDelay, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
        
            if (r8 <= 0) goto L15;
         */
        /* JADX WARN: Path cross not found for [B:15:0x0053, B:16:0x0055], limit reached: 69 */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007d -> B:24:0x008f). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 385
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.whatsapp.viewmodel.WhatsAppCompanionViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public WhatsAppCompanionViewModel(AbstractC3358CGz abstractC3358CGz, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, WhatsAppCompanionRepository whatsAppCompanionRepository) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        AnonymousClass005.A11(str, hatchSkillOAuthOrigin, whatsAppCompanionRepository, 1);
        this.connectorId = str;
        this.origin = hatchSkillOAuthOrigin;
        this.repository = whatsAppCompanionRepository;
        C9286GCn c9286GCnA14 = C3cG.A14(new WhatsAppCompanionUiState(WhatsAppCompanionFlowPhase.PHONE_INPUT, null, false, false, null));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        this.connectorRepository = HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz);
    }

    public final void onPhoneSubmit(String str) {
        WhatsAppCompanionUiState value;
        WhatsAppCompanionUiState whatsAppCompanionUiState;
        C7384Etj.A0Y(str, 0);
        this.lastPhoneNumber = str;
        logClick(HatchComponent.SKILL_WHATSAPP_COMPANION_PHONE_SUBMITTED);
        BLG<WhatsAppCompanionUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            whatsAppCompanionUiState = value;
        } while (!blg.A6e(value, whatsAppCompanionUiState.copy(WhatsAppCompanionFlowPhase.CODE_DISPLAY, whatsAppCompanionUiState.linkCode, whatsAppCompanionUiState.isPolling, whatsAppCompanionUiState.isConnected, null)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(str, null), AEu.A00(this));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WhatsAppCompanionErrorType.values().length];
            try {
                AnonymousClass002.A13(WhatsAppCompanionErrorType.POLL_EXHAUSTED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(WhatsAppCompanionErrorType.LINK_CODE_FAILED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(WhatsAppCompanionErrorType.POLL_FAILED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logClick(HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logClick(this.origin, hatchComponent, null);
    }

    public final C1BN<WhatsAppCompanionUiState> getUiState() {
        return this.uiState;
    }

    public final void onCopyCodeTapped() {
        logClick(HatchComponent.COPY_CODE_BUTTON);
    }

    public final void onCountryOptionTapped() {
        logClick(HatchComponent.COUNTRY_OPTION);
    }

    public final void onCountryPickerOpened() {
        logClick(HatchComponent.COUNTRY_PICKER);
    }

    public final void onOpenWhatsAppTapped() {
        HatchInteractionLogger.INSTANCE.logClick(this.origin, HatchComponent.OPEN_COMPANION_APP_BUTTON, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), NativeLoginAccountResolverKt.WHATSAPP_USER_ID));
    }

    public final void onRetry() {
        WhatsAppCompanionUiState value;
        WhatsAppCompanionUiState whatsAppCompanionUiState;
        logClick(HatchComponent.RETRY_BUTTON);
        WhatsAppCompanionErrorType whatsAppCompanionErrorType = this._uiState.getValue().errorType;
        if (whatsAppCompanionErrorType != null) {
            int iOrdinal = whatsAppCompanionErrorType.ordinal();
            if (iOrdinal == 2) {
                BLG<WhatsAppCompanionUiState> blg = this._uiState;
                do {
                    value = blg.getValue();
                    whatsAppCompanionUiState = value;
                } while (!blg.A6e(value, whatsAppCompanionUiState.copy(whatsAppCompanionUiState.phase, whatsAppCompanionUiState.linkCode, whatsAppCompanionUiState.isPolling, whatsAppCompanionUiState.isConnected, null)));
                startPolling(true);
                return;
            }
            if (iOrdinal != 0 && iOrdinal != 1) {
                throw C3cG.A0q();
            }
            String str = this.lastPhoneNumber;
            if (str != null) {
                onPhoneSubmit(str);
            }
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void startPolling(boolean z) {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(z, null), AEu.A00(this));
    }

    public static /* synthetic */ void startPolling$default(WhatsAppCompanionViewModel whatsAppCompanionViewModel, boolean z, int i, Object obj) {
        whatsAppCompanionViewModel.startPolling(AnonymousClass001.A1P(i, z));
    }

    public /* synthetic */ WhatsAppCompanionViewModel(AbstractC3358CGz abstractC3358CGz, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, WhatsAppCompanionRepository whatsAppCompanionRepository, int i, C06H c06h) {
        this(abstractC3358CGz, str, hatchSkillOAuthOrigin, (i & 8) != 0 ? new WhatsAppCompanionRepository(abstractC3358CGz) : whatsAppCompanionRepository);
    }
}
