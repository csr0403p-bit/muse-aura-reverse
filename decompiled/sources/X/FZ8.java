package X;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public abstract class FZ8 {
    public static AtomicReference A00 = new AtomicReference();

    public static Calendar A00(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        Calendar calendarA0y = AbstractC7609F5w.A0y();
        calendarA0y.set(calendar2.get(1), calendar2.get(2), calendar2.get(5));
        return calendarA0y;
    }
}
