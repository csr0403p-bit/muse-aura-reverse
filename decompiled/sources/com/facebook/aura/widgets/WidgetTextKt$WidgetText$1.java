package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.C76B;
import X.C76X;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class WidgetTextKt$WidgetText$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C76X $color;
    public final /* synthetic */ boolean $isCentered;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ float $maxWidth;
    public final /* synthetic */ C76B $modifier;
    public final /* synthetic */ WidgetTextStyle $style;
    public final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetTextKt$WidgetText$1(String str, WidgetTextStyle widgetTextStyle, C76X c76x, float f, C76B c76b, int i, boolean z, int i2, int i3) {
        super(2);
        this.$text = str;
        this.$style = widgetTextStyle;
        this.$color = c76x;
        this.$maxWidth = f;
        this.$modifier = c76b;
        this.$maxLines = i;
        this.$isCentered = z;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public final void invoke(BFM bfm, int i) {
        WidgetTextKt.m3163WidgetTextb7W0Lw(this.$text, this.$style, this.$color, this.$maxWidth, this.$modifier, this.$maxLines, this.$isCentered, bfm, AnonymousClass011.A01(this.$$changed | 1), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
