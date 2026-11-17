package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailViewModel;

/* loaded from: classes.dex */
public final class EmailCreateFormKt$EmailCreateForm$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $defaultSenderName;
    public final /* synthetic */ EmailViewModel $model;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailCreateFormKt$EmailCreateForm$1$1(EmailViewModel emailViewModel, String str) {
        super(1);
        this.$model = emailViewModel;
        this.$defaultSenderName = str;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$model.applyDefaultSenderName(this.$defaultSenderName);
        return new C78g() { // from class: com.facebook.aura.email.view.EmailCreateFormKt$EmailCreateForm$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
