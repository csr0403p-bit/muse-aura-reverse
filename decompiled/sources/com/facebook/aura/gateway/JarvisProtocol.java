package com.facebook.aura.gateway;

import X.A3q;
import X.AGH;
import X.AIW;
import X.AbstractC0878AGe;
import X.AbstractC2159Azp;
import X.AbstractC3358CGz;
import X.AbstractC7535F0i;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.BQG;
import X.C06827l3;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0924AIa;
import X.C10571Hud;
import X.C1BN;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.C9286GCn;
import X.C9oY;
import X.C9sU;
import X.CFK;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HxE;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.bloks.data.AuraBloksDataProps;
import com.facebook.aura.browsertask.navigation.BrowserTaskUiCommandsKt;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.conversation.api.ConversationReplyTargetProviderKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.library.uicontrol.GoalUiCommandsKt;
import com.facebook.aura.maps.intf.NativeMaps;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.model.CanonicalEventEnvelope;
import com.facebook.aura.model.HatchAttachment;
import com.facebook.aura.model.HatchAttachmentFile;
import com.facebook.aura.model.HatchAttachmentPresentationKt;
import com.facebook.aura.model.HatchChatEvent;
import com.facebook.aura.model.HatchCitation;
import com.facebook.aura.model.HatchMessageKt;
import com.facebook.aura.model.HatchMessageResource;
import com.facebook.aura.model.HatchPresentationData;
import com.facebook.aura.model.HatchTextEntitySegment;
import com.facebook.aura.model.HatchTranscriptMetadata;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetData;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.model.IdeaGroupWidgetData;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.model.IdeaWidgetItemData;
import com.facebook.aura.model.ImageOptionsWidgetData;
import com.facebook.aura.model.LetterBodyPreview;
import com.facebook.aura.model.LetterBodyPreviewImage;
import com.facebook.aura.model.LetterBodyPreviewImageData;
import com.facebook.aura.model.LetterBriefingWidgetContent;
import com.facebook.aura.model.LetterBriefingWidgetData;
import com.facebook.aura.model.LetterWidgetData;
import com.facebook.aura.model.NavigationUiControl;
import com.facebook.aura.model.NavigationWidgetData;
import com.facebook.aura.model.ReplyAttribution;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.model.ReplyElementJsonKt;
import com.facebook.aura.model.ReplyElementSupport;
import com.facebook.aura.model.UnrenderablePresentationData;
import com.facebook.aura.model.VoiceOptionsWidgetData;
import com.facebook.aura.network.AuraUserAgent;
import com.facebook.aura.network.transport.HatchNoisePrivateAuth;
import com.facebook.aura.network.transport.HatchWebSocketConfig;
import com.facebook.aura.onboarding.OnboardingStateManagerKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.utils.HatchStringUtils;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public final class JarvisProtocol {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<String> _primarySessionId;
    public final BLG<ReplyElementSupport> _replyElementSupport;
    public final ConcurrentHashMap<String, String> activeMessageReplyMap;
    public String currentConnectionAttemptId;
    public String lastHttpRequestId;
    public G0V<? super String, ? super String, Unit> onFileUpdate;
    public final AtomicReference<Function0<Unit>> onSubscribeReady;
    public final ConcurrentHashMap<String, PendingSubscribe> pendingSubscribes;
    public final C1BN<String> primarySessionId;
    public final Object primarySubscribeLock;
    public final C1BN<ReplyElementSupport> replyElementSupport;
    public final Object seqCursorLock;
    public final ConcurrentHashMap<String, SessionCursors> sessionCursors;
    public final Object userLiveTranscriptLock;
    public final LinkedHashSet<String> userLiveTranscriptMessageIds;
    public final AbstractC3358CGz userSession;

    public final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.model.CanonicalEventEnvelope extractEnvelope(kotlinx.serialization.json.JsonObject r17) {
            /*
                r16 = this;
                r4 = 0
                r1 = r17
                X.C7384Etj.A0Y(r1, r4)
                java.lang.String r3 = "seq"
                boolean r0 = r1.containsKey(r3)
                r2 = 0
                if (r0 == 0) goto L7d
                java.lang.Long r6 = X.C60P.A1I(r1, r3)
            L13:
                java.lang.String r0 = "message_id"
                java.lang.String r3 = ""
                java.lang.String r7 = X.C60P.A1Q(r1, r0, r2)
                java.lang.String r0 = "reply_to_message_id"
                java.lang.String r8 = X.C60P.A1Q(r1, r0, r2)
                java.lang.String r0 = "stream_lane"
                java.lang.String r9 = X.C60P.A1Q(r1, r0, r2)
                java.lang.String r0 = "parent_agent_id"
                java.lang.String r10 = X.C60P.A1Q(r1, r0, r2)
                java.lang.String r0 = "subagent_id"
                java.lang.String r11 = X.C60P.A1Q(r1, r0, r2)
                java.lang.String r5 = "message_seq"
                boolean r0 = r1.containsKey(r5)
                if (r0 == 0) goto L7b
                java.lang.Long r12 = X.C60P.A1I(r1, r5)
            L3f:
                java.lang.String r5 = "chat_event_seq"
                boolean r0 = r1.containsKey(r5)
                if (r0 == 0) goto L79
                java.lang.Long r13 = X.C60P.A1I(r1, r5)
            L4b:
                java.lang.String r0 = "session_id"
                java.lang.String r14 = X.C60P.A1Q(r1, r0, r2)
                java.lang.String r0 = "is_thread"
                boolean r15 = com.facebook.aura.json.JsonObjectExtensionsKt.optBoolean(r1, r0, r4)
                java.lang.String r0 = "parent_message_id"
                java.lang.String r16 = X.C60P.A1Q(r1, r0, r2)
                java.lang.String r0 = "chat_context"
                kotlinx.serialization.json.JsonObject r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonObject(r1, r0)
                if (r1 == 0) goto L71
                java.lang.String r0 = "voice_call_id"
                java.lang.String r17 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r1, r0, r3)
                int r0 = r17.length()
                if (r0 > 0) goto L73
            L71:
                r17 = r2
            L73:
                com.facebook.aura.model.CanonicalEventEnvelope r5 = new com.facebook.aura.model.CanonicalEventEnvelope
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return r5
            L79:
                r13 = r2
                goto L4b
            L7b:
                r12 = r2
                goto L3f
            L7d:
                r6 = r2
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.Companion.extractEnvelope(kotlinx.serialization.json.JsonObject):com.facebook.aura.model.CanonicalEventEnvelope");
        }

        public final String extractMessageId(JsonObject jsonObject) {
            C7384Etj.A0Y(jsonObject, 0);
            return C60O.A0q(C60O.A0u(jsonObject, "message_id"));
        }

        public final String extractTextFromTranscript(JsonObject jsonObject) {
            JsonArray jsonArrayOptJsonArray;
            JsonArray jsonArrayOptJsonArray2;
            if (jsonObject == null || (jsonArrayOptJsonArray = JsonObjectExtensionsKt.optJsonArray(jsonObject, "messages")) == null) {
                return "";
            }
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<JsonElement> it = jsonArrayOptJsonArray.iterator();
            while (it.hasNext()) {
                JsonObject jsonObjectA14 = C60Q.A14(it);
                if (jsonObjectA14 != null && "assistant".equals(JsonObjectExtensionsKt.optString(jsonObjectA14, "role", "")) && (jsonArrayOptJsonArray2 = JsonObjectExtensionsKt.optJsonArray(jsonObjectA14, "content")) != null) {
                    Iterator<JsonElement> it2 = jsonArrayOptJsonArray2.iterator();
                    while (it2.hasNext()) {
                        JsonObject jsonObjectA142 = C60Q.A14(it2);
                        if (jsonObjectA142 != null && "text".equals(JsonObjectExtensionsKt.optString(jsonObjectA142, "type", ""))) {
                            C60Q.A1M(JsonObjectExtensionsKt.optString(jsonObjectA142, "text", ""), arrayListA0h);
                        }
                    }
                }
            }
            return AbstractC0878AGe.A0L(PairsDiscretionDocument.OWNER_SEPARATOR, "", "", arrayListA0h, null);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public interface HatchWidgetDataParseResult {

        public final class InvalidData implements HatchWidgetDataParseResult {
            public static final int $stable = 0;
            public static final InvalidData INSTANCE = new InvalidData();
        }

        public final class Parsed implements HatchWidgetDataParseResult {
            public static final int $stable = 8;
            public final HatchWidgetData data;

            public Parsed(HatchWidgetData hatchWidgetData) {
                C7384Etj.A0Y(hatchWidgetData, 0);
                this.data = hatchWidgetData;
            }

            public final HatchWidgetData getData() {
                return this.data;
            }
        }

        public final class UnsupportedKind implements HatchWidgetDataParseResult {
            public static final int $stable = 0;
            public static final UnsupportedKind INSTANCE = new UnsupportedKind();
        }
    }

    public interface HatchWidgetParseResult {

        public final class InvalidData implements HatchWidgetParseResult {
            public static final int $stable = 0;
            public final String kind;

            public InvalidData(String str) {
                C7384Etj.A0Y(str, 0);
                this.kind = str;
            }

            public final String getKind() {
                return this.kind;
            }
        }

        public final class Parsed implements HatchWidgetParseResult {
            public static final int $stable = HatchWidget.$stable;
            public final HatchWidget widget;

            public Parsed(HatchWidget hatchWidget) {
                C7384Etj.A0Y(hatchWidget, 0);
                this.widget = hatchWidget;
            }

            public final HatchWidget getWidget() {
                return this.widget;
            }
        }

        public final class UnsupportedKind implements HatchWidgetParseResult {
            public static final int $stable = 0;
            public static final UnsupportedKind INSTANCE = new UnsupportedKind();
        }
    }

    public final class PendingSubscribe extends C06G {
        public static final int $stable = 0;
        public final String connectionAttemptId;
        public final String requestId;
        public final long sentAtMs;
        public final String sessionId;

        public static /* synthetic */ PendingSubscribe copy$default(PendingSubscribe pendingSubscribe, String str, String str2, long j, String str3, int i, Object obj) {
            String str4 = str;
            String str5 = str2;
            long j2 = j;
            String str6 = str3;
            if ((i & 1) != 0) {
                str4 = pendingSubscribe.requestId;
            }
            if ((i & 2) != 0) {
                str5 = pendingSubscribe.connectionAttemptId;
            }
            if ((i & 4) != 0) {
                j2 = pendingSubscribe.sentAtMs;
            }
            if ((i & 8) != 0) {
                str6 = pendingSubscribe.sessionId;
            }
            AnonymousClass003.A0u(str4, str5);
            return new PendingSubscribe(str4, str5, j2, str6);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PendingSubscribe) {
                    PendingSubscribe pendingSubscribe = (PendingSubscribe) obj;
                    if (!C7384Etj.areEqual(this.requestId, pendingSubscribe.requestId) || !C7384Etj.areEqual(this.connectionAttemptId, pendingSubscribe.connectionAttemptId) || this.sentAtMs != pendingSubscribe.sentAtMs || !C7384Etj.areEqual(this.sessionId, pendingSubscribe.sessionId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.requestId;
        }

        public final String component2() {
            return this.connectionAttemptId;
        }

        public final long component3() {
            return this.sentAtMs;
        }

        public final String component4() {
            return this.sessionId;
        }

        public final String getConnectionAttemptId() {
            return this.connectionAttemptId;
        }

        public final String getRequestId() {
            return this.requestId;
        }

        public final long getSentAtMs() {
            return this.sentAtMs;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            return C60R.A00(this.sentAtMs, AnonymousClass005.A0I(this.connectionAttemptId, AnonymousClass001.A0G(this.requestId))) + AnonymousClass006.A0G(this.sessionId);
        }

        public /* synthetic */ PendingSubscribe(String str, String str2, long j, String str3, int i, C06H c06h) {
            this(str, str2, j, AnonymousClass006.A0u(i, str3));
        }

        public final PendingSubscribe copy(String str, String str2, long j, String str3) {
            AnonymousClass003.A0u(str, str2);
            return new PendingSubscribe(str, str2, j, str3);
        }

        public String toString() {
            return super.toString();
        }

        public PendingSubscribe(String str, String str2, long j, String str3) {
            AnonymousClass003.A0u(str, str2);
            this.requestId = str;
            this.connectionAttemptId = str2;
            this.sentAtMs = j;
            this.sessionId = str3;
        }
    }

    public final class SessionCursors {
        public volatile Long afterChatEventSeq;
        public volatile Long afterStreamSeq;

        public final Long getAfterChatEventSeq() {
            return this.afterChatEventSeq;
        }

        public final Long getAfterStreamSeq() {
            return this.afterStreamSeq;
        }

        public final void setAfterChatEventSeq(Long l) {
            this.afterChatEventSeq = l;
        }

        public final void setAfterStreamSeq(Long l) {
            this.afterStreamSeq = l;
        }
    }

    public JarvisProtocol(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.activeMessageReplyMap = C60O.A1C();
        this.userLiveTranscriptLock = C3cG.A0T();
        this.userLiveTranscriptMessageIds = C3cG.A0k();
        this.sessionCursors = C60O.A1C();
        this.seqCursorLock = C3cG.A0T();
        this.pendingSubscribes = C60O.A1C();
        this.primarySubscribeLock = C3cG.A0T();
        C9286GCn c9286GCnA14 = C3cG.A14(new ReplyElementSupport(AGH.A0E(), A3q.A00));
        this._replyElementSupport = c9286GCnA14;
        this.replyElementSupport = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._primarySessionId = c9286GCnA13;
        this.primarySessionId = C3cG.A11(c9286GCnA13);
        this.onSubscribeReady = new AtomicReference<>(null);
    }

    private final String firstNonEmptyJsonString(JsonObject jsonObject, String... strArr) {
        String strOptString;
        int length = strArr.length;
        int i = 0;
        while (true) {
            strOptString = null;
            if (i >= length) {
                break;
            }
            strOptString = JsonObjectExtensionsKt.optString(jsonObject, strArr[i], "");
            if (!C7BY.A0j(strOptString)) {
                break;
            }
            i++;
        }
        return strOptString;
    }

    private final HxE<Long, Long> getReplayCursor(SessionCursors sessionCursors) {
        if (sessionCursors == null) {
            return null;
        }
        Long l = sessionCursors.afterStreamSeq;
        Long l2 = sessionCursors.afterChatEventSeq;
        if (l == null || l2 == null) {
            return null;
        }
        return C3cG.A0r(l, l2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[PHI: r1
  0x003d: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v5 java.lang.String), (r1v6 java.lang.String), (r1v7 java.lang.String) binds: [B:5:0x0017, B:7:0x0023, B:9:0x002f, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Void logPresentationParseFailure(java.lang.String r7, kotlinx.serialization.json.JsonObject r8, java.lang.String r9) {
        /*
            r6 = this;
            r6 = 0
            if (r7 == 0) goto L85
            java.lang.String r0 = "kind"
            java.lang.String r3 = "<missing>"
            java.lang.String r4 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r8, r0, r3)
            java.lang.String r0 = "presentation_id"
            java.lang.String r2 = ""
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r8, r0, r2)
            int r0 = r1.length()
            if (r0 > 0) goto L3d
            java.lang.String r0 = "widget_id"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r8, r0, r2)
            int r0 = r1.length()
            if (r0 > 0) goto L3d
            java.lang.String r0 = "id"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r8, r0, r2)
            int r0 = r1.length()
            if (r0 > 0) goto L3d
            java.lang.String r0 = "message_id"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r8, r0, r2)
            int r0 = r1.length()
            if (r0 <= 0) goto L3e
        L3d:
            r3 = r1
        L3e:
            java.util.Set r0 = r8.keySet()
            java.util.List r5 = X.AbstractC0878AGe.A0X(r0)
            java.lang.String r0 = "data"
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 500(0x1f4, float:7.0E-43)
            java.lang.String r2 = X.BQG.A17(r1, r0)
            java.lang.StringBuilder r1 = X.C3cG.A0g(r7)
            java.lang.String r0 = " dropped: reason="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " kind="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " id="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " keys="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " data="
            java.lang.String r1 = X.C60P.A1M(r0, r2, r1)
            java.lang.String r0 = "JarvisProtocol"
            X.CFK.A06(r0, r1)
        L85:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.logPresentationParseFailure(java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.String):java.lang.Void");
    }

    private final HatchWidget parseHatchWidget(JsonObject jsonObject) {
        HatchWidgetParseResult.Parsed parsed;
        HatchWidgetParseResult hatchWidgetResult = parseHatchWidgetResult(jsonObject, null);
        if (!(hatchWidgetResult instanceof HatchWidgetParseResult.Parsed) || (parsed = (HatchWidgetParseResult.Parsed) hatchWidgetResult) == null) {
            return null;
        }
        return parsed.widget;
    }

    private final HatchWidget parseInlineWidget(JsonObject jsonObject) {
        HatchWidgetParseResult hatchWidgetResult = parseHatchWidgetResult(jsonObject, null);
        if (hatchWidgetResult instanceof HatchWidgetParseResult.Parsed) {
            return ((HatchWidgetParseResult.Parsed) hatchWidgetResult).widget;
        }
        HatchHtmlErrorCode hatchHtmlErrorCode = hatchWidgetResult instanceof HatchWidgetParseResult.UnsupportedKind ? HatchHtmlErrorCode.UNKNOWN_WIDGET_KIND : HatchHtmlErrorCode.INVALID_WIDGET_DATA;
        String strOptStringOrNull = JsonObjectExtensionsKt.optStringOrNull(jsonObject, "kind");
        if (strOptStringOrNull == null) {
            strOptStringOrNull = "unknown";
        }
        reportWidgetDropped(hatchHtmlErrorCode, FGI.A0M("inline widget kind=", strOptStringOrNull));
        return null;
    }

    private final NavigationUiControl parseNavigationUiControl(JsonObject jsonObject) {
        String strFirstNonEmptyJsonString;
        if (jsonObject == null || (strFirstNonEmptyJsonString = firstNonEmptyJsonString(jsonObject, "action")) == null) {
            return null;
        }
        String strFirstNonEmptyJsonString2 = firstNonEmptyJsonString(jsonObject, "target");
        if (strFirstNonEmptyJsonString2 == null) {
            strFirstNonEmptyJsonString2 = "";
        }
        String strFirstNonEmptyJsonString3 = firstNonEmptyJsonString(jsonObject, BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM);
        if (strFirstNonEmptyJsonString3 == null) {
            strFirstNonEmptyJsonString3 = "perform";
        }
        JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObject, AuraBloksDataProps.PARAMS);
        if (jsonObjectOptJsonObject == null) {
            jsonObjectOptJsonObject = C60O.A1G();
        }
        return new NavigationUiControl(strFirstNonEmptyJsonString, strFirstNonEmptyJsonString2, strFirstNonEmptyJsonString3, jsonObjectOptJsonObject);
    }

    private final HatchAttachment toWidgetAttachment(HatchWidget hatchWidget) {
        String str = hatchWidget.widgetId;
        String str2 = hatchWidget.replyToText;
        if (str2 == null && (str2 = hatchWidget.displayText) == null) {
            str2 = hatchWidget.kind;
        }
        return new HatchAttachment(str, null, null, "application/vnd.hatch.widget", str2, "widget", "", null, hatchWidget, null);
    }

    public final void acknowledgeReplyElementSupport(JsonObject jsonObject) {
        C7384Etj.A0Y(jsonObject, 0);
        ReplyElementSupport replyElementSupport = ReplyElementJsonKt.parseReplyElementSupport(jsonObject);
        if (replyElementSupport != null) {
            AnonymousClass002.A1I(this._replyElementSupport, replyElementSupport);
        }
    }

    public final String buildChatSendRequest(String str, String str2, List<HatchAttachment> list, Map<String, ? extends Object> map, String str3) {
        AnonymousClass003.A0u(str, str2);
        BQG.A17(str, 8);
        String str4 = this.currentConnectionAttemptId;
        if (str4 != null) {
            BQG.A17(str4, 8);
        }
        return JarvisProtocolJsonKt.buildChatStreamBody(str, str2, list, map, str3, this.currentConnectionAttemptId);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String buildSessionSubscribeParams(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            X.C7384Etj.A0Y(r3, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.gateway.JarvisProtocol$SessionCursors> r0 = r2.sessionCursors
            java.lang.Object r0 = r0.get(r3)
            com.facebook.aura.gateway.JarvisProtocol$SessionCursors r0 = (com.facebook.aura.gateway.JarvisProtocol.SessionCursors) r0
            if (r0 == 0) goto L25
            java.lang.Long r2 = r0.afterStreamSeq
            java.lang.Long r1 = r0.afterChatEventSeq
            if (r2 == 0) goto L25
            if (r1 == 0) goto L25
            r0 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L1c:
            kotlinx.serialization.json.JsonObject r0 = com.facebook.aura.gateway.JarvisProtocolJsonKt.chatSubscribeParams(r3, r2, r1, r0)
            java.lang.String r0 = r0.toString()
            return r0
        L25:
            r0 = 0
            r2 = r0
            r1 = r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.buildSessionSubscribeParams(java.lang.String):java.lang.String");
    }

    public final void clearSubscribeTracking(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.primarySubscribeLock) {
            this.pendingSubscribes.remove(str);
        }
    }

    public final void ensurePrimarySubscribePending(G0U<? super String, Boolean> g0u) {
        Object next;
        C7384Etj.A0Y(g0u, 0);
        synchronized (this.primarySubscribeLock) {
            if (this.onSubscribeReady.get() == null) {
                CFK.A05(JarvisProtocolKt.TAG, "chat.subscribe watchdog fired: action=skip reason=readiness_resolved");
            } else {
                Iterator itA1R = C60P.A1R(this.pendingSubscribes);
                while (true) {
                    if (!itA1R.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = itA1R.next();
                        if (((PendingSubscribe) next).sessionId == null) {
                            break;
                        }
                    }
                }
                PendingSubscribe pendingSubscribe = (PendingSubscribe) next;
                if (pendingSubscribe != null) {
                    CFK.A03(pendingSubscribe.requestId, JarvisProtocolKt.TAG, "chat.subscribe watchdog fired: action=wait pendingRequestId=%s");
                } else {
                    CFK.A05(JarvisProtocolKt.TAG, "chat.subscribe watchdog fired: action=send reason=no_pending_request");
                    sendSubscribe(g0u);
                }
            }
        }
    }

    public final PendingSubscribe getPendingSubscribe(String str) {
        C7384Etj.A0Y(str, 0);
        return this.pendingSubscribes.get(str);
    }

    public final void onSubscribeAcknowledged(String str, String str2, boolean z, boolean z2) {
        Function0<Unit> andSet;
        C7384Etj.A0Y(str, 0);
        synchronized (this.primarySubscribeLock) {
            PendingSubscribe pendingSubscribe = this.pendingSubscribes.get(str);
            andSet = null;
            if (z || (pendingSubscribe != null && pendingSubscribe.sessionId == null && !z2)) {
                if (str2 != null && !C7BY.A0j(str2)) {
                    setPrimarySessionId(str2);
                }
                andSet = this.onSubscribeReady.getAndSet(null);
            }
        }
        if (andSet != null) {
            andSet.invoke();
        }
    }

    public final void onSubscribeFailed(String str) {
        PendingSubscribe pendingSubscribeRemove;
        C7384Etj.A0Y(str, 0);
        synchronized (this.primarySubscribeLock) {
            pendingSubscribeRemove = this.pendingSubscribes.remove(str);
        }
        CFK.A02(str, Boolean.valueOf(AnonymousClass002.A1X(pendingSubscribeRemove)), JarvisProtocolKt.TAG, "chat.subscribe marked failed: requestId=%s tracked=%s; next watchdog may resend");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[PHI: r1
  0x0034: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v2 java.lang.String) binds: [B:7:0x0025, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.facebook.aura.model.HatchChatEvent> parseChatResponse(kotlinx.serialization.json.JsonObject r17) {
        /*
            r16 = this;
            r3 = 0
            r0 = r17
            X.C7384Etj.A0Y(r0, r3)
            kotlinx.serialization.json.JsonObject r4 = X.C60O.A1J(r0)
            if (r4 == 0) goto L52
            java.lang.String r0 = "response"
            java.lang.String r2 = ""
            java.lang.String r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r4, r0, r2)
            int r0 = r0.length()
            if (r0 == 0) goto L52
            java.lang.String r0 = "reply_to_message_id"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r4, r0, r2)
            int r0 = r1.length()
            r5 = 0
            if (r0 > 0) goto L34
            java.lang.String r0 = "message_id"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r4, r0, r2)
            int r0 = r1.length()
            r6 = r5
            if (r0 <= 0) goto L35
        L34:
            r6 = r1
        L35:
            com.facebook.aura.gateway.JarvisProtocol$Companion r0 = com.facebook.aura.gateway.JarvisProtocol.Companion
            com.facebook.aura.model.CanonicalEventEnvelope r16 = r0.extractEnvelope(r4)
            java.lang.String r7 = "completed"
            X.AGi r13 = X.C0881AGi.A00
            com.facebook.aura.model.HatchChatEvent$MessageDone r4 = new com.facebook.aura.model.HatchChatEvent$MessageDone
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r14 = r5
            r15 = r5
            r17 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.util.List r0 = java.util.Collections.singletonList(r4)
            return r0
        L52:
            X.AGi r0 = X.C0881AGi.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseChatResponse(kotlinx.serialization.json.JsonObject):java.util.List");
    }

    public final List<HatchChatEvent> parseEvent(JsonObject jsonObject) {
        C7384Etj.A0Y(jsonObject, 0);
        String strA0u = C60O.A0u(jsonObject, "event");
        return strA0u.startsWith("delta.") ? parseDeltaEvent(strA0u, jsonObject) : "message.user".equals(strA0u) ? parseMessageUser(jsonObject) : "message.assistant".equals(strA0u) ? parseMessageAssistant(jsonObject) : "widget.state_updated".equals(strA0u) ? parseWidgetStateUpdated(jsonObject) : "task.status".equals(strA0u) ? parseTaskStatus(jsonObject) : C0881AGi.A00;
    }

    public final List<HatchWidget> parseInlineWidgets(JsonObject jsonObject) {
        JsonObject jsonObject2;
        C7384Etj.A0Y(jsonObject, 0);
        JsonArray jsonArrayOptJsonArray = JsonObjectExtensionsKt.optJsonArray(jsonObject, "widgets");
        if (jsonArrayOptJsonArray == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it = jsonArrayOptJsonArray.iterator();
        while (it.hasNext()) {
            JsonElement next = it.next();
            if (!(next instanceof JsonObject) || (jsonObject2 = (JsonObject) next) == null) {
                reportWidgetDropped(HatchHtmlErrorCode.PARSE_DROPPED, "non-object widgets[] entry");
            } else {
                HatchWidget inlineWidget = parseInlineWidget(jsonObject2);
                if (inlineWidget != null) {
                    arrayList.add(inlineWidget);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.facebook.aura.model.HatchMessageResource> parseMessageResources$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(kotlinx.serialization.json.JsonObject r12) {
        /*
            r11 = this;
            r0 = 0
            X.C7384Etj.A0Y(r12, r0)
            java.lang.String r0 = "resources"
            kotlinx.serialization.json.JsonArray r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonArray(r12, r0)
            if (r0 != 0) goto Lf
            X.AGi r2 = X.C0881AGi.A00
        Le:
            return r2
        Lf:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r0.iterator()
        L18:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Le
            java.lang.Object r0 = r6.next()
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            kotlinx.serialization.json.JsonObject r5 = com.facebook.aura.json.JsonObjectExtensionsKt.asJsonObjectOrNull(r0)
            if (r5 == 0) goto L18
            java.lang.String r0 = "kind"
            java.lang.String r3 = ""
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r5, r0, r3)
            int r0 = r1.length()
            r4 = 0
            r8 = r4
            if (r0 <= 0) goto L3b
            r8 = r1
        L3b:
            if (r8 == 0) goto L18
            java.lang.String r0 = "uri"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r5, r0, r3)
            int r0 = r1.length()
            r9 = r4
            if (r0 <= 0) goto L4b
            r9 = r1
        L4b:
            if (r9 == 0) goto L18
            java.lang.String r0 = "label"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r5, r0, r3)
            int r0 = r1.length()
            r10 = r4
            if (r0 <= 0) goto L5b
            r10 = r1
        L5b:
            java.lang.String r0 = "metadata"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r5, r0, r3)
            int r0 = r1.length()
            if (r0 > 0) goto L68
            r1 = r4
        L68:
            if (r1 == 0) goto L75
            X.9sU r0 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L77
            kotlinx.serialization.json.JsonElement r0 = r0.A04(r1)     // Catch: java.lang.Throwable -> L77
            kotlinx.serialization.json.JsonObject r1 = com.facebook.aura.json.JsonObjectExtensionsKt.asJsonObjectOrNull(r0)     // Catch: java.lang.Throwable -> L77
            goto L7d
        L75:
            r1 = r4
            goto L84
        L77:
            r0 = move-exception
            X.Hud r1 = new X.Hud
            r1.<init>(r0)
        L7d:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L82
            r1 = r4
        L82:
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
        L84:
            if (r1 == 0) goto L92
            java.lang.String r0 = "domain"
            java.lang.String r11 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r1, r0, r3)
            int r0 = r11.length()
            if (r0 > 0) goto L93
        L92:
            r11 = r4
        L93:
            if (r1 == 0) goto La1
            java.lang.String r0 = "favicon_url"
            java.lang.String r12 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r1, r0, r3)
            int r0 = r12.length()
            if (r0 > 0) goto La2
        La1:
            r12 = r4
        La2:
            com.facebook.aura.model.HatchMessageResource r7 = new com.facebook.aura.model.HatchMessageResource
            r7.<init>(r8, r9, r10, r11, r12)
            r2.add(r7)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseMessageResources$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(kotlinx.serialization.json.JsonObject):java.util.List");
    }

    public final ReplyAttribution.Context parseReplyToTargetContext(JsonObject jsonObject, JsonObject jsonObject2) {
        C7384Etj.A0Y(jsonObject, 0);
        JsonObject replyToTarget = parseReplyToTarget(jsonObject, jsonObject2);
        if (replyToTarget != null) {
            return ConversationReplyTargetProviderKt.parseConversationReplyTarget(replyToTarget);
        }
        return null;
    }

    public final ReplyAttribution.Element parseReplyToTargetElement(JsonObject jsonObject, JsonObject jsonObject2) {
        C7384Etj.A0Y(jsonObject, 0);
        JsonObject replyToTarget = parseReplyToTarget(jsonObject, jsonObject2);
        if (replyToTarget != null) {
            return ReplyElementJsonKt.parseReplyElement(replyToTarget);
        }
        return null;
    }

    public final ReplyAttribution.FeedUnit parseReplyToTargetFeedUnit(JsonObject jsonObject, JsonObject jsonObject2) {
        C7384Etj.A0Y(jsonObject, 0);
        JsonObject replyToTarget = parseReplyToTarget(jsonObject, jsonObject2);
        if (replyToTarget != null) {
            String strA0J = C3cJ.A0J(JsonObjectExtensionsKt.optString(replyToTarget, "type", ""));
            if (strA0J.length() <= 0 || strA0J.equals(ReplyAttributionSerializer.TYPE_FEED_UNIT)) {
                JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(replyToTarget, ReplyAttributionSerializer.TYPE_FEED_UNIT);
                if (jsonObjectOptJsonObject == null) {
                    jsonObjectOptJsonObject = replyToTarget;
                }
                String strFirstNonEmptyJsonString = firstNonEmptyJsonString(jsonObjectOptJsonObject, "unit_id", "unitId");
                if (strFirstNonEmptyJsonString == null && (strFirstNonEmptyJsonString = firstNonEmptyJsonString(replyToTarget, "unit_id", "unitId")) == null) {
                    return null;
                }
                HatchStringUtils hatchStringUtils = HatchStringUtils.INSTANCE;
                String strFirstNonEmptyJsonString2 = firstNonEmptyJsonString(jsonObjectOptJsonObject, "title");
                if (strFirstNonEmptyJsonString2 == null) {
                    strFirstNonEmptyJsonString2 = "";
                }
                String strFirstNonEmptyJsonString3 = firstNonEmptyJsonString(jsonObjectOptJsonObject, "body_md", "bodyMarkdown");
                if (strFirstNonEmptyJsonString3 == null) {
                    strFirstNonEmptyJsonString3 = "";
                }
                String strFeedDiscussionPreview = hatchStringUtils.feedDiscussionPreview(strFirstNonEmptyJsonString2, strFirstNonEmptyJsonString3);
                String strFirstNonEmptyJsonString4 = firstNonEmptyJsonString(jsonObjectOptJsonObject, "kicker");
                if (strFirstNonEmptyJsonString4 == null) {
                    strFirstNonEmptyJsonString4 = "";
                }
                String strFirstNonEmptyJsonString5 = firstNonEmptyJsonString(jsonObjectOptJsonObject, "category");
                return new ReplyAttribution.FeedUnit(strFirstNonEmptyJsonString, strFeedDiscussionPreview, strFirstNonEmptyJsonString4, strFirstNonEmptyJsonString5 != null ? strFirstNonEmptyJsonString5 : "");
            }
        }
        return null;
    }

    public final ReplyAttribution.Goal parseReplyToTargetGoal(JsonObject jsonObject, JsonObject jsonObject2) {
        String strFirstNonEmptyJsonString;
        C7384Etj.A0Y(jsonObject, 0);
        JsonObject replyToTarget = parseReplyToTarget(jsonObject, jsonObject2);
        if (replyToTarget == null) {
            return null;
        }
        if (!C3cJ.A0J(JsonObjectExtensionsKt.optString(replyToTarget, "type", "")).equals(ReplyAttributionSerializer.TYPE_GOAL) || (strFirstNonEmptyJsonString = firstNonEmptyJsonString(replyToTarget, GoalUiCommandsKt.GOAL_ID_PARAM, "goalId")) == null) {
            return null;
        }
        String strFirstNonEmptyJsonString2 = firstNonEmptyJsonString(replyToTarget, "title");
        return new ReplyAttribution.Goal(strFirstNonEmptyJsonString, strFirstNonEmptyJsonString2 != null ? strFirstNonEmptyJsonString2 : "");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[PHI: r2
  0x0061: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v35 java.lang.String) binds: [B:14:0x0054, B:16:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.model.IdeaWidgetData parseReplyToTargetIdea(kotlinx.serialization.json.JsonObject r25, kotlinx.serialization.json.JsonObject r26) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseReplyToTargetIdea(kotlinx.serialization.json.JsonObject, kotlinx.serialization.json.JsonObject):com.facebook.aura.model.IdeaWidgetData");
    }

    public final ReplyAttribution.Message parseReplyToTargetMessage(JsonObject jsonObject, JsonObject jsonObject2) {
        String strFirstNonEmptyJsonString;
        C7384Etj.A0Y(jsonObject, 0);
        JsonObject replyToTarget = parseReplyToTarget(jsonObject, jsonObject2);
        if (replyToTarget != null) {
            String strA0J = C3cJ.A0J(JsonObjectExtensionsKt.optString(replyToTarget, "type", ""));
            if ((strA0J.length() <= 0 || strA0J.equals(ReplyAttributionSerializer.TYPE_MESSAGE)) && (strFirstNonEmptyJsonString = firstNonEmptyJsonString(replyToTarget, "message_id", "messageId")) != null) {
                String strOptString = JsonObjectExtensionsKt.optString(replyToTarget, "text", "");
                HatchStringUtils hatchStringUtils = HatchStringUtils.INSTANCE;
                String strA17 = BQG.A17(AnonymousClass002.A0l(AbstractC2159Azp.A0z(C06827l3.A02("\\[(image|file):[^]]*]").A03(hatchStringUtils.stripMarkdown(strOptString), ""), PairsDiscretionDocument.TERMINATOR, InviteCodeScratcherKt.CODE_SEPARATOR)), 100);
                return new ReplyAttribution.Message(strFirstNonEmptyJsonString, strA17.length() > 0 ? strA17 : null, hatchStringUtils.extractImageReference(strOptString));
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.model.ReplyAttribution.Presentation parseReplyToTargetPresentation(kotlinx.serialization.json.JsonObject r11, kotlinx.serialization.json.JsonObject r12) {
        /*
            r10 = this;
            r0 = 0
            X.C7384Etj.A0Y(r11, r0)
            kotlinx.serialization.json.JsonObject r2 = r10.parseReplyToTarget(r11, r12)
            r7 = 0
            if (r2 == 0) goto L38
            java.lang.String r0 = "type"
            java.lang.String r0 = X.C60O.A0u(r2, r0)
            java.lang.String r4 = X.C3cJ.A0J(r0)
            java.lang.String r3 = "presentation"
            kotlinx.serialization.json.JsonObject r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonObject(r2, r3)
            if (r0 == 0) goto L1e
            r2 = r0
        L1e:
            java.lang.String r1 = "presentation_event_id"
            java.lang.String r0 = "presentationEventId"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.lang.String r6 = r10.firstNonEmptyJsonString(r2, r0)
            if (r6 == 0) goto L38
            int r0 = r4.length()
            if (r0 <= 0) goto L39
            boolean r0 = r4.equals(r3)
            if (r0 != 0) goto L39
        L38:
            return r7
        L39:
            java.lang.String r1 = "reply_to_text"
            java.lang.String r0 = "replyToText"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.lang.String r8 = r10.firstNonEmptyJsonString(r2, r0)
            java.lang.String r9 = "display_text"
            if (r8 != 0) goto L53
            java.lang.String r0 = "displayText"
            java.lang.String[] r0 = new java.lang.String[]{r9, r0}
            java.lang.String r8 = r10.firstNonEmptyJsonString(r2, r0)
        L53:
            java.lang.String r5 = "kind"
            java.lang.String[] r0 = new java.lang.String[]{r5}
            java.lang.String r4 = r10.firstNonEmptyJsonString(r2, r0)
            java.lang.String r3 = "data"
            kotlinx.serialization.json.JsonObject r2 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonObject(r2, r3)
            if (r2 != 0) goto L69
            kotlinx.serialization.json.JsonObject r2 = X.C60O.A1G()
        L69:
            if (r4 == 0) goto La3
            X.2nw r1 = X.C60O.A1K()
            java.lang.String r0 = "presentation_id"
            X.C7qW.A06(r0, r6, r1)
            java.lang.String r0 = "message_id"
            X.C7qW.A06(r0, r6, r1)
            X.C7qW.A06(r5, r4, r1)
            r1.A01(r3, r2)
            if (r8 == 0) goto L84
            X.C7qW.A06(r9, r8, r1)
        L84:
            kotlinx.serialization.json.JsonObject r0 = r1.A00()
            com.facebook.aura.model.HatchWidgetPresentation r0 = r10.parseWidgetPresentation(r0, r7, r7)
        L8c:
            if (r8 != 0) goto L94
            if (r0 == 0) goto La1
            java.lang.String r8 = com.facebook.aura.model.HatchWidgetPresentationKt.replyPreviewText(r0)
        L94:
            if (r0 == 0) goto L9a
            java.lang.String r7 = com.facebook.aura.model.HatchWidgetPresentationKt.replyPreviewImageReference(r0)
        L9a:
            r1 = 0
            com.facebook.aura.model.ReplyAttribution$Presentation r0 = new com.facebook.aura.model.ReplyAttribution$Presentation
            r0.<init>(r6, r8, r7, r1)
            return r0
        La1:
            r8 = r7
            goto L9a
        La3:
            r0 = r7
            goto L8c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseReplyToTargetPresentation(kotlinx.serialization.json.JsonObject, kotlinx.serialization.json.JsonObject):com.facebook.aura.model.ReplyAttribution$Presentation");
    }

    public final ReplyAttribution.Product parseReplyToTargetProduct(JsonObject jsonObject, JsonObject jsonObject2) {
        ProductReplyTargetJson productReplyTargetJson;
        C7384Etj.A0Y(jsonObject, 0);
        JsonObject replyToTarget = parseReplyToTarget(jsonObject, jsonObject2);
        if (replyToTarget == null) {
            return null;
        }
        try {
            ProductReplyTargetJson productReplyTargetJson2 = (ProductReplyTargetJson) HatchJsonKt.HatchJson.A01(ProductReplyTargetJson$$serializer.INSTANCE, replyToTarget);
            String str = productReplyTargetJson2.type;
            String strA0l = (str == null && ((productReplyTargetJson = productReplyTargetJson2.product) == null || (str = productReplyTargetJson.type) == null)) ? null : AnonymousClass002.A0l(str);
            if (strA0l == null || !strA0l.equalsIgnoreCase("product")) {
                return null;
            }
            ProductReplyTargetJson productReplyTargetJson3 = productReplyTargetJson2.product;
            if (productReplyTargetJson3 != null) {
                productReplyTargetJson2 = productReplyTargetJson3;
            }
            return productReplyTargetJson2.toAttribution();
        } catch (SerializationException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122 A[PHI: r9
  0x0122: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v3 java.lang.String), (r9v4 java.lang.String) binds: [B:55:0x010a, B:57:0x0114, B:59:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.facebook.aura.model.HatchAttachment> parseUserMessageAttachments$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(kotlinx.serialization.json.JsonObject r25, kotlinx.serialization.json.JsonObject r26) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseUserMessageAttachments$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(kotlinx.serialization.json.JsonObject, kotlinx.serialization.json.JsonObject):java.util.List");
    }

    public final void setPrimarySessionId(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.seqCursorLock) {
            migratePrimaryPlaceholderCursorsLocked(str);
            AnonymousClass002.A1I(this._primarySessionId, str);
        }
    }

    /* renamed from: com.facebook.aura.gateway.JarvisProtocol$parseInlineDocumentWidgetData$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0h();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0h();
        }
    }

    private final void clearAllSubscribeTracking() {
        synchronized (this.primarySubscribeLock) {
            this.pendingSubscribes.clear();
            this.onSubscribeReady.set(null);
        }
    }

    private final boolean consumeUserLiveTranscript(String str) {
        boolean zRemove;
        synchronized (this.userLiveTranscriptLock) {
            zRemove = this.userLiveTranscriptMessageIds.remove(str);
        }
        return zRemove;
    }

    private final String cursorKeyForSessionLocked(String str) {
        return (str == null || C7BY.A0j(str)) ? primaryCursorKey() : str;
    }

    public static /* synthetic */ void getCurrentConnectionAttemptId$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway$annotations() {
    }

    private final boolean isUserLiveTranscript(String str) {
        boolean zContains;
        if (str != null) {
            synchronized (this.userLiveTranscriptLock) {
                zContains = this.userLiveTranscriptMessageIds.contains(str);
            }
            if (zContains) {
                return true;
            }
        }
        return false;
    }

    private final void migratePrimaryPlaceholderCursorsLocked(String str) {
        SessionCursors sessionCursorsRemove;
        SessionCursors sessionCursorsPutIfAbsent;
        if (JarvisProtocolKt.PRIMARY_CURSOR_KEY.equals(str) || (sessionCursorsRemove = this.sessionCursors.remove(JarvisProtocolKt.PRIMARY_CURSOR_KEY)) == null) {
            return;
        }
        ConcurrentHashMap<String, SessionCursors> concurrentHashMap = this.sessionCursors;
        SessionCursors sessionCursors = concurrentHashMap.get(str);
        if (sessionCursors == null && (sessionCursorsPutIfAbsent = concurrentHashMap.putIfAbsent(str, (sessionCursors = new SessionCursors()))) != null) {
            sessionCursors = sessionCursorsPutIfAbsent;
        }
        SessionCursors sessionCursors2 = sessionCursors;
        Long l = sessionCursorsRemove.afterStreamSeq;
        if (l != null && l.longValue() > C60P.A01(sessionCursors2.afterStreamSeq)) {
            sessionCursors2.afterStreamSeq = l;
        }
        Long l2 = sessionCursorsRemove.afterChatEventSeq;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            Long l3 = sessionCursors2.afterChatEventSeq;
            if (jLongValue > (l3 != null ? l3.longValue() : 0L)) {
                sessionCursors2.afterChatEventSeq = l2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f3, code lost:
    
        if (r1 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0228, code lost:
    
        if (com.facebook.aura.maps.intf.NativeMaps.INSTANCE.getRenderer() != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x022a, code lost:
    
        r6 = new com.facebook.aura.model.LocalMapWidgetData("", r1, r2);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.gateway.JarvisProtocol.HatchWidgetDataParseResult parseHatchWidgetDataResult(java.lang.String r18, kotlinx.serialization.json.JsonObject r19) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseHatchWidgetDataResult(java.lang.String, kotlinx.serialization.json.JsonObject):com.facebook.aura.gateway.JarvisProtocol$HatchWidgetDataParseResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r9 == null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[PHI: r3
  0x0032: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v2 java.lang.String) binds: [B:8:0x0024, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.JarvisProtocol.HatchWidgetParseResult parseHatchWidgetResult(kotlinx.serialization.json.JsonObject r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "kind"
            java.lang.String r2 = ""
            java.lang.String r4 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r11, r0, r2)
            int r0 = r4.length()
            if (r0 <= 0) goto L97
            java.lang.String r0 = "data"
            kotlinx.serialization.json.JsonObject r1 = r10.optJsonObjectOrDecodedString(r11, r0, r12)
            if (r1 != 0) goto L1a
            kotlinx.serialization.json.JsonObject r1 = X.C60O.A1G()
        L1a:
            java.lang.String r0 = "widget_id"
            java.lang.String r3 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r11, r0, r2)
            int r0 = r3.length()
            if (r0 > 0) goto L32
            java.lang.String r0 = "id"
            java.lang.String r3 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r11, r0, r2)
            int r0 = r3.length()
            if (r0 <= 0) goto L97
        L32:
            java.util.List r8 = r10.parseSupportedClients(r11)
            if (r8 != 0) goto L3c
            java.util.List r8 = r10.parseSupportedClients(r1)
        L3c:
            java.lang.String r9 = r10.presentationFallbackText(r4, r11, r1)
            com.facebook.aura.gateway.JarvisProtocol$HatchWidgetDataParseResult r1 = r10.parseHatchWidgetDataResult(r4, r1)
            boolean r0 = r1 instanceof com.facebook.aura.gateway.JarvisProtocol.HatchWidgetDataParseResult.Parsed
            if (r0 == 0) goto L7d
            com.facebook.aura.gateway.JarvisProtocol$HatchWidgetDataParseResult$Parsed r1 = (com.facebook.aura.gateway.JarvisProtocol.HatchWidgetDataParseResult.Parsed) r1
            com.facebook.aura.model.HatchWidgetData r5 = r1.data
        L4c:
            java.lang.String r1 = "display_text"
            java.lang.String r0 = "displayText"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.lang.String r6 = r10.firstNonEmptyJsonString(r11, r0)
            java.lang.String r1 = "reply_to_text"
            java.lang.String r0 = "replyToText"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.lang.String r7 = r10.firstNonEmptyJsonString(r11, r0)
            java.lang.String r0 = "state"
            kotlinx.serialization.json.JsonElement r0 = X.C60O.A1F(r0, r11)
            com.facebook.aura.model.JSONState r10 = com.facebook.aura.model.HatchWidgetPresentationKt.normalizeJSONState(r0)
            int r0 = com.facebook.aura.gateway.JarvisProtocol.HatchWidgetParseResult.Parsed.$stable
            com.facebook.aura.model.HatchWidget r2 = new com.facebook.aura.model.HatchWidget
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            com.facebook.aura.gateway.JarvisProtocol$HatchWidgetParseResult$Parsed r0 = new com.facebook.aura.gateway.JarvisProtocol$HatchWidgetParseResult$Parsed
            r0.<init>(r2)
        L7a:
            com.facebook.aura.gateway.JarvisProtocol$HatchWidgetParseResult r0 = (com.facebook.aura.gateway.JarvisProtocol.HatchWidgetParseResult) r0
            return r0
        L7d:
            com.facebook.aura.gateway.JarvisProtocol$HatchWidgetDataParseResult$InvalidData r0 = com.facebook.aura.gateway.JarvisProtocol.HatchWidgetDataParseResult.InvalidData.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L8d
            if (r9 != 0) goto L9a
            com.facebook.aura.gateway.JarvisProtocol$HatchWidgetParseResult$InvalidData r0 = new com.facebook.aura.gateway.JarvisProtocol$HatchWidgetParseResult$InvalidData
            r0.<init>(r4)
            goto L7a
        L8d:
            com.facebook.aura.gateway.JarvisProtocol$HatchWidgetDataParseResult$UnsupportedKind r0 = com.facebook.aura.gateway.JarvisProtocol.HatchWidgetDataParseResult.UnsupportedKind.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto Laa
            if (r9 != 0) goto La7
        L97:
            com.facebook.aura.gateway.JarvisProtocol$HatchWidgetParseResult$UnsupportedKind r0 = com.facebook.aura.gateway.JarvisProtocol.HatchWidgetParseResult.UnsupportedKind.INSTANCE
            goto L7a
        L9a:
            java.lang.String r1 = "widget kind="
            java.lang.String r0 = " failed data validation; showing fallback text"
            java.lang.String r1 = X.FGI.A0U(r1, r4, r0)
            java.lang.String r0 = "JarvisProtocol"
            X.CFK.A06(r0, r1)
        La7:
            com.facebook.aura.model.UnrenderableWidgetData r5 = com.facebook.aura.model.UnrenderableWidgetData.INSTANCE
            goto L4c
        Laa:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseHatchWidgetResult(kotlinx.serialization.json.JsonObject, java.lang.String):com.facebook.aura.gateway.JarvisProtocol$HatchWidgetParseResult");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private final IdeaGroupWidgetData parseIdeaGroupWidgetData(JsonObject jsonObject) {
        ?? A0h;
        JsonObject jsonObject2;
        IdeaWidgetData ideaWidgetData;
        JsonArray jsonArrayOptJsonArray = JsonObjectExtensionsKt.optJsonArray(jsonObject, "ideas");
        if (jsonArrayOptJsonArray != null) {
            A0h = C3cG.A0h();
            Iterator<JsonElement> it = jsonArrayOptJsonArray.iterator();
            while (it.hasNext()) {
                JsonElement jsonElementA11 = C60Q.A11(it);
                if ((jsonElementA11 instanceof JsonObject) && (jsonObject2 = (JsonObject) jsonElementA11) != null && (ideaWidgetData = parseIdeaWidgetData(jsonObject2)) != null) {
                    A0h.add(ideaWidgetData);
                }
            }
        } else {
            A0h = C0881AGi.A00;
        }
        if (A0h.isEmpty()) {
            return null;
        }
        JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObject, "navigation");
        return new IdeaGroupWidgetData(A0h, jsonObjectOptJsonObject != null ? parseNavigationWidgetData(jsonObjectOptJsonObject) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[PHI: r2
  0x0036: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v43 java.lang.String) binds: [B:8:0x0029, B:10:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0157 A[PHI: r3
  0x0157: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v17 java.lang.String) binds: [B:18:0x005a, B:20:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.model.IdeaWidgetData parseIdeaWidgetData(kotlinx.serialization.json.JsonObject r25) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseIdeaWidgetData(kotlinx.serialization.json.JsonObject):com.facebook.aura.model.IdeaWidgetData");
    }

    private final List<IdeaWidgetItemData> parseIdeaWidgetItems(JsonObject jsonObject) {
        String strFirstNonEmptyJsonString;
        String strFirstNonEmptyJsonString2;
        JsonArray jsonArrayOptJsonArray = JsonObjectExtensionsKt.optJsonArray(jsonObject, ConnectorOrderCheckoutKt.ITEMS_KEY);
        if (jsonArrayOptJsonArray == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<JsonElement> it = jsonArrayOptJsonArray.iterator();
        while (it.hasNext()) {
            JsonObject jsonObjectA14 = C60Q.A14(it);
            if (jsonObjectA14 != null && (strFirstNonEmptyJsonString = firstNonEmptyJsonString(jsonObjectA14, "id", "item_id", "itemId")) != null && (strFirstNonEmptyJsonString2 = firstNonEmptyJsonString(jsonObjectA14, "title")) != null) {
                arrayListA0h.add(new IdeaWidgetItemData(strFirstNonEmptyJsonString, firstNonEmptyJsonString(jsonObjectA14, "kind"), strFirstNonEmptyJsonString2, firstNonEmptyJsonString(jsonObjectA14, "summary"), firstNonEmptyJsonString(jsonObjectA14, "build_summary", "buildSummary"), firstNonEmptyJsonString(jsonObjectA14, "detail_description", "detailDescription"), firstNonEmptyJsonString(jsonObjectA14, "preview_image_url", "previewImageUrl"), firstNonEmptyJsonString(jsonObjectA14, AuraDeeplinkRouteMapper.STATUS_ROUTE)));
            }
        }
        return arrayListA0h;
    }

    private final ImageOptionsWidgetData parseImageOptionsWidgetData(JsonObject jsonObject) {
        String strFirstNonEmptyJsonString;
        JsonArray jsonArrayOptJsonArray = JsonObjectExtensionsKt.optJsonArray(jsonObject, "images");
        if (jsonArrayOptJsonArray == null) {
            return null;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<JsonElement> it = jsonArrayOptJsonArray.iterator();
        while (it.hasNext()) {
            JsonObject jsonObjectA14 = C60Q.A14(it);
            if (jsonObjectA14 != null && (strFirstNonEmptyJsonString = firstNonEmptyJsonString(jsonObjectA14, "path")) != null) {
                AnonymousClass002.A1J(strFirstNonEmptyJsonString, firstNonEmptyJsonString(jsonObjectA14, "image_id", "id"), arrayListA0h);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        ArrayList arrayListA0m = AnonymousClass002.A0m(arrayListA0h);
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            arrayListA0m.add(C60Q.A10(it2).first);
        }
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0h);
        Iterator it3 = arrayListA0h.iterator();
        while (it3.hasNext()) {
            arrayListA0m2.add(C60Q.A10(it3).second);
        }
        return new ImageOptionsWidgetData(arrayListA0m, arrayListA0m2, JsonObjectExtensionsKt.optBoolean(jsonObject, "multi_select", false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (X.AnonymousClass003.A1Y(r13) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        r1 = r14.invoke("", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        r0 = com.facebook.aura.gateway.JarvisProtocol.HatchWidgetDataParseResult.InvalidData.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.gateway.JarvisProtocol.HatchWidgetDataParseResult parseInlineDocumentWidgetData(java.lang.String r11, kotlinx.serialization.json.JsonObject r12, kotlin.jvm.functions.Function0<java.lang.Boolean> r13, X.G0V<? super java.lang.String, ? super java.lang.String, ? extends com.facebook.aura.model.HatchWidgetData> r14) {
        /*
            r10 = this;
            java.lang.String r0 = "html"
            java.lang.String r3 = ""
            java.lang.String r2 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r12, r0, r3)
            java.lang.String r0 = "path"
            java.lang.String r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optStringOrNull(r12, r0)
            r4 = 0
            if (r0 == 0) goto L1e
            java.lang.String r1 = X.AnonymousClass002.A0l(r0)
            if (r1 == 0) goto L1e
            int r0 = r1.length()
            if (r0 <= 0) goto L1e
            r4 = r1
        L1e:
            int r6 = r2.length()
            if (r6 != 0) goto L38
            boolean r0 = X.AnonymousClass003.A1Y(r13)
            if (r0 == 0) goto L7a
        L2a:
            java.lang.Object r1 = r14.invoke(r3, r4)
        L2e:
            com.facebook.aura.model.HatchWidgetData r1 = (com.facebook.aura.model.HatchWidgetData) r1
            com.facebook.aura.gateway.JarvisProtocol$HatchWidgetDataParseResult$Parsed r0 = new com.facebook.aura.gateway.JarvisProtocol$HatchWidgetDataParseResult$Parsed
            r0.<init>(r1)
        L35:
            com.facebook.aura.gateway.JarvisProtocol$HatchWidgetDataParseResult r0 = (com.facebook.aura.gateway.JarvisProtocol.HatchWidgetDataParseResult) r0
            return r0
        L38:
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r6 > r0) goto L41
            java.lang.Object r1 = r14.invoke(r2, r4)
            goto L2e
        L41:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            if (r4 != 0) goto L7d
            java.lang.String r0 = "none"
        L49:
            r5 = 0
            java.lang.Object[] r2 = new java.lang.Object[]{r11, r1, r0}
            java.lang.String r1 = "JarvisProtocol"
            java.lang.String r0 = "Dropping oversized inline %s document: %d chars, path=%s"
            X.CFK.A0H(r1, r0, r2)
            com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics r7 = com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics.INSTANCE
            com.facebook.aura.webview.diagnostics.HatchHtmlSurface r8 = com.facebook.aura.webview.diagnostics.HatchHtmlSurface.CHAT_WIDGET
            com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode r9 = com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode.CONTENT_TOO_LARGE
            if (r4 == 0) goto L5e
            r5 = 1
        L5e:
            java.lang.String r0 = "kind="
            java.lang.StringBuilder r1 = X.C3cI.A0x(r0, r11)
            java.lang.String r0 = " chars="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " hasPath="
            java.lang.String r10 = X.C60P.A1P(r0, r1, r5)
            r11 = 0
            r12 = r11
            r13 = r11
            r7.logError(r8, r9, r10, r11, r12, r13)
            if (r4 != 0) goto L2a
        L7a:
            com.facebook.aura.gateway.JarvisProtocol$HatchWidgetDataParseResult$InvalidData r0 = com.facebook.aura.gateway.JarvisProtocol.HatchWidgetDataParseResult.InvalidData.INSTANCE
            goto L35
        L7d:
            r0 = r4
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseInlineDocumentWidgetData(java.lang.String, kotlinx.serialization.json.JsonObject, kotlin.jvm.functions.Function0, X.G0V):com.facebook.aura.gateway.JarvisProtocol$HatchWidgetDataParseResult");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (X.AnonymousClass003.A1Y(r13) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r1 = r14.invoke("", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        r0 = com.facebook.aura.gateway.JarvisProtocol.HatchWidgetDataParseResult.InvalidData.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.facebook.aura.gateway.JarvisProtocol.HatchWidgetDataParseResult parseInlineDocumentWidgetData$default(com.facebook.aura.gateway.JarvisProtocol r10, java.lang.String r11, kotlinx.serialization.json.JsonObject r12, kotlin.jvm.functions.Function0 r13, X.G0V r14, int r15, java.lang.Object r16) {
        /*
            r0 = r15 & 4
            if (r0 == 0) goto L6
            com.facebook.aura.gateway.JarvisProtocol$parseInlineDocumentWidgetData$1 r13 = com.facebook.aura.gateway.JarvisProtocol.AnonymousClass1.INSTANCE
        L6:
            java.lang.String r0 = "html"
            java.lang.String r2 = ""
            java.lang.String r4 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r12, r0, r2)
            java.lang.String r0 = "path"
            java.lang.String r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optStringOrNull(r12, r0)
            r3 = 0
            if (r0 == 0) goto L24
            java.lang.String r1 = X.AnonymousClass002.A0l(r0)
            if (r1 == 0) goto L24
            int r0 = r1.length()
            if (r0 <= 0) goto L24
            r3 = r1
        L24:
            int r6 = r4.length()
            if (r6 != 0) goto L3e
            boolean r0 = X.AnonymousClass003.A1Y(r13)
            if (r0 == 0) goto L80
        L30:
            java.lang.Object r1 = r14.invoke(r2, r3)
        L34:
            com.facebook.aura.model.HatchWidgetData r1 = (com.facebook.aura.model.HatchWidgetData) r1
            com.facebook.aura.gateway.JarvisProtocol$HatchWidgetDataParseResult$Parsed r0 = new com.facebook.aura.gateway.JarvisProtocol$HatchWidgetDataParseResult$Parsed
            r0.<init>(r1)
        L3b:
            com.facebook.aura.gateway.JarvisProtocol$HatchWidgetDataParseResult r0 = (com.facebook.aura.gateway.JarvisProtocol.HatchWidgetDataParseResult) r0
            return r0
        L3e:
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r6 > r0) goto L47
            java.lang.Object r1 = r14.invoke(r4, r3)
            goto L34
        L47:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            if (r3 != 0) goto L83
            java.lang.String r0 = "none"
        L4f:
            r5 = 0
            java.lang.Object[] r4 = new java.lang.Object[]{r11, r1, r0}
            java.lang.String r1 = "JarvisProtocol"
            java.lang.String r0 = "Dropping oversized inline %s document: %d chars, path=%s"
            X.CFK.A0H(r1, r0, r4)
            com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics r7 = com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics.INSTANCE
            com.facebook.aura.webview.diagnostics.HatchHtmlSurface r8 = com.facebook.aura.webview.diagnostics.HatchHtmlSurface.CHAT_WIDGET
            com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode r9 = com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode.CONTENT_TOO_LARGE
            if (r3 == 0) goto L64
            r5 = 1
        L64:
            java.lang.String r0 = "kind="
            java.lang.StringBuilder r1 = X.C3cI.A0x(r0, r11)
            java.lang.String r0 = " chars="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " hasPath="
            java.lang.String r10 = X.C60P.A1P(r0, r1, r5)
            r11 = 0
            r12 = r11
            r13 = r11
            r7.logError(r8, r9, r10, r11, r12, r13)
            if (r3 != 0) goto L30
        L80:
            com.facebook.aura.gateway.JarvisProtocol$HatchWidgetDataParseResult$InvalidData r0 = com.facebook.aura.gateway.JarvisProtocol.HatchWidgetDataParseResult.InvalidData.INSTANCE
            goto L3b
        L83:
            r0 = r3
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseInlineDocumentWidgetData$default(com.facebook.aura.gateway.JarvisProtocol, java.lang.String, kotlinx.serialization.json.JsonObject, kotlin.jvm.functions.Function0, X.G0V, int, java.lang.Object):com.facebook.aura.gateway.JarvisProtocol$HatchWidgetDataParseResult");
    }

    private final LetterBodyPreview parseLetterBodyPreview(JsonObject jsonObject) {
        JsonObject jsonObjectOptJsonObject;
        String strFirstNonEmptyJsonString;
        JsonObject jsonObjectOptJsonObject2 = JsonObjectExtensionsKt.optJsonObject(jsonObject, "body_preview");
        if ((jsonObjectOptJsonObject2 == null && (jsonObjectOptJsonObject2 = JsonObjectExtensionsKt.optJsonObject(jsonObject, "bodyPreview")) == null) || !"Image".equals(AnonymousClass002.A0l(C60O.A0u(jsonObjectOptJsonObject2, "type"))) || (jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObjectOptJsonObject2, "data")) == null || (strFirstNonEmptyJsonString = firstNonEmptyJsonString(jsonObjectOptJsonObject, "path")) == null) {
            return null;
        }
        return new LetterBodyPreviewImage(new LetterBodyPreviewImageData(strFirstNonEmptyJsonString));
    }

    private final LetterWidgetData parseLetterWidgetData(JsonObject jsonObject) {
        JsonObject jsonObjectOptJsonObject;
        String strFirstNonEmptyJsonString;
        String strFirstNonEmptyJsonString2;
        JsonObject jsonObjectOptJsonObject2 = JsonObjectExtensionsKt.optJsonObject(jsonObject, "content");
        if (jsonObjectOptJsonObject2 == null || !"briefing".equals(AnonymousClass002.A0l(C60O.A0u(jsonObjectOptJsonObject2, "type"))) || (jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObjectOptJsonObject2, "data")) == null || (strFirstNonEmptyJsonString = firstNonEmptyJsonString(jsonObjectOptJsonObject, "id", "briefing_id", "briefingId")) == null || (strFirstNonEmptyJsonString2 = firstNonEmptyJsonString(jsonObjectOptJsonObject, "path")) == null) {
            return null;
        }
        return new LetterWidgetData(new LetterBriefingWidgetContent(new LetterBriefingWidgetData(strFirstNonEmptyJsonString, strFirstNonEmptyJsonString2)), firstNonEmptyJsonString(jsonObject, "emoji"), firstNonEmptyJsonString(jsonObject, "title"), firstNonEmptyJsonString(jsonObject, "byline", "by_line", "byLine"), parseLetterBodyPreview(jsonObject));
    }

    private final HatchMapScene parseLocalMapScene(JsonObject jsonObject) {
        Object objA0s;
        JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObject, "typed_data");
        if (jsonObjectOptJsonObject == null) {
            return null;
        }
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = LocalMapTypedDataJson.$stable;
            objA0s = (LocalMapTypedDataJson) c9sU.A01(LocalMapTypedDataJson$$serializer.INSTANCE, jsonObjectOptJsonObject);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        LocalMapTypedDataJson localMapTypedDataJson = (LocalMapTypedDataJson) objA0s;
        if (localMapTypedDataJson != null) {
            return LocalMapWidgetJsonKt.toDomain(localMapTypedDataJson);
        }
        return null;
    }

    private final HatchWidgetDataParseResult parseMarketplaceMapWidgetData(JsonObject jsonObject) {
        Object objA0s;
        MarketplaceMapDecodeResult domain;
        JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObject, "typed_data");
        if (jsonObjectOptJsonObject != null) {
            try {
                C9sU c9sU = HatchJsonKt.HatchJson;
                int i = MarketplaceMapTypedDataJson.$stable;
                objA0s = (MarketplaceMapTypedDataJson) c9sU.A01(MarketplaceMapTypedDataJson$$serializer.INSTANCE, jsonObjectOptJsonObject);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            MarketplaceMapTypedDataJson marketplaceMapTypedDataJson = (MarketplaceMapTypedDataJson) objA0s;
            if (marketplaceMapTypedDataJson != null && (domain = MarketplaceMapWidgetJsonKt.toDomain(marketplaceMapTypedDataJson)) != null) {
                int i2 = domain.skippedCount;
                if (i2 > 0) {
                    CFK.A06(JarvisProtocolKt.TAG, FGI.A0T("marketplace_map skipped=", " elementCount=", i2, domain.elementCount));
                }
                if (!domain.data.listings.isEmpty() && NativeMaps.INSTANCE.getRenderer() != null) {
                    return new HatchWidgetDataParseResult.Parsed(domain.data);
                }
            }
        }
        return HatchWidgetDataParseResult.InvalidData.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fc A[PHI: r34 r35
  0x01fc: PHI (r34v4 java.lang.String) = (r34v3 java.lang.String), (r34v6 java.lang.String) binds: [B:98:0x01f8, B:69:0x0154] A[DONT_GENERATE, DONT_INLINE]
  0x01fc: PHI (r35v3 java.lang.String) = (r35v2 java.lang.String), (r35v5 java.lang.String) binds: [B:98:0x01f8, B:69:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020f A[PHI: r10
  0x020f: PHI (r10v1 java.lang.Long) = (r10v0 java.lang.Long), (r10v6 java.lang.Long) binds: [B:38:0x00a4, B:40:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110 A[PHI: r0
  0x0110: PHI (r0v14 kotlinx.serialization.json.JsonObject) = (r0v13 kotlinx.serialization.json.JsonObject), (r0v31 kotlinx.serialization.json.JsonObject) binds: [B:51:0x0106, B:54:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013e A[PHI: r34
  0x013e: PHI (r34v7 java.lang.String) = (r34v2 java.lang.String), (r34v8 java.lang.String) binds: [B:95:0x01f2, B:65:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014a A[PHI: r34 r35
  0x014a: PHI (r34v6 java.lang.String) = (r34v3 java.lang.String), (r34v7 java.lang.String) binds: [B:98:0x01f8, B:67:0x0148] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r35v5 java.lang.String) = (r35v2 java.lang.String), (r35v6 java.lang.String) binds: [B:98:0x01f8, B:67:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f6 A[PHI: r34
  0x01f6: PHI (r34v3 java.lang.String) = (r34v2 java.lang.String), (r34v7 java.lang.String) binds: [B:95:0x01f2, B:67:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.facebook.aura.model.HatchChatEvent> parseMessageAssistant(kotlinx.serialization.json.JsonObject r49) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseMessageAssistant(kotlinx.serialization.json.JsonObject):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[PHI: r1
  0x0065: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v37 java.lang.String) binds: [B:15:0x0056, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a8 A[PHI: r1
  0x01a8: PHI (r1v20 com.facebook.aura.model.ReplyAttribution) = 
  (r1v19 com.facebook.aura.model.ReplyAttribution)
  (r1v24 com.facebook.aura.model.ReplyAttribution)
  (r1v25 com.facebook.aura.model.ReplyAttribution)
  (r1v26 com.facebook.aura.model.ReplyAttribution)
  (r1v27 com.facebook.aura.model.ReplyAttribution)
  (r1v28 com.facebook.aura.model.ReplyAttribution)
  (r1v29 com.facebook.aura.model.ReplyAttribution)
 binds: [B:39:0x010b, B:41:0x0111, B:54:0x0182, B:56:0x0188, B:58:0x018e, B:60:0x0194, B:62:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d2 A[PHI: r12
  0x01d2: PHI (r12v1 java.lang.Long) = (r12v0 java.lang.Long), (r12v3 java.lang.Long) binds: [B:20:0x0074, B:22:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.facebook.aura.model.HatchChatEvent> parseMessageUser(kotlinx.serialization.json.JsonObject r48) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseMessageUser(kotlinx.serialization.json.JsonObject):java.util.List");
    }

    private final NavigationWidgetData parseNavigationWidgetData(JsonObject jsonObject) {
        String strA04;
        Object objA0s;
        String str;
        JsonPrimitive jsonPrimitive;
        JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObject, "navigation");
        if (jsonObjectOptJsonObject != null) {
            jsonObject = jsonObjectOptJsonObject;
        }
        String strFirstNonEmptyJsonString = firstNonEmptyJsonString(jsonObject, "title");
        if (strFirstNonEmptyJsonString == null) {
            return null;
        }
        String strFirstNonEmptyJsonString2 = firstNonEmptyJsonString(jsonObject, "summary");
        if (strFirstNonEmptyJsonString2 == null) {
            strFirstNonEmptyJsonString2 = "";
        }
        String strFirstNonEmptyJsonString3 = firstNonEmptyJsonString(jsonObject, "icon");
        String strFirstNonEmptyJsonString4 = firstNonEmptyJsonString(jsonObject, "image_path", "imagePath");
        JsonObject jsonObjectOptJsonObject2 = JsonObjectExtensionsKt.optJsonObject(jsonObject, "ui_control");
        if (jsonObjectOptJsonObject2 == null) {
            jsonObjectOptJsonObject2 = JsonObjectExtensionsKt.optJsonObject(jsonObject, "uiControl");
        }
        NavigationUiControl navigationUiControl = parseNavigationUiControl(jsonObjectOptJsonObject2);
        JsonObject jsonObjectOptJsonObject3 = JsonObjectExtensionsKt.optJsonObject(jsonObject, "cta");
        JsonElement jsonElementA1F = jsonObjectOptJsonObject3 != null ? C60O.A1F("label", jsonObjectOptJsonObject3) : null;
        if (!(jsonElementA1F instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) jsonElementA1F) == null || !jsonPrimitive.A01() || (strA04 = C9oY.A04(jsonPrimitive)) == null || C7BY.A0j(strA04)) {
            strA04 = null;
        }
        try {
            objA0s = (NavigationWidgetSubtitleJson) HatchJsonKt.HatchJson.A01(NavigationWidgetSubtitleJson$$serializer.INSTANCE, jsonObject);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        NavigationWidgetSubtitleJson navigationWidgetSubtitleJson = (NavigationWidgetSubtitleJson) objA0s;
        if (navigationWidgetSubtitleJson == null || (str = navigationWidgetSubtitleJson.subtitle) == null || C7BY.A0j(str)) {
            str = null;
        }
        return new NavigationWidgetData(strFirstNonEmptyJsonString, strFirstNonEmptyJsonString2, strFirstNonEmptyJsonString3, strFirstNonEmptyJsonString4, navigationUiControl, strA04, str);
    }

    private final JsonObject parseReplyToTarget(JsonObject jsonObject, JsonObject jsonObject2) {
        JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObject, "reply_to_target");
        if (jsonObjectOptJsonObject != null) {
            return jsonObjectOptJsonObject;
        }
        JsonObject jsonObjectOptJsonObject2 = JsonObjectExtensionsKt.optJsonObject(jsonObject, "replyToTarget");
        if (jsonObjectOptJsonObject2 != null) {
            return jsonObjectOptJsonObject2;
        }
        if (jsonObject2 == null) {
            return null;
        }
        JsonObject jsonObjectOptJsonObject3 = JsonObjectExtensionsKt.optJsonObject(jsonObject2, "reply_to_target");
        return jsonObjectOptJsonObject3 == null ? JsonObjectExtensionsKt.optJsonObject(jsonObject2, "replyToTarget") : jsonObjectOptJsonObject3;
    }

    private final List<String> parseStringArray(Iterable<? extends JsonElement> iterable) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        if (iterable == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<? extends JsonElement> it = iterable.iterator();
        while (it.hasNext()) {
            JsonElement jsonElementA11 = C60Q.A11(it);
            if ((jsonElementA11 instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElementA11) != null && (strA04 = C9oY.A04(jsonPrimitive)) != null && !C7BY.A0j(strA04)) {
                arrayListA0h.add(strA04);
            }
        }
        return arrayListA0h;
    }

    private final List<String> parseSupportedClients(JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        String string;
        JsonArray jsonArrayOptJsonArray = JsonObjectExtensionsKt.optJsonArray(jsonObject, "supported_clients");
        if (jsonArrayOptJsonArray != null || (jsonArrayOptJsonArray = JsonObjectExtensionsKt.optJsonArray(jsonObject, "supportedClients")) != null) {
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<JsonElement> it = jsonArrayOptJsonArray.iterator();
            while (it.hasNext()) {
                JsonElement next = it.next();
                if ((next instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) next) != null && jsonPrimitive.A01() && (strA04 = C9oY.A04(jsonPrimitive)) != null && (string = C7BY.A0F(strA04).toString()) != null && string.length() > 0) {
                    arrayListA0h.add(string);
                }
            }
            if (!arrayListA0h.isEmpty()) {
                return arrayListA0h;
            }
        }
        return null;
    }

    public static final void parseUserMessageAttachments$addWidgetAttachment(Set<String> set, List<HatchAttachment> list, JarvisProtocol jarvisProtocol, HatchWidget hatchWidget) {
        if (set.add(hatchWidget.widgetId)) {
            list.add(jarvisProtocol.toWidgetAttachment(hatchWidget));
        }
    }

    private final VoiceOptionsWidgetData parseVoiceOptionsWidgetData(JsonObject jsonObject) {
        Object objA0s;
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = VoiceOptionsWidgetDataJson.$stable;
            objA0s = (VoiceOptionsWidgetDataJson) c9sU.A01(VoiceOptionsWidgetDataJson$$serializer.INSTANCE, jsonObject);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        VoiceOptionsWidgetDataJson voiceOptionsWidgetDataJson = (VoiceOptionsWidgetDataJson) objA0s;
        if (voiceOptionsWidgetDataJson != null) {
            return VoiceOptionsWidgetJsonKt.toDomain(voiceOptionsWidgetDataJson);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.model.HatchWidgetPresentation parseWidgetPresentation(kotlinx.serialization.json.JsonObject r27, java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseWidgetPresentation(kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.String):com.facebook.aura.model.HatchWidgetPresentation");
    }

    public static /* synthetic */ HatchWidgetPresentation parseWidgetPresentation$default(JarvisProtocol jarvisProtocol, JsonObject jsonObject, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return jarvisProtocol.parseWidgetPresentation(jsonObject, str, str2);
    }

    private final String presentationFallbackText(String str, JsonObject jsonObject, JsonObject jsonObject2) {
        String strA0l;
        String strFirstNonEmptyJsonString = firstNonEmptyJsonString(jsonObject, "fallback_text", "fallbackText");
        if ((strFirstNonEmptyJsonString == null && (strFirstNonEmptyJsonString = firstNonEmptyJsonString(jsonObject2, "fallback_text", "fallbackText")) == null && (!JarvisProtocolKt.DISPLAY_TEXT_FALLBACK_KINDS.contains(str) || ((strFirstNonEmptyJsonString = firstNonEmptyJsonString(jsonObject, "display_text", "displayText")) == null && (strFirstNonEmptyJsonString = firstNonEmptyJsonString(jsonObject2, "display_text", "displayText")) == null))) || (strA0l = AnonymousClass002.A0l(strFirstNonEmptyJsonString)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    private final String primaryCursorKey() {
        String value = this._primarySessionId.getValue();
        return value == null ? JarvisProtocolKt.PRIMARY_CURSOR_KEY : value;
    }

    private final void rememberUserLiveTranscript(String str) {
        String str2;
        synchronized (this.userLiveTranscriptLock) {
            this.userLiveTranscriptMessageIds.add(str);
            while (this.userLiveTranscriptMessageIds.size() > 256 && (str2 = (String) AbstractC0878AGe.A0C(this.userLiveTranscriptMessageIds)) != null) {
                this.userLiveTranscriptMessageIds.remove(str2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private final JsonObject replyTargetIdeaIconVariant(JsonObject jsonObject, JsonObject jsonObject2) {
        ?? A0h;
        JsonObject jsonObjectOptJsonObject;
        JsonArray jsonArrayOptJsonArray;
        JsonObject jsonObjectOptJsonObject2 = JsonObjectExtensionsKt.optJsonObject(jsonObject, ReplyAttributionSerializer.TYPE_PRESENTATION);
        if (jsonObjectOptJsonObject2 == null) {
            jsonObjectOptJsonObject2 = JsonObjectExtensionsKt.optJsonObject(jsonObject2, ReplyAttributionSerializer.TYPE_PRESENTATION);
        }
        JsonObject jsonObject3 = null;
        if (jsonObjectOptJsonObject2 == null || (jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObjectOptJsonObject2, "icon")) == null || (jsonArrayOptJsonArray = JsonObjectExtensionsKt.optJsonArray(jsonObjectOptJsonObject, "variants")) == null) {
            A0h = C0881AGi.A00;
        } else {
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<JsonElement> it = jsonArrayOptJsonArray.iterator();
            while (it.hasNext()) {
                JsonObject jsonObjectA14 = C60Q.A14(it);
                if (jsonObjectA14 != null) {
                    arrayListA0h.add(jsonObjectA14);
                }
            }
            A0h = C3cG.A0h();
            for (Object obj : arrayListA0h) {
                if (firstNonEmptyJsonString((JsonObject) obj, "url") != null) {
                    A0h.add(obj);
                }
            }
        }
        Iterator it2 = A0h.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ?? next = it2.next();
            if ("original".equals(firstNonEmptyJsonString((JsonObject) next, "role"))) {
                jsonObject3 = next;
                break;
            }
        }
        JsonObject jsonObject4 = jsonObject3;
        return jsonObject4 == null ? (JsonObject) AbstractC0878AGe.A0G(A0h) : jsonObject4;
    }

    private final void reportWidgetDropped(HatchHtmlErrorCode hatchHtmlErrorCode, String str) {
        HatchHtmlDiagnostics.INSTANCE.logError(HatchHtmlSurface.CHAT_WIDGET, hatchHtmlErrorCode, str, null, null, null);
    }

    private final String resolveReplyToMessageId(JsonObject jsonObject) {
        String strA0u = C60O.A0u(jsonObject, "reply_to_message_id");
        if (strA0u.length() > 0) {
            return strA0u;
        }
        String strExtractMessageId = Companion.extractMessageId(jsonObject);
        if (strExtractMessageId != null) {
            return this.activeMessageReplyMap.get(strExtractMessageId);
        }
        return null;
    }

    private final void sendSubscribe(G0U<? super String, Boolean> g0u) {
        HxE<Long, Long> replayCursor;
        Long l;
        Long l2;
        clearReplyElementSupport();
        String strA0k = AnonymousClass002.A0k();
        String str = this.currentConnectionAttemptId;
        if (str == null) {
            str = "unknown";
        }
        PendingSubscribe pendingSubscribe = new PendingSubscribe(strA0k, str, System.currentTimeMillis(), null);
        this.pendingSubscribes.put(strA0k, pendingSubscribe);
        synchronized (this.seqCursorLock) {
            replayCursor = getReplayCursor(this.sessionCursors.get(primaryCursorKey()));
        }
        if (replayCursor != null) {
            l = replayCursor.first;
            l2 = replayCursor.second;
        } else {
            l = null;
            l2 = null;
        }
        String strBuildChatSubscribeBody = JarvisProtocolJsonKt.buildChatSubscribeBody(strA0k, pendingSubscribe.sessionId, l, l2, replayCursor != null ? 500 : null, this.currentConnectionAttemptId);
        AbstractC0878AGe.A0L(",", "", "", JarvisProtocolJsonKt.chatSubscribeCapabilities(true), null);
        if (AnonymousClass003.A1X(strBuildChatSubscribeBody, g0u)) {
            CFK.A02(pendingSubscribe.requestId, pendingSubscribe.connectionAttemptId, JarvisProtocolKt.TAG, "chat.subscribe sent: requestId=%s connectionAttemptId=%s; awaiting server ack");
            return;
        }
        CFK.A04(JarvisProtocolKt.TAG, "chat.subscribe send rejected by transport; connection not ready");
        logSubscribeTerminalError(pendingSubscribe, "send_failed", "WebSocket send rejected");
        this.pendingSubscribes.remove(strA0k);
        this.onSubscribeReady.set(null);
    }

    private final HatchPresentationData unrenderablePresentationOrDrop(String str, JsonObject jsonObject, String str2, String str3) {
        Object objLogPresentationParseFailure;
        if (str2 == null) {
            objLogPresentationParseFailure = logPresentationParseFailure(str, jsonObject, str3);
        } else {
            CFK.A06(JarvisProtocolKt.TAG, FGI.A0U("presentation ", str3, "; showing fallback text"));
            objLogPresentationParseFailure = UnrenderablePresentationData.INSTANCE;
        }
        return (HatchPresentationData) objLogPresentationParseFailure;
    }

    public final void bumpChatEventSeqIfNewer(String str, Long l) {
        SessionCursors sessionCursorsPutIfAbsent;
        if (l != null) {
            synchronized (this.seqCursorLock) {
                ConcurrentHashMap<String, SessionCursors> concurrentHashMap = this.sessionCursors;
                String strCursorKeyForSessionLocked = cursorKeyForSessionLocked(str);
                SessionCursors sessionCursors = concurrentHashMap.get(strCursorKeyForSessionLocked);
                if (sessionCursors == null && (sessionCursorsPutIfAbsent = concurrentHashMap.putIfAbsent(strCursorKeyForSessionLocked, (sessionCursors = new SessionCursors()))) != null) {
                    sessionCursors = sessionCursorsPutIfAbsent;
                }
                SessionCursors sessionCursors2 = sessionCursors;
                long jLongValue = l.longValue();
                Long l2 = sessionCursors2.afterChatEventSeq;
                if (jLongValue > (l2 != null ? l2.longValue() : 0L)) {
                    sessionCursors2.afterChatEventSeq = l;
                }
            }
        }
    }

    public final void bumpStreamSeqIfNewer(String str, Long l) {
        SessionCursors sessionCursorsPutIfAbsent;
        if (l != null) {
            synchronized (this.seqCursorLock) {
                ConcurrentHashMap<String, SessionCursors> concurrentHashMap = this.sessionCursors;
                String strCursorKeyForSessionLocked = cursorKeyForSessionLocked(str);
                SessionCursors sessionCursors = concurrentHashMap.get(strCursorKeyForSessionLocked);
                if (sessionCursors == null && (sessionCursorsPutIfAbsent = concurrentHashMap.putIfAbsent(strCursorKeyForSessionLocked, (sessionCursors = new SessionCursors()))) != null) {
                    sessionCursors = sessionCursorsPutIfAbsent;
                }
                SessionCursors sessionCursors2 = sessionCursors;
                long jLongValue = l.longValue();
                Long l2 = sessionCursors2.afterStreamSeq;
                if (jLongValue > (l2 != null ? l2.longValue() : 0L)) {
                    sessionCursors2.afterStreamSeq = l;
                }
            }
        }
    }

    public final void clearReplyElementSupport() {
        AnonymousClass001.A1E(this._replyElementSupport, null, new ReplyElementSupport(AGH.A0E(), A3q.A00));
    }

    public final String getCurrentConnectionAttemptId$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway() {
        return this.currentConnectionAttemptId;
    }

    public final String getLastHttpRequestId() {
        return this.lastHttpRequestId;
    }

    public final G0V<String, String, Unit> getOnFileUpdate() {
        return this.onFileUpdate;
    }

    public final C1BN<String> getPrimarySessionId() {
        return this.primarySessionId;
    }

    public final C1BN<ReplyElementSupport> getReplyElementSupport() {
        return this.replyElementSupport;
    }

    public final AbstractC3358CGz getUserSession$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway() {
        return this.userSession;
    }

    public final void resetDeltaState() {
        this.activeMessageReplyMap.clear();
        clearAllSubscribeTracking();
    }

    public final void setCurrentConnectionAttemptId$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(String str) {
        this.currentConnectionAttemptId = str;
    }

    public final void setOnFileUpdate(G0V<? super String, ? super String, Unit> g0v) {
        this.onFileUpdate = g0v;
    }

    private final boolean hasResolvablePaths(HatchPresentationData hatchPresentationData) {
        List<HatchAttachmentFile> listAttachmentFiles = HatchAttachmentPresentationKt.attachmentFiles(hatchPresentationData);
        if (listAttachmentFiles.isEmpty()) {
            return false;
        }
        if ((listAttachmentFiles instanceof Collection) && listAttachmentFiles.isEmpty()) {
            return true;
        }
        for (HatchAttachmentFile hatchAttachmentFile : listAttachmentFiles) {
            if (WorkspaceUriResolver.INSTANCE.normalizeWorkspacePath(hatchAttachmentFile.path, null) == null && hatchAttachmentFile.originalUrl == null) {
                return false;
            }
        }
        return true;
    }

    private final void logSubscribeTerminalError(PendingSubscribe pendingSubscribe, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis() - pendingSubscribe.sentAtMs;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        String str3 = pendingSubscribe.connectionAttemptId;
        String str4 = pendingSubscribe.requestId;
        StringBuilder sbA0x = C3cI.A0x("chat.subscribe response: connectionAttemptId=", str3);
        sbA0x.append(" requestId=");
        sbA0x.append(str4);
        sbA0x.append(" status=err errorCode=");
        sbA0x.append(str);
        sbA0x.append(" errorMessage=");
        sbA0x.append(str2);
        sbA0x.append(" latencyMs=");
        sbA0x.append(jCurrentTimeMillis);
        CFK.A04(JarvisProtocolKt.TAG, sbA0x.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Hud] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlinx.serialization.json.JsonObject optJsonObjectOrDecodedString(kotlinx.serialization.json.JsonObject r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            kotlinx.serialization.json.JsonObject r5 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonObject(r6, r7)
            if (r5 != 0) goto L62
            kotlinx.serialization.json.JsonElement r2 = X.C60O.A1F(r7, r6)
            r5 = 0
            if (r2 == 0) goto L62
            boolean r0 = r2 instanceof kotlinx.serialization.json.JsonPrimitive
            java.lang.String r4 = "JarvisProtocol"
            if (r0 == 0) goto L51
            r1 = r2
            kotlinx.serialization.json.JsonPrimitive r1 = (kotlinx.serialization.json.JsonPrimitive) r1
            boolean r0 = r1.A01()
            if (r0 == 0) goto L51
            java.lang.String r1 = X.C9oY.A04(r1)
            if (r1 == 0) goto L62
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 != 0) goto L62
            kotlinx.serialization.json.JsonObject r3 = X.C60O.A1H(r1)     // Catch: java.lang.Throwable -> L2d
            goto L32
        L2d:
            r0 = move-exception
            X.Hud r3 = X.C3cG.A0s(r0)
        L32:
            java.lang.Throwable r0 = X.HsJ.A00(r3)
            if (r0 == 0) goto L49
            if (r8 == 0) goto L49
            java.lang.String r2 = r0.getMessage()
            java.lang.String r1 = ": failed to decode JSON string field "
            java.lang.String r0 = ": "
            java.lang.String r0 = X.FGI.A0h(r8, r1, r7, r0, r2)
            X.CFK.A06(r4, r0)
        L49:
            boolean r0 = r3 instanceof X.C10571Hud
            if (r0 != 0) goto L4e
            r5 = r3
        L4e:
            kotlinx.serialization.json.JsonObject r5 = (kotlinx.serialization.json.JsonObject) r5
            return r5
        L51:
            if (r8 == 0) goto L62
            java.lang.String r2 = X.C60O.A0n(r2)
            java.lang.String r1 = ": expected object for "
            java.lang.String r0 = " but got "
            java.lang.String r0 = X.FGI.A0h(r8, r1, r7, r0, r2)
            X.CFK.A06(r4, r0)
        L62:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.optJsonObjectOrDecodedString(kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.String):kotlinx.serialization.json.JsonObject");
    }

    private final List<HatchChatEvent> parseDeltaAgentDone(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            String strOptString = JsonObjectExtensionsKt.optString(jsonObjectA1J, "child_agent_id", "");
            if (strOptString.length() > 0) {
                String strOptString2 = JsonObjectExtensionsKt.optString(jsonObjectA1J, AuraDeeplinkRouteMapper.STATUS_ROUTE, "completed");
                return Collections.singletonList(new HatchChatEvent.SubAgentTaskStatus(strOptString, strOptString, "errored".equals(strOptString2) ? "failed" : "completed", C60P.A1Q(jsonObjectA1J, "summary", null), C60O.A0k(), Companion.extractEnvelope(jsonObjectA1J)));
            }
        }
        return C0881AGi.A00;
    }

    private final List<HatchChatEvent> parseDeltaBlockDone(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J == null) {
            return C0881AGi.A00;
        }
        String strOptString = JsonObjectExtensionsKt.optString(jsonObjectA1J, "block_id", "");
        String str = null;
        if (strOptString.length() > 0) {
            str = strOptString;
        }
        return Collections.singletonList(new HatchChatEvent.BlockDone(resolveReplyToMessageId(jsonObjectA1J), str, C60P.A1Q(jsonObjectA1J, "content", null), JsonObjectExtensionsKt.optString(jsonObjectA1J, "block_type", ""), C60P.A1Q(jsonObjectA1J, "parent_id", null), Companion.extractEnvelope(jsonObjectA1J)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private final List<HatchChatEvent> parseDeltaEvent(String str, JsonObject jsonObject) {
        switch (str.hashCode()) {
            case -2124033527:
                if (str.equals("delta.user_message")) {
                    return parseDeltaUserMessage(jsonObject);
                }
                break;
            case -1996260589:
                if (str.equals("delta.tool_done")) {
                    return parseDeltaToolDone(jsonObject);
                }
                break;
            case -1793005250:
                if (str.equals("delta.tool_progress")) {
                    return parseDeltaToolProgress(jsonObject);
                }
                break;
            case -1740546319:
                if (str.equals("delta.tool_start")) {
                    return parseDeltaToolStart(jsonObject);
                }
                break;
            case -1696964816:
                if (str.equals("delta.marker")) {
                    return parseDeltaMarker(jsonObject);
                }
                break;
            case -1596194000:
                if (str.equals(HatchGatewayNetworkLogRecorder.EVENT_MESSAGE_DONE)) {
                    return parseDeltaMessageDone(jsonObject);
                }
                break;
            case -1489951683:
                if (str.equals("delta.placeholder")) {
                    return parseDeltaPlaceholder(jsonObject);
                }
                break;
            case -443856918:
                if (str.equals("delta.block_done")) {
                    return parseDeltaBlockDone(jsonObject);
                }
                break;
            case 348953171:
                if (str.equals("delta.thinking_append")) {
                    return parseDeltaThinkingAppend(jsonObject);
                }
                break;
            case 387332496:
                if (str.equals("delta.presentation")) {
                    return parseDeltaPresentation(jsonObject);
                }
                break;
            case 915796466:
                if (str.equals("delta.message_removed")) {
                    return parseDeltaMessageRemoved(jsonObject);
                }
                break;
            case 999582006:
                if (str.equals("delta.text_append")) {
                    return parseDeltaTextAppend(jsonObject);
                }
                break;
            case 1382028402:
                if (str.equals("delta.agent_done")) {
                    return parseDeltaAgentDone(jsonObject);
                }
                break;
            case 2071583348:
                if (str.equals(HatchGatewayNetworkLogRecorder.EVENT_MESSAGE_START)) {
                    return parseDeltaMessageStart(jsonObject);
                }
                break;
        }
        return C0881AGi.A00;
    }

    private final List<HatchChatEvent> parseDeltaMarker(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            String strOptString = JsonObjectExtensionsKt.optString(jsonObjectA1J, "id", "");
            String strResolveRawFileSystemUrl = null;
            if (strOptString.length() > 0) {
                String strOptString2 = JsonObjectExtensionsKt.optString(jsonObjectA1J, "kind", "");
                if (strOptString2.length() > 0) {
                    String strA1Q = C60P.A1Q(jsonObjectA1J, "milestone", null);
                    String strA1Q2 = C60P.A1Q(jsonObjectA1J, OnboardingStateManagerKt.PREF_VARIANT, null);
                    String strOptString3 = JsonObjectExtensionsKt.optString(jsonObjectA1J, "video_path", "");
                    if (strOptString3.length() > 0) {
                        strResolveRawFileSystemUrl = WorkspaceUriResolver.INSTANCE.resolveRawFileSystemUrl(strOptString3, this.userSession);
                    } else {
                        strOptString3 = null;
                    }
                    String strA17 = BQG.A17(strOptString, 20);
                    boolean zA1X = AnonymousClass002.A1X(strResolveRawFileSystemUrl);
                    StringBuilder sbA0x = C3cI.A0x("delta.marker: id=", strA17);
                    sbA0x.append(" kind=");
                    sbA0x.append(strOptString2);
                    sbA0x.append(" milestone=");
                    sbA0x.append(strA1Q);
                    sbA0x.append(" variant=");
                    sbA0x.append(strA1Q2);
                    sbA0x.append(" videoPath=");
                    sbA0x.append(strOptString3);
                    CFK.A05(JarvisProtocolKt.TAG, C60P.A1P(" hasVideoUrl=", sbA0x, zA1X));
                    return Collections.singletonList(new HatchChatEvent.Marker(strOptString, strOptString2, strA1Q, strA1Q2, strResolveRawFileSystemUrl, Companion.extractEnvelope(jsonObjectA1J)));
                }
            }
        }
        return C0881AGi.A00;
    }

    private final List<HatchChatEvent> parseDeltaMessageDone(JsonObject jsonObject) {
        Object messageDone;
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J == null) {
            return C0881AGi.A00;
        }
        Companion companion = Companion;
        String strExtractMessageId = companion.extractMessageId(jsonObjectA1J);
        String strOptString = JsonObjectExtensionsKt.optString(jsonObjectA1J, "reply_to_message_id", "");
        if (strOptString.length() <= 0) {
            strOptString = strExtractMessageId != null ? this.activeMessageReplyMap.get(strExtractMessageId) : null;
        }
        String strOptString2 = JsonObjectExtensionsKt.optString(jsonObjectA1J, AuraDeeplinkRouteMapper.STATUS_ROUTE, "completed");
        JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObjectA1J, "transcript");
        List<HatchTextEntitySegment> textEntitySegments = HatchTextEntitySegmentJsonKt.parseTextEntitySegments(C60O.A1F("segments", jsonObjectA1J));
        String strOptString3 = JsonObjectExtensionsKt.optString(jsonObjectA1J, "fallback_text", "");
        String str = null;
        String str2 = strOptString3.length() > 0 ? strOptString3 : null;
        String strA1Q = C60P.A1Q(jsonObjectA1J, "error", null);
        String strA0i = C60R.A0i("summary", jsonObjectA1J);
        String strOptString4 = JsonObjectExtensionsKt.optString(jsonObjectA1J, "override_source", "");
        if (strOptString4.length() > 0) {
            str = strOptString4;
        }
        Long lA1I = jsonObjectA1J.containsKey("message_seq") ? C60P.A1I(jsonObjectA1J, "message_seq") : null;
        String strA17 = strExtractMessageId != null ? BQG.A17(strExtractMessageId, 20) : null;
        String strA172 = strOptString != null ? BQG.A17(strOptString, 20) : null;
        boolean zA1X = AnonymousClass002.A1X(jsonObjectOptJsonObject);
        StringBuilder sbA0x = C3cI.A0x("message_done: msgId=", strA17);
        sbA0x.append(" replyTo=");
        sbA0x.append(strA172);
        sbA0x.append(" status=");
        sbA0x.append(strOptString2);
        sbA0x.append(" message_seq=");
        sbA0x.append(lA1I);
        sbA0x.append(" hasTranscript=");
        sbA0x.append(zA1X);
        CFK.A05(JarvisProtocolKt.TAG, C60P.A1M(" overrideSource=", str, sbA0x));
        List<HatchMessageResource> messageResources$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway = parseMessageResources$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(jsonObjectA1J);
        if (strExtractMessageId != null) {
            this.activeMessageReplyMap.remove(strExtractMessageId);
        }
        CanonicalEventEnvelope canonicalEventEnvelopeExtractEnvelope = companion.extractEnvelope(jsonObjectA1J);
        boolean zIsUserLiveTranscript = isUserLiveTranscript(strExtractMessageId);
        if (!"cancelled".equals(strOptString2) || zIsUserLiveTranscript) {
            List<HatchWidget> inlineWidgets = parseInlineWidgets(jsonObjectA1J);
            if (inlineWidgets.isEmpty()) {
                inlineWidgets = null;
            }
            messageDone = new HatchChatEvent.MessageDone(strExtractMessageId, strOptString, strOptString2, jsonObjectOptJsonObject, textEntitySegments, str2, strA1Q, strA0i, messageResources$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway, inlineWidgets, str, canonicalEventEnvelopeExtractEnvelope, zIsUserLiveTranscript);
        } else {
            messageDone = new HatchChatEvent.ChatAborted(strOptString, canonicalEventEnvelopeExtractEnvelope);
        }
        return Collections.singletonList(messageDone);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private final List<HatchChatEvent> parseDeltaMessageRemoved(JsonObject jsonObject) {
        ?? A0h;
        String strA04;
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            JsonArray jsonArrayOptJsonArray = JsonObjectExtensionsKt.optJsonArray(jsonObjectA1J, "message_ids");
            if (jsonArrayOptJsonArray != null) {
                A0h = C3cG.A0h();
                Iterator<JsonElement> it = jsonArrayOptJsonArray.iterator();
                while (it.hasNext()) {
                    JsonPrimitive jsonPrimitiveAsJsonPrimitiveOrNull = JsonObjectExtensionsKt.asJsonPrimitiveOrNull(C60Q.A11(it));
                    if (jsonPrimitiveAsJsonPrimitiveOrNull != null && (strA04 = C9oY.A04(jsonPrimitiveAsJsonPrimitiveOrNull)) != null) {
                        C60Q.A1M(strA04, A0h);
                    }
                }
            } else {
                A0h = C0881AGi.A00;
            }
            if (!A0h.isEmpty()) {
                CFK.A05(JarvisProtocolKt.TAG, FGI.A0M("delta.message_removed: ids=", C3cH.A0e(",", A0h)));
                return Collections.singletonList(new HatchChatEvent.MessagesRemoved(A0h, Companion.extractEnvelope(jsonObjectA1J)));
            }
        }
        return C0881AGi.A00;
    }

    private final List<HatchChatEvent> parseDeltaMessageStart(JsonObject jsonObject) {
        HatchTranscriptMetadata hatchTranscriptMetadata;
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null && !"subagent".equals(JsonObjectExtensionsKt.optString(jsonObjectA1J, "stream_lane", ""))) {
            Companion companion = Companion;
            String strExtractMessageId = companion.extractMessageId(jsonObjectA1J);
            if (strExtractMessageId != null) {
                String strOptString = JsonObjectExtensionsKt.optString(jsonObjectA1J, "reply_to_message_id", "");
                String str = null;
                if (strOptString.length() > 0) {
                    str = strOptString;
                }
                String strOptString2 = JsonObjectExtensionsKt.optString(jsonObjectA1J, "agent_id", "");
                String str2 = strOptString2.length() > 0 ? strOptString2 : null;
                Long lA1I = jsonObjectA1J.containsKey("message_seq") ? C60P.A1I(jsonObjectA1J, "message_seq") : null;
                if (str != null) {
                    this.activeMessageReplyMap.put(strExtractMessageId, str);
                }
                String strA17 = BQG.A17(strExtractMessageId, 20);
                String strA172 = str != null ? BQG.A17(str, 20) : null;
                StringBuilder sbA0x = C3cI.A0x("message_start: msgId=", strA17);
                sbA0x.append(" replyTo=");
                sbA0x.append(strA172);
                C60P.A1X(lA1I, " message_seq=", JarvisProtocolKt.TAG, sbA0x);
                JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObjectA1J, "metadata");
                if (jsonObjectOptJsonObject != null) {
                    String strA1Q = C60P.A1Q(jsonObjectOptJsonObject, "model", null);
                    String strA1Q2 = C60P.A1Q(jsonObjectOptJsonObject, PhotosSearchHandlerKt.PARAM_SOURCE, null);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jOptLong = JsonObjectExtensionsKt.optLong(jsonObjectOptJsonObject, "started_at_ms", 0L);
                    Long lValueOf = Long.valueOf(jOptLong);
                    Long l = null;
                    if (jOptLong > 0) {
                        l = lValueOf;
                    }
                    boolean zEquals = HatchMessageKt.HATCH_DELIVERY_VOICEOVER.equals(JsonObjectExtensionsKt.optStringOrNull(jsonObjectOptJsonObject, "delivery"));
                    int i = HatchTranscriptMetadata.$stable;
                    hatchTranscriptMetadata = new HatchTranscriptMetadata(strA1Q, strA1Q2, jCurrentTimeMillis, l, null, null, C3cG.A0h(), zEquals);
                } else {
                    int i2 = HatchTranscriptMetadata.$stable;
                    hatchTranscriptMetadata = new HatchTranscriptMetadata(null, null, System.currentTimeMillis(), null, null, null, C3cG.A0h(), false);
                }
                boolean zEquals2 = JarvisProtocolKt.USER_LIVE_TRANSCRIPT_SOURCE.equals(hatchTranscriptMetadata.source);
                if (zEquals2) {
                    rememberUserLiveTranscript(strExtractMessageId);
                }
                return Collections.singletonList(new HatchChatEvent.MessageStart(strExtractMessageId, str2, str, hatchTranscriptMetadata, companion.extractEnvelope(jsonObjectA1J), zEquals2));
            }
            CFK.A06(JarvisProtocolKt.TAG, "delta.message_start: missing message_id");
        }
        return C0881AGi.A00;
    }

    private final List<HatchChatEvent> parseDeltaPlaceholder(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null && "citation".equals(JsonObjectExtensionsKt.optString(jsonObjectA1J, "kind", ""))) {
            String strOptString = JsonObjectExtensionsKt.optString(jsonObjectA1J, "id", "");
            if (strOptString.length() > 0) {
                String strOptString2 = JsonObjectExtensionsKt.optString(jsonObjectA1J, "permalink", "");
                if (strOptString2.length() > 0) {
                    return Collections.singletonList(new HatchChatEvent.Citation(resolveReplyToMessageId(jsonObjectA1J), new HatchCitation(strOptString, strOptString2, C60P.A1Q(jsonObjectA1J, "source_tool", null), C60P.A1Q(jsonObjectA1J, "thumbnail_url", null), JsonObjectExtensionsKt.optBoolean(jsonObjectA1J, "resolved", false)), Companion.extractEnvelope(jsonObjectA1J)));
                }
            }
        }
        return C0881AGi.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[PHI: r1
  0x004a: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v8 java.lang.String), (r1v9 java.lang.String), (r1v10 java.lang.String) binds: [B:8:0x0024, B:10:0x0030, B:12:0x003c, B:14:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.facebook.aura.model.HatchChatEvent> parseDeltaPresentation(kotlinx.serialization.json.JsonObject r15) {
        /*
            r14 = this;
            kotlinx.serialization.json.JsonObject r3 = X.C60O.A1J(r15)
            java.lang.String r2 = "JarvisProtocol"
            if (r3 != 0) goto L10
            java.lang.String r0 = "delta.presentation dropped: missing payload"
            X.CFK.A06(r2, r0)
        Ld:
            X.AGi r0 = X.C0881AGi.A00
            return r0
        L10:
            java.lang.String r0 = "kind"
            java.lang.String r4 = "<missing>"
            java.lang.String r5 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r0, r4)
            java.lang.String r0 = "presentation_id"
            java.lang.String r6 = ""
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r0, r6)
            int r0 = r1.length()
            if (r0 > 0) goto L4a
            java.lang.String r0 = "widget_id"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r0, r6)
            int r0 = r1.length()
            if (r0 > 0) goto L4a
            java.lang.String r0 = "id"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r0, r6)
            int r0 = r1.length()
            if (r0 > 0) goto L4a
            java.lang.String r0 = "message_id"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r0, r6)
            int r0 = r1.length()
            if (r0 <= 0) goto L4b
        L4a:
            r4 = r1
        L4b:
            java.lang.String r11 = "stream_lane"
            java.lang.String r13 = X.C60R.A0i(r11, r3)
            java.lang.String r12 = "<none>"
            if (r13 != 0) goto L56
            r13 = r12
        L56:
            java.lang.String r9 = "transcript_surface"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r9, r6)
            int r0 = r1.length()
            if (r0 <= 0) goto L63
            r12 = r1
        L63:
            java.lang.String r0 = "supported_clients"
            kotlinx.serialization.json.JsonArray r10 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonArray(r3, r0)
            java.lang.String r8 = "delta.presentation (raw): kind="
            java.lang.StringBuilder r1 = X.C3cI.A0x(r8, r5)
            java.lang.String r7 = " id="
            r1.append(r7)
            r1.append(r4)
            java.lang.String r0 = " stream_lane="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " surface="
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " supported_clients="
            X.C60P.A1X(r10, r0, r2, r1)
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r11, r6)
            java.lang.String r0 = "subagent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb0
            java.lang.StringBuilder r3 = X.C3cI.A0x(r8, r5)
            r3.append(r7)
            r3.append(r4)
            java.lang.String r0 = " dropped \u2014 subagent lane"
            r3.append(r0)
        La7:
            java.lang.String r0 = r3.toString()
            X.CFK.A05(r2, r0)
            goto Ld
        Lb0:
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r9, r6)
            int r0 = r1.length()
            if (r0 <= 0) goto Ld5
            java.lang.String r0 = "main_chat"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Ld5
            java.lang.StringBuilder r3 = X.C3cI.A0x(r8, r5)
            r3.append(r7)
            r3.append(r4)
            java.lang.String r0 = " dropped \u2014 surface="
            r3.append(r0)
            r3.append(r1)
            goto La7
        Ld5:
            r1 = 0
            java.lang.String r0 = "delta.presentation"
            com.facebook.aura.model.HatchWidgetPresentation r2 = r14.parseWidgetPresentation(r3, r1, r0)
            if (r2 == 0) goto Ld
            int r0 = com.facebook.aura.model.HatchChatEvent.Presentation.$stable
            com.facebook.aura.gateway.JarvisProtocol$Companion r0 = com.facebook.aura.gateway.JarvisProtocol.Companion
            com.facebook.aura.model.CanonicalEventEnvelope r1 = r0.extractEnvelope(r3)
            com.facebook.aura.model.HatchChatEvent$Presentation r0 = new com.facebook.aura.model.HatchChatEvent$Presentation
            r0.<init>(r2, r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseDeltaPresentation(kotlinx.serialization.json.JsonObject):java.util.List");
    }

    private final List<HatchChatEvent> parseDeltaTextAppend(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null && !"subagent".equals(JsonObjectExtensionsKt.optString(jsonObjectA1J, "stream_lane", ""))) {
            String strOptString = JsonObjectExtensionsKt.optString(jsonObjectA1J, "text", "");
            List<HatchWidget> inlineWidgets = parseInlineWidgets(jsonObjectA1J);
            if (strOptString.length() != 0 || !inlineWidgets.isEmpty()) {
                Companion companion = Companion;
                String strExtractMessageId = companion.extractMessageId(jsonObjectA1J);
                String strResolveReplyToMessageId = resolveReplyToMessageId(jsonObjectA1J);
                String strOptString2 = JsonObjectExtensionsKt.optString(jsonObjectA1J, "block_id", "");
                if (strOptString2.length() <= 0) {
                    strOptString2 = null;
                }
                return Collections.singletonList(new HatchChatEvent.DeltaText(strResolveReplyToMessageId, strOptString2, strOptString, C60R.A0i("parent_id", jsonObjectA1J), C60R.A0i("agent_id", jsonObjectA1J), inlineWidgets.isEmpty() ? null : inlineWidgets, companion.extractEnvelope(jsonObjectA1J), isUserLiveTranscript(strExtractMessageId)));
            }
        }
        return C0881AGi.A00;
    }

    private final List<HatchChatEvent> parseDeltaThinkingAppend(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null && !"subagent".equals(JsonObjectExtensionsKt.optString(jsonObjectA1J, "stream_lane", ""))) {
            String strOptString = JsonObjectExtensionsKt.optString(jsonObjectA1J, "text", "");
            if (strOptString.length() != 0) {
                String strResolveReplyToMessageId = resolveReplyToMessageId(jsonObjectA1J);
                String strOptString2 = JsonObjectExtensionsKt.optString(jsonObjectA1J, "block_id", "");
                if (strOptString2.length() <= 0) {
                    strOptString2 = null;
                }
                return Collections.singletonList(new HatchChatEvent.Thinking(strResolveReplyToMessageId, strOptString, strOptString2, C60P.A1Q(jsonObjectA1J, "parent_id", null), Companion.extractEnvelope(jsonObjectA1J)));
            }
        }
        return C0881AGi.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
    
        if (X.C7BY.A0q(com.facebook.aura.json.JsonObjectExtensionsKt.optString(r2, "label", ""), "edit", true) == true) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.facebook.aura.model.HatchChatEvent> parseDeltaToolDone(kotlinx.serialization.json.JsonObject r21) {
        /*
            r20 = this;
            kotlinx.serialization.json.JsonObject r3 = X.C60O.A1J(r21)
            if (r3 != 0) goto L9
            X.AGi r0 = X.C0881AGi.A00
            return r0
        L9:
            r7 = r20
            java.lang.String r9 = r7.resolveReplyToMessageId(r3)
            java.lang.String r1 = "tool_id"
            java.lang.String r0 = "unknown"
            java.lang.String r10 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r1, r0)
            java.lang.String r1 = "name"
            java.lang.String r0 = ""
            java.lang.String r11 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r1, r0)
            java.lang.String r1 = "tool_type"
            java.lang.String r12 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r1, r0)
            int r1 = r12.length()
            if (r1 > 0) goto L2c
            r12 = r0
        L2c:
            java.lang.String r1 = "parent_id"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r1, r0)
            java.lang.String r14 = X.C60O.A0q(r1)
            java.lang.String r1 = "result"
            kotlinx.serialization.json.JsonObject r2 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonObject(r3, r1)
            java.lang.String r5 = "detail"
            java.lang.String r4 = "label"
            r1 = 1
            if (r2 == 0) goto Lda
            java.lang.String r6 = "success"
            boolean r16 = com.facebook.aura.json.JsonObjectExtensionsKt.optBoolean(r2, r6, r1)
            java.lang.String r17 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r2, r4, r0)
            java.lang.String r6 = "summary"
            java.lang.String r8 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r2, r6, r0)
            int r6 = r8.length()
            r18 = 0
            if (r6 <= 0) goto L5d
            r18 = r8
        L5d:
            java.lang.String r8 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r2, r5, r0)
            int r6 = r8.length()
            r19 = 0
            if (r6 <= 0) goto L6b
            r19 = r8
        L6b:
            java.lang.String r6 = "metadata"
            kotlinx.serialization.json.JsonObject r20 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonObject(r2, r6)
            java.lang.String r6 = "error"
            java.lang.String r8 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r2, r6, r0)
            int r6 = r8.length()
            r21 = 0
            if (r6 <= 0) goto L81
            r21 = r8
        L81:
            com.facebook.aura.model.HatchToolCallResult r13 = new com.facebook.aura.model.HatchToolCallResult
            r15 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r8 = r13.detail
            if (r8 == 0) goto L90
            r6 = 80
            X.BQG.A17(r8, r6)
        L90:
            java.lang.String r6 = "edit"
            boolean r8 = r6.equals(r11)
            if (r8 != 0) goto Ld6
            if (r2 == 0) goto Lc2
            java.lang.String r8 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r2, r4, r0)
            boolean r8 = X.C7BY.A0q(r8, r6, r1)
            if (r8 != r1) goto Lc2
        La4:
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r2, r5, r0)
            java.lang.String r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r2, r4, r0)
        Lac:
            java.lang.String r4 = "IDENTITY.md"
            r2 = 0
            boolean r1 = X.C7BY.A0q(r1, r4, r2)
            if (r1 != 0) goto Lbb
            boolean r0 = X.C7BY.A0q(r0, r4, r2)
            if (r0 == 0) goto Lc2
        Lbb:
            X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r0 = r7.onFileUpdate
            if (r0 == 0) goto Lc2
            r0.invoke(r6, r4)
        Lc2:
            com.facebook.aura.gateway.JarvisProtocol$Companion r0 = com.facebook.aura.gateway.JarvisProtocol.Companion
            com.facebook.aura.model.CanonicalEventEnvelope r17 = r0.extractEnvelope(r3)
            long r15 = java.lang.System.currentTimeMillis()
            com.facebook.aura.model.HatchChatEvent$ToolDone r8 = new com.facebook.aura.model.HatchChatEvent$ToolDone
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17)
            java.util.List r0 = java.util.Collections.singletonList(r8)
            return r0
        Ld6:
            if (r2 != 0) goto La4
            r1 = r0
            goto Lac
        Lda:
            r13 = 0
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseDeltaToolDone(kotlinx.serialization.json.JsonObject):java.util.List");
    }

    private final List<HatchChatEvent> parseDeltaToolProgress(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            String strA0u = C60O.A0u(jsonObjectA1J, "line");
            if (strA0u.length() != 0) {
                return Collections.singletonList(new HatchChatEvent.ToolUpdate(resolveReplyToMessageId(jsonObjectA1J), JsonObjectExtensionsKt.optString(jsonObjectA1J, "tool_id", "unknown"), strA0u, Companion.extractEnvelope(jsonObjectA1J)));
            }
        }
        return C0881AGi.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[PHI: r4 r6 r11
  0x0076: PHI (r4v4 java.lang.String) = (r4v1 java.lang.String), (r4v5 java.lang.String) binds: [B:40:0x00c0, B:19:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r6v4 java.lang.String) = (r6v1 java.lang.String), (r6v5 java.lang.String) binds: [B:40:0x00c0, B:19:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r11v4 java.lang.String) = (r11v1 java.lang.String), (r11v5 java.lang.String) binds: [B:40:0x00c0, B:19:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3 A[PHI: r4 r6 r11
  0x00c3: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String) binds: [B:40:0x00c0, B:21:0x007e] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v4 java.lang.String) binds: [B:40:0x00c0, B:21:0x007e] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v4 java.lang.String) binds: [B:40:0x00c0, B:21:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.facebook.aura.model.HatchChatEvent> parseDeltaToolStart(kotlinx.serialization.json.JsonObject r18) {
        /*
            r17 = this;
            kotlinx.serialization.json.JsonObject r3 = X.C60O.A1J(r18)
            if (r3 != 0) goto L9
            X.AGi r0 = X.C0881AGi.A00
            return r0
        L9:
            r0 = r17
            java.lang.String r8 = r0.resolveReplyToMessageId(r3)
            java.lang.String r1 = X.AnonymousClass002.A0k()
            java.lang.String r0 = "tool_id"
            java.lang.String r9 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r0, r1)
            java.lang.String r1 = "name"
            java.lang.String r0 = "unknown"
            java.lang.String r10 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r1, r0)
            java.lang.String r0 = "agent_id"
            java.lang.String r2 = ""
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r0, r2)
            int r0 = r1.length()
            r7 = 0
            r15 = r7
            if (r0 <= 0) goto L32
            r15 = r1
        L32:
            java.lang.String r0 = "tool_type"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r0, r2)
            int r0 = r1.length()
            r12 = r2
            if (r0 <= 0) goto L40
            r12 = r1
        L40:
            java.lang.String r0 = "parent_id"
            java.lang.String r14 = X.C60P.A1Q(r3, r0, r7)
            java.lang.String r0 = "request"
            kotlinx.serialization.json.JsonObject r5 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonObject(r3, r0)
            java.lang.String r1 = "detail"
            java.lang.String r4 = "summary"
            if (r5 == 0) goto Lbb
            java.lang.String r11 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r5, r4, r2)
            int r0 = r11.length()
            if (r0 > 0) goto L66
            java.lang.String r11 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r5, r1, r2)
            int r0 = r11.length()
            if (r0 <= 0) goto Lbb
        L66:
            java.lang.String r0 = "label"
            java.lang.String r6 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r5, r0, r2)
            java.lang.String r4 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r5, r4, r2)
            int r0 = r4.length()
            if (r0 <= 0) goto Lbf
        L76:
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r5, r1, r2)
            int r0 = r1.length()
            if (r0 <= 0) goto Lc3
        L80:
            java.lang.String r2 = "metadata"
            if (r5 == 0) goto L88
            kotlinx.serialization.json.JsonObject r7 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonObject(r5, r2)
        L88:
            com.facebook.aura.model.HatchToolCallRequest r13 = new com.facebook.aura.model.HatchToolCallRequest
            r13.<init>(r6, r4, r1, r7)
            java.lang.String r1 = r13.detail
            if (r1 == 0) goto L96
            r0 = 80
            X.BQG.A17(r1, r0)
        L96:
            if (r5 == 0) goto La7
            kotlinx.serialization.json.JsonObject r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonObject(r5, r2)
            if (r0 == 0) goto La7
            java.util.Set r0 = r0.keySet()
            if (r0 == 0) goto La7
            X.AbstractC0878AGe.A0X(r0)
        La7:
            com.facebook.aura.gateway.JarvisProtocol$Companion r0 = com.facebook.aura.gateway.JarvisProtocol.Companion
            com.facebook.aura.model.CanonicalEventEnvelope r18 = r0.extractEnvelope(r3)
            long r16 = java.lang.System.currentTimeMillis()
            com.facebook.aura.model.HatchChatEvent$ToolStart r7 = new com.facebook.aura.model.HatchChatEvent$ToolStart
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r18)
            java.util.List r0 = java.util.Collections.singletonList(r7)
            return r0
        Lbb:
            r11 = r7
            if (r5 != 0) goto L66
            r6 = r2
        Lbf:
            r4 = r7
            if (r5 == 0) goto Lc3
            goto L76
        Lc3:
            r1 = r7
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseDeltaToolStart(kotlinx.serialization.json.JsonObject):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.facebook.aura.model.HatchChatEvent> parseDeltaUserMessage(kotlinx.serialization.json.JsonObject r44) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.JarvisProtocol.parseDeltaUserMessage(kotlinx.serialization.json.JsonObject):java.util.List");
    }

    private final List<HatchChatEvent> parseTaskStatus(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            String strOptString = JsonObjectExtensionsKt.optString(jsonObjectA1J, "agent_id", "");
            if (strOptString.length() > 0) {
                String strA1Q = C60P.A1Q(jsonObjectA1J, BrowserTaskUiCommandsKt.TASK_ID_PARAM, strOptString);
                String strOptString2 = JsonObjectExtensionsKt.optString(jsonObjectA1J, AuraDeeplinkRouteMapper.STATUS_ROUTE, "");
                if (strOptString2.length() > 0) {
                    CFK.A05(JarvisProtocolKt.TAG, FGI.A0d("task.status: agentId=", BQG.A17(strOptString, 20), " status=", strOptString2));
                    return Collections.singletonList(new HatchChatEvent.SubAgentTaskStatus(strA1Q, strOptString, strOptString2, null, (strOptString2.equals("completed") || strOptString2.equals("failed")) ? C60O.A0k() : null, Companion.extractEnvelope(jsonObjectA1J)));
                }
            }
        }
        return C0881AGi.A00;
    }

    private final List<HatchChatEvent> parseWidgetStateUpdated(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            String strOptString = JsonObjectExtensionsKt.optString(jsonObjectA1J, "widget_id", "");
            if (strOptString.length() > 0) {
                String strOptString2 = JsonObjectExtensionsKt.optString(jsonObjectA1J, "host_message_id", "");
                if (strOptString2.length() > 0) {
                    return Collections.singletonList(new HatchChatEvent.WidgetStateUpdated(strOptString, strOptString2, HatchWidgetPresentationKt.normalizeJSONState(C60O.A1F("state", jsonObjectA1J)), C60P.A1Q(jsonObjectA1J, "mutation_id", null), Companion.extractEnvelope(jsonObjectA1J)));
                }
            }
        }
        return C0881AGi.A00;
    }

    public final HatchWebSocketConfig buildConnectionConfig(String str, String str2, String str3, int i, HatchNoisePrivateAuth hatchNoisePrivateAuth, Long l, String str4) {
        String strJarvisConnectionUrl = JarvisProtocolKt.jarvisConnectionUrl(str, str2, AnonymousClass005.A1Z(str, str2, str3));
        HatcheryVMIdUtilsKt.redactedGatewayUrlForLog(str);
        String string = AbstractC7535F0i.A00().toString();
        this.lastHttpRequestId = string;
        this.currentConnectionAttemptId = str3;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("x-request-id", string);
        c0924AIaA0u.put("X-Gateway-Connect-Attempt-Id", str3);
        c0924AIaA0u.put("User-Agent", AuraUserAgent.INSTANCE.getInstance());
        if (l != null) {
            C3cH.A1A("X-Gateway-VM-Retry-Delay-Ms", c0924AIaA0u, l.longValue());
        }
        if (str4 != null) {
            c0924AIaA0u.put("X-Hatch-Region-Hint", str4);
        }
        return new HatchWebSocketConfig(strJarvisConnectionUrl, AIW.A0K(c0924AIaA0u), C0881AGi.A00, 30000L, i, 0L, hatchNoisePrivateAuth);
    }

    public final String buildConnectionUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(String str, String str2) {
        return JarvisProtocolKt.jarvisConnectionUrl(str, str2, C60P.A1Y(str, str2));
    }

    public final void clearReplayCursors() {
        clearReplyElementSupport();
        synchronized (this.seqCursorLock) {
            this.sessionCursors.clear();
            this._primarySessionId.Af8(null);
        }
    }

    public final void onWebSocketOpened(G0U<? super String, Boolean> g0u, String str, Function0<Unit> function0) {
        AnonymousClass003.A0v(g0u, function0);
        synchronized (this.primarySubscribeLock) {
            Set<Map.Entry<String, PendingSubscribe>> setEntrySet = this.pendingSubscribes.entrySet();
            C7384Etj.A0U(setEntrySet);
            for (Map.Entry<String, PendingSubscribe> entry : setEntrySet) {
                C7384Etj.A0X(entry);
                String key = entry.getKey();
                C7384Etj.A0U(key);
                String str2 = key;
                PendingSubscribe value = entry.getValue();
                C7384Etj.A0U(value);
                PendingSubscribe pendingSubscribe = value;
                if (pendingSubscribe.sessionId == null) {
                    this.pendingSubscribes.remove(str2, pendingSubscribe);
                }
            }
            this.onSubscribeReady.set(function0);
            sendSubscribe(g0u);
        }
    }
}
