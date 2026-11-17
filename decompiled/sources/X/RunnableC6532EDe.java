package X;

import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EDe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC6532EDe implements Runnable {
    public static final String __redex_internal_original_name = "DefaultStaleRemovalPluginController$onPathRequested$1";
    public final /* synthetic */ EDW A00;
    public final /* synthetic */ EDf<T> A01;
    public final /* synthetic */ C6533EDj A02;
    public final /* synthetic */ File A03;

    /* JADX WARN: Incorrect types in method signature: (Ljava/io/File;LX/EDf<TT;>;LX/EDW;LX/EDj;)V */
    public RunnableC6532EDe(EDW edw, EDf eDf, C6533EDj c6533EDj, File file) {
        this.A03 = file;
        this.A01 = eDf;
        this.A00 = edw;
        this.A02 = c6533EDj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, IOException {
        String absolutePath;
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = this.A03;
        file.setLastModified(jCurrentTimeMillis);
        EDf<T> eDf = this.A01;
        String str = this.A00.A01;
        C6533EDj c6533EDj = this.A02;
        long jA04 = BV4.A04(jCurrentTimeMillis);
        C7384Etj.A0Y(str, 0);
        try {
            try {
                absolutePath = file.getCanonicalPath();
                C7384Etj.A0X(absolutePath);
            } catch (IOException unused) {
                absolutePath = file.getAbsolutePath();
                C7384Etj.A0X(absolutePath);
            }
            JSONObject jSONObjectAh0 = c6533EDj.Ah0();
            if (str.length() != 0) {
                jSONObjectAh0.put("feature_name", str);
            }
            jSONObjectAh0.put("usage_timestamp_s", jA04);
            eDf.A01.A01(absolutePath, jSONObjectAh0);
        } catch (JSONException unused2) {
        }
    }
}
