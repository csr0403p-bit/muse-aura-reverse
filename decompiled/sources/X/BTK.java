package X;

import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BTK implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public BTK(Object obj, Object obj2, int i, int i2, boolean z) {
        this.$t = i2;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = obj2;
        this.A00 = i;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                BFM bfm = (BFM) obj;
                CommonContextMenuAreaKt.A00((TextFieldSelectionState) this.A01, bfm, (G0V) this.A02, AnonymousClass011.A00(this.A00), this.A03);
                break;
            case 1:
                BFM bfm2 = (BFM) obj;
                AbstractC1914Atb.A01((TextFieldSelectionState) this.A01, bfm2, (G0V) this.A02, AnonymousClass011.A00(this.A00), this.A03);
                break;
            case 2:
                AWB.A03((BRg) this.A01, this.A03, (Function0) this.A02, (BFM) obj, AnonymousClass011.A00(this.A00));
                break;
            default:
                boolean z = this.A03;
                AbstractC1902AtN.A00((TextFieldSelectionManager) this.A02, (BFM) obj, (Integer) this.A01, AnonymousClass011.A00(this.A00), z);
                break;
        }
        return Unit.INSTANCE;
    }
}
