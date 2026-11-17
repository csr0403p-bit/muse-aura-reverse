package X;

import android.os.SystemClock;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes5.dex */
public abstract class DEE implements DDj {
    public int A00;
    public int A01;
    public long A02;
    public long A06;
    public long A07;
    public long A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final E7C A0E;
    public final InterfaceC4913DEg A0F;
    public long A04 = -1;
    public long A05 = -1;
    public long A03 = -1;

    @Override // X.DDj
    public final void ATL(DEK dek, long j, long j2, long j3) {
    }

    @Override // X.DDj
    public final /* synthetic */ void AVB() {
    }

    @Override // X.DDj
    public final void AWg() {
        A00(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: NumberFormatException -> 0x00fc, TryCatch #1 {NumberFormatException -> 0x00fc, blocks: (B:18:0x003c, B:20:0x0041, B:21:0x004c, B:23:0x0059, B:24:0x005d, B:26:0x0063, B:28:0x0069, B:29:0x006d, B:32:0x0081, B:34:0x008f, B:35:0x0093, B:37:0x0099, B:39:0x009f, B:40:0x00a3, B:42:0x00ab, B:44:0x00af, B:45:0x00b4, B:47:0x00ba, B:51:0x00cb, B:53:0x00d3, B:55:0x00d9, B:57:0x00e3, B:59:0x00eb, B:61:0x00f1, B:62:0x00f9, B:49:0x00c6, B:30:0x007c), top: B:75:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: NumberFormatException -> 0x00fc, TryCatch #1 {NumberFormatException -> 0x00fc, blocks: (B:18:0x003c, B:20:0x0041, B:21:0x004c, B:23:0x0059, B:24:0x005d, B:26:0x0063, B:28:0x0069, B:29:0x006d, B:32:0x0081, B:34:0x008f, B:35:0x0093, B:37:0x0099, B:39:0x009f, B:40:0x00a3, B:42:0x00ab, B:44:0x00af, B:45:0x00b4, B:47:0x00ba, B:51:0x00cb, B:53:0x00d3, B:55:0x00d9, B:57:0x00e3, B:59:0x00eb, B:61:0x00f1, B:62:0x00f9, B:49:0x00c6, B:30:0x007c), top: B:75:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0106 A[EDGE_INSN: B:83:0x0106->B:65:0x0106 BREAK  A[LOOP:1: B:31:0x007f->B:62:0x00f9], SYNTHETIC] */
    @Override // X.InterfaceC4897DDq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AWj(java.lang.String r12, java.lang.Object r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DEE.AWj(java.lang.String, java.lang.Object):void");
    }

    @Override // X.CXB
    public final void AWm(C1J c1j, C1O c1o, boolean z) {
        C7384Etj.A0Y(c1o, 1);
        this.A0D = C4890DDe.A00(c1o).A0Y;
        this.A08 = SystemClock.elapsedRealtime();
    }

    @Override // X.CXB
    public final void AS2(C1J c1j, C1O c1o, int i, boolean z) {
        int i2;
        int i3 = this.A01 + i;
        this.A01 = i3;
        if (this.A06 > 0 || !this.A0D || (i2 = this.A00) <= 0 || i3 < i2) {
            return;
        }
        this.A06 = SystemClock.elapsedRealtime();
        this.A09 = true;
    }

    @Override // X.CXB
    public final void AWh(C1J c1j, C1O c1o, boolean z) {
        if (this.A07 != 0) {
            A00(false);
        }
    }

    @Override // X.DDj
    public final void AWi(IOException iOException) {
        if (this.A07 != 0) {
            A00(true);
        }
    }

    public DEE(E7C e7c, InterfaceC4913DEg interfaceC4913DEg, boolean z) {
        this.A0E = e7c;
        this.A0F = interfaceC4913DEg;
        this.A0C = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(boolean r33) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DEE.A00(boolean):void");
    }

    @Override // X.DDj
    public final void AWl(C1O c1o, DEK dek) {
        AnonymousClass003.A0u(c1o, dek);
        String string = c1o.A06.toString();
        C4890DDe.A00(c1o);
        C4890DDe.A00(c1o);
        C4890DDe.A00(c1o);
        C4890DDe.A00(c1o);
        C4890DDe.A00(c1o);
        C4890DDe.A00(c1o);
        C4890DDe.A00(c1o);
        C4890DDe.A00(c1o);
        boolean z = C4890DDe.A00(c1o).A0a;
        try {
            new URL(string);
        } catch (MalformedURLException e) {
            BzX.A01("DefaultFbTransferListener", e, FGI.A0M("Failed to parse URL: ", string));
        }
        this.A0A = AnonymousClass006.A1Z(dek, DEK.NOT_CACHED);
        this.A07 = SystemClock.elapsedRealtime();
        this.A0B = z;
    }

    @Override // X.DDj
    public final void AdA(long j) {
    }

    @Override // X.DDj
    public final void AdN(String str) {
    }

    @Override // X.DDj
    public final /* synthetic */ void AdZ(boolean z) {
    }

    @Override // X.DDj
    public final void ATM(long j, long j2) {
    }

    @Override // X.CXB
    public final void AWk(C1J c1j, C1O c1o, boolean z) {
    }
}
