package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0V;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailSettingsScreenKt$EmailSettingsScreen$2$4$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ String $deleteKey;
    public final /* synthetic */ EmailViewModel $model;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSettingsScreenKt$EmailSettingsScreen$2$4$1(EmailViewModel emailViewModel, String str) {
        super(2);
        this.$model = emailViewModel;
        this.$deleteKey = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.$model.deleteMailbox(this.$deleteKey, str, str2);
    }
}
