package com.facebook.aura.navigation.key;

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
/* loaded from: classes3.dex */
public final class ShoppingCartScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String messageId;
    public final String presentationId;
    public final String sessionId;
    public final String widgetId;

    public final class Companion {
        public final C9hr<ShoppingCartScreenKey> serializer() {
            return ShoppingCartScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(ShoppingCartScreenKey shoppingCartScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(shoppingCartScreenKey.messageId, c9iZ, 0);
        c9j5.AAV(shoppingCartScreenKey.presentationId, c9iZ, 1);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(shoppingCartScreenKey.widgetId, c07779iq, c9iZ, 2);
        if (c9j5.AfR() || shoppingCartScreenKey.sessionId != null) {
            c9j5.AAP(shoppingCartScreenKey.sessionId, c07779iq, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCartScreenKey) {
                ShoppingCartScreenKey shoppingCartScreenKey = (ShoppingCartScreenKey) obj;
                if (!C7384Etj.areEqual(this.messageId, shoppingCartScreenKey.messageId) || !C7384Etj.areEqual(this.presentationId, shoppingCartScreenKey.presentationId) || !C7384Etj.areEqual(this.widgetId, shoppingCartScreenKey.widgetId) || !C7384Etj.areEqual(this.sessionId, shoppingCartScreenKey.sessionId)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ShoppingCartScreenKey(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(ShoppingCartScreenKey$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.messageId = str;
        this.presentationId = str2;
        this.widgetId = str3;
        this.sessionId = (i & 8) == 0 ? null : str4;
    }

    public static /* synthetic */ ShoppingCartScreenKey copy$default(ShoppingCartScreenKey shoppingCartScreenKey, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCartScreenKey.messageId;
        }
        if ((i & 2) != 0) {
            str2 = shoppingCartScreenKey.presentationId;
        }
        if ((i & 4) != 0) {
            str3 = shoppingCartScreenKey.widgetId;
        }
        if ((i & 8) != 0) {
            str4 = shoppingCartScreenKey.sessionId;
        }
        AnonymousClass003.A0u(str, str2);
        return new ShoppingCartScreenKey(str, str2, str3, str4);
    }

    public final String component1() {
        return this.messageId;
    }

    public final String component2() {
        return this.presentationId;
    }

    public final String component3() {
        return this.widgetId;
    }

    public final String component4() {
        return this.sessionId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.presentationId, AnonymousClass001.A0G(this.messageId)) + AnonymousClass006.A0G(this.widgetId)) * 31) + AnonymousClass005.A0H(this.sessionId);
    }

    public final ShoppingCartScreenKey copy(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        return new ShoppingCartScreenKey(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public ShoppingCartScreenKey(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        this.messageId = str;
        this.presentationId = str2;
        this.widgetId = str3;
        this.sessionId = str4;
    }

    public /* synthetic */ ShoppingCartScreenKey(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, str2, str3, AnonymousClass006.A0u(i, str4));
    }
}
