package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class PeerSpaceLeaveDialogKt$PeerSpaceLeaveDialog$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Boolean> $leaving$delegate;
    public final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerSpaceLeaveDialogKt$PeerSpaceLeaveDialog$4$1(Function0<Unit> function0, C1BO<Boolean> c1bo) {
        super(0);
        this.$onDismiss = function0;
        this.$leaving$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (C1BO.A0F(this.$leaving$delegate)) {
            return;
        }
        this.$onDismiss.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
