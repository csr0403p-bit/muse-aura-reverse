package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2$1$5$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<String> $idempotencyKey$delegate;
    public final /* synthetic */ MutableState<String> $password$delegate;
    public final /* synthetic */ HatchCredentialsViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$password$delegate.Af8(str);
        this.$idempotencyKey$delegate.Af8(AnonymousClass002.A0k());
        this.$viewModel.clearCaptureError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2$1$5$1(HatchCredentialsViewModel hatchCredentialsViewModel, MutableState<String> mutableState, MutableState<String> mutableState2) {
        super(1);
        this.$viewModel = hatchCredentialsViewModel;
        this.$password$delegate = mutableState;
        this.$idempotencyKey$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
