package com.facebook.aura.messenger.skills.read.view;

import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.MessengerPinScreenKey;
import com.facebook.aura.skills.api.ConnectorReconnectDestinationProvider;

/* loaded from: classes3.dex */
public final class MessengerReconnectDestinationProvider implements ConnectorReconnectDestinationProvider {
    public static final int $stable = 0;
    public static final MessengerReconnectDestinationProvider INSTANCE = new MessengerReconnectDestinationProvider();

    @Override // com.facebook.aura.skills.api.ConnectorReconnectDestinationProvider
    public AuraNavKey destination(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        if (str.equals("messenger") && str2 == null) {
            return new MessengerPinScreenKey(str, null, HatchSkillOAuthOrigin.SETTINGS);
        }
        return null;
    }
}
