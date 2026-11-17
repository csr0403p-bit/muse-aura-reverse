package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.header.api.HeaderAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HeaderButtonKt$HeaderIconButtons$4$1$3$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HeaderAction $action;
    public final /* synthetic */ G0U<HeaderAction, Unit> $onHeaderActionClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeaderButtonKt$HeaderIconButtons$4$1$3$1$2$1(G0U<? super HeaderAction, Unit> g0u, HeaderAction headerAction) {
        super(0);
        this.$onHeaderActionClick = g0u;
        this.$action = headerAction;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onHeaderActionClick.invoke(this.$action);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
