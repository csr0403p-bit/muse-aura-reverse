package com.facebook.aura.pairs;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SharedGoalStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SharedGoalStatus[] $VALUES;
    public static final SharedGoalStatus ACTIVE;
    public static final SharedGoalStatus COMPLETED;
    public static final Companion Companion;
    public static final SharedGoalStatus PAUSED;
    public static final SharedGoalStatus RETIRED;
    public final String wire;

    static {
        SharedGoalStatus sharedGoalStatus = new SharedGoalStatus("ACTIVE", 0, HatchOfflineConversationRepository.THREAD_STATUS_ACTIVE);
        ACTIVE = sharedGoalStatus;
        SharedGoalStatus sharedGoalStatus2 = new SharedGoalStatus("PAUSED", 1, "paused");
        PAUSED = sharedGoalStatus2;
        SharedGoalStatus sharedGoalStatus3 = new SharedGoalStatus("COMPLETED", 2, "completed");
        COMPLETED = sharedGoalStatus3;
        SharedGoalStatus sharedGoalStatus4 = new SharedGoalStatus("RETIRED", 3, "retired");
        RETIRED = sharedGoalStatus4;
        SharedGoalStatus[] sharedGoalStatusArr = {sharedGoalStatus, sharedGoalStatus2, sharedGoalStatus3, sharedGoalStatus4};
        $VALUES = sharedGoalStatusArr;
        $ENTRIES = C3cG.A0w(sharedGoalStatusArr);
        Companion = new Companion();
    }

    public static Ey9<SharedGoalStatus> getEntries() {
        return $ENTRIES;
    }

    public static SharedGoalStatus valueOf(String str) {
        return (SharedGoalStatus) Enum.valueOf(SharedGoalStatus.class, str);
    }

    public static SharedGoalStatus[] values() {
        return (SharedGoalStatus[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public final class Companion {
        public final SharedGoalStatus fromWire(String str) {
            SharedGoalStatus next;
            C7384Etj.A0Y(str, 0);
            Iterator<SharedGoalStatus> it = SharedGoalStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getWire())) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SharedGoalStatus(String str, int i, String str2) {
        this.wire = str2;
    }
}
