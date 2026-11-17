package com.facebook.aura.assist;

import X.AWx;
import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AssistIdentityDragKt$assistIdentityDrag$2$1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
    public final /* synthetic */ AssistIdentityDockPosition $position;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistIdentityDragKt$assistIdentityDrag$2$1(AssistIdentityDockPosition assistIdentityDockPosition) {
        super(1);
        this.$position = assistIdentityDockPosition;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
        this.$position.stop();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m258invokek4lQ0M(long j) {
        this.$position.stop();
    }
}
