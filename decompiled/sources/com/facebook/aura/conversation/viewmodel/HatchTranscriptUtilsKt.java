package com.facebook.aura.conversation.viewmodel;

import X.AHI;
import X.AbstractC0878AGe;
import X.C3cG;
import X.C3cI;
import com.facebook.aura.conversation.viewmodel.HatchRenderSegment;
import com.facebook.aura.model.HatchContentBlock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class HatchTranscriptUtilsKt {
    public static final List<HatchRenderSegment> segmentContent(List<? extends HatchContentBlock> list) {
        ArrayList arrayListA0y = C3cI.A0y(list);
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchContentBlock hatchContentBlock : list) {
            if (hatchContentBlock instanceof HatchContentBlock.TextBlock) {
                arrayListA0h.add(hatchContentBlock);
            }
        }
        if (!arrayListA0h.isEmpty()) {
            String strA0L = AbstractC0878AGe.A0L("", "", "", arrayListA0h, HatchTranscriptUtilsKt$segmentContent$mergedText$1.INSTANCE);
            HatchContentBlock.TextBlock textBlock = (HatchContentBlock.TextBlock) AbstractC0878AGe.A0F(arrayListA0h);
            int i = HatchContentBlock.TextBlock.$stable;
            arrayListA0y.add(new HatchRenderSegment.TextSegment(textBlock.copy(textBlock.id, strA0L, textBlock.status), true, null, AHI.A01));
        }
        return arrayListA0y;
    }
}
