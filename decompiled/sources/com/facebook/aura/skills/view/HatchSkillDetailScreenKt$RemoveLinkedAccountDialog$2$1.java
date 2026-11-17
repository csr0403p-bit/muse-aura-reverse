package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchSkillDetailScreenKt$RemoveLinkedAccountDialog$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isRemoving;
    public final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSkillDetailScreenKt$RemoveLinkedAccountDialog$2$1(boolean z, Function0<Unit> function0) {
        super(0);
        this.$isRemoving = z;
        this.$onDismiss = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isRemoving) {
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
