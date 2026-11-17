package com.facebook.aura.email.view;

import X.C7438Evz;
import com.facebook.aura.email.viewmodel.EmailAttachmentViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class EmailAttachmentScreenKt$EmailAttachmentScreen$3$1$1 extends C7438Evz implements Function0<Unit> {
    public EmailAttachmentScreenKt$EmailAttachmentScreen$3$1$1(Object obj) {
        super(0, obj, EmailAttachmentViewModel.class, "retry", "retry()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EmailAttachmentViewModel) this.receiver).retry();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
