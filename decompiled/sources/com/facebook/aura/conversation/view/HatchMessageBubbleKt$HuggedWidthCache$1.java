package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C1DG;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.memory.AuraMemoryBudget;

/* loaded from: classes.dex */
public final class HatchMessageBubbleKt$HuggedWidthCache$1 extends AbstractC7559F3s implements G0V<HuggedWidthKey, C1DG, Long> {
    public static final HatchMessageBubbleKt$HuggedWidthCache$1 INSTANCE = new HatchMessageBubbleKt$HuggedWidthCache$1();

    public HatchMessageBubbleKt$HuggedWidthCache$1() {
        super(2);
    }

    /* renamed from: invoke-3ABfNKs, reason: not valid java name */
    public final Long m639invoke3ABfNKs(HuggedWidthKey huggedWidthKey, float f) {
        C7384Etj.A0Y(huggedWidthKey, 0);
        return Long.valueOf(AuraMemoryBudget.INSTANCE.stringBytes(huggedWidthKey.text) + 256);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Long invoke(HuggedWidthKey huggedWidthKey, C1DG c1dg) {
        return m639invoke3ABfNKs(huggedWidthKey, c1dg.A00);
    }
}
