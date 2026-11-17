package com.facebook.aura.model;

import X.AnonymousClass002;
import X.C7384Etj;
import X.C9oY;
import X.C9sU;
import X.F60;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.model.ReplyAttribution;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class ReplyElementJsonKt {
    public static final /* synthetic */ <T> T decodeReplyJson(JsonElement jsonElement) {
        try {
            C7384Etj.A0Q();
            throw F60.createAndThrow();
        } catch (SerializationException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.model.ReplyAttribution.Element parseReplyElement(kotlinx.serialization.json.JsonObject r8) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.ReplyElementJsonKt.parseReplyElement(kotlinx.serialization.json.JsonObject):com.facebook.aura.model.ReplyAttribution$Element");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.model.ReplyElementSupport parseReplyElementSupport(kotlinx.serialization.json.JsonObject r9) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.ReplyElementJsonKt.parseReplyElementSupport(kotlinx.serialization.json.JsonObject):com.facebook.aura.model.ReplyElementSupport");
    }

    public static final String parseReplyTargetType(JsonObject jsonObject) {
        Object objA01;
        C7384Etj.A0Y(jsonObject, 0);
        try {
            objA01 = HatchJsonKt.HatchJson.A01(ReplyTargetTypeJson$$serializer.INSTANCE, jsonObject);
        } catch (SerializationException unused) {
            objA01 = null;
        }
        ReplyTargetTypeJson replyTargetTypeJson = (ReplyTargetTypeJson) objA01;
        if (replyTargetTypeJson != null) {
            return replyTargetTypeJson.type;
        }
        return null;
    }

    public static final String replyString(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    public static final JsonObject replyTargetJson(ReplyAttribution.Element element) {
        C7384Etj.A0Y(element, 0);
        C9sU c9sU = HatchJsonKt.HatchJson;
        ReplyElementReference replyElementReference = element.reference;
        return C9oY.A05(c9sU.A03(new ReplyElementTargetJson(replyElementReference.type, replyElementReference.widgetId, null, replyElementReference.index, replyElementReference.elementKey, null, replyElementReference.messageId, null, replyElementReference.citationId, null, replyElementReference.entityKind, null, replyElementReference.entityId, null, null, null, null, null, null, null, null, null, null), ReplyElementTargetJson$$serializer.INSTANCE));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isValid(com.facebook.aura.model.ReplyElementReference r5) {
        /*
            java.lang.String r4 = r5.type
            int r1 = r4.hashCode()
            r0 = -1298275357(0xffffffffb29de3e3, float:-1.8380836E-8)
            r3 = 1
            r2 = 0
            if (r1 == r0) goto L6b
            r0 = 1281187624(0x4c5d5f28, float:5.8031264E7)
            if (r1 == r0) goto L44
            r0 = 1957534721(0x74ad9c01, float:1.1003802E32)
            if (r1 != r0) goto La0
            java.lang.String r0 = "widget_element"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto La0
            java.lang.String r0 = r5.widgetId
            if (r0 == 0) goto La0
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto La0
            java.lang.Integer r0 = r5.index
            if (r0 == 0) goto La0
            int r0 = r0.intValue()
            if (r0 < 0) goto La0
            java.lang.String r0 = r5.messageId
            if (r0 != 0) goto La0
            java.lang.String r0 = r5.citationId
        L39:
            if (r0 != 0) goto La0
            java.lang.String r0 = r5.entityKind
            if (r0 != 0) goto La0
            java.lang.String r0 = r5.entityId
        L41:
            if (r0 != 0) goto La0
            return r3
        L44:
            java.lang.String r0 = "entity_chip"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto La0
            java.lang.String r0 = r5.messageId
            if (r0 == 0) goto La0
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto La0
            java.lang.String r0 = r5.citationId
            if (r0 == 0) goto La0
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto La0
            java.lang.String r0 = r5.widgetId
            if (r0 != 0) goto La0
            java.lang.Integer r0 = r5.index
            if (r0 != 0) goto La0
            java.lang.String r0 = r5.elementKey
            goto L39
        L6b:
            java.lang.String r0 = "entity"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto La0
            java.lang.String r1 = "catalog_product"
            java.lang.String r0 = "marketplace_listing"
            java.util.Set r1 = X.C60O.A19(r1, r0)
            java.lang.String r0 = r5.entityKind
            boolean r0 = X.AbstractC0878AGe.A0k(r1, r0)
            if (r0 == 0) goto La0
            java.lang.String r0 = r5.entityId
            if (r0 == 0) goto La0
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto La0
            java.lang.String r0 = r5.widgetId
            if (r0 != 0) goto La0
            java.lang.Integer r0 = r5.index
            if (r0 != 0) goto La0
            java.lang.String r0 = r5.elementKey
            if (r0 != 0) goto La0
            java.lang.String r0 = r5.messageId
            if (r0 != 0) goto La0
            java.lang.String r0 = r5.citationId
            goto L41
        La0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.ReplyElementJsonKt.isValid(com.facebook.aura.model.ReplyElementReference):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056 A[PHI: r0
  0x0056: PHI (r0v10 java.lang.String) = (r0v12 java.lang.String), (r0v16 java.lang.String) binds: [B:26:0x0054, B:32:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.model.ReplyAttribution resolvedForSupport(com.facebook.aura.model.ReplyAttribution r7, com.facebook.aura.model.ReplyElementSupport r8) {
        /*
            X.AnonymousClass003.A0u(r7, r8)
            boolean r0 = r7 instanceof com.facebook.aura.model.ReplyAttribution.Context
            r2 = 0
            if (r0 == 0) goto L14
            r0 = r7
            com.facebook.aura.model.ReplyAttribution$Context r0 = (com.facebook.aura.model.ReplyAttribution.Context) r0
            java.lang.String r0 = r0.targetType
            boolean r0 = r8.supportsTargetType(r0)
            if (r0 == 0) goto L80
        L13:
            return r7
        L14:
            boolean r0 = r7 instanceof com.facebook.aura.model.ReplyAttribution.Product
            if (r0 == 0) goto L2c
            com.facebook.aura.model.ReplyAttribution$Product r7 = (com.facebook.aura.model.ReplyAttribution.Product) r7
            java.lang.String r3 = r7.presentationEventId
            if (r3 == 0) goto L80
            boolean r0 = X.C7BY.A0j(r3)
            if (r0 != 0) goto L80
            java.lang.String r1 = r7.name
            com.facebook.aura.model.ReplyAttribution$Presentation r0 = new com.facebook.aura.model.ReplyAttribution$Presentation
            r0.<init>(r3, r1, r2, r1)
            return r0
        L2c:
            boolean r0 = r7 instanceof com.facebook.aura.model.ReplyAttribution.Element
            if (r0 == 0) goto L13
            r1 = r7
            com.facebook.aura.model.ReplyAttribution$Element r1 = (com.facebook.aura.model.ReplyAttribution.Element) r1
            com.facebook.aura.model.ReplyElementReference r5 = r1.reference
            java.lang.String r6 = r5.type
            int r4 = r6.hashCode()
            r0 = -1298275357(0xffffffffb29de3e3, float:-1.8380836E-8)
            java.lang.String r3 = "widget_element"
            if (r4 == r0) goto L68
            r0 = 1281187624(0x4c5d5f28, float:5.8031264E7)
            if (r4 == r0) goto L5d
            r0 = 1957534721(0x74ad9c01, float:1.1003802E32)
            if (r4 != r0) goto L73
            boolean r0 = r6.equals(r3)
            if (r0 == 0) goto L73
            java.lang.String r0 = r1.widgetKind
        L54:
            if (r0 == 0) goto L73
        L56:
            boolean r0 = r8.supports(r5, r0)
            if (r0 == 0) goto L73
            return r7
        L5d:
            java.lang.String r0 = "entity_chip"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L73
            java.lang.String r0 = "product"
            goto L56
        L68:
            java.lang.String r0 = "entity"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L73
            java.lang.String r0 = r5.entityKind
            goto L54
        L73:
            com.facebook.aura.model.ReplyElementReference r0 = r1.reference
            java.lang.String r0 = r0.type
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L80
            com.facebook.aura.model.ReplyAttribution$Presentation r7 = r1.fallback
            return r7
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.ReplyElementJsonKt.resolvedForSupport(com.facebook.aura.model.ReplyAttribution, com.facebook.aura.model.ReplyElementSupport):com.facebook.aura.model.ReplyAttribution");
    }
}
