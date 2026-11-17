package com.facebook.aura.conversation.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.C2ae;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchMessageBubbleKt$ReactionBadge$3$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public static final HatchMessageBubbleKt$ReactionBadge$3$1 INSTANCE = new HatchMessageBubbleKt$ReactionBadge$3$1();

    public HatchMessageBubbleKt$ReactionBadge$3$1() {
        super(1);
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m640invokeBjo55l4(AXN axn) {
        C7384Etj.A0Y(axn, 0);
        return AnonymousClass007.A0C(-axn.Abr(HatchMessageBubbleKt.ReactionBadgeTrailingInset), axn.Abr(HatchMessageBubbleKt.ReactionBadgeBottomOverflow));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m640invokeBjo55l4(axn));
    }
}
