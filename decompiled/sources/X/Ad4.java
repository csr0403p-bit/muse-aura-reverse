package X;

import androidx.compose.ui.unit.Constraints;

/* loaded from: classes4.dex */
public final class Ad4 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Constraints A05;
    public final /* synthetic */ Acy<T> A07;
    public C1073AWe[] A06 = AbstractC1194Adz.A00;
    public int A04 = 1;

    public Ad4(Acy acy) {
        this.A07 = acy;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/3UX;LX/ASQ;III)V */
    public final void A00(InterfaceC1174Add interfaceC1174Add, ASQ asq, C3UX c3ux, int i, int i2, int i3) {
        C1073AWe[] c1073AWeArr;
        C1073AWe[] c1073AWeArr2 = this.A06;
        int length = c1073AWeArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.A03 = i;
                this.A02 = i2;
                break;
            } else {
                C1073AWe c1073AWe = c1073AWeArr2[i4];
                if (c1073AWe != null && c1073AWe.A07) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int iAIi = interfaceC1174Add.AIi();
        int length2 = this.A06.length;
        while (true) {
            c1073AWeArr = this.A06;
            if (iAIi >= length2) {
                break;
            }
            C1073AWe c1073AWe2 = c1073AWeArr[iAIi];
            if (c1073AWe2 != null) {
                c1073AWe2.A01();
            }
            iAIi++;
        }
        if (c1073AWeArr.length != interfaceC1174Add.AIi()) {
            this.A06 = (C1073AWe[]) C8j3.A1a(this.A06, interfaceC1174Add.AIi());
        }
        this.A05 = new Constraints(interfaceC1174Add.ADz());
        this.A00 = i3;
        this.A01 = interfaceC1174Add.AGt();
        this.A04 = interfaceC1174Add.AKq();
        int iAIi2 = interfaceC1174Add.AIi();
        Object obj = this.A07;
        for (int i5 = 0; i5 < iAIi2; i5++) {
            Object objAIY = interfaceC1174Add.AIY(i5);
            AXx aXx = objAIY instanceof AXx ? (AXx) objAIY : null;
            C1073AWe[] c1073AWeArr3 = this.A06;
            if (aXx == null) {
                C1073AWe c1073AWe3 = c1073AWeArr3[i5];
                if (c1073AWe3 != null) {
                    c1073AWe3.A01();
                }
                this.A06[i5] = null;
            } else {
                C1073AWe c1073AWe4 = c1073AWeArr3[i5];
                if (c1073AWe4 == null) {
                    c1073AWe4 = new C1073AWe(asq, C2292BSs.A00(obj, 30), c3ux);
                    this.A06[i5] = c1073AWe4;
                }
                c1073AWe4.A03 = aXx.A00;
                c1073AWe4.A05 = aXx.A02;
                c1073AWe4.A04 = aXx.A01;
            }
        }
    }
}
