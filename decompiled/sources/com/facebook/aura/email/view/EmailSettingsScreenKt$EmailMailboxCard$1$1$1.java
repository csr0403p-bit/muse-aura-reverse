package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailSettingsScreenKt$EmailMailboxCard$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $address;
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSettingsScreenKt$EmailMailboxCard$1$1$1(Context context, String str) {
        super(0);
        this.$context = context;
        this.$address = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        EmailSettingsScreenKt.copyEmailAddress(this.$context, this.$address);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
