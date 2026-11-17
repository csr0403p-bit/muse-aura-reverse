package X;

import java.lang.ref.Reference;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.Ait, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1424Ait extends AZE implements InterfaceC1351Ahc, AYV {
    public static final G0U<C1429Aiy, Unit> A09 = BUT.A00(25);
    public C0918AHu<AbstractC1430Aiz, C0917AHt<C1431Aj0<C1453AjM>>> A00;
    public C1425Aiu A01;
    public C1427Aiw A02;
    public G0U<? super InterfaceC1620Amr, Unit> A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public C1429Aiy A07;
    public final AYU A08 = new C1426Aiv(this);

    public abstract InterfaceC1497Ak4 A0d();

    public abstract InterfaceC1134Abi A0e();

    public abstract AbstractC1424Ait A0f();

    public abstract C1453AjM AGz();

    @Override // X.AXY
    public final /* synthetic */ InterfaceC1134Abi APV(Map map, G0U g0u, int i, int i2) {
        return APW(map, null, g0u, i, i2);
    }

    @Override // X.AXN
    public final /* synthetic */ float Agy(int i) {
        return i / AEm();
    }

    public static final void A0S(C0917AHt c0917AHt, AbstractC1424Ait abstractC1424Ait) {
        C1453AjM c1453AjM;
        Object[] objArr = c0917AHt.A04;
        long[] jArr = c0917AHt.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((C8j5.A0A(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int iA0E = 8 - C8j3.A0E(i, length);
                for (int i2 = 0; i2 < iA0E; i2++) {
                    if ((255 & j) < 128 && (c1453AjM = (C1453AjM) ((Reference) C8j3.A11(objArr, i, i2)).get()) != null) {
                        if (abstractC1424Ait.AOh()) {
                            c1453AjM.A0b(false);
                        } else {
                            c1453AjM.A0c(false);
                        }
                    }
                    j >>= 8;
                }
                if (iA0E != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087 A[EDGE_INSN: B:29:0x0087->B:64:0x008c BREAK  A[LOOP:2: B:16:0x004c->B:30:0x0089]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0T(X.AbstractC1430Aiz r32, X.C1453AjM r33, X.AbstractC1424Ait r34) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1424Ait.A0T(X.Aiz, X.AjM, X.Ait):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0U(X.AbstractC1424Ait r23, X.C1429Aiy r24, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1424Ait.A0U(X.Ait, X.Aiy, long, long):void");
    }

    public static final void A0V(AbstractC1387AiH abstractC1387AiH) {
        AbstractC1460AjT abstractC1460AjTACI;
        AbstractC1387AiH abstractC1387AiH2 = abstractC1387AiH.A08;
        C1453AjM c1453AjM = abstractC1387AiH2 != null ? abstractC1387AiH2.A0P : null;
        C1453AjM c1453AjM2 = abstractC1387AiH.A0P;
        boolean zAreEqual = C7384Etj.areEqual(c1453AjM, c1453AjM2);
        C1454AjN c1454AjN = c1453AjM2.A0d.A0G;
        if (zAreEqual) {
            InterfaceC1472Ajf interfaceC1472AjfAIV = c1454AjN.AIV();
            if (interfaceC1472AjfAIV == null || (abstractC1460AjTACI = interfaceC1472AjfAIV.ACI()) == null) {
                return;
            }
        } else {
            abstractC1460AjTACI = c1454AjN.A0S;
        }
        abstractC1460AjTACI.A01();
    }

    private final int A0c(AbstractC1493Ak0 abstractC1493Ak0) {
        int iIntValue;
        if (this instanceof C1354Ahf) {
            C1354Ahf c1354Ahf = (C1354Ahf) this;
            AbstractC1383AiD abstractC1383AiD = c1354Ahf.A02;
            if (abstractC1383AiD == null) {
                return AbstractC1358Ahj.A00(abstractC1493Ak0, c1354Ahf);
            }
            AeA<AbstractC1493Ak0> aeA = abstractC1383AiD.A03;
            int iA04 = aeA.A04(abstractC1493Ak0);
            if (iA04 >= 0) {
                return aeA.A02[iA04];
            }
            return Integer.MIN_VALUE;
        }
        if (this instanceof Ai8) {
            Ai8 ai8 = (Ai8) this;
            AbstractC1383AiD abstractC1383AiD2 = ai8.A00;
            if (abstractC1383AiD2 != null) {
                return abstractC1383AiD2.A0c(abstractC1493Ak0);
            }
            C1454AjN c1454AjN = ai8.A0P.A0d.A0G;
            if (!c1454AjN.A0F) {
                Integer num = c1454AjN.A0T.A05;
                Integer num2 = C79.A00;
                AbstractC1460AjT abstractC1460AjT = c1454AjN.A0S;
                if (num == num2) {
                    abstractC1460AjT.A04 = true;
                    if (abstractC1460AjT.A01) {
                        c1454AjN.A0J = true;
                        c1454AjN.A0K = true;
                    }
                } else {
                    abstractC1460AjT.A03 = true;
                }
            }
            Ai8 ai8AGV = c1454AjN.AGV();
            boolean z = ((AbstractC1424Ait) ai8AGV).A05;
            ((AbstractC1424Ait) ai8AGV).A05 = true;
            c1454AjN.APY();
            ((AbstractC1424Ait) ai8AGV).A05 = z;
            Integer num3 = c1454AjN.A0S.A08.get(abstractC1493Ak0);
            if (num3 != null) {
                return num3.intValue();
            }
            return Integer.MIN_VALUE;
        }
        boolean z2 = this instanceof C1355Ahg;
        AbstractC1383AiD abstractC1383AiD3 = (AbstractC1383AiD) this;
        if (z2) {
            iIntValue = AbstractC1358Ahj.A00(abstractC1493Ak0, abstractC1383AiD3);
        } else {
            C1455AjO c1455AjO = abstractC1383AiD3.A05.A0P.A0d.A04;
            C7384Etj.A0X(c1455AjO);
            if (!c1455AjO.A0B) {
                C1459AjS c1459AjS = c1455AjO.A0K;
                Integer num4 = c1459AjS.A05;
                Integer num5 = C79.A01;
                AbstractC1460AjT abstractC1460AjT2 = c1455AjO.A0J;
                if (num4 == num5) {
                    abstractC1460AjT2.A04 = true;
                    if (abstractC1460AjT2.A01) {
                        c1459AjS.A0C = true;
                        c1459AjS.A0D = true;
                    }
                } else {
                    abstractC1460AjT2.A03 = true;
                }
            }
            Ai8 ai8AGV2 = c1455AjO.AGV();
            AbstractC1383AiD abstractC1383AiDA0l = ai8AGV2.A0l();
            if (abstractC1383AiDA0l != null) {
                ((AbstractC1424Ait) abstractC1383AiDA0l).A05 = true;
            }
            c1455AjO.APY();
            AbstractC1383AiD abstractC1383AiDA0l2 = ai8AGV2.A0l();
            if (abstractC1383AiDA0l2 != null) {
                ((AbstractC1424Ait) abstractC1383AiDA0l2).A05 = false;
            }
            Integer num6 = c1455AjO.A0J.A08.get(abstractC1493Ak0);
            iIntValue = num6 != null ? num6.intValue() : Integer.MIN_VALUE;
        }
        abstractC1383AiD3.A03.A07(abstractC1493Ak0, iIntValue);
        return iIntValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0g(X.InterfaceC1134Abi r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1424Ait.A0g(X.Abi):void");
    }

    public final boolean A0h() {
        return this instanceof AbstractC1387AiH ? AnonymousClass002.A1X(((AbstractC1387AiH) this).A07) : AnonymousClass002.A1X(((AbstractC1383AiD) this).A01);
    }

    public boolean AOh() {
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/Map<LX/Ak0;Ljava/lang/Integer;>;LX/G0U<-LX/Amr;Lkotlin/Unit;>;LX/G0U<-LX/AYU;Lkotlin/Unit;>;)LX/Abi; */
    @Override // X.AXY
    public final InterfaceC1134Abi APW(Map map, G0U g0u, G0U g0u2, int i, int i2) {
        if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
            return new C2274BSa(this, g0u2, g0u, map, i, i2, 1);
        }
        ASP.A01(FGI.A0Y("Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215.", i, i2));
        throw F60.createAndThrow();
    }

    @Override // X.C3Tw
    public final int ABt(AbstractC1493Ak0 abstractC1493Ak0) {
        int iA0c;
        if (!A0h() || (iA0c = A0c(abstractC1493Ak0)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return AnonymousClass002.A09(super.A02) + iA0c;
    }

    @Override // X.AXN
    public final /* synthetic */ int Abr(float f) {
        return ASU.A01(this, f);
    }

    @Override // X.C0dm
    public final /* synthetic */ float Agw(long j) {
        return AbstractC1499Ak6.A00(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Agx(float f) {
        return f / AEm();
    }

    @Override // X.AXN
    public final /* synthetic */ long Agz(long j) {
        return ASU.A02(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah3(long j) {
        return ASU.A00(j, this);
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah4(float f) {
        return f * AEm();
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah6(long j) {
        return ASU.A03(this, j);
    }

    @Override // X.C0dm
    public final /* synthetic */ long Ah7(float f) {
        return AbstractC1499Ak6.A01(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah8(float f) {
        return AXN.A02(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah9(int i) {
        return AXN.A03(this, i);
    }

    @Override // X.AYV
    public final void Ahz(boolean z) {
        AbstractC1424Ait abstractC1424AitA0f = A0f();
        C1453AjM c1453AjMAGz = abstractC1424AitA0f != null ? abstractC1424AitA0f.AGz() : null;
        if (!C7384Etj.areEqual(c1453AjMAGz, AGz())) {
            if ((c1453AjMAGz != null ? c1453AjMAGz.A0d.A05 : null) != C79.A0C) {
                if ((c1453AjMAGz != null ? c1453AjMAGz.A0d.A05 : null) != C79.A0K) {
                    return;
                }
            }
        }
        this.A04 = z;
    }
}
