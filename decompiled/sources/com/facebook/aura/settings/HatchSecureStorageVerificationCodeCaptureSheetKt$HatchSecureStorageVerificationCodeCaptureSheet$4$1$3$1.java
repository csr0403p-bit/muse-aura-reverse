package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AuJ;
import X.B1U;
import X.B1V;
import X.BFM;
import X.BHJ;
import X.BRg;
import X.C06G;
import X.C07C;
import X.C1518AkS;
import X.C1BO;
import X.C1DM;
import X.C2257BGr;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.input.AuraTextInputDefaults;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.theme.AuraColorsTextInput;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$4$1$3$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ boolean $canSubmit;
    public final /* synthetic */ String $captureAuthorization;
    public final /* synthetic */ MutableState<String> $code$delegate;
    public final /* synthetic */ String $codeFieldLabel;
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ MutableState<String> $idempotencyKey$delegate;
    public final /* synthetic */ String $pageUrl;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ C1BO<SecureStorageVerificationCodeCaptureUiState> $uiState$delegate;
    public final /* synthetic */ HatchCredentialsViewModel $viewModel;

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$4$1$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $canSubmit;
        public final /* synthetic */ String $captureAuthorization;
        public final /* synthetic */ MutableState<String> $code$delegate;
        public final /* synthetic */ String $codeFieldLabel;
        public final /* synthetic */ C1518AkS $focusRequester;
        public final /* synthetic */ MutableState<String> $idempotencyKey$delegate;
        public final /* synthetic */ String $pageUrl;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ C1BO<SecureStorageVerificationCodeCaptureUiState> $uiState$delegate;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;

        /* renamed from: com.facebook.aura.settings.HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$4$1$3$1$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ String $codeFieldLabel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(String str) {
                super(2);
                this.$codeFieldLabel = str;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    AnonymousClass007.A12(bfm, AuraTextInputDefaults.INSTANCE, this.$codeFieldLabel);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1518AkS c1518AkS, boolean z, HatchCredentialsViewModel hatchCredentialsViewModel, String str, MutableState<String> mutableState, MutableState<String> mutableState2, String str2, String str3, C1BO<SecureStorageVerificationCodeCaptureUiState> c1bo, String str4) {
            super(3);
            this.$focusRequester = c1518AkS;
            this.$canSubmit = z;
            this.$viewModel = hatchCredentialsViewModel;
            this.$pageUrl = str;
            this.$code$delegate = mutableState;
            this.$idempotencyKey$delegate = mutableState2;
            this.$sessionId = str2;
            this.$captureAuthorization = str3;
            this.$uiState$delegate = c1bo;
            this.$codeFieldLabel = str4;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA05 = MutableState.A05(this.$code$delegate);
                BRg bRgA00 = BHJ.A00(AnonymousClass006.A0N(BRg.A00), this.$focusRequester);
                boolean z = !this.$uiState$delegate.getValue().isSubmitting;
                AuJ auJ = new AuJ(null, -1, 2, 7);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$captureAuthorization, AnonymousClass001.A1R(bfm, this.$sessionId, AnonymousClass001.A1R(bfm, this.$idempotencyKey$delegate, AnonymousClass001.A1R(bfm, this.$code$delegate, AnonymousClass001.A1R(bfm, this.$pageUrl, AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A66(this.$canSubmit)))))));
                boolean z2 = this.$canSubmit;
                HatchCredentialsViewModel hatchCredentialsViewModel = this.$viewModel;
                String str = this.$pageUrl;
                String str2 = this.$sessionId;
                String str3 = this.$captureAuthorization;
                MutableState<String> mutableState = this.$code$delegate;
                MutableState<String> mutableState2 = this.$idempotencyKey$delegate;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$4$1$3$1$1$1$1(z2, hatchCredentialsViewModel, str, str2, str3, mutableState, mutableState2);
                    bfm.Ai0(objAaT);
                }
                C2257BGr c2257BGr = new C2257BGr((G0U) objAaT, null, null, null);
                AuraColorsTextInput auraColorsTextInputA0b = C06G.A0b(bfm);
                C1DM c1dmHatchSectionRowShape = HatchSectionKt.hatchSectionRowShape(0, 1, bfm, 54);
                B1U b1uA00 = B1V.A00(bfm, new AnonymousClass2(this.$codeFieldLabel), -1168867528);
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, AnonymousClass001.A1R(bfm, this.$idempotencyKey$delegate, bfm.A65(this.$code$delegate)));
                HatchCredentialsViewModel hatchCredentialsViewModel2 = this.$viewModel;
                MutableState<String> mutableState3 = this.$code$delegate;
                MutableState<String> mutableState4 = this.$idempotencyKey$delegate;
                Object objAaT2 = bfm.AaT();
                if (zA1T || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$4$1$3$1$1$3$1(hatchCredentialsViewModel2, mutableState3, mutableState4);
                    bfm.Ai0(objAaT2);
                }
                AuraTextInputKt.AuraTextInput(strA05, null, bRgA00, b1uA00, auJ, c2257BGr, null, null, true, 0, 0, null, null, auraColorsTextInputA0b, null, z, false, false, false, c1dmHatchSectionRowShape, (G0U) objAaT2, bfm, 100690944, 0, 0, 483010);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$focusRequester, this.$canSubmit, this.$viewModel, this.$pageUrl, this.$code$delegate, this.$idempotencyKey$delegate, this.$sessionId, this.$captureAuthorization, this.$uiState$delegate, this.$codeFieldLabel), -590702644);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$4$1$3$1(C1518AkS c1518AkS, boolean z, HatchCredentialsViewModel hatchCredentialsViewModel, String str, MutableState<String> mutableState, MutableState<String> mutableState2, String str2, String str3, C1BO<SecureStorageVerificationCodeCaptureUiState> c1bo, String str4) {
        super(1);
        this.$focusRequester = c1518AkS;
        this.$canSubmit = z;
        this.$viewModel = hatchCredentialsViewModel;
        this.$pageUrl = str;
        this.$code$delegate = mutableState;
        this.$idempotencyKey$delegate = mutableState2;
        this.$sessionId = str2;
        this.$captureAuthorization = str3;
        this.$uiState$delegate = c1bo;
        this.$codeFieldLabel = str4;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
