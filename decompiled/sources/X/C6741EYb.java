package X;

import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: X.EYb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6741EYb extends AbstractC6735EXt<Time> {
    public static final EYY A01 = new F4J(4);
    public final DateFormat A00 = new SimpleDateFormat("hh:mm:ss a");

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ void write(C6733EXr c6733EXr, Time time) throws IOException {
        String str;
        Time time2 = time;
        if (time2 == null) {
            c6733EXr.A0B();
            return;
        }
        synchronized (this) {
            str = this.A00.format((Date) time2);
        }
        c6733EXr.A0H(str);
    }

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ Time read(EY1 ey1) throws MalformedJsonException {
        Time time;
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
                    time = new Time(dateFormat.parse(strA0V).getTime());
                } catch (ParseException e) {
                    throw AbstractC6735EXt.A02(ey1, strA0V, "' as SQL Time; at path ", e);
                }
            } finally {
                dateFormat.setTimeZone(timeZone);
            }
        }
        return time;
    }
}
