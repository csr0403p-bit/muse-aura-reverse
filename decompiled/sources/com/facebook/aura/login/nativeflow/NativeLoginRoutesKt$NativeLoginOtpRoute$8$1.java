package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.NativeLoginCheckpointWebScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginOtpRoute$8$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ NativeLoginViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginOtpRoute$8$1(NativeLoginViewModel nativeLoginViewModel, AuraNavigator auraNavigator) {
        super(0);
        this.$viewModel = nativeLoginViewModel;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onOtpScreenLeft(NativeLoginRoutesKt.isTwoFactorScreenKey(this.$navigator.currentKey(true)), C7384Etj.areEqual(this.$navigator.currentKey(true), NativeLoginCheckpointWebScreenKey.INSTANCE));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
