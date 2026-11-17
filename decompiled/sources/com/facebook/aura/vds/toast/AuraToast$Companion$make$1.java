package com.facebook.aura.vds.toast;

import X.AbstractC7559F3s;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraToast$Companion$make$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraToast.ToastArgs $args;
    public final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraToast$Companion$make$1(Function0<Unit> function0, AuraToast.ToastArgs toastArgs) {
        super(0);
        this.$onDismiss = function0;
        this.$args = toastArgs;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onDismiss.invoke();
        Function0<Unit> function0 = this.$args.onDismiss;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
