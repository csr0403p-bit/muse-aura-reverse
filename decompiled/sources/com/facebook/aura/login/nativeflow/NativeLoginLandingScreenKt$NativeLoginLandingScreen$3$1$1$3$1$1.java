package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginLandingScreenKt$NativeLoginLandingScreen$3$1$1$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ NativeLoginAccountUiModel $account;
    public final /* synthetic */ G0U<NativeLoginAccountUiModel, Unit> $onAccountClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginLandingScreenKt$NativeLoginLandingScreen$3$1$1$3$1$1(G0U<? super NativeLoginAccountUiModel, Unit> g0u, NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        super(0);
        this.$onAccountClick = g0u;
        this.$account = nativeLoginAccountUiModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onAccountClick.invoke(this.$account);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
