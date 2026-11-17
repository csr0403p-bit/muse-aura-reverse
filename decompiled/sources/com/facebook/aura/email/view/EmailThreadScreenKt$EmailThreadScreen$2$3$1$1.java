package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailThreadScreenKt$EmailThreadScreen$2$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $loadKey;
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailThreadScreenKt$EmailThreadScreen$2$3$1$1(EmailViewModel emailViewModel, String str, String str2) {
        super(0);
        this.$model = emailViewModel;
        this.$threadId = str;
        this.$loadKey = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$model.loadThread(this.$threadId, this.$loadKey);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
