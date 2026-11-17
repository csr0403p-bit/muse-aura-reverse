package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$NativeLoginPasswordField$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $isPasswordVisible$delegate;
    public final /* synthetic */ G0U<Boolean, Unit> $onRevealToggled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginCommonKt$NativeLoginPasswordField$3$1$1(G0U<? super Boolean, Unit> g0u, MutableState<Boolean> mutableState) {
        super(0);
        this.$onRevealToggled = g0u;
        this.$isPasswordVisible$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<Boolean> mutableState = this.$isPasswordVisible$delegate;
        int i = NativeLoginCommonKt.IME_EDGE_UNSET;
        MutableState.A09(!MutableState.A0A((MutableState) mutableState), mutableState);
        AnonymousClass001.A1K(MutableState.A0A((MutableState) this.$isPasswordVisible$delegate), this.$onRevealToggled);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
