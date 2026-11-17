package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginBirthdayScreenKt$NativeLoginBirthdayScreen$2$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $isPickerVisible$delegate;
    public final /* synthetic */ Function0<Unit> $onBirthdayFieldFocused;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginBirthdayScreenKt$NativeLoginBirthdayScreen$2$1$2$1(Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(0);
        this.$onBirthdayFieldFocused = function0;
        this.$isPickerVisible$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onBirthdayFieldFocused.invoke();
        MutableState.A09(true, this.$isPickerVisible$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
