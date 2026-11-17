package X;

import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes5.dex */
public final class EYa extends AbstractC6735EXt<Date> {
    public static final EYY A01 = new F4J(3);
    public final DateFormat A00 = new SimpleDateFormat("MMM d, yyyy");

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ void write(C6733EXr c6733EXr, Date date) throws IOException {
        String str;
        Date date2 = date;
        if (date2 == null) {
            c6733EXr.A0B();
            return;
        }
        synchronized (this) {
            str = this.A00.format((java.util.Date) date2);
        }
        c6733EXr.A0H(str);
    }

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ Date read(EY1 ey1) throws MalformedJsonException {
        Date date;
        if (ey1.A0R() == C79.A0Z) {
            ey1.A0a();
            return null;
        }
        String strA0V = ey1.A0V();
        synchronized (this) {
            DateFormat dateFormat = this.A00;
            TimeZone timeZone = dateFormat.getTimeZone();
            try {
                try {
                    date = new Date(dateFormat.parse(strA0V).getTime());
                } catch (ParseException e) {
                    throw AbstractC6735EXt.A02(ey1, strA0V, "' as SQL Date; at path ", e);
                }
            } finally {
                dateFormat.setTimeZone(timeZone);
            }
        }
        return date;
    }
}
