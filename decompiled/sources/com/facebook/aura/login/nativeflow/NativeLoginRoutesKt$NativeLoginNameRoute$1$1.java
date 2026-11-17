package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginNameRoute$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ NativeLoginViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginNameRoute$1$1(NativeLoginViewModel nativeLoginViewModel) {
        super(1);
        this.$viewModel = nativeLoginViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.onSignupStepShown();
        return new C78g() { // from class: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginNameRoute$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
