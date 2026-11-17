package X;

import android.graphics.Rect;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuP implements InterfaceC1925Atm {
    public InterfaceC1766AqJ A00;
    public AuT A01;
    public HoC A02;
    public C3Em<Unit> A03;

    private final void A01(G0U<? super AuT, Unit> g0u) {
        Object obj = this.A00;
        if (obj != null) {
            C10533Hqc c10533HqcA02 = null;
            BUF buf = new BUF((Object) this, (G0U<? super AuT, Unit>) obj, (AuP) null, (InterfaceC1766AqJ) g0u, (HtJ<? super BUF>) 6);
            AbstractC1439Aj8 abstractC1439Aj8 = (AbstractC1439Aj8) obj;
            if (abstractC1439Aj8.isAttached) {
                C3UX coroutineScope = abstractC1439Aj8.getCoroutineScope();
                c10533HqcA02 = GAo.A02(C79.A0K, C6ys.A00, BU6.A0M(abstractC1439Aj8, buf, null, 26), coroutineScope);
            }
            this.A02 = c10533HqcA02;
        }
    }

    @Override // X.InterfaceC1925Atm
    public final void Ag4() {
        A01(null);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/ArO;LX/AuI;LX/G0U<-Ljava/util/List<+LX/AzK;>;Lkotlin/Unit;>;LX/G0U<-Landroidx/compose/ui/text/input/ImeAction;Lkotlin/Unit;>;)V */
    @Override // X.InterfaceC1925Atm
    public final void Ag5(AuI auI, C1805ArO c1805ArO, G0U g0u, G0U g0u2) {
        A01(new C2301BTb(c1805ArO, g0u, g0u2, auI, this, 2));
    }

    public static final C3Em A00(AuP auP) {
        C3Em<Unit> c3Em = auP.A03;
        if (c3Em != null) {
            return c3Em;
        }
        if (!AbstractC1645AnO.A00) {
            return null;
        }
        C9290GCr c9290GCr = new C9290GCr(C79.A0C, 1, 1);
        auP.A03 = c9290GCr;
        return c9290GCr;
    }

    public final void A02(InterfaceC1766AqJ interfaceC1766AqJ) {
        if (this.A00 == interfaceC1766AqJ) {
            this.A00 = null;
        } else {
            StringBuilder sbA0f = C3cG.A0f(interfaceC1766AqJ, "Expected textInputModifierNode to be ");
            sbA0f.append(" but was ");
            throw C3cG.A0Q(C8j3.A14(this.A00, sbA0f));
        }
    }

    @Override // X.InterfaceC1925Atm
    public final void ANO() {
        InterfaceC1766AqJ interfaceC1766AqJ = this.A00;
        if (interfaceC1766AqJ != null) {
            C1C3 c1c3 = (C1C3) ARZ.A01(Am0.A0E, (AuZ) interfaceC1766AqJ);
            if (c1c3 != null) {
                c1c3.hide();
            }
        }
    }

    @Override // X.InterfaceC1925Atm
    public final void ARO(AaC aaC) {
        Rect rect;
        AuT auT = this.A01;
        if (auT != null) {
            auT.A00 = Ab3.A04(aaC);
            if (!auT.A06.isEmpty() || (rect = auT.A00) == null) {
                return;
            }
            auT.A09.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // X.InterfaceC1925Atm
    public final void Aff() {
        InterfaceC1766AqJ interfaceC1766AqJ = this.A00;
        if (interfaceC1766AqJ != null) {
            C1C3 c1c3 = (C1C3) ARZ.A01(Am0.A0E, (AuZ) interfaceC1766AqJ);
            if (c1c3 != null) {
                c1c3.Afd();
            }
        }
    }

    @Override // X.InterfaceC1925Atm
    public final void AgT() {
        this.A02 = C3cI.A15(this.A02);
        C3Em c3EmA00 = A00(this);
        if (c3EmA00 != null) {
            c3EmA00.AbQ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.InterfaceC1925Atm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ai7(X.C1805ArO r11, X.C1805ArO r12) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AuP.Ai7(X.ArO, X.ArO):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/ArO;LX/Ayu;LX/Aux;LX/G0U<-LX/AiN;Lkotlin/Unit;>;LX/AaC;LX/AaC;)V */
    @Override // X.InterfaceC1925Atm
    public final void AiA(AaC aaC, AaC aaC2, C1958Aux c1958Aux, InterfaceC2128Ayu interfaceC2128Ayu, C1805ArO c1805ArO, G0U g0u) {
        AuT auT = this.A01;
        if (auT != null) {
            AuR auR = auT.A0B;
            synchronized (auR.A0B) {
                auR.A04 = c1805ArO;
                auR.A03 = interfaceC2128Ayu;
                auR.A02 = c1958Aux;
                auR.A01 = aaC;
                auR.A00 = aaC2;
                if (auR.A05 || auR.A0A) {
                    AuR.A00(auR);
                }
            }
        }
    }

    public AuP(int i) {
    }

    public AuP() {
    }
}
