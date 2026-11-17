package X;

import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class EDY implements Runnable {
    public static final String __redex_internal_original_name = "DefaultEvictionPluginController$onPathRequested$1";
    public final /* synthetic */ EDW A00;
    public final /* synthetic */ EDX<T> A01;
    public final /* synthetic */ C6538EDt A02;
    public final /* synthetic */ File A03;

    /* JADX WARN: Incorrect types in method signature: (LX/EDX<TT;>;LX/EDW;LX/EDt;Ljava/io/File;)V */
    public EDY(EDW edw, EDX edx, C6538EDt c6538EDt, File file) {
        this.A01 = edx;
        this.A00 = edw;
        this.A02 = c6538EDt;
        this.A03 = file;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, IOException {
        String absolutePath;
        EDX<T> edx = this.A01;
        EDW edw = this.A00;
        C6538EDt c6538EDt = this.A02;
        File file = this.A03;
        try {
            JSONObject jSONObjectA18 = BV4.A18();
            C6531EDd c6531EDd = c6538EDt.A01;
            if (c6531EDd != null) {
                jSONObjectA18.put("size_config", c6531EDd.Ah0());
            }
            C6533EDj c6533EDj = c6538EDt.A02;
            if (c6533EDj != null) {
                jSONObjectA18.put("staleness_config", c6533EDj.Ah0());
            }
            jSONObjectA18.put("eviction_type", c6538EDt.A03);
            String str = c6538EDt.A00;
            if (str != null) {
                jSONObjectA18.put("cache_name", str);
            }
            jSONObjectA18.put("feature_name", edw.A01);
            ED8 ed8 = edx.A00;
            try {
                absolutePath = file.getCanonicalPath();
                C7384Etj.A0X(absolutePath);
            } catch (IOException unused) {
                absolutePath = file.getAbsolutePath();
                C7384Etj.A0X(absolutePath);
            }
            ed8.A01(absolutePath, jSONObjectA18);
        } catch (JSONException unused2) {
        }
    }
}
