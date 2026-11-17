package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Ou;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$4$1$3$1$1$1$1 extends AbstractC7559F3s implements G0U<C0Ou, Unit> {
    public final /* synthetic */ boolean $canSubmit;
    public final /* synthetic */ String $captureAuthorization;
    public final /* synthetic */ MutableState<String> $code$delegate;
    public final /* synthetic */ MutableState<String> $idempotencyKey$delegate;
    public final /* synthetic */ String $pageUrl;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ HatchCredentialsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$4$1$3$1$1$1$1(boolean z, HatchCredentialsViewModel hatchCredentialsViewModel, String str, String str2, String str3, MutableState<String> mutableState, MutableState<String> mutableState2) {
        super(1);
        this.$canSubmit = z;
        this.$viewModel = hatchCredentialsViewModel;
        this.$pageUrl = str;
        this.$sessionId = str2;
        this.$captureAuthorization = str3;
        this.$code$delegate = mutableState;
        this.$idempotencyKey$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0Ou c0Ou) {
        if (this.$canSubmit) {
            this.$viewModel.submitVerificationCode(this.$pageUrl, MutableState.A05(this.$code$delegate), MutableState.A05(this.$idempotencyKey$delegate), this.$sessionId, this.$captureAuthorization);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0Ou c0Ou) {
        invoke2(c0Ou);
        return Unit.INSTANCE;
    }
}
