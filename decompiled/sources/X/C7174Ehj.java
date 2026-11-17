package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Ehj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7174Ehj implements InterfaceC7136Egs {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.Ehk, X.EkU] */
    @Override // X.InterfaceC7136Egs
    public final Drawable createDrawable(Resources resources, InterfaceC7064EfB interfaceC7064EfB, C7197Ei9 c7197Ei9) {
        BitmapDrawable bitmapDrawable;
        int i;
        AnonymousClass005.A0x(resources, interfaceC7064EfB, c7197Ei9);
        C7267Ejs.A00();
        if (!(interfaceC7064EfB instanceof AbstractC7067EfE)) {
            return null;
        }
        AbstractC7067EfE abstractC7067EfE = (AbstractC7067EfE) interfaceC7064EfB;
        C7384Etj.A0Y(abstractC7067EfE, 1);
        Bitmap bitmap = abstractC7067EfE.A04;
        if (bitmap == null) {
            return null;
        }
        C7177Ehm c7177Ehm = ((AbstractC7191Ei2) c7197Ei9).A04;
        Boolean bool = true;
        if (!bool.equals(abstractC7067EfE.mExtras.get("is_rounded")) ? c7177Ehm == null : c7177Ehm == null) {
            ?? c7303EkU = new C7303EkU(resources, bitmap);
            c7303EkU.AeL(c7177Ehm.A00);
            bitmapDrawable = c7303EkU;
        } else {
            bitmapDrawable = new BitmapDrawable(resources, bitmap);
        }
        int i2 = abstractC7067EfE.A02;
        return ((i2 == 0 || i2 == -1) && ((i = abstractC7067EfE.A01) == 1 || i == 0)) ? bitmapDrawable : new C7243EjE(bitmapDrawable, i2, abstractC7067EfE.A01);
    }
}
