package X;

import android.content.Context;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CJO {
    public final Context A00;

    public final Set A00() {
        Set<String> setA13;
        synchronized (CJO.class) {
            try {
                setA13 = BV4.A07(this.A00, "playcore_split_install_internal").getStringSet("modules_to_uninstall_if_emulated", C60O.A13());
            } catch (Exception unused) {
                setA13 = C60O.A13();
            }
            if (setA13 == null) {
                setA13 = C60O.A13();
            }
        }
        return setA13;
    }

    public CJO(Context context) {
        this.A00 = context;
    }
}
