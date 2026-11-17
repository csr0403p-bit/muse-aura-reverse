package X;

import android.graphics.Paint;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Ahf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1354Ahf extends AbstractC1387AiH {
    public static final InterfaceC1330AhH A04;
    public C1353Ahe A00;
    public InterfaceC1356Ahh A01;
    public AbstractC1383AiD A02;
    public Constraints A03;

    static {
        C1776AqX c1776AqX = new C1776AqX();
        c1776AqX.Ad4(B6A.A02);
        c1776AqX.A01.setStrokeWidth(1.0f);
        c1776AqX.A01.setStyle(Paint.Style.STROKE);
        A04 = c1776AqX;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02() {
        /*
            r11 = this;
            boolean r0 = r11.A06
            if (r0 != 0) goto L66
            r11.A0p()
            X.AiH r7 = r11.A08
            X.C7384Etj.A0X(r7)
            X.Ahe r3 = r11.A00
            if (r3 == 0) goto L56
            X.Ahi r2 = r3.A00
            X.AYU r1 = r11.A08
            X.AiD r0 = r11.A02
            X.C7384Etj.A0X(r0)
            boolean r0 = r2.AOs(r1)
            if (r0 != 0) goto L53
            boolean r0 = r3.A01
            if (r0 != 0) goto L53
            long r3 = r11.A03
            X.AiD r0 = r11.A02
            if (r0 == 0) goto L53
            int r1 = r0.A01
            int r0 = r0.A00
            long r5 = (long) r1
            r10 = 32
            long r5 = r5 << r10
            long r1 = (long) r0
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r8
            long r1 = r1 | r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L53
            long r5 = r7.A03
            X.AiD r0 = r7.A0l()
            if (r0 == 0) goto L53
            int r1 = r0.A01
            int r0 = r0.A00
            long r3 = (long) r1
            long r3 = r3 << r10
            long r1 = (long) r0
            long r1 = r1 & r8
            long r1 = r1 | r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L54
        L53:
            r1 = 0
        L54:
            r7.A0F = r1
        L56:
            boolean r0 = r11.A05
            r7.A05 = r0
            X.Abi r0 = r11.A0e()
            r0.AXv()
            r0 = 0
            r7.A05 = r0
            r7.A0F = r0
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1354Ahf.A02():void");
    }

    @Override // X.AbstractC1387AiH
    public final AbstractC1439Aj8 A0j() {
        return ((AbstractC1439Aj8) this.A01).node;
    }

    @Override // X.AbstractC1387AiH
    public final AbstractC1383AiD A0l() {
        return this.A02;
    }

    @Override // X.AbstractC1387AiH
    public final void A0s() {
        if (this.A02 == null) {
            this.A02 = new C1355Ahg(this);
        }
    }

    @Override // X.AbstractC1387AiH
    public final void A0u(InterfaceC1327AhE interfaceC1327AhE, GraphicsLayer graphicsLayer) {
        AbstractC1387AiH abstractC1387AiH;
        AbstractC1387AiH abstractC1387AiH2 = ((AbstractC1387AiH) this).A08;
        C7384Etj.A0X(abstractC1387AiH2);
        abstractC1387AiH2.A0t(interfaceC1327AhE, graphicsLayer);
        if (!AbstractC1333AhK.A00(this.A0P).getShowLayoutBounds() || (abstractC1387AiH = ((AbstractC1387AiH) this).A08) == null) {
            return;
        }
        if (((AZE) this).A03 == ((AZE) abstractC1387AiH).A03 && abstractC1387AiH.A01 == 0) {
            return;
        }
        interfaceC1327AhE.A9e(A04, 0.5f, 0.5f, C8j3.A0G(r1) - 0.5f, AnonymousClass002.A09(r1) - 0.5f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A11(InterfaceC1356Ahh interfaceC1356Ahh) {
        C1353Ahe c1353Ahe;
        if (!interfaceC1356Ahh.equals(this.A01)) {
            if ((((AbstractC1439Aj8) interfaceC1356Ahh).node.kindSet & 512) != 0) {
                InterfaceC1357Ahi interfaceC1357Ahi = (InterfaceC1357Ahi) interfaceC1356Ahh;
                c1353Ahe = this.A00;
                if (c1353Ahe != null) {
                    c1353Ahe.A00 = interfaceC1357Ahi;
                } else {
                    c1353Ahe = new C1353Ahe(interfaceC1357Ahi, this);
                }
            } else {
                c1353Ahe = null;
            }
            this.A00 = c1353Ahe;
        }
        this.A01 = interfaceC1356Ahh;
    }

    @Override // X.C3Tr
    public final int AQM(int i) {
        C1353Ahe c1353Ahe = this.A00;
        if (c1353Ahe == null) {
            InterfaceC1356Ahh interfaceC1356Ahh = this.A01;
            AbstractC1387AiH abstractC1387AiH = ((AbstractC1387AiH) this).A08;
            C7384Etj.A0X(abstractC1387AiH);
            return interfaceC1356Ahh.AQN(abstractC1387AiH, this, i);
        }
        InterfaceC1357Ahi interfaceC1357Ahi = c1353Ahe.A00;
        AbstractC1387AiH abstractC1387AiH2 = ((AbstractC1387AiH) this).A08;
        if (!A04(abstractC1387AiH2, interfaceC1357Ahi)) {
            return abstractC1387AiH2.AQM(i);
        }
        Integer num = C79.A01;
        return interfaceC1357Ahi.A4h(new AXO(c1353Ahe, c1353Ahe.getLayoutDirection()), new AXU(abstractC1387AiH2, num, num), AYL.A04(i)).getHeight();
    }

    @Override // X.C3Tr
    public final int AQO(int i) {
        C1353Ahe c1353Ahe = this.A00;
        if (c1353Ahe == null) {
            InterfaceC1356Ahh interfaceC1356Ahh = this.A01;
            AbstractC1387AiH abstractC1387AiH = ((AbstractC1387AiH) this).A08;
            C7384Etj.A0X(abstractC1387AiH);
            return interfaceC1356Ahh.AQP(abstractC1387AiH, this, i);
        }
        InterfaceC1357Ahi interfaceC1357Ahi = c1353Ahe.A00;
        AbstractC1387AiH abstractC1387AiH2 = ((AbstractC1387AiH) this).A08;
        if (!A04(abstractC1387AiH2, interfaceC1357Ahi)) {
            return abstractC1387AiH2.AQO(i);
        }
        return interfaceC1357Ahi.A4h(new AXO(c1353Ahe, c1353Ahe.getLayoutDirection()), new AXU(abstractC1387AiH2, C79.A01, C79.A00), AYL.A03(i)).getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    @Override // X.C3TG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AZE AQW(long r11) {
        /*
            r10 = this;
            boolean r0 = r10.A0E
            if (r0 == 0) goto La
            androidx.compose.ui.unit.Constraints r0 = r10.A03
            if (r0 == 0) goto La6
            long r11 = r0.A00
        La:
            r10.A0X(r11)
            X.Ahe r3 = r10.A00
            if (r3 == 0) goto L9a
            X.Ahi r4 = r3.A00
            long r0 = r3.AHJ()
            boolean r0 = r4.AOk(r0)
            r8 = 0
            if (r0 != 0) goto L29
            androidx.compose.ui.unit.Constraints r0 = r10.A03
            if (r0 == 0) goto L29
            long r1 = r0.A00
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L2a
        L29:
            r1 = 1
        L2a:
            r3.A01 = r1
            if (r1 != 0) goto L36
            X.AiH r1 = r10.A08
            X.C7384Etj.A0X(r1)
            r0 = 1
            r1.A0E = r0
        L36:
            X.AiH r0 = r10.A08
            X.C7384Etj.A0X(r0)
            X.Abi r9 = r4.A4h(r3, r0, r11)
            X.AiH r0 = r10.A08
            X.C7384Etj.A0X(r0)
            r0.A0E = r8
            int r1 = r9.getWidth()
            X.AiD r0 = r10.A02
            X.C7384Etj.A0X(r0)
            int r0 = r0.A01
            if (r1 != r0) goto L61
            int r1 = r9.getHeight()
            X.AiD r0 = r10.A02
            X.C7384Etj.A0X(r0)
            int r0 = r0.A00
            if (r1 != r0) goto L61
            r8 = 1
        L61:
            boolean r0 = r3.A01
            if (r0 != 0) goto L93
            X.AiH r0 = r10.A08
            X.C7384Etj.A0X(r0)
            long r6 = r0.A03
            X.AiH r0 = r10.A08
            X.C7384Etj.A0X(r0)
            X.AiD r1 = r0.A0l()
            if (r1 == 0) goto L93
            int r0 = r1.A01
            int r1 = r1.A00
            long r4 = (long) r0
            r0 = 32
            long r4 = r4 << r0
            long r2 = (long) r1
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            long r2 = r2 | r4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L93
            if (r8 != 0) goto L93
            X.Aff r0 = new X.Aff
            r0.<init>(r9, r10)
            r9 = r0
        L93:
            r10.A0v(r9)
            r10.A0o()
            return r10
        L9a:
            X.Ahh r1 = r10.A01
            X.AiH r0 = r10.A08
            X.C7384Etj.A0X(r0)
            X.Abi r9 = r1.AQV(r10, r0, r11)
            goto L93
        La6:
            java.lang.String r1 = "Lookahead constraints cannot be null in approach pass."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1354Ahf.AQW(long):X.AZE");
    }

    @Override // X.C3Tr
    public final int AQo(int i) {
        C1353Ahe c1353Ahe = this.A00;
        if (c1353Ahe == null) {
            InterfaceC1356Ahh interfaceC1356Ahh = this.A01;
            AbstractC1387AiH abstractC1387AiH = ((AbstractC1387AiH) this).A08;
            C7384Etj.A0X(abstractC1387AiH);
            return interfaceC1356Ahh.AQp(abstractC1387AiH, this, i);
        }
        InterfaceC1357Ahi interfaceC1357Ahi = c1353Ahe.A00;
        AbstractC1387AiH abstractC1387AiH2 = ((AbstractC1387AiH) this).A08;
        if (!A04(abstractC1387AiH2, interfaceC1357Ahi)) {
            return abstractC1387AiH2.AQo(i);
        }
        return interfaceC1357Ahi.A4h(new AXO(c1353Ahe, c1353Ahe.getLayoutDirection()), new AXU(abstractC1387AiH2, C79.A00, C79.A01), AYL.A04(i)).getHeight();
    }

    @Override // X.C3Tr
    public final int AQq(int i) {
        C1353Ahe c1353Ahe = this.A00;
        if (c1353Ahe == null) {
            InterfaceC1356Ahh interfaceC1356Ahh = this.A01;
            AbstractC1387AiH abstractC1387AiH = ((AbstractC1387AiH) this).A08;
            C7384Etj.A0X(abstractC1387AiH);
            return interfaceC1356Ahh.AQr(abstractC1387AiH, this, i);
        }
        InterfaceC1357Ahi interfaceC1357Ahi = c1353Ahe.A00;
        AbstractC1387AiH abstractC1387AiH2 = ((AbstractC1387AiH) this).A08;
        if (!A04(abstractC1387AiH2, interfaceC1357Ahi)) {
            return abstractC1387AiH2.AQq(i);
        }
        Integer num = C79.A00;
        return interfaceC1357Ahi.A4h(new AXO(c1353Ahe, c1353Ahe.getLayoutDirection()), new AXU(abstractC1387AiH2, num, num), AYL.A03(i)).getWidth();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1354Ahf(InterfaceC1356Ahh interfaceC1356Ahh, C1453AjM c1453AjM) {
        super(c1453AjM);
        this.A01 = interfaceC1356Ahh;
        this.A02 = c1453AjM.A0B != null ? new C1355Ahg(this) : null;
        this.A00 = (((AbstractC1439Aj8) interfaceC1356Ahh).node.kindSet & 512) != 0 ? new C1353Ahe((InterfaceC1357Ahi) interfaceC1356Ahh, this) : null;
    }

    public static boolean A04(Object obj, Object obj2) {
        C7384Etj.A0X(obj);
        AbstractC1387AiH abstractC1387AiH = ((AbstractC1439Aj8) obj2).node.coordinator;
        C7384Etj.A0X(abstractC1387AiH);
        AbstractC1383AiD abstractC1383AiDA0l = abstractC1387AiH.A0l();
        C7384Etj.A0X(abstractC1383AiDA0l);
        return abstractC1383AiDA0l.A0h();
    }

    @Override // X.AbstractC1387AiH, X.AZE
    public final void A0a(GraphicsLayer graphicsLayer, float f, long j) {
        super.A0a(graphicsLayer, f, j);
        A02();
    }

    /* JADX WARN: Incorrect types in method signature: (JFLX/G0U<-LX/2av;Lkotlin/Unit;>;)V */
    @Override // X.AbstractC1387AiH, X.AZE
    public final void A0b(G0U g0u, float f, long j) {
        super.A0b(g0u, f, j);
        A02();
    }
}
