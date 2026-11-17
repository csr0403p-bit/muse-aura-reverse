package X;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1Y1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Y1 extends AbstractC04741Xc {
    public static final ZoneId A02 = ZoneId.of("UTC");
    public final int A00;
    public final List<HxE<String, String>> A01;

    /* JADX WARN: Incorrect types in method signature: (JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljava/lang/String; */
    public static final String A01(String str, Locale locale, Map map, long j) {
        String strA0U = FGI.A0U("P:", str, locale.toLanguageTag());
        Object objWithDecimalStyle = map.get(strA0U);
        if (objWithDecimalStyle == null) {
            objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            map.put(strA0U, objWithDecimalStyle);
        }
        C7384Etj.A0Z(objWithDecimalStyle, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
        return Instant.ofEpochMilli(j).atZone(A02).toLocalDate().format((DateTimeFormatter) objWithDecimalStyle);
    }

    public final String toString() {
        return "CalendarModel";
    }

    public C1Y1(Locale locale) {
        super(locale);
        this.A00 = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(dayOfWeekArrValues.length);
        for (DayOfWeek dayOfWeek : dayOfWeekArrValues) {
            AnonymousClass002.A1J(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale), arrayList);
        }
        this.A01 = arrayList;
    }

    public static final C1XY A00(C1Y1 c1y1, LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - c1y1.A00;
        if (value < 0) {
            value += 7;
        }
        return new C1XY(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(A02).toInstant().toEpochMilli(), value);
    }

    @Override // X.AbstractC04741Xc
    public final C1XX A02() {
        LocalDate localDateNow = LocalDate.now();
        return new C1XX(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(A02).toInstant().toEpochMilli(), localDateNow.getDayOfMonth());
    }

    @Override // X.AbstractC04741Xc
    public final C1XX A03(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(A02).toLocalDate();
        return new C1XX(localDate.getYear(), localDate.getMonthValue(), 1000 * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC), localDate.getDayOfMonth());
    }

    @Override // X.AbstractC04741Xc
    public final C1XY A04(long j) {
        return A00(this, Instant.ofEpochMilli(j).atZone(A02).withDayOfMonth(1).toLocalDate());
    }
}
