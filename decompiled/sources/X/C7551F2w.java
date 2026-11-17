package X;

import android.content.Context;
import android.content.Intent;
import java.util.Iterator;

/* renamed from: X.F2w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7551F2w {
    public final Context A00;
    public final F3X A01;
    public final String A02;
    public final String A03;

    public final void A00() {
        String str = this.A02;
        if (str != null) {
            Intent intentA03 = C60P.A03("com.facebook.rti.fbns.intent.REGISTER");
            Context context = this.A00;
            intentA03.putExtra("pkg_name", context.getPackageName());
            intentA03.putExtra("appid", this.A03);
            F3I.A00(intentA03, context, str);
        }
    }

    public C7551F2w(Context context, F3X f3x, String str) {
        String str2;
        Iterator it = C60O.A16("com.facebook.services", "com.facebook.services.dev").iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = null;
                break;
            } else {
                str2 = (String) it.next();
                if (F3F.A01(context, str2)) {
                    break;
                }
            }
        }
        this.A02 = str2;
        this.A01 = f3x;
        this.A00 = context;
        this.A03 = str;
    }
}
