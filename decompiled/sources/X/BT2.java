package X;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BT2 implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final Object A01;

    public BT2(Object obj, int i, int i2) {
        this.$t = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        BFM bfm;
        int i;
        int i2;
        G2j g2j;
        Object obj3;
        switch (this.$t) {
            case 0:
                ((C1049ASt) this.A01).A00((BFM) obj, AnonymousClass011.A00(this.A00));
                break;
            case 1:
                AdR adR = (AdR) this.A01;
                int i3 = this.A00;
                bfm = (BFM) obj;
                int iA0F = AnonymousClass001.A0F(obj2);
                i = 0;
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 3, 2), bfm, iA0F)) {
                    C1181Adk<C1178Adh> c1181AdkABv = adR.A01.A00.ABv(i3);
                    i2 = i3 - c1181AdkABv.A01;
                    g2j = c1181AdkABv.A02.A00;
                    obj3 = adR.A00;
                    AnonymousClass001.A1F(obj3, Integer.valueOf(i2), bfm, g2j, i);
                    break;
                }
                bfm.Afo();
                break;
            case 2:
                AdP adP = (AdP) this.A01;
                int i4 = this.A00;
                bfm = (BFM) obj;
                int iA0F2 = AnonymousClass001.A0F(obj2);
                if (!AnonymousClass001.A1b(AnonymousClass004.A1E(iA0F2), bfm, iA0F2)) {
                    bfm.Afo();
                    break;
                } else {
                    C1181Adk<C1173Adc> c1181AdkABv2 = adP.A00.A02.ABv(i4);
                    int i5 = i4 - c1181AdkABv2.A01;
                    AnonymousClass001.A1F(C8r6.A00, Integer.valueOf(i5), bfm, c1181AdkABv2.A02.A01, 6);
                    break;
                }
            case 3:
                AGC.A00((BFM) obj, (G0W) this.A01, AnonymousClass011.A00(this.A00));
                break;
            case 4:
                C1168AdQ c1168AdQ = (C1168AdQ) this.A01;
                int i6 = this.A00;
                bfm = (BFM) obj;
                int iA0F3 = AnonymousClass001.A0F(obj2);
                i = 0;
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F3 & 3, 2), bfm, iA0F3)) {
                    C1181Adk c1181AdkABv3 = c1168AdQ.A00.A00().ABv(i6);
                    i2 = i6 - c1181AdkABv3.A01;
                    g2j = ((C1179Adi) c1181AdkABv3.A02).A00;
                    obj3 = c1168AdQ.A01;
                    AnonymousClass001.A1F(obj3, Integer.valueOf(i2), bfm, g2j, i);
                    break;
                }
                bfm.Afo();
                break;
            case 5:
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.A01;
                int i7 = this.A00;
                C1Hj c1Hj = AbstractC1874Aso.A00;
                AbstractC1874Aso.A04(textFieldSelectionState, (BFM) obj, AnonymousClass011.A00(i7));
                break;
            case 6:
                TextFieldSelectionState textFieldSelectionState2 = (TextFieldSelectionState) this.A01;
                int i8 = this.A00;
                C1Hj c1Hj2 = AbstractC1874Aso.A00;
                AbstractC1874Aso.A05(textFieldSelectionState2, (BFM) obj, AnonymousClass011.A00(i8));
                break;
            case 7:
                AbstractC1895AtE.A03((TextFieldSelectionManager) this.A01, (BFM) obj, AnonymousClass011.A00(this.A00));
                break;
            case 8:
                ((C1695AoZ) this.A01).A02((BFM) obj, AnonymousClass011.A00(this.A00));
                break;
            default:
                ((BRL) this.A01).A00((BFM) obj, AnonymousClass011.A00(this.A00));
                break;
        }
        return Unit.INSTANCE;
    }
}
