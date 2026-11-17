package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import com.facebook.aura.email.viewmodel.EmailEventLogger;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailScreenKt$EmailInbox$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ EmailState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailInbox$1$1(EmailState emailState, EmailViewModel emailViewModel) {
        super(0);
        this.$state = emailState;
        this.$model = emailViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        EmailState emailState = this.$state;
        if (emailState.loading || emailState.loadingMore) {
            return;
        }
        EmailEventLogger.INSTANCE.moreThreadsRequested(emailState.threads.size());
        this.$model.loadMore();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
