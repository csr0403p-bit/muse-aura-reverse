package X;

import X.InterfaceC5590DlO;
import android.net.Uri;
import androidx.media3.common.StreamKey;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Dkx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5579Dkx<T extends InterfaceC5590DlO<T>> implements InterfaceC3126Byr<T> {
    public final InterfaceC3126Byr<? extends T> A00;
    public final List<StreamKey> A01;

    @Override // X.InterfaceC3126Byr
    public final /* bridge */ /* synthetic */ Object AXb(Uri uri, InputStream inputStream) {
        int i;
        T tAXb = this.A00.AXb(uri, inputStream);
        List<StreamKey> list = this.A01;
        if (list.isEmpty()) {
            return tAXb;
        }
        C5580Dky c5580Dky = (C5580Dky) tAXb;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey());
        ArrayList arrayListA0h = C3cG.A0h();
        long j = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= C5580Dky.A00(c5580Dky)) {
                break;
            }
            if (((StreamKey) linkedList.peek()).A01 != i2) {
                long jA02 = C5580Dky.A02(c5580Dky, i2);
                if (jA02 != -9223372036854775807L) {
                    j += jA02;
                }
            } else {
                C5585DlC c5585DlC = c5580Dky.A0R.get(i2);
                List<Dl9> list2 = c5585DlC.A03;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i3 = streamKey.A01;
                ArrayList arrayListA0h2 = C3cG.A0h();
                do {
                    int i4 = streamKey.A00;
                    Dl9 dl9A0c = BV6.A0c(list2, i4);
                    List<AbstractC5553DkW> list3 = dl9A0c.A0E;
                    ArrayList arrayListA0h3 = C3cG.A0h();
                    do {
                        arrayListA0h3.add(list3.get(streamKey.A02));
                        streamKey = (StreamKey) linkedList.poll();
                        i = streamKey.A01;
                        if (i != i3) {
                            break;
                        }
                    } while (streamKey.A00 == i4);
                    arrayListA0h2.add(Dl9.A01(dl9A0c, arrayListA0h3, dl9A0c.A05, dl9A0c.A06));
                } while (i == i3);
                linkedList.addFirst(streamKey);
                arrayListA0h.add(new C5585DlC(null, c5585DlC.A02, arrayListA0h2, c5585DlC.A04, c5585DlC.A00 - j));
            }
            i2++;
        }
        long j2 = c5580Dky.A07;
        long j3 = j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L;
        long j4 = c5580Dky.A05;
        long j5 = c5580Dky.A0A;
        boolean z = c5580Dky.A0S;
        long j6 = c5580Dky.A0B;
        long j7 = c5580Dky.A0F;
        long j8 = c5580Dky.A0E;
        long j9 = c5580Dky.A0D;
        DlK dlK = c5580Dky.A0H;
        C5354Dgx c5354Dgx = c5580Dky.A0J;
        C5361Dh8 c5361Dh8 = c5580Dky.A0I;
        Uri uri2 = c5580Dky.A0G;
        long j10 = c5580Dky.A04;
        long j11 = c5580Dky.A08;
        long j12 = c5580Dky.A06;
        long j13 = c5580Dky.A09;
        long j14 = c5580Dky.A0C;
        boolean z2 = c5580Dky.A0V;
        boolean z3 = c5580Dky.A0T;
        boolean z4 = c5580Dky.A0X;
        return new C5580Dky(uri2, dlK, c5361Dh8, c5354Dgx, c5580Dky.A0Q, c5580Dky.A0L, c5580Dky.A0O, c5580Dky.A0K, c5580Dky.A0N, c5580Dky.A0M, c5580Dky.A0P, arrayListA0h, c5580Dky.A03, j4, j3, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, c5580Dky.A00, z, z2, z3, z4, c5580Dky.A0W, c5580Dky.A0Y, c5580Dky.A0U);
    }

    public C5579Dkx(InterfaceC3126Byr<? extends T> interfaceC3126Byr, List<StreamKey> list) {
        this.A00 = interfaceC3126Byr;
        this.A01 = list;
    }
}
