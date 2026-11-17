package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.BfF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2603BfF implements InterfaceC2783Bl3 {
    public BfD A00;
    public Bg6 A01;
    public BfE A03;
    public final C2693Bht A06;
    public final C2693Bht A07;
    public final InterfaceC2794BlU A08;
    public final InterfaceC2562Bdq A09;
    public final InterfaceC2497BcO A0A;
    public final InterfaceC2610Bfb A0B;
    public final C2612Bfd A0C;
    public final C2561Bdp A0D;
    public final BgD A0E;
    public final AbstractC2453Bbg A0F;
    public final List<BfD> A0H = C3cG.A0h();
    public final List<BfD> A0I = C3cG.A0h();
    public List A04 = Collections.EMPTY_LIST;
    public final Object A0G = C3cG.A0T();
    public boolean A05 = true;
    public InterfaceC2585Beh A02 = null;

    private void A00() {
        synchronized (this.A0G) {
            this.A09.Abl(InterfaceC2562Bdq.A03, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x04fd, code lost:
    
        if (r4 == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04ff, code lost:
    
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0505, code lost:
    
        if (r4 != false) goto L207;
     */
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Collection<LX/BfD;>;ZZ)V */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C2603BfF r34, java.util.Collection r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 2051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2603BfF.A01(X.BfF, java.util.Collection, boolean):void");
    }

    public final List<BfD> A02() {
        ArrayList arrayListA0t;
        synchronized (this.A0G) {
            arrayListA0t = BV4.A0t(this.A0H);
        }
        return arrayListA0t;
    }

    public final void A03() {
        synchronized (this.A0G) {
            if (!this.A05) {
                List<BfD> list = this.A0I;
                if (!list.isEmpty()) {
                    this.A0B.AdP(this.A09);
                }
                InterfaceC2610Bfb interfaceC2610Bfb = this.A0B;
                interfaceC2610Bfb.A4u(list);
                InterfaceC2585Beh interfaceC2585Beh = this.A02;
                if (interfaceC2585Beh != null) {
                    interfaceC2610Bfb.ADG().A3c(interfaceC2585Beh);
                }
                Iterator<BfD> it = list.iterator();
                while (it.hasNext()) {
                    BV6.A0S(it).A0O();
                }
                this.A05 = true;
            }
        }
    }

    public final void A04() {
        synchronized (this.A0G) {
            if (this.A05) {
                InterfaceC2610Bfb interfaceC2610Bfb = this.A0B;
                interfaceC2610Bfb.A8x(BV4.A0t(this.A0I));
                BfV bfVADG = interfaceC2610Bfb.ADG();
                this.A02 = bfVADG.AGf();
                bfVADG.A6J();
                this.A05 = false;
            }
        }
    }

    public final void A05(Collection<BfD> collection) {
        synchronized (this.A0G) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.A0H);
            linkedHashSet.removeAll(collection);
            A01(this, linkedHashSet, false);
        }
    }

    @Override // X.InterfaceC2783Bl3
    public final InterfaceC2622Bfo ADF() {
        return this.A0C;
    }

    @Override // X.InterfaceC2783Bl3
    public final InterfaceC2546BdX ADI() {
        return this.A0D;
    }

    public C2603BfF(C2693Bht c2693Bht, C2693Bht c2693Bht2, InterfaceC2794BlU interfaceC2794BlU, InterfaceC2497BcO interfaceC2497BcO, InterfaceC2610Bfb interfaceC2610Bfb, C2561Bdp c2561Bdp, BgD bgD) {
        this.A0B = interfaceC2610Bfb;
        this.A06 = c2693Bht;
        this.A07 = c2693Bht2;
        this.A08 = interfaceC2794BlU;
        this.A0A = interfaceC2497BcO;
        this.A0E = bgD;
        InterfaceC2562Bdq interfaceC2562Bdq = c2561Bdp.A00;
        this.A09 = interfaceC2562Bdq;
        interfaceC2562Bdq.Abl(InterfaceC2562Bdq.A03, null);
        this.A0C = new C2612Bfd(interfaceC2610Bfb.ADG());
        this.A0D = c2561Bdp;
        this.A0F = new C2451Bbe(((C2589Bel) interfaceC2562Bdq).A00, FGI.A0M(c2561Bdp.ADH(), ""));
    }
}
