package com.facebook.aura.skills.repo;

/* loaded from: classes.dex */
public abstract class HatchConnectorCatalogRepositoryKt {
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean requiresConnectorPageRestart(java.lang.Throwable r4) {
        /*
            r3 = 0
            X.C7384Etj.A0Y(r4, r3)
            boolean r0 = r4 instanceof com.facebook.aura.json.NetworkException
            if (r0 == 0) goto L1b
            r2 = r4
            com.facebook.aura.json.NetworkException r2 = (com.facebook.aura.json.NetworkException) r2
            int r1 = r2.httpResponseCode
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L1b
            java.lang.String r1 = r2.errorCode
            java.lang.String r0 = "cursor_expired"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1f
        L1b:
            boolean r0 = r4 instanceof com.facebook.aura.skills.repo.ConnectorQueryChangedException
            if (r0 == 0) goto L20
        L1f:
            r3 = 1
        L20:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.HatchConnectorCatalogRepositoryKt.requiresConnectorPageRestart(java.lang.Throwable):boolean");
    }
}
