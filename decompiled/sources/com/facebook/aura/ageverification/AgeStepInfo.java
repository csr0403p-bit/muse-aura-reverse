package com.facebook.aura.ageverification;

import X.Ey9;
import X.F3w;
import com.facebook.aura.R;
import java.util.Arrays;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AgeStepInfo {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgeStepInfo[] $VALUES;
    public static final AgeStepInfo HOW_SELFIES_WORK = new AgeStepInfo("HOW_SELFIES_WORK", 0, R.string._name_removed__res_0x7f120054, Integer.valueOf(R.string._name_removed__res_0x7f120053), Arrays.asList(new AgeStepInfoRow(R.drawable.circle_info_wght400_outline_24, R.string._name_removed__res_0x7f120052, false), new AgeStepInfoRow(R.drawable.rectangle18plus_outline_24_wght400, R.string._name_removed__res_0x7f120051, false), new AgeStepInfoRow(R.drawable.shield_lock_wght400_outline_24, R.string._name_removed__res_0x7f120050, true)));
    public static final AgeStepInfo WHY_CONFIRM;
    public final List<AgeStepInfoRow> rows;
    public final Integer subtitleRes;
    public final int titleRes;

    public static Ey9<AgeStepInfo> getEntries() {
        return $ENTRIES;
    }

    public static AgeStepInfo valueOf(String str) {
        return (AgeStepInfo) Enum.valueOf(AgeStepInfo.class, str);
    }

    public static AgeStepInfo[] values() {
        return (AgeStepInfo[]) $VALUES.clone();
    }

    public final List<AgeStepInfoRow> getRows() {
        return this.rows;
    }

    public final Integer getSubtitleRes() {
        return this.subtitleRes;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    static {
        AgeStepInfo ageStepInfo = new AgeStepInfo("WHY_CONFIRM", 1, R.string._name_removed__res_0x7f12007a, null, Arrays.asList(new AgeStepInfoRow(R.drawable.circle_info_wght400_outline_24, R.string._name_removed__res_0x7f120078, false), new AgeStepInfoRow(R.drawable.shield_lock_wght400_outline_24, R.string._name_removed__res_0x7f120079, false)));
        WHY_CONFIRM = ageStepInfo;
        AgeStepInfo[] ageStepInfoArr = {HOW_SELFIES_WORK, ageStepInfo};
        $VALUES = ageStepInfoArr;
        $ENTRIES = new F3w(ageStepInfoArr);
    }

    public AgeStepInfo(String str, int i, int i2, Integer num, List list) {
        this.titleRes = i2;
        this.subtitleRes = num;
        this.rows = list;
    }
}
