package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailViewModel;

/* renamed from: com.facebook.aura.email.view.ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$-2014358331$1$1$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ EmailViewModel $model;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1$1$1(EmailViewModel emailViewModel) {
        super(1);
        this.$model = emailViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$model.clearDeleteError();
        this.$model.loadMailboxForReset();
        return new C78g() { // from class: com.facebook.aura.email.view.ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$-2014358331$1$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
