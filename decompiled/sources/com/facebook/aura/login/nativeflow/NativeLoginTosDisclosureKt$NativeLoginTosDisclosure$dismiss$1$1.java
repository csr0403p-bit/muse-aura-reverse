package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginTosDisclosureKt$NativeLoginTosDisclosure$dismiss$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<String> $openSheetToken$delegate;
    public final /* synthetic */ MutableState<String> $pickedAccountId$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginTosDisclosureKt$NativeLoginTosDisclosure$dismiss$1$1(MutableState<String> mutableState, MutableState<String> mutableState2) {
        super(0);
        this.$openSheetToken$delegate = mutableState;
        this.$pickedAccountId$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$openSheetToken$delegate.Af8(null);
        this.$pickedAccountId$delegate.Af8(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
