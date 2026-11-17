package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailViewModel;

/* loaded from: classes.dex */
public final class EmailSettingsScreenKt$EmailFormScreen$3$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $formKey;
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ C1BO<String> $name$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSettingsScreenKt$EmailFormScreen$3$1$1(EmailViewModel emailViewModel, String str, C1BO<String> c1bo) {
        super(1);
        this.$model = emailViewModel;
        this.$formKey = str;
        this.$name$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$model.prepareForm(false, C1BO.A08(this.$name$delegate), this.$formKey);
        return new C78g() { // from class: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailFormScreen$3$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
