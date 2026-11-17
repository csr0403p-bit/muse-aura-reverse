package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Locale;

/* renamed from: X.DXa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5092DXa {
    public long A00;
    public long A01;
    public ConnectivityManager.NetworkCallback A02;
    public C5094DXc A03;
    public String A04;
    public ConnectivityManager A05;
    public final Context A06;
    public final boolean A07;
    public final boolean A08;
    public volatile boolean A09;

    public final boolean A02() {
        NetworkInfo activeNetworkInfo;
        try {
            String str = this.A04;
            if (str != null) {
                return str.equals("WIFI");
            }
            ConnectivityManager connectivityManagerA00 = A00();
            if (connectivityManagerA00 != null && (activeNetworkInfo = connectivityManagerA00.getActiveNetworkInfo()) != null) {
                boolean zA1Q = AnonymousClass002.A1Q(activeNetworkInfo.getType(), 9);
                boolean zA1Q2 = AnonymousClass002.A1Q(activeNetworkInfo.getType(), 1);
                if ((zA1Q && this.A08) || zA1Q2) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            CFK.A08("ConnectivityManagerHolder", "Exception in isOnAtLeastWifi", e);
            return false;
        }
    }

    public final ConnectivityManager A00() {
        if (this.A05 == null) {
            try {
                this.A05 = (ConnectivityManager) this.A06.getSystemService("connectivity");
            } catch (NullPointerException e) {
                CFK.A0A("ConnectivityManagerHolder", "Unable to get ConnectivityManager", e);
            }
        }
        return this.A05;
    }

    public final String A01() {
        NetworkInfo activeNetworkInfo;
        String typeName = this.A04;
        if (typeName == null) {
            ConnectivityManager connectivityManagerA00 = A00();
            if (connectivityManagerA00 == null || (activeNetworkInfo = connectivityManagerA00.getActiveNetworkInfo()) == null || (typeName = activeNetworkInfo.getTypeName()) == null) {
                return "UNKNOWN";
            }
            if (this.A07) {
                this.A04 = typeName.toUpperCase(Locale.US);
            }
        }
        return typeName;
    }

    public C5092DXa(Context context, boolean z, boolean z2) {
        C1H.A00(context);
        this.A06 = context;
        this.A07 = z;
        this.A08 = z2;
    }
}
