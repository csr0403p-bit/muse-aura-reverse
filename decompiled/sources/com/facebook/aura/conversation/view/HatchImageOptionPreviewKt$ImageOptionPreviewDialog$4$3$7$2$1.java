package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$3$7$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<ImageOptionPreviewExit, Unit> $close;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$3$7$2$1(G0U<? super ImageOptionPreviewExit, Unit> g0u) {
        super(0);
        this.$close = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$close.invoke(ImageOptionPreviewExit.Open);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
