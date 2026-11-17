package com.facebook.aura.spaces.menu;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.C78N;
import X.G0U;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class ChatSpaceOpenerKt {
    public static final G0U<String, Unit> rememberChatSpaceOpener(BFM bfm, int i) {
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA1K = AnonymousClass003.A1K(bfm, auraNavigatorA0b, abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA1K || objAaT == C78N.A00) {
            objAaT = new ChatSpaceOpenerKt$rememberChatSpaceOpener$1$1(abstractC3358CGzA0h, auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        return (G0U) objAaT;
    }
}
