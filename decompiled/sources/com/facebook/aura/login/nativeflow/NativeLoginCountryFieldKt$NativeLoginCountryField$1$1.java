package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginCountryFieldKt$NativeLoginCountryField$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCountryFieldKt$NativeLoginCountryField$1$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$expanded$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<Boolean> mutableState = this.$expanded$delegate;
        List<String> list = NativeLoginCountryFieldKt.COUNTRY_MENU_LABELS;
        MutableState.A09(true, mutableState);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
