package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* loaded from: classes5.dex */
public final class EGU extends AbstractC7559F3s implements G0W<Integer, Integer, BitmapFactory.Options, Integer> {
    public EGU() {
        super(3);
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2, BitmapFactory.Options options) {
        int iA0F = AnonymousClass001.A0F(num);
        int iA0F2 = AnonymousClass001.A0F(num2);
        BitmapFactory.Options options2 = options;
        C7384Etj.A0Y(options2, 2);
        Bitmap.Config config = options2.outConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return Integer.valueOf(AbstractC7386Etn.A01(config, iA0F, iA0F2));
    }
}
