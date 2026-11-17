package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.navigation.AuraNavigator;

/* renamed from: com.facebook.aura.email.view.ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$-2014358331$1$2$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $key;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<EmailState> $state$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1$2$1(String str, AuraNavigator auraNavigator, C1BO<EmailState> c1bo) {
        super(1);
        this.$key = str;
        this.$navigator = auraNavigator;
        this.$state$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (C7384Etj.areEqual(C1BO.A06(this.$state$delegate).mailboxDeletedKey, this.$key)) {
            this.$navigator.back();
        }
        return new C78g() { // from class: com.facebook.aura.email.view.ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$-2014358331$1$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
