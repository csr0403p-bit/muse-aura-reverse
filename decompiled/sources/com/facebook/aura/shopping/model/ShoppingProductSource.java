package com.facebook.aura.shopping.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingProductSource extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String citationId;
    public final int index;
    public final String kind;
    public final String messageId;
    public final String presentationEventId;
    public final String presentationId;
    public final String widgetId;
    public final Integer wireIndex;

    public final class Companion {
        public final C9hr<ShoppingProductSource> serializer() {
            return ShoppingProductSource$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ShoppingProductSource(String str, String str2, int i, String str3, Integer num, String str4, String str5, String str6) {
        C7384Etj.A0Y(str4, 5);
        this.presentationId = str;
        this.presentationEventId = str2;
        this.index = i;
        this.widgetId = str3;
        this.wireIndex = num;
        this.kind = str4;
        this.messageId = str5;
        this.citationId = str6;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingProductSource shoppingProductSource, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || shoppingProductSource.presentationId != null) {
            c9j5.AAP(shoppingProductSource.presentationId, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || shoppingProductSource.presentationEventId != null) {
            c9j5.AAP(shoppingProductSource.presentationEventId, C07779iq.A01, c9iZ, 1);
        }
        c9j5.AAK(c9iZ, 2, shoppingProductSource.index);
        if (zAfR || shoppingProductSource.widgetId != null) {
            c9j5.AAP(shoppingProductSource.widgetId, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || shoppingProductSource.wireIndex != null) {
            c9j5.AAP(shoppingProductSource.wireIndex, C07729ii.A00, c9iZ, 4);
        }
        if (zAfR || !HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SHOPPING_RESULTS.equals(shoppingProductSource.kind)) {
            c9j5.AAV(shoppingProductSource.kind, c9iZ, 5);
        }
        if (zAfR || shoppingProductSource.messageId != null) {
            c9j5.AAP(shoppingProductSource.messageId, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || shoppingProductSource.citationId != null) {
            c9j5.AAP(shoppingProductSource.citationId, C07779iq.A01, c9iZ, 7);
        }
    }

    public final ShoppingProductSource copy(String str, String str2, int i, String str3, Integer num, String str4, String str5, String str6) {
        C7384Etj.A0Y(str4, 5);
        return new ShoppingProductSource(str, str2, i, str3, num, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingProductSource) {
                ShoppingProductSource shoppingProductSource = (ShoppingProductSource) obj;
                if (!C7384Etj.areEqual(this.presentationId, shoppingProductSource.presentationId) || !C7384Etj.areEqual(this.presentationEventId, shoppingProductSource.presentationEventId) || this.index != shoppingProductSource.index || !C7384Etj.areEqual(this.widgetId, shoppingProductSource.widgetId) || !C7384Etj.areEqual(this.wireIndex, shoppingProductSource.wireIndex) || !C7384Etj.areEqual(this.kind, shoppingProductSource.kind) || !C7384Etj.areEqual(this.messageId, shoppingProductSource.messageId) || !C7384Etj.areEqual(this.citationId, shoppingProductSource.citationId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingProductSource copy$default(ShoppingProductSource shoppingProductSource, String str, String str2, int i, String str3, Integer num, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shoppingProductSource.presentationId;
        }
        if ((i2 & 2) != 0) {
            str2 = shoppingProductSource.presentationEventId;
        }
        if ((i2 & 4) != 0) {
            i = shoppingProductSource.index;
        }
        if ((i2 & 8) != 0) {
            str3 = shoppingProductSource.widgetId;
        }
        if ((i2 & 16) != 0) {
            num = shoppingProductSource.wireIndex;
        }
        if ((i2 & 32) != 0) {
            str4 = shoppingProductSource.kind;
        }
        if ((i2 & 64) != 0) {
            str5 = shoppingProductSource.messageId;
        }
        if ((i2 & 128) != 0) {
            str6 = shoppingProductSource.citationId;
        }
        return shoppingProductSource.copy(str, str2, i, str3, num, str4, str5, str6);
    }

    public final String component1() {
        return this.presentationId;
    }

    public final String component2() {
        return this.presentationEventId;
    }

    public final int component3() {
        return this.index;
    }

    public final String component4() {
        return this.widgetId;
    }

    public final Integer component5() {
        return this.wireIndex;
    }

    public final String component6() {
        return this.kind;
    }

    public final String component7() {
        return this.messageId;
    }

    public final String component8() {
        return this.citationId;
    }

    public final String getCitationId() {
        return this.citationId;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getKind() {
        return this.kind;
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

    public final String getWidgetId() {
        return this.widgetId;
    }

    public final Integer getWireIndex() {
        return this.wireIndex;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.kind, ((((((((AnonymousClass006.A0G(this.presentationId) * 31) + AnonymousClass006.A0G(this.presentationEventId)) * 31) + this.index) * 31) + AnonymousClass006.A0G(this.widgetId)) * 31) + AnonymousClass006.A0D(this.wireIndex)) * 31) + AnonymousClass006.A0G(this.messageId)) * 31) + AnonymousClass005.A0H(this.citationId);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingProductSource(String str, String str2, int i, String str3, Integer num, String str4, String str5, String str6, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, i, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SHOPPING_RESULTS : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6);
    }

    public /* synthetic */ ShoppingProductSource(int i, String str, String str2, int i2, String str3, Integer num, String str4, String str5, String str6, C2hx c2hx) {
        if (4 != (i & 4)) {
            C9iI.A00(ShoppingProductSource$$serializer.descriptor, i, 4);
            throw F60.createAndThrow();
        }
        if ((i & 1) == 0) {
            this.presentationId = null;
        } else {
            this.presentationId = str;
        }
        if ((i & 2) == 0) {
            this.presentationEventId = null;
        } else {
            this.presentationEventId = str2;
        }
        this.index = i2;
        if ((i & 8) == 0) {
            this.widgetId = null;
        } else {
            this.widgetId = str3;
        }
        if ((i & 16) == 0) {
            this.wireIndex = null;
        } else {
            this.wireIndex = num;
        }
        if ((i & 32) == 0) {
            this.kind = HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SHOPPING_RESULTS;
        } else {
            this.kind = str4;
        }
        if ((i & 64) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str5;
        }
        if ((i & 128) == 0) {
            this.citationId = null;
        } else {
            this.citationId = str6;
        }
    }
}
