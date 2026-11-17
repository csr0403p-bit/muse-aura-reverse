package com.facebook.aura.library.view;

import X.C7438Evz;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$2$4$1 extends C7438Evz implements Function0<Unit> {
    public HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$2$4$1(Object obj) {
        super(0, obj, HatchGoalsTabViewModel.class, "loadMoreTracking", "loadMoreTracking()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchGoalsTabViewModel) this.receiver).loadMoreTracking();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
