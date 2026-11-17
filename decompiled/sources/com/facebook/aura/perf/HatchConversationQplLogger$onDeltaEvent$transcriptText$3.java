package com.facebook.aura.perf;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.model.HatchContentBlock;

/* loaded from: classes3.dex */
public final class HatchConversationQplLogger$onDeltaEvent$transcriptText$3 extends AbstractC7559F3s implements G0U<HatchContentBlock.TextBlock, CharSequence> {
    public static final HatchConversationQplLogger$onDeltaEvent$transcriptText$3 INSTANCE = new HatchConversationQplLogger$onDeltaEvent$transcriptText$3();

    public HatchConversationQplLogger$onDeltaEvent$transcriptText$3() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(HatchContentBlock.TextBlock textBlock) {
        HatchContentBlock.TextBlock textBlock2 = textBlock;
        C7384Etj.A0Y(textBlock2, 0);
        return textBlock2.text;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(HatchContentBlock.TextBlock textBlock) {
        C7384Etj.A0Y(textBlock, 0);
        return textBlock.text;
    }
}
