package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailOwnerConfirmationScreenKt$EmailOwnerCodeEntry$1$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ String $key;
    public final /* synthetic */ EmailViewModel $model;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$model.updateOwnerCode(str, this.$key);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailOwnerConfirmationScreenKt$EmailOwnerCodeEntry$1$1$1(EmailViewModel emailViewModel, String str) {
        super(1);
        this.$model = emailViewModel;
        this.$key = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
