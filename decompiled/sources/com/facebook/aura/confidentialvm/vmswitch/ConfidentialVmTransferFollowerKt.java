package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.C7384Etj;
import X.CFK;
import X.HrB;
import X.HsJ;
import X.HtJ;
import X.HzP;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.gateway.store.VmEntryV2Json;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.json.HatchProblemJsonKt;
import com.facebook.aura.json.NetworkException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public abstract class ConfidentialVmTransferFollowerKt {
    public static final String TAG = "ConfidentialVmTransferFollower";

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt", f = "ConfidentialVmTransferFollower.kt", l = {291}, m = "readCvmMigrationStatus", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt$readCvmMigrationStatus$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnonymousClass006.A0m(ConfidentialVmTransferFollowerKt.readCvmMigrationStatus(null, this));
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    public static final boolean hasEnvId(VmEntryV2Json vmEntryV2Json, String str) {
        boolean zA1a = AnonymousClass002.A1a(vmEntryV2Json, str);
        if (str.equals(vmEntryV2Json.vm_id) || str.equals(HatcheryVMIdUtilsKt.extractHatcheryVMId(vmEntryV2Json.vm_ws_url))) {
            return zA1a;
        }
        return false;
    }

    public static final ConfidentialVmDataTransferOperation.FailureReason failureFor(Integer num) {
        return (num == null || num.intValue() != 503) ? ConfidentialVmDataTransferOperation.FailureReason.REQUEST_FAILED : ConfidentialVmDataTransferOperation.FailureReason.SERVER_UNAVAILABLE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readCvmMigrationStatus(java.lang.String r13, X.HtJ<? super X.HsJ<com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson>> r14) {
        /*
            boolean r0 = r14 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.AnonymousClass1
            if (r0 == 0) goto L4d
            r12 = r14
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt$readCvmMigrationStatus$1 r12 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.AnonymousClass1) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r12.label = r2
        L12:
            java.lang.Object r3 = r12.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r12.label
            r0 = 1
            if (r1 == 0) goto L22
            if (r1 != r0) goto L53
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L21:
            return r0
        L22:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r3 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.confidentialvm.repository.ConfidentialVmStefiPath$CvmMigrationStatus r6 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmStefiPath$CvmMigrationStatus
            r6.<init>(r13)
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r10 = X.AGH.A0E()
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt$readCvmMigrationStatus$$inlined$executeStefiRequest-bMdYcbs$default$1 r4 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt$readCvmMigrationStatus$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r5 = 0
            r8 = 0
            r12.L$0 = r8
            r12.L$1 = r8
            r12.L$2 = r8
            r12.L$3 = r8
            r12.L$4 = r8
            r12.L$5 = r8
            r12.label = r0
            r9 = r8
            r11 = r10
            java.lang.Object r0 = r3.m1596executeBodylessStefiRequestWithtZkwj4A(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r2) goto L21
            return r2
        L4d:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt$readCvmMigrationStatus$1 r12 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt$readCvmMigrationStatus$1
            r12.<init>(r14)
            goto L12
        L53:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollowerKt.readCvmMigrationStatus(java.lang.String, X.HtJ):java.lang.Object");
    }

    public static final ConfidentialVmDataTransferOperation.Progress after(ConfidentialVmDataTransferOperation.Progress progress, CvmMigrationStatusJson cvmMigrationStatusJson) {
        ConfidentialVmDataTransferOperation.ProgressStep progressStep;
        boolean zA1b = AnonymousClass004.A1b(progress, cvmMigrationStatusJson);
        if (!cvmMigrationStatusJson.isSucceeded() || cvmMigrationStatusJson.isTransferFailed()) {
            ConfidentialVmDataTransferOperation.ProgressStep progressStep2 = cvmMigrationStatusJson.getProgressStep();
            if (progressStep2 == null || (progressStep = (ConfidentialVmDataTransferOperation.ProgressStep) HrB.A01(progress.step, progressStep2)) == null) {
                progressStep = progress.step;
            }
        } else {
            progressStep = ConfidentialVmDataTransferOperation.ProgressStep.SWITCHING;
        }
        boolean z = true;
        if (!progress.isTransferStarted && !cvmMigrationStatusJson.isStarted()) {
            z = false;
        }
        boolean z2 = cvmMigrationStatusJson.isWaitingOnLockedDestination() || (progress.isWaitingOnLockedDestination && cvmMigrationStatusJson.isAwaitingDestinationVaultUnread());
        int i = progress.run;
        C7384Etj.A0Y(progressStep, zA1b ? 1 : 0);
        return new ConfidentialVmDataTransferOperation.Progress(progressStep, z, z2, i);
    }

    public static final boolean describes(CvmMigrationStatusJson cvmMigrationStatusJson, ConfidentialVmTransferCheckpoint<?> confidentialVmTransferCheckpoint) {
        AnonymousClass003.A0u(cvmMigrationStatusJson, confidentialVmTransferCheckpoint);
        String destinationEnvId = confidentialVmTransferCheckpoint.getDestinationEnvId();
        if (cvmMigrationStatusJson.isSucceeded()) {
            if (destinationEnvId != null) {
            }
            CFK.A03(cvmMigrationStatusJson.stage, TAG, "Ignoring a status for another transfer: stage=%s");
            return false;
        }
        if (destinationEnvId == null) {
            return true;
        }
        if (cvmMigrationStatusJson.new_env_id == null && cvmMigrationStatusJson.new_cvm_env_id == null) {
            return true;
        }
        String str = cvmMigrationStatusJson.new_env_id;
        if (str == null) {
            str = cvmMigrationStatusJson.new_cvm_env_id;
        }
        if (destinationEnvId.equals(str)) {
            return true;
        }
        CFK.A03(cvmMigrationStatusJson.stage, TAG, "Ignoring a status for another transfer: stage=%s");
        return false;
    }

    public static final String errorCode(Object obj) {
        NetworkException networkException;
        Throwable thA00 = HsJ.A00(obj);
        if (!(thA00 instanceof NetworkException) || (networkException = (NetworkException) thA00) == null) {
            return null;
        }
        return networkException.errorCode;
    }

    public static final Integer httpCode(Object obj) {
        NetworkException networkException;
        Throwable thA00 = HsJ.A00(obj);
        if (!(thA00 instanceof NetworkException) || (networkException = (NetworkException) thA00) == null) {
            return null;
        }
        return Integer.valueOf(networkException.httpResponseCode);
    }

    public static final HatchProblemJson problem(Object obj) {
        Throwable thA00 = HsJ.A00(obj);
        String message = null;
        if ((thA00 instanceof NetworkException) && thA00 != null) {
            message = thA00.getMessage();
        }
        return HatchProblemJsonKt.hatchProblemOf(message);
    }
}
