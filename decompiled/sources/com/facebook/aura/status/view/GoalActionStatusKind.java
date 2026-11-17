package com.facebook.aura.status.view;

import X.C06H;
import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GoalActionStatusKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GoalActionStatusKind[] $VALUES;
    public static final Companion Companion;
    public static final GoalActionStatusKind FAILED;
    public static final GoalActionStatusKind FINISHED;
    public static final GoalActionStatusKind IN_PROGRESS;

    public final class Companion {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        
            if (r1.equals(r0) != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        
            if (r1.equals("FINISHED") != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        
            return com.facebook.aura.status.view.GoalActionStatusKind.FINISHED;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.status.view.GoalActionStatusKind from(java.lang.String r1) {
            /*
                r0 = this;
                if (r1 == 0) goto L18
                java.lang.String r1 = X.AnonymousClass002.A0l(r1)
                if (r1 == 0) goto L18
                java.util.Locale r0 = java.util.Locale.US
                X.C7384Etj.A0V(r0)
                java.lang.String r1 = r1.toUpperCase(r0)
                int r0 = r1.hashCode()
                switch(r0) {
                    case -1149187101: goto L1b;
                    case 66247144: goto L1e;
                    case 108966002: goto L2a;
                    case 1383663147: goto L21;
                    case 2066319421: goto L35;
                    default: goto L18;
                }
            L18:
                com.facebook.aura.status.view.GoalActionStatusKind r0 = com.facebook.aura.status.view.GoalActionStatusKind.IN_PROGRESS
                return r0
            L1b:
                java.lang.String r0 = "SUCCESS"
                goto L23
            L1e:
                java.lang.String r0 = "ERROR"
                goto L37
            L21:
                java.lang.String r0 = "COMPLETED"
            L23:
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L32
                goto L18
            L2a:
                java.lang.String r0 = "FINISHED"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L18
            L32:
                com.facebook.aura.status.view.GoalActionStatusKind r0 = com.facebook.aura.status.view.GoalActionStatusKind.FINISHED
                return r0
            L35:
                java.lang.String r0 = "FAILED"
            L37:
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L18
                com.facebook.aura.status.view.GoalActionStatusKind r0 = com.facebook.aura.status.view.GoalActionStatusKind.FAILED
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.GoalActionStatusKind.Companion.from(java.lang.String):com.facebook.aura.status.view.GoalActionStatusKind");
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        GoalActionStatusKind goalActionStatusKind = new GoalActionStatusKind("FINISHED", 0);
        FINISHED = goalActionStatusKind;
        GoalActionStatusKind goalActionStatusKind2 = new GoalActionStatusKind(CvmMigrationStatusJson.STAGE_FAILED, 1);
        FAILED = goalActionStatusKind2;
        GoalActionStatusKind goalActionStatusKind3 = new GoalActionStatusKind("IN_PROGRESS", 2);
        IN_PROGRESS = goalActionStatusKind3;
        GoalActionStatusKind[] goalActionStatusKindArr = {goalActionStatusKind, goalActionStatusKind2, goalActionStatusKind3};
        $VALUES = goalActionStatusKindArr;
        $ENTRIES = C3cG.A0w(goalActionStatusKindArr);
        Companion = new Companion();
    }

    public static Ey9<GoalActionStatusKind> getEntries() {
        return $ENTRIES;
    }

    public static GoalActionStatusKind valueOf(String str) {
        return (GoalActionStatusKind) Enum.valueOf(GoalActionStatusKind.class, str);
    }

    public static GoalActionStatusKind[] values() {
        return (GoalActionStatusKind[]) $VALUES.clone();
    }

    public GoalActionStatusKind(String str, int i) {
    }
}
