package com.facebook.aura.browsertask.conversation;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7BY;
import X.G0V;
import android.net.Uri;
import com.facebook.aura.browsertask.navigation.BrowserTaskNavigation;
import com.facebook.aura.deeplink.AuraDeeplinkAccessScope;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProvider;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProviderKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteSpec;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.LocalBrowserScreenKey;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class BrowserTaskDeeplinkRouteProvider implements AuraDeeplinkRouteProvider {
    public static final int $stable = 0;
    public static final BrowserTaskDeeplinkRouteProvider INSTANCE = new BrowserTaskDeeplinkRouteProvider();

    /* renamed from: com.facebook.aura.browsertask.conversation.BrowserTaskDeeplinkRouteProvider$routeSpecs$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            boolean zA1a = AnonymousClass002.A1a(uri, abstractC3358CGz);
            String str = (String) AbstractC0878AGe.A0A(zA1a ? 1 : 0, AuraDeeplinkRouteProviderKt.deeplinkRouteSegments(uri));
            if (str == null || C7BY.A0j(str)) {
                return null;
            }
            AuraNavKey auraNavKeyFocusTaskCard = new BrowserTaskNavigation(abstractC3358CGz).focusTaskCard(str);
            if (auraNavKeyFocusTaskCard == null) {
                auraNavKeyFocusTaskCard = new LocalBrowserScreenKey(str, false);
            }
            return new AuraDeeplinkRoute(auraNavKeyFocusTaskCard, LaunchFlag.BRING_TO_FRONT, ConversationTabScreenKey.INSTANCE);
        }
    }

    @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteProvider
    public List<AuraDeeplinkRouteSpec> routeSpecs() {
        return Collections.singletonList(new AuraDeeplinkRouteSpec(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_BROWSER_TASK, null, "hatch", AuraDeeplinkAccessScope.ALL_FAMILY, AuraDeeplinkAccessScope.NOT_APPLICABLE, false, null, AuraDeeplinkRouteSpec.AnonymousClass1.INSTANCE, AnonymousClass1.INSTANCE));
    }
}
