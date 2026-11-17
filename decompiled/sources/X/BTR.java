package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.Alignment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BTR implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public BTR(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$t = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A00 = i;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        Object obj3 = this.A01;
        switch (i) {
            case 0:
                ((AGD) obj3).A2e(this.A02, (G0V) this.A03, (BFM) obj, AnonymousClass011.A00(this.A00));
                break;
            case 1:
                AbstractC1895AtE.A05((TextFieldSelectionManager) this.A02, (BFM) obj, (BRg) obj3, (G0V) this.A03, AnonymousClass011.A00(this.A00));
                break;
            case 2:
                BFM bfm = (BFM) obj;
                C1695AoZ.A01((C1695AoZ) obj3, bfm, (G0U) this.A03, (Object[]) this.A02, AnonymousClass011.A00(this.A00));
                break;
            case 3:
                AbstractC1789Aqz.A01((InterfaceC2266BNk) obj3, (InterfaceC1740Apd) this.A02, (BFM) obj, (Function0) this.A03, AnonymousClass011.A00(this.A00));
                break;
            case 4:
                AWB.A01((InterfaceC2267BNn) obj3, (BFM) obj, (Alignment) this.A02, (G0V) this.A03, AnonymousClass011.A00(this.A00));
                break;
            case 5:
                B1U.A05((BFM) obj, (B1U) obj3, this.A02, this.A03, AnonymousClass011.A01(this.A00) | 1);
                break;
            default:
                ((AG9) obj3).A2e(this.A02, (G0V) this.A03, (BFM) obj, AnonymousClass011.A00(this.A00));
                break;
        }
        return Unit.INSTANCE;
    }
}
