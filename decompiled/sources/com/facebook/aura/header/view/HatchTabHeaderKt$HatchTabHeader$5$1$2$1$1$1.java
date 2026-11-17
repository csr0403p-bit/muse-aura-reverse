package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C0Hi;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTabHeaderKt$HatchTabHeader$5$1$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ HeaderLeadingButton $leadingButton;
    public final /* synthetic */ G0U<HeaderLeadingButton, Unit> $onLeadingButtonClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTabHeaderKt$HatchTabHeader$5$1$2$1$1$1(C0Hi c0Hi, G0U<? super HeaderLeadingButton, Unit> g0u, HeaderLeadingButton headerLeadingButton) {
        super(0);
        this.$focusManager = c0Hi;
        this.$onLeadingButtonClick = g0u;
        this.$leadingButton = headerLeadingButton;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$focusManager.A6G(false);
        this.$onLeadingButtonClick.invoke(this.$leadingButton);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
