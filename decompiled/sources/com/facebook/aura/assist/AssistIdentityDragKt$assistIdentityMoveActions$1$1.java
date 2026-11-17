package com.facebook.aura.assist;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.BHP;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AssistIdentityDragKt$assistIdentityMoveActions$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ List<BHP> $actions;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A0C(interfaceC0857A6e, this.$actions);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistIdentityDragKt$assistIdentityMoveActions$1$1(List<BHP> list) {
        super(1);
        this.$actions = list;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
