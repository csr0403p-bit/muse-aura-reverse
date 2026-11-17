package X;

import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public final class EC4 implements InterfaceC6522EBw {
    @Override // X.InterfaceC6523EBx, X.InterfaceC3587CVm
    public final /* bridge */ /* synthetic */ void Aa9(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C7384Etj.A0Y(bitmap, 0);
        bitmap.recycle();
    }

    @Override // X.ECU
    public final void AhS(ECR ecr) {
    }

    @Override // X.InterfaceC6523EBx
    public final /* bridge */ /* synthetic */ Bitmap get(int i) {
        return C7384Etj.A07(i);
    }
}
