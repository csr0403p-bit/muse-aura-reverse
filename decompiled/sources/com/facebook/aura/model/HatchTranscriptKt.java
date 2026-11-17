package com.facebook.aura.model;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60Q;
import X.C60S;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.file.view.ArtifactFileActionMenuKt;
import com.facebook.aura.model.HatchContentBlock;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class HatchTranscriptKt {
    public static final String TAG = "HatchTranscript";

    public static final HatchDeltaTranscript finalizeTranscript(HatchDeltaTranscript hatchDeltaTranscript) {
        C7384Etj.A0Y(hatchDeltaTranscript, 0);
        List<HatchTranscriptMessage> list = hatchDeltaTranscript.messages;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (HatchTranscriptMessage hatchTranscriptMessage : list) {
            arrayListA0i.add(hatchTranscriptMessage.copy(hatchTranscriptMessage.id, hatchTranscriptMessage.role, finalizeContentBlocks(hatchTranscriptMessage.content), "done", hatchTranscriptMessage.createdAtMs));
        }
        HatchTranscriptStatus hatchTranscriptStatus = hatchDeltaTranscript.status;
        if (hatchTranscriptStatus == HatchTranscriptStatus.STREAMING) {
            hatchTranscriptStatus = HatchTranscriptStatus.COMPLETED;
        }
        ArrayList arrayList = new ArrayList(arrayListA0i);
        String str = hatchDeltaTranscript.messageId;
        String str2 = hatchDeltaTranscript.agentId;
        String str3 = hatchDeltaTranscript.sessionId;
        String str4 = hatchDeltaTranscript.replyToMessageId;
        HatchTranscriptMetadata hatchTranscriptMetadata = hatchDeltaTranscript.metadata;
        Map<String, HatchPlaceholderEntry> map = hatchDeltaTranscript.placeholders;
        AnonymousClass003.A0y(hatchTranscriptStatus, arrayList);
        return new HatchDeltaTranscript(str, str2, str3, str4, hatchTranscriptStatus, arrayList, hatchTranscriptMetadata, map);
    }

    public static final boolean hasRenderableAssistantBubbleContent(HatchDeltaTranscript hatchDeltaTranscript) {
        Object objPrevious;
        C7384Etj.A0Y(hatchDeltaTranscript, 0);
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
        if (hatchTranscriptMessage != null) {
            List<HatchContentBlock> list = hatchTranscriptMessage.content;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<HatchContentBlock> it = list.iterator();
                while (it.hasNext()) {
                    if (hasRenderableBubbleContent(it.next())) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static final boolean hasAsyncImageToolResult(HatchContentBlock.ToolCallBlock toolCallBlock) {
        return C60S.A06(toolCallBlock.result);
    }

    public static final boolean hasAsyncMediaContent(HatchContentBlock hatchContentBlock) {
        if (hatchContentBlock instanceof HatchContentBlock.TextBlock) {
            return C7BY.A0q(((HatchContentBlock.TextBlock) hatchContentBlock).text, ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX, false);
        }
        if (!(hatchContentBlock instanceof HatchContentBlock.ThinkingBlock)) {
            if (hatchContentBlock instanceof HatchContentBlock.ToolCallBlock) {
                return C60S.A06(((HatchContentBlock.ToolCallBlock) hatchContentBlock).result);
            }
            if (!(hatchContentBlock instanceof HatchContentBlock.SubAgentBlock)) {
                throw C3cG.A0q();
            }
            List<HatchContentBlock> list = ((HatchContentBlock.SubAgentBlock) hatchContentBlock).content;
            if (list == null || ((list instanceof Collection) && list.isEmpty())) {
                return false;
            }
            Iterator<HatchContentBlock> it = list.iterator();
            while (it.hasNext()) {
                if (hasAsyncMediaContent(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean hasRenderableBubbleContent(HatchContentBlock hatchContentBlock) {
        if (hatchContentBlock instanceof HatchContentBlock.TextBlock) {
            if (AnonymousClass002.A0l(((HatchContentBlock.TextBlock) hatchContentBlock).text).length() > 0) {
                return true;
            }
        } else {
            if (hatchContentBlock instanceof HatchContentBlock.ToolCallBlock) {
                return C60S.A06(((HatchContentBlock.ToolCallBlock) hatchContentBlock).result);
            }
            if (hatchContentBlock instanceof HatchContentBlock.SubAgentBlock) {
                List<HatchContentBlock> list = ((HatchContentBlock.SubAgentBlock) hatchContentBlock).content;
                if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
                    Iterator<HatchContentBlock> it = list.iterator();
                    while (it.hasNext()) {
                        if (hasRenderableBubbleContent(it.next())) {
                            return true;
                        }
                    }
                }
            } else if (!(hatchContentBlock instanceof HatchContentBlock.ThinkingBlock)) {
                throw C3cG.A0q();
            }
        }
        return false;
    }

    public static final String collectTextFromBlocks(List<? extends HatchContentBlock> list) {
        String strCollectTextFromBlocks;
        ArrayList arrayListA0y = C3cI.A0y(list);
        for (HatchContentBlock hatchContentBlock : list) {
            if (hatchContentBlock instanceof HatchContentBlock.TextBlock) {
                strCollectTextFromBlocks = ((HatchContentBlock.TextBlock) hatchContentBlock).text;
            } else if (hatchContentBlock instanceof HatchContentBlock.SubAgentBlock) {
                List<HatchContentBlock> list2 = ((HatchContentBlock.SubAgentBlock) hatchContentBlock).content;
                if (list2 != null) {
                    strCollectTextFromBlocks = collectTextFromBlocks(list2);
                }
            } else if (!(hatchContentBlock instanceof HatchContentBlock.ThinkingBlock) && !(hatchContentBlock instanceof HatchContentBlock.ToolCallBlock)) {
                throw C3cG.A0q();
            }
            if (strCollectTextFromBlocks.length() > 0) {
                arrayListA0y.add(strCollectTextFromBlocks);
            }
        }
        return C3cH.A0e(PairsDiscretionDocument.OWNER_SEPARATOR, arrayListA0y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.facebook.aura.model.HatchContentBlock$TextBlock] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.facebook.aura.model.HatchContentBlock$SubAgentBlock] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.facebook.aura.model.HatchContentBlock$ToolCallBlock] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.facebook.aura.model.HatchContentBlock$ToolCallBlock] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.facebook.aura.model.HatchContentBlock$ThinkingBlock] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.facebook.aura.model.HatchContentBlock$ThinkingBlock] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.facebook.aura.model.HatchContentBlock$TextBlock] */
    public static final List<HatchContentBlock> finalizeContentBlocks(List<HatchContentBlock> list) {
        ?? Copy;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (HatchContentBlock hatchContentBlock : list) {
            if (hatchContentBlock instanceof HatchContentBlock.TextBlock) {
                Copy = (HatchContentBlock.TextBlock) hatchContentBlock;
                if (Copy.status == HatchBlockStatus.STREAMING) {
                    Copy = Copy.copy(Copy.id, Copy.text, HatchBlockStatus.DONE);
                }
            } else if (hatchContentBlock instanceof HatchContentBlock.ThinkingBlock) {
                Copy = (HatchContentBlock.ThinkingBlock) hatchContentBlock;
                if (Copy.status == HatchBlockStatus.STREAMING) {
                    Copy = Copy.copy(Copy.id, Copy.text, HatchBlockStatus.DONE);
                }
            } else if (hatchContentBlock instanceof HatchContentBlock.ToolCallBlock) {
                Copy = (HatchContentBlock.ToolCallBlock) hatchContentBlock;
                if (Copy.status == HatchToolCallStatus.RUNNING) {
                    Copy = Copy.copy(Copy.id, Copy.name, Copy.toolType, Copy.request, Copy.result, HatchToolCallStatus.COMPLETED, Copy.startedAtMs, Copy.completedAtMs);
                }
            } else {
                if (!(hatchContentBlock instanceof HatchContentBlock.SubAgentBlock)) {
                    throw C3cG.A0q();
                }
                HatchContentBlock.SubAgentBlock subAgentBlock = (HatchContentBlock.SubAgentBlock) hatchContentBlock;
                List<HatchContentBlock> list2 = subAgentBlock.content;
                List<HatchContentBlock> listFinalizeContentBlocks = list2 != null ? finalizeContentBlocks(list2) : null;
                String str = subAgentBlock.status;
                if (BrowserTaskPresentation.STATUS_RUNNING.equals(str)) {
                    str = "completed";
                }
                Long l = subAgentBlock.completedAtMs;
                Copy = subAgentBlock.copy(subAgentBlock.blockId, subAgentBlock.agentId, subAgentBlock.toolId, str, subAgentBlock.summary, subAgentBlock.promptPreview, listFinalizeContentBlocks, subAgentBlock.startedAtMs, Long.valueOf(l != null ? l.longValue() : System.currentTimeMillis()));
            }
            arrayListA0i.add(Copy);
        }
        return new ArrayList(arrayListA0i);
    }

    public static final HatchDeltaTranscript withAssistantText(HatchDeltaTranscript hatchDeltaTranscript, String str) {
        AnonymousClass003.A0u(hatchDeltaTranscript, str);
        ListIterator listIteratorA0n = C3cG.A0n(hatchDeltaTranscript.messages);
        while (true) {
            if (!listIteratorA0n.hasPrevious()) {
                break;
            }
            if (C60Q.A1U(listIteratorA0n.previous())) {
                int iNextIndex = listIteratorA0n.nextIndex();
                if (iNextIndex >= 0) {
                    HatchTranscriptMessage hatchTranscriptMessage = hatchDeltaTranscript.messages.get(iNextIndex);
                    ArrayList arrayListA0h = C3cG.A0h();
                    boolean z = false;
                    for (HatchContentBlock hatchContentBlock : hatchTranscriptMessage.content) {
                        if (!(hatchContentBlock instanceof HatchContentBlock.TextBlock)) {
                            arrayListA0h.add(hatchContentBlock);
                        } else if (!z) {
                            HatchContentBlock.TextBlock textBlock = (HatchContentBlock.TextBlock) hatchContentBlock;
                            int i = HatchContentBlock.TextBlock.$stable;
                            arrayListA0h.add(textBlock.copy(textBlock.id, str, textBlock.status));
                            z = true;
                        }
                    }
                    if (!z) {
                        int i2 = HatchContentBlock.TextBlock.$stable;
                        arrayListA0h.add(new HatchContentBlock.TextBlock(null, str, HatchBlockStatus.DONE));
                    }
                    ArrayList arrayListA0R = AbstractC0878AGe.A0R(hatchDeltaTranscript.messages);
                    arrayListA0R.set(iNextIndex, hatchTranscriptMessage.copy(hatchTranscriptMessage.id, hatchTranscriptMessage.role, arrayListA0h, hatchTranscriptMessage.status, hatchTranscriptMessage.createdAtMs));
                    String str2 = hatchDeltaTranscript.messageId;
                    String str3 = hatchDeltaTranscript.agentId;
                    String str4 = hatchDeltaTranscript.sessionId;
                    String str5 = hatchDeltaTranscript.replyToMessageId;
                    HatchTranscriptStatus hatchTranscriptStatus = hatchDeltaTranscript.status;
                    HatchTranscriptMetadata hatchTranscriptMetadata = hatchDeltaTranscript.metadata;
                    Map<String, HatchPlaceholderEntry> map = hatchDeltaTranscript.placeholders;
                    AnonymousClass003.A0y(hatchTranscriptStatus, arrayListA0R);
                    return new HatchDeltaTranscript(str2, str3, str4, str5, hatchTranscriptStatus, arrayListA0R, hatchTranscriptMetadata, map);
                }
            }
        }
        return hatchDeltaTranscript;
    }

    public static final boolean hasAsyncMediaContent(HatchDeltaTranscript hatchDeltaTranscript) {
        Object objPrevious;
        C7384Etj.A0Y(hatchDeltaTranscript, 0);
        ListIterator listIteratorA0n = C3cG.A0n(hatchDeltaTranscript.messages);
        while (true) {
            if (listIteratorA0n.hasPrevious()) {
                objPrevious = listIteratorA0n.previous();
                if (C60Q.A1U(objPrevious)) {
                    break;
                }
            } else {
                objPrevious = null;
                break;
            }
        }
        HatchTranscriptMessage hatchTranscriptMessage = (HatchTranscriptMessage) objPrevious;
        if (hatchTranscriptMessage != null) {
            List<HatchContentBlock> list = hatchTranscriptMessage.content;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<HatchContentBlock> it = list.iterator();
                while (it.hasNext()) {
                    if (hasAsyncMediaContent(it.next())) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
