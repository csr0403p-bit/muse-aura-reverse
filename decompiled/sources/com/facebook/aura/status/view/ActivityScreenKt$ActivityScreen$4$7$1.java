package com.facebook.aura.status.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.status.viewmodel.ActivityViewModel;
import java.text.ParseException;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class ActivityScreenKt$ActivityScreen$4$7$1 extends C7438Evz implements G0U<String, Unit> {
    public ActivityScreenKt$ActivityScreen$4$7$1(Object obj) {
        super(1, obj, ActivityViewModel.class, "toggleDayCollapse", "toggleDayCollapse(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) throws ParseException {
        ((ActivityViewModel) AnonymousClass006.A0o(str, this)).toggleDayCollapse(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) throws ParseException {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
