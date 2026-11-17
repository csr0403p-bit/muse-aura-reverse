package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import com.facebook.aura.email.model.EmailSummary;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailSwipeRowKt$EmailSwipeRow$onTrust$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ EmailSummary $summary;
    public final /* synthetic */ String $trustFailed;
    public final /* synthetic */ String $trusted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSwipeRowKt$EmailSwipeRow$onTrust$1$1(EmailViewModel emailViewModel, EmailSummary emailSummary, String str, String str2) {
        super(0);
        this.$model = emailViewModel;
        this.$summary = emailSummary;
        this.$trusted = str;
        this.$trustFailed = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$model.trustSender(this.$summary, this.$trusted, this.$trustFailed);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
