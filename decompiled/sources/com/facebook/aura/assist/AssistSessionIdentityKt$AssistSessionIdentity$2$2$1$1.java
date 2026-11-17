package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BL4;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AssistSessionIdentityKt$AssistSessionIdentity$2$2$1$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ AssistIdentityState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistSessionIdentityKt$AssistSessionIdentity$2$2$1$1(AssistIdentityState assistIdentityState) {
        super(1);
        this.$state = assistIdentityState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m264invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m264invokeozmzZPI(long j) {
        this.$state.setIdentityHeight(AnonymousClass002.A09(j));
    }
}
