package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchGridDetailScreenKt$HatchGridDetailScreen$2$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<T> $selectedItem$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGridDetailScreenKt$HatchGridDetailScreen$2$2$1$1(MutableState<T> mutableState) {
        super(0);
        this.$selectedItem$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$selectedItem$delegate.Af8(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
