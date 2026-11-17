package com.facebook.aura.appupdate;

import X.AnonymousClass002;
import X.C06H;
import X.C7384Etj;
import X.CLD;

/* loaded from: classes5.dex */
public final class AuraPlayUpdateStatus {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final long READ_TIMEOUT_MS = 10000;
    public static final String TAG = "AuraPlayUpdateStatus";
    public final int availableVersionCode;
    public final boolean flexibleUpdateAllowed;
    public final AuraPlayInstallState installState;
    public final Integer stalenessDays;
    public final boolean updateAvailable;

    public final class Companion {
        private final AuraPlayInstallState installState(int i) {
            if (i == 11) {
                return AuraPlayInstallState.DOWNLOADED;
            }
            switch (i) {
                case 0:
                    return AuraPlayInstallState.NONE;
                case 1:
                default:
                    return AuraPlayInstallState.PENDING;
                case 2:
                    return AuraPlayInstallState.DOWNLOADING;
                case 3:
                    return AuraPlayInstallState.INSTALLING;
                case 4:
                    return AuraPlayInstallState.INSTALLED;
                case 5:
                    return AuraPlayInstallState.FAILED;
                case 6:
                    return AuraPlayInstallState.CANCELED;
            }
        }

        private final AuraPlayUpdateStatus toStatus(CLD cld) {
            return new AuraPlayUpdateStatus(AnonymousClass002.A1Q(cld.A02, 2), cld.A01, cld.A0A, installState(cld.A03), AnonymousClass002.A1X(cld.A07));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object read(X.HtJ<? super com.facebook.aura.appupdate.AuraPlayUpdateStatus> r7) {
            /*
                r6 = this;
                boolean r0 = r7 instanceof com.facebook.aura.appupdate.AuraPlayUpdateStatus$Companion$read$1
                if (r0 == 0) goto L1f
                r5 = r7
                com.facebook.aura.appupdate.AuraPlayUpdateStatus$Companion$read$1 r5 = (com.facebook.aura.appupdate.AuraPlayUpdateStatus$Companion$read$1) r5
                int r2 = r5.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L1f
                int r2 = r2 - r1
                r5.label = r2
            L12:
                java.lang.Object r2 = r5.result
                X.Hji r4 = X.EnumC10460Hji.A02
                int r1 = r5.label
                r0 = 1
                r3 = 0
                if (r1 == 0) goto L2a
                if (r1 != r0) goto L25
                goto L3d
            L1f:
                com.facebook.aura.appupdate.AuraPlayUpdateStatus$Companion$read$1 r5 = new com.facebook.aura.appupdate.AuraPlayUpdateStatus$Companion$read$1
                r5.<init>(r6, r7)
                goto L12
            L25:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L2a:
                X.Hwg.A00(r2)
                com.facebook.aura.appupdate.AuraPlayUpdateStatus$Companion$read$info$1 r2 = new com.facebook.aura.appupdate.AuraPlayUpdateStatus$Companion$read$info$1     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L52
                r2.<init>(r3)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L52
                r5.label = r0     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L52
                r0 = 10000(0x2710, double:4.9407E-320)
                java.lang.Object r2 = X.GAX.A01(r5, r2, r0)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L52
                if (r2 != r4) goto L40
                return r4
            L3d:
                X.Hwg.A00(r2)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L52
            L40:
                X.CLD r2 = (X.CLD) r2     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L52
                if (r2 == 0) goto L48
                com.facebook.aura.appupdate.AuraPlayUpdateStatus r3 = r6.toStatus(r2)
            L48:
                return r3
            L49:
                r2 = move-exception
                java.lang.String r1 = "Failed to read Play update info"
                java.lang.String r0 = "AuraPlayUpdateStatus"
                X.CFK.A0A(r0, r1, r2)
                return r3
            L52:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.appupdate.AuraPlayUpdateStatus.Companion.read(X.HtJ):java.lang.Object");
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraPlayUpdateStatus(boolean z, int i, Integer num, AuraPlayInstallState auraPlayInstallState, boolean z2) {
        C7384Etj.A0Y(auraPlayInstallState, 3);
        this.updateAvailable = z;
        this.availableVersionCode = i;
        this.stalenessDays = num;
        this.installState = auraPlayInstallState;
        this.flexibleUpdateAllowed = z2;
    }

    public final int getAvailableVersionCode() {
        return this.availableVersionCode;
    }

    public final boolean getFlexibleUpdateAllowed() {
        return this.flexibleUpdateAllowed;
    }

    public final AuraPlayInstallState getInstallState() {
        return this.installState;
    }

    public final Integer getStalenessDays() {
        return this.stalenessDays;
    }

    public final boolean getUpdateAvailable() {
        return this.updateAvailable;
    }
}
