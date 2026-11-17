package com.facebook.aura.gateway;

import X.AnonymousClass004;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.json.NetworkException;

/* loaded from: classes2.dex */
public abstract class HatchAgentPermissionsRepositoryKt {
    public static final String ALWAYS_SCOPE_CONNECTOR_ALL_ACTIONS = "connector_all_actions";
    public static final String ALWAYS_SCOPE_ENTITY = "entity";
    public static final String DEVICE_COPY_TAG = "HatchDeviceApprovalCopy";
    public static final long LOST_DECIDE_READ_INITIAL_BACKOFF_MS = 1000;
    public static final int LOST_DECIDE_READ_MAX_ATTEMPTS = 8;
    public static final long LOST_DECIDE_READ_MAX_BACKOFF_MS = 30000;
    public static final String TAG = "HatchAgentPermissionsRepo";

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        if (r2.equals(r3) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.gateway.ApprovalPresentation classifyApprovalPresentation(com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval r3, java.lang.String r4) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r3, r0)
            com.facebook.aura.gateway.ApprovalOrigin r1 = r3.origin
            com.facebook.aura.gateway.ApprovalOrigin r0 = com.facebook.aura.gateway.ApprovalOrigin.LOCAL_HITL
            if (r1 == r0) goto L3f
            com.facebook.aura.gateway.ApprovalAttentionMode r1 = r3.attentionMode
            com.facebook.aura.gateway.ApprovalAttentionMode r0 = com.facebook.aura.gateway.ApprovalAttentionMode.BACKGROUND
            if (r1 == r0) goto L3a
            java.lang.String r0 = r3.threadId
            r3 = 0
            if (r0 == 0) goto L3d
            java.lang.String r2 = X.AnonymousClass002.A0l(r0)
            if (r2 == 0) goto L3d
            int r0 = r2.length()
            if (r0 <= 0) goto L3d
        L21:
            if (r4 == 0) goto L30
            java.lang.String r1 = X.AnonymousClass002.A0l(r4)
            if (r1 == 0) goto L30
            int r0 = r1.length()
            if (r0 <= 0) goto L30
            r3 = r1
        L30:
            if (r2 == 0) goto L3f
            if (r3 == 0) goto L3f
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto L3f
        L3a:
            com.facebook.aura.gateway.ApprovalPresentation r0 = com.facebook.aura.gateway.ApprovalPresentation.NONBLOCKING
            return r0
        L3d:
            r2 = r3
            goto L21
        L3f:
            com.facebook.aura.gateway.ApprovalPresentation r0 = com.facebook.aura.gateway.ApprovalPresentation.BLOCKING
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAgentPermissionsRepositoryKt.classifyApprovalPresentation(com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval, java.lang.String):com.facebook.aura.gateway.ApprovalPresentation");
    }

    public static final boolean isDefiniteDecideRejection(Throwable th) {
        int i;
        return (th instanceof NetworkException) && 400 <= (i = ((NetworkException) th).httpResponseCode) && i < 500 && i != 408;
    }

    public static final HatchAgentPermissionsRepository.AgentPermissionApproval withDeviceCopy(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.DeviceApprovalCopy deviceApprovalCopy, boolean z) {
        boolean zA1b = AnonymousClass004.A1b(agentPermissionApproval, deviceApprovalCopy);
        String str = deviceApprovalCopy.purposeSummary;
        if (str == null) {
            str = agentPermissionApproval.purposeSummary;
        }
        String str2 = deviceApprovalCopy.scopeSummary;
        if (str2 == null) {
            str2 = agentPermissionApproval.scopeSummary;
        }
        String str3 = deviceApprovalCopy.requestPreview;
        if (str3 == null) {
            str3 = agentPermissionApproval.requestPreview;
        }
        return HatchAgentPermissionsRepository.AgentPermissionApproval.copy$default(agentPermissionApproval, null, zA1b, null, 0L, null, null, null, null, str2, str, null, null, null, (!z || agentPermissionApproval.requestPreviewDocument == null) ? agentPermissionApproval.requestPresentation : AgentPermissionRequestPresentation.INLINE, null, zA1b, str3, null, null, null, null, null, null, null, null, null, null, null, null, zA1b, null, null, -74497, null);
    }
}
