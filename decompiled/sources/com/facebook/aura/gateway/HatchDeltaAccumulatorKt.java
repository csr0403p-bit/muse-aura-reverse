package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.C3cG;
import X.C60Q;
import com.facebook.aura.model.HatchContentBlock;
import com.facebook.aura.model.HatchDeltaTranscript;
import com.facebook.aura.model.HatchTranscriptMessage;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public abstract class HatchDeltaAccumulatorKt {
    public static final String TAG = "HatchDeltaAccumulator";

    public static final boolean transcriptHasRenderableContent(HatchDeltaTranscript hatchDeltaTranscript) {
        Object objPrevious;
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
                for (HatchContentBlock hatchContentBlock : list) {
                    if (!(hatchContentBlock instanceof HatchContentBlock.TextBlock)) {
                        if ((hatchContentBlock instanceof HatchContentBlock.ToolCallBlock) || (hatchContentBlock instanceof HatchContentBlock.SubAgentBlock) || (hatchContentBlock instanceof HatchContentBlock.ThinkingBlock)) {
                            return true;
                        }
                        throw C3cG.A0q();
                    }
                    if (AnonymousClass002.A0l(((HatchContentBlock.TextBlock) hatchContentBlock).text).length() > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
