package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationLifecycle$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $key;
    public final /* synthetic */ Function0<Unit> $onCompleted;
    public final /* synthetic */ C1BO<EmailState> $state$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationLifecycle$3$1(String str, Function0<Unit> function0, C1BO<EmailState> c1bo) {
        super(1);
        this.$key = str;
        this.$onCompleted = function0;
        this.$state$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (C7384Etj.areEqual(C1BO.A06(this.$state$delegate).ownerConfirmedKey, this.$key)) {
            this.$onCompleted.invoke();
        }
        return new C78g() { // from class: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationLifecycle$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
