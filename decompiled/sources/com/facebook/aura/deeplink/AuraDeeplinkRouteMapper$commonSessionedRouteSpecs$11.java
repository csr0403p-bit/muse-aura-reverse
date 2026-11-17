package com.facebook.aura.deeplink;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C60P;
import X.C7384Etj;
import X.G0W;
import android.net.Uri;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import java.util.List;

/* loaded from: classes3.dex */
public final class AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$11 extends AbstractC7559F3s implements G0W<Uri, List<? extends String>, AbstractC3358CGz, AuraDeeplinkRoute> {
    public static final AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$11 INSTANCE = new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$11();

    public AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$11() {
        super(3);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AuraDeeplinkRoute invoke2(Uri uri, List<String> list, AbstractC3358CGz abstractC3358CGz) {
        if (C7384Etj.areEqual(AbstractC0878AGe.A0A(C60P.A1Y(uri, list) ? 1 : 0, list), "main")) {
            return new AuraDeeplinkRoute(ConversationTabScreenKey.INSTANCE, LaunchFlag.REPLACE_BACKSTACK, null);
        }
        ConversationScreenKey conversationScreenKeyHandleThreadDeeplink = HatchNotificationDeeplinkHandler.INSTANCE.handleThreadDeeplink(uri);
        if (conversationScreenKeyHandleThreadDeeplink == null) {
            return null;
        }
        return new AuraDeeplinkRoute(conversationScreenKeyHandleThreadDeeplink, LaunchFlag.NAVIGATE, ConversationTabScreenKey.INSTANCE);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, List<? extends String> list, AbstractC3358CGz abstractC3358CGz) {
        return invoke2(uri, (List<String>) list, abstractC3358CGz);
    }
}
