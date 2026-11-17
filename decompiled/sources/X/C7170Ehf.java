package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.Ehf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7170Ehf implements InterfaceC7136Egs {
    public final C7169Ehe A00;

    public C7170Ehf(C7169Ehe c7169Ehe) {
        this.A00 = c7169Ehe;
    }

    @Override // X.InterfaceC7136Egs
    public final Drawable createDrawable(Resources resources, InterfaceC7064EfB interfaceC7064EfB, C7197Ei9 c7197Ei9) {
        InterfaceC7173Ehi interfaceC7173Ehi;
        EhK ehK;
        AnonymousClass005.A0x(resources, interfaceC7064EfB, c7197Ei9);
        C7169Ehe c7169Ehe = this.A00;
        if (!(interfaceC7064EfB instanceof C7150EhL)) {
            return null;
        }
        if (c7169Ehe instanceof InterfaceC7136Egs) {
            return c7169Ehe.createDrawable(resources, interfaceC7064EfB, c7197Ei9);
        }
        C7150EhL c7150EhL = (C7150EhL) interfaceC7064EfB;
        synchronized (interfaceC7064EfB) {
            EhK ehK2 = c7150EhL.A00;
            interfaceC7173Ehi = ehK2 == null ? null : ehK2.A02;
        }
        synchronized (interfaceC7064EfB) {
            ehK = c7150EhL.A00;
        }
        ehK.getClass();
        C7277Ek3 c7277Ek3A00 = C7169Ehe.A00(interfaceC7173Ehi != null ? interfaceC7173Ehi.getAnimatedBitmapConfig() : null, c7169Ehe, null, ehK);
        return AnonymousClass001.A1X(c7169Ehe.A02.get()) ? new C7280Ek6(c7277Ek3A00) : new C7279Ek5(c7277Ek3A00);
    }
}
