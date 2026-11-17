package X;

import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class E20 implements InterfaceC5458Dit {
    public static final int[] A0G = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] A0H = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] A0I;
    public static final byte[] A0J;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public InterfaceC6413E4p A07;
    public InterfaceC5509Djl A08;
    public InterfaceC5563Dkg A09;
    public InterfaceC5563Dkg A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final byte[] A0E;
    public final InterfaceC5563Dkg A0F;

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    static {
        Charset charset = StandardCharsets.UTF_8;
        A0I = "#!AMR\n".getBytes(charset);
        A0J = "#!AMR-WB\n".getBytes(charset);
    }

    private boolean A00(E2K e2k) {
        byte[] bArr = A0I;
        e2k.AbN();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        e2k.AXi(bArr2, 0, length);
        if (Arrays.equals(bArr2, bArr)) {
            this.A0D = false;
        } else {
            bArr = A0J;
            e2k.AbN();
            int length2 = bArr.length;
            byte[] bArr3 = new byte[length2];
            e2k.AXi(bArr3, 0, length2);
            if (!Arrays.equals(bArr3, bArr)) {
                return false;
            }
            this.A0D = true;
        }
        e2k.Afm(bArr.length);
        return true;
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        this.A07 = interfaceC6413E4p;
        InterfaceC5563Dkg interfaceC5563DkgAhC = interfaceC6413E4p.AhC(0, 1);
        this.A0A = interfaceC5563DkgAhC;
        this.A09 = interfaceC5563DkgAhC;
        interfaceC6413E4p.AAe();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[Catch: EOFException -> 0x015d, TryCatch #0 {EOFException -> 0x015d, blocks: (B:18:0x005f, B:20:0x006d, B:24:0x0077, B:36:0x008e, B:38:0x0092, B:41:0x009c, B:49:0x00be, B:50:0x00c6, B:46:0x00b1, B:47:0x00b3, B:45:0x00ae, B:48:0x00b8), top: B:89:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AZ4(X.E2K r20, X.C5542DkK r21) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E20.AZ4(X.E2K, X.DkK):int");
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        this.A04 = 0L;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = j2;
        InterfaceC5509Djl interfaceC5509Djl = this.A08;
        if (!(interfaceC5509Djl instanceof E23)) {
            if (j == 0 || !(interfaceC5509Djl instanceof E28)) {
                this.A06 = 0L;
                return;
            } else {
                this.A06 = ((E28) interfaceC5509Djl).A00(j);
                return;
            }
        }
        long jA00 = ((E23) interfaceC5509Djl).A00(j);
        this.A06 = jA00;
        if (BV6.A0J(this.A05, jA00) >= 20000) {
            this.A0C = true;
            this.A09 = this.A0F;
        }
    }

    public E20(int i) {
        this.A0E = new byte[1];
        this.A02 = -1;
        C5551DkU c5551DkU = new C5551DkU();
        this.A0F = c5551DkU;
        this.A09 = c5551DkU;
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        return A00(e2k);
    }

    public E20() {
        this(0);
    }
}
