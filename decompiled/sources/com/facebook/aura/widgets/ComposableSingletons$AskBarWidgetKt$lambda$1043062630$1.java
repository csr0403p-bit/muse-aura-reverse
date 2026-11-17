package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BFM;
import X.C73O;
import X.G0V;
import com.facebook.aura.R;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$AskBarWidgetKt$lambda$1043062630$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$AskBarWidgetKt$lambda$1043062630$1 INSTANCE = new ComposableSingletons$AskBarWidgetKt$lambda$1043062630$1();

    public ComposableSingletons$AskBarWidgetKt$lambda$1043062630$1() {
        super(2);
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            WidgetTextKt.m3163WidgetTextb7W0Lw(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12016e), WidgetTextStyle.SUBTITLE, WidgetComponentsKt.widgetSecondaryTextColor, AnonymousClass003.A03(C73O.A00(bfm)) - (AskBarWidgetKt.ASK_BAR_HORIZONTAL_PADDING * 2.0f), null, 0, true, bfm, 1572912, 48);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
