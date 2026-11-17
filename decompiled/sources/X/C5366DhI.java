package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* renamed from: X.DhI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5366DhI implements Handler.Callback {
    public C5580Dky A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC5538DkF A05;
    public final DhB A07;
    public final TreeMap<Long, Long> A08 = new TreeMap<>();
    public final Handler A04 = C1G.A02(this);
    public final C5550DkT A06 = new C5550DkT();

    public static void A00(C5366DhI c5366DhI, String str) {
        if (c5366DhI.A01) {
            c5366DhI.A02 = true;
            c5366DhI.A01 = false;
            C5358Dh3 c5358Dh3 = ((Dh6) c5366DhI.A07).A00;
            c5358Dh3.A08.removeCallbacks(c5358Dh3.A0W);
            C5358Dh3.A06(c5358Dh3, str);
        }
    }

    public final void A01(String str) {
        C5358Dh3 c5358Dh3 = ((Dh6) this.A07).A00;
        if (c5358Dh3.A0G) {
            return;
        }
        C5423DiJ c5423DiJ = c5358Dh3.A0S;
        if (c5423DiJ.A18) {
            c5358Dh3.A0G = true;
            if (c5423DiJ.A0J <= 0 || c5358Dh3.A0J) {
                c5358Dh3.A08.removeCallbacks(c5358Dh3.A0W);
                C5358Dh3.A06(c5358Dh3, str);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C5358Dh3 c5358Dh3;
        InterfaceC5344Dgn interfaceC5344Dgn;
        if (!this.A03) {
            int i = message.what;
            if (i != 1) {
                if (i == 1001) {
                    C5372DhO c5372DhO = (C5372DhO) message.obj;
                    DhB dhB = this.A07;
                    final Uri uri = c5372DhO.A00;
                    final String str = c5372DhO.A01;
                    c5358Dh3 = ((Dh6) dhB).A00;
                    interfaceC5344Dgn = new InterfaceC5344Dgn() { // from class: X.DhK
                        @Override // X.InterfaceC5344Dgn
                        public final void accept(Object obj) {
                            Uri uri2 = uri;
                            String str2 = str;
                            C5358Dh3 c5358Dh32 = C5358Dh3.$redex_init_class;
                            ((InterfaceC5369DhL) obj).onLiveTraceEventMessage(uri2, str2);
                        }
                    };
                } else {
                    if (i != 1004) {
                        return false;
                    }
                    Object[] objArr = (Object[]) message.obj;
                    DhB dhB2 = this.A07;
                    final byte[] bArr = (byte[]) objArr[0];
                    final String str2 = (String) objArr[1];
                    final long jA05 = C3cG.A05(objArr[2]);
                    c5358Dh3 = ((Dh6) dhB2).A00;
                    interfaceC5344Dgn = new InterfaceC5344Dgn() { // from class: X.DhJ
                        @Override // X.InterfaceC5344Dgn
                        public final void accept(Object obj) {
                            byte[] bArr2 = bArr;
                            String str3 = str2;
                            long j = jA05;
                            C5358Dh3 c5358Dh32 = C5358Dh3.$redex_init_class;
                            ((InterfaceC5369DhL) obj).onImfEventEmsgReceived(bArr2, str3, j);
                        }
                    };
                }
                C6013Dtw c6013Dtw = c5358Dh3.A0B;
                if (c6013Dtw == null) {
                    c6013Dtw = new C6013Dtw(null, ((AbstractC6011Dtu) c5358Dh3).A04.A02, 0);
                    c5358Dh3.A0B = c6013Dtw;
                }
                c6013Dtw.A06(new C7577F4q(interfaceC5344Dgn, 2));
                return true;
            }
            C5373DhP c5373DhP = (C5373DhP) message.obj;
            long j = c5373DhP.A00;
            long j2 = c5373DhP.A01;
            TreeMap<Long, Long> treeMap = this.A08;
            Long lValueOf = Long.valueOf(j2);
            Number numberA0j = BV6.A0j(lValueOf, treeMap);
            if (numberA0j == null || numberA0j.longValue() > j) {
                BV4.A1F(lValueOf, treeMap, j);
            }
        }
        return true;
    }

    public C5366DhI(InterfaceC5538DkF interfaceC5538DkF, DhB dhB, C5580Dky c5580Dky) {
        this.A00 = c5580Dky;
        this.A07 = dhB;
        this.A05 = interfaceC5538DkF;
    }
}
