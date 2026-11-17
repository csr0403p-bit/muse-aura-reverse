package com.facebook.aura.perf;

import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C60S;
import X.C6tn;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import X.G0U;
import android.os.SystemClock;
import com.facebook.aura.analytics.hatch.HatchSessionId;
import com.facebook.aura.bugreport.AuraBugReportSender;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.conversation.repo.HatchConversationRepositoryKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.file.view.ArtifactFileActionMenuKt;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.markdown.parser.custom.extensions.MermaidExtension;
import com.facebook.aura.model.CanonicalEventEnvelope;
import com.facebook.aura.model.HatchChatEvent;
import com.facebook.aura.model.HatchContentBlock;
import com.facebook.aura.model.HatchContentBlockSerializer;
import com.facebook.aura.model.HatchDeltaTranscript;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchToolCallResult;
import com.facebook.aura.model.HatchTranscriptKt;
import com.facebook.aura.model.HatchTranscriptMessage;
import com.facebook.aura.model.HatchTranscriptMetadata;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public final class HatchConversationQplLogger {
    public volatile String currentAgentMsgId;
    public volatile String currentTurnId;
    public final ConcurrentHashMap<String, AtomicInteger> followUpCounts = C60O.A1C();
    public final ConcurrentHashMap<String, AtomicInteger> correlationIdCounts = C60O.A1C();
    public final ConcurrentHashMap<String, Set<String>> loggedPoints = C60O.A1C();
    public final Set<String> turnBoundaryReached = C60O.A18();
    public final ConcurrentHashMap<String, AtomicInteger> streamDeltaCounts = C60O.A1C();
    public final ConcurrentHashMap<String, AtomicInteger> streamTextDeltaCounts = C60O.A1C();
    public final Set<String> activeTurnIds = C60O.A18();
    public final ConcurrentHashMap<String, String> turnCorrelationIds = C60O.A1C();
    public final Set<String> activeAgentSendIds = C60O.A18();
    public final ConcurrentHashMap<String, Set<String>> agentSendLoggedPoints = C60O.A1C();
    public final ConcurrentHashMap<String, AtomicInteger> agentSendDeltaCounts = C60O.A1C();
    public final ConcurrentHashMap<String, AtomicInteger> agentSendTextDeltaCounts = C60O.A1C();
    public final ConcurrentHashMap<String, AtomicInteger> agentSendPlaceholderCounts = C60O.A1C();
    public final ConcurrentHashMap<String, Long> agentSendMediaAvailableTimestamps = C60O.A1C();
    public final ConcurrentHashMap<String, String> turnToAgentMsgId = C60O.A1C();
    public final ConcurrentHashMap<String, String> deliveryIdToTurnId = C60O.A1C();
    public final Set<String> activeDeliveryIds = C60O.A18();
    public final ConcurrentHashMap<String, String> serverMsgToTurnId = C60O.A1C();

    /* loaded from: classes.dex */
    public final class PendingUserSendTrace extends C06G {
        public final String deliveryInstanceKey;
        public final String turnId;

        public PendingUserSendTrace(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.deliveryInstanceKey = str;
            this.turnId = str2;
        }

        public final PendingUserSendTrace copy(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            return new PendingUserSendTrace(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PendingUserSendTrace) {
                    PendingUserSendTrace pendingUserSendTrace = (PendingUserSendTrace) obj;
                    if (!C7384Etj.areEqual(this.deliveryInstanceKey, pendingUserSendTrace.deliveryInstanceKey) || !C7384Etj.areEqual(this.turnId, pendingUserSendTrace.turnId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PendingUserSendTrace copy$default(PendingUserSendTrace pendingUserSendTrace, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pendingUserSendTrace.deliveryInstanceKey;
            }
            if ((i & 2) != 0) {
                str2 = pendingUserSendTrace.turnId;
            }
            C7384Etj.A0Y(str, 0);
            return new PendingUserSendTrace(str, str2);
        }

        public final String component1() {
            return this.deliveryInstanceKey;
        }

        public final String component2() {
            return this.turnId;
        }

        public final String getDeliveryInstanceKey() {
            return this.deliveryInstanceKey;
        }

        public final String getTurnId() {
            return this.turnId;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.deliveryInstanceKey) + AnonymousClass006.A0G(this.turnId);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* renamed from: com.facebook.aura.perf.HatchConversationQplLogger$cleanupAgentSend$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Map.Entry<String, String>, Boolean> {
        public final /* synthetic */ String $agentMsgId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            this.$agentMsgId = str;
        }

        @Override // X.G0U
        public final Boolean invoke(Map.Entry<String, String> entry) {
            return C60O.A0h(C60Q.A0Z(entry), this.$agentMsgId);
        }
    }

    /* renamed from: com.facebook.aura.perf.HatchConversationQplLogger$cleanupTurn$1, reason: invalid class name and case insensitive filesystem */
    public final class C134311 extends AbstractC7559F3s implements G0U<Map.Entry<String, String>, Boolean> {
        public final /* synthetic */ String $turnId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134311(String str) {
            super(1);
            this.$turnId = str;
        }

        @Override // X.G0U
        public final Boolean invoke(Map.Entry<String, String> entry) {
            return C60O.A0h(C60Q.A0Z(entry), this.$turnId);
        }
    }

    private final String buildContentTypes(HatchMessage hatchMessage) {
        HatchDeltaTranscript hatchDeltaTranscript;
        Object objPrevious;
        List<? extends HatchContentBlock> list;
        if (hatchMessage != null && (hatchDeltaTranscript = hatchMessage.transcript) != null) {
            ListIterator listIteratorA0n = C3cG.A0n(hatchDeltaTranscript.messages);
            while (true) {
                if (!listIteratorA0n.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIteratorA0n.previous();
                if (C60Q.A1U(objPrevious)) {
                    break;
                }
            }
            HatchTranscriptMessage hatchTranscriptMessage = (HatchTranscriptMessage) objPrevious;
            if (hatchTranscriptMessage != null && (list = hatchTranscriptMessage.content) != null) {
                LinkedHashSet linkedHashSetA0k = C3cG.A0k();
                collectContentTypes(list, linkedHashSetA0k);
                if (hatchDeltaTranscript.placeholders != null && (!r0.isEmpty())) {
                    linkedHashSetA0k.add("citation");
                }
                if (!linkedHashSetA0k.isEmpty()) {
                    return C3cH.A0e(",", linkedHashSetA0k);
                }
            }
        }
        return null;
    }

    private final String buildToolCalls(HatchMessage hatchMessage) {
        HatchDeltaTranscript hatchDeltaTranscript;
        Object objPrevious;
        List<? extends HatchContentBlock> list;
        if (hatchMessage == null || (hatchDeltaTranscript = hatchMessage.transcript) == null) {
            return null;
        }
        ListIterator listIteratorA0n = C3cG.A0n(hatchDeltaTranscript.messages);
        while (true) {
            if (!listIteratorA0n.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIteratorA0n.previous();
            if (C60Q.A1U(objPrevious)) {
                break;
            }
        }
        HatchTranscriptMessage hatchTranscriptMessage = (HatchTranscriptMessage) objPrevious;
        if (hatchTranscriptMessage == null || (list = hatchTranscriptMessage.content) == null) {
            return null;
        }
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        collectToolCalls(list, linkedHashSetA0k);
        if (linkedHashSetA0k.isEmpty()) {
            return null;
        }
        return C3cH.A0e(",", linkedHashSetA0k);
    }

    public final void abortQueuedSend(String str) {
        C7384Etj.A0Y(str, 0);
        String str2 = this.deliveryIdToTurnId.get(str);
        failDeliveryTrace(str, "ws_disconnected", "WebSocketDisconnected", "Message send dropped before websocket dispatch", null);
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (isMarkerOn(734857336, str2)) {
            failTurnTrace(str2, "ws_disconnected", "WebSocketDisconnected", "Message send dropped before websocket dispatch", null);
        } else {
            cleanupTurn(str2);
        }
    }

    public final void annotateTraceEndMetrics(String str) {
        C7384Etj.A0Y(str, 0);
        AtomicInteger atomicInteger = this.followUpCounts.get(str);
        int i = atomicInteger != null ? atomicInteger.get() : 0;
        markerAnnotate(734857336, "total_messages", i + 1, str);
        markerAnnotate(734857336, "had_followups", i > 0, str);
    }

    public final PendingUserSendTrace beginUserSend(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        onSendPressed(str, i, i2);
        return new PendingUserSendTrace(str, resolveTurnIdForDelivery(str));
    }

    public final void cancelAgentSendTrace(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        endAgentSendTrace(str, (short) 4, null, null, null, str2);
    }

    public final void cancelAllAgentSendTraces(String str) {
        C7384Etj.A0Y(str, 0);
        Set<String> set = this.activeAgentSendIds;
        C7384Etj.A0T(set);
        for (String str2 : (String[]) set.toArray(new String[0])) {
            C7384Etj.A0X(str2);
            cancelAgentSendTrace(str2, str);
        }
    }

    public final void cancelAllTurnTraces(String str) {
        C7384Etj.A0Y(str, 0);
        Set<String> set = this.activeTurnIds;
        C7384Etj.A0T(set);
        for (String str2 : AbstractC0878AGe.A0X(set)) {
            C7384Etj.A0X(str2);
            if (isMarkerOn(734857336, str2)) {
                endTurnTrace(str2, (short) 4, null, null, null, null, str);
            } else {
                cleanupTurn(str2);
            }
        }
    }

    public final void cancelBackgroundAllAgentSendTraces() {
        Set<String> set = this.activeAgentSendIds;
        C7384Etj.A0T(set);
        for (String str : (String[]) set.toArray(new String[0])) {
            C7384Etj.A0X(str);
            endAgentSendTrace(str, (short) 630, null, null, null, null);
        }
    }

    public final void cleanupAgentSend(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(this.currentAgentMsgId)) {
            this.currentAgentMsgId = null;
        }
        this.activeAgentSendIds.remove(str);
        this.agentSendLoggedPoints.remove(str);
        this.agentSendDeltaCounts.remove(str);
        this.agentSendTextDeltaCounts.remove(str);
        this.agentSendPlaceholderCounts.remove(str);
        this.agentSendMediaAvailableTimestamps.remove(str);
        Set<Map.Entry<String, String>> setEntrySet = this.turnToAgentMsgId.entrySet();
        C7384Etj.A0U(setEntrySet);
        AbstractC0882AGj.A0t(setEntrySet, new AnonymousClass1(str));
    }

    public final void cleanupTurn(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(this.currentTurnId)) {
            this.currentTurnId = null;
        }
        this.activeTurnIds.remove(str);
        this.turnBoundaryReached.remove(str);
        this.followUpCounts.remove(str);
        this.correlationIdCounts.remove(str);
        this.loggedPoints.remove(str);
        this.streamDeltaCounts.remove(str);
        this.streamTextDeltaCounts.remove(str);
        this.turnCorrelationIds.remove(str);
        this.turnToAgentMsgId.remove(str);
        Set<Map.Entry<String, String>> setEntrySet = this.serverMsgToTurnId.entrySet();
        C7384Etj.A0U(setEntrySet);
        AbstractC0882AGj.A0t(setEntrySet, new C134311(str));
    }

    public final void completeAgentSendTrace(String str, HatchMessage hatchMessage) {
        C7384Etj.A0Y(str, 0);
        if (isMarkerOn(734866043, str)) {
            if (shouldAgentSendLogPoint(str, "response_rendered")) {
                markerPoint(734866043, "response_rendered", str);
            }
            markerAnnotate(734866043, "response_length", buildResponseLength(hatchMessage), str);
            String strBuildContentTypes = buildContentTypes(hatchMessage);
            if (strBuildContentTypes != null) {
                markerAnnotate(734866043, "content_types", strBuildContentTypes, str);
            }
            String strBuildToolCalls = buildToolCalls(hatchMessage);
            if (strBuildToolCalls != null) {
                markerAnnotate(734866043, "tool_calls", strBuildToolCalls, str);
            }
            markerEnd(734866043, (short) 2, str);
        }
        cleanupAgentSend(str);
    }

    public final void completeTurnTrace(String str, HatchMessage hatchMessage) {
        C7384Etj.A0Y(str, 0);
        if (isMarkerOn(734857336, str)) {
            if (shouldLogPoint(str, "response_rendered")) {
                markerPoint(734857336, "response_rendered", str);
            }
            markerAnnotate(734857336, "response_length", buildResponseLength(hatchMessage), str);
            String strBuildContentTypes = buildContentTypes(hatchMessage);
            if (strBuildContentTypes != null) {
                markerAnnotate(734857336, "content_types", strBuildContentTypes, str);
            }
            String strBuildToolCalls = buildToolCalls(hatchMessage);
            if (strBuildToolCalls != null) {
                markerAnnotate(734857336, "tool_calls", strBuildToolCalls, str);
            }
            annotateTraceEndMetrics(str);
            markerEnd(734857336, (short) 2, str);
        }
        cleanupTurn(str);
    }

    public final void endDeliveryTrace(String str) {
        C7384Etj.A0Y(str, 0);
        this.activeDeliveryIds.remove(str);
        this.deliveryIdToTurnId.remove(str);
        if (isMarkerOn(734870941, str)) {
            markerPoint(734870941, "ws_response_received", str);
            markerEnd(734870941, (short) 2, str);
        }
    }

    public final void failAgentSendTrace(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(str4, 3);
        endAgentSendTrace(str, (short) 3, str2, str3, str4, null);
    }

    public final void failAllAgentSendTraces(String str, String str2, String str3) {
        AnonymousClass005.A10(str, str2, str3);
        Set<String> set = this.activeAgentSendIds;
        C7384Etj.A0T(set);
        for (String str4 : (String[]) set.toArray(new String[0])) {
            C7384Etj.A0X(str4);
            failAgentSendTrace(str4, str, str2, str3);
        }
    }

    public final void failDeliveryAndTurn(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A14(str, str2, str3, str4);
        String strResolveTurnIdForDelivery = resolveTurnIdForDelivery(str);
        failDeliveryTrace(str, str2, str3, str4, str5);
        if (strResolveTurnIdForDelivery != null) {
            failTurnTrace(strResolveTurnIdForDelivery, str2, str3, str4, str5);
        }
    }

    public final void failTurnTrace(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(str4, 3);
        endTurnTrace(str, (short) 3, str2, str3, str4, str5, null);
    }

    public final int getStreamDeltaCount(String str) {
        C7384Etj.A0Y(str, 0);
        AtomicInteger atomicInteger = this.streamDeltaCounts.get(str);
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        return 0;
    }

    public final int getStreamTextDeltaCount(String str) {
        C7384Etj.A0Y(str, 0);
        AtomicInteger atomicInteger = this.streamTextDeltaCounts.get(str);
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        return 0;
    }

    public final String handleConversationEvent(HatchChatEvent hatchChatEvent) {
        C7384Etj.A0Y(hatchChatEvent, 0);
        String strResolveTurnIdForEvent = resolveTurnIdForEvent(hatchChatEvent);
        if (hatchChatEvent instanceof HatchChatEvent.MessageStart) {
            beginAgentSendTrace((HatchChatEvent.MessageStart) hatchChatEvent, strResolveTurnIdForEvent);
        }
        if (strResolveTurnIdForEvent != null) {
            onDeltaEvent(strResolveTurnIdForEvent, hatchChatEvent);
        }
        String strResolveAgentMsgIdForEvent = resolveAgentMsgIdForEvent(strResolveTurnIdForEvent, hatchChatEvent);
        if (strResolveAgentMsgIdForEvent != null) {
            onAgentSendDeltaEvent(strResolveAgentMsgIdForEvent, hatchChatEvent);
        }
        return strResolveTurnIdForEvent;
    }

    public final void incrementStreamDeltaCount(String str) {
        C7384Etj.A0Y(str, 0);
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = this.streamDeltaCounts;
        Object objA0a = concurrentHashMap.get(str);
        if (objA0a == null) {
            objA0a = C60R.A0a(str, concurrentHashMap);
        }
        ((AtomicInteger) objA0a).incrementAndGet();
    }

    public final void incrementStreamTextDeltaCount(String str) {
        C7384Etj.A0Y(str, 0);
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = this.streamTextDeltaCounts;
        Object objA0a = concurrentHashMap.get(str);
        if (objA0a == null) {
            objA0a = C60R.A0a(str, concurrentHashMap);
        }
        ((AtomicInteger) objA0a).incrementAndGet();
    }

    public final void markTurnBoundary(String str) {
        C7384Etj.A0Y(str, 0);
        this.turnBoundaryReached.add(str);
    }

    public final void onCancel(String str) {
        C7384Etj.A0Y(str, 0);
        cancelAllDeliveryTraces();
        cancelAllTurnTraces(str);
        cancelAllAgentSendTraces(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDeltaEvent(java.lang.String r10, com.facebook.aura.model.HatchChatEvent r11) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.perf.HatchConversationQplLogger.onDeltaEvent(java.lang.String, com.facebook.aura.model.HatchChatEvent):void");
    }

    public final void onFirstTokenRendered(String str) {
        C7384Etj.A0Y(str, 0);
        if (isMarkerOn(734857336, str) && shouldLogPoint(str, "first_text_delta_rendered")) {
            markerPoint(734857336, "first_text_delta_rendered", str);
        }
        String str2 = this.turnToAgentMsgId.get(str);
        if (str2 != null) {
            str = str2;
        }
        if (isMarkerOn(734866043, str) && shouldAgentSendLogPoint(str, "first_text_delta_rendered")) {
            markerPoint(734866043, "first_text_delta_rendered", str);
        }
    }

    public final void onOptimisticInserted(String str) {
        C7384Etj.A0Y(str, 0);
        if (isMarkerOn(734870941, str)) {
            markerPoint(734870941, "optimistic_inserted", str);
        }
    }

    public final void onWebSocketFrameSent(String str) {
        String strA0H;
        C7384Etj.A0Y(str, 0);
        if (isMarkerOn(734870941, str)) {
            markerPoint(734870941, "ws_request_sent", str);
        }
        String strResolveTurnIdForDelivery = resolveTurnIdForDelivery(str);
        if (strResolveTurnIdForDelivery == null || !isMarkerOn(734857336, strResolveTurnIdForDelivery)) {
            return;
        }
        if (str.equals(strResolveTurnIdForDelivery)) {
            strA0H = "first_message_sent";
        } else {
            AtomicInteger atomicInteger = this.followUpCounts.get(strResolveTurnIdForDelivery);
            if (atomicInteger == null) {
                return;
            }
            int i = atomicInteger.get();
            markerAnnotate(734857336, "follow_up_count", i, strResolveTurnIdForDelivery);
            strA0H = FGI.A0H("follow_up_sent_", i);
        }
        markerPoint(734857336, strA0H, strResolveTurnIdForDelivery);
    }

    public final String resolveTurnIdForDelivery(String str) {
        C7384Etj.A0Y(str, 0);
        return this.deliveryIdToTurnId.get(str);
    }

    private final void beginAgentSendTrace(HatchChatEvent.MessageStart messageStart, String str) {
        Long l;
        String str2;
        String str3 = messageStart.messageId;
        if (this.activeAgentSendIds.contains(str3)) {
            this.currentAgentMsgId = str3;
            if (str != null) {
                this.turnToAgentMsgId.put(str, str3);
                return;
            }
            return;
        }
        if (AuraAppLifecycleManager.INSTANCE.isAppInForeground()) {
            this.currentAgentMsgId = str3;
            this.activeAgentSendIds.add(str3);
            if (str != null) {
                this.turnToAgentMsgId.put(str, str3);
            }
            markerStart(734866043, str3);
            markerAnnotate(734866043, "message_id", str3, str3);
            markerAnnotate(734866043, "session_key", HatchSessionId.INSTANCE.get(), str3);
            String str4 = str != null ? this.turnCorrelationIds.get(str) : null;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            markerAnnotate(734866043, "correlation_id", str4, str3);
            HatchTranscriptMetadata hatchTranscriptMetadata = messageStart.metadata;
            markerAnnotate(734866043, "is_user_prompted", "runtime".equals(hatchTranscriptMetadata != null ? hatchTranscriptMetadata.source : null), str3);
            HatchTranscriptMetadata hatchTranscriptMetadata2 = messageStart.metadata;
            if (hatchTranscriptMetadata2 != null && (str2 = hatchTranscriptMetadata2.source) != null) {
                str5 = str2;
            }
            markerAnnotate(734866043, PhotosSearchHandlerKt.PARAM_SOURCE, str5, str3);
            HatchTranscriptMetadata hatchTranscriptMetadata3 = messageStart.metadata;
            if (hatchTranscriptMetadata3 != null && (l = hatchTranscriptMetadata3.serverStartedAtMs) != null) {
                markerAnnotate(734866043, "server_started_at_ms", String.valueOf(l.longValue()), str3);
            }
            markerPoint(734866043, "message_start_received", str3);
        }
    }

    private final int buildResponseLength(HatchMessage hatchMessage) {
        String strCollectTextFromBlocks;
        List<HatchTranscriptMessage> list;
        if (hatchMessage == null) {
            return 0;
        }
        HatchDeltaTranscript hatchDeltaTranscript = hatchMessage.transcript;
        if (hatchDeltaTranscript == null || (list = hatchDeltaTranscript.messages) == null) {
            strCollectTextFromBlocks = hatchMessage.content;
            if (strCollectTextFromBlocks == null) {
                return 0;
            }
        } else {
            ArrayList arrayListA0h = C3cG.A0h();
            for (HatchTranscriptMessage hatchTranscriptMessage : list) {
                C3cI.A1J(hatchTranscriptMessage.role, hatchTranscriptMessage, "assistant", arrayListA0h);
            }
            ArrayList arrayListA0h2 = C3cG.A0h();
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                AbstractC0882AGj.A0r(((HatchTranscriptMessage) it.next()).content, arrayListA0h2);
            }
            strCollectTextFromBlocks = HatchTranscriptKt.collectTextFromBlocks(arrayListA0h2);
        }
        return strCollectTextFromBlocks.length();
    }

    public static /* synthetic */ void endAgentSendTrace$default(HatchConversationQplLogger hatchConversationQplLogger, String str, short s, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        hatchConversationQplLogger.endAgentSendTrace(str, s, str2, str3, str4, str5);
    }

    public static /* synthetic */ void endTurnTrace$default(HatchConversationQplLogger hatchConversationQplLogger, String str, short s, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        hatchConversationQplLogger.endTurnTrace(str, s, str2, str3, str4, str5, str6);
    }

    public static /* synthetic */ void failDeliveryAndTurn$default(HatchConversationQplLogger hatchConversationQplLogger, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 16) != 0) {
            str5 = null;
        }
        hatchConversationQplLogger.failDeliveryAndTurn(str, str2, str3, str4, str5);
    }

    public static /* synthetic */ void failDeliveryTrace$default(HatchConversationQplLogger hatchConversationQplLogger, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 16) != 0) {
            str5 = null;
        }
        hatchConversationQplLogger.failDeliveryTrace(str, str2, str3, str4, str5);
    }

    public static /* synthetic */ void failTurnTrace$default(HatchConversationQplLogger hatchConversationQplLogger, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 16) != 0) {
            str5 = null;
        }
        hatchConversationQplLogger.failTurnTrace(str, str2, str3, str4, str5);
    }

    private final int getAgentSendDeltaCount(String str) {
        AtomicInteger atomicInteger = this.agentSendDeltaCounts.get(str);
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        return 0;
    }

    private final int getAgentSendPlaceholderCount(String str) {
        AtomicInteger atomicInteger = this.agentSendPlaceholderCounts.get(str);
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        return 0;
    }

    private final int getAgentSendTextDeltaCount(String str) {
        AtomicInteger atomicInteger = this.agentSendTextDeltaCounts.get(str);
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        return 0;
    }

    private final boolean hasSandboxMedia(String str) {
        return C7BY.A0q(str, ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX, false);
    }

    private final void incrementAgentSendDeltaCount(String str) {
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = this.agentSendDeltaCounts;
        Object objA0a = concurrentHashMap.get(str);
        if (objA0a == null) {
            objA0a = C60R.A0a(str, concurrentHashMap);
        }
        ((AtomicInteger) objA0a).incrementAndGet();
    }

    private final void incrementAgentSendPlaceholderCount(String str) {
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = this.agentSendPlaceholderCounts;
        Object objA0a = concurrentHashMap.get(str);
        if (objA0a == null) {
            objA0a = C60R.A0a(str, concurrentHashMap);
        }
        ((AtomicInteger) objA0a).incrementAndGet();
    }

    private final void incrementAgentSendTextDeltaCount(String str) {
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = this.agentSendTextDeltaCounts;
        Object objA0a = concurrentHashMap.get(str);
        if (objA0a == null) {
            objA0a = C60R.A0a(str, concurrentHashMap);
        }
        ((AtomicInteger) objA0a).incrementAndGet();
    }

    private final boolean onSendPressed(String str, int i, int i2) {
        this.activeDeliveryIds.add(str);
        markerStart(734870941, str);
        markerAnnotate(734870941, "request_id", str, str);
        HatchSessionId hatchSessionId = HatchSessionId.INSTANCE;
        markerAnnotate(734870941, "session_key", hatchSessionId.get(), str);
        markerAnnotate(734870941, "message_length", i, str);
        if (i2 > 0) {
            markerAnnotate(734870941, "attachment_count", i2, str);
        }
        markerPoint(734870941, "send_pressed", str);
        String str2 = this.currentTurnId;
        if (str2 != null && !this.turnBoundaryReached.contains(str2)) {
            this.deliveryIdToTurnId.put(str, str2);
            ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = this.followUpCounts;
            Object objA0a = concurrentHashMap.get(str2);
            if (objA0a == null) {
                objA0a = C60R.A0a(str2, concurrentHashMap);
            }
            ((AtomicInteger) objA0a).incrementAndGet();
            return false;
        }
        this.currentTurnId = str;
        this.activeTurnIds.add(str);
        this.deliveryIdToTurnId.put(str, str);
        markerStart(734857336, str);
        markerAnnotate(734857336, "request_id", str, str);
        markerAnnotate(734857336, "session_key", hatchSessionId.get(), str);
        markerPoint(734857336, "send_pressed", str);
        return true;
    }

    private final void recordFirstAgentSendMediaAvailable(String str) {
        this.agentSendMediaAvailableTimestamps.putIfAbsent(str, C3cI.A0O());
    }

    private final String resolveAgentMsgIdForEvent(String str, HatchChatEvent hatchChatEvent) {
        if (hatchChatEvent instanceof HatchChatEvent.MessageStart) {
            return ((HatchChatEvent.MessageStart) hatchChatEvent).messageId;
        }
        if ((hatchChatEvent instanceof HatchChatEvent.MessageDone) || (hatchChatEvent instanceof HatchChatEvent.ChatAborted) || (hatchChatEvent instanceof HatchChatEvent.DeltaText) || (hatchChatEvent instanceof HatchChatEvent.Thinking) || (hatchChatEvent instanceof HatchChatEvent.ToolStart) || (hatchChatEvent instanceof HatchChatEvent.ToolUpdate) || (hatchChatEvent instanceof HatchChatEvent.ToolDone) || (hatchChatEvent instanceof HatchChatEvent.BlockDone) || (hatchChatEvent instanceof HatchChatEvent.SubAgentTaskStatus) || (hatchChatEvent instanceof HatchChatEvent.Citation)) {
            String strResolveEventMessageId = resolveEventMessageId(hatchChatEvent);
            if (strResolveEventMessageId != null) {
                return strResolveEventMessageId;
            }
            if (str != null) {
                return this.turnToAgentMsgId.get(str);
            }
            return null;
        }
        if ((hatchChatEvent instanceof HatchChatEvent.MessageUser) || (hatchChatEvent instanceof HatchChatEvent.MessageAssistant) || (hatchChatEvent instanceof HatchChatEvent.MessagesRemoved) || (hatchChatEvent instanceof HatchChatEvent.ReactionsUpdated) || (hatchChatEvent instanceof HatchChatEvent.Marker) || (hatchChatEvent instanceof HatchChatEvent.Presentation) || (hatchChatEvent instanceof HatchChatEvent.WidgetStateUpdated)) {
            return null;
        }
        throw C3cG.A0q();
    }

    private final String resolveCurrentTurnIdForActiveAgent() {
        Map.Entry<String, String> next;
        String str = this.currentAgentMsgId;
        if (str == null) {
            return null;
        }
        Set<Map.Entry<String, String>> setEntrySet = this.turnToAgentMsgId.entrySet();
        C7384Etj.A0U(setEntrySet);
        Iterator<Map.Entry<String, String>> it = setEntrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.getValue(), str)) {
                break;
            }
        }
        Map.Entry<String, String> entry = next;
        if (entry != null) {
            return C60O.A0t(entry);
        }
        return null;
    }

    private final String resolveEventMessageId(HatchChatEvent hatchChatEvent) {
        CanonicalEventEnvelope canonicalEventEnvelope;
        HatchMessage hatchMessage;
        if (hatchChatEvent instanceof HatchChatEvent.MessageStart) {
            return ((HatchChatEvent.MessageStart) hatchChatEvent).messageId;
        }
        if (!(hatchChatEvent instanceof HatchChatEvent.MessageDone)) {
            if (hatchChatEvent instanceof HatchChatEvent.MessageUser) {
                hatchMessage = ((HatchChatEvent.MessageUser) hatchChatEvent).message;
            } else if (hatchChatEvent instanceof HatchChatEvent.MessageAssistant) {
                hatchMessage = ((HatchChatEvent.MessageAssistant) hatchChatEvent).message;
            } else if (hatchChatEvent instanceof HatchChatEvent.DeltaText) {
                canonicalEventEnvelope = ((HatchChatEvent.DeltaText) hatchChatEvent).envelope;
            } else if (hatchChatEvent instanceof HatchChatEvent.Thinking) {
                canonicalEventEnvelope = ((HatchChatEvent.Thinking) hatchChatEvent).envelope;
            } else if (hatchChatEvent instanceof HatchChatEvent.ToolStart) {
                canonicalEventEnvelope = ((HatchChatEvent.ToolStart) hatchChatEvent).envelope;
            } else if (hatchChatEvent instanceof HatchChatEvent.ToolUpdate) {
                canonicalEventEnvelope = ((HatchChatEvent.ToolUpdate) hatchChatEvent).envelope;
            } else if (hatchChatEvent instanceof HatchChatEvent.ToolDone) {
                canonicalEventEnvelope = ((HatchChatEvent.ToolDone) hatchChatEvent).envelope;
            } else if (hatchChatEvent instanceof HatchChatEvent.ChatAborted) {
                canonicalEventEnvelope = ((HatchChatEvent.ChatAborted) hatchChatEvent).envelope;
            } else if (hatchChatEvent instanceof HatchChatEvent.BlockDone) {
                canonicalEventEnvelope = ((HatchChatEvent.BlockDone) hatchChatEvent).envelope;
            } else if (hatchChatEvent instanceof HatchChatEvent.SubAgentTaskStatus) {
                canonicalEventEnvelope = ((HatchChatEvent.SubAgentTaskStatus) hatchChatEvent).envelope;
            } else {
                if (!(hatchChatEvent instanceof HatchChatEvent.Citation)) {
                    if ((hatchChatEvent instanceof HatchChatEvent.MessagesRemoved) || (hatchChatEvent instanceof HatchChatEvent.ReactionsUpdated) || (hatchChatEvent instanceof HatchChatEvent.Marker) || (hatchChatEvent instanceof HatchChatEvent.Presentation) || (hatchChatEvent instanceof HatchChatEvent.WidgetStateUpdated)) {
                        return null;
                    }
                    throw C3cG.A0q();
                }
                canonicalEventEnvelope = ((HatchChatEvent.Citation) hatchChatEvent).envelope;
            }
            return hatchMessage.id;
        }
        HatchChatEvent.MessageDone messageDone = (HatchChatEvent.MessageDone) hatchChatEvent;
        String str = messageDone.messageId;
        if (str != null) {
            return str;
        }
        canonicalEventEnvelope = messageDone.envelope;
        if (canonicalEventEnvelope != null) {
            return canonicalEventEnvelope.messageId;
        }
        return null;
    }

    private final String resolveTurnIdForEvent(HatchChatEvent hatchChatEvent) {
        String str;
        HatchMessage hatchMessage;
        String strResolveEventMessageId;
        if (hatchChatEvent instanceof HatchChatEvent.MessageStart) {
            HatchChatEvent.MessageStart messageStart = (HatchChatEvent.MessageStart) hatchChatEvent;
            String strResolveTurnId = resolveTurnId(messageStart.replyToMessageId);
            if (strResolveTurnId == null && (strResolveTurnId = resolveTurnId(messageStart.messageId)) == null) {
                strResolveTurnId = this.currentTurnId;
                if (strResolveTurnId == null) {
                    return null;
                }
                HatchTranscriptMetadata hatchTranscriptMetadata = messageStart.metadata;
                if (!"runtime".equals(hatchTranscriptMetadata != null ? hatchTranscriptMetadata.source : null)) {
                    return null;
                }
            }
            String str2 = strResolveTurnId;
            recordServerMsgToTurnMapping(messageStart.messageId, strResolveTurnId);
            return str2;
        }
        if (hatchChatEvent instanceof HatchChatEvent.DeltaText) {
            str = ((HatchChatEvent.DeltaText) hatchChatEvent).replyToMessageId;
        } else if (hatchChatEvent instanceof HatchChatEvent.Thinking) {
            str = ((HatchChatEvent.Thinking) hatchChatEvent).replyToMessageId;
        } else if (hatchChatEvent instanceof HatchChatEvent.ToolStart) {
            str = ((HatchChatEvent.ToolStart) hatchChatEvent).replyToMessageId;
        } else if (hatchChatEvent instanceof HatchChatEvent.ToolUpdate) {
            str = ((HatchChatEvent.ToolUpdate) hatchChatEvent).replyToMessageId;
        } else {
            if (!(hatchChatEvent instanceof HatchChatEvent.ToolDone)) {
                if (hatchChatEvent instanceof HatchChatEvent.MessageDone) {
                    String strResolveTurnId2 = resolveTurnId(resolveEventMessageId(hatchChatEvent));
                    if (strResolveTurnId2 != null) {
                        return strResolveTurnId2;
                    }
                    strResolveEventMessageId = ((HatchChatEvent.MessageDone) hatchChatEvent).replyToMessageId;
                } else if (hatchChatEvent instanceof HatchChatEvent.ChatAborted) {
                    str = ((HatchChatEvent.ChatAborted) hatchChatEvent).replyToMessageId;
                } else if (hatchChatEvent instanceof HatchChatEvent.BlockDone) {
                    str = ((HatchChatEvent.BlockDone) hatchChatEvent).replyToMessageId;
                } else {
                    if (!(hatchChatEvent instanceof HatchChatEvent.SubAgentTaskStatus)) {
                        if (hatchChatEvent instanceof HatchChatEvent.MessageUser) {
                            hatchMessage = ((HatchChatEvent.MessageUser) hatchChatEvent).message;
                        } else if (hatchChatEvent instanceof HatchChatEvent.MessageAssistant) {
                            hatchMessage = ((HatchChatEvent.MessageAssistant) hatchChatEvent).message;
                        } else {
                            if ((hatchChatEvent instanceof HatchChatEvent.MessagesRemoved) || (hatchChatEvent instanceof HatchChatEvent.ReactionsUpdated)) {
                                return null;
                            }
                            if (!(hatchChatEvent instanceof HatchChatEvent.Citation)) {
                                if ((hatchChatEvent instanceof HatchChatEvent.Marker) || (hatchChatEvent instanceof HatchChatEvent.Presentation) || (hatchChatEvent instanceof HatchChatEvent.WidgetStateUpdated)) {
                                    return null;
                                }
                                throw C3cG.A0q();
                            }
                            str = ((HatchChatEvent.Citation) hatchChatEvent).replyToMessageId;
                        }
                        return resolveTurnId(hatchMessage.id);
                    }
                    strResolveEventMessageId = resolveEventMessageId(hatchChatEvent);
                }
                String strResolveTurnId3 = resolveTurnId(strResolveEventMessageId);
                return strResolveTurnId3 == null ? resolveFallbackTurnIdForDeltaEvent() : strResolveTurnId3;
            }
            str = ((HatchChatEvent.ToolDone) hatchChatEvent).replyToMessageId;
        }
        return resolveDeltaTurnId(str, hatchChatEvent);
    }

    private final boolean shouldAgentSendLogPoint(String str, String str2) {
        Set<String> setPutIfAbsent;
        ConcurrentHashMap<String, Set<String>> concurrentHashMap = this.agentSendLoggedPoints;
        Set<String> setA18 = concurrentHashMap.get(str);
        if (setA18 == null && (setPutIfAbsent = concurrentHashMap.putIfAbsent(str, (setA18 = C60O.A18()))) != null) {
            setA18 = setPutIfAbsent;
        }
        return setA18.add(str2);
    }

    public final void cancelAllDeliveryTraces() {
        Set<String> set = this.activeDeliveryIds;
        C7384Etj.A0T(set);
        Iterator it = AbstractC0878AGe.A0X(set).iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            C7384Etj.A0X(strA0j);
            if (isMarkerOn(734870941, strA0j)) {
                markerEnd(734870941, (short) 4, strA0j);
            }
            this.activeDeliveryIds.remove(strA0j);
            this.deliveryIdToTurnId.remove(strA0j);
        }
    }

    public final String getCurrentAgentMsgId() {
        return this.currentAgentMsgId;
    }

    public final String getCurrentTurnId() {
        return this.currentTurnId;
    }

    public final String resolveTurnId(String str) {
        String str2;
        if (str == null || (str2 = this.serverMsgToTurnId.get(str)) == null) {
            return null;
        }
        return str2;
    }

    private final void collectContentTypes(List<? extends HatchContentBlock> list, Set<String> set) {
        for (HatchContentBlock hatchContentBlock : list) {
            if (hatchContentBlock instanceof HatchContentBlock.TextBlock) {
                HatchContentBlock.TextBlock textBlock = (HatchContentBlock.TextBlock) hatchContentBlock;
                if (!C7BY.A0j(textBlock.text)) {
                    set.add("text");
                }
                if (C7BY.A0q(textBlock.text, "```", false)) {
                    set.add(AuraDeeplinkRouteMapper.CODE_PARAM);
                }
                if (C7BY.A0q(textBlock.text, "```mermaid", false)) {
                    set.add(MermaidExtension.LANGUAGE);
                }
                set.addAll(detectSandboxMediaTypes(textBlock.text));
            } else if (hatchContentBlock instanceof HatchContentBlock.ToolCallBlock) {
                continue;
            } else if (hatchContentBlock instanceof HatchContentBlock.SubAgentBlock) {
                set.add(HatchContentBlockSerializer.TYPE_SUB_AGENT);
                List<HatchContentBlock> list2 = ((HatchContentBlock.SubAgentBlock) hatchContentBlock).content;
                if (list2 != null) {
                    collectContentTypes(list2, set);
                }
            } else if (!(hatchContentBlock instanceof HatchContentBlock.ThinkingBlock)) {
                throw C3cG.A0q();
            }
        }
    }

    private final void collectToolCalls(List<? extends HatchContentBlock> list, Set<String> set) {
        for (HatchContentBlock hatchContentBlock : list) {
            if (hatchContentBlock instanceof HatchContentBlock.ToolCallBlock) {
                HatchContentBlock.ToolCallBlock toolCallBlock = (HatchContentBlock.ToolCallBlock) hatchContentBlock;
                String str = toolCallBlock.name;
                if (str.length() == 0) {
                    str = toolCallBlock.toolType;
                }
                if (str.length() > 0) {
                    set.add(str);
                }
            } else if (hatchContentBlock instanceof HatchContentBlock.SubAgentBlock) {
                List<HatchContentBlock> list2 = ((HatchContentBlock.SubAgentBlock) hatchContentBlock).content;
                if (list2 != null) {
                    collectToolCalls(list2, set);
                }
            } else if (!(hatchContentBlock instanceof HatchContentBlock.TextBlock) && !(hatchContentBlock instanceof HatchContentBlock.ThinkingBlock)) {
                throw C3cG.A0q();
            }
        }
    }

    private final long currentMonotonicTimestampMs() {
        return SystemClock.elapsedRealtime();
    }

    private final Set<String> detectSandboxMediaTypes(String str) {
        String str2;
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        int iA0B = C7BY.A0B(str, ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX, 0, false);
        while (iA0B >= 0) {
            int iA08 = C7BY.A08(str, ')', iA0B);
            if (iA08 < 0) {
                break;
            }
            String strA0u = AnonymousClass001.A0u(str.substring(iA0B, iA08));
            if (strA0u.endsWith(AuraBugReportSender.DEFAULT_IMAGE_EXTENSION) || strA0u.endsWith(".jpeg") || strA0u.endsWith(".png") || strA0u.endsWith(".webp")) {
                str2 = "image";
            } else if (strA0u.endsWith(AuraBugReportSender.DEFAULT_VIDEO_EXTENSION) || strA0u.endsWith(".mov") || strA0u.endsWith(".webm")) {
                str2 = "video";
            } else {
                iA0B = C7BY.A0B(str, ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX, iA08, false);
            }
            linkedHashSetA0k.add(str2);
            iA0B = C7BY.A0B(str, ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX, iA08, false);
        }
        return linkedHashSetA0k;
    }

    private final void endAgentSendTrace(String str, short s, String str2, String str3, String str4, String str5) {
        if (isMarkerOn(734866043, str)) {
            if (str2 != null) {
                markerAnnotate(734866043, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str2, str);
            }
            if (str3 != null) {
                markerAnnotate(734866043, "error_type", str3, str);
            }
            if (str4 != null) {
                markerAnnotate(734866043, HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, C6tn.A03(str4), str);
            }
            if (str5 != null) {
                markerAnnotate(734866043, "cancel_reason", str5, str);
            }
            markerEnd(734866043, s, str);
        }
        cleanupAgentSend(str);
    }

    private final void endTurnTrace(String str, short s, String str2, String str3, String str4, String str5, String str6) {
        if (isMarkerOn(734857336, str)) {
            if (str2 != null) {
                markerAnnotate(734857336, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str2, str);
            }
            if (str3 != null) {
                markerAnnotate(734857336, "error_type", str3, str);
            }
            if (str4 != null) {
                markerAnnotate(734857336, HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, C6tn.A03(str4), str);
            }
            if (str5 != null) {
                markerAnnotate(734857336, "error_code", str5, str);
            }
            if (str6 != null) {
                markerAnnotate(734857336, "cancel_reason", str6, str);
            }
            annotateTraceEndMetrics(str);
            markerEnd(734857336, s, str);
        }
        cleanupTurn(str);
    }

    private final QuickPerformanceLogger getQpl() {
        return C60O.A0g();
    }

    private final boolean hasAsyncImageToolResult(HatchToolCallResult hatchToolCallResult) {
        return C60S.A06(hatchToolCallResult);
    }

    private final boolean isMarkerOn(int i, String str) {
        return C60O.A0g().isMarkerOn(i, str.hashCode());
    }

    private final void markerAnnotate(int i, String str, int i2, String str2) {
        C60O.A0g().markerAnnotate(i, str2.hashCode(), str, i2);
    }

    private final void markerEnd(int i, short s, String str) {
        C60O.A0g().markerEnd(i, str.hashCode(), s);
    }

    private final void markerPoint(int i, String str, String str2) {
        C60O.A0g().markerPoint(i, str2.hashCode(), str);
    }

    private final void markerStart(int i, String str) {
        C60O.A0g().markerStart(i, str.hashCode());
    }

    private final void onAgentSendDeltaEvent(String str, HatchChatEvent hatchChatEvent) {
        String str2;
        String str3;
        HatchDeltaTranscript hatchDeltaTranscriptFromJson;
        if (isMarkerOn(734866043, str)) {
            if (!(hatchChatEvent instanceof HatchChatEvent.MessageStart)) {
                if (hatchChatEvent instanceof HatchChatEvent.DeltaText) {
                    if (shouldAgentSendLogPoint(str, "first_text_delta_received")) {
                        markerPoint(734866043, "first_text_delta_received", str);
                    }
                    incrementAgentSendTextDeltaCount(str);
                } else if (!(hatchChatEvent instanceof HatchChatEvent.Thinking) && !(hatchChatEvent instanceof HatchChatEvent.ToolStart) && !(hatchChatEvent instanceof HatchChatEvent.ToolUpdate)) {
                    if (hatchChatEvent instanceof HatchChatEvent.ToolDone) {
                        incrementAgentSendDeltaCount(str);
                        if (C60S.A06(((HatchChatEvent.ToolDone) hatchChatEvent).result) && shouldAgentSendLogPoint(str, "first_media_received")) {
                            markerPoint(734866043, "first_media_received", str);
                            recordFirstAgentSendMediaAvailable(str);
                            return;
                        }
                        return;
                    }
                    if (!(hatchChatEvent instanceof HatchChatEvent.BlockDone) && !(hatchChatEvent instanceof HatchChatEvent.SubAgentTaskStatus)) {
                        if (hatchChatEvent instanceof HatchChatEvent.Citation) {
                            incrementAgentSendPlaceholderCount(str);
                            incrementAgentSendDeltaCount(str);
                            if (((HatchChatEvent.Citation) hatchChatEvent).citation.resolved || !shouldAgentSendLogPoint(str, "first_placeholder_received")) {
                                return;
                            }
                            markerPoint(734866043, "first_placeholder_received", str);
                            return;
                        }
                        if (!(hatchChatEvent instanceof HatchChatEvent.MessageDone)) {
                            if (!(hatchChatEvent instanceof HatchChatEvent.ChatAborted) && !(hatchChatEvent instanceof HatchChatEvent.MessagesRemoved) && !(hatchChatEvent instanceof HatchChatEvent.ReactionsUpdated) && !(hatchChatEvent instanceof HatchChatEvent.MessageUser) && !(hatchChatEvent instanceof HatchChatEvent.MessageAssistant) && !(hatchChatEvent instanceof HatchChatEvent.Marker) && !(hatchChatEvent instanceof HatchChatEvent.Presentation) && !(hatchChatEvent instanceof HatchChatEvent.WidgetStateUpdated)) {
                                throw C3cG.A0q();
                            }
                            return;
                        }
                        incrementAgentSendDeltaCount(str);
                        if (shouldAgentSendLogPoint(str, "message_done")) {
                            markerPoint(734866043, "message_done", str);
                            markerAnnotate(734866043, "deltas_received", getAgentSendDeltaCount(str), str);
                            markerAnnotate(734866043, "text_deltas_received", getAgentSendTextDeltaCount(str), str);
                            markerAnnotate(734866043, "placeholders_received", getAgentSendPlaceholderCount(str), str);
                            markerAnnotate(734866043, "done_status", ((HatchChatEvent.MessageDone) hatchChatEvent).status, str);
                        }
                        HatchChatEvent.MessageDone messageDone = (HatchChatEvent.MessageDone) hatchChatEvent;
                        JsonElement jsonElement = messageDone.transcriptJson;
                        if (jsonElement != null && (hatchDeltaTranscriptFromJson = HatchDeltaTranscript.Companion.fromJson(jsonElement)) != null && HatchTranscriptKt.hasAsyncMediaContent(hatchDeltaTranscriptFromJson) && shouldAgentSendLogPoint(str, "first_media_received")) {
                            markerPoint(734866043, "first_media_received", str);
                            recordFirstAgentSendMediaAvailable(str);
                        }
                        String str4 = messageDone.status;
                        if ("failed".equals(str4)) {
                            str2 = messageDone.error;
                            if (str2 == null) {
                                str2 = "unknown";
                            }
                            str3 = "server_error";
                        } else {
                            str2 = HatchConversationRepositoryKt.TERMINAL_STATUS_INTERRUPTED;
                            if (!HatchConversationRepositoryKt.TERMINAL_STATUS_INTERRUPTED.equals(str4)) {
                                return;
                            }
                            String str5 = messageDone.error;
                            if (str5 != null) {
                                str2 = str5;
                            }
                            str3 = "server_interrupted";
                        }
                        failAgentSendTrace(str, str3, str3, str2);
                        return;
                    }
                }
            }
            incrementAgentSendDeltaCount(str);
        }
    }

    public static /* synthetic */ boolean onSendPressed$default(HatchConversationQplLogger hatchConversationQplLogger, String str, int i, int i2, int i3, Object obj) {
        int iA01 = C3cG.A01(i3, i);
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return hatchConversationQplLogger.onSendPressed(str, iA01, i2);
    }

    private final String resolveDeltaTurnId(String str, HatchChatEvent hatchChatEvent) {
        String strResolveTurnId = resolveTurnId(str);
        if (strResolveTurnId != null) {
            return strResolveTurnId;
        }
        String strResolveTurnId2 = resolveTurnId(resolveEventMessageId(hatchChatEvent));
        return strResolveTurnId2 == null ? resolveFallbackTurnIdForDeltaEvent() : strResolveTurnId2;
    }

    private final String resolveFallbackTurnIdForDeltaEvent() {
        String strResolveCurrentTurnIdForActiveAgent = resolveCurrentTurnIdForActiveAgent();
        if (strResolveCurrentTurnIdForActiveAgent != null) {
            return strResolveCurrentTurnIdForActiveAgent;
        }
        if (this.currentAgentMsgId == null) {
            return this.currentTurnId;
        }
        return null;
    }

    public final void failAllDeliveryTraces(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        Set<String> set = this.activeDeliveryIds;
        C7384Etj.A0T(set);
        Iterator it = AbstractC0878AGe.A0X(set).iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            C7384Etj.A0X(strA0j);
            if (isMarkerOn(734870941, strA0j)) {
                markerAnnotate(734870941, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str, strA0j);
                markerAnnotate(734870941, "error_type", str2, strA0j);
                markerAnnotate(734870941, HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, C6tn.A03(str3), strA0j);
                markerEnd(734870941, (short) 3, strA0j);
            }
            this.activeDeliveryIds.remove(strA0j);
            this.deliveryIdToTurnId.remove(strA0j);
        }
    }

    public final void failAllTraces(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        failAllDeliveryTraces(str, str2, str3);
        failAllTurnTraces(str, str2, str3, str4);
        failAllAgentSendTraces(str, str2, str3);
    }

    public final void failAllTurnTraces(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        Set<String> set = this.activeTurnIds;
        C7384Etj.A0T(set);
        for (String str5 : AbstractC0878AGe.A0X(set)) {
            C7384Etj.A0X(str5);
            failTurnTrace(str5, str, str2, str3, str4);
        }
    }

    public final void failDeliveryTrace(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(str4, 3);
        if (isMarkerOn(734870941, str)) {
            markerAnnotate(734870941, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str2, str);
            markerAnnotate(734870941, "error_type", str3, str);
            markerAnnotate(734870941, HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, C6tn.A03(str4), str);
            if (str5 != null) {
                markerAnnotate(734870941, "error_code", str5, str);
            }
            markerEnd(734870941, (short) 3, str);
        }
        this.activeDeliveryIds.remove(str);
        this.deliveryIdToTurnId.remove(str);
    }

    public final void onMessageIdReceived(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        String strResolveTurnIdForDelivery = resolveTurnIdForDelivery(str);
        if (strResolveTurnIdForDelivery != null) {
            recordServerMsgToTurnMapping(str2, strResolveTurnIdForDelivery);
        }
        if (str3 != null) {
            markerAnnotate(734870941, "correlation_id", str3, str);
            if (strResolveTurnIdForDelivery != null) {
                recordSessionCorrelationId(strResolveTurnIdForDelivery, str3);
            }
        }
    }

    public final void onStopGeneration() {
        cancelAllDeliveryTraces();
        cancelAllTurnTraces("stop_button");
        cancelAllAgentSendTraces("stop_button");
    }

    public final void recordServerMsgToTurnMapping(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.serverMsgToTurnId.put(str, str2);
    }

    public final void recordSessionCorrelationId(String str, String str2) {
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        this.turnCorrelationIds.put(str, str2);
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = this.correlationIdCounts;
        Object obj = concurrentHashMap.get(str);
        Object objA0a = obj;
        if (obj == null) {
            objA0a = C60R.A0a(str, concurrentHashMap);
        }
        int iIncrementAndGet = ((AtomicInteger) objA0a).incrementAndGet();
        markerAnnotate(734857336, iIncrementAndGet == zA1a ? "correlation_id" : FGI.A0H("follow_up_correlation_id_", iIncrementAndGet - (zA1a ? 1 : 0)), str2, str);
    }

    public final boolean shouldLogPoint(String str, String str2) {
        Set<String> setPutIfAbsent;
        AnonymousClass003.A0u(str, str2);
        ConcurrentHashMap<String, Set<String>> concurrentHashMap = this.loggedPoints;
        Set<String> setA18 = concurrentHashMap.get(str);
        if (setA18 == null && (setPutIfAbsent = concurrentHashMap.putIfAbsent(str, (setA18 = C60O.A18()))) != null) {
            setA18 = setPutIfAbsent;
        }
        return setA18.add(str2);
    }

    private final void markerAnnotate(int i, String str, String str2, String str3) {
        C60O.A0g().markerAnnotate(i, str3.hashCode(), str, str2);
    }

    private final void markerAnnotate(int i, String str, boolean z, String str2) {
        C60O.A0g().markerAnnotate(i, str2.hashCode(), str, z);
    }
}
