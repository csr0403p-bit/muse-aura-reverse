package X;

import com.facebook.aura.ageverification.FaceDetectionModelAssetsKt;

/* renamed from: X.C3v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3214C3v {
    public static AbstractC3214C3v A01;
    public final String A00;

    public final String A00(String str) {
        if (this instanceof C3t) {
            return FGI.A0h("lib/", ETi.A03(), "/lib_soa_", str, ".so");
        }
        if ("base".equals(str)) {
            str = "lib";
        }
        return FGI.A0d(FaceDetectionModelAssetsKt.ASSETS_DIR, str, "/libs", this.A00);
    }

    public AbstractC3214C3v(String str) {
        this.A00 = str;
    }

    public AbstractC3214C3v() {
        this.A00 = ".so";
    }
}
