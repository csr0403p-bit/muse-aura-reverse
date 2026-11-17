package com.facebook.aura.analytics.hatch;

import X.AnonymousClass001;
import X.BLG;
import X.BzK;
import X.C06G;
import X.C0KA;
import X.C1BN;
import X.C3cG;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.C9286GCn;
import X.HwN;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;

/* loaded from: classes3.dex */
public final class HatchDeferredInviteCodeStore {
    public static final int $stable = 0;
    public static final long CODE_LIFETIME_MS = 604800000;
    public static final HatchDeferredInviteCodeStore INSTANCE = new HatchDeferredInviteCodeStore();
    public static final String INVITE_CODE_PARAM = "invite_code";
    public static final String KEY_AWAITING_SILENT_REDEMPTION = "hatch_deferred_invite_code_awaiting_silent_redemption";
    public static final String KEY_CAPTURED_AT_MS = "hatch_deferred_invite_code_captured_at_ms";
    public static final String KEY_CODE = "hatch_deferred_invite_code";
    public static final String KEY_SILENT_REDEMPTION_COMPLETED = "hatch_deferred_invite_code_silent_redemption_completed";
    public static final int MAX_CODE_BYTES = 64;
    public static final BLG<PendingInviteCode> _pendingInviteCode;
    public static final C1BN<PendingInviteCode> pendingInviteCode;

    public final class PendingInviteCode extends C06G {
        public static final int $stable = 0;
        public final boolean awaitingSilentRedemption;
        public final boolean backedByPrefs;
        public final String code;

        public PendingInviteCode(String str, boolean z, boolean z2) {
            C7384Etj.A0Y(str, 0);
            this.code = str;
            this.awaitingSilentRedemption = z;
            this.backedByPrefs = z2;
        }

        public final PendingInviteCode copy(String str, boolean z, boolean z2) {
            C7384Etj.A0Y(str, 0);
            return new PendingInviteCode(str, z, z2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PendingInviteCode) {
                    PendingInviteCode pendingInviteCode = (PendingInviteCode) obj;
                    if (!C7384Etj.areEqual(this.code, pendingInviteCode.code) || this.awaitingSilentRedemption != pendingInviteCode.awaitingSilentRedemption || this.backedByPrefs != pendingInviteCode.backedByPrefs) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PendingInviteCode copy$default(PendingInviteCode pendingInviteCode, String str, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pendingInviteCode.code;
            }
            if ((i & 2) != 0) {
                z = pendingInviteCode.awaitingSilentRedemption;
            }
            if ((i & 4) != 0) {
                z2 = pendingInviteCode.backedByPrefs;
            }
            return pendingInviteCode.copy(str, z, z2);
        }

        public final String component1() {
            return this.code;
        }

        public final boolean component2() {
            return this.awaitingSilentRedemption;
        }

        public final boolean component3$fbandroid_express_aura_java_com_facebook_aura_analytics_hatch_hatch() {
            return this.backedByPrefs;
        }

        public final boolean getAwaitingSilentRedemption() {
            return this.awaitingSilentRedemption;
        }

        public final boolean getBackedByPrefs$fbandroid_express_aura_java_com_facebook_aura_analytics_hatch_hatch() {
            return this.backedByPrefs;
        }

        public final String getCode() {
            return this.code;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(AnonymousClass001.A0G(this.code), this.awaitingSilentRedemption), this.backedByPrefs);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final synchronized void captureFromReferrer(String str, long j) {
        persist(HatchInstallReferrerParams.INSTANCE.decodedValue(str, "invite_code"), j);
    }

    public final synchronized void completeSilentRedemption(PendingInviteCode pendingInviteCode2) {
        C7384Etj.A0Y(pendingInviteCode2, 0);
        if (C7384Etj.areEqual(_pendingInviteCode.getValue(), pendingInviteCode2) && pendingInviteCode2.backedByPrefs) {
            BzK bzKA0F = C60O.A0F(AuraDevicePrefStore.INSTALL_REFERRER, AuraDevicePrefs.INSTANCE);
            bzKA0F.A0A(KEY_SILENT_REDEMPTION_COMPLETED, true);
            bzKA0F.commit();
            consume();
        }
    }

    public final synchronized void consume(PendingInviteCode pendingInviteCode2) {
        C7384Etj.A0Y(pendingInviteCode2, 0);
        if (C7384Etj.areEqual(_pendingInviteCode.getValue(), pendingInviteCode2)) {
            consume();
        }
    }

    public final synchronized PendingInviteCode pendingReferrerCodeForSilentRedemption(long j) {
        PendingInviteCode value = _pendingInviteCode.getValue();
        if (value != null && value.backedByPrefs && value.awaitingSilentRedemption) {
            if (isWithinLifetime(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.INSTALL_REFERRER).getLong(KEY_CAPTURED_AT_MS, 0L), j)) {
                return value;
            }
            consume();
        }
        return null;
    }

    public final synchronized void releaseToManualEntry(PendingInviteCode pendingInviteCode2) {
        C7384Etj.A0Y(pendingInviteCode2, 0);
        BLG<PendingInviteCode> blg = _pendingInviteCode;
        PendingInviteCode value = blg.getValue();
        if (value != null && value.equals(pendingInviteCode2) && value.backedByPrefs && value.awaitingSilentRedemption) {
            BzK bzKA0F = C60O.A0F(AuraDevicePrefStore.INSTALL_REFERRER, AuraDevicePrefs.INSTANCE);
            bzKA0F.A0A(KEY_AWAITING_SILENT_REDEMPTION, false);
            bzKA0F.commit();
            blg.Af8(value.copy(value.code, false, value.backedByPrefs));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x001a, B:9:0x0022, B:10:0x0026, B:12:0x002f, B:14:0x0035, B:16:0x0043), top: B:22:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void restorePending(long r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            X.BLG<com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore$PendingInviteCode> r5 = com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore._pendingInviteCode     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r5.getValue()     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L52
            com.facebook.aura.common.prefs.AuraDevicePrefs r1 = com.facebook.aura.common.prefs.AuraDevicePrefs.INSTANCE     // Catch: java.lang.Throwable -> L54
            com.facebook.aura.common.prefs.AuraDevicePrefStore r0 = com.facebook.aura.common.prefs.AuraDevicePrefStore.INSTALL_REFERRER     // Catch: java.lang.Throwable -> L54
            X.4oT r7 = r1.get(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "hatch_deferred_invite_code_silent_redemption_completed"
            r6 = 0
            boolean r0 = r7.getBoolean(r0, r6)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L26
            java.lang.String r0 = "hatch_deferred_invite_code"
            boolean r0 = r7.contains(r0)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L52
        L22:
            r8.clearStored()     // Catch: java.lang.Throwable -> L54
            goto L52
        L26:
            java.lang.String r0 = "hatch_deferred_invite_code"
            r4 = 0
            java.lang.String r3 = r7.getString(r0, r4)     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L52
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L54
            if (r0 <= 0) goto L52
            java.lang.String r2 = "hatch_deferred_invite_code_captured_at_ms"
            r0 = 0
            long r0 = r7.getLong(r2, r0)     // Catch: java.lang.Throwable -> L54
            boolean r0 = r8.isWithinLifetime(r0, r9)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L22
            java.lang.String r0 = "hatch_deferred_invite_code_awaiting_silent_redemption"
            boolean r2 = r7.getBoolean(r0, r6)     // Catch: java.lang.Throwable -> L54
            r1 = 1
            com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore$PendingInviteCode r0 = new com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore$PendingInviteCode     // Catch: java.lang.Throwable -> L54
            r0.<init>(r3, r2, r1)     // Catch: java.lang.Throwable -> L54
            X.AnonymousClass001.A1E(r5, r4, r0)     // Catch: java.lang.Throwable -> L54
        L52:
            monitor-exit(r8)
            return
        L54:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore.restorePending(long):void");
    }

    static {
        C9286GCn c9286GCnA13 = C3cG.A13();
        _pendingInviteCode = c9286GCnA13;
        pendingInviteCode = C3cG.A11(c9286GCnA13);
    }

    public static /* synthetic */ void captureFromAppManagerCustomData$default(HatchDeferredInviteCodeStore hatchDeferredInviteCodeStore, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        hatchDeferredInviteCodeStore.captureFromReferrer(str, j);
    }

    public static /* synthetic */ void captureFromReferrer$default(HatchDeferredInviteCodeStore hatchDeferredInviteCodeStore, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        hatchDeferredInviteCodeStore.captureFromReferrer(str, j);
    }

    private final void clearStored() {
        BzK bzKA0F = C60O.A0F(AuraDevicePrefStore.INSTALL_REFERRER, AuraDevicePrefs.INSTANCE);
        bzKA0F.Aae(KEY_CODE);
        bzKA0F.Aae(KEY_CAPTURED_AT_MS);
        bzKA0F.Aae(KEY_AWAITING_SILENT_REDEMPTION);
        bzKA0F.apply();
    }

    private final C4oT getPrefs() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.INSTALL_REFERRER);
    }

    private final boolean isWithinLifetime(long j, long j2) {
        return j > 0 && j2 >= j && j2 - j <= 604800000;
    }

    public static /* synthetic */ PendingInviteCode pendingReferrerCodeForSilentRedemption$default(HatchDeferredInviteCodeStore hatchDeferredInviteCodeStore, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return hatchDeferredInviteCodeStore.pendingReferrerCodeForSilentRedemption(j);
    }

    private final void persist(String str, long j) {
        if (str == null || str.length() == 0 || C3cG.A1S(str).length > 64) {
            return;
        }
        AuraDevicePrefs auraDevicePrefs = AuraDevicePrefs.INSTANCE;
        AuraDevicePrefStore auraDevicePrefStore = AuraDevicePrefStore.INSTALL_REFERRER;
        if (auraDevicePrefs.get(auraDevicePrefStore).getBoolean(KEY_SILENT_REDEMPTION_COMPLETED, false)) {
            return;
        }
        BLG<PendingInviteCode> blg = _pendingInviteCode;
        PendingInviteCode value = blg.getValue();
        if (value == null || !value.backedByPrefs) {
            BzK bzKA0F = C60O.A0F(auraDevicePrefStore, auraDevicePrefs);
            bzKA0F.AYr(KEY_CODE, str);
            bzKA0F.AYp(KEY_CAPTURED_AT_MS, j);
            bzKA0F.A0A(KEY_AWAITING_SILENT_REDEMPTION, true);
            bzKA0F.commit();
            C9286GCn.A00(HwN.A01, new PendingInviteCode(str, true, true), (C9286GCn) blg);
        }
    }

    public static /* synthetic */ void restorePending$default(HatchDeferredInviteCodeStore hatchDeferredInviteCodeStore, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        hatchDeferredInviteCodeStore.restorePending(j);
    }

    public final C1BN<PendingInviteCode> getPendingInviteCode() {
        return pendingInviteCode;
    }

    public final String withoutInviteCode(String str) {
        return HatchInstallReferrerParams.INSTANCE.without(str, "invite_code");
    }

    public final void captureFromAppManagerCustomData(String str, long j) {
        captureFromReferrer(str, j);
    }

    public final synchronized String consume() {
        String str;
        BLG<PendingInviteCode> blg = _pendingInviteCode;
        PendingInviteCode value = blg.getValue();
        str = null;
        if (value != null) {
            blg.Af8(null);
            if (value.backedByPrefs) {
                clearStored();
            }
            str = value.code;
        }
        return str;
    }
}
