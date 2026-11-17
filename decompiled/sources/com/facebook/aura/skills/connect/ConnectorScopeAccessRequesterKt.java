package com.facebook.aura.skills.connect;

/* loaded from: classes.dex */
public abstract class ConnectorScopeAccessRequesterKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.G0U<java.lang.String, kotlin.Unit> rememberConnectorScopeAccessRequester(java.lang.String r9, java.lang.String r10, X.BFM r11, int r12, int r13) {
        /*
            r8 = r10
            r1 = 0
            r5 = r9
            X.C7384Etj.A0Y(r9, r1)
            r2 = r13 & 2
            r0 = 0
            if (r2 == 0) goto Lc
            r8 = r0
        Lc:
            android.content.Context r10 = X.AnonymousClass003.A0O(r11)
            X.CGz r3 = X.AnonymousClass002.A0h(r11)
            boolean r0 = r11.A65(r3)
            java.lang.Object r9 = r11.AaT()
            if (r0 != 0) goto L22
            java.lang.Object r0 = X.C78N.A00
            if (r9 != r0) goto L2a
        L22:
            com.facebook.aura.skills.repo.SkillPermissionsRepository r9 = new com.facebook.aura.skills.repo.SkillPermissionsRepository
            r9.<init>(r3)
            r11.Ai0(r9)
        L2a:
            com.facebook.aura.skills.repo.SkillPermissionsRepository r9 = (com.facebook.aura.skills.repo.SkillPermissionsRepository) r9
            java.lang.Object r0 = r11.AaT()
            java.lang.Object r2 = X.C78N.A00
            java.lang.Object r6 = X.AnonymousClass004.A15(r11, r0, r2)
            X.3UX r6 = (X.C3UX) r6
            boolean r0 = r11.A65(r3)
            java.lang.Object r7 = r11.AaT()
            r4 = 0
            if (r0 != 0) goto L45
            if (r7 != r2) goto L4e
        L45:
            com.facebook.aura.common.coroutines.OnDuplicateCall$Join r0 = com.facebook.aura.common.coroutines.OnDuplicateCall.Join.INSTANCE
            com.facebook.aura.common.coroutines.SingleFlight r7 = com.facebook.aura.common.coroutines.SingleFlightKt.SingleFlight(r3, r0, r1)
            r11.Ai0(r7)
        L4e:
            com.facebook.aura.common.coroutines.SingleFlight r7 = (com.facebook.aura.common.coroutines.SingleFlight) r7
            r0 = r12 & 14
            r0 = r0 ^ 6
            r1 = 4
            if (r0 <= r1) goto L5d
            boolean r0 = r11.A65(r5)
            if (r0 != 0) goto L62
        L5d:
            r0 = r12 & 6
            r3 = 0
            if (r0 != r1) goto L63
        L62:
            r3 = 1
        L63:
            r0 = r12 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L71
            boolean r0 = r11.A65(r8)
            if (r0 != 0) goto L75
        L71:
            r0 = r12 & 48
            if (r0 != r1) goto L76
        L75:
            r4 = 1
        L76:
            r3 = r3 | r4
            boolean r0 = X.AnonymousClass005.A1T(r11, r10, r9, r6, r3)
            boolean r0 = X.AnonymousClass001.A1R(r11, r7, r0)
            java.lang.Object r4 = r11.AaT()
            if (r0 != 0) goto L87
            if (r4 != r2) goto L8f
        L87:
            com.facebook.aura.skills.connect.ConnectorScopeAccessRequesterKt$rememberConnectorScopeAccessRequester$1$1 r4 = new com.facebook.aura.skills.connect.ConnectorScopeAccessRequesterKt$rememberConnectorScopeAccessRequester$1$1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.Ai0(r4)
        L8f:
            X.G0U r4 = (X.G0U) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.ConnectorScopeAccessRequesterKt.rememberConnectorScopeAccessRequester(java.lang.String, java.lang.String, X.BFM, int, int):X.G0U");
    }
}
