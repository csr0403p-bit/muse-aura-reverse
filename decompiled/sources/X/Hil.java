package X;

import android.view.View;
import androidx.activity.ComponentActivity;
import com.facebook.aura.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class Hil implements Ht9, Function0 {
    public final int $t;
    public final Object A00;

    public Hil(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        String str2;
        switch (this.$t) {
            case 0:
                ((ComponentActivity) this.A00).reportFullyDrawn();
                return Unit.INSTANCE;
            case 1:
                return ComponentActivity.fullyDrawnReporter_delegate$lambda$0((ComponentActivity) this.A00);
            case 2:
                return ComponentActivity.onBackPressedInput_delegate$lambda$0((ComponentActivity) this.A00);
            case 3:
                return ComponentActivity.defaultViewModelProviderFactory_delegate$lambda$0((ComponentActivity) this.A00);
            case 4:
                return ComponentActivity.onBackPressedDispatcher_delegate$lambda$0((ComponentActivity) this.A00);
            case 5:
                DialogC10469Hka dialogC10469Hka = (DialogC10469Hka) this.A00;
                C2mE c2mE = new C2mE();
                dialogC10469Hka.getOnBackPressedDispatcher().A02.A02(c2mE);
                return c2mE;
            case 6:
                View viewInflate = View.inflate(((C8362Fcb) this.A00).A00, R.layout._name_removed__res_0x7f0d034e, null);
                C7384Etj.A0Z(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
                return viewInflate;
            case 7:
                F9C f9c = ((F9E) this.A00).A00;
                ArrayList arrayListA0h = C3cG.A0h();
                for (F9C f9c2 = f9c; f9c2 != null; f9c2 = f9c2.A02) {
                    arrayListA0h.addAll(0, f9c2.A03);
                }
                F9C f9c3 = f9c;
                while (true) {
                    if (f9c3 == null) {
                        str = null;
                    } else {
                        str = f9c3.A01;
                        if (str == null) {
                            f9c3 = f9c3.A02;
                        }
                    }
                }
                while (true) {
                    if (f9c == null) {
                        str2 = null;
                    } else {
                        str2 = f9c.A00;
                        if (str2 == null) {
                            f9c = f9c.A02;
                        }
                    }
                }
                return new F9D(arrayListA0h, str, str2);
            default:
                View view = (View) this.A00;
                Map<String, Integer> map = Hzv.A06;
                C8053FRg c8053FRgA00 = AbstractC8060FRo.A00(view);
                if (c8053FRgA00 instanceof Hzv) {
                    return ((Hzv) c8053FRgA00).A01;
                }
                return null;
        }
    }
}
