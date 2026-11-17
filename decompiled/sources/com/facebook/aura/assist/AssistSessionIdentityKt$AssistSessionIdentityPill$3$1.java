package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AssistSessionIdentityKt$AssistSessionIdentityPill$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AssistIdentityPresentation $identity;
    public final /* synthetic */ Function0<Unit> $onRestore;
    public final /* synthetic */ AssistIdentityState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistSessionIdentityKt$AssistSessionIdentityPill$3$1(AssistIdentityState assistIdentityState, Function0<Unit> function0, AssistIdentityPresentation assistIdentityPresentation) {
        super(0);
        this.$state = assistIdentityState;
        this.$onRestore = function0;
        this.$identity = assistIdentityPresentation;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        (this.$state.isParked() ? this.$onRestore : this.$identity.onOpenApp).invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
