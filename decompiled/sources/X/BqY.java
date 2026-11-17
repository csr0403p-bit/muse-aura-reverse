package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class BqY extends ThreadLocal<SimpleDateFormat> {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ SimpleDateFormat initialValue() {
        return new SimpleDateFormat("HH:mm:ss", Locale.US);
    }
}
