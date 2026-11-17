package com.facebook.aura.library.view;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class GoalsCompletedScreenKt$CompletedGoalsList$1$1$2$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ boolean $isLoadingMore;
    public final /* synthetic */ String $loadingMoreDescription;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        if (this.$isLoadingMore) {
            AbstractC1564Ale.A04(interfaceC0857A6e);
            AbstractC1564Ale.A08(interfaceC0857A6e, this.$loadingMoreDescription);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalsCompletedScreenKt$CompletedGoalsList$1$1$2$1$1(boolean z, String str) {
        super(1);
        this.$isLoadingMore = z;
        this.$loadingMoreDescription = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
