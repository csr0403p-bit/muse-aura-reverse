package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HeaderButtonKt$HatchHeaderButtonRow$2$1$1 extends AbstractC7559F3s implements G0U<HeaderButton, Unit> {
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ boolean $showButtons;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderButton headerButton) {
        C7384Etj.A0Y(headerButton, 0);
        if (this.$showButtons) {
            this.$onHeaderButtonClick.invoke(headerButton);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeaderButtonKt$HatchHeaderButtonRow$2$1$1(boolean z, G0U<? super HeaderButton, Unit> g0u) {
        super(1);
        this.$showButtons = z;
        this.$onHeaderButtonClick = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderButton headerButton) {
        invoke2(headerButton);
        return Unit.INSTANCE;
    }
}
