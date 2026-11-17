package com.facebook.aura.conversation.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C2ae;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$24$2$6$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ float $bottomPadding;

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m560invokeBjo55l4(AXN axn) {
        C7384Etj.A0Y(axn, 0);
        return AnonymousClass005.A0N(axn.Abr(-this.$bottomPadding));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$24$2$6$1(float f) {
        super(1);
        this.$bottomPadding = f;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m560invokeBjo55l4(axn));
    }
}
