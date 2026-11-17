package com.facebook.aura.status.viewmodel;

import X.AbstractC7559F3s;
import X.C4JM;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes2.dex */
public final class TasksViewModel$Companion$formatSubtitle$6 extends AbstractC7559F3s implements G0U<String, CharSequence> {
    public final /* synthetic */ int $weeklyDayOffset;

    @Override // X.G0U
    public final CharSequence invoke(String str) {
        C7384Etj.A0Y(str, 0);
        String strShiftWeekday = TasksViewModel.Companion.shiftWeekday(str, this.$weeklyDayOffset);
        Integer num = TasksViewModel.DAY_ABBREVIATION_TO_STRING_RES.get(strShiftWeekday);
        if (num == null) {
            return strShiftWeekday;
        }
        return C4JM.A00().getString(num.intValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TasksViewModel$Companion$formatSubtitle$6(int i) {
        super(1);
        this.$weeklyDayOffset = i;
    }
}
