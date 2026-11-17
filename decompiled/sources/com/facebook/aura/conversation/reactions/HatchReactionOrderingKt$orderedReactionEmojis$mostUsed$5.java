package com.facebook.aura.conversation.reactions;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import java.util.Map;

/* loaded from: classes2.dex */
public final class HatchReactionOrderingKt$orderedReactionEmojis$mostUsed$5 extends AbstractC7559F3s implements G0U<Map.Entry<? extends String, ? extends Integer>, String> {
    public static final HatchReactionOrderingKt$orderedReactionEmojis$mostUsed$5 INSTANCE = new HatchReactionOrderingKt$orderedReactionEmojis$mostUsed$5();

    public HatchReactionOrderingKt$orderedReactionEmojis$mostUsed$5() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final String invoke2(Map.Entry<String, Integer> entry) {
        C7384Etj.A0Y(entry, 0);
        return entry.getKey();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ String invoke(Map.Entry<? extends String, ? extends Integer> entry) {
        return invoke2((Map.Entry<String, Integer>) entry);
    }
}
