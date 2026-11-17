package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HeaderButtonKt$HeaderIconButtons$4$1$3$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HeaderButton $button;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeaderButtonKt$HeaderIconButtons$4$1$3$2$1$1(G0U<? super HeaderButton, Unit> g0u, HeaderButton headerButton) {
        super(0);
        this.$onHeaderButtonClick = g0u;
        this.$button = headerButton;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onHeaderButtonClick.invoke(this.$button);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
