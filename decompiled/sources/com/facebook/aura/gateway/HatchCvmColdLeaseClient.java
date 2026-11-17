package com.facebook.aura.gateway;

import X.C7384Etj;
import X.CFK;
import com.facebook.aura.gateway.HatchCvmColdLeaseException;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.json.HatchProblemJsonKt;
import com.facebook.aura.json.NetworkException;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class HatchCvmColdLeaseClient {
    public static final int $stable = 0;
    public static final HatchCvmColdLeaseClient INSTANCE = new HatchCvmColdLeaseClient();
    public static final String TAG = "HatchCvmColdLeaseClient";

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* renamed from: coldLease-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m955coldLeasegIAlus(java.util.UUID r14, X.HtJ<? super X.HsJ<com.facebook.aura.gateway.HatchCvmColdLease>> r15) {
        /*
            r13 = this;
            r3 = r15
            boolean r0 = r15 instanceof com.facebook.aura.gateway.HatchCvmColdLeaseClient$coldLease$1
            if (r0 == 0) goto L7e
            r15 = r3
            com.facebook.aura.gateway.HatchCvmColdLeaseClient$coldLease$1 r15 = (com.facebook.aura.gateway.HatchCvmColdLeaseClient$coldLease$1) r15
            int r2 = r15.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r15.label = r2
        L13:
            java.lang.Object r3 = r15.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r15.label
            r1 = 1
            if (r0 == 0) goto L49
            if (r0 != r1) goto L8c
            java.lang.Object r3 = X.AnonymousClass001.A0q(r3)
        L22:
            java.lang.Throwable r1 = X.HsJ.A00(r3)
            if (r1 != 0) goto L42
            com.facebook.aura.gateway.ColdLeaseCvmResponseJson r3 = (com.facebook.aura.gateway.ColdLeaseCvmResponseJson) r3
            java.lang.String r2 = r3.vm_id
            int r0 = r2.length()
            if (r0 != 0) goto L84
            java.lang.String r0 = "cold_lease_cvm_missing_vm_id"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
        L39:
            r0 = 0
            X.C7384Etj.A0Y(r1, r0)
            X.Hud r1 = X.C3cG.A0s(r1)
            return r1
        L42:
            com.facebook.aura.gateway.HatchCvmColdLeaseClient r0 = com.facebook.aura.gateway.HatchCvmColdLeaseClient.INSTANCE
            java.lang.Throwable r1 = r0.toColdLeaseFailure(r1)
            goto L39
        L49:
            com.facebook.aura.network.http.HatchHttpApi r3 = X.C60O.A06(r3)
            com.facebook.aura.network.api.StefiHatchPath$ColdLeaseCvm r7 = com.facebook.aura.network.api.StefiHatchPath.ColdLeaseCvm.INSTANCE
            java.lang.String r0 = r14.toString()
            com.facebook.aura.gateway.ColdLeaseCvmRequestJson r8 = new com.facebook.aura.gateway.ColdLeaseCvmRequestJson
            r8.<init>(r0)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r10 = X.C9jH.A00
            com.facebook.aura.gateway.HatchCvmColdLeaseClient$coldLease-gIAlu-s$$inlined$executeStefiRequest-tZkwj4A$default$1 r4 = com.facebook.aura.gateway.HatchCvmColdLeaseClient$coldLeasegIAlus$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.gateway.HatchCvmColdLeaseClient$coldLease-gIAlu-s$$inlined$executeStefiRequest-tZkwj4A$default$2 r5 = com.facebook.aura.gateway.HatchCvmColdLeaseClient$coldLeasegIAlus$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r6 = 0
            r12 = 0
            r15.L$0 = r12
            r15.L$1 = r12
            r15.L$2 = r12
            r15.L$3 = r12
            r15.L$4 = r12
            r15.L$5 = r12
            r15.I$0 = r6
            r15.I$1 = r6
            r15.label = r1
            r11 = r6
            r13 = r6
            r14 = r12
            java.lang.Object r3 = r3.m1604executeStefiRequestWithjLovISM(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r3 != r2) goto L22
            return r2
        L7e:
            com.facebook.aura.gateway.HatchCvmColdLeaseClient$coldLease$1 r15 = new com.facebook.aura.gateway.HatchCvmColdLeaseClient$coldLease$1
            r15.<init>(r13, r3)
            goto L13
        L84:
            boolean r0 = r3.created
            com.facebook.aura.gateway.HatchCvmColdLease r1 = new com.facebook.aura.gateway.HatchCvmColdLease
            r1.<init>(r2, r0)
            return r1
        L8c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchCvmColdLeaseClient.m955coldLeasegIAlus(java.util.UUID, X.HtJ):java.lang.Object");
    }

    private final Throwable toColdLeaseFailure(Throwable th) {
        NetworkException networkException;
        HatchCvmColdLeaseException.Reason next;
        if (!(th instanceof NetworkException) || (networkException = (NetworkException) th) == null) {
            return th;
        }
        HatchProblemJson hatchProblemJsonHatchProblemOf = HatchProblemJsonKt.hatchProblemOf(networkException.getMessage());
        String str = hatchProblemJsonHatchProblemOf != null ? hatchProblemJsonHatchProblemOf.type : null;
        Iterator<HatchCvmColdLeaseException.Reason> it = HatchCvmColdLeaseException.Reason.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            HatchCvmColdLeaseException.Reason reason = next;
            if (C7384Etj.areEqual(reason.getType(), str) && reason.getHttpResponseCode() == networkException.httpResponseCode) {
                break;
            }
        }
        HatchCvmColdLeaseException.Reason reason2 = next;
        CFK.A0H(TAG, "Cold lease failed: http=%d type=%s", Integer.valueOf(networkException.httpResponseCode), reason2 != null ? reason2.getType() : null);
        return reason2 != null ? new HatchCvmColdLeaseException(reason2) : networkException;
    }
}
