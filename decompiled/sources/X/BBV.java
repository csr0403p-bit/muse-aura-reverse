package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class BBV {
    public void A0M(BFM bfm) {
    }

    public abstract long A0S();

    public abstract C78T A0T();

    public abstract void A0U(BCN bcn, G0V<? super BFM, ? super Integer, Unit> g0v);

    public abstract boolean A0W();

    public abstract boolean A0X();

    public abstract boolean A0Y();

    public abstract boolean A0Z();

    /* JADX WARN: Incorrect types in method signature: (LX/BCN;LX/BCr;LX/AHs<LX/BBb;>;)LX/AHs<LX/BBb;>; */
    public final AbstractC0916AHs A0E(AbstractC0916AHs abstractC0916AHs, BCN bcn, InterfaceC2246BCr interfaceC2246BCr) {
        if (!(this instanceof BBH)) {
            return ((BBM) this).A07.A0W.A0E(abstractC0916AHs, bcn, interfaceC2246BCr);
        }
        BBH bbh = (BBH) this;
        try {
            BBH.A0D(bbh);
            bcn.AZm(new AGQ(abstractC0916AHs));
            BBG bbg = (BBG) bcn;
            InterfaceC2246BCr interfaceC2246BCr2 = bbg.A05;
            bbg.A05 = interfaceC2246BCr;
            try {
                BCN bcnA00 = BBH.A00(null, bcn, bbh);
                if (bcnA00 != null) {
                    BBH.A04(bcn, bbh);
                    bcnA00.A4T();
                    bcnA00.A4W();
                }
                C2254BDx<C0917AHt<BBb>> c2254BDx = bbh.A0J;
                C0917AHt<Object> c0917AHtA00 = c2254BDx.A00();
                if (c0917AHtA00 == null) {
                    c0917AHtA00 = HsU.A00;
                }
                c2254BDx.A01(null);
                return c0917AHtA00;
            } finally {
                bbg.A05 = interfaceC2246BCr2;
            }
        } catch (Throwable th) {
            bbh.A0J.A01(null);
            throw th;
        }
    }

    public final AbstractC0916AHs<BBb> A0F(BCN bcn, InterfaceC2246BCr interfaceC2246BCr, G0V<? super BFM, ? super Integer, Unit> g0v) {
        if (!(this instanceof BBH)) {
            return ((BBM) this).A07.A0W.A0F(bcn, interfaceC2246BCr, g0v);
        }
        BBH bbh = (BBH) this;
        try {
            BBG bbg = (BBG) bcn;
            InterfaceC2246BCr interfaceC2246BCr2 = bbg.A05;
            bbg.A05 = interfaceC2246BCr;
            try {
                bbh.A0U(bcn, g0v);
                C2254BDx<C0917AHt<BBb>> c2254BDx = bbh.A0J;
                C0917AHt<Object> c0917AHtA00 = c2254BDx.A00();
                if (c0917AHtA00 == null) {
                    c0917AHtA00 = HsU.A00;
                }
                c2254BDx.A01(null);
                return c0917AHtA00;
            } finally {
                bbg.A05 = interfaceC2246BCr2;
            }
        } catch (Throwable th) {
            bbh.A0J.A01(null);
            throw th;
        }
    }

    public final InterfaceC1799ArI A0G(Function0<Unit> function0) {
        if (!(this instanceof BBH)) {
            return ((BBM) this).A07.A0W.A0G(function0);
        }
        BCP bcp = ((BBH) this).A0G;
        B8q<C2240BCl> b8q = bcp.A01;
        C2240BCl c2240BCl = new C2240BCl();
        c2240BCl.A00 = function0;
        return b8q.A00(c2240BCl, bcp.A02);
    }

    public final C2239BCk A0H(C2229BBz c2229BBz) {
        C2239BCk c2239BCkA0B;
        if (!(this instanceof BBH)) {
            return ((BBM) this).A07.A0W.A0H(c2229BBz);
        }
        BBH bbh = (BBH) this;
        synchronized (bbh.A0K) {
            c2239BCkA0B = bbh.A0D.A0B(c2229BBz);
        }
        return c2239BCkA0B;
    }

    public AKQ A0I() {
        return AbstractC2235BCf.A00;
    }

    public void A0J() {
    }

    public void A0K() {
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BBz;LX/BCk;LX/Ahw<*>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[Catch: all -> 0x01b9, TryCatch #1 {, blocks: (B:6:0x000d, B:8:0x001a, B:12:0x0023, B:14:0x0027, B:20:0x003e, B:22:0x004e, B:25:0x005d, B:27:0x006e, B:28:0x0071, B:23:0x0058, B:30:0x0075, B:32:0x007f, B:34:0x008b, B:36:0x0090, B:38:0x009c, B:40:0x00a2, B:41:0x00a6, B:43:0x00b2, B:44:0x00ba, B:46:0x00bf, B:47:0x00c6, B:49:0x00cc, B:50:0x00d0, B:52:0x00d4, B:53:0x00d6, B:85:0x016b, B:92:0x018f, B:93:0x019d, B:96:0x01a5, B:56:0x00e3, B:83:0x0165, B:100:0x01b3, B:101:0x01b6, B:9:0x001d, B:11:0x0021, B:15:0x002e, B:57:0x00eb, B:59:0x00f2, B:60:0x0106, B:62:0x010a, B:64:0x010e, B:65:0x0115, B:67:0x0119, B:69:0x011d, B:70:0x0124, B:72:0x0128, B:74:0x012c, B:76:0x013b, B:77:0x013f, B:79:0x0145, B:97:0x01a8, B:98:0x01b1, B:80:0x015a, B:82:0x015e), top: B:110:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0L(X.InterfaceC1370Ahw r15, X.C2239BCk r16, X.C2229BBz r17) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBV.A0L(X.Ahw, X.BCk, X.BBz):void");
    }

    public final void A0N(BCN bcn) {
        Hm1 hm1A03;
        if (!(this instanceof BBH)) {
            BBI bbi = ((BBM) this).A07;
            BBV bbv = bbi.A0W;
            bbv.A0N(bbi.A0X);
            bbv.A0N(bcn);
            return;
        }
        BBH bbh = (BBH) this;
        synchronized (bbh.A0K) {
            C0910AHm<BCN> c0910AHm = bbh.A0I;
            if (c0910AHm.A0H(bcn)) {
                hm1A03 = null;
            } else {
                c0910AHm.A0G(bcn);
                hm1A03 = BBH.A03(bbh);
            }
        }
        if (hm1A03 != null) {
            hm1A03.resumeWith(Unit.INSTANCE);
        }
    }

    public final void A0O(BCN bcn) {
        if (!(this instanceof BBH)) {
            ((BBM) this).A07.A0W.A0O(bcn);
            return;
        }
        BBH bbh = (BBH) this;
        synchronized (bbh.A0K) {
            C0917AHt<BCN> c0917AHtA02 = bbh.A01;
            if (c0917AHtA02 == null) {
                c0917AHtA02 = C0917AHt.A02();
                bbh.A01 = c0917AHtA02;
            }
            c0917AHtA02.A0B(bcn);
        }
    }

    public final void A0P(BCN bcn) {
        if (!(this instanceof BBH)) {
            ((BBM) this).A07.A0W.A0P(bcn);
            return;
        }
        BBH bbh = (BBH) this;
        synchronized (bbh.A0K) {
            if (bbh.A0L.remove(bcn)) {
                bbh.A04 = null;
            }
            bbh.A0I.A0I(bcn);
            bbh.A0M.remove(bcn);
        }
    }

    public final void A0Q(C2229BBz c2229BBz) {
        Hm1 hm1A03;
        if (!(this instanceof BBH)) {
            ((BBM) this).A07.A0W.A0Q(c2229BBz);
            return;
        }
        BBH bbh = (BBH) this;
        synchronized (bbh.A0K) {
            C0914AHq.A01(bbh.A0C, c2229BBz.A03, c2229BBz);
            if (c2229BBz.A07 != null) {
                BBH.A07(c2229BBz, c2229BBz, bbh);
            }
            hm1A03 = BBH.A03(bbh);
        }
        if (hm1A03 != null) {
            hm1A03.resumeWith(Unit.INSTANCE);
        }
    }

    public final void A0R(BBb bBb) {
        if (!(this instanceof BBH)) {
            ((BBM) this).A07.A0W.A0R(bBb);
            return;
        }
        C2254BDx<C0917AHt<BBb>> c2254BDx = ((BBH) this).A0J;
        C0917AHt<BBb> c0917AHtA00 = c2254BDx.A00();
        if (c0917AHtA00 == null) {
            c0917AHtA00 = C0917AHt.A02();
            c2254BDx.A01(c0917AHtA00);
        }
        c0917AHtA00.A0B(bBb);
    }

    public void A0V(C2229BBz c2229BBz) {
        ((BBM) this).A07.A0W.A0V(c2229BBz);
    }
}
