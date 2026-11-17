package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.C3cG;
import X.CFK;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchCvmReplacement;
import com.facebook.aura.gateway.store.HatchCvmChipClaim;
import com.facebook.aura.gateway.store.HatchCvmChipClaimDisposition;
import com.facebook.aura.gateway.store.HatchCvmChipClaimStore;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchCvmChipPin {
    public static final int $stable = 0;
    public static final HatchCvmChipPin INSTANCE = new HatchCvmChipPin();
    public static final String TAG = "HatchCvmChipPin";

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchCvmChipPin$hasUsableClaim$2", f = "HatchCvmChipPin.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchCvmChipPin$hasUsableClaim$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ HatchCvmReplacement.Active $replacement;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchCvmReplacement.Active active, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$replacement = active;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$replacement, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return new AnonymousClass2(this.$replacement, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchCvmChipPin hatchCvmChipPin = HatchCvmChipPin.INSTANCE;
            HatchCvmReplacement.Active active = this.$replacement;
            return C3cG.A0P(hatchCvmChipPin.expectedChipIdsForLockedReplacement$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(active, HatchCvmChipClaimStore.INSTANCE.read(active.vmId)).isEmpty());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009c A[PHI: r3
  0x009c: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:32:0x008b, B:30:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> expectedChipIdsForLockedReplacement$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(com.facebook.aura.gateway.HatchCvmReplacement.Active r10, com.facebook.aura.gateway.store.HatchCvmChipClaim r11) {
        /*
            r9 = this;
            r0 = 0
            X.C7384Etj.A0Y(r10, r0)
            r0 = 61
            java.lang.String r5 = X.BV3.A00(r0)
            java.lang.String r2 = "HatchCvmChipPin"
            if (r11 == 0) goto L81
            com.facebook.aura.common.HatchCvmChipPinPurpose r1 = r11.getPurpose()
            com.facebook.aura.common.HatchCvmChipPinPurpose r0 = com.facebook.aura.common.HatchCvmChipPinPurpose.HARD_REPLACEMENT
            if (r1 != r0) goto L81
            java.lang.String r1 = r11.attemptId
            java.lang.String r0 = r10.attemptId
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L81
            java.lang.String r1 = r10.ownerNonce
            if (r1 == 0) goto L61
            java.lang.String r0 = r11.nonce
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L61
            com.facebook.aura.gateway.store.HatchCvmChipClaimDisposition r3 = r11.disposition
            com.facebook.aura.gateway.store.HatchCvmChipClaimDisposition r0 = com.facebook.aura.gateway.store.HatchCvmChipClaimDisposition.PENDING
            if (r3 == r0) goto L4a
            com.facebook.aura.gateway.store.HatchCvmChipClaimDisposition r0 = com.facebook.aura.gateway.store.HatchCvmChipClaimDisposition.ACCEPTED
            if (r3 == r0) goto L4a
            java.lang.String r1 = r11.attemptId
            java.lang.String r0 = r10.vmId
            java.lang.String r0 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.vmIdForLog(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1, r3, r0}
            java.lang.String r0 = "%s: Chip claim rejected: attempt=%s reason=claim_retired disposition=%s vm=%s"
        L44:
            X.CFK.A0H(r2, r0, r1)
            X.AGi r0 = X.C0881AGi.A00
            return r0
        L4a:
            java.util.List<java.lang.String> r0 = r11.chipIds
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Laa
            java.lang.String r1 = r11.attemptId
            java.lang.String r0 = r10.vmId
            java.lang.String r0 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.vmIdForLog(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1, r0}
            java.lang.String r0 = "%s: Chip claim rejected: attempt=%s reason=chip_ids_empty vm=%s"
            goto L44
        L61:
            java.lang.String r6 = r11.attemptId
            java.lang.String r0 = r10.ownerNonce
            if (r0 != 0) goto L7e
            java.lang.String r7 = "owner_nonce_missing"
        L69:
            com.facebook.aura.gateway.store.HatchCvmChipClaimDisposition r8 = r11.disposition
            java.util.List<java.lang.String> r0 = r11.chipIds
            java.lang.Integer r9 = X.C60Q.A0W(r0)
            java.lang.String r0 = r10.vmId
            java.lang.String r10 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.vmIdForLog(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r6, r7, r8, r9, r10}
            java.lang.String r0 = "%s: Chip claim rejected: attempt=%s reason=%s disposition=%s chipCount=%d vm=%s"
            goto L44
        L7e:
            java.lang.String r7 = "owner_nonce_mismatch"
            goto L69
        L81:
            java.lang.String r4 = r10.attemptId
            if (r11 == 0) goto L89
            java.lang.String r3 = r11.attemptId
            if (r3 != 0) goto L9c
        L89:
            java.lang.String r3 = "<none>"
            if (r11 != 0) goto L9c
            java.lang.String r1 = "claim_missing"
        L8f:
            java.lang.String r0 = r10.vmId
            java.lang.String r0 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.vmIdForLog(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r4, r3, r1, r0}
            java.lang.String r0 = "%s: Chip claim rejected: attempt=%s storedAttempt=%s reason=%s vm=%s"
            goto L44
        L9c:
            com.facebook.aura.common.HatchCvmChipPinPurpose r1 = r11.getPurpose()
            com.facebook.aura.common.HatchCvmChipPinPurpose r0 = com.facebook.aura.common.HatchCvmChipPinPurpose.HARD_REPLACEMENT
            if (r1 == r0) goto La7
            java.lang.String r1 = "claim_purpose_mismatch"
            goto L8f
        La7:
            java.lang.String r1 = "attempt_id_mismatch"
            goto L8f
        Laa:
            java.util.List<java.lang.String> r0 = r11.chipIds
            java.util.List r0 = X.AbstractC0878AGe.A0X(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchCvmChipPin.expectedChipIdsForLockedReplacement$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(com.facebook.aura.gateway.HatchCvmReplacement$Active, com.facebook.aura.gateway.store.HatchCvmChipClaim):java.util.List");
    }

    public final void recordOwnedClaim$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(String str, HatchCvmChipClaim hatchCvmChipClaim) {
        AnonymousClass003.A0u(str, hatchCvmChipClaim);
        if (hatchCvmChipClaim.disposition == HatchCvmChipClaimDisposition.PENDING) {
            if (HatchCvmChipClaimStore.INSTANCE.write(str, hatchCvmChipClaim.copy(hatchCvmChipClaim.attemptId, hatchCvmChipClaim.nonce, hatchCvmChipClaim.chipIds, hatchCvmChipClaim.allowlistVersion, HatchCvmChipClaimDisposition.ACCEPTED, hatchCvmChipClaim.isReplacementChipPinned, hatchCvmChipClaim.bidsWithHostData, hatchCvmChipClaim.enrollmentPinned))) {
                return;
            }
            CFK.A0H(TAG, "Could not record owned claim as accepted: attempt=%s", hatchCvmChipClaim.attemptId);
        }
    }

    public final Object hasUsableClaim(HatchCvmReplacement.Active active, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(active, null));
    }
}
