package com.facebook.aura.spaces.view;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class SpaceMenuSheetKt$SpaceMenuActions$3$1 extends C7438Evz implements Function0<Unit> {
    public SpaceMenuSheetKt$SpaceMenuActions$3$1(Object obj) {
        super(0, obj, SpaceMenuViewModel.class, "togglePin", "togglePin()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SpaceMenuViewModel) this.receiver).togglePin();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
