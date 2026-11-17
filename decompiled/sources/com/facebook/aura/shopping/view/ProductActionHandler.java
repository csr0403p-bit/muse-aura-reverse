package com.facebook.aura.shopping.view;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.C7384Etj;
import android.content.Context;
import com.facebook.aura.conversation.view.HatchUrlClickHandlerKt;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes4.dex */
public final class ProductActionHandler {
    public static final int $stable = 8;
    public final Context context;
    public final AuraNavigator navigator;
    public final AbstractC3358CGz userSession;

    public final void openUrl(String str) {
        C7384Etj.A0Y(str, 0);
        HatchUrlClickHandlerKt.handleUrlClick(this.userSession, str, this.context, this.navigator, null, null);
    }

    public ProductActionHandler(AbstractC3358CGz abstractC3358CGz, Context context, AuraNavigator auraNavigator) {
        AnonymousClass005.A0x(abstractC3358CGz, context, auraNavigator);
        this.userSession = abstractC3358CGz;
        this.context = context;
        this.navigator = auraNavigator;
    }
}
