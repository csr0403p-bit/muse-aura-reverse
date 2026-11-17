package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class BottomSheetScene$content$1$2$3$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ BottomSheetScene$content$1$sheetNavigator$1$1 $sheetNavigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScene$content$1$2$3$1$1$2$1(BottomSheetScene$content$1$sheetNavigator$1$1 bottomSheetScene$content$1$sheetNavigator$1$1) {
        super(0);
        this.$sheetNavigator = bottomSheetScene$content$1$sheetNavigator$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$sheetNavigator.back();
    }
}
