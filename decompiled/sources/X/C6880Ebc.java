package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: X.Ebc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6880Ebc implements Closeable {
    public static final Logger A03;
    public final InterfaceC6831Eaj A00;
    public final C6882Ebe A01;
    public final C6890Ebm A02;

    /* JADX WARN: Code restructure failed: missing block: B:285:0x0491, code lost:
    
        throw A01("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ff, code lost:
    
        if (r20 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0101, code lost:
    
        r12.A06(X.AbstractC6843Eav.A03, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(X.C6908Ec5 r19, boolean r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6880Ebc.A03(X.Ec5, boolean):boolean");
    }

    static {
        Logger loggerA1B = BV5.A1B(EGW.class);
        C7384Etj.A0U(loggerA1B);
        A03 = loggerA1B;
    }

    public static final int A00(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw BV4.A0K(FGI.A0T("PROTOCOL_ERROR padding ", " > remaining length ", i3, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x012d, code lost:
    
        throw X.C7384Etj.A0C(java.lang.Integer.valueOf(r1), "Invalid dynamic table size update ");
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<X.C6897Ebt> A02(int r3, int r4, int r5, int r6) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6880Ebc.A02(int, int, int, int):java.util.List");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    public C6880Ebc(InterfaceC6831Eaj interfaceC6831Eaj) {
        this.A00 = interfaceC6831Eaj;
        C6890Ebm c6890Ebm = new C6890Ebm(interfaceC6831Eaj);
        this.A02 = c6890Ebm;
        this.A01 = new C6882Ebe(c6890Ebm);
    }

    public static IOException A01(String str, int i) {
        return new IOException(C7384Etj.A0J(str, Integer.valueOf(i)));
    }
}
