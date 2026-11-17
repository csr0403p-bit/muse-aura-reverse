package com.facebook.aura.activation.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.repo.AuraActivationRepository;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.user.repo.AuraUserRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AuraInviteCodeViewModel extends AEs {
    public static final Companion Companion = new Companion();
    public static final String RESULT_NETWORK_ERROR = "network_error";
    public static final String RESULT_SERVER_ERROR = "server_error";
    public static final String RESULT_STATUS_REFRESH_FAILED = "status_refresh_failed";
    public static final String RESULT_SUCCESS = "success";
    public static final String TAG = "AuraInviteCodeViewModel";
    public final BLG<UiState> _uiState;
    public final C3Em<ViewEffect> _viewEffect;
    public final AuraActivationRepository activationRepository;
    public boolean isOnInviteStep;
    public final C1BN<UiState> uiState;
    public final AuraUserRepository userRepository;
    public final C22I<ViewEffect> viewEffect;

    public final class Factory extends AuraViewModelFactory<AuraInviteCodeViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AuraInviteCodeViewModel create() {
            return new AuraInviteCodeViewModel(AuraActivationRepository.Companion.getInstance(this.userSession), AuraUserRepository.Companion.getInstance(this.userSession));
        }
    }

    public final class UiState extends C06G {
        public final InviteCodeError error;
        public final String inviteCode;
        public final boolean isLoading;

        public UiState(String str, boolean z, InviteCodeError inviteCodeError) {
            C7384Etj.A0Y(str, 0);
            this.inviteCode = str;
            this.isLoading = z;
            this.error = inviteCodeError;
        }

        public final UiState copy(String str, boolean z, InviteCodeError inviteCodeError) {
            C7384Etj.A0Y(str, 0);
            return new UiState(str, z, inviteCodeError);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (!C7384Etj.areEqual(this.inviteCode, uiState.inviteCode) || this.isLoading != uiState.isLoading || !C7384Etj.areEqual(this.error, uiState.error)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, String str, boolean z, InviteCodeError inviteCodeError, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiState.inviteCode;
            }
            if ((i & 2) != 0) {
                z = uiState.isLoading;
            }
            if ((i & 4) != 0) {
                inviteCodeError = uiState.error;
            }
            return uiState.copy(str, z, inviteCodeError);
        }

        public final String component1() {
            return this.inviteCode;
        }

        public final boolean component2() {
            return this.isLoading;
        }

        public final InviteCodeError component3() {
            return this.error;
        }

        public final InviteCodeError getError() {
            return this.error;
        }

        public final String getInviteCode() {
            return this.inviteCode;
        }

        public int hashCode() {
            return C0KA.A01(AnonymousClass001.A0G(this.inviteCode), this.isLoading) + AnonymousClass006.A0D(this.error);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(String str, boolean z, InviteCodeError inviteCodeError, int i, C06H c06h) {
            this(C3cH.A0Z(i, str), AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? null : inviteCodeError);
        }

        public UiState() {
            this("", false, null);
        }
    }

    public interface ViewEffect {

        public final class InviteCodeRedeemed implements ViewEffect {
            public static final InviteCodeRedeemed INSTANCE = new InviteCodeRedeemed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof InviteCodeRedeemed);
            }

            public String toString() {
                return "InviteCodeRedeemed";
            }

            public int hashCode() {
                return -1147996967;
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
                return 1323581152;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraInviteCodeViewModel$onBackClick$1", f = "AuraInviteCodeViewModel.kt", l = {VoiceCallForegroundService.AVATAR_TARGET_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraInviteCodeViewModel$onBackClick$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraInviteCodeViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C3Em<ViewEffect> c3Em = AuraInviteCodeViewModel.this._viewEffect;
                ViewEffect.NavigateBack navigateBack = ViewEffect.NavigateBack.INSTANCE;
                this.label = 1;
                if (c3Em.emit(navigateBack, this) == enumC10460Hji) {
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
            return AuraInviteCodeViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraInviteCodeViewModel$onContinueClick$2", f = "AuraInviteCodeViewModel.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY, 97, 113}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraInviteCodeViewModel$onContinueClick$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $code;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$code = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraInviteCodeViewModel.this.new AnonymousClass2(this.$code, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraInviteCodeViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void onInviteCodeChange(String str) {
        UiState value;
        C7384Etj.A0Y(str, 0);
        String strNormalizeInviteCodeInput = InviteCodeKt.normalizeInviteCodeInput(str);
        if (strNormalizeInviteCodeInput != null) {
            BLG<UiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, new UiState(strNormalizeInviteCodeInput, value.isLoading, null)));
        }
    }

    public final void onInviteStepChanged(boolean z, String str) {
        C7384Etj.A0Y(str, 1);
        if (z && !this.isOnInviteStep) {
            resetState(str);
        }
        this.isOnInviteStep = z;
    }

    public final void resetState(String str) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass001.A1E(this._uiState, null, new UiState("", false, null));
        if (str.length() > 0) {
            onInviteCodeChange(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logRedemptionResult(String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, null, HatchScreen.ONBOARDING_INVITE_CODE, HatchComponent.CONTINUE_BUTTON, null, AnonymousClass007.A0c(HatchMetadataKey.RESULT, str), null);
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final C22I<ViewEffect> getViewEffect() {
        return this.viewEffect;
    }

    public final void onContinueClick() {
        UiState value;
        UiState uiState;
        UiState value2 = this._uiState.getValue();
        String str = value2.inviteCode;
        if (value2.isLoading || str.length() < 6) {
            return;
        }
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, uiState.copy(uiState.inviteCode, true, null)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(str, null), AEu.A00(this));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraInviteCodeViewModel(AuraActivationRepository auraActivationRepository, AuraUserRepository auraUserRepository) {
        boolean zA1b = AnonymousClass004.A1b(auraActivationRepository, auraUserRepository);
        this.activationRepository = auraActivationRepository;
        this.userRepository = auraUserRepository;
        C9286GCn c9286GCnA14 = C3cG.A14(new UiState("", zA1b, null));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        C9290GCr c9290GCr = new C9290GCr(C79.A00, zA1b ? 1 : 0, zA1b ? 1 : 0);
        this._viewEffect = c9290GCr;
        this.viewEffect = C3pd.A00(c9290GCr);
    }

    public final void onBackClick() {
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }
}
