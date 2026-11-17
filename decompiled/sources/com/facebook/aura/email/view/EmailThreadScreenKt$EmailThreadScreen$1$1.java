package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailThreadSessionViewModel;

/* loaded from: classes.dex */
public final class EmailThreadScreenKt$EmailThreadScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ EmailThreadSessionViewModel $threadSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailThreadScreenKt$EmailThreadScreen$1$1(EmailThreadSessionViewModel emailThreadSessionViewModel, String str) {
        super(1);
        this.$threadSession = emailThreadSessionViewModel;
        this.$threadId = str;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$threadSession.bind(this.$threadId);
        return new C78g() { // from class: com.facebook.aura.email.view.EmailThreadScreenKt$EmailThreadScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
