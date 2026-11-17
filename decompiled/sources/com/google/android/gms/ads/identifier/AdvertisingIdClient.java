package com.google.android.gms.ads.identifier;

import X.BV4;
import X.BV5;
import X.C3cG;
import X.C60P;
import X.CRy;
import X.CUD;
import X.CZd;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zzf;

/* loaded from: classes5.dex */
public final class AdvertisingIdClient {
    public CZd A00;
    public zzf A01;
    public boolean A02;
    public final Context A03;
    public final Object A04 = C3cG.A0T();

    public final class Info {
        public final String A00;
        public final boolean A01;

        public final String toString() {
            String str = this.A00;
            boolean z = this.A01;
            StringBuilder sbA0p = BV4.A0p(BV5.A04(str) + 7);
            sbA0p.append("{");
            sbA0p.append(str);
            return C60P.A1P("}", sbA0p, z);
        }

        public Info(String str, boolean z) {
            this.A00 = str;
            this.A01 = z;
        }
    }

    public final void A00() {
        CRy.A06("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Context context = this.A03;
            if (this.A00 != null) {
                try {
                    if (this.A02) {
                        CUD.A00().A02(context, this.A00);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.A02 = false;
                this.A01 = null;
                this.A00 = null;
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        CRy.A03(context);
        Context applicationContext = context.getApplicationContext();
        this.A03 = applicationContext != null ? applicationContext : context;
        this.A02 = false;
    }

    public final void finalize() {
        A00();
    }
}
