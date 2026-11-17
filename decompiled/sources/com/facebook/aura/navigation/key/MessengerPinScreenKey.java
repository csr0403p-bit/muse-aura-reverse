package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class MessengerPinScreenKey extends C06G implements AuraBottomSheetNavKey {
    public final String connectorId;
    public final String iconUrl;
    public final HatchSkillOAuthOrigin origin;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, MessengerPinScreenKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<MessengerPinScreenKey> serializer() {
            return MessengerPinScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessengerPinScreenKey) {
                MessengerPinScreenKey messengerPinScreenKey = (MessengerPinScreenKey) obj;
                if (!C7384Etj.areEqual(this.connectorId, messengerPinScreenKey.connectorId) || !C7384Etj.areEqual(this.iconUrl, messengerPinScreenKey.iconUrl) || this.origin != messengerPinScreenKey.origin) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MessengerPinScreenKey copy$default(MessengerPinScreenKey messengerPinScreenKey, String str, String str2, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messengerPinScreenKey.connectorId;
        }
        if ((i & 2) != 0) {
            str2 = messengerPinScreenKey.iconUrl;
        }
        if ((i & 4) != 0) {
            hatchSkillOAuthOrigin = messengerPinScreenKey.origin;
        }
        return messengerPinScreenKey.copy(str, str2, hatchSkillOAuthOrigin);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(MessengerPinScreenKey messengerPinScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(messengerPinScreenKey.connectorId, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || messengerPinScreenKey.iconUrl != null) {
            c9j5.AAP(messengerPinScreenKey.iconUrl, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || messengerPinScreenKey.origin != HatchSkillOAuthOrigin.BOT_SHEET) {
            c9j5.AAQ(messengerPinScreenKey.origin, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.connectorId;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final HatchSkillOAuthOrigin component3() {
        return this.origin;
    }

    public final String getConnectorId() {
        return this.connectorId;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final HatchSkillOAuthOrigin getOrigin() {
        return this.origin;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.origin, (AnonymousClass001.A0G(this.connectorId) + AnonymousClass006.A0G(this.iconUrl)) * 31);
    }

    public MessengerPinScreenKey(String str, String str2, HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        AnonymousClass003.A0v(str, hatchSkillOAuthOrigin);
        this.connectorId = str;
        this.iconUrl = str2;
        this.origin = hatchSkillOAuthOrigin;
    }

    public final MessengerPinScreenKey copy(String str, String str2, HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        AnonymousClass003.A0v(str, hatchSkillOAuthOrigin);
        return new MessengerPinScreenKey(str, str2, hatchSkillOAuthOrigin);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MessengerPinScreenKey(int i, String str, String str2, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(MessengerPinScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.connectorId = str;
        this.iconUrl = (i & 2) == 0 ? null : str2;
        if ((i & 4) == 0) {
            this.origin = HatchSkillOAuthOrigin.BOT_SHEET;
        } else {
            this.origin = hatchSkillOAuthOrigin;
        }
    }

    public /* synthetic */ MessengerPinScreenKey(String str, String str2, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2), (i & 4) != 0 ? HatchSkillOAuthOrigin.BOT_SHEET : hatchSkillOAuthOrigin);
    }
}
