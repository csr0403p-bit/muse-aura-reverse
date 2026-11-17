package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import java.util.Map;

/* loaded from: classes.dex */
public final class HatchReactionGlyphKt$reactionAccessibilityText$1$1 extends AbstractC7559F3s implements G0U<String, CharSequence> {
    public final /* synthetic */ Map<String, String> $labels;

    @Override // X.G0U
    public final CharSequence invoke(String str) {
        C7384Etj.A0Y(str, 0);
        String str2 = this.$labels.get(str);
        return str2 != null ? str2 : str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchReactionGlyphKt$reactionAccessibilityText$1$1(Map<String, String> map) {
        super(1);
        this.$labels = map;
    }
}
