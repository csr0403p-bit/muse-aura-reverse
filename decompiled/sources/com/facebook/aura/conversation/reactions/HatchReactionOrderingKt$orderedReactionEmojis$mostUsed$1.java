package com.facebook.aura.conversation.reactions;

import X.AbstractC7559F3s;
import X.G0U;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class HatchReactionOrderingKt$orderedReactionEmojis$mostUsed$1 extends AbstractC7559F3s implements G0U<Map.Entry<? extends String, ? extends Integer>, Boolean> {
    public final /* synthetic */ List<String> $pinned;

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke2(java.util.Map.Entry<java.lang.String, java.lang.Integer> r2) {
        /*
            r1 = this;
            r0 = 0
            X.C7384Etj.A0Y(r2, r0)
            java.lang.Object r0 = r2.getValue()
            int r0 = X.AnonymousClass001.A0F(r0)
            if (r0 <= 0) goto L1b
            java.util.List<java.lang.String> r1 = r1.$pinned
            java.lang.Object r0 = r2.getKey()
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 == 0) goto L1c
        L1b:
            r0 = 0
        L1c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.reactions.HatchReactionOrderingKt$orderedReactionEmojis$mostUsed$1.invoke2(java.util.Map$Entry):java.lang.Boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchReactionOrderingKt$orderedReactionEmojis$mostUsed$1(List<String> list) {
        super(1);
        this.$pinned = list;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(Map.Entry<? extends String, ? extends Integer> entry) {
        return invoke2((Map.Entry<String, Integer>) entry);
    }
}
