package X;

import android.app.Activity;
import android.app.AlertDialog;
import com.facebook.aura.iap.iac.AuraIacBottomSheetLauncher;
import java.util.ArrayList;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EXQ implements Runnable {
    public static final String __redex_internal_original_name = "DcpIacBillingClient$launchFlow$1";
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ EXZ A01;
    public final /* synthetic */ EXP A02;
    public final /* synthetic */ G0U<InterfaceC10512HoG, Unit> A03;

    /* JADX WARN: Incorrect types in method signature: (LX/EXP;LX/EXZ;Landroid/app/Activity;LX/G0U<-LX/HoG;Lkotlin/Unit;>;)V */
    public EXQ(Activity activity, EXZ exz, EXP exp, G0U g0u) {
        this.A02 = exp;
        this.A01 = exz;
        this.A00 = activity;
        this.A03 = g0u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strAJ2;
        EXP exp = this.A02;
        AuraIacBottomSheetLauncher auraIacBottomSheetLauncher = exp.A00;
        if (auraIacBottomSheetLauncher != null) {
            EXZ exz = this.A01;
            C6729EXn c6729EXnA00 = EXP.A00(exz, C79.A0C, null);
            A00(c6729EXnA00, exp.A02);
            C6718EXb c6718EXb = new C6718EXb(0L, 1, null);
            Activity activity = this.A00;
            String str = exz.A02;
            GOU gou = exz.A00;
            if (gou == null || (strAJ2 = gou.AJ2()) == null) {
                strAJ2 = "$0.99";
            }
            auraIacBottomSheetLauncher.show(activity, str, "Sandbox purchase", strAJ2, exp.A01, exz.A03, new EXS(activity, exz, exp, c6729EXnA00, c6718EXb, this.A03));
            return;
        }
        Activity activity2 = this.A00;
        EXZ exz2 = this.A01;
        G0U<InterfaceC10512HoG, Unit> g0u = this.A03;
        C6729EXn c6729EXnA002 = EXP.A00(exz2, C79.A0K, null);
        A00(c6729EXnA002, exp.A02);
        C6718EXb c6718EXb2 = new C6718EXb(0L, 1, null);
        EnumC7495EyA[] enumC7495EyAArr = (EnumC7495EyA[]) EnumC7495EyA.A00.toArray(new EnumC7495EyA[0]);
        ArrayList arrayListA11 = C60O.A11(enumC7495EyAArr.length);
        for (EnumC7495EyA enumC7495EyA : enumC7495EyAArr) {
            arrayListA11.add(enumC7495EyA.label);
        }
        new AlertDialog.Builder(activity2).setTitle(FGI.A0M("Sandbox checkout: ", exz2.A02)).setItems(BV4.A1b(arrayListA11), new EXT(activity2, exz2, exp, c6729EXnA002, c6718EXb2, g0u, enumC7495EyAArr)).setOnCancelListener(new EXU(activity2, exz2, exp, c6729EXnA002, c6718EXb2, g0u)).show();
    }

    public static final void A00(C6729EXn c6729EXn, C6725EXj c6725EXj) {
        C8ee c8eeA00 = C6725EXj.A00(c6725EXj);
        if (c8eeA00 != null) {
            Eu1 eu1AcquireEvent = c8eeA00.acquireEvent("client_load_dcpiacbottomsheet_init");
            if (eu1AcquireEvent.isSampled()) {
                Eu1.A00(eu1AcquireEvent);
                Eu1.A01(eu1AcquireEvent, AbstractC6728EXm.A00(c6729EXn));
                EVX.A00(eu1AcquireEvent);
            }
        }
    }
}
