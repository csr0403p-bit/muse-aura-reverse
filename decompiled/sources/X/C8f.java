package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.io.File;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class C8f {
    public C70 A00;
    public final Context A01;
    public final Handler A02;
    public final C6D A03;
    public final String A04;
    public final String A05;

    public final String A00() {
        Context context = this.A01;
        AnonymousClass003.A0u(context, C94.A00);
        File fileA00 = AbstractC3416CMe.A00(context, 194178138);
        fileA00.mkdirs();
        try {
            return C3cG.A0O(fileA00, this.A04.replace('.', '_').replace(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR, '_')).getCanonicalPath();
        } catch (IOException e) {
            C2Q.A00().AT9("SigquitTimeFilePath", e, null);
            return null;
        }
    }

    public C8f(Context context, Handler handler, C70 c70, C6D c6d, String str, String str2) {
        this.A01 = context;
        this.A04 = str;
        this.A03 = c6d;
        this.A00 = c70;
        this.A02 = handler;
        this.A05 = str2;
    }
}
