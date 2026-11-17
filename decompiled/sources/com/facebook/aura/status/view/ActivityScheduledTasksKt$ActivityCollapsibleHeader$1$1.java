package com.facebook.aura.status.view;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ActivityScheduledTasksKt$ActivityCollapsibleHeader$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ String $stateLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityScheduledTasksKt$ActivityCollapsibleHeader$1$1(String str) {
        super(1);
        this.$stateLabel = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass006.A19(interfaceC0857A6e);
        AbstractC1564Ale.A09(interfaceC0857A6e, this.$stateLabel);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
