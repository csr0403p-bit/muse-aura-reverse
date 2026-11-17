package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Hi;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$4$1$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $captureAuthorization;
    public final /* synthetic */ MutableState<String> $code$delegate;
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ MutableState<String> $idempotencyKey$delegate;
    public final /* synthetic */ String $pageUrl;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ HatchCredentialsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$4$1$5$1(C0Hi c0Hi, HatchCredentialsViewModel hatchCredentialsViewModel, String str, String str2, String str3, MutableState<String> mutableState, MutableState<String> mutableState2) {
        super(0);
        this.$focusManager = c0Hi;
        this.$viewModel = hatchCredentialsViewModel;
        this.$pageUrl = str;
        this.$sessionId = str2;
        this.$captureAuthorization = str3;
        this.$code$delegate = mutableState;
        this.$idempotencyKey$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SecureStorageLogging.INSTANCE.verificationSubmitTapped();
        this.$focusManager.A6G(false);
        this.$viewModel.submitVerificationCode(this.$pageUrl, MutableState.A05(this.$code$delegate), MutableState.A05(this.$idempotencyKey$delegate), this.$sessionId, this.$captureAuthorization);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
