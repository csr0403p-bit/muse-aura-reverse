package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.C60R;
import X.C71J;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.tabs.FixedTab;

/* loaded from: classes3.dex */
public final class AskBarWidgetKt$AskBarContent$4$1 extends AbstractC7559F3s implements G0U<FixedTab, C71J> {
    public final /* synthetic */ Context $context;

    @Override // X.G0U
    public final C71J invoke(FixedTab fixedTab) {
        C7384Etj.A0Y(fixedTab, 0);
        String strDeeplinkPath = AskBarWidgetKt.deeplinkPath(fixedTab);
        if (strDeeplinkPath != null) {
            return WidgetComponentsKt.auraDeeplinkAction(this.$context, C60R.A0D(strDeeplinkPath), AskBarHomeScreenWidget.INSTANCE.getKind());
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskBarWidgetKt$AskBarContent$4$1(Context context) {
        super(1);
        this.$context = context;
    }
}
