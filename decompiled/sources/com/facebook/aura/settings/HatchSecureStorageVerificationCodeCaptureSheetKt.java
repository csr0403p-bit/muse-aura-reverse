package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AuJ;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C07C;
import X.C0Hi;
import X.C1518AkS;
import X.C1BO;
import X.C1DM;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.theme.AuraColorsTextInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchSecureStorageVerificationCodeCaptureSheetKt {

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $canSubmit;
        public final /* synthetic */ String $cancelButtonText;
        public final /* synthetic */ String $captureAuthorization;
        public final /* synthetic */ MutableState<String> $code$delegate;
        public final /* synthetic */ String $codeFieldLabel;
        public final /* synthetic */ C1BO<Function0<Unit>> $currentOnDismiss$delegate;
        public final /* synthetic */ C0Hi $focusManager;
        public final /* synthetic */ C1518AkS $focusRequester;
        public final /* synthetic */ MutableState<String> $idempotencyKey$delegate;
        public final /* synthetic */ String $pageUrl;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ String $submitButtonText;
        public final /* synthetic */ String $submittingButtonText;
        public final /* synthetic */ C1BO<SecureStorageVerificationCodeCaptureUiState> $uiState$delegate;
        public final /* synthetic */ SecureStorageVerificationCodeCaptureError $validationError;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, C1BO<SecureStorageVerificationCodeCaptureUiState> c1bo, MutableState<String> mutableState, boolean z, HatchCredentialsViewModel hatchCredentialsViewModel, MutableState<String> mutableState2, String str2, String str3, String str4, SecureStorageVerificationCodeCaptureError secureStorageVerificationCodeCaptureError, String str5, String str6, C0Hi c0Hi, String str7, C1BO<? extends Function0<Unit>> c1bo2, C1518AkS c1518AkS) {
            super(3);
            this.$pageUrl = str;
            this.$uiState$delegate = c1bo;
            this.$code$delegate = mutableState;
            this.$canSubmit = z;
            this.$viewModel = hatchCredentialsViewModel;
            this.$idempotencyKey$delegate = mutableState2;
            this.$sessionId = str2;
            this.$captureAuthorization = str3;
            this.$codeFieldLabel = str4;
            this.$validationError = secureStorageVerificationCodeCaptureError;
            this.$submittingButtonText = str5;
            this.$submitButtonText = str6;
            this.$focusManager = c0Hi;
            this.$cancelButtonText = str7;
            this.$currentOnDismiss$delegate = c1bo2;
            this.$focusRequester = c1518AkS;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0269  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r61, X.BFM r62, int r63) {
            /*
                Method dump skipped, instructions count: 873
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchSecureStorageVerificationCodeCaptureSheetKt.AnonymousClass4.invoke(X.07C, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $captureAuthorization;
        public final /* synthetic */ String $codeFieldLabel;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ String $pageUrl;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, String str2, String str3, String str4, HatchCredentialsViewModel hatchCredentialsViewModel, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$pageUrl = str;
            this.$codeFieldLabel = str2;
            this.$sessionId = str3;
            this.$captureAuthorization = str4;
            this.$viewModel = hatchCredentialsViewModel;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSecureStorageVerificationCodeCaptureSheetKt.HatchSecureStorageVerificationCodeCaptureSheet(this.$pageUrl, this.$codeFieldLabel, this.$sessionId, this.$captureAuthorization, this.$viewModel, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageVerificationCodeCaptureSheetKt$SecureStorageWebsiteOriginField$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $pageUrl;
        public final /* synthetic */ C1DM $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, boolean z, C1DM c1dm, BRg bRg, int i, int i2) {
            super(2);
            this.$pageUrl = str;
            this.$enabled = z;
            this.$shape = c1dm;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSecureStorageVerificationCodeCaptureSheetKt.SecureStorageWebsiteOriginField(this.$pageUrl, this.$enabled, this.$shape, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchSecureStorageVerificationCodeCaptureSheet(java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, com.facebook.aura.settings.HatchCredentialsViewModel r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, X.BRg r51, X.BFM r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchSecureStorageVerificationCodeCaptureSheetKt.HatchSecureStorageVerificationCodeCaptureSheet(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.settings.HatchCredentialsViewModel, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void SecureStorageWebsiteOriginField(String str, boolean z, C1DM c1dm, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(str, 0, c1dm);
        bfm.AgG(-232914190);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c1dm);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strSecureStorageDisplayOrigin = secureStorageDisplayOrigin(str);
            BRg bRgA0N = AnonymousClass006.A0N(bRg2);
            AuJ auJ = new AuJ(null, -1, 5, -1);
            AuraColorsTextInput auraColorsTextInputA0b = C06G.A0b(bfm);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchSecureStorageVerificationCodeCaptureSheetKt$SecureStorageWebsiteOriginField$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextInputKt.AuraTextInput(strSecureStorageDisplayOrigin, null, bRgA0N, null, auJ, null, null, null, true, 0, 0, null, null, auraColorsTextInputA0b, null, z, true, false, false, c1dm, (G0U) objAaT, bfm, 100687872, AnonymousClass001.A06(iA0d << 21, ((iA0d << 12) & 458752) | 1572864), 6, 417514);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, z, c1dm, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ SecureStorageVerificationCodeCaptureUiState access$HatchSecureStorageVerificationCodeCaptureSheet$lambda$0(C1BO c1bo) {
        return (SecureStorageVerificationCodeCaptureUiState) c1bo.getValue();
    }

    public static final String secureStorageDisplayOrigin(String str) {
        Uri uri = Uri.parse(str);
        return FGI.A0U(uri.getScheme(), "://", uri.getEncodedAuthority());
    }

    public static final void submitVerificationCode(HatchCredentialsViewModel hatchCredentialsViewModel, String str, String str2, String str3, String str4, String str5) {
        hatchCredentialsViewModel.submitVerificationCode(str, str2, str3, str4, str5);
    }
}
