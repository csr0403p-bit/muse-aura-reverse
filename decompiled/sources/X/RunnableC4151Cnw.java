package X;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: X.Cnw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC4151Cnw implements Runnable {
    public static final Cc9 A02 = new Cc9("RevokeAccessOperation");
    public static final String __redex_internal_original_name = "zbb";
    public final C4152Cnx A00;
    public final String A01;

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        String strValueOf;
        String str;
        Status status = Status.A06;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(FGI.A0M("https://accounts.google.com/o/oauth2/revoke?token=", this.A01)).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.A08;
            } else {
                Log.e("RevokeAccessOperation", "".concat("Unable to revoke access!"));
            }
            Cc9 cc9 = A02;
            String strA0H = FGI.A0H("Response Code: ", responseCode);
            if (cc9.A00 <= 3) {
                Log.d("RevokeAccessOperation", "".concat(strA0H));
            }
        } catch (IOException e) {
            strValueOf = String.valueOf(e.toString());
            str = "IOException when revoking access: ";
            Log.e("RevokeAccessOperation", "".concat(str.concat(strValueOf)));
            this.A00.A02(status);
        } catch (Exception e2) {
            strValueOf = String.valueOf(e2.toString());
            str = "Exception when revoking access: ";
            Log.e("RevokeAccessOperation", "".concat(str.concat(strValueOf)));
            this.A00.A02(status);
        }
        this.A00.A02(status);
    }

    public RunnableC4151Cnw(String str) {
        CRy.A05(str);
        this.A01 = str;
        this.A00 = new C4152Cnx(null);
    }
}
