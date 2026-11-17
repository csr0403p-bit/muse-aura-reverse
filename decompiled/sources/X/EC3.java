package X;

import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public final class EC3 extends EBt<Bitmap> implements InterfaceC6522EBw {
    @Override // X.EBt
    public final /* bridge */ /* synthetic */ Bitmap A01(EBu<Bitmap> eBu) {
        C7384Etj.A0Y(eBu, 0);
        Bitmap bitmap = (Bitmap) super.A01(eBu);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }
}
