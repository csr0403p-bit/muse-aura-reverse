package com.facebook.aura.marketplacemap;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class MarketplaceMapFullscreenScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String hostMessageId;
    public final String selectedListingId;
    public final String sessionId;
    public final String widgetId;

    public final class Companion {
        public final C9hr<MarketplaceMapFullscreenScreenKey> serializer() {
            return MarketplaceMapFullscreenScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_marketplacemap_marketplacemap(MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(marketplaceMapFullscreenScreenKey.hostMessageId, c9iZ, 0);
        c9j5.AAV(marketplaceMapFullscreenScreenKey.widgetId, c9iZ, 1);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(marketplaceMapFullscreenScreenKey.sessionId, c07779iq, c9iZ, 2);
        c9j5.AAP(marketplaceMapFullscreenScreenKey.selectedListingId, c07779iq, c9iZ, 3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarketplaceMapFullscreenScreenKey) {
                MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey = (MarketplaceMapFullscreenScreenKey) obj;
                if (!C7384Etj.areEqual(this.hostMessageId, marketplaceMapFullscreenScreenKey.hostMessageId) || !C7384Etj.areEqual(this.widgetId, marketplaceMapFullscreenScreenKey.widgetId) || !C7384Etj.areEqual(this.sessionId, marketplaceMapFullscreenScreenKey.sessionId) || !C7384Etj.areEqual(this.selectedListingId, marketplaceMapFullscreenScreenKey.selectedListingId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MarketplaceMapFullscreenScreenKey copy$default(MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketplaceMapFullscreenScreenKey.hostMessageId;
        }
        if ((i & 2) != 0) {
            str2 = marketplaceMapFullscreenScreenKey.widgetId;
        }
        if ((i & 4) != 0) {
            str3 = marketplaceMapFullscreenScreenKey.sessionId;
        }
        if ((i & 8) != 0) {
            str4 = marketplaceMapFullscreenScreenKey.selectedListingId;
        }
        AnonymousClass003.A0u(str, str2);
        return new MarketplaceMapFullscreenScreenKey(str, str2, str3, str4);
    }

    public final String component1() {
        return this.hostMessageId;
    }

    public final String component2() {
        return this.widgetId;
    }

    public final String component3() {
        return this.sessionId;
    }

    public final String component4() {
        return this.selectedListingId;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final String getSelectedListingId() {
        return this.selectedListingId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.widgetId, AnonymousClass001.A0G(this.hostMessageId)) + AnonymousClass006.A0G(this.sessionId)) * 31) + AnonymousClass005.A0H(this.selectedListingId);
    }

    public MarketplaceMapFullscreenScreenKey(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        this.hostMessageId = str;
        this.widgetId = str2;
        this.sessionId = str3;
        this.selectedListingId = str4;
    }

    public final MarketplaceMapFullscreenScreenKey copy(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        return new MarketplaceMapFullscreenScreenKey(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MarketplaceMapFullscreenScreenKey(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(MarketplaceMapFullscreenScreenKey$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.hostMessageId = str;
        this.widgetId = str2;
        this.sessionId = str3;
        this.selectedListingId = str4;
    }
}
