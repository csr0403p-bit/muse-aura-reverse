package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.NativeLoginLandingScreenKey;
import com.facebook.aura.navigation.key.NativeLoginMoreAccountsSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginLandingRoute$8$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ NativeLoginViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginLandingRoute$8$1(AuraNavigator auraNavigator, NativeLoginViewModel nativeLoginViewModel) {
        super(0);
        this.$navigator = auraNavigator;
        this.$viewModel = nativeLoginViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (C7384Etj.areEqual(C3cG.A0H(this.$navigator), NativeLoginLandingScreenKey.INSTANCE)) {
            this.$viewModel.onMoreAccountsClicked();
            this.$navigator.navigate((AuraNavKey) NativeLoginMoreAccountsSheetKey.INSTANCE, false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
