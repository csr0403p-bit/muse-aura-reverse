package com.facebook.aura.conversation.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.C1BO;
import X.C1DG;
import X.C2ae;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$ConversationScreenDecoration$5$1$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ C1BO<C1DG> $headerTitleOffsetX$delegate;

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m569invokeBjo55l4(AXN axn) {
        C7384Etj.A0Y(axn, 0);
        return axn.Abr(C1BO.A00(this.$headerTitleOffsetX$delegate)) << 32;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$ConversationScreenDecoration$5$1$1(C1BO<C1DG> c1bo) {
        super(1);
        this.$headerTitleOffsetX$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m569invokeBjo55l4(axn));
    }
}
