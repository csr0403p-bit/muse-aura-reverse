package com.facebook.aura.commands.calendar;

import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C9tI;
import com.facebook.aura.commands.calendar.CalendarEventTarget;
import java.time.format.DateTimeParseException;

/* loaded from: classes3.dex */
public abstract class CalendarEventTargetKt {
    public static final CalendarEventTarget parseCalendarEventTarget(String str) {
        CalendarEventTarget singleOccurrence;
        C7384Etj.A0Y(str, 0);
        int iA08 = C7BY.A08(str, '#', 0);
        if (iA08 >= 0) {
            Long lA0s = C9tI.A0s(str.substring(0, iA08));
            if (lA0s != null) {
                long jLongValue = lA0s.longValue();
                if (jLongValue >= 0) {
                    try {
                        singleOccurrence = new CalendarEventTarget.SingleOccurrence(jLongValue, C60Q.A05(str.substring(iA08 + 1)));
                    } catch (DateTimeParseException unused) {
                    }
                }
            }
            return null;
        }
        Long lA0s2 = C9tI.A0s(str);
        if (lA0s2 == null) {
            return null;
        }
        long jLongValue2 = lA0s2.longValue();
        if (jLongValue2 < 0) {
            return null;
        }
        singleOccurrence = new CalendarEventTarget.WholeSeries(jLongValue2);
        return singleOccurrence;
    }
}
