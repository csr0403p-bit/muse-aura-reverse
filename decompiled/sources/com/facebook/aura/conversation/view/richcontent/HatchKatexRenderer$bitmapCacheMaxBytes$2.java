package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import com.facebook.aura.memory.AuraMemoryBudget;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchKatexRenderer$bitmapCacheMaxBytes$2 extends AbstractC7559F3s implements Function0<Integer> {
    public static final HatchKatexRenderer$bitmapCacheMaxBytes$2 INSTANCE = new HatchKatexRenderer$bitmapCacheMaxBytes$2();

    public HatchKatexRenderer$bitmapCacheMaxBytes$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(AuraMemoryBudget.INSTANCE.isLowRamDevice() ? 4194304 : 8388608);
    }
}
