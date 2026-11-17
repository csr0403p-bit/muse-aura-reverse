package com.facebook.aura.confidentialvm.repository;

import X.AbstractC3358CGz;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.HatchJsonKt;

/* loaded from: classes4.dex */
public final class ConfidentialVmPinStateStore {
    public final AbstractC3358CGz userSession;

    public ConfidentialVmPinStateStore(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    public final synchronized void clearPendingUpdate(String str) {
        C7384Etj.A0Y(str, 0);
        PinUpdateRequestJson pendingUpdate = readPendingUpdate();
        if (str.equals(pendingUpdate != null ? pendingUpdate.update_id : null)) {
            getGatewayPrefs().setPendingPinUpdateJson(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.aura.confidentialvm.repository.PinUpdateRequestJson] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.facebook.aura.confidentialvm.repository.PinUpdateRequestJson] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public final synchronized PinUpdateRequestJson readPendingUpdate() {
        ?? r3;
        String pendingPinUpdateJson = getGatewayPrefs().getPendingPinUpdateJson();
        r3 = 0;
        String str = null;
        r3 = 0;
        if (pendingPinUpdateJson != null && !C7BY.A0j(pendingPinUpdateJson)) {
            try {
                str = (PinUpdateRequestJson) HatchJsonKt.HatchJson.A00(pendingPinUpdateJson, PinUpdateRequestJson$$serializer.INSTANCE);
                r3 = str;
            } catch (Exception e) {
                CFK.A0K(ConfidentialVmPinStateStoreKt.TAG, e, "readPendingUpdate: dropping unreadable pending update");
                getGatewayPrefs().setPendingPinUpdateJson(str);
                r3 = str;
            }
        }
        return r3;
    }

    public final synchronized void writePendingUpdate(PinUpdateRequestJson pinUpdateRequestJson) {
        C7384Etj.A0Y(pinUpdateRequestJson, 0);
        try {
            getGatewayPrefs().setPendingPinUpdateJson(HatchJsonKt.HatchJson.A02(pinUpdateRequestJson, PinUpdateRequestJson$$serializer.INSTANCE));
        } catch (Exception e) {
            getGatewayPrefs().setPendingPinUpdateJson(null);
            CFK.A0K(ConfidentialVmPinStateStoreKt.TAG, e, "writePendingUpdate: failed to persist pending update");
        }
    }

    private final HatchGatewayPrefsStore getGatewayPrefs() {
        return HatchGatewayPrefsStore.Companion.getInstance(this.userSession);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[Catch: all -> 0x003f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0015, B:11:0x001c, B:13:0x0022, B:14:0x002f, B:15:0x0032, B:17:0x0038, B:18:0x003b), top: B:24:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateApplyResult applySnapshot(com.facebook.aura.confidentialvm.repository.ConfidentialVmPinState r8) {
        /*
            r7 = this;
            java.lang.String r6 = "applySnapshot: revision "
            monitor-enter(r7)
            r0 = 0
            X.C7384Etj.A0Y(r8, r0)     // Catch: java.lang.Throwable -> L3f
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinState r5 = r7.read()     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L32
            long r3 = r8.stateRevision     // Catch: java.lang.Throwable -> L3f
            long r1 = r5.stateRevision     // Catch: java.lang.Throwable -> L3f
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L18
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateApplyResult r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateApplyResult.IGNORED_LOWER_REVISION     // Catch: java.lang.Throwable -> L3f
            goto L3d
        L18:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L32
            boolean r0 = r8.equals(r5)     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L2f
            java.lang.String r3 = "ConfidentialVmPinStateStore"
            long r1 = r8.stateRevision     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = " differs from stored copy"
            java.lang.String r0 = X.FGI.A0J(r6, r1, r0)     // Catch: java.lang.Throwable -> L3f
            X.CFK.A06(r3, r0)     // Catch: java.lang.Throwable -> L3f
        L2f:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateApplyResult r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateApplyResult.IDEMPOTENT     // Catch: java.lang.Throwable -> L3f
            goto L3d
        L32:
            boolean r0 = r7.write(r8)     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3b
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateApplyResult r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateApplyResult.APPLIED     // Catch: java.lang.Throwable -> L3f
            goto L3d
        L3b:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateApplyResult r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateApplyResult.STORAGE_FAILURE     // Catch: java.lang.Throwable -> L3f
        L3d:
            monitor-exit(r7)
            return r0
        L3f:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateStore.applySnapshot(com.facebook.aura.confidentialvm.repository.ConfidentialVmPinState):com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateApplyResult");
    }

    private final boolean write(ConfidentialVmPinState confidentialVmPinState) {
        try {
            getGatewayPrefs().setPinStateJson(HatchJsonKt.HatchJson.A02(ConfidentialVmPinReminderJsonKt.toJson(confidentialVmPinState), PinStateJson$$serializer.INSTANCE));
            return true;
        } catch (Exception e) {
            CFK.A0K(ConfidentialVmPinStateStoreKt.TAG, e, "write: failed to persist PIN state");
            return false;
        }
    }

    public final void clear() {
        getGatewayPrefs().setPinStateJson(null);
    }

    public final ConfidentialVmPinState read() {
        String pinStateJson = getGatewayPrefs().getPinStateJson();
        ConfidentialVmPinState domain = null;
        if (pinStateJson != null && !C7BY.A0j(pinStateJson)) {
            try {
                domain = ConfidentialVmPinReminderJsonKt.toDomain((PinStateJson) HatchJsonKt.HatchJson.A00(pinStateJson, PinStateJson$$serializer.INSTANCE));
                return domain;
            } catch (Exception e) {
                CFK.A0K(ConfidentialVmPinStateStoreKt.TAG, e, "read: dropping unreadable PIN state");
            }
        }
        return domain;
    }
}
