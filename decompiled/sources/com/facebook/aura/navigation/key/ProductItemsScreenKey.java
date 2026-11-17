package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
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
import com.facebook.aura.navigation.AuraNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ProductItemsScreenKey extends C06G implements AuraNavKey {
    public static final Companion Companion = new Companion();
    public final String messageId;
    public final String presentationEventId;
    public final String presentationId;
    public final String sessionId;

    public final class Companion {
        public final C9hr<ProductItemsScreenKey> serializer() {
            return ProductItemsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(ProductItemsScreenKey productItemsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(productItemsScreenKey.messageId, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || productItemsScreenKey.sessionId != null) {
            c9j5.AAP(productItemsScreenKey.sessionId, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || productItemsScreenKey.presentationId != null) {
            c9j5.AAP(productItemsScreenKey.presentationId, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || productItemsScreenKey.presentationEventId != null) {
            c9j5.AAP(productItemsScreenKey.presentationEventId, C07779iq.A01, c9iZ, 3);
        }
    }

    public final ProductItemsScreenKey copy(String str, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        return new ProductItemsScreenKey(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductItemsScreenKey) {
                ProductItemsScreenKey productItemsScreenKey = (ProductItemsScreenKey) obj;
                if (!C7384Etj.areEqual(this.messageId, productItemsScreenKey.messageId) || !C7384Etj.areEqual(this.sessionId, productItemsScreenKey.sessionId) || !C7384Etj.areEqual(this.presentationId, productItemsScreenKey.presentationId) || !C7384Etj.areEqual(this.presentationEventId, productItemsScreenKey.presentationEventId)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ProductItemsScreenKey(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ProductItemsScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.messageId = str;
        if ((i & 2) == 0) {
            this.sessionId = null;
        } else {
            this.sessionId = str2;
        }
        if ((i & 4) == 0) {
            this.presentationId = null;
        } else {
            this.presentationId = str3;
        }
        if ((i & 8) == 0) {
            this.presentationEventId = null;
        } else {
            this.presentationEventId = str4;
        }
    }

    public static /* synthetic */ ProductItemsScreenKey copy$default(ProductItemsScreenKey productItemsScreenKey, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productItemsScreenKey.messageId;
        }
        if ((i & 2) != 0) {
            str2 = productItemsScreenKey.sessionId;
        }
        if ((i & 4) != 0) {
            str3 = productItemsScreenKey.presentationId;
        }
        if ((i & 8) != 0) {
            str4 = productItemsScreenKey.presentationEventId;
        }
        C7384Etj.A0Y(str, 0);
        return new ProductItemsScreenKey(str, str2, str3, str4);
    }

    public final String component1() {
        return this.messageId;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final String component3() {
        return this.presentationId;
    }

    public final String component4() {
        return this.presentationEventId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getPresentationEventId() {
        return this.presentationEventId;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return ((((AnonymousClass001.A0G(this.messageId) + AnonymousClass006.A0G(this.sessionId)) * 31) + AnonymousClass006.A0G(this.presentationId)) * 31) + AnonymousClass005.A0H(this.presentationEventId);
    }

    public String toString() {
        return super.toString();
    }

    public ProductItemsScreenKey(String str, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        this.messageId = str;
        this.sessionId = str2;
        this.presentationId = str3;
        this.presentationEventId = str4;
    }

    public /* synthetic */ ProductItemsScreenKey(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
