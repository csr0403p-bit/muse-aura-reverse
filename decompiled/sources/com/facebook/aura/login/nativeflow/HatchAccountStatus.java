package com.facebook.aura.login.nativeflow;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchAccountStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchAccountStatus[] $VALUES;
    public static final HatchAccountStatus ACTIVE;
    public static final Companion Companion;
    public static final HatchAccountStatus DEACTIVATED;
    public static final HatchAccountStatus SCHEDULED_FOR_DELETION;
    public final String wireValue;

    static {
        HatchAccountStatus hatchAccountStatus = new HatchAccountStatus("ACTIVE", 0, HatchOfflineConversationRepository.THREAD_STATUS_ACTIVE);
        ACTIVE = hatchAccountStatus;
        HatchAccountStatus hatchAccountStatus2 = new HatchAccountStatus("DEACTIVATED", 1, "deactivated");
        DEACTIVATED = hatchAccountStatus2;
        HatchAccountStatus hatchAccountStatus3 = new HatchAccountStatus("SCHEDULED_FOR_DELETION", 2, "scheduled_for_deletion");
        SCHEDULED_FOR_DELETION = hatchAccountStatus3;
        HatchAccountStatus[] hatchAccountStatusArr = {hatchAccountStatus, hatchAccountStatus2, hatchAccountStatus3};
        $VALUES = hatchAccountStatusArr;
        $ENTRIES = C3cG.A0w(hatchAccountStatusArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final HatchAccountStatus fromWire(String str) {
            HatchAccountStatus next;
            Iterator<HatchAccountStatus> it = HatchAccountStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.wireValue, str)) {
                    break;
                }
            }
            HatchAccountStatus hatchAccountStatus = next;
            return hatchAccountStatus == null ? HatchAccountStatus.ACTIVE : hatchAccountStatus;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<HatchAccountStatus> getEntries() {
        return $ENTRIES;
    }

    public static HatchAccountStatus valueOf(String str) {
        return (HatchAccountStatus) Enum.valueOf(HatchAccountStatus.class, str);
    }

    public static HatchAccountStatus[] values() {
        return (HatchAccountStatus[]) $VALUES.clone();
    }

    public HatchAccountStatus(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
