package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailInboxEntryPoint;
import com.facebook.aura.email.viewmodel.EmailInboxSessionViewModel;

/* loaded from: classes.dex */
public final class EmailScreenKt$EmailScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ EmailInboxEntryPoint $entryPoint;
    public final /* synthetic */ EmailInboxSessionViewModel $inboxSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailScreen$1$1(EmailInboxSessionViewModel emailInboxSessionViewModel, EmailInboxEntryPoint emailInboxEntryPoint) {
        super(1);
        this.$inboxSession = emailInboxSessionViewModel;
        this.$entryPoint = emailInboxEntryPoint;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$inboxSession.onShown(this.$entryPoint);
        final EmailInboxSessionViewModel emailInboxSessionViewModel = this.$inboxSession;
        return new C78g() { // from class: com.facebook.aura.email.view.EmailScreenKt$EmailScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                emailInboxSessionViewModel.onHidden();
            }
        };
    }
}
