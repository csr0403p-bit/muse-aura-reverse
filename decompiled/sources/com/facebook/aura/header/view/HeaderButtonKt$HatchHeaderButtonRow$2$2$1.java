package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.header.api.HeaderAction;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HeaderButtonKt$HatchHeaderButtonRow$2$2$1 extends AbstractC7559F3s implements G0U<HeaderAction, Unit> {
    public final /* synthetic */ G0U<HeaderAction, Unit> $onHeaderActionClick;
    public final /* synthetic */ boolean $showButtons;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderAction headerAction) {
        C7384Etj.A0Y(headerAction, 0);
        if (this.$showButtons) {
            this.$onHeaderActionClick.invoke(headerAction);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeaderButtonKt$HatchHeaderButtonRow$2$2$1(boolean z, G0U<? super HeaderAction, Unit> g0u) {
        super(1);
        this.$showButtons = z;
        this.$onHeaderActionClick = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderAction headerAction) {
        invoke2(headerAction);
        return Unit.INSTANCE;
    }
}
