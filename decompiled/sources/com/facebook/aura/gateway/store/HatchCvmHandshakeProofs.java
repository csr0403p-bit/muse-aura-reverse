package com.facebook.aura.gateway.store;

import X.A64;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.BFI;
import X.BzK;
import X.C07779iq;
import X.C0881AGi;
import X.C3cG;
import X.C4oT;
import X.C7384Etj;
import X.CFK;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;
import com.facebook.aura.json.HatchJsonKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchCvmHandshakeProofs {
    public static final String KEY_PROVEN_VM_IDS = "proven_vm_ids";
    public static final int LIMIT = 64;
    public static final String TAG = "HatchCvmHandshakeProofs";
    public static String decodedRaw;
    public static final HatchCvmHandshakeProofs INSTANCE = new HatchCvmHandshakeProofs();
    public static final Object writeLock = C3cG.A0T();
    public static List<String> decodedIds = C0881AGi.A00;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean isProven(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L1a
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L1a
            java.util.List r0 = r2.provenIds()     // Catch: java.lang.Throwable -> L17
            r1 = 1
            if (r0 == 0) goto L1b
            boolean r0 = r0.contains(r3)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L1a
            goto L1b
        L17:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        L1a:
            r1 = 0
        L1b:
            monitor-exit(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.store.HatchCvmHandshakeProofs.isProven(java.lang.String):boolean");
    }

    public final void record(String str, String str2) {
        List<String> listProvenIds;
        C7384Etj.A0Y(str, 0);
        synchronized (writeLock) {
            String str3 = str.length() > 0 ? str : null;
            if (str2 == null || str2.length() <= 0 || str2.equals(str)) {
                str2 = null;
            }
            List listA0F = BFI.A0F(new String[]{str3, str2});
            if (!listA0F.isEmpty()) {
                HatchCvmHandshakeProofs hatchCvmHandshakeProofs = INSTANCE;
                synchronized (hatchCvmHandshakeProofs) {
                    listProvenIds = hatchCvmHandshakeProofs.provenIds();
                }
                if (listProvenIds != null) {
                    ArrayList arrayListA0h = C3cG.A0h();
                    for (String str4 : listProvenIds) {
                        if (!listA0F.contains(str4)) {
                            arrayListA0h.add(str4);
                        }
                    }
                    List listA0e = AbstractC0878AGe.A0e(AbstractC0878AGe.A0P(listA0F, arrayListA0h), 64);
                    if (!C7384Etj.areEqual(listA0e, listProvenIds)) {
                        BzK bzKA9q = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.CVM_HANDSHAKE_PROOFS).A9q();
                        bzKA9q.AYr(KEY_PROVEN_VM_IDS, HatchJsonKt.HatchJson.A02(listA0e, AnonymousClass001.A13()));
                        if (!bzKA9q.commit()) {
                            CFK.A04(TAG, "Could not persist a handshake-proven CVM");
                        }
                    }
                }
            }
        }
    }

    private final C4oT prefs() {
        return AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.CVM_HANDSHAKE_PROOFS);
    }

    private final List<String> provenIds() {
        List<String> list = null;
        String string = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.CVM_HANDSHAKE_PROOFS).getString(KEY_PROVEN_VM_IDS, null);
        if (string == null) {
            return C0881AGi.A00;
        }
        if (string.equals(decodedRaw)) {
            return decodedIds;
        }
        try {
            list = (List) HatchJsonKt.HatchJson.A00(string, new A64(C07779iq.A01));
        } catch (Exception e) {
            CFK.A0J(TAG, e, "Handshake-proven CVMs unreadable");
        }
        decodedIds = list;
        decodedRaw = string;
        return list;
    }
}
