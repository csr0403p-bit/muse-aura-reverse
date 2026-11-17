package com.facebook.aura.model;

import X.AGH;
import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C10571Hud;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.model.HatchContentBlock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

@Serializable
/* loaded from: classes3.dex */
public final class HatchDeltaTranscript extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String agentId;
    public final String messageId;
    public final List<HatchTranscriptMessage> messages;
    public final HatchTranscriptMetadata metadata;
    public final Map<String, HatchPlaceholderEntry> placeholders;
    public final String replyToMessageId;
    public final String sessionId;
    public final HatchTranscriptStatus status;

    public final class Companion {
        public final HatchDeltaTranscript fromJson(JsonElement jsonElement) {
            Object objA0s;
            C7384Etj.A0Y(jsonElement, 0);
            if (!(jsonElement instanceof JsonObject)) {
                return null;
            }
            try {
                objA0s = parseTranscript((JsonObject) jsonElement);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            return (HatchDeltaTranscript) (objA0s instanceof C10571Hud ? null : objA0s);
        }

        private final HatchBlockStatus parseBlockStatus(String str) {
            return "streaming".equals(str) ? HatchBlockStatus.STREAMING : HatchBlockStatus.DONE;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private final HatchContentBlock parseContentBlock(JsonObject jsonObject) {
            String strOptString = JsonObjectExtensionsKt.optString(jsonObject, "type", "");
            switch (strOptString.hashCode()) {
                case -416479067:
                    if (strOptString.equals(HatchContentBlockSerializer.TYPE_TOOL_CALL)) {
                        return parseToolCallBlock(jsonObject);
                    }
                    return null;
                case -59919290:
                    if (strOptString.equals(HatchContentBlockSerializer.TYPE_SUB_AGENT)) {
                        return parseSubAgentBlock(jsonObject);
                    }
                    return null;
                case 3556653:
                    if (strOptString.equals("text")) {
                        String strOptString2 = JsonObjectExtensionsKt.optString(jsonObject, "id", "");
                        return new HatchContentBlock.TextBlock(strOptString2.length() > 0 ? strOptString2 : null, JsonObjectExtensionsKt.optString(jsonObject, "text", ""), parseBlockStatus(JsonObjectExtensionsKt.optString(jsonObject, AuraDeeplinkRouteMapper.STATUS_ROUTE, "done")));
                    }
                    return null;
                case 1224578480:
                    if (strOptString.equals(HatchContentBlockSerializer.TYPE_THINKING)) {
                        String strOptString3 = JsonObjectExtensionsKt.optString(jsonObject, "id", "");
                        return new HatchContentBlock.ThinkingBlock(strOptString3.length() > 0 ? strOptString3 : null, JsonObjectExtensionsKt.optString(jsonObject, "text", ""), parseBlockStatus(JsonObjectExtensionsKt.optString(jsonObject, AuraDeeplinkRouteMapper.STATUS_ROUTE, "done")));
                    }
                    return null;
                default:
                    return null;
            }
        }

        private final Map<String, String> parseStringMap(JsonObject jsonObject) {
            if (jsonObject == null) {
                return AGH.A0E();
            }
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Iterator<String> it = jsonObject.keySet().iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                String strA0u = C60O.A0u(jsonObject, strA0j);
                if (strA0u.length() > 0) {
                    linkedHashMapA0j.put(strA0j, strA0u);
                }
            }
            return linkedHashMapA0j;
        }

        private final HatchContentBlock.SubAgentBlock parseSubAgentBlock(JsonObject jsonObject) {
            ArrayList arrayListA0h;
            HatchContentBlock contentBlock;
            JsonArray jsonArrayOptJsonArray = JsonObjectExtensionsKt.optJsonArray(jsonObject, "content");
            if (jsonArrayOptJsonArray != null) {
                arrayListA0h = C3cG.A0h();
                Iterator<JsonElement> it = jsonArrayOptJsonArray.iterator();
                while (it.hasNext()) {
                    JsonObject jsonObjectA14 = C60Q.A14(it);
                    if (jsonObjectA14 != null && (contentBlock = parseContentBlock(jsonObjectA14)) != null) {
                        arrayListA0h.add(contentBlock);
                    }
                }
            } else {
                arrayListA0h = null;
            }
            String strA1Q = C60P.A1Q(jsonObject, "block_id", null);
            String strOptString = JsonObjectExtensionsKt.optString(jsonObject, "agent_id", "");
            String strOptString2 = JsonObjectExtensionsKt.optString(jsonObject, "tool_id", "");
            String strOptString3 = JsonObjectExtensionsKt.optString(jsonObject, AuraDeeplinkRouteMapper.STATUS_ROUTE, BrowserTaskPresentation.STATUS_RUNNING);
            String strA1Q2 = C60P.A1Q(jsonObject, "summary", null);
            String strA1Q3 = C60P.A1Q(jsonObject, "prompt_preview", null);
            long jOptLong = JsonObjectExtensionsKt.optLong(jsonObject, "started_at_ms", System.currentTimeMillis());
            long jOptLong2 = JsonObjectExtensionsKt.optLong(jsonObject, "completed_at_ms", 0L);
            return new HatchContentBlock.SubAgentBlock(strA1Q, strOptString, strOptString2, strOptString3, strA1Q2, strA1Q3, arrayListA0h, jOptLong, jOptLong2 > 0 ? Long.valueOf(jOptLong2) : null);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final com.facebook.aura.model.HatchContentBlock.ToolCallBlock parseToolCallBlock(kotlinx.serialization.json.JsonObject r24) {
            /*
                r23 = this;
                r2 = r24
                java.util.Set r0 = r2.keySet()
                X.AbstractC0878AGe.A0X(r0)
                java.lang.String r6 = "name"
                r3 = 0
                java.lang.String r10 = ""
                com.facebook.aura.json.JsonObjectExtensionsKt.optString(r2, r6, r10)
                java.lang.String r1 = r2.toString()
                r0 = 300(0x12c, float:4.2E-43)
                X.BQG.A17(r1, r0)
                java.lang.String r0 = "request"
                kotlinx.serialization.json.JsonObject r4 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonObject(r2, r0)
                java.lang.String r0 = "result"
                kotlinx.serialization.json.JsonObject r5 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonObject(r2, r0)
                java.lang.String r0 = "id"
                java.lang.String r13 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r2, r0, r10)
                java.lang.String r0 = "unknown"
                java.lang.String r14 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r2, r6, r0)
                java.lang.String r0 = "tool_type"
                java.lang.String r15 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r2, r0, r10)
                java.lang.String r9 = "label"
                if (r4 == 0) goto Lcb
                java.lang.String r12 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r4, r9, r10)
            L40:
                java.lang.String r8 = "summary"
                if (r4 == 0) goto Lc9
                java.lang.String r11 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r4, r8, r10)
                int r0 = r11.length()
                if (r0 <= 0) goto Lc9
            L4e:
                java.lang.String r7 = "detail"
                if (r4 == 0) goto Lc7
                java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r4, r7, r10)
                int r0 = r1.length()
                if (r0 <= 0) goto Lc7
            L5c:
                java.lang.String r6 = "metadata"
                if (r4 == 0) goto Lc5
                kotlinx.serialization.json.JsonObject r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonObject(r4, r6)
            L64:
                com.facebook.aura.model.HatchToolCallRequest r4 = new com.facebook.aura.model.HatchToolCallRequest
                r4.<init>(r12, r11, r1, r0)
                if (r5 == 0) goto L8f
                java.lang.String r1 = "success"
                r0 = 1
                boolean r17 = com.facebook.aura.json.JsonObjectExtensionsKt.optBoolean(r5, r1, r0)
                java.lang.String r18 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r5, r9, r10)
                java.lang.String r19 = X.C60P.A1Q(r5, r8, r3)
                java.lang.String r20 = X.C60P.A1Q(r5, r7, r3)
                kotlinx.serialization.json.JsonObject r21 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonObject(r5, r6)
                java.lang.String r0 = "error"
                java.lang.String r22 = X.C60P.A1Q(r5, r0, r3)
                com.facebook.aura.model.HatchToolCallResult r3 = new com.facebook.aura.model.HatchToolCallResult
                r16 = r3
                r16.<init>(r17, r18, r19, r20, r21, r22)
            L8f:
                java.lang.String r1 = "status"
                java.lang.String r0 = "completed"
                java.lang.String r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r2, r1, r0)
                r1 = r23
                com.facebook.aura.model.HatchToolCallStatus r18 = r1.parseToolCallStatus(r0)
                java.lang.String r5 = "started_at_ms"
                long r0 = java.lang.System.currentTimeMillis()
                long r19 = com.facebook.aura.json.JsonObjectExtensionsKt.optLong(r2, r5, r0)
                java.lang.String r5 = "completed_at_ms"
                r0 = 0
                long r6 = com.facebook.aura.json.JsonObjectExtensionsKt.optLong(r2, r5, r0)
                java.lang.Long r5 = java.lang.Long.valueOf(r6)
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                r21 = 0
                if (r2 <= 0) goto Lbb
                r21 = r5
            Lbb:
                com.facebook.aura.model.HatchContentBlock$ToolCallBlock r12 = new com.facebook.aura.model.HatchContentBlock$ToolCallBlock
                r17 = r3
                r16 = r4
                r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21)
                return r12
            Lc5:
                r0 = r3
                goto L64
            Lc7:
                r1 = r3
                goto L5c
            Lc9:
                r11 = r3
                goto L4e
            Lcb:
                r12 = r10
                goto L40
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.HatchDeltaTranscript.Companion.parseToolCallBlock(kotlinx.serialization.json.JsonObject):com.facebook.aura.model.HatchContentBlock$ToolCallBlock");
        }

        private final HatchToolCallStatus parseToolCallStatus(String str) {
            return BrowserTaskPresentation.STATUS_RUNNING.equals(str) ? HatchToolCallStatus.RUNNING : "errored".equals(str) ? HatchToolCallStatus.ERRORED : HatchToolCallStatus.COMPLETED;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0165  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final com.facebook.aura.model.HatchDeltaTranscript parseTranscript(kotlinx.serialization.json.JsonObject r29) {
            /*
                Method dump skipped, instructions count: 374
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.HatchDeltaTranscript.Companion.parseTranscript(kotlinx.serialization.json.JsonObject):com.facebook.aura.model.HatchDeltaTranscript");
        }

        private final HatchTranscriptMessage parseTranscriptMessage(JsonObject jsonObject) {
            HatchContentBlock contentBlock;
            String strOptString = JsonObjectExtensionsKt.optString(jsonObject, "id", "");
            if (strOptString.length() <= 0) {
                strOptString = JsonObjectExtensionsKt.optString(jsonObject, "message_id", "");
                if (strOptString.length() <= 0) {
                    return null;
                }
            }
            String strOptString2 = JsonObjectExtensionsKt.optString(jsonObject, "role", "");
            if (strOptString2.length() <= 0) {
                return null;
            }
            String strOptString3 = JsonObjectExtensionsKt.optString(jsonObject, AuraDeeplinkRouteMapper.STATUS_ROUTE, "done");
            long jOptLong = JsonObjectExtensionsKt.optLong(jsonObject, "created_at_ms", System.currentTimeMillis());
            JsonArray jsonArrayOptJsonArray = JsonObjectExtensionsKt.optJsonArray(jsonObject, "content");
            if (jsonArrayOptJsonArray == null) {
                return null;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<JsonElement> it = jsonArrayOptJsonArray.iterator();
            while (it.hasNext()) {
                JsonObject jsonObjectA14 = C60Q.A14(it);
                if (jsonObjectA14 != null && (contentBlock = parseContentBlock(jsonObjectA14)) != null) {
                    arrayListA0h.add(contentBlock);
                }
            }
            return new HatchTranscriptMessage(strOptString, strOptString2, arrayListA0h, strOptString3, jOptLong);
        }

        public final C9hr<HatchDeltaTranscript> serializer() {
            return HatchDeltaTranscript$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, AbstractC5321DgF.A02(num, HatchDeltaTranscript$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, HatchDeltaTranscript$Companion$$childSerializers$2.INSTANCE), null, AbstractC5321DgF.A02(num, HatchDeltaTranscript$Companion$$childSerializers$3.INSTANCE)};
    }

    public static /* synthetic */ HatchDeltaTranscript copy$default(HatchDeltaTranscript hatchDeltaTranscript, String str, String str2, String str3, String str4, HatchTranscriptStatus hatchTranscriptStatus, List list, HatchTranscriptMetadata hatchTranscriptMetadata, Map map, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        HatchTranscriptStatus hatchTranscriptStatus2 = hatchTranscriptStatus;
        List list2 = list;
        HatchTranscriptMetadata hatchTranscriptMetadata2 = hatchTranscriptMetadata;
        Map map2 = map;
        if ((i & 1) != 0) {
            str5 = hatchDeltaTranscript.messageId;
        }
        if ((i & 2) != 0) {
            str6 = hatchDeltaTranscript.agentId;
        }
        if ((i & 4) != 0) {
            str7 = hatchDeltaTranscript.sessionId;
        }
        if ((i & 8) != 0) {
            str8 = hatchDeltaTranscript.replyToMessageId;
        }
        if ((i & 16) != 0) {
            hatchTranscriptStatus2 = hatchDeltaTranscript.status;
        }
        if ((i & 32) != 0) {
            list2 = hatchDeltaTranscript.messages;
        }
        if ((i & 64) != 0) {
            hatchTranscriptMetadata2 = hatchDeltaTranscript.metadata;
        }
        if ((i & 128) != 0) {
            map2 = hatchDeltaTranscript.placeholders;
        }
        AnonymousClass003.A0y(hatchTranscriptStatus2, list2);
        return new HatchDeltaTranscript(str5, str6, str7, str8, hatchTranscriptStatus2, list2, hatchTranscriptMetadata2, map2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchDeltaTranscript) {
                HatchDeltaTranscript hatchDeltaTranscript = (HatchDeltaTranscript) obj;
                if (!C7384Etj.areEqual(this.messageId, hatchDeltaTranscript.messageId) || !C7384Etj.areEqual(this.agentId, hatchDeltaTranscript.agentId) || !C7384Etj.areEqual(this.sessionId, hatchDeltaTranscript.sessionId) || !C7384Etj.areEqual(this.replyToMessageId, hatchDeltaTranscript.replyToMessageId) || this.status != hatchDeltaTranscript.status || !C7384Etj.areEqual(this.messages, hatchDeltaTranscript.messages) || !C7384Etj.areEqual(this.metadata, hatchDeltaTranscript.metadata) || !C7384Etj.areEqual(this.placeholders, hatchDeltaTranscript.placeholders)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchDeltaTranscript hatchDeltaTranscript, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(hatchDeltaTranscript.messageId, c07779iq, c9iZ, 0);
        c9j5.AAP(hatchDeltaTranscript.agentId, c07779iq, c9iZ, 1);
        c9j5.AAP(hatchDeltaTranscript.sessionId, c07779iq, c9iZ, 2);
        c9j5.AAP(hatchDeltaTranscript.replyToMessageId, c07779iq, c9iZ, 3);
        c9j5.AAQ(hatchDeltaTranscript.status, C3cH.A15(f0cArr, 4), c9iZ, 4);
        c9j5.AAQ(hatchDeltaTranscript.messages, C3cH.A15(f0cArr, 5), c9iZ, 5);
        c9j5.AAP(hatchDeltaTranscript.metadata, HatchTranscriptMetadata$$serializer.INSTANCE, c9iZ, 6);
        c9j5.AAP(hatchDeltaTranscript.placeholders, C3cH.A15(f0cArr, 7), c9iZ, 7);
    }

    public final String component1() {
        return this.messageId;
    }

    public final String component2() {
        return this.agentId;
    }

    public final String component3() {
        return this.sessionId;
    }

    public final String component4() {
        return this.replyToMessageId;
    }

    public final HatchTranscriptStatus component5() {
        return this.status;
    }

    public final List<HatchTranscriptMessage> component6() {
        return this.messages;
    }

    public final HatchTranscriptMetadata component7() {
        return this.metadata;
    }

    public final Map<String, HatchPlaceholderEntry> component8() {
        return this.placeholders;
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final List<HatchTranscriptMessage> getMessages() {
        return this.messages;
    }

    public final HatchTranscriptMetadata getMetadata() {
        return this.metadata;
    }

    public final Map<String, HatchPlaceholderEntry> getPlaceholders() {
        return this.placeholders;
    }

    public final String getReplyToMessageId() {
        return this.replyToMessageId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final HatchTranscriptStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.messages, AnonymousClass005.A0F(this.status, ((((((AnonymousClass006.A0G(this.messageId) * 31) + AnonymousClass006.A0G(this.agentId)) * 31) + AnonymousClass006.A0G(this.sessionId)) * 31) + AnonymousClass006.A0G(this.replyToMessageId)) * 31)) + AnonymousClass006.A0D(this.metadata)) * 31) + C3cH.A02(this.placeholders);
    }

    public HatchDeltaTranscript(String str, String str2, String str3, String str4, HatchTranscriptStatus hatchTranscriptStatus, List<HatchTranscriptMessage> list, HatchTranscriptMetadata hatchTranscriptMetadata, Map<String, HatchPlaceholderEntry> map) {
        AnonymousClass003.A0y(hatchTranscriptStatus, list);
        this.messageId = str;
        this.agentId = str2;
        this.sessionId = str3;
        this.replyToMessageId = str4;
        this.status = hatchTranscriptStatus;
        this.messages = list;
        this.metadata = hatchTranscriptMetadata;
        this.placeholders = map;
    }

    public final HatchDeltaTranscript copy(String str, String str2, String str3, String str4, HatchTranscriptStatus hatchTranscriptStatus, List<HatchTranscriptMessage> list, HatchTranscriptMetadata hatchTranscriptMetadata, Map<String, HatchPlaceholderEntry> map) {
        AnonymousClass003.A0y(hatchTranscriptStatus, list);
        return new HatchDeltaTranscript(str, str2, str3, str4, hatchTranscriptStatus, list, hatchTranscriptMetadata, map);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchDeltaTranscript(int i, String str, String str2, String str3, String str4, HatchTranscriptStatus hatchTranscriptStatus, List list, HatchTranscriptMetadata hatchTranscriptMetadata, Map map, C2hx c2hx) {
        if (255 != (i & 255)) {
            C9iI.A00(HatchDeltaTranscript$$serializer.descriptor, i, 255);
            throw F60.createAndThrow();
        }
        this.messageId = str;
        this.agentId = str2;
        this.sessionId = str3;
        this.replyToMessageId = str4;
        this.status = hatchTranscriptStatus;
        this.messages = list;
        this.metadata = hatchTranscriptMetadata;
        this.placeholders = map;
    }
}
