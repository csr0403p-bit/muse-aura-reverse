package com.facebook.aura.widgets;

import X.AbstractC060773g;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass722;
import X.BFM;
import X.C1DG;
import X.C71K;
import X.C72F;
import X.C72N;
import X.C72d;
import X.C76B;
import X.C76C;
import X.G0W;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AskBarWidgetKt$AskBarAgent$1 extends AbstractC7559F3s implements G0W<C72d, BFM, Integer, Unit> {
    public final /* synthetic */ C71K $avatar;
    public final /* synthetic */ float $maxNameWidth;
    public final /* synthetic */ String $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskBarWidgetKt$AskBarAgent$1(C71K c71k, float f, String str) {
        super(3);
        this.$avatar = c71k;
        this.$maxNameWidth = f;
        this.$name = str;
    }

    public final void invoke(C72d c72d, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        C76C c76c = C76B.A00;
        float f = AskBarWidgetKt.ASK_BAR_CONTROL_SIZE;
        AbstractC060773g.A01(bfm, null, C72F.A00(AnonymousClass722.A01(c76c, f), f / 2.0f), this.$avatar, null, 0, 48, 16);
        if (C1DG.A01(this.$maxNameWidth, AskBarWidgetKt.ASK_BAR_MIN_NAME_WIDTH) >= 0) {
            bfm.AgE(920437472);
            C72N.A00(bfm, c76c, AskBarWidgetKt.ASK_BAR_SPACING);
            WidgetTextKt.m3163WidgetTextb7W0Lw(this.$name, WidgetTextStyle.HEADLINE, WidgetComponentsKt.widgetPrimaryTextColor, this.$maxNameWidth, null, 0, false, bfm, 48, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.AgE(920668112);
        }
        AnonymousClass001.A1D(bfm);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C72d c72d, BFM bfm, Integer num) {
        invoke(c72d, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
