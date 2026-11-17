package com.facebook.aura.gateway.store;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BzK;
import X.C3cG;
import X.C4oT;
import X.C7384Etj;
import X.C9hr;
import X.C9sU;
import X.CFK;
import X.F0C;
import com.facebook.aura.common.HatchChipSelection;
import com.facebook.aura.common.HatchCvmChipPinPurpose;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.json.HatchJsonKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchCvmChipClaimStore {
    public static final String KEY_CLAIM = "claim";
    public static final String KEY_WRITE_GENERATION = "chip_claim_write_generation";
    public static final String TAG = "HatchCvmChipClaimStore";
    public static final HatchCvmChipClaimStore INSTANCE = new HatchCvmChipClaimStore();
    public static final Map<String, String> pendingWrites = C3cG.A0j();

    public final synchronized boolean canFinishEnrollment(String str) {
        boolean z;
        C7384Etj.A0Y(str, 0);
        HatchCvmChipClaim hatchCvmChipClaim = read(str);
        z = false;
        if (hatchCvmChipClaim != null && (hatchCvmChipClaim.getPinsEnrollment() || hatchCvmChipClaim.getAwaitsBidAnswer())) {
            if (INSTANCE.isValidProvisioningPin(hatchCvmChipClaim.chipIds)) {
                z = true;
            }
        }
        return z;
    }

    public final synchronized boolean clearProvisioning(String str) {
        boolean zWrite;
        C7384Etj.A0Y(str, 0);
        try {
            HatchCvmChipClaim hatchCvmChipClaim = read(str);
            zWrite = true;
            if (hatchCvmChipClaim != null) {
                if (hatchCvmChipClaim.getPurpose() == HatchCvmChipPinPurpose.PROVISIONING) {
                    zWrite = persist(str, null);
                } else if (hatchCvmChipClaim.enrollmentPinned) {
                    zWrite = write(str, hatchCvmChipClaim.copy(hatchCvmChipClaim.attemptId, hatchCvmChipClaim.nonce, hatchCvmChipClaim.chipIds, hatchCvmChipClaim.allowlistVersion, hatchCvmChipClaim.disposition, hatchCvmChipClaim.isReplacementChipPinned, hatchCvmChipClaim.bidsWithHostData, false));
                }
            }
        } catch (Exception e) {
            CFK.A0K(TAG, e, "clearProvisioning: failed to persist provisioning pin removal");
            zWrite = false;
        }
        return zWrite;
    }

    public final synchronized boolean pinAcceptedBidForEnrollment(String str) {
        boolean zWrite;
        C7384Etj.A0Y(str, 0);
        HatchCvmChipClaim hatchCvmChipClaim = read(str);
        if (hatchCvmChipClaim != null) {
            if (hatchCvmChipClaim.getPinsEnrollment()) {
                zWrite = isValidProvisioningPin(hatchCvmChipClaim.chipIds);
            } else if (hatchCvmChipClaim.disposition == HatchCvmChipClaimDisposition.ACCEPTED && isValidProvisioningPin(hatchCvmChipClaim.chipIds)) {
                zWrite = write(str, hatchCvmChipClaim.copy(hatchCvmChipClaim.attemptId, hatchCvmChipClaim.nonce, hatchCvmChipClaim.chipIds, hatchCvmChipClaim.allowlistVersion, hatchCvmChipClaim.disposition, hatchCvmChipClaim.isReplacementChipPinned, hatchCvmChipClaim.bidsWithHostData, true));
            }
            return zWrite;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7 A[Catch: all -> 0x010b, TRY_ENTER, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0014, B:9:0x0028, B:11:0x003a, B:13:0x003f, B:10:0x002b, B:15:0x0049, B:17:0x005d, B:19:0x0065, B:20:0x006c, B:22:0x0072, B:24:0x007a, B:26:0x0082, B:31:0x00a7, B:33:0x00ad, B:34:0x00b4, B:38:0x00c4, B:41:0x00d8, B:43:0x00dc, B:46:0x00e9, B:48:0x00f3, B:45:0x00e0, B:28:0x0098), top: B:61:0x0001, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.facebook.aura.gateway.store.HatchCvmChipClaim read(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.store.HatchCvmChipClaimStore.read(java.lang.String):com.facebook.aura.gateway.store.HatchCvmChipClaim");
    }

    public final synchronized boolean settle(String str, String str2, HatchCvmChipClaim hatchCvmChipClaim) {
        boolean zA1Z;
        zA1Z = AnonymousClass005.A1Z(str, str2, hatchCvmChipClaim);
        if (hatchCvmChipClaim.disposition != HatchCvmChipClaimDisposition.ACCEPTED) {
            HatchCvmChipClaim hatchCvmChipClaim2 = read(str);
            if (str2.equals(hatchCvmChipClaim2 != null ? hatchCvmChipClaim2.nonce : null)) {
            }
        }
        zA1Z = write(str, hatchCvmChipClaim);
        return zA1Z;
    }

    public final synchronized boolean write(String str, HatchCvmChipClaim hatchCvmChipClaim) {
        boolean zPersist;
        AnonymousClass003.A0u(str, hatchCvmChipClaim);
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            F0C<C9hr<Object>>[] f0cArr = HatchCvmChipClaim.$childSerializers;
            zPersist = persist(str, c9sU.A02(hatchCvmChipClaim, HatchCvmChipClaim$$serializer.INSTANCE));
            if (zPersist) {
                BzK bzKA9q = AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.CVM_PROVISIONING_CHIPS).A9q();
                bzKA9q.Aae("chips");
                bzKA9q.apply();
            }
        } catch (Exception e) {
            CFK.A0K(TAG, e, "write: failed to persist chip claim");
            zPersist = false;
        }
        return zPersist;
    }

    public final synchronized boolean writeProvisioning(String str, List<String> list) {
        boolean zA1b;
        zA1b = AnonymousClass004.A1b(str, list);
        if (isValidProvisioningPin(list)) {
            HatchCvmChipClaim hatchCvmChipClaim = read(str);
            if ((hatchCvmChipClaim != null ? hatchCvmChipClaim.getPurpose() : null) != HatchCvmChipPinPurpose.HARD_REPLACEMENT) {
                zA1b = write(str, provisioningClaim(list));
            }
        }
        return zA1b;
    }

    private final C4oT legacyProvisioningPrefs(String str) {
        return AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.CVM_PROVISIONING_CHIPS);
    }

    private final boolean persist(String str, String str2) {
        AuraVMPrefs auraVMPrefs = AuraVMPrefs.INSTANCE;
        C4oT c4oT = auraVMPrefs.get(str, AuraVMPrefStore.CVM_CHIP_CLAIM);
        Map<String, String> map = pendingWrites;
        boolean zA0B = true;
        if (map.containsKey(str) || !C7384Etj.areEqual(c4oT.getString(KEY_CLAIM, null), str2)) {
            map.put(str, str2);
            if (str2 == null) {
                BzK bzKA9q = auraVMPrefs.get(str, AuraVMPrefStore.CVM_PROVISIONING_CHIPS).A9q();
                bzKA9q.Aae("chips");
                bzKA9q.A0A(KEY_WRITE_GENERATION, !r2.getBoolean(KEY_WRITE_GENERATION, false));
                if (!bzKA9q.A0B(0)) {
                    return false;
                }
            }
            BzK bzKA9q2 = c4oT.A9q();
            bzKA9q2.AYr(KEY_CLAIM, str2);
            bzKA9q2.A0A(KEY_WRITE_GENERATION, !c4oT.getBoolean(KEY_WRITE_GENERATION, false));
            zA0B = bzKA9q2.A0B(0);
            if (zA0B) {
                map.remove(str);
                return zA0B;
            }
        }
        return zA0B;
    }

    private final C4oT prefs(String str) {
        return AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.CVM_CHIP_CLAIM);
    }

    private final HatchCvmChipClaim provisioningClaim(List<String> list) {
        F0C<C9hr<Object>>[] f0cArr = HatchCvmChipClaim.$childSerializers;
        return new HatchCvmChipClaim("", "", AbstractC0878AGe.A0X(list), "", HatchCvmChipClaimDisposition.PENDING, false, false, false);
    }

    private final boolean isValidProvisioningPin(List<String> list) {
        if (list.isEmpty()) {
            return false;
        }
        HatchChipSelection hatchChipSelection = HatchChipSelection.INSTANCE;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (!hatchChipSelection.isCanonical(AnonymousClass005.A0j(it))) {
                return false;
            }
        }
        return true;
    }
}
