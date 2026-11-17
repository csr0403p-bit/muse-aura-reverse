package com.facebook.aura.gateway;

import X.AIW;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C0924AIa;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.FGI;
import X.HxE;
import com.facebook.aura.model.CanonicalEventEnvelope;
import com.facebook.aura.model.HatchBlockStatus;
import com.facebook.aura.model.HatchChatEvent;
import com.facebook.aura.model.HatchCitation;
import com.facebook.aura.model.HatchContentBlock;
import com.facebook.aura.model.HatchContentBlockSerializer;
import com.facebook.aura.model.HatchDeltaTranscript;
import com.facebook.aura.model.HatchLifecycleSummaryEntry;
import com.facebook.aura.model.HatchPlaceholderEntry;
import com.facebook.aura.model.HatchTextEntitySegment;
import com.facebook.aura.model.HatchToolCallRequest;
import com.facebook.aura.model.HatchToolCallResult;
import com.facebook.aura.model.HatchToolCallStatus;
import com.facebook.aura.model.HatchTranscriptMessage;
import com.facebook.aura.model.HatchTranscriptMetadata;
import com.facebook.aura.model.HatchTranscriptStatus;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchDeltaAccumulator {
    public static final int $stable = 8;
    public String fallbackText;
    public final Object lock = C3cG.A0T();
    public final IdentityHashMap<List<HatchContentBlock>, PendingTextBuffer> pendingTextBuffers = new IdentityHashMap<>();
    public List<HatchTextEntitySegment> segments;
    public HatchDeltaTranscript transcript;
    public List<HatchWidget> widgets;

    public final class PendingTextBuffer {
        public final int blockIndex;
        public final StringBuilder text;
        public final boolean thinking;

        public PendingTextBuffer(int i, boolean z, StringBuilder sb) {
            C7384Etj.A0Y(sb, 2);
            this.blockIndex = i;
            this.thinking = z;
            this.text = sb;
        }

        public final int getBlockIndex() {
            return this.blockIndex;
        }

        public final StringBuilder getText() {
            return this.text;
        }

        public final boolean getThinking() {
            return this.thinking;
        }
    }

    public final class Snapshot {
        public static final int $stable = HatchDeltaTranscript.$stable;
        public final String fallbackText;
        public final List<HatchTextEntitySegment> segments;
        public final String text;
        public final HatchDeltaTranscript transcript;
        public final List<HatchWidget> widgets;

        public final String getFallbackText() {
            return this.fallbackText;
        }

        public final List<HatchTextEntitySegment> getSegments() {
            return this.segments;
        }

        public final String getText() {
            return this.text;
        }

        public final HatchDeltaTranscript getTranscript() {
            return this.transcript;
        }

        public final List<HatchWidget> getWidgets() {
            return this.widgets;
        }

        public Snapshot(HatchDeltaTranscript hatchDeltaTranscript, List<HatchWidget> list, String str, List<HatchTextEntitySegment> list2, String str2) {
            AnonymousClass003.A0v(hatchDeltaTranscript, str);
            this.transcript = hatchDeltaTranscript;
            this.widgets = list;
            this.text = str;
            this.segments = list2;
            this.fallbackText = str2;
        }
    }

    private final void ensureTranscript(String str, String str2) {
        String strA0B = str;
        if (this.transcript == null) {
            if (str == null) {
                strA0B = str2 == null ? FGI.A0B(System.currentTimeMillis(), "auto_") : str2;
            }
            int i = HatchTranscriptMessage.$stable;
            HatchTranscriptMessage hatchTranscriptMessage = new HatchTranscriptMessage(strA0B, "assistant", C3cG.A0h(), "streaming", System.currentTimeMillis());
            int i2 = HatchDeltaTranscript.$stable;
            this.transcript = new HatchDeltaTranscript(strA0B, null, null, str2, HatchTranscriptStatus.STREAMING, AbstractC0885AGm.A0y(hatchTranscriptMessage), null, null);
        }
    }

    private final HatchContentBlock.SubAgentBlock findSubAgentByBlockId(String str) {
        List<HatchContentBlock> assistantContent;
        Object obj = null;
        if (str == null || (assistantContent = getAssistantContent()) == null) {
            return null;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchContentBlock hatchContentBlock : assistantContent) {
            if (hatchContentBlock instanceof HatchContentBlock.SubAgentBlock) {
                arrayListA0h.add(hatchContentBlock);
            }
        }
        Iterator it = arrayListA0h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (str.equals(((HatchContentBlock.SubAgentBlock) next).blockId)) {
                obj = next;
                break;
            }
        }
        return (HatchContentBlock.SubAgentBlock) obj;
    }

    private final void handleTurnStart(HatchChatEvent.MessageStart messageStart) {
        this.widgets = null;
        this.segments = null;
        this.fallbackText = null;
        this.pendingTextBuffers.clear();
        int i = HatchTranscriptMessage.$stable;
        String str = messageStart.messageId;
        ArrayList arrayListA0h = C3cG.A0h();
        HatchTranscriptMetadata hatchTranscriptMetadata = messageStart.metadata;
        HatchTranscriptMessage hatchTranscriptMessage = new HatchTranscriptMessage(str, "assistant", arrayListA0h, "streaming", hatchTranscriptMetadata != null ? hatchTranscriptMetadata.startedAtMs : System.currentTimeMillis());
        int i2 = HatchDeltaTranscript.$stable;
        this.transcript = new HatchDeltaTranscript(messageStart.messageId, messageStart.agentId, null, messageStart.replyToMessageId, HatchTranscriptStatus.STREAMING, AbstractC0885AGm.A0y(hatchTranscriptMessage), messageStart.metadata, null);
    }

    private final void resetLocked() {
        this.transcript = null;
        this.widgets = null;
        this.segments = null;
        this.fallbackText = null;
        this.pendingTextBuffers.clear();
    }

    public final void apply(HatchChatEvent hatchChatEvent) {
        C7384Etj.A0Y(hatchChatEvent, 0);
        synchronized (this.lock) {
            applyLocked(hatchChatEvent);
        }
    }

    public final boolean resetIfOwnedBy(String str) {
        boolean z;
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            HatchDeltaTranscript hatchDeltaTranscript = this.transcript;
            if (str.equals(hatchDeltaTranscript != null ? hatchDeltaTranscript.messageId : null)) {
                resetLocked();
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r6.add(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void accumulateWidgets(java.util.List<com.facebook.aura.model.HatchWidget> r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L56
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L56
            java.util.List<com.facebook.aura.model.HatchWidget> r0 = r7.widgets
            if (r0 != 0) goto Le
            X.AGi r0 = X.C0881AGi.A00
        Le:
            java.util.ArrayList r6 = X.AbstractC0878AGe.A0R(r0)
            java.util.Iterator r5 = r8.iterator()
        L16:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r4 = r5.next()
            com.facebook.aura.model.HatchWidget r4 = (com.facebook.aura.model.HatchWidget) r4
            java.util.Iterator r3 = r6.iterator()
            r2 = 0
        L27:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r3.next()
            com.facebook.aura.model.HatchWidget r0 = (com.facebook.aura.model.HatchWidget) r0
            java.lang.String r1 = r0.widgetId
            java.lang.String r0 = r4.widgetId
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L4d
            if (r2 < 0) goto L50
            java.lang.Object r0 = r6.get(r2)
            com.facebook.aura.model.HatchWidget r0 = (com.facebook.aura.model.HatchWidget) r0
            com.facebook.aura.model.HatchWidget r0 = com.facebook.aura.model.HatchWidgetPresentationKt.preserveWidgetState(r0, r4)
            r6.set(r2, r0)
            goto L16
        L4d:
            int r2 = r2 + 1
            goto L27
        L50:
            r6.add(r4)
            goto L16
        L54:
            r7.widgets = r6
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchDeltaAccumulator.accumulateWidgets(java.util.List):void");
    }

    private final void appendLifecycleSummary(String str, String str2, String str3) {
        String strA0l;
        HatchDeltaTranscript hatchDeltaTranscript;
        HatchTranscriptMetadata hatchTranscriptMetadata;
        if (str3 == null || (strA0l = AnonymousClass002.A0l(str3)) == null || strA0l.length() <= 0 || (hatchDeltaTranscript = this.transcript) == null || (hatchTranscriptMetadata = hatchDeltaTranscript.metadata) == null) {
            return;
        }
        hatchTranscriptMetadata.lifecycleSummaries.add(new HatchLifecycleSummaryEntry(str, str2, strA0l, System.currentTimeMillis()));
    }

    private final String collectTextLocked() {
        HatchDeltaTranscript hatchDeltaTranscript = this.transcript;
        if (hatchDeltaTranscript == null) {
            return "";
        }
        StringBuilder sbA0w = C60O.A0w();
        for (HatchTranscriptMessage hatchTranscriptMessage : hatchDeltaTranscript.messages) {
            if ("assistant".equals(hatchTranscriptMessage.role)) {
                appendCollectedText(sbA0w, hatchTranscriptMessage.content);
            }
        }
        return sbA0w.toString();
    }

    private final HatchDeltaTranscript detached(HatchDeltaTranscript hatchDeltaTranscript) {
        List<HatchTranscriptMessage> list = hatchDeltaTranscript.messages;
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchTranscriptMessage hatchTranscriptMessage : list) {
            arrayListA0h.add(hatchTranscriptMessage.copy(hatchTranscriptMessage.id, hatchTranscriptMessage.role, detachedBlocks(hatchTranscriptMessage.content), hatchTranscriptMessage.status, hatchTranscriptMessage.createdAtMs));
        }
        HatchTranscriptMetadata hatchTranscriptMetadata = hatchDeltaTranscript.metadata;
        HatchTranscriptMetadata hatchTranscriptMetadataCopy = hatchTranscriptMetadata != null ? hatchTranscriptMetadata.copy(hatchTranscriptMetadata.model, hatchTranscriptMetadata.source, hatchTranscriptMetadata.startedAtMs, hatchTranscriptMetadata.serverStartedAtMs, hatchTranscriptMetadata.completedAtMs, hatchTranscriptMetadata.statusNarration, AbstractC0878AGe.A0R(hatchTranscriptMetadata.lifecycleSummaries), hatchTranscriptMetadata.isSpokenSummary) : null;
        Map<String, HatchPlaceholderEntry> map = hatchDeltaTranscript.placeholders;
        LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : null;
        String str = hatchDeltaTranscript.messageId;
        String str2 = hatchDeltaTranscript.agentId;
        String str3 = hatchDeltaTranscript.sessionId;
        String str4 = hatchDeltaTranscript.replyToMessageId;
        HatchTranscriptStatus hatchTranscriptStatus = hatchDeltaTranscript.status;
        AnonymousClass003.A0y(hatchTranscriptStatus, arrayListA0h);
        return new HatchDeltaTranscript(str, str2, str3, str4, hatchTranscriptStatus, arrayListA0h, hatchTranscriptMetadataCopy, linkedHashMap);
    }

    private final void flushPendingText(List<HatchContentBlock> list) {
        PendingTextBuffer pendingTextBufferRemove = this.pendingTextBuffers.remove(list);
        if (pendingTextBufferRemove != null) {
            publishPendingText(list, pendingTextBufferRemove);
        }
    }

    private final void flushPendingTextLocked() {
        Iterator itA0i = C3cG.A0i(this.pendingTextBuffers);
        while (itA0i.hasNext()) {
            Object next = itA0i.next();
            C7384Etj.A0U(next);
            Map.Entry entry = (Map.Entry) next;
            Object key = entry.getKey();
            C7384Etj.A0U(key);
            Object value = entry.getValue();
            C7384Etj.A0U(value);
            if (!publishPendingText((List) key, (PendingTextBuffer) value)) {
                itA0i.remove();
            }
        }
    }

    private final List<HatchContentBlock> getAssistantContent() {
        List<HatchTranscriptMessage> list;
        Object objPrevious;
        HatchDeltaTranscript hatchDeltaTranscript = this.transcript;
        if (hatchDeltaTranscript != null && (list = hatchDeltaTranscript.messages) != null) {
            ListIterator listIteratorA0n = C3cG.A0n(list);
            while (true) {
                if (!listIteratorA0n.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIteratorA0n.previous();
                if ("assistant".equals(((HatchTranscriptMessage) objPrevious).role)) {
                    break;
                }
            }
            HatchTranscriptMessage hatchTranscriptMessage = (HatchTranscriptMessage) objPrevious;
            if (hatchTranscriptMessage != null) {
                return hatchTranscriptMessage.content;
            }
        }
        return null;
    }

    private final void handleAgentDone(HatchChatEvent.SubAgentTaskStatus subAgentTaskStatus) {
        String str;
        List<HatchContentBlock> assistantContent;
        String str2 = subAgentTaskStatus.status;
        if (("completed".equals(str2) || "failed".equals(str2)) && (str = subAgentTaskStatus.agentId) != null) {
            appendLifecycleSummary(str, "agent_done", subAgentTaskStatus.summary);
            HatchContentBlock.SubAgentBlock subAgentBlockFindSubAgentByAgentId = findSubAgentByAgentId(str);
            if ((subAgentBlockFindSubAgentByAgentId == null && (subAgentBlockFindSubAgentByAgentId = findSubAgentByBlockId(subAgentTaskStatus.taskId)) == null) || (assistantContent = getAssistantContent()) == null) {
                return;
            }
            Iterator<HatchContentBlock> it = assistantContent.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next() == subAgentBlockFindSubAgentByAgentId) {
                    if (i >= 0) {
                        String str3 = subAgentTaskStatus.status;
                        String str4 = subAgentTaskStatus.summary;
                        if (str4 == null) {
                            str4 = subAgentBlockFindSubAgentByAgentId.summary;
                        }
                        Long l = subAgentTaskStatus.completedAtMs;
                        Long lValueOf = Long.valueOf(l != null ? l.longValue() : System.currentTimeMillis());
                        int i2 = HatchContentBlock.SubAgentBlock.$stable;
                        assistantContent.set(i, subAgentBlockFindSubAgentByAgentId.copy(subAgentBlockFindSubAgentByAgentId.blockId, subAgentBlockFindSubAgentByAgentId.agentId, subAgentBlockFindSubAgentByAgentId.toolId, str3, str4, subAgentBlockFindSubAgentByAgentId.promptPreview, subAgentBlockFindSubAgentByAgentId.content, subAgentBlockFindSubAgentByAgentId.startedAtMs, lValueOf));
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    private final void handleBlockDone(HatchChatEvent.BlockDone blockDone) {
        List<HatchContentBlock> assistantContent;
        int iA00;
        HatchContentBlock hatchContentBlockCopy;
        if (this.transcript == null || (assistantContent = getAssistantContent()) == null) {
            return;
        }
        String str = blockDone.blockType;
        if ("text".equals(str)) {
            iA00 = C60O.A00(assistantContent);
            if (iA00 < 0) {
                return;
            }
            while (true) {
                int i = iA00 - 1;
                HatchContentBlock hatchContentBlock = assistantContent.get(iA00);
                if (hatchContentBlock instanceof HatchContentBlock.TextBlock) {
                    HatchContentBlock.TextBlock textBlock = (HatchContentBlock.TextBlock) hatchContentBlock;
                    if (textBlock.status == HatchBlockStatus.STREAMING) {
                        hatchContentBlockCopy = textBlock.copy(textBlock.id, textBlock.text, HatchBlockStatus.DONE);
                        break;
                    }
                }
                if (i < 0) {
                    return;
                } else {
                    iA00 = i;
                }
            }
        } else {
            if (!HatchContentBlockSerializer.TYPE_THINKING.equals(str) || (iA00 = C60O.A00(assistantContent)) < 0) {
                return;
            }
            while (true) {
                int i2 = iA00 - 1;
                HatchContentBlock hatchContentBlock2 = assistantContent.get(iA00);
                if (hatchContentBlock2 instanceof HatchContentBlock.ThinkingBlock) {
                    HatchContentBlock.ThinkingBlock thinkingBlock = (HatchContentBlock.ThinkingBlock) hatchContentBlock2;
                    if (thinkingBlock.status == HatchBlockStatus.STREAMING) {
                        hatchContentBlockCopy = thinkingBlock.copy(thinkingBlock.id, thinkingBlock.text, HatchBlockStatus.DONE);
                        break;
                    }
                }
                if (i2 < 0) {
                    return;
                } else {
                    iA00 = i2;
                }
            }
        }
        assistantContent.set(iA00, hatchContentBlockCopy);
    }

    private final void handlePlaceholder(HatchChatEvent.Citation citation) {
        HatchDeltaTranscript hatchDeltaTranscript = this.transcript;
        if (hatchDeltaTranscript != null) {
            Map mapA0j = hatchDeltaTranscript.placeholders;
            if (mapA0j == null) {
                mapA0j = C3cG.A0j();
                String str = hatchDeltaTranscript.messageId;
                String str2 = hatchDeltaTranscript.agentId;
                String str3 = hatchDeltaTranscript.sessionId;
                String str4 = hatchDeltaTranscript.replyToMessageId;
                HatchTranscriptStatus hatchTranscriptStatus = hatchDeltaTranscript.status;
                List<HatchTranscriptMessage> list = hatchDeltaTranscript.messages;
                HatchTranscriptMetadata hatchTranscriptMetadata = hatchDeltaTranscript.metadata;
                AnonymousClass003.A0y(hatchTranscriptStatus, list);
                this.transcript = new HatchDeltaTranscript(str, str2, str3, str4, hatchTranscriptStatus, list, hatchTranscriptMetadata, mapA0j);
            }
            HatchCitation hatchCitation = citation.citation;
            String str5 = hatchCitation.id;
            boolean z = hatchCitation.resolved;
            C0924AIa c0924AIaA0u = C3cG.A0u();
            c0924AIaA0u.put("permalink", hatchCitation.permalink);
            String str6 = citation.citation.sourceTool;
            if (str6 != null) {
                c0924AIaA0u.put("source_tool", str6);
            }
            String str7 = citation.citation.thumbnailUrl;
            if (str7 != null) {
                c0924AIaA0u.put("thumbnail_url", str7);
            }
            mapA0j.put(str5, new HatchPlaceholderEntry(str5, "citation", z, AIW.A0K(c0924AIaA0u)));
        }
    }

    private final void handleTextAppend(HatchChatEvent.DeltaText deltaText) {
        String str;
        List<HatchContentBlock> assistantContent;
        CanonicalEventEnvelope canonicalEventEnvelope = deltaText.envelope;
        if (canonicalEventEnvelope != null) {
            str = canonicalEventEnvelope.parentMessageId;
            if (str == null) {
                str = canonicalEventEnvelope.messageId;
            }
        } else {
            str = null;
        }
        ensureTranscript(str, deltaText.replyToMessageId);
        accumulateWidgets(deltaText.widgets);
        String str2 = deltaText.parentBlockId;
        if ((str2 == null || (assistantContent = findSubAgentContent(str2, deltaText.agentId)) == null) && (assistantContent = getAssistantContent()) == null) {
            return;
        }
        HatchContentBlock hatchContentBlock = (HatchContentBlock) AbstractC0878AGe.A0I(assistantContent);
        if (hatchContentBlock instanceof HatchContentBlock.TextBlock) {
            HatchContentBlock.TextBlock textBlock = (HatchContentBlock.TextBlock) hatchContentBlock;
            if (textBlock.status == HatchBlockStatus.STREAMING) {
                appendBufferedText(assistantContent, textBlock.text, deltaText.text, false);
                return;
            }
        }
        flushPendingText(assistantContent);
        int i = HatchContentBlock.TextBlock.$stable;
        assistantContent.add(new HatchContentBlock.TextBlock(deltaText.blockId, deltaText.text, HatchBlockStatus.STREAMING));
        this.pendingTextBuffers.put(assistantContent, new PendingTextBuffer(C60O.A00(assistantContent), false, C60O.A0x(deltaText.text)));
    }

    private final void handleThinkingAppend(HatchChatEvent.Thinking thinking) {
        String str;
        List<HatchContentBlock> assistantContent;
        CanonicalEventEnvelope canonicalEventEnvelope = thinking.envelope;
        if (canonicalEventEnvelope != null) {
            str = canonicalEventEnvelope.parentMessageId;
            if (str == null) {
                str = canonicalEventEnvelope.messageId;
            }
        } else {
            str = null;
        }
        ensureTranscript(str, thinking.replyToMessageId);
        String str2 = thinking.parentBlockId;
        if ((str2 == null || (assistantContent = findSubAgentContent(str2, null)) == null) && (assistantContent = getAssistantContent()) == null) {
            return;
        }
        HatchContentBlock hatchContentBlock = (HatchContentBlock) AbstractC0878AGe.A0I(assistantContent);
        if (hatchContentBlock instanceof HatchContentBlock.ThinkingBlock) {
            HatchContentBlock.ThinkingBlock thinkingBlock = (HatchContentBlock.ThinkingBlock) hatchContentBlock;
            if (thinkingBlock.status == HatchBlockStatus.STREAMING) {
                appendBufferedText(assistantContent, thinkingBlock.text, thinking.text, true);
                return;
            }
        }
        flushPendingText(assistantContent);
        int i = HatchContentBlock.ThinkingBlock.$stable;
        assistantContent.add(new HatchContentBlock.ThinkingBlock(thinking.blockId, thinking.text, HatchBlockStatus.STREAMING));
        this.pendingTextBuffers.put(assistantContent, new PendingTextBuffer(C60O.A00(assistantContent), true, C60O.A0x(thinking.text)));
    }

    private final void handleToolDone(HatchChatEvent.ToolDone toolDone) {
        String str;
        String str2;
        List<HatchContentBlock> assistantContent;
        CanonicalEventEnvelope canonicalEventEnvelope = toolDone.envelope;
        if (canonicalEventEnvelope != null) {
            str = canonicalEventEnvelope.parentMessageId;
            str2 = canonicalEventEnvelope.messageId;
        } else {
            str = null;
            str2 = null;
        }
        ensureTranscript(toolOwnerMessageId(str, str2, toolDone.toolCallId), toolDone.replyToMessageId);
        HxE<List<HatchContentBlock>, Integer> hxEFindToolCallLocation = findToolCallLocation(toolDone.toolCallId);
        if (hxEFindToolCallLocation != null) {
            HatchContentBlock hatchContentBlock = hxEFindToolCallLocation.first.get(AnonymousClass001.A0F(hxEFindToolCallLocation.second));
            C7384Etj.A0Z(hatchContentBlock, "null cannot be cast to non-null type com.facebook.aura.model.HatchContentBlock.ToolCallBlock");
            hxEFindToolCallLocation.first.set(AnonymousClass001.A0F(hxEFindToolCallLocation.second), mergeToolCall((HatchContentBlock.ToolCallBlock) hatchContentBlock, toolDone));
            return;
        }
        String str3 = toolDone.parentBlockId;
        if (str3 == null || (assistantContent = findSubAgentContent(str3, null)) == null) {
            assistantContent = getAssistantContent();
            if (assistantContent == null) {
                return;
            }
        }
        int i = HatchContentBlock.ToolCallBlock.$stable;
        String str4 = toolDone.toolCallId;
        String str5 = toolDone.toolName;
        String str6 = toolDone.toolType;
        HatchToolCallRequest hatchToolCallRequest = new HatchToolCallRequest("", null, null, null);
        HatchToolCallResult hatchToolCallResult = toolDone.result;
        HatchToolCallStatus hatchToolCallStatus = (hatchToolCallResult == null || hatchToolCallResult.success) ? HatchToolCallStatus.COMPLETED : HatchToolCallStatus.ERRORED;
        long j = toolDone.completedAtMs;
        assistantContent.add(new HatchContentBlock.ToolCallBlock(str4, str5, str6, hatchToolCallRequest, hatchToolCallResult, hatchToolCallStatus, j, Long.valueOf(j)));
    }

    private final void handleToolStart(HatchChatEvent.ToolStart toolStart) {
        String str;
        List<HatchContentBlock> assistantContent;
        CanonicalEventEnvelope canonicalEventEnvelope = toolStart.envelope;
        String str2 = null;
        if (canonicalEventEnvelope != null) {
            str = canonicalEventEnvelope.parentMessageId;
            str2 = canonicalEventEnvelope.messageId;
        } else {
            str = null;
        }
        ensureTranscript(toolOwnerMessageId(str, str2, toolStart.toolCallId), toolStart.replyToMessageId);
        int i = HatchContentBlock.ToolCallBlock.$stable;
        HatchContentBlock.ToolCallBlock toolCallBlock = new HatchContentBlock.ToolCallBlock(toolStart.toolCallId, toolStart.toolName, toolStart.toolType, toolStart.request, null, HatchToolCallStatus.RUNNING, toolStart.startedAtMs, null);
        String str3 = toolStart.parentBlockId;
        if ((str3 == null || (assistantContent = findSubAgentContent(str3, toolStart.agentId)) == null) && (assistantContent = getAssistantContent()) == null) {
            return;
        }
        upsertToolInContent(assistantContent, toolCallBlock);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleTurnDone(com.facebook.aura.model.HatchChatEvent.MessageDone r19) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchDeltaAccumulator.handleTurnDone(com.facebook.aura.model.HatchChatEvent$MessageDone):void");
    }

    private final HatchContentBlock.ToolCallBlock mergeToolCall(HatchContentBlock.ToolCallBlock toolCallBlock, HatchChatEvent.ToolDone toolDone) {
        HatchToolCallResult hatchToolCallResult = toolDone.result;
        HatchToolCallStatus hatchToolCallStatus = (hatchToolCallResult == null || hatchToolCallResult.success) ? HatchToolCallStatus.COMPLETED : HatchToolCallStatus.ERRORED;
        if (hatchToolCallResult == null) {
            hatchToolCallResult = toolCallBlock.result;
        }
        long j = toolDone.completedAtMs;
        String str = toolDone.toolType;
        if (str.length() <= 0) {
            str = toolCallBlock.toolType;
        }
        Long lValueOf = Long.valueOf(j);
        int i = HatchContentBlock.ToolCallBlock.$stable;
        return toolCallBlock.copy(toolCallBlock.id, toolCallBlock.name, str, toolCallBlock.request, hatchToolCallResult, hatchToolCallStatus, toolCallBlock.startedAtMs, lValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean publishPendingText(java.util.List<com.facebook.aura.model.HatchContentBlock> r7, com.facebook.aura.gateway.HatchDeltaAccumulator.PendingTextBuffer r8) {
        /*
            r6 = this;
            int r0 = r8.blockIndex
            java.lang.Object r5 = X.AbstractC0878AGe.A0A(r0, r7)
            com.facebook.aura.model.HatchContentBlock r5 = (com.facebook.aura.model.HatchContentBlock) r5
            r6 = 0
            if (r5 == 0) goto L6e
            java.lang.StringBuilder r0 = r8.text
            java.lang.String r3 = r0.toString()
            int r4 = r8.blockIndex
            boolean r2 = r8.thinking
            if (r2 == 0) goto L2c
            boolean r0 = r5 instanceof com.facebook.aura.model.HatchContentBlock.ThinkingBlock
            if (r0 == 0) goto L3d
            com.facebook.aura.model.HatchContentBlock$ThinkingBlock r5 = (com.facebook.aura.model.HatchContentBlock.ThinkingBlock) r5
            int r0 = com.facebook.aura.model.HatchContentBlock.ThinkingBlock.$stable
            java.lang.String r1 = r5.id
            com.facebook.aura.model.HatchBlockStatus r0 = r5.status
            com.facebook.aura.model.HatchContentBlock$ThinkingBlock r0 = r5.copy(r1, r3, r0)
        L27:
            r7.set(r4, r0)
            r0 = 1
            return r0
        L2c:
            boolean r0 = r5 instanceof com.facebook.aura.model.HatchContentBlock.TextBlock
            if (r0 == 0) goto L3d
            com.facebook.aura.model.HatchContentBlock$TextBlock r5 = (com.facebook.aura.model.HatchContentBlock.TextBlock) r5
            int r0 = com.facebook.aura.model.HatchContentBlock.TextBlock.$stable
            java.lang.String r1 = r5.id
            com.facebook.aura.model.HatchBlockStatus r0 = r5.status
            com.facebook.aura.model.HatchContentBlock$TextBlock r0 = r5.copy(r1, r3, r0)
            goto L27
        L3d:
            int r1 = r3.length()
            java.lang.String r3 = X.C3cI.A0Y(r5)
            if (r2 == 0) goto L6b
            java.lang.String r2 = "ThinkingBlock"
        L49:
            java.lang.String r0 = "Discarding "
            java.lang.StringBuilder r1 = X.C60O.A0y(r0, r1)
            java.lang.String r0 = " buffered chars: block "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " is "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", expected "
            java.lang.String r1 = X.C60P.A1M(r0, r2, r1)
            java.lang.String r0 = "HatchDeltaAccumulator"
            X.CFK.A06(r0, r1)
            return r6
        L6b:
            java.lang.String r2 = "TextBlock"
            goto L49
        L6e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchDeltaAccumulator.publishPendingText(java.util.List, com.facebook.aura.gateway.HatchDeltaAccumulator$PendingTextBuffer):boolean");
    }

    private final String toolOwnerMessageId(String str, String str2, String str3) {
        if (str == null) {
            str = null;
            if (str2 != null && !str2.equals(str3) && !str2.startsWith("tool-msg-")) {
                return str2;
            }
        }
        return str;
    }

    public final String collectText() {
        String strCollectTextLocked;
        synchronized (this.lock) {
            flushPendingTextLocked();
            strCollectTextLocked = collectTextLocked();
        }
        return strCollectTextLocked;
    }

    public final String getFallbackText() {
        String str;
        synchronized (this.lock) {
            str = this.fallbackText;
        }
        return str;
    }

    public final List<HatchTextEntitySegment> getSegments() {
        List<HatchTextEntitySegment> list;
        synchronized (this.lock) {
            list = this.segments;
        }
        return list;
    }

    public final HatchDeltaTranscript getTranscript() {
        HatchDeltaTranscript hatchDeltaTranscript;
        synchronized (this.lock) {
            flushPendingTextLocked();
            hatchDeltaTranscript = this.transcript;
        }
        return hatchDeltaTranscript;
    }

    public final List<HatchWidget> getWidgets() {
        List<HatchWidget> list;
        synchronized (this.lock) {
            list = this.widgets;
        }
        return list;
    }

    public final void reset() {
        synchronized (this.lock) {
            resetLocked();
        }
    }

    public final Snapshot snapshot() {
        Snapshot snapshot;
        synchronized (this.lock) {
            flushPendingTextLocked();
            HatchDeltaTranscript hatchDeltaTranscript = this.transcript;
            snapshot = null;
            if (hatchDeltaTranscript != null) {
                int i = Snapshot.$stable;
                HatchDeltaTranscript hatchDeltaTranscriptDetached = detached(hatchDeltaTranscript);
                List<HatchWidget> list = this.widgets;
                List listA0X = list != null ? AbstractC0878AGe.A0X(list) : null;
                String strCollectTextLocked = collectTextLocked();
                List<HatchTextEntitySegment> list2 = this.segments;
                snapshot = new Snapshot(hatchDeltaTranscriptDetached, listA0X, strCollectTextLocked, list2 != null ? AbstractC0878AGe.A0X(list2) : null, this.fallbackText);
            }
        }
        return snapshot;
    }

    private final void appendBufferedText(List<HatchContentBlock> list, String str, String str2, boolean z) {
        int iA0E = AnonymousClass002.A0E(list);
        PendingTextBuffer pendingTextBuffer = this.pendingTextBuffers.get(list);
        if (pendingTextBuffer != null && pendingTextBuffer.blockIndex == iA0E && pendingTextBuffer.thinking == z) {
            pendingTextBuffer.text.append(str2);
            return;
        }
        IdentityHashMap<List<HatchContentBlock>, PendingTextBuffer> identityHashMap = this.pendingTextBuffers;
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        sb.append(str);
        sb.append(str2);
        identityHashMap.put(list, new PendingTextBuffer(iA0E, z, sb));
    }

    private final void appendCollectedPart(StringBuilder sb, String str) {
        if (str.length() != 0) {
            if (sb.length() > 0) {
                sb.append(PairsDiscretionDocument.OWNER_SEPARATOR);
            }
            sb.append(str);
        }
    }

    private final void appendCollectedText(StringBuilder sb, List<? extends HatchContentBlock> list) {
        for (HatchContentBlock hatchContentBlock : list) {
            if (hatchContentBlock instanceof HatchContentBlock.TextBlock) {
                appendCollectedPart(sb, ((HatchContentBlock.TextBlock) hatchContentBlock).text);
            } else if (hatchContentBlock instanceof HatchContentBlock.SubAgentBlock) {
                List<HatchContentBlock> list2 = ((HatchContentBlock.SubAgentBlock) hatchContentBlock).content;
                if (list2 != null) {
                    appendCollectedText(sb, list2);
                }
            } else if (!(hatchContentBlock instanceof HatchContentBlock.ThinkingBlock) && !(hatchContentBlock instanceof HatchContentBlock.ToolCallBlock)) {
                throw C3cG.A0q();
            }
        }
    }

    private final void applyLocked(HatchChatEvent hatchChatEvent) {
        if (hatchChatEvent.isUserLiveTranscript()) {
            return;
        }
        boolean z = hatchChatEvent instanceof HatchChatEvent.DeltaText;
        if (!z && !(hatchChatEvent instanceof HatchChatEvent.Thinking)) {
            flushPendingTextLocked();
        }
        if (hatchChatEvent instanceof HatchChatEvent.MessageStart) {
            handleTurnStart((HatchChatEvent.MessageStart) hatchChatEvent);
            return;
        }
        if (z) {
            handleTextAppend((HatchChatEvent.DeltaText) hatchChatEvent);
            return;
        }
        if (hatchChatEvent instanceof HatchChatEvent.Thinking) {
            handleThinkingAppend((HatchChatEvent.Thinking) hatchChatEvent);
            return;
        }
        if (hatchChatEvent instanceof HatchChatEvent.ToolStart) {
            handleToolStart((HatchChatEvent.ToolStart) hatchChatEvent);
            return;
        }
        if (hatchChatEvent instanceof HatchChatEvent.ToolDone) {
            handleToolDone((HatchChatEvent.ToolDone) hatchChatEvent);
            return;
        }
        if (hatchChatEvent instanceof HatchChatEvent.SubAgentTaskStatus) {
            handleAgentDone((HatchChatEvent.SubAgentTaskStatus) hatchChatEvent);
            return;
        }
        if (hatchChatEvent instanceof HatchChatEvent.BlockDone) {
            handleBlockDone((HatchChatEvent.BlockDone) hatchChatEvent);
            return;
        }
        if (hatchChatEvent instanceof HatchChatEvent.Citation) {
            handlePlaceholder((HatchChatEvent.Citation) hatchChatEvent);
            return;
        }
        if (hatchChatEvent instanceof HatchChatEvent.MessageDone) {
            handleTurnDone((HatchChatEvent.MessageDone) hatchChatEvent);
            return;
        }
        if (!(hatchChatEvent instanceof HatchChatEvent.ToolUpdate) && !(hatchChatEvent instanceof HatchChatEvent.ChatAborted) && !(hatchChatEvent instanceof HatchChatEvent.MessagesRemoved) && !(hatchChatEvent instanceof HatchChatEvent.ReactionsUpdated) && !(hatchChatEvent instanceof HatchChatEvent.MessageUser) && !(hatchChatEvent instanceof HatchChatEvent.MessageAssistant) && !(hatchChatEvent instanceof HatchChatEvent.Marker) && !(hatchChatEvent instanceof HatchChatEvent.Presentation) && !(hatchChatEvent instanceof HatchChatEvent.WidgetStateUpdated)) {
            throw C3cG.A0q();
        }
    }

    private final List<HatchContentBlock> detachedBlocks(List<HatchContentBlock> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object objCopy$default : list) {
            if (objCopy$default instanceof HatchContentBlock.SubAgentBlock) {
                HatchContentBlock.SubAgentBlock subAgentBlock = (HatchContentBlock.SubAgentBlock) objCopy$default;
                List<HatchContentBlock> list2 = subAgentBlock.content;
                objCopy$default = HatchContentBlock.SubAgentBlock.copy$default(subAgentBlock, null, null, null, null, null, null, list2 != null ? detachedBlocks(list2) : null, 0L, null, 447, null);
            }
            arrayListA0h.add(objCopy$default);
        }
        return arrayListA0h;
    }

    private final HatchContentBlock.SubAgentBlock findSubAgentByAgentId(String str) {
        List<HatchContentBlock> assistantContent = getAssistantContent();
        Object obj = null;
        if (assistantContent == null) {
            return null;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchContentBlock hatchContentBlock : assistantContent) {
            if (hatchContentBlock instanceof HatchContentBlock.SubAgentBlock) {
                arrayListA0h.add(hatchContentBlock);
            }
        }
        Iterator it = arrayListA0h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C7384Etj.areEqual(((HatchContentBlock.SubAgentBlock) next).agentId, str)) {
                obj = next;
                break;
            }
        }
        return (HatchContentBlock.SubAgentBlock) obj;
    }

    private final List<HatchContentBlock> findSubAgentContent(String str, String str2) {
        HatchContentBlock.SubAgentBlock subAgentBlock;
        List<HatchContentBlock> assistantContent = getAssistantContent();
        if (assistantContent == null) {
            return null;
        }
        for (HatchContentBlock hatchContentBlock : assistantContent) {
            if (hatchContentBlock instanceof HatchContentBlock.SubAgentBlock) {
                if (str != null) {
                    subAgentBlock = (HatchContentBlock.SubAgentBlock) hatchContentBlock;
                    if (!str.equals(subAgentBlock.blockId)) {
                    }
                    return subAgentBlock.content;
                }
                if (str2 != null) {
                    HatchContentBlock.SubAgentBlock subAgentBlock2 = (HatchContentBlock.SubAgentBlock) hatchContentBlock;
                    subAgentBlock = subAgentBlock2;
                    if (str2.equals(subAgentBlock2.agentId)) {
                        return subAgentBlock.content;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final HxE<List<HatchContentBlock>, Integer> findToolCallLocation(String str) {
        List<HatchContentBlock> list;
        List<HatchContentBlock> assistantContent = getAssistantContent();
        if (assistantContent == null) {
            return null;
        }
        int size = assistantContent.size();
        for (int i = 0; i < size; i++) {
            HatchContentBlock hatchContentBlock = assistantContent.get(i);
            if ((hatchContentBlock instanceof HatchContentBlock.ToolCallBlock) && C7384Etj.areEqual(((HatchContentBlock.ToolCallBlock) hatchContentBlock).id, str)) {
                return AnonymousClass002.A0p(assistantContent, i);
            }
        }
        for (HatchContentBlock hatchContentBlock2 : assistantContent) {
            if ((hatchContentBlock2 instanceof HatchContentBlock.SubAgentBlock) && (list = ((HatchContentBlock.SubAgentBlock) hatchContentBlock2).content) != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (list.get(i2) instanceof HatchContentBlock.ToolCallBlock) {
                        HatchContentBlock hatchContentBlock3 = list.get(i2);
                        C7384Etj.A0Z(hatchContentBlock3, "null cannot be cast to non-null type com.facebook.aura.model.HatchContentBlock.ToolCallBlock");
                        if (C7384Etj.areEqual(((HatchContentBlock.ToolCallBlock) hatchContentBlock3).id, str)) {
                            return AnonymousClass002.A0p(list, i2);
                        }
                    }
                }
            }
        }
        return null;
    }

    private final void upsertToolInContent(List<HatchContentBlock> list, HatchContentBlock.ToolCallBlock toolCallBlock) {
        Iterator<HatchContentBlock> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            HatchContentBlock next = it.next();
            if (!(next instanceof HatchContentBlock.ToolCallBlock) || !C7384Etj.areEqual(((HatchContentBlock.ToolCallBlock) next).id, toolCallBlock.id)) {
                i++;
            } else if (i >= 0) {
                list.set(i, toolCallBlock);
                return;
            }
        }
        list.add(toolCallBlock);
    }
}
