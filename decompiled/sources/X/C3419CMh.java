package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.CMh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3419CMh {
    public final Context A00;
    public final File A01;

    public C3419CMh(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A00 = applicationContext == null ? context : applicationContext;
        this.A01 = C3418CMg.A00(context);
    }
}
