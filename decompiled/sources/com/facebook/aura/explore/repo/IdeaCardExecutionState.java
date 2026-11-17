package com.facebook.aura.explore.repo;

import X.AnonymousClass001;
import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IdeaCardExecutionState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ IdeaCardExecutionState[] $VALUES;
    public static final Companion Companion;
    public static final IdeaCardExecutionState EXECUTING;
    public static final IdeaCardExecutionState FAILED;
    public static final IdeaCardExecutionState IDLE;
    public static final IdeaCardExecutionState SUCCESS;

    static {
        IdeaCardExecutionState ideaCardExecutionState = new IdeaCardExecutionState("IDLE", 0);
        IDLE = ideaCardExecutionState;
        IdeaCardExecutionState ideaCardExecutionState2 = new IdeaCardExecutionState("EXECUTING", 1);
        EXECUTING = ideaCardExecutionState2;
        IdeaCardExecutionState ideaCardExecutionState3 = new IdeaCardExecutionState("SUCCESS", 2);
        SUCCESS = ideaCardExecutionState3;
        IdeaCardExecutionState ideaCardExecutionState4 = new IdeaCardExecutionState(CvmMigrationStatusJson.STAGE_FAILED, 3);
        FAILED = ideaCardExecutionState4;
        IdeaCardExecutionState[] ideaCardExecutionStateArr = {ideaCardExecutionState, ideaCardExecutionState2, ideaCardExecutionState3, ideaCardExecutionState4};
        $VALUES = ideaCardExecutionStateArr;
        $ENTRIES = new F3w(ideaCardExecutionStateArr);
        Companion = new Companion();
    }

    public static Ey9<IdeaCardExecutionState> getEntries() {
        return $ENTRIES;
    }

    public static IdeaCardExecutionState valueOf(String str) {
        return (IdeaCardExecutionState) Enum.valueOf(IdeaCardExecutionState.class, str);
    }

    public static IdeaCardExecutionState[] values() {
        return (IdeaCardExecutionState[]) $VALUES.clone();
    }

    public final class Companion {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final IdeaCardExecutionState fromBuildStatus(String str) {
            String str2;
            C7384Etj.A0Y(str, 0);
            String strA0u = AnonymousClass001.A0u(str);
            switch (strA0u.hashCode()) {
                case -1867169789:
                    str2 = "success";
                    break;
                case -1281977283:
                    if (strA0u.equals("failed")) {
                        return IdeaCardExecutionState.FAILED;
                    }
                    return IdeaCardExecutionState.IDLE;
                case -753541113:
                    if (strA0u.equals("in_progress")) {
                        return IdeaCardExecutionState.EXECUTING;
                    }
                    return IdeaCardExecutionState.IDLE;
                case -599445191:
                    str2 = "complete";
                    break;
                default:
                    return IdeaCardExecutionState.IDLE;
            }
            if (strA0u.equals(str2)) {
                return IdeaCardExecutionState.SUCCESS;
            }
            return IdeaCardExecutionState.IDLE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public IdeaCardExecutionState(String str, int i) {
    }
}
