package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.navigation.key.SecureStorageCredentialDetailsScreenKey;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
    public final /* synthetic */ HatchCredentialsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$1$1(HatchCredentialsViewModel hatchCredentialsViewModel, SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey) {
        super(1);
        this.$viewModel = hatchCredentialsViewModel;
        this.$key = secureStorageCredentialDetailsScreenKey;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchCredentialsViewModel hatchCredentialsViewModel = this.$viewModel;
        SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey = this.$key;
        hatchCredentialsViewModel.loadCredentialDetails(secureStorageCredentialDetailsScreenKey.id, secureStorageCredentialDetailsScreenKey.openedFromChat);
        final HatchCredentialsViewModel hatchCredentialsViewModel2 = this.$viewModel;
        final SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey2 = this.$key;
        return new C78g() { // from class: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchCredentialsViewModel2.clearCredentialDetails(secureStorageCredentialDetailsScreenKey2.id);
            }
        };
    }
}
