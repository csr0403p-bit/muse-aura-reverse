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
public final class HeaderButtonKt$HatchHeaderButtonRow$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $animateAddedButtons;
    public final /* synthetic */ HeaderButton $badgedButton;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ AHD<HeaderButton> $headerButtons;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<HeaderAction, Unit> $onHeaderActionClick;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ boolean $showButtons;
    public final /* synthetic */ B6A $singleButtonTint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeaderButtonKt$HatchHeaderButtonRow$3(AHD<? extends HeaderButton> ahd, G0U<? super HeaderButton, Unit> g0u, BRg bRg, B6A b6a, HeaderButton headerButton, AHD<HeaderAction> ahd2, G0U<? super HeaderAction, Unit> g0u2, boolean z, boolean z2, int i, int i2) {
        super(2);
        this.$headerButtons = ahd;
        this.$onHeaderButtonClick = g0u;
        this.$modifier = bRg;
        this.$singleButtonTint = b6a;
        this.$badgedButton = headerButton;
        this.$headerActions = ahd2;
        this.$onHeaderActionClick = g0u2;
        this.$animateAddedButtons = z;
        this.$showButtons = z2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HeaderButtonKt.m1025HatchHeaderButtonRow_6dBP3U(this.$headerButtons, this.$onHeaderButtonClick, this.$modifier, this.$singleButtonTint, this.$badgedButton, this.$headerActions, this.$onHeaderActionClick, this.$animateAddedButtons, this.$showButtons, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
