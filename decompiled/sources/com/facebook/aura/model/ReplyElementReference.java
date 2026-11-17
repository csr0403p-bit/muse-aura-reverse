package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.gateway.HatchAgentPermissionsRepositoryKt;
import com.facebook.aura.gateway.MarketplaceMapWidgetJsonKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ReplyElementReference extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String citationId;
    public final String elementKey;
    public final String entityId;
    public final String entityKind;
    public final Integer index;
    public final String messageId;
    public final String type;
    public final String widgetId;

    public final class Companion {
        public final ReplyElementReference chip(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            if (C7BY.A0j(str) || C7BY.A0j(str2)) {
                return null;
            }
            return new ReplyElementReference("entity_chip", null, null, null, str, str2, null, null);
        }

        public final ReplyElementReference widget(String str, int i, String str2) {
            String str3 = str2;
            C7384Etj.A0Y(str, 0);
            if (C7BY.A0j(str) || i < 0) {
                return null;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (str2 == null || C7BY.A0j(str2)) {
                str3 = null;
            }
            return new ReplyElementReference("widget_element", str, numValueOf, str3, null, null, null, null);
        }

        public final C9hr<ReplyElementReference> serializer() {
            return ReplyElementReference$$serializer.INSTANCE;
        }

        public final ReplyElementReference entity(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            if (!C60O.A19("catalog_product", MarketplaceMapWidgetJsonKt.MARKETPLACE_LISTING_KIND).contains(str) || C7BY.A0j(str2)) {
                return null;
            }
            return new ReplyElementReference(HatchAgentPermissionsRepositoryKt.ALWAYS_SCOPE_ENTITY, null, null, null, null, null, str, str2);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ReplyElementReference(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7) {
        C7384Etj.A0Y(str, 0);
        this.type = str;
        this.widgetId = str2;
        this.index = num;
        this.elementKey = str3;
        this.messageId = str4;
        this.citationId = str5;
        this.entityKind = str6;
        this.entityId = str7;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ReplyElementReference replyElementReference, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(replyElementReference.type, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || replyElementReference.widgetId != null) {
            c9j5.AAP(replyElementReference.widgetId, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || replyElementReference.index != null) {
            c9j5.AAP(replyElementReference.index, C07729ii.A00, c9iZ, 2);
        }
        if (zAfR || replyElementReference.elementKey != null) {
            c9j5.AAP(replyElementReference.elementKey, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || replyElementReference.messageId != null) {
            c9j5.AAP(replyElementReference.messageId, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || replyElementReference.citationId != null) {
            c9j5.AAP(replyElementReference.citationId, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || replyElementReference.entityKind != null) {
            c9j5.AAP(replyElementReference.entityKind, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || replyElementReference.entityId != null) {
            c9j5.AAP(replyElementReference.entityId, C07779iq.A01, c9iZ, 7);
        }
    }

    public final ReplyElementReference copy(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7) {
        C7384Etj.A0Y(str, 0);
        return new ReplyElementReference(str, str2, num, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReplyElementReference) {
                ReplyElementReference replyElementReference = (ReplyElementReference) obj;
                if (!C7384Etj.areEqual(this.type, replyElementReference.type) || !C7384Etj.areEqual(this.widgetId, replyElementReference.widgetId) || !C7384Etj.areEqual(this.index, replyElementReference.index) || !C7384Etj.areEqual(this.elementKey, replyElementReference.elementKey) || !C7384Etj.areEqual(this.messageId, replyElementReference.messageId) || !C7384Etj.areEqual(this.citationId, replyElementReference.citationId) || !C7384Etj.areEqual(this.entityKind, replyElementReference.entityKind) || !C7384Etj.areEqual(this.entityId, replyElementReference.entityId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ReplyElementReference copy$default(ReplyElementReference replyElementReference, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replyElementReference.type;
        }
        if ((i & 2) != 0) {
            str2 = replyElementReference.widgetId;
        }
        if ((i & 4) != 0) {
            num = replyElementReference.index;
        }
        if ((i & 8) != 0) {
            str3 = replyElementReference.elementKey;
        }
        if ((i & 16) != 0) {
            str4 = replyElementReference.messageId;
        }
        if ((i & 32) != 0) {
            str5 = replyElementReference.citationId;
        }
        if ((i & 64) != 0) {
            str6 = replyElementReference.entityKind;
        }
        if ((i & 128) != 0) {
            str7 = replyElementReference.entityId;
        }
        return replyElementReference.copy(str, str2, num, str3, str4, str5, str6, str7);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.widgetId;
    }

    public final Integer component3() {
        return this.index;
    }

    public final String component4() {
        return this.elementKey;
    }

    public final String component5() {
        return this.messageId;
    }

    public final String component6() {
        return this.citationId;
    }

    public final String component7() {
        return this.entityKind;
    }

    public final String component8() {
        return this.entityId;
    }

    public final String getCitationId() {
        return this.citationId;
    }

    public final String getElementKey() {
        return this.elementKey;
    }

    public final String getEntityId() {
        return this.entityId;
    }

    public final String getEntityKind() {
        return this.entityKind;
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getType() {
        return this.type;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass001.A0G(this.type) + AnonymousClass006.A0G(this.widgetId)) * 31) + AnonymousClass006.A0D(this.index)) * 31) + AnonymousClass006.A0G(this.elementKey)) * 31) + AnonymousClass006.A0G(this.messageId)) * 31) + AnonymousClass006.A0G(this.citationId)) * 31) + AnonymousClass006.A0G(this.entityKind)) * 31) + AnonymousClass005.A0H(this.entityId);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ReplyElementReference(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7);
    }

    public /* synthetic */ ReplyElementReference(int i, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ReplyElementReference$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.widgetId = null;
        } else {
            this.widgetId = str2;
        }
        if ((i & 4) == 0) {
            this.index = null;
        } else {
            this.index = num;
        }
        if ((i & 8) == 0) {
            this.elementKey = null;
        } else {
            this.elementKey = str3;
        }
        if ((i & 16) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str4;
        }
        if ((i & 32) == 0) {
            this.citationId = null;
        } else {
            this.citationId = str5;
        }
        if ((i & 64) == 0) {
            this.entityKind = null;
        } else {
            this.entityKind = str6;
        }
        if ((i & 128) == 0) {
            this.entityId = null;
        } else {
            this.entityId = str7;
        }
    }
}
