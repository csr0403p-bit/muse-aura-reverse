package X;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public final class B1T implements InterfaceC2178B0w {
    public final Bitmap A00;

    @Override // X.InterfaceC2178B0w
    public final int ADt() {
        Bitmap.Config config = this.A00.getConfig();
        C7384Etj.A0X(config);
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config != Bitmap.Config.HARDWARE ? 0 : 4;
    }

    public B1T(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
