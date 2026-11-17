package com.facebook.aura.widgets;

import X.AbstractC060773g;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass722;
import X.BFM;
import X.C058571g;
import X.C72S;
import X.C72V;
import X.C76B;
import X.G0V;
import com.facebook.aura.tabs.FixedTab;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AskBarWidgetKt$AskBarTabRow$1$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ FixedTab $tab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskBarWidgetKt$AskBarTabRow$1$1$2(FixedTab fixedTab) {
        super(2);
        this.$tab = fixedTab;
    }

    public final void invoke(BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            bfm.Afo();
            return;
        }
        FixedTab fixedTab = this.$tab;
        AbstractC060773g.A01(bfm, new C72S(new C72V(WidgetComponentsKt.widgetPrimaryIconColor)), AnonymousClass722.A01(C76B.A00, AskBarWidgetKt.ASK_BAR_ICON_SIZE), new C058571g(fixedTab.getUnselectedIconRes()), AbstractC2271BQs.A01(bfm, fixedTab.getContentDescriptionResId()), 0, 32768, 8);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
