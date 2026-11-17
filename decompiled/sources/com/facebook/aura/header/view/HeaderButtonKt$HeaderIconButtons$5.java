package com.facebook.aura.header.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.header.api.HeaderAction;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HeaderButtonKt$HeaderIconButtons$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ HeaderButton $badgedButton;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ AHD<HeaderButton> $iconButtons;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<HeaderAction, Unit> $onHeaderActionClick;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ OnScreenState $row;
    public final /* synthetic */ boolean $showDecorations;
    public final /* synthetic */ B6A $singleButtonTint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeaderButtonKt$HeaderIconButtons$5(AHD<? extends HeaderButton> ahd, boolean z, AHD<HeaderAction> ahd2, G0U<? super HeaderButton, Unit> g0u, G0U<? super HeaderAction, Unit> g0u2, B6A b6a, HeaderButton headerButton, OnScreenState onScreenState, BRg bRg, int i, int i2) {
        super(2);
        this.$iconButtons = ahd;
        this.$showDecorations = z;
        this.$headerActions = ahd2;
        this.$onHeaderButtonClick = g0u;
        this.$onHeaderActionClick = g0u2;
        this.$singleButtonTint = b6a;
        this.$badgedButton = headerButton;
        this.$row = onScreenState;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HeaderButtonKt.m1028HeaderIconButtonsIqSmMA(this.$iconButtons, this.$showDecorations, this.$headerActions, this.$onHeaderButtonClick, this.$onHeaderActionClick, this.$singleButtonTint, this.$badgedButton, this.$row, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
