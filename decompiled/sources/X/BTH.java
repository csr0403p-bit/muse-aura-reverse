package X;

import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BTH implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final Object A01;
    public final Object A02;

    public BTH(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                ((AOP) this.A01).A0B((BFM) obj, this.A02, AnonymousClass011.A00(this.A00));
                break;
            case 1:
                InterfaceC1129Abd interfaceC1129Abd = (InterfaceC1129Abd) this.A01;
                int i = this.A00;
                Object obj3 = this.A02;
                BFM bfm = (BFM) obj;
                int iA0F = AnonymousClass001.A0F(obj2);
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 3, 2), bfm, iA0F)) {
                    bfm.Afo();
                    break;
                } else {
                    interfaceC1129Abd.A2d(bfm, obj3, i, 0);
                    break;
                }
            case 2:
                ((At6) this.A01).Decoration((G0V) this.A02, (BFM) obj, AnonymousClass011.A00(this.A00));
                break;
            case 3:
                CommonContextMenuAreaKt.A02((TextFieldSelectionManager) this.A01, (BFM) obj, (G0V) this.A02, AnonymousClass011.A00(this.A00));
                break;
            case 4:
                CommonContextMenuAreaKt.A01((C1943Aug) this.A01, (BFM) obj, (G0V) this.A02, AnonymousClass011.A00(this.A00));
                break;
            case 5:
                AbstractC1914Atb.A02((C1943Aug) this.A01, (BFM) obj, (G0V) this.A02, AnonymousClass011.A00(this.A00));
                break;
            case 6:
                AbstractC1914Atb.A03((TextFieldSelectionManager) this.A01, (BFM) obj, (G0V) this.A02, AnonymousClass011.A00(this.A00));
                break;
            case 7:
                AbstractC1789Aqz.A00((AqW) this.A02, (InterfaceC2266BNk) this.A01, (BFM) obj, AnonymousClass011.A00(this.A00));
                break;
            case 8:
                AbstractC1789Aqz.A03((BFM) obj, (BRg) this.A01, (G0V) this.A02, AnonymousClass011.A00(this.A00));
                break;
            case 9:
                Ar1.A00((BFM) obj, (BRg) this.A01, (G0V) this.A02, AnonymousClass011.A00(this.A00));
                break;
            case 10:
            case 11:
            default:
                ((Ar4) this.A01).A00((Function0) this.A02, (BFM) obj, AnonymousClass011.A00(this.A00));
                break;
            case 12:
                AKT.A01((BFM) obj, (AKJ) this.A01, (G0V) this.A02, AnonymousClass011.A00(this.A00));
                break;
            case 13:
                BFM bfm2 = (BFM) obj;
                AKT.A02(bfm2, (G0V) this.A02, (AKJ[]) this.A01, AnonymousClass011.A00(this.A00));
                break;
            case 14:
                B1U.A04((BFM) obj, (B1U) this.A01, this.A02, AnonymousClass011.A01(this.A00) | 1);
                break;
        }
        return Unit.INSTANCE;
    }
}
