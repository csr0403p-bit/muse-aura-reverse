package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0U;
import X.G0V;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.model.NavigationUiControl;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeaRowCardKt$HatchIdeaRowCard$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<IdeaWidgetData, Unit> $onOpenIdea;
    public final /* synthetic */ G0U<NavigationUiControl, Unit> $onPerformUiControl;
    public final /* synthetic */ AHD<HatchIdeaCardRow> $rows;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdeaRowCardKt$HatchIdeaRowCard$3(AHD<? extends HatchIdeaCardRow> ahd, G0U<? super IdeaWidgetData, Unit> g0u, G0U<? super NavigationUiControl, Unit> g0u2, BRg bRg, long j, C1D3 c1d3, int i, int i2) {
        super(2);
        this.$rows = ahd;
        this.$onOpenIdea = g0u;
        this.$onPerformUiControl = g0u2;
        this.$modifier = bRg;
        this.$backgroundColor = j;
        this.$containerShape = c1d3;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchIdeaRowCardKt.m607HatchIdeaRowCardFHprtrg(this.$rows, this.$onOpenIdea, this.$onPerformUiControl, this.$modifier, this.$backgroundColor, this.$containerShape, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
