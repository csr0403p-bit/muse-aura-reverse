package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.agentpermission.AgentPermissionNotificationRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionNotificationRepository$start$surface$1", f = "AgentPermissionNotificationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AgentPermissionNotificationRepository$start$surface$1 extends AbstractC07127nr implements G0W<Boolean, Boolean, HtJ<? super AgentPermissionNotificationRepository.ApprovalSurface>, Object> {
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public int label;

    public AgentPermissionNotificationRepository$start$surface$1(HtJ<? super AgentPermissionNotificationRepository$start$surface$1> htJ) {
        super(3, htJ);
    }

    public final Object invoke(boolean z, boolean z2, HtJ<? super AgentPermissionNotificationRepository.ApprovalSurface> htJ) {
        AgentPermissionNotificationRepository$start$surface$1 agentPermissionNotificationRepository$start$surface$1 = new AgentPermissionNotificationRepository$start$surface$1(htJ);
        agentPermissionNotificationRepository$start$surface$1.Z$0 = z;
        agentPermissionNotificationRepository$start$surface$1.Z$1 = z2;
        return agentPermissionNotificationRepository$start$surface$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return z ? AgentPermissionNotificationRepository.ApprovalSurface.IN_APP : z2 ? AgentPermissionNotificationRepository.ApprovalSurface.NOTIFICATION : AgentPermissionNotificationRepository.ApprovalSurface.NONE;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, HtJ<? super AgentPermissionNotificationRepository.ApprovalSurface> htJ) {
        return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), htJ);
    }
}
