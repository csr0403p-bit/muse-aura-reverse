package X;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.EYk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6750EYk extends ThreadLocal<DateFormat> {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ DateFormat initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(AbstractC6843Eav.A01);
        return simpleDateFormat;
    }
}
