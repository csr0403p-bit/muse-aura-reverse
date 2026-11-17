package com.facebook.aura.subscription.view;

import X.AbstractC1798ArH;
import X.AnonymousClass006;
import X.C06H;
import X.C0981AMm;
import androidx.compose.runtime.MutableState;
import java.util.Map;

/* loaded from: classes4.dex */
public final class PaywallImpressionState {
    public static final int $stable = 8;
    public final Map<String, Boolean> loggedTierCards;
    public final String restoredUserSelectedId;
    public final MutableState screenLogged$delegate;

    public final Map<String, Boolean> getLoggedTierCards() {
        return this.loggedTierCards;
    }

    public final String getRestoredUserSelectedId() {
        return this.restoredUserSelectedId;
    }

    public final boolean getScreenLogged() {
        return MutableState.A0A(this.screenLogged$delegate);
    }

    public final void setScreenLogged(boolean z) {
        MutableState.A09(z, this.screenLogged$delegate);
    }

    public /* synthetic */ PaywallImpressionState(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public PaywallImpressionState(String str) {
        this.restoredUserSelectedId = str;
        this.screenLogged$delegate = AbstractC1798ArH.A08(false);
        this.loggedTierCards = new C0981AMm();
    }

    public PaywallImpressionState() {
        this(null);
    }
}
