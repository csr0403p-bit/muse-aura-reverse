package X;

import android.view.autofill.AutofillValue;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class BT7 implements Ht9, G0U {
    public final int $t;
    public final Object A00;
    public final boolean A01;

    public BT7(Object obj, int i, boolean z) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = z;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        boolean z;
        CharSequence textValue;
        switch (this.$t) {
            case 0:
                B84 b84 = (B84) this.A00;
                b84.A04(this.A01);
                return new B85(b84, (C06797bC) obj);
            case 1:
                B86 b86 = (B86) this.A00;
                b86.A04(this.A01);
                return new B87(b86, (C06797bC) obj);
            default:
                boolean z2 = this.A01;
                C1871Asl c1871Asl = (C1871Asl) this.A00;
                InterfaceC2161Azr interfaceC2161Azr = (InterfaceC2161Azr) obj;
                if (z2) {
                    AutofillValue autofillValue = ((AY5) interfaceC2161Azr).A00;
                    if (autofillValue.isText() && (textValue = autofillValue.getTextValue()) != null) {
                        c1871Asl.A05.A0B(textValue);
                    }
                    z = true;
                    MutableState.A09(true, c1871Asl.A0G);
                    BU2.A0P(c1871Asl, c1871Asl.getCoroutineScope(), 38);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
