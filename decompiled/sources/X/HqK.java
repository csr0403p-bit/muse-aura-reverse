package X;

import android.os.Handler;
import com.facebook.aura.commands.photos.DeviceMediaStoreReaderKt;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public abstract class HqK {
    public static final AtomicBoolean A01 = C60O.A1E();
    public static final Handler A00 = C60O.A02();

    public static final String A00(String str) {
        return FGI.A0h("(", Integer.toString(17705, 36).toUpperCase(Locale.ROOT), ", \"", AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(str, DeviceMediaStoreReaderKt.LIKE_ESCAPE_CHAR, "\\\\"), "\"", "\\\""), "\")");
    }
}
