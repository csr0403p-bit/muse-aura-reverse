package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$5$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ String $captureAuthorization;
    public final /* synthetic */ MutableState<String> $idempotencyKey$delegate;
    public final /* synthetic */ boolean $isFromChat;
    public final /* synthetic */ MutableState<Boolean> $saveToSecureStorage$delegate;
    public final /* synthetic */ HatchCredentialsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$5$1(boolean z, String str, HatchCredentialsViewModel hatchCredentialsViewModel, MutableState<Boolean> mutableState, MutableState<String> mutableState2) {
        super(1);
        this.$isFromChat = z;
        this.$captureAuthorization = str;
        this.$viewModel = hatchCredentialsViewModel;
        this.$saveToSecureStorage$delegate = mutableState;
        this.$idempotencyKey$delegate = mutableState2;
    }

    public final void invoke(boolean z) {
        SecureStorageLogging.INSTANCE.saveToggled(this.$isFromChat, AnonymousClass002.A1X(this.$captureAuthorization), z);
        MutableState.A09(z, this.$saveToSecureStorage$delegate);
        this.$idempotencyKey$delegate.Af8(AnonymousClass002.A0k());
        this.$viewModel.clearCaptureError();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
