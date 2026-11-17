package X;

import android.os.Environment;
import android.os.StatFs;

/* renamed from: X.C6f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3262C6f {
    public static long A00 = 1;

    public static long A00() {
        return BV5.A07(new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes());
    }
}
