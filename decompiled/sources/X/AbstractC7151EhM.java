package X;

import android.graphics.Bitmap;

/* renamed from: X.EhM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7151EhM {
    /* JADX WARN: Incorrect types in method signature: (IILandroid/graphics/Bitmap$Config;)LX/EfF<Landroid/graphics/Bitmap;>; */
    public final EfF A00(Bitmap.Config config, int i, int i2) {
        C7054Ef0 c7054Ef0 = (C7054Ef0) this;
        C7384Etj.A0Y(config, 2);
        C7069EfP c7069EfP = c7054Ef0.A00;
        Bitmap bitmapA01 = c7054Ef0.A01(i, i2, config);
        EfF efF = bitmapA01 != null ? new EfF(c7069EfP.A00, c7054Ef0.A01, bitmapA01) : null;
        C7384Etj.A0U(efF);
        return efF;
    }
}
