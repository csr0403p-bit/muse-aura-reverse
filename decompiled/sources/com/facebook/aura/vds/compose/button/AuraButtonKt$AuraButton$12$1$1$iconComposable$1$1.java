package com.facebook.aura.vds.compose.button;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraButtonKt$AuraButton$12$1$1$iconComposable$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G0W<IconContext, BFM, Integer, Unit> $icon;
    public final /* synthetic */ AuraButtonSize $size;
    public final /* synthetic */ AuraLabelButtonStyle $style;
    public final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraButtonKt$AuraButton$12$1$1$iconComposable$1$1(G0W<? super IconContext, ? super BFM, ? super Integer, Unit> g0w, AuraLabelButtonStyle auraLabelButtonStyle, AuraButtonSize auraButtonSize, String str) {
        super(2);
        this.$icon = g0w;
        this.$style = auraLabelButtonStyle;
        this.$size = auraButtonSize;
        this.$text = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AnonymousClass001.A1G(new IconContext(this.$style, this.$size, this.$text), bfm, this.$icon, 0);
        } else {
            bfm.Afo();
        }
    }
}
