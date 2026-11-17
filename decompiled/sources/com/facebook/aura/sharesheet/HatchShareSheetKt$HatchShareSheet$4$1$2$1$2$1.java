package com.facebook.aura.sharesheet;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchShareSheetKt$HatchShareSheet$4$1$2$1$2$1 extends C7438Evz implements Function0<Unit> {
    public HatchShareSheetKt$HatchShareSheet$4$1$2$1$2$1(Object obj) {
        super(0, obj, HatchShareSheetViewModel.class, "retryIdeaShare", "retryIdeaShare()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchShareSheetViewModel) this.receiver).retryIdeaShare();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
