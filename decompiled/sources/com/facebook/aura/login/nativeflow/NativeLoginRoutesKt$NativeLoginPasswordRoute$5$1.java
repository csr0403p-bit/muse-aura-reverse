package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchScreen;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginPasswordRoute$5$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ NativeLoginViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginPasswordRoute$5$1(NativeLoginViewModel nativeLoginViewModel) {
        super(1);
        this.$viewModel = nativeLoginViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.$viewModel.onPasswordRevealToggled(HatchScreen.LOGIN_PASSWORD, z);
    }
}
