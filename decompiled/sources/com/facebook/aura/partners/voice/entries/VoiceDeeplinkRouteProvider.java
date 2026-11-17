package com.facebook.aura.partners.voice.entries;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.G0V;
import android.net.Uri;
import com.facebook.aura.deeplink.AuraDeeplinkAccessScope;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProvider;
import com.facebook.aura.deeplink.AuraDeeplinkRouteSpec;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class VoiceDeeplinkRouteProvider implements AuraDeeplinkRouteProvider {
    public static final int $stable = 0;
    public static final VoiceDeeplinkRouteProvider INSTANCE = new VoiceDeeplinkRouteProvider();

    /* renamed from: com.facebook.aura.partners.voice.entries.VoiceDeeplinkRouteProvider$routeSpecs$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            return new AuraDeeplinkRoute(ConversationTabScreenKey.INSTANCE, LaunchFlag.REPLACE_BACKSTACK, null);
        }
    }

    @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteProvider
    public List<AuraDeeplinkRouteSpec> routeSpecs() {
        return Collections.singletonList(new AuraDeeplinkRouteSpec("voice", null, "hatch", AuraDeeplinkAccessScope.ALL_FAMILY, AuraDeeplinkAccessScope.NOT_APPLICABLE, false, null, AuraDeeplinkRouteSpec.AnonymousClass1.INSTANCE, AnonymousClass1.INSTANCE));
    }
}
