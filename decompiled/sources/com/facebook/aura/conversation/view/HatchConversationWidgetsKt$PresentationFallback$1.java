package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0V;
import com.facebook.aura.model.HatchWidgetPresentation;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$PresentationFallback$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ String $imageVersion;
    public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ HatchWidgetPresentation $presentation;
    public final /* synthetic */ C1D3 $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationWidgetsKt$PresentationFallback$1(HatchWidgetPresentation hatchWidgetPresentation, long j, C1D3 c1d3, InlineContentCallbacks inlineContentCallbacks, String str, BRg bRg, int i, int i2) {
        super(2);
        this.$presentation = hatchWidgetPresentation;
        this.$backgroundColor = j;
        this.$shape = c1d3;
        this.$inlineContentCallbacks = inlineContentCallbacks;
        this.$imageVersion = str;
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
        HatchConversationWidgetsKt.m577PresentationFallbackOadGlvw(this.$presentation, this.$backgroundColor, this.$shape, this.$inlineContentCallbacks, this.$imageVersion, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
