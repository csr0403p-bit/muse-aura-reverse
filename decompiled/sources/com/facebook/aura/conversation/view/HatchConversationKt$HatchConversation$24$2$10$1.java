package com.facebook.aura.conversation.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C1DG;
import X.C2ae;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.header.view.HatchStatusPillMetrics;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$24$2$10$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ float $fallbackOverlayTopPadding;
    public final /* synthetic */ HatchStatusPillMetrics $statusPillMetrics;

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m558invokeBjo55l4(AXN axn) {
        C7384Etj.A0Y(axn, 0);
        C1DG c1dgM1003getRenderedPillBottomlTKBWiU = this.$statusPillMetrics.m1003getRenderedPillBottomlTKBWiU();
        return AnonymousClass005.A0N(axn.Abr(c1dgM1003getRenderedPillBottomlTKBWiU != null ? c1dgM1003getRenderedPillBottomlTKBWiU.A00 : this.$fallbackOverlayTopPadding));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$24$2$10$1(HatchStatusPillMetrics hatchStatusPillMetrics, float f) {
        super(1);
        this.$statusPillMetrics = hatchStatusPillMetrics;
        this.$fallbackOverlayTopPadding = f;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m558invokeBjo55l4(axn));
    }
}
