package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginMoreAccountsSheetRoute$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Boolean> $close;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginMoreAccountsSheetRoute$4$1(Function0<Boolean> function0) {
        super(0);
        this.$close = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$close.invoke();
    }
}
