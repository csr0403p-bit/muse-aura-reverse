package com.facebook.aura.nudge;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes2.dex */
public final class ConversationNudgeHostKt$rememberNudgeControls$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isVisible;
    public final /* synthetic */ ConversationNudge $nudge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationNudgeHostKt$rememberNudgeControls$1$1(boolean z, ConversationNudge conversationNudge) {
        super(1);
        this.$isVisible = z;
        this.$nudge = conversationNudge;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$isVisible) {
            ConversationNudgeCoordinator.INSTANCE.onShown(this.$nudge);
        }
        return new C78g() { // from class: com.facebook.aura.nudge.ConversationNudgeHostKt$rememberNudgeControls$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
