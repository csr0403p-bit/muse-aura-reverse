package X;

import android.graphics.Bitmap;

/* renamed from: X.Ehn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7178Ehn {
    public C7270Ejv A00;
    public C7271Ejw A01;
    public final InterfaceC7275Ek1 A02;
    public final InterfaceC7181Ehq A03;
    public final boolean A04;

    public final boolean A00(Bitmap bitmap, int i) {
        C7384Etj.A0Y(bitmap, 1);
        try {
            this.A01.A03(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            Object[] objArr = {Integer.valueOf(i)};
            CFL cfl = AbstractC3422CMk.A00;
            if (CFL.A02(cfl)) {
                cfl.e(C7178Ehn.class.getSimpleName(), C7384Etj.A0K("Rendering of frame unsuccessful. Frame number: %d", objArr, 1), e);
            }
            return false;
        }
    }

    public C7178Ehn(InterfaceC7275Ek1 interfaceC7275Ek1, C7270Ejv c7270Ejv, boolean z) {
        this.A02 = interfaceC7275Ek1;
        this.A00 = c7270Ejv;
        this.A04 = z;
        C7179Eho c7179Eho = new C7179Eho(this);
        this.A03 = c7179Eho;
        this.A01 = new C7271Ejw(c7270Ejv, c7179Eho, z);
    }
}
