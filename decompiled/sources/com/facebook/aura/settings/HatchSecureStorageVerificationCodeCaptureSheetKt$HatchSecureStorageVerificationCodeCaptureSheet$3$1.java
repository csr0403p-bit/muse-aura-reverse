package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnDismiss$delegate;
    public final /* synthetic */ C1BO<SecureStorageVerificationCodeCaptureUiState> $uiState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$3$1(C1BO<SecureStorageVerificationCodeCaptureUiState> c1bo, C1BO<? extends Function0<Unit>> c1bo2) {
        super(0);
        this.$uiState$delegate = c1bo;
        this.$currentOnDismiss$delegate = c1bo2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$uiState$delegate.getValue().isSubmitting) {
            return;
        }
        C1BO.A0D(this.$currentOnDismiss$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
