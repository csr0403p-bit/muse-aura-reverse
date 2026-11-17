package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.CSs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3536CSs {
    public final Context A00;
    public final SharedPreferences A01;
    public final C3535CSr A02;
    public final Map<String, Eu7> A03;

    public final synchronized void A01() {
        this.A03.clear();
        Context context = this.A00;
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            noBackupFilesDir = context.getFilesDir();
        }
        for (File file : noBackupFilesDir.listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.A01.edit().clear().commit();
    }

    public C3536CSs(Context context) {
        boolean zIsEmpty;
        C3535CSr c3535CSr = new C3535CSr();
        this.A03 = new DQd(0);
        this.A00 = context;
        this.A01 = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.A02 = c3535CSr;
        File fileA0O = C3cG.A0O(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (fileA0O.exists()) {
            return;
        }
        try {
            if (fileA0O.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = this.A01.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseInstanceId", "App restored, clearing state");
                A01();
                FirebaseInstanceId.getInstance(C3554CTr.A00()).A05();
            }
        } catch (IOException e) {
            if (BV4.A1U("FirebaseInstanceId")) {
                String strValueOf = String.valueOf(e.getMessage());
                Log.d("FirebaseInstanceId", BV5.A0l(strValueOf.length(), "Error creating file in no backup dir: ", strValueOf));
            }
        }
    }

    public static String A00(String str) {
        StringBuilder sbA0r = BV5.A0r(str, BV5.A04("") + 3);
        sbA0r.append("");
        return C60P.A1M("|S|", str, sbA0r);
    }
}
