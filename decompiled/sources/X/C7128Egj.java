package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.Egj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7128Egj implements InterfaceC7136Egs {
    public final InterfaceC7136Egs[] A00;

    public C7128Egj(InterfaceC7136Egs... interfaceC7136EgsArr) {
        C7384Etj.A0Y(interfaceC7136EgsArr, 0);
        this.A00 = interfaceC7136EgsArr;
    }

    @Override // X.InterfaceC7136Egs
    public final Drawable createDrawable(Resources resources, InterfaceC7064EfB interfaceC7064EfB, C7197Ei9 c7197Ei9) {
        AnonymousClass005.A0x(resources, interfaceC7064EfB, c7197Ei9);
        for (InterfaceC7136Egs interfaceC7136Egs : this.A00) {
            Drawable drawableCreateDrawable = interfaceC7136Egs.createDrawable(resources, interfaceC7064EfB, c7197Ei9);
            if (drawableCreateDrawable != null) {
                return drawableCreateDrawable;
            }
        }
        return null;
    }
}
