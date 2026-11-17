package com.facebook.aura.nudge;

import X.BzK;
import X.C3cI;
import X.C4oT;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import java.time.LocalDate;

/* loaded from: classes2.dex */
public final class ConversationNudgeStore {
    public static final int $stable = 0;
    public static final ConversationNudgeStore INSTANCE = new ConversationNudgeStore();
    public static final String KEY_COMPLETED_PREFIX = "completed_";
    public static final String KEY_LAST_SHOWN_DAY = "last_shown_day";
    public static final String KEY_LAST_SHOWN_DAY_PREFIX = "last_shown_day_";
    public static final String KEY_SHOW_COUNT_PREFIX = "show_count_";
    public static final long NO_DAY = Long.MIN_VALUE;

    public final boolean isCompleted(String str) {
        C7384Etj.A0Y(str, 0);
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.NUDGES).getBoolean(FGI.A0M(KEY_COMPLETED_PREFIX, str), false);
    }

    public final Long lastShownDay(String str) {
        C7384Etj.A0Y(str, 0);
        long j = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.NUDGES).getLong(FGI.A0M(KEY_LAST_SHOWN_DAY_PREFIX, str), Long.MIN_VALUE);
        Long lValueOf = Long.valueOf(j);
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return lValueOf;
    }

    public final void recordCompleted(String str) {
        C7384Etj.A0Y(str, 0);
        C3cI.A1H(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.NUDGES).A9q(), FGI.A0M(KEY_COMPLETED_PREFIX, str));
    }

    public final int recordShown(String str) {
        C7384Etj.A0Y(str, 0);
        int iShowCount = showCount(str) + 1;
        long epochDay = LocalDate.now().toEpochDay();
        BzK bzKA9q = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.NUDGES).A9q();
        bzKA9q.AYo(FGI.A0M(KEY_SHOW_COUNT_PREFIX, str), iShowCount);
        bzKA9q.AYp(FGI.A0M(KEY_LAST_SHOWN_DAY_PREFIX, str), epochDay);
        bzKA9q.AYp(KEY_LAST_SHOWN_DAY, epochDay);
        bzKA9q.apply();
        return iShowCount;
    }

    public final int showCount(String str) {
        C7384Etj.A0Y(str, 0);
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.NUDGES).getInt(FGI.A0M(KEY_SHOW_COUNT_PREFIX, str), 0);
    }

    private final C4oT prefs() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.NUDGES);
    }

    public final void clear() {
        BzK bzKA9q = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.NUDGES).A9q();
        bzKA9q.A08();
        bzKA9q.apply();
    }

    public final long today() {
        return LocalDate.now().toEpochDay();
    }

    public final Long lastShownDay() {
        long j = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.NUDGES).getLong(KEY_LAST_SHOWN_DAY, Long.MIN_VALUE);
        Long lValueOf = Long.valueOf(j);
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return lValueOf;
    }
}
