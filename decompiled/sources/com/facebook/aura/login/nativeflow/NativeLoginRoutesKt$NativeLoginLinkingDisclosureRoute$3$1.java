package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchScreen;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginLinkingDisclosureRoute$3$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ NativeLoginViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$viewModel.onTosDisclosureClicked(HatchScreen.LOGIN_LINKING_DISCLOSURE, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginLinkingDisclosureRoute$3$1(NativeLoginViewModel nativeLoginViewModel) {
        super(1);
        this.$viewModel = nativeLoginViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
