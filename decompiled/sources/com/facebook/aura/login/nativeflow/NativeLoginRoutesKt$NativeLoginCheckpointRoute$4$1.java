package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import com.facebook.aura.logout.AuraLogoutHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginCheckpointRoute$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ NativeLoginViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginCheckpointRoute$4$1(NativeLoginViewModel nativeLoginViewModel) {
        super(0);
        this.$viewModel = nativeLoginViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onCheckpointLogOutClicked();
        AuraLogoutHelper.INSTANCE.performLogout();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
