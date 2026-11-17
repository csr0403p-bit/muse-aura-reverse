package com.facebook.aura.widgets;

import X.AbstractC059772w;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass722;
import X.BFM;
import X.C71L;
import X.C72k;
import X.C73O;
import X.C76B;
import X.C76C;
import X.G0W;
import com.facebook.aura.R;
import kotlin.Unit;

/* renamed from: com.facebook.aura.widgets.ComposableSingletons$WidgetComponentsKt$lambda$-891054843$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$WidgetComponentsKt$lambda$891054843$1 extends AbstractC7559F3s implements G0W<C71L, BFM, Integer, Unit> {
    public static final ComposableSingletons$WidgetComponentsKt$lambda$891054843$1 INSTANCE = new ComposableSingletons$WidgetComponentsKt$lambda$891054843$1();

    public ComposableSingletons$WidgetComponentsKt$lambda$891054843$1() {
        super(3);
    }

    public final void invoke(C71L c71l, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, c71l), bfm, i)) {
            bfm.Afo();
            return;
        }
        C76C c76c = C76B.A00;
        C72k.A00(bfm, AnonymousClass722.A01(c76c, 28.0f), WidgetComponentsKt.widgetPrimaryIconColor, 0, 0);
        WidgetTextKt.m3163WidgetTextb7W0Lw(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12117c), WidgetTextStyle.SUBTITLE, WidgetComponentsKt.widgetSecondaryTextColor, AnonymousClass003.A03(C73O.A00(bfm)) - 32.0f, AbstractC059772w.A03(c76c, 0.0f, 12.0f, 0.0f, 0.0f), 0, false, bfm, 48, 96);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C71L c71l, BFM bfm, Integer num) {
        invoke(c71l, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
