package com.facebook.aura.graduation;

import X.C7438Evz;
import com.facebook.aura.graduation.viewmodel.GraduationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class GraduationScreenKt$GraduationScreen$1$1$1$1 extends C7438Evz implements Function0<Unit> {
    public GraduationScreenKt$GraduationScreen$1$1$1$1(Object obj) {
        super(0, obj, GraduationViewModel.class, "onSaveVideoClick", "onSaveVideoClick()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GraduationViewModel) this.receiver).onSaveVideoClick();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
