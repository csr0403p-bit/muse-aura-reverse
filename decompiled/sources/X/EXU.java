package X;

import android.app.Activity;
import android.content.DialogInterface;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EXU implements DialogInterface.OnCancelListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ EXZ A01;
    public final /* synthetic */ EXP A02;
    public final /* synthetic */ C6729EXn A03;
    public final /* synthetic */ C6718EXb A04;
    public final /* synthetic */ G0U<InterfaceC10512HoG, Unit> A05;

    /* JADX WARN: Incorrect types in method signature: (LX/EXP;Landroid/app/Activity;LX/EXZ;LX/G0U<-LX/HoG;Lkotlin/Unit;>;LX/EXn;LX/EXb;)V */
    public EXU(Activity activity, EXZ exz, EXP exp, C6729EXn c6729EXn, C6718EXb c6718EXb, G0U g0u) {
        this.A02 = exp;
        this.A00 = activity;
        this.A01 = exz;
        this.A05 = g0u;
        this.A03 = c6729EXn;
        this.A04 = c6718EXb;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) throws Exception {
        EXP exp = this.A02;
        Activity activity = this.A00;
        EnumC7495EyA enumC7495EyA = EnumC7495EyA.A06;
        EXP.A01(activity, this.A01, exp, C6729EXn.A0y(this.A03, null, Long.valueOf(this.A04.A00()), null), enumC7495EyA, this.A05, 86400, 5);
    }
}
