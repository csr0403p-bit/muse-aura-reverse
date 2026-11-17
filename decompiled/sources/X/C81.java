package X;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C81 extends Thread {
    public static final String __redex_internal_original_name = "zza";
    public final /* synthetic */ Map A00;

    public C81(Map map) {
        this.A00 = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.A00;
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        Iterator itA11 = BV5.A11(map);
        while (itA11.hasNext()) {
            String strA0j = AnonymousClass005.A0j(itA11);
            builderBuildUpon.appendQueryParameter(strA0j, C60O.A0p(strA0j, map));
        }
        String string = builderBuildUpon.build().toString();
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sbA0p = BV4.A0p(BV5.A04(string) + 65);
                        sbA0p.append("Received non-success response code ");
                        sbA0p.append(responseCode);
                        Log.w("HttpUrlPinger", C60P.A1M(" from pinging URL: ", string, sbA0p));
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException | RuntimeException e) {
                String message = e.getMessage();
                StringBuilder sbA0r = BV5.A0r(message, BV5.A04(string) + 27);
                sbA0r.append("Error while pinging URL: ");
                sbA0r.append(string);
                Log.w("HttpUrlPinger", C60P.A1M(". ", message, sbA0r), e);
            }
        } catch (IndexOutOfBoundsException e2) {
            String message2 = e2.getMessage();
            StringBuilder sbA0r2 = BV5.A0r(message2, BV5.A04(string) + 32);
            sbA0r2.append("Error while parsing ping URL: ");
            sbA0r2.append(string);
            Log.w("HttpUrlPinger", C60P.A1M(". ", message2, sbA0r2), e2);
        }
    }
}
