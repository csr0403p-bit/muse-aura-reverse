package com.facebook.aura.library.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0W;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$2$6$1 extends C7438Evz implements G0W<String, String, String, Unit> {
    public HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$2$6$1(Object obj) {
        super(3, obj, HatchGoalsTabViewModel.class, "updateGoal", "updateGoal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2, String str3) {
        ((HatchGoalsTabViewModel) AnonymousClass006.A0o(str, this)).updateGoal(str, str2, str3);
    }
}
