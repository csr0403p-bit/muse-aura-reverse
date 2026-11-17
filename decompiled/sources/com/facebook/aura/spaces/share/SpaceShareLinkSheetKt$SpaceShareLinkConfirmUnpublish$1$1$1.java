package com.facebook.aura.spaces.share;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceShareLinkSheetKt$SpaceShareLinkConfirmUnpublish$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onUnpublish;
    public final /* synthetic */ boolean $unpublishing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceShareLinkSheetKt$SpaceShareLinkConfirmUnpublish$1$1$1(boolean z, Function0<Unit> function0) {
        super(0);
        this.$unpublishing = z;
        this.$onUnpublish = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$unpublishing) {
            return;
        }
        this.$onUnpublish.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
