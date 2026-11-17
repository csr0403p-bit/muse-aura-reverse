package X;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes5.dex */
public final class CHH implements InterfaceC3289C9n<Date> {
    public static final DateFormat A00;

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, CHI chi) {
        chi.A3G(A00.format((Date) obj));
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        A00 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
