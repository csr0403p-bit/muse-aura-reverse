package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.caa.HatchCaaLoginEventStep;
import com.facebook.aura.analytics.hatch.caa.HatchCaaLoginLogger;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginPasswordRoute$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $pageShownLogged$delegate;
    public final /* synthetic */ NativeLoginViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginPasswordRoute$1$1(NativeLoginViewModel nativeLoginViewModel, MutableState<Boolean> mutableState) {
        super(1);
        this.$viewModel = nativeLoginViewModel;
        this.$pageShownLogged$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!MutableState.A0A((MutableState) this.$pageShownLogged$delegate)) {
            MutableState.A09(true, this.$pageShownLogged$delegate);
            HatchCaaLoginLogger.INSTANCE.logPasswordPageShown(this.$viewModel.submittedContactPoint);
            this.$viewModel.onRememberDeviceShown(HatchCaaLoginEventStep.PASSWORD);
        }
        return new C78g() { // from class: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginPasswordRoute$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
