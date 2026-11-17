package X;

import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class EDh implements Runnable {
    public static final String __redex_internal_original_name = "DefaultMaxSizePluginController$onPathRequested$1";
    public final /* synthetic */ EDW A00;
    public final /* synthetic */ EDg<T> A01;
    public final /* synthetic */ C6531EDd A02;
    public final /* synthetic */ File A03;

    /* JADX WARN: Incorrect types in method signature: (LX/EDg<TT;>;Ljava/io/File;LX/EDW;LX/EDd;)V */
    public EDh(EDW edw, EDg eDg, C6531EDd c6531EDd, File file) {
        this.A01 = eDg;
        this.A03 = file;
        this.A00 = edw;
        this.A02 = c6531EDd;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, IOException {
        String absolutePath;
        EDg<T> eDg = this.A01;
        File file = this.A03;
        String str = this.A00.A01;
        C6531EDd c6531EDd = this.A02;
        C7384Etj.A0Y(str, 0);
        try {
            try {
                absolutePath = file.getCanonicalPath();
                C7384Etj.A0X(absolutePath);
            } catch (IOException unused) {
                absolutePath = file.getAbsolutePath();
                C7384Etj.A0X(absolutePath);
            }
            JSONObject jSONObjectAh0 = c6531EDd.Ah0();
            if (str.length() != 0) {
                jSONObjectAh0.put("feature_name", str);
            }
            eDg.A01.A01(absolutePath, jSONObjectAh0);
        } catch (JSONException unused2) {
        }
    }
}
