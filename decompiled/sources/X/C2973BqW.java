package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.BqW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2973BqW extends ThreadLocal<SimpleDateFormat> {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ SimpleDateFormat initialValue() {
        return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
    }
}
