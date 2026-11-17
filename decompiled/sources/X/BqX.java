package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class BqX extends ThreadLocal<SimpleDateFormat> {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ SimpleDateFormat initialValue() {
        return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
    }
}
