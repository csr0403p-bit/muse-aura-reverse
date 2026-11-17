package X;

import android.graphics.Bitmap;

/* renamed from: X.Ef0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7054Ef0 extends AbstractC7151EhM {
    public final C7069EfP A00;
    public final InterfaceC6522EBw A01;

    public C7054Ef0(C7069EfP c7069EfP, InterfaceC6522EBw interfaceC6522EBw) {
        C7384Etj.A0Y(interfaceC6522EBw, 0);
        this.A01 = interfaceC6522EBw;
        this.A00 = c7069EfP;
    }

    public Bitmap A01(int i, int i2, Bitmap.Config config) {
        C7384Etj.A0Y(config, 2);
        Bitmap bitmap = this.A01.get(AbstractC7386Etn.A01(config, i, i2));
        if (bitmap.getAllocationByteCount() < i * i2 * AbstractC7386Etn.A00(config)) {
            throw BV4.A0S();
        }
        bitmap.reconfigure(i, i2, config);
        return bitmap;
    }
}
