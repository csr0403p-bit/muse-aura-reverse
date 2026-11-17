package com.facebook.aura.library.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.library.model.GoalDetailViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class GoalDetailScreenKt$GoalDetailScreen$4$1$1$3$1 extends C7438Evz implements G0U<String, Unit> {
    public GoalDetailScreenKt$GoalDetailScreen$4$1$1$3$1(Object obj) {
        super(1, obj, GoalDetailViewModel.class, "deleteCron", "deleteCron(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((GoalDetailViewModel) AnonymousClass006.A0o(str, this)).deleteCron(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
