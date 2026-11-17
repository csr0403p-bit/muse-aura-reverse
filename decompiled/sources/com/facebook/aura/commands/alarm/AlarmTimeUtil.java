package com.facebook.aura.commands.alarm;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C3cG;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9tI;
import X.F0C;
import X.G0V;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class AlarmTimeUtil {
    public static final AlarmTimeUtil INSTANCE = new AlarmTimeUtil();
    public static final long INVALID_TRIGGER = -1;
    public static final int MAX_STEPS = 4000;

    public final Long anchorMsFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(int i, int i2, Recurrence recurrence, String str, ZoneId zoneId) {
        LocalDate localDateNow;
        long jA06;
        AnonymousClass002.A1C(str, 3, zoneId);
        if (recurrence == null) {
            jA06 = 0;
        } else {
            if (str.length() > 0) {
                try {
                    localDateNow = LocalDate.parse(str);
                } catch (DateTimeParseException unused) {
                    localDateNow = null;
                }
                if (localDateNow == null) {
                    return null;
                }
            } else {
                localDateNow = LocalDate.now(zoneId);
            }
            jA06 = C60R.A06(localDateNow, zoneId, i, i2);
        }
        return Long.valueOf(jA06);
    }

    public final long computeFirstTriggerTimeMs$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(int i, int i2, Recurrence recurrence, String str, long j, ZoneId zoneId) {
        AnonymousClass002.A1D(str, 3, zoneId);
        if (recurrence == null) {
            return str.length() > 0 ? computeAbsoluteTriggerTimeMs(i, i2, str, j, zoneId) : nextTimeOfDay(i, i2, j, zoneId);
        }
        Long lAnchorMsFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm = anchorMsFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(i, i2, recurrence, str, zoneId);
        if (lAnchorMsFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm != null) {
            return computeNextAfter$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(i, i2, recurrence, j, lAnchorMsFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm.longValue(), zoneId);
        }
        return -1L;
    }

    public final long computeNextAfter$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(int i, int i2, Recurrence recurrence, long j, long j2, ZoneId zoneId) {
        ZonedDateTime zonedDateTimePlusDays;
        long jA06;
        Long l;
        AnonymousClass002.A1D(recurrence, 2, zoneId);
        long j3 = recurrence.interval;
        RecurrenceFrequency recurrenceFrequency = recurrence.frequency;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = recurrenceFrequency.ordinal();
        long j4 = 0;
        if (iOrdinal == 0) {
            if (j2 > 0) {
                ZonedDateTime zonedDateTimeAtZone = Instant.ofEpochMilli(j2).atZone(zoneId);
                zonedDateTimePlusDays = zonedDateTimeAtZone;
                while (C60Q.A06(zonedDateTimePlusDays) <= j) {
                    if (j4 >= 4000) {
                        break;
                    }
                    j4++;
                    C7384Etj.A0X(zonedDateTimeAtZone);
                    zonedDateTimePlusDays = zonedDateTimeAtZone.plusDays(j3 * j4);
                    C7384Etj.A0U(zonedDateTimePlusDays);
                }
                jA06 = C60Q.A06(zonedDateTimePlusDays);
            }
            return -1L;
        }
        if (iOrdinal == 2) {
            if (j2 > 0) {
                ZonedDateTime zonedDateTimeAtZone2 = Instant.ofEpochMilli(j2).atZone(zoneId);
                zonedDateTimePlusDays = zonedDateTimeAtZone2;
                while (C60Q.A06(zonedDateTimePlusDays) <= j) {
                    if (j4 >= 4000) {
                        break;
                    }
                    j4++;
                    C7384Etj.A0X(zonedDateTimeAtZone2);
                    zonedDateTimePlusDays = zonedDateTimeAtZone2.plusMonths(j3 * j4);
                    C7384Etj.A0U(zonedDateTimePlusDays);
                }
                jA06 = C60Q.A06(zonedDateTimePlusDays);
            }
            return -1L;
        }
        if (iOrdinal == 3) {
            if (j2 > 0) {
                ZonedDateTime zonedDateTimeAtZone3 = Instant.ofEpochMilli(j2).atZone(zoneId);
                zonedDateTimePlusDays = zonedDateTimeAtZone3;
                while (C60Q.A06(zonedDateTimePlusDays) <= j) {
                    if (j4 >= 4000) {
                        break;
                    }
                    j4++;
                    C7384Etj.A0X(zonedDateTimeAtZone3);
                    zonedDateTimePlusDays = zonedDateTimeAtZone3.plusYears(j3 * j4);
                    C7384Etj.A0U(zonedDateTimePlusDays);
                }
                jA06 = C60Q.A06(zonedDateTimePlusDays);
            }
            return -1L;
        }
        if (iOrdinal != 1) {
            throw C3cG.A0q();
        }
        jA06 = nextWeeklyAfter(i, i2, recurrence, j, j2, zoneId);
        if (jA06 == -1 || ((l = recurrence.until) != null && jA06 > l.longValue())) {
            return -1L;
        }
        return jA06;
    }

    public final long computeNextTriggerTimeMs(int i, int i2, String str, String str2) {
        Recurrence recurrence;
        AnonymousClass002.A1B(str, 2, str2);
        List<Integer> days = AlarmHandlersKt.parseDays(str);
        if (days.isEmpty()) {
            recurrence = null;
        } else {
            F0C<C9hr<Object>>[] f0cArr = Recurrence.$childSerializers;
            recurrence = new Recurrence(RecurrenceFrequency.WEEKLY, 1, days, null, null);
        }
        return computeFirstTriggerTimeMs$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(i, i2, recurrence, str2, System.currentTimeMillis(), C60Q.A0r());
    }

    public final long computeOneTimeReschedule(int i, int i2, long j, long j2, ZoneId zoneId) {
        C7384Etj.A0Y(zoneId, 4);
        if (j > j2) {
            long jA06 = C60R.A06(C60R.A0l(zoneId, j), zoneId, i, i2);
            if (jA06 > j2) {
                return jA06;
            }
        }
        return nextTimeOfDay(i, i2, j2, zoneId);
    }

    public final long reanchor(long j, int i, int i2, ZoneId zoneId) {
        C7384Etj.A0Y(zoneId, 3);
        if (j > 0) {
            return C60R.A06(C60R.A0l(zoneId, j), zoneId, i, i2);
        }
        return 0L;
    }

    public final List<String> weekdayNames(String str) {
        List listA0h;
        if (str == null || (listA0h = C7BY.A0h(str, new char[1], ',')) == null) {
            listA0h = C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA0h.iterator();
        while (it.hasNext()) {
            Integer numA0r = C9tI.A0r(C7BY.A0b(it));
            if (numA0r != null) {
                arrayListA0h.add(numA0r);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            int iA0F = AnonymousClass001.A0F(obj);
            if (1 <= iA0F && iA0F < 8) {
                arrayListA0h2.add(obj);
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h2);
        Iterator it2 = arrayListA0h2.iterator();
        while (it2.hasNext()) {
            int iA03 = C60Q.A03(it2);
            int i = iA03 - 1;
            if (iA03 == 1) {
                i = 7;
            }
            arrayListA0i.add(DayOfWeek.of(i).getDisplayName(TextStyle.FULL, Locale.US));
        }
        return arrayListA0i;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecurrenceFrequency.values().length];
            try {
                AnonymousClass002.A13(RecurrenceFrequency.DAILY, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(RecurrenceFrequency.MONTHLY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(RecurrenceFrequency.YEARLY, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(RecurrenceFrequency.WEEKLY, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ Long anchorMsFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm$default(AlarmTimeUtil alarmTimeUtil, int i, int i2, Recurrence recurrence, String str, ZoneId zoneId, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            zoneId = C60Q.A0r();
        }
        return alarmTimeUtil.anchorMsFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(i, i2, recurrence, str, zoneId);
    }

    public static /* synthetic */ long computeFirstTriggerTimeMs$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm$default(AlarmTimeUtil alarmTimeUtil, int i, int i2, Recurrence recurrence, String str, long j, ZoneId zoneId, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            zoneId = C60Q.A0r();
        }
        return alarmTimeUtil.computeFirstTriggerTimeMs$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(i, i2, recurrence, str, j, zoneId);
    }

    public static /* synthetic */ long computeNextAfter$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm$default(AlarmTimeUtil alarmTimeUtil, int i, int i2, Recurrence recurrence, long j, long j2, ZoneId zoneId, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            zoneId = C60Q.A0r();
        }
        return alarmTimeUtil.computeNextAfter$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(i, i2, recurrence, j, j2, zoneId);
    }

    public static /* synthetic */ long computeNextTriggerTimeMs$default(AlarmTimeUtil alarmTimeUtil, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            str = "";
        }
        if ((i3 & 8) != 0) {
            str2 = "";
        }
        return alarmTimeUtil.computeNextTriggerTimeMs(i, i2, str, str2);
    }

    public static /* synthetic */ long computeOneTimeReschedule$default(AlarmTimeUtil alarmTimeUtil, int i, int i2, long j, long j2, ZoneId zoneId, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            zoneId = C60Q.A0r();
        }
        return alarmTimeUtil.computeOneTimeReschedule(i, i2, j, j2, zoneId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        return r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long nextWeeklyAfter(int r20, int r21, com.facebook.aura.commands.alarm.Recurrence r22, long r23, long r25, java.time.ZoneId r27) {
        /*
            r19 = this;
            r10 = r22
            java.util.List<java.lang.Integer> r8 = r10.byWeekdays
            boolean r2 = r8.isEmpty()
            r17 = -1
            r15 = 0
            r0 = r25
            r9 = r27
            if (r2 == 0) goto L2b
            int r2 = (r25 > r15 ? 1 : (r25 == r15 ? 0 : -1))
            if (r2 <= 0) goto La9
            com.facebook.aura.commands.alarm.AlarmTimeUtil r3 = com.facebook.aura.commands.alarm.AlarmTimeUtil.INSTANCE
            java.time.LocalDate r2 = X.C60R.A0l(r9, r0)
            X.C7384Etj.A0U(r2)
            int r2 = r3.calendarDayOfWeek(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.List r8 = java.util.Collections.singletonList(r2)
        L2b:
            int r2 = (r25 > r15 ? 1 : (r25 == r15 ? 0 : -1))
            if (r2 <= 0) goto La7
            java.time.LocalDate r3 = X.C60R.A0l(r9, r0)
            java.time.DayOfWeek r2 = java.time.DayOfWeek.MONDAY
            java.time.temporal.TemporalAdjuster r2 = java.time.temporal.TemporalAdjusters.previousOrSame(r2)
            java.time.LocalDate r7 = r3.with(r2)
        L3d:
            r4 = r23
            java.time.LocalDate r6 = X.C60R.A0l(r9, r4)
            int r2 = (r25 > r15 ? 1 : (r25 == r15 ? 0 : -1))
            if (r2 <= 0) goto L52
            java.time.LocalDate r1 = X.C60R.A0l(r9, r0)
            boolean r0 = r1.isAfter(r6)
            if (r0 == 0) goto L52
            r6 = r1
        L52:
            int r0 = r10.interval
            int r0 = r0 * 7
            int r12 = r0 + 7
            if (r12 < 0) goto La9
            r11 = 0
        L5b:
            long r0 = (long) r11
            java.time.LocalDate r2 = r6.plusDays(r0)
            X.C7384Etj.A0X(r2)
            r0 = r19
            int r0 = r0.calendarDayOfWeek(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto La2
            r1 = r20
            r0 = r21
            long r13 = X.C60R.A06(r2, r9, r1, r0)
            int r0 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r0 <= 0) goto La2
            if (r7 == 0) goto La1
            int r1 = r10.interval
            r0 = 1
            if (r1 <= r0) goto La1
            java.time.temporal.ChronoUnit r1 = java.time.temporal.ChronoUnit.WEEKS
            java.time.DayOfWeek r0 = java.time.DayOfWeek.MONDAY
            java.time.temporal.TemporalAdjuster r0 = java.time.temporal.TemporalAdjusters.previousOrSame(r0)
            java.time.LocalDate r0 = r2.with(r0)
            long r2 = r1.between(r7, r0)
            int r0 = r10.interval
            long r0 = (long) r0
            long r1 = com.facebook.aura.commands.alarm.AlarmTimeUtil$$ExternalSyntheticBackport0.m(r2, r0)
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 != 0) goto La2
        La1:
            return r13
        La2:
            if (r11 == r12) goto La9
            int r11 = r11 + 1
            goto L5b
        La7:
            r7 = 0
            goto L3d
        La9:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AlarmTimeUtil.nextWeeklyAfter(int, int, com.facebook.aura.commands.alarm.Recurrence, long, long, java.time.ZoneId):long");
    }

    public static /* synthetic */ Long parseUntilMs$default(AlarmTimeUtil alarmTimeUtil, String str, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = C60Q.A0r();
        }
        return alarmTimeUtil.parseUntilMs(str, zoneId);
    }

    public static /* synthetic */ long reanchor$default(AlarmTimeUtil alarmTimeUtil, long j, int i, int i2, ZoneId zoneId, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            zoneId = C60Q.A0r();
        }
        return alarmTimeUtil.reanchor(j, i, i2, zoneId);
    }

    private final long stepFrom(long j, long j2, ZoneId zoneId, G0V<? super ZonedDateTime, ? super Long, ZonedDateTime> g0v) {
        long j3 = 0;
        if (j > 0) {
            ZonedDateTime zonedDateTimeAtZone = Instant.ofEpochMilli(j).atZone(zoneId);
            ZonedDateTime zonedDateTimeInvoke = zonedDateTimeAtZone;
            while (C60Q.A06(zonedDateTimeInvoke) <= j2) {
                if (j3 < 4000) {
                    j3++;
                    C7384Etj.A0X(zonedDateTimeAtZone);
                    zonedDateTimeInvoke = g0v.invoke(zonedDateTimeAtZone, Long.valueOf(j3));
                }
            }
            return C60Q.A06(zonedDateTimeInvoke);
        }
        return -1L;
    }

    private final int calendarDayOfWeek(LocalDate localDate) {
        return (localDate.getDayOfWeek().getValue() % 7) + 1;
    }

    private final long computeAbsoluteTriggerTimeMs(int i, int i2, String str, long j, ZoneId zoneId) {
        LocalDate localDate;
        try {
            localDate = LocalDate.parse(str);
        } catch (DateTimeParseException unused) {
            localDate = null;
        }
        if (localDate != null) {
            long jA06 = C60R.A06(localDate, zoneId, i, i2);
            if (jA06 > j) {
                return jA06;
            }
        }
        return -1L;
    }

    private final long nextTimeOfDay(int i, int i2, long j, ZoneId zoneId) {
        ZonedDateTime zonedDateTimeWith = Instant.ofEpochMilli(j).atZone(zoneId).with((TemporalAdjuster) LocalTime.of(i, i2));
        if (C60Q.A06(zonedDateTimeWith) <= j) {
            zonedDateTimeWith = zonedDateTimeWith.plusDays(1L);
        }
        return C60Q.A06(zonedDateTimeWith);
    }

    private final LocalDate parseDate(String str) {
        try {
            return LocalDate.parse(str);
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public final Long parseUntilMs(String str, ZoneId zoneId) {
        LocalDate localDate;
        AnonymousClass003.A0u(str, zoneId);
        try {
            localDate = LocalDate.parse(str);
        } catch (DateTimeParseException unused) {
            localDate = null;
        }
        if (localDate != null) {
            return Long.valueOf(C60Q.A06(localDate.atTime(LocalTime.MAX).atZone(zoneId)));
        }
        try {
            return Long.valueOf(C60Q.A05(str));
        } catch (DateTimeParseException unused2) {
            return null;
        }
    }
}
