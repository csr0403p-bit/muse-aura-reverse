package X;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class C03 {
    public static Boolean A00;

    public static final synchronized boolean A00(Context context) {
        Boolean bool;
        if (A00 == null) {
            try {
                A00 = false;
                context.getAssets().open("app_modules.json").close();
                A00 = AnonymousClass001.A0i();
            } catch (IOException unused) {
            }
        }
        bool = A00;
        return bool != null ? bool.booleanValue() : false;
    }
}
