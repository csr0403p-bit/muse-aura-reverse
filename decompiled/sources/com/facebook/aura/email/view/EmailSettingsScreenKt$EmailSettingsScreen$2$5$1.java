package com.facebook.aura.email.view;

import X.C7438Evz;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class EmailSettingsScreenKt$EmailSettingsScreen$2$5$1 extends C7438Evz implements Function0<Unit> {
    public EmailSettingsScreenKt$EmailSettingsScreen$2$5$1(Object obj) {
        super(0, obj, EmailViewModel.class, "refresh", "refresh()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EmailViewModel) this.receiver).refresh();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
