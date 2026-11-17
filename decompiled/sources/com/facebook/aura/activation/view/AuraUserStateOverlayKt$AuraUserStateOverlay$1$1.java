package com.facebook.aura.activation.view;

import X.AXN;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.C00q;
import X.C2ae;
import X.G0U;

/* loaded from: classes.dex */
public final class AuraUserStateOverlayKt$AuraUserStateOverlay$1$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ C00q $offsetX$delegate;
    public final /* synthetic */ C00q $offsetY$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraUserStateOverlayKt$AuraUserStateOverlay$1$1(C00q c00q, C00q c00q2) {
        super(1);
        this.$offsetX$delegate = c00q;
        this.$offsetY$delegate = c00q2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m131invokeBjo55l4(axn));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m131invokeBjo55l4(AXN axn) {
        return AnonymousClass007.A0C(Ab3.A01(this.$offsetX$delegate.AFn()), Ab3.A01(this.$offsetY$delegate.AFn()));
    }
}
