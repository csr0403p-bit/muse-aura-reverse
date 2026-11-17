package com.facebook.aura.email.viewmodel;

import X.AbstractC07127nr;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$awaitLaunchDestination$ready$1", f = "EmailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class EmailViewModel$awaitLaunchDestination$ready$1 extends AbstractC07127nr implements G0V<EmailState, HtJ<? super Boolean>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public EmailViewModel$awaitLaunchDestination$ready$1(HtJ<? super EmailViewModel$awaitLaunchDestination$ready$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        EmailViewModel$awaitLaunchDestination$ready$1 emailViewModel$awaitLaunchDestination$ready$1 = new EmailViewModel$awaitLaunchDestination$ready$1(htJ);
        emailViewModel$awaitLaunchDestination$ready$1.L$0 = obj;
        return emailViewModel$awaitLaunchDestination$ready$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            java.lang.Object r1 = r2.L$0
            com.facebook.aura.email.viewmodel.EmailState r1 = (com.facebook.aura.email.viewmodel.EmailState) r1
            int r0 = r2.label
            if (r0 != 0) goto L26
            X.Hwg.A00(r3)
            boolean r0 = r1.loading
            if (r0 != 0) goto L20
            boolean r0 = r1.hasLoaded
            if (r0 == 0) goto L20
            com.facebook.aura.email.viewmodel.EmailError r0 = r1.error
            if (r0 != 0) goto L20
            java.lang.String r0 = r1.pendingResetAddress
            if (r0 != 0) goto L20
            boolean r1 = r1.deletingMailbox
            r0 = 1
            if (r1 == 0) goto L21
        L20:
            r0 = 0
        L21:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L26:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.viewmodel.EmailViewModel$awaitLaunchDestination$ready$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(EmailState emailState, HtJ<? super Boolean> htJ) {
        EmailViewModel$awaitLaunchDestination$ready$1 emailViewModel$awaitLaunchDestination$ready$1 = new EmailViewModel$awaitLaunchDestination$ready$1(htJ);
        emailViewModel$awaitLaunchDestination$ready$1.L$0 = emailState;
        return emailViewModel$awaitLaunchDestination$ready$1.invokeSuspend(Unit.INSTANCE);
    }
}
