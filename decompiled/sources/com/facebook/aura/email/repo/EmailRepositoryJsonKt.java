package com.facebook.aura.email.repo;

import X.AGH;
import X.AnonymousClass006;
import com.facebook.aura.permissions.defaults.ConfidentialVmSettingsJsonKt;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes.dex */
public abstract class EmailRepositoryJsonKt {
    public static final List<String> DEFAULT_MODE_OPTIONS = Arrays.asList("ask", ConfidentialVmSettingsJsonKt.MODE_ALLOW, ConfidentialVmSettingsJsonKt.MODE_DENY);
    public static final String THREAD_REPLY_METHOD = "threads.reply";

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.email.model.EmailSenderNameException emailSenderNameRejection(java.lang.Throwable r5, boolean r6) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            boolean r0 = r5 instanceof com.facebook.aura.json.NetworkException
            r3 = 0
            if (r0 != 0) goto La
            return r3
        La:
            java.lang.String r0 = r5.getMessage()
            if (r0 == 0) goto L55
            java.lang.String r4 = X.AnonymousClass002.A0l(r0)
            if (r4 == 0) goto L55
            int r0 = r4.length()
            if (r0 <= 0) goto L55
            r1 = r5
            com.facebook.aura.json.NetworkException r1 = (com.facebook.aura.json.NetworkException) r1
            java.lang.String r0 = r1.errorCode
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L55
            java.lang.String r0 = "{"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L55
            com.facebook.aura.email.repo.EmailDaemonPath r0 = com.facebook.aura.email.repo.EmailDaemonPath.MAILBOX
            java.lang.String r2 = r0.getValue()
            int r1 = r1.httpResponseCode
            java.lang.String r0 = ": HTTP "
            java.lang.String r0 = X.FGI.A0S(r2, r0, r1)
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L55
        L43:
            com.facebook.aura.json.NetworkException r5 = (com.facebook.aura.json.NetworkException) r5
            java.lang.String r1 = r5.errorCode
            java.lang.String r0 = "emailNameNotAllowed"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L57
            com.facebook.aura.email.model.EmailSenderNameException r0 = new com.facebook.aura.email.model.EmailSenderNameException
            r0.<init>(r4)
            return r0
        L55:
            r4 = r3
            goto L43
        L57:
            if (r6 == 0) goto L67
            java.lang.String r0 = "invalidEmailRequest"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L73
            com.facebook.aura.email.model.EmailSenderNameException r0 = new com.facebook.aura.email.model.EmailSenderNameException
            r0.<init>(r4)
            return r0
        L67:
            int r1 = r5.httpResponseCode
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L73
            com.facebook.aura.email.model.EmailSenderNameException r0 = new com.facebook.aura.email.model.EmailSenderNameException
            r0.<init>(r3)
            return r0
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepositoryJsonKt.emailSenderNameRejection(java.lang.Throwable, boolean):com.facebook.aura.email.model.EmailSenderNameException");
    }

    public static final Map<String, JsonElement> stringFields(JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        if (jsonObject == null) {
            return AGH.A0E();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            JsonElement value = entry.getValue();
            if ((value instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) value) != null && jsonPrimitive.A01()) {
                AnonymousClass006.A1R(linkedHashMap, entry);
            }
        }
        return linkedHashMap;
    }

    public static final String stringOrNull(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        if ((jsonElement instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElement) != null && jsonPrimitive.A01()) {
            return jsonPrimitive.A00();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.email.model.EmailRestrictionNotice toRestrictionNotice(kotlinx.serialization.json.JsonObject r6) {
        /*
            java.lang.String r0 = "title"
            java.lang.Object r0 = r6.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            java.lang.String r5 = stringOrNull(r0)
            r4 = 0
            if (r5 == 0) goto L7a
            boolean r0 = X.C7BY.A0j(r5)
            if (r0 != 0) goto L7a
            java.lang.String r0 = "body"
            java.lang.Object r0 = r6.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            java.lang.String r3 = stringOrNull(r0)
            if (r3 == 0) goto L7a
            boolean r0 = X.C7BY.A0j(r3)
            if (r0 != 0) goto L7a
            java.lang.String r0 = "action"
            java.lang.Object r1 = r6.get(r0)
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto L77
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            if (r1 == 0) goto L78
            java.lang.String r0 = "label"
            java.lang.Object r0 = r1.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
        L3f:
            java.lang.String r2 = stringOrNull(r0)
            if (r2 == 0) goto L75
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 == 0) goto L4c
            r2 = r4
        L4c:
            if (r1 == 0) goto L73
            java.lang.String r0 = "kind"
            java.lang.Object r0 = r1.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
        L56:
            java.lang.String r1 = stringOrNull(r0)
            if (r1 == 0) goto L71
            com.facebook.aura.email.model.EmailRestrictionActionKind$Companion r0 = com.facebook.aura.email.model.EmailRestrictionActionKind.Companion
            com.facebook.aura.email.model.EmailRestrictionActionKind r0 = r0.fromWire(r1)
        L62:
            if (r2 == 0) goto L6b
            if (r0 == 0) goto L6b
            com.facebook.aura.email.model.EmailRestrictionAction r4 = new com.facebook.aura.email.model.EmailRestrictionAction
            r4.<init>(r2, r0)
        L6b:
            com.facebook.aura.email.model.EmailRestrictionNotice r0 = new com.facebook.aura.email.model.EmailRestrictionNotice
            r0.<init>(r5, r3, r4)
            return r0
        L71:
            r0 = r4
            goto L62
        L73:
            r0 = r4
            goto L56
        L75:
            r2 = r4
            goto L4c
        L77:
            r1 = r4
        L78:
            r0 = r4
            goto L3f
        L7a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepositoryJsonKt.toRestrictionNotice(kotlinx.serialization.json.JsonObject):com.facebook.aura.email.model.EmailRestrictionNotice");
    }
}
