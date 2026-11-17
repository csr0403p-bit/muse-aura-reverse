package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Hi;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$7$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $captureAuthorization;
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ MutableState<String> $idempotencyKey$delegate;
    public final /* synthetic */ boolean $isFromChat;
    public final /* synthetic */ MutableState<String> $password$delegate;
    public final /* synthetic */ MutableState<Boolean> $saveToSecureStorage$delegate;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ MutableState<String> $username$delegate;
    public final /* synthetic */ HatchCredentialsViewModel $viewModel;
    public final /* synthetic */ MutableState<String> $website$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$7$1(HatchCredentialsViewModel hatchCredentialsViewModel, String str, String str2, boolean z, C0Hi c0Hi, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<Boolean> mutableState4, MutableState<String> mutableState5) {
        super(0);
        this.$viewModel = hatchCredentialsViewModel;
        this.$sessionId = str;
        this.$captureAuthorization = str2;
        this.$isFromChat = z;
        this.$focusManager = c0Hi;
        this.$website$delegate = mutableState;
        this.$username$delegate = mutableState2;
        this.$password$delegate = mutableState3;
        this.$saveToSecureStorage$delegate = mutableState4;
        this.$idempotencyKey$delegate = mutableState5;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchSecureStorageScreenKt.saveCredential(this.$viewModel, MutableState.A05(this.$website$delegate), MutableState.A05(this.$username$delegate), MutableState.A05(this.$password$delegate), MutableState.A0A((MutableState) this.$saveToSecureStorage$delegate), MutableState.A05(this.$idempotencyKey$delegate), this.$sessionId, this.$captureAuthorization, this.$isFromChat, this.$focusManager);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
