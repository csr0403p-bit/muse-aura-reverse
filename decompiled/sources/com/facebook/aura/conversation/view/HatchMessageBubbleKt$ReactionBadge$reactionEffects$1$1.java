package com.facebook.aura.conversation.view;

import X.C7438Evz;
import com.facebook.aura.utils.HatchUtil;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchMessageBubbleKt$ReactionBadge$reactionEffects$1$1 extends C7438Evz implements Function0<Boolean> {
    public HatchMessageBubbleKt$ReactionBadge$reactionEffects$1$1(Object obj) {
        super(0, obj, HatchUtil.class, "isChatReactionAnimationEnabled", "isChatReactionAnimationEnabled()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((HatchUtil) this.receiver).isChatReactionAnimationEnabled());
    }
}
