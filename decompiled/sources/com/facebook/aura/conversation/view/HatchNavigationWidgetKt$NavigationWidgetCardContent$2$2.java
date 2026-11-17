package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import com.facebook.aura.model.NavigationWidgetData;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchNavigationWidgetKt$NavigationWidgetCardContent$2$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ NavigationWidgetData $data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNavigationWidgetKt$NavigationWidgetCardContent$2$2(NavigationWidgetData navigationWidgetData) {
        super(2);
        this.$data = navigationWidgetData;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            HatchNavigationWidgetKt.NavigationWidgetLeading(this.$data, null, bfm, NavigationWidgetData.$stable, 2);
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
