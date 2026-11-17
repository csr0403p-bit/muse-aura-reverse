package androidx.media3.extractor.ogg;

import X.AbstractC6357E2j;
import X.AbstractC6395E3x;
import X.BV4;
import X.BV6;
import X.C6383E3k;
import X.C6392E3u;
import X.C6393E3v;
import X.E1P;
import X.E2K;
import X.E39;
import X.E3C;
import X.InterfaceC5458Dit;
import X.InterfaceC6413E4p;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes5.dex */
public final class OggExtractor implements InterfaceC5458Dit {
    public InterfaceC6413E4p A00;
    public AbstractC6395E3x A01;
    public boolean A02;

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    private boolean A00(E2K e2k) {
        AbstractC6395E3x e39;
        C6392E3u c6392E3u = new C6392E3u();
        if (c6392E3u.A01(e2k, true) && (c6392E3u.A03 & 2) == 2) {
            int iMin = Math.min(c6392E3u.A00, 8);
            E1P e1pA0Y = BV6.A0Y(iMin);
            E2K.A01(e1pA0Y, e2k, iMin);
            e1pA0Y.A0R(0);
            if (e1pA0Y.A04() >= 5 && e1pA0Y.A0A() == 127 && e1pA0Y.A0H() == 1179402563) {
                e39 = new E3C();
            } else {
                e1pA0Y.A0R(0);
                if (AbstractC6357E2j.A02(e1pA0Y, 1, true)) {
                    e39 = new C6383E3k();
                } else {
                    e1pA0Y.A0R(0);
                    if (E39.A00(e1pA0Y, E39.A02)) {
                        e39 = new E39();
                    }
                }
            }
            this.A01 = e39;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:278:0x068f, code lost:
    
        r1 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0699, code lost:
    
        throw X.BV6.A0V(r1, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05e5  */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AZ4(X.E2K r24, X.C5542DkK r25) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ogg.OggExtractor.AZ4(X.E2K, X.DkK):int");
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        AbstractC6395E3x abstractC6395E3x = this.A01;
        if (abstractC6395E3x != null) {
            C6393E3v c6393E3v = abstractC6395E3x.A0C;
            C6392E3u c6392E3u = c6393E3v.A03;
            c6392E3u.A03 = 0;
            c6392E3u.A04 = 0L;
            c6392E3u.A02 = 0;
            c6392E3u.A01 = 0;
            c6392E3u.A00 = 0;
            c6393E3v.A02.A0P(0);
            c6393E3v.A00 = -1;
            c6393E3v.A01 = false;
            if (j == 0) {
                abstractC6395E3x.A01(!abstractC6395E3x.A0B);
            } else if (abstractC6395E3x.A01 != 0) {
                long jA05 = BV4.A05(abstractC6395E3x.A00 * j2);
                abstractC6395E3x.A05 = jA05;
                abstractC6395E3x.A08.AgJ(jA05);
                abstractC6395E3x.A01 = 2;
            }
        }
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        this.A00 = interfaceC6413E4p;
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        try {
            return A00(e2k);
        } catch (ParserException unused) {
            return false;
        }
    }
}
