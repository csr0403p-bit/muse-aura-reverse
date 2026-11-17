package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G2j;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionNotificationRepository$start$keptAlive$1", f = "AgentPermissionNotificationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AgentPermissionNotificationRepository$start$keptAlive$1 extends AbstractC07127nr implements G2j<Boolean, Boolean, Boolean, HtJ<? super Boolean>, Object> {
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public /* synthetic */ boolean Z$2;
    public int label;

    public AgentPermissionNotificationRepository$start$keptAlive$1(HtJ<? super AgentPermissionNotificationRepository$start$keptAlive$1> htJ) {
        super(4, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r3 = r4.Z$0
            boolean r2 = r4.Z$1
            boolean r1 = r4.Z$2
            int r0 = r4.label
            if (r0 != 0) goto L1a
            X.Hwg.A00(r5)
            if (r3 != 0) goto L14
            if (r2 != 0) goto L14
            r0 = 0
            if (r1 == 0) goto L15
        L14:
            r0 = 1
        L15:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionNotificationRepository$start$keptAlive$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, HtJ<? super Boolean> htJ) {
        return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), AnonymousClass001.A1X(bool3), htJ);
    }

    public final Object invoke(boolean z, boolean z2, boolean z3, HtJ<? super Boolean> htJ) {
        AgentPermissionNotificationRepository$start$keptAlive$1 agentPermissionNotificationRepository$start$keptAlive$1 = new AgentPermissionNotificationRepository$start$keptAlive$1(htJ);
        agentPermissionNotificationRepository$start$keptAlive$1.Z$0 = z;
        agentPermissionNotificationRepository$start$keptAlive$1.Z$1 = z2;
        agentPermissionNotificationRepository$start$keptAlive$1.Z$2 = z3;
        return agentPermissionNotificationRepository$start$keptAlive$1.invokeSuspend(Unit.INSTANCE);
    }
}
