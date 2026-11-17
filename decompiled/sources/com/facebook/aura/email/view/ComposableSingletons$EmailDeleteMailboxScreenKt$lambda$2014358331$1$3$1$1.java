package com.facebook.aura.email.view;

import X.C7438Evz;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.email.view.ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$-2014358331$1$3$1$1, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1$3$1$1 extends C7438Evz implements Function0<Unit> {
    public ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1$3$1$1(Object obj) {
        super(0, obj, EmailViewModel.class, "loadMailboxForReset", "loadMailboxForReset()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EmailViewModel) this.receiver).loadMailboxForReset();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
