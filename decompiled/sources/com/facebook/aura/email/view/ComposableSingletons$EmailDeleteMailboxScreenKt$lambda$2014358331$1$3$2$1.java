package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.email.view.ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$-2014358331$1$3$2$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1$3$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $deleted;
    public final /* synthetic */ String $key;
    public final /* synthetic */ EmailViewModel $model;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1$3$2$1(EmailViewModel emailViewModel, String str, String str2) {
        super(0);
        this.$model = emailViewModel;
        this.$key = str;
        this.$deleted = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$model.deleteMailbox(this.$key, this.$deleted, null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
