package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchCredentialsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageScreen$1$1(HatchCredentialsViewModel hatchCredentialsViewModel) {
        super(1);
        this.$viewModel = hatchCredentialsViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.loadCredentials();
        return new C78g() { // from class: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
