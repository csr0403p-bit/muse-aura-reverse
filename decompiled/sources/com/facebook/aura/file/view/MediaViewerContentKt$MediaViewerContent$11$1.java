package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.HatchDragDismissState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$11$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchDragDismissState $dragDismissState;
    public final /* synthetic */ boolean $isDragDismissActive;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerContent$11$1(boolean z, HatchDragDismissState hatchDragDismissState) {
        super(0);
        this.$isDragDismissActive = z;
        this.$dragDismissState = hatchDragDismissState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isDragDismissActive) {
            this.$dragDismissState.onBackHandlerReleased();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
