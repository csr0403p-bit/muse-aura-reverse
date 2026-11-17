package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import com.facebook.aura.email.viewmodel.EmailEventLogger;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailScreenKt$EmailInbox$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ EmailViewModel $model;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailInbox$2$1(EmailViewModel emailViewModel) {
        super(0);
        this.$model = emailViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        EmailEventLogger.INSTANCE.inboxRefreshed();
        this.$model.pullToRefresh();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
