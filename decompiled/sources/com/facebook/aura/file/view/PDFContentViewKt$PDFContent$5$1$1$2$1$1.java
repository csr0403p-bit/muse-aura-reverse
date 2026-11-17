package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PDFContentViewKt$PDFContent$5$1$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $loadError$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDFContentViewKt$PDFContent$5$1$1$2$1$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$loadError$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(true, this.$loadError$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
