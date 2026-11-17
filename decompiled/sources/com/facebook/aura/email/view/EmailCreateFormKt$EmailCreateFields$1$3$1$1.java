package com.facebook.aura.email.view;

import X.C7438Evz;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class EmailCreateFormKt$EmailCreateFields$1$3$1$1 extends C7438Evz implements Function0<Unit> {
    public EmailCreateFormKt$EmailCreateFields$1$3$1$1(Object obj) {
        super(0, obj, EmailViewModel.class, "checkAddressAvailability", "checkAddressAvailability()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EmailViewModel) this.receiver).checkAddressAvailability();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
