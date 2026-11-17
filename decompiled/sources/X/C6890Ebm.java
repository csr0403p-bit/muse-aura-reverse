package X;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.Ebm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6890Ebm implements InterfaceC6834Eam {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final InterfaceC6831Eaj A05;

    @Override // X.InterfaceC6834Eam
    public final long AZ7(C6818EaW c6818EaW, long j) throws IOException {
        int i;
        int i2;
        C7384Etj.A0Y(c6818EaW, 0);
        do {
            int i3 = this.A01;
            InterfaceC6831Eaj interfaceC6831Eaj = this.A05;
            if (i3 == 0) {
                interfaceC6831Eaj.Afk(this.A03);
                this.A03 = 0;
                if ((this.A00 & 4) == 0) {
                    i = this.A04;
                    byte[] bArr = AbstractC6843Eav.A06;
                    int i4 = (interfaceC6831Eaj.readByte() & 255) | ((interfaceC6831Eaj.readByte() & 255) << 16) | ((interfaceC6831Eaj.readByte() & 255) << 8);
                    this.A01 = i4;
                    this.A02 = i4;
                    int i5 = interfaceC6831Eaj.readByte() & 255;
                    this.A00 = interfaceC6831Eaj.readByte() & 255;
                    Logger logger = C6880Ebc.A03;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(EGW.A00.A00(this.A04, this.A02, i5, this.A00, true));
                    }
                    i2 = interfaceC6831Eaj.readInt() & Integer.MAX_VALUE;
                    this.A04 = i2;
                    if (i5 != 9) {
                        throw BV4.A0K(FGI.A08(i5, " != TYPE_CONTINUATION"));
                    }
                }
            } else {
                long jAZ7 = interfaceC6831Eaj.AZ7(c6818EaW, Math.min(j, i3));
                if (jAZ7 != -1) {
                    this.A01 -= (int) jAZ7;
                    return jAZ7;
                }
            }
            return -1L;
        } while (i2 == i);
        throw BV4.A0K("TYPE_CONTINUATION streamId changed");
    }

    @Override // X.InterfaceC6834Eam, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // X.InterfaceC6834Eam
    public final C6848Eb1 Ags() {
        return this.A05.Ags();
    }

    public C6890Ebm(InterfaceC6831Eaj interfaceC6831Eaj) {
        this.A05 = interfaceC6831Eaj;
    }
}
