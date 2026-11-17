package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HeaderButtonKt$PillHeaderButtonIcon$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ HeaderButton $button;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ boolean $showBadge;
    public final /* synthetic */ boolean $showDecorations;
    public final /* synthetic */ B6A $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeaderButtonKt$PillHeaderButtonIcon$2(HeaderButton headerButton, G0U<? super HeaderButton, Unit> g0u, B6A b6a, BRg bRg, boolean z, boolean z2, int i, int i2) {
        super(2);
        this.$button = headerButton;
        this.$onHeaderButtonClick = g0u;
        this.$tint = b6a;
        this.$modifier = bRg;
        this.$showBadge = z;
        this.$showDecorations = z2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HeaderButtonKt.m1030PillHeaderButtonIcondgCrO4(this.$button, this.$onHeaderButtonClick, this.$tint, this.$modifier, this.$showBadge, this.$showDecorations, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
