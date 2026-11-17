package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C1251Afj;
import X.C3UX;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AssistIdentityDragKt$assistIdentityDrag$3$1 extends AbstractC7559F3s implements G0U<C1251Afj, Unit> {
    public final /* synthetic */ AssistIdentityDockPosition $position;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ AssistIdentityState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistIdentityDragKt$assistIdentityDrag$3$1(AssistIdentityState assistIdentityState, AssistIdentityDockPosition assistIdentityDockPosition, C3UX c3ux) {
        super(1);
        this.$state = assistIdentityState;
        this.$position = assistIdentityDockPosition;
        this.$scope = c3ux;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1251Afj c1251Afj) {
        m259invokeTH1AsA0(c1251Afj.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-TH1AsA0, reason: not valid java name */
    public final void m259invokeTH1AsA0(long j) {
        if (this.$state.isParked()) {
            this.$position.snap(this.$scope);
        }
    }
}
