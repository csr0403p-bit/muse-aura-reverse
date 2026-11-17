package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.key.SecureStorageCredentialDetailsScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
    public final /* synthetic */ HatchCredentialsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$2$1(HatchCredentialsViewModel hatchCredentialsViewModel, SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey) {
        super(0);
        this.$viewModel = hatchCredentialsViewModel;
        this.$key = secureStorageCredentialDetailsScreenKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchCredentialsViewModel hatchCredentialsViewModel = this.$viewModel;
        SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey = this.$key;
        hatchCredentialsViewModel.loadCredentialDetails(secureStorageCredentialDetailsScreenKey.id, secureStorageCredentialDetailsScreenKey.openedFromChat);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
