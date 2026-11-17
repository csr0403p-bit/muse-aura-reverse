package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C0Hi;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchTabHeaderKt$HatchTabHeader$5$1$4$3$2$1 extends AbstractC7559F3s implements G0U<HeaderButton, Unit> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderButton headerButton) {
        C7384Etj.A0Y(headerButton, 0);
        this.$focusManager.A6G(false);
        this.$onHeaderButtonClick.invoke(headerButton);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTabHeaderKt$HatchTabHeader$5$1$4$3$2$1(C0Hi c0Hi, G0U<? super HeaderButton, Unit> g0u) {
        super(1);
        this.$focusManager = c0Hi;
        this.$onHeaderButtonClick = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderButton headerButton) {
        invoke2(headerButton);
        return Unit.INSTANCE;
    }
}
