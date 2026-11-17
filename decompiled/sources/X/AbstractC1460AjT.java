package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.AjT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1460AjT {
    public InterfaceC1472Ajf A00;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final InterfaceC1472Ajf A07;
    public boolean A01 = true;
    public final Map<AbstractC1493Ak0, Integer> A08 = new HashMap();

    public static final void A00(AbstractC1493Ak0 abstractC1493Ak0, AbstractC1460AjT abstractC1460AjT, AbstractC1387AiH abstractC1387AiH, int i) {
        long jA09;
        boolean z;
        long jA0P = C8j3.A0P(i);
        long j = jA0P << 32;
        loop0: while (true) {
            jA09 = j | (jA0P & 4294967295L);
            do {
                z = abstractC1460AjT instanceof C1385AiF;
                if (z) {
                    long j2 = AZE.A01(abstractC1387AiH).A00;
                    jA09 = AWx.A05(AnonymousClass005.A0K((int) (j2 >> 32), AnonymousClass002.A09(j2)), jA09);
                } else {
                    jA09 = AbstractC1387AiH.A09(abstractC1387AiH, jA09, true);
                }
                abstractC1387AiH = abstractC1387AiH.A09;
                C7384Etj.A0X(abstractC1387AiH);
                if (abstractC1387AiH.equals(abstractC1460AjT.A07.AGV())) {
                    break loop0;
                }
            } while (!(z ? AZE.A01(abstractC1387AiH).A0e() : abstractC1387AiH.A0e()).ACJ().containsKey(abstractC1493Ak0));
            jA0P = C8j3.A0P(z ? AZE.A01(abstractC1387AiH).ABt(abstractC1493Ak0) : abstractC1387AiH.ABt(abstractC1493Ak0));
            j = jA0P << 32;
        }
        int iRound = Math.round(C8j3.A05(abstractC1493Ak0 instanceof C3Tx ? jA09 & 4294967295L : jA09 >> 32));
        Map<AbstractC1493Ak0, Integer> map = abstractC1460AjT.A08;
        if (map.containsKey(abstractC1493Ak0)) {
            iRound = AnonymousClass007.A08(Integer.valueOf(AnonymousClass001.A0F(AbstractC2258BHp.A0L(abstractC1493Ak0, map))), abstractC1493Ak0.A00, iRound);
        }
        map.put(abstractC1493Ak0, Integer.valueOf(iRound));
    }

    public final void A01() {
        this.A01 = true;
        InterfaceC1472Ajf interfaceC1472Ajf = this.A07;
        InterfaceC1472Ajf interfaceC1472AjfAIV = interfaceC1472Ajf.AIV();
        if (interfaceC1472AjfAIV != null) {
            if (this.A06) {
                interfaceC1472AjfAIV.AbA();
            } else if (this.A02 || this.A05) {
                interfaceC1472AjfAIV.requestLayout();
            }
            if (this.A04) {
                interfaceC1472Ajf.AbA();
            }
            if (this.A03) {
                interfaceC1472Ajf.requestLayout();
            }
            interfaceC1472AjfAIV.ACI().A01();
        }
    }

    public final void A02() {
        Map<AbstractC1493Ak0, Integer> map = this.A08;
        map.clear();
        InterfaceC1472Ajf interfaceC1472Ajf = this.A07;
        interfaceC1472Ajf.ABj(BUX.A00(this, 34));
        Ai8 ai8AGV = interfaceC1472Ajf.AGV();
        map.putAll((this instanceof C1385AiF ? AZE.A01(ai8AGV).A0e() : ai8AGV.A0e()).ACJ());
        this.A01 = false;
    }

    public final boolean A04() {
        return this.A06 || this.A02 || this.A04 || this.A03;
    }

    public AbstractC1460AjT(InterfaceC1472Ajf interfaceC1472Ajf) {
        this.A07 = interfaceC1472Ajf;
    }

    public final void A03() {
        AbstractC1460AjT abstractC1460AjTACI;
        AbstractC1460AjT abstractC1460AjTACI2;
        boolean zA04 = A04();
        InterfaceC1472Ajf interfaceC1472Ajf = this.A07;
        if (!zA04) {
            InterfaceC1472Ajf interfaceC1472AjfAIV = interfaceC1472Ajf.AIV();
            if (interfaceC1472AjfAIV == null) {
                return;
            }
            interfaceC1472Ajf = interfaceC1472AjfAIV.ACI().A00;
            if (interfaceC1472Ajf == null || !interfaceC1472Ajf.ACI().A04()) {
                InterfaceC1472Ajf interfaceC1472Ajf2 = this.A00;
                if (interfaceC1472Ajf2 == null || interfaceC1472Ajf2.ACI().A04()) {
                    return;
                }
                InterfaceC1472Ajf interfaceC1472AjfAIV2 = interfaceC1472Ajf2.AIV();
                if (interfaceC1472AjfAIV2 != null && (abstractC1460AjTACI2 = interfaceC1472AjfAIV2.ACI()) != null) {
                    abstractC1460AjTACI2.A03();
                }
                InterfaceC1472Ajf interfaceC1472AjfAIV3 = interfaceC1472Ajf2.AIV();
                interfaceC1472Ajf = (interfaceC1472AjfAIV3 == null || (abstractC1460AjTACI = interfaceC1472AjfAIV3.ACI()) == null) ? null : abstractC1460AjTACI.A00;
            }
        }
        this.A00 = interfaceC1472Ajf;
    }
}
