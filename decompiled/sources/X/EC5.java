package X;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes5.dex */
public final class EC5 implements InterfaceC6522EBw {
    public final Set<Bitmap> A00;

    @Override // X.InterfaceC6523EBx, X.InterfaceC3587CVm
    public final /* bridge */ /* synthetic */ void Aa9(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C7384Etj.A0Y(bitmap, 0);
        this.A00.remove(bitmap);
        bitmap.recycle();
    }

    public EC5() {
        Set<Bitmap> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        C7384Etj.A0U(setNewSetFromMap);
        this.A00 = setNewSetFromMap;
    }

    @Override // X.ECU
    public final void AhS(ECR ecr) {
    }

    @Override // X.InterfaceC6523EBx
    public final /* bridge */ /* synthetic */ Bitmap get(int i) {
        Bitmap bitmapA07 = C7384Etj.A07(i);
        this.A00.add(bitmapA07);
        return bitmapA07;
    }
}
