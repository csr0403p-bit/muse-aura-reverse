package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailViewModel;

/* loaded from: classes.dex */
public final class EmailThreadScreenKt$EmailThreadScreen$2$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $loadKey;
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailThreadScreenKt$EmailThreadScreen$2$1$1(EmailViewModel emailViewModel, String str, String str2) {
        super(1);
        this.$model = emailViewModel;
        this.$threadId = str;
        this.$loadKey = str2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$model.loadThread(this.$threadId, this.$loadKey);
        return new C78g() { // from class: com.facebook.aura.email.view.EmailThreadScreenKt$EmailThreadScreen$2$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
