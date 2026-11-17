package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.File;
import java.util.Properties;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes5.dex */
public final class C4X {
    public final File A02;
    public final Properties A03 = new Properties();
    public char A00 = PublicSuffixDatabase.EXCEPTION_MARKER;
    public final Handler A01 = BV5.A0B(new HandlerThread("ForegroundEntityMapper"));

    public C4X(File file) {
        this.A02 = file;
    }
}
