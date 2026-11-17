package X;

import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Ebb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6879Ebb implements Closeable {
    public static final C6917EcN A0R;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public C6917EcN A09;
    public boolean A0A;
    public long A0B;
    public long A0C;
    public final String A0D;
    public final Socket A0E;
    public final Set<Integer> A0G;
    public final C6922EcV A0H;
    public final C6922EcV A0I;
    public final C6922EcV A0J;
    public final C6920EcT A0K;
    public final AbstractC6930Ecd A0L;
    public final C6908Ec5 A0M;
    public final C6873EbV A0N;
    public final InterfaceC6933Ech A0O;
    public final C6917EcN A0P;
    public final boolean A0Q = true;
    public final Map<Integer, C6878Eba> A0F = C3cG.A0j();

    public final synchronized C6878Eba A01(int i) {
        return (C6878Eba) BV5.A0f(this.A0F, i);
    }

    public final synchronized C6878Eba A02(int i) {
        C6878Eba c6878EbaRemove;
        c6878EbaRemove = this.A0F.remove(Integer.valueOf(i));
        notifyAll();
        return c6878EbaRemove;
    }

    public final synchronized void A03(long j) {
        long j2 = this.A0C + j;
        this.A0C = j2;
        long j3 = j2 - this.A0B;
        if (j3 >= this.A0P.A00() / 2) {
            this.A0J.A02(new EcD(AnonymousClass001.A0v("] windowUpdate", BV8.A15(this, 0)), this, 0, j3));
            this.A0B += j3;
        }
    }

    public final void A04(IOException iOException, Ec2 ec2, Ec2 ec22) throws IOException {
        int i;
        Object[] array;
        byte[] bArr = AbstractC6843Eav.A06;
        try {
            A00(ec2, this);
        } catch (IOException unused) {
        }
        synchronized (this) {
            Map<Integer, C6878Eba> map = this.A0F;
            if (map.isEmpty()) {
                array = null;
            } else {
                array = map.values().toArray(new C6878Eba[0]);
                if (array == null) {
                    throw BV6.A0h();
                }
                map.clear();
            }
        }
        C6878Eba[] c6878EbaArr = (C6878Eba[]) array;
        if (c6878EbaArr != null) {
            for (C6878Eba c6878Eba : c6878EbaArr) {
                try {
                    c6878Eba.A05(iOException, ec22);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.A0N.close();
        } catch (IOException unused3) {
        }
        try {
            this.A0E.close();
        } catch (IOException unused4) {
        }
        this.A0J.A01();
        this.A0H.A01();
        this.A0I.A01();
    }

    static {
        C6917EcN c6917EcN = new C6917EcN();
        c6917EcN.A01(7, 65535);
        c6917EcN.A01(5, 16384);
        A0R = c6917EcN;
    }

    public static final void A00(Ec2 ec2, C6879Ebb c6879Ebb) {
        C6873EbV c6873EbV = c6879Ebb.A0N;
        synchronized (c6873EbV) {
            synchronized (c6879Ebb) {
                try {
                    if (!c6879Ebb.A0A) {
                        c6879Ebb.A0A = true;
                        int i = c6879Ebb.A00;
                        byte[] bArr = AbstractC6843Eav.A06;
                        try {
                            if (c6873EbV.A01) {
                                throw BV4.A0J();
                            }
                            if (ec2.httpCode == -1) {
                                throw C60O.A0i("errorCode.httpCode == -1");
                            }
                            C6873EbV.A00(c6873EbV, 0, 8, 7, 0);
                            EcA ecA = c6873EbV.A04;
                            ecA.Ain(i);
                            ecA.Ain(ec2.httpCode);
                            ecA.flush();
                        } catch (Throwable th) {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void A05(Ec2 ec2, int i) {
        this.A0J.A02(new DHN(AnonymousClass001.A0v("] writeSynReset", BV8.A15(this, i)), ec2, this, i));
    }

    public final void A06(boolean z, int i, int i2) throws IOException {
        try {
            C6873EbV c6873EbV = this.A0N;
            synchronized (c6873EbV) {
                if (c6873EbV.A01) {
                    throw BV4.A0J();
                }
                C6873EbV.A00(c6873EbV, 0, 8, 6, z ? 1 : 0);
                EcA ecA = c6873EbV.A04;
                ecA.Ain(i);
                ecA.Ain(i2);
                ecA.flush();
            }
        } catch (IOException e) {
            Ec2 ec2 = Ec2.PROTOCOL_ERROR;
            A04(e, ec2, ec2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        A04(null, Ec2.NO_ERROR, Ec2.CANCEL);
    }

    public C6879Ebb(String str, Socket socket, C6920EcT c6920EcT, AbstractC6930Ecd abstractC6930Ecd, InterfaceC6933Ech interfaceC6933Ech, EcA ecA, InterfaceC6831Eaj interfaceC6831Eaj) {
        this.A0L = abstractC6930Ecd;
        if (str == null) {
            C7384Etj.A0b("connectionName");
            throw F60.createAndThrow();
        }
        this.A0D = str;
        this.A01 = 3;
        this.A0K = c6920EcT;
        this.A0J = c6920EcT.A01();
        this.A0H = c6920EcT.A01();
        this.A0I = c6920EcT.A01();
        this.A0O = interfaceC6933Ech;
        C6917EcN c6917EcN = new C6917EcN();
        c6917EcN.A01(7, HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES);
        this.A0P = c6917EcN;
        this.A09 = A0R;
        this.A07 = r0.A00();
        this.A0E = socket;
        this.A0N = new C6873EbV(ecA);
        this.A0M = new C6908Ec5(this, new C6880Ebc(interfaceC6831Eaj));
        this.A0G = C3cG.A0k();
    }
}
