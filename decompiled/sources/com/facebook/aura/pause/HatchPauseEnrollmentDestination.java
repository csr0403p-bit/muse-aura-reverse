package com.facebook.aura.pause;

/* loaded from: classes2.dex */
public interface HatchPauseEnrollmentDestination {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.pause.HatchPauseEnrollmentDestination fromKey(java.lang.String r1) {
            /*
                r0 = this;
                r0 = 0
                X.C7384Etj.A0Y(r1, r0)
                int r0 = r1.hashCode()
                switch(r0) {
                    case -1425791980: goto L26;
                    case 910046775: goto L1b;
                    case 1490658749: goto L10;
                    default: goto Lb;
                }
            Lb:
                com.facebook.aura.pause.HatchPauseEnrollmentDestination$Overview r0 = com.facebook.aura.pause.HatchPauseEnrollmentDestination.Overview.INSTANCE
            Ld:
                com.facebook.aura.pause.HatchPauseEnrollmentDestination r0 = (com.facebook.aura.pause.HatchPauseEnrollmentDestination) r0
                return r0
            L10:
                java.lang.String r0 = "setup_biometrics"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto Lb
                com.facebook.aura.pause.HatchPauseEnrollmentDestination$SetupRecoveryKeyBiometrics r0 = com.facebook.aura.pause.HatchPauseEnrollmentDestination.SetupRecoveryKeyBiometrics.INSTANCE
                goto Ld
            L1b:
                java.lang.String r0 = "save_recovery_key"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto Lb
                com.facebook.aura.pause.HatchPauseEnrollmentDestination$SaveRecoveryKey r0 = com.facebook.aura.pause.HatchPauseEnrollmentDestination.SaveRecoveryKey.INSTANCE
                goto Ld
            L26:
                java.lang.String r0 = "enrollment_complete"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto Lb
                com.facebook.aura.pause.HatchPauseEnrollmentDestination$EnrollmentComplete r0 = com.facebook.aura.pause.HatchPauseEnrollmentDestination.EnrollmentComplete.INSTANCE
                goto Ld
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchPauseEnrollmentDestination.Companion.fromKey(java.lang.String):com.facebook.aura.pause.HatchPauseEnrollmentDestination");
        }
    }

    public final class EnrollmentComplete implements HatchPauseEnrollmentDestination {
        public static final int $stable = 0;
        public static final EnrollmentComplete INSTANCE = new EnrollmentComplete();
        public static final String key = "enrollment_complete";

        @Override // com.facebook.aura.pause.HatchPauseEnrollmentDestination
        public String getKey() {
            return key;
        }
    }

    public final class Overview implements HatchPauseEnrollmentDestination {
        public static final int $stable = 0;
        public static final Overview INSTANCE = new Overview();
        public static final String key = "overview";

        @Override // com.facebook.aura.pause.HatchPauseEnrollmentDestination
        public String getKey() {
            return key;
        }
    }

    public final class SaveRecoveryKey implements HatchPauseEnrollmentDestination {
        public static final int $stable = 0;
        public static final SaveRecoveryKey INSTANCE = new SaveRecoveryKey();
        public static final String key = "save_recovery_key";

        @Override // com.facebook.aura.pause.HatchPauseEnrollmentDestination
        public String getKey() {
            return key;
        }
    }

    public final class SetupRecoveryKeyBiometrics implements HatchPauseEnrollmentDestination {
        public static final int $stable = 0;
        public static final SetupRecoveryKeyBiometrics INSTANCE = new SetupRecoveryKeyBiometrics();
        public static final String key = "setup_biometrics";

        @Override // com.facebook.aura.pause.HatchPauseEnrollmentDestination
        public String getKey() {
            return key;
        }
    }

    String getKey();
}
