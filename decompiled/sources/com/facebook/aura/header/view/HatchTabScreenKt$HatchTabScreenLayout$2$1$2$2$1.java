package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTabScreenKt$HatchTabScreenLayout$2$1$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<HeaderLeadingButton, Unit> $handleLeadingButtonClick;
    public final /* synthetic */ HeaderLeadingButton $leadingButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTabScreenKt$HatchTabScreenLayout$2$1$2$2$1(HeaderLeadingButton headerLeadingButton, G0U<? super HeaderLeadingButton, Unit> g0u) {
        super(0);
        this.$leadingButton = headerLeadingButton;
        this.$handleLeadingButtonClick = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HeaderLeadingButton headerLeadingButton = this.$leadingButton;
        if (headerLeadingButton != null) {
            this.$handleLeadingButtonClick.invoke(headerLeadingButton);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
