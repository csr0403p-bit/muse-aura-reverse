package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C00r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpreadsheetContentViewKt$SpreadsheetContent$4$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ C00r $selectedSheetIndex$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpreadsheetContentViewKt$SpreadsheetContent$4$1$1$2$1(int i, C00r c00r) {
        super(0);
        this.$index = i;
        this.$selectedSheetIndex$delegate = c00r;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$selectedSheetIndex$delegate.AdX(this.$index);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
