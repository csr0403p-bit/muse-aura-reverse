package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationScreen$4$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $key;
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationScreen$4$1$1(EmailViewModel emailViewModel, String str, AuraNavigator auraNavigator) {
        super(0);
        this.$model = emailViewModel;
        this.$key = str;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$model.leaveOwnerStep(this.$key);
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
