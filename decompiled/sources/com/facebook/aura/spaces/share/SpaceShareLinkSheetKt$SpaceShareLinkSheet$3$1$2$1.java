package com.facebook.aura.spaces.share;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class SpaceShareLinkSheetKt$SpaceShareLinkSheet$3$1$2$1 extends C7438Evz implements Function0<Unit> {
    public SpaceShareLinkSheetKt$SpaceShareLinkSheet$3$1$2$1(Object obj) {
        super(0, obj, SpaceShareLinkViewModel.class, "publish", "publish()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SpaceShareLinkViewModel) this.receiver).publish();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
