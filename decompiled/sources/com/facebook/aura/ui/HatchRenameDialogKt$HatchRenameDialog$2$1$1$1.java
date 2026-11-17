package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C0Hi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchRenameDialogKt$HatchRenameDialog$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $clearFocusOnConfirm;
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ Function0<Unit> $onConfirm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRenameDialogKt$HatchRenameDialog$2$1$1$1(boolean z, C0Hi c0Hi, Function0<Unit> function0) {
        super(0);
        this.$clearFocusOnConfirm = z;
        this.$focusManager = c0Hi;
        this.$onConfirm = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$clearFocusOnConfirm) {
            this.$focusManager.A6G(false);
        }
        this.$onConfirm.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
