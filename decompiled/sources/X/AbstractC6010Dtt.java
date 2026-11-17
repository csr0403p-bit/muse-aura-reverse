package X;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Dtt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6010Dtt<T> extends AbstractC6011Dtu {
    public Handler A00;
    public CXB A01;
    public final HashMap<T, C6016Dtz<T>> A02 = BV4.A0u();

    @Override // X.AbstractC6011Dtu
    public void A0B() {
        HashMap<T, C6016Dtz<T>> map = this.A02;
        Iterator itA0x = BV5.A0x(map);
        while (itA0x.hasNext()) {
            C6016Dtz c6016Dtz = (C6016Dtz) itA0x.next();
            InterfaceC6009Dts interfaceC6009Dts = c6016Dtz.A02;
            interfaceC6009Dts.AaJ(c6016Dtz.A01);
            C6012Dtv c6012Dtv = c6016Dtz.A00;
            interfaceC6009Dts.Aap(c6012Dtv);
            interfaceC6009Dts.Aao(c6012Dtv);
        }
        map.clear();
    }

    @Override // X.AbstractC6011Dtu
    public void A0C(CXB cxb) {
        this.A01 = cxb;
        this.A00 = C1G.A02(null);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/Dts;)V */
    public final void A0D(InterfaceC6009Dts interfaceC6009Dts, final Object obj) {
        HashMap<T, C6016Dtz<T>> map = this.A02;
        C1G.A07(!map.containsKey(obj));
        InterfaceC6025DuK interfaceC6025DuK = new InterfaceC6025DuK() { // from class: X.DuG
            /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
            /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException] */
            @Override // X.InterfaceC6025DuK
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void AW1(androidx.media3.common.Timeline r15, X.InterfaceC6009Dts r16) {
                /*
                    Method dump skipped, instructions count: 304
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.DuG.AW1(androidx.media3.common.Timeline, X.Dts):void");
            }
        };
        C6012Dtv c6012Dtv = new C6012Dtv(this, obj);
        map.put(obj, new C6016Dtz<>(c6012Dtv, interfaceC6025DuK, interfaceC6009Dts));
        Handler handler = this.A00;
        handler.getClass();
        interfaceC6009Dts.A3W(handler, c6012Dtv);
        Handler handler2 = this.A00;
        handler2.getClass();
        CopyOnWriteArrayList<C6023DuI> copyOnWriteArrayList = ((AbstractC6011Dtu) interfaceC6009Dts).A03.A02;
        C6023DuI c6023DuI = new C6023DuI();
        c6023DuI.A00 = handler2;
        c6023DuI.A01 = c6012Dtv;
        copyOnWriteArrayList.add(c6023DuI);
        CXB cxb = this.A01;
        E6Y e6y = super.A00;
        C1G.A05(e6y);
        interfaceC6009Dts.AYS(cxb, e6y, interfaceC6025DuK);
        if (!this.A05.isEmpty()) {
            return;
        }
        interfaceC6009Dts.A91(interfaceC6025DuK);
    }

    @Override // X.InterfaceC6009Dts
    public void AQS() {
        Iterator itA0x = BV5.A0x(this.A02);
        while (itA0x.hasNext()) {
            ((C6016Dtz) itA0x.next()).A02.AQS();
        }
    }
}
