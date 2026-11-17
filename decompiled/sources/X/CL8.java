package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.media3.extractor.DefaultExtractorsFactory;
import com.google.common.base.Supplier;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class CL8 implements Supplier {
    public final int $t;
    public final Object A00;

    public CL8(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        C10387HaS c10387HaS;
        boolean z;
        switch (this.$t) {
            case 0:
                return DpL.A00((Context) this.A00);
            case 1:
                return new CNA((Context) this.A00);
            case 2:
                return new C5607Dlm(new CXM((Context) this.A00), new DefaultExtractorsFactory());
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return this.A00;
            case 8:
                return new DoW((Context) this.A00, C6136Dwe.A0I, new C5377DhU());
            case 9:
                Context context = (Context) this.A00;
                synchronized (C10387HaS.class) {
                    c10387HaS = C10387HaS.A0E;
                    if (c10387HaS == null) {
                        Context applicationContext = context == null ? null : context.getApplicationContext();
                        E7C e7c = E7C.A00;
                        HashMap mapA0v = BV4.A0v(8);
                        BV4.A1F(BV4.A0V(), mapA0v, 1000000L);
                        mapA0v.put(BV4.A0X(), -9223372036854775807L);
                        BV6.A1E(-9223372036854775807L, mapA0v, 3);
                        BV6.A1E(-9223372036854775807L, mapA0v, 4);
                        BV6.A1E(-9223372036854775807L, mapA0v, 5);
                        BV6.A1E(-9223372036854775807L, mapA0v, 10);
                        BV6.A1E(-9223372036854775807L, mapA0v, 9);
                        BV6.A1E(-9223372036854775807L, mapA0v, 7);
                        c10387HaS = new C10387HaS(applicationContext, e7c, mapA0v);
                        C10387HaS.A0E = c10387HaS;
                    }
                }
                return c10387HaS;
            case 10:
                try {
                    return (InterfaceC5791Dpa) ((Class) this.A00).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 11:
                ConnectivityManager connectivityManagerA00 = ((Dlw) this.A00).A27.A04.A00();
                if (connectivityManagerA00 != null) {
                    try {
                        Network activeNetwork = connectivityManagerA00.getActiveNetwork();
                        if (activeNetwork != null) {
                            NetworkCapabilities networkCapabilities = connectivityManagerA00.getNetworkCapabilities(activeNetwork);
                            if (networkCapabilities != null) {
                                if (networkCapabilities.hasCapability(12)) {
                                }
                            }
                            z = true;
                        }
                        z = false;
                    } catch (RuntimeException unused) {
                        z = true;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                return new C5607Dlm(new CXM((Context) this.A00), InterfaceC5819Dq4.A00);
            default:
                return Long.valueOf(((C6089DvT) this.A00).A00);
        }
    }
}
