package X;

import android.app.Activity;
import android.content.DialogInterface;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EXT implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ EXZ A01;
    public final /* synthetic */ EXP A02;
    public final /* synthetic */ C6729EXn A03;
    public final /* synthetic */ C6718EXb A04;
    public final /* synthetic */ G0U<InterfaceC10512HoG, Unit> A05;
    public final /* synthetic */ EnumC7495EyA[] A06;

    /* JADX WARN: Incorrect types in method signature: (LX/EXP;Landroid/app/Activity;[LX/EyA;LX/EXZ;LX/G0U<-LX/HoG;Lkotlin/Unit;>;LX/EXn;LX/EXb;)V */
    public EXT(Activity activity, EXZ exz, EXP exp, C6729EXn c6729EXn, C6718EXb c6718EXb, G0U g0u, EnumC7495EyA[] enumC7495EyAArr) {
        this.A02 = exp;
        this.A00 = activity;
        this.A06 = enumC7495EyAArr;
        this.A01 = exz;
        this.A05 = g0u;
        this.A03 = c6729EXn;
        this.A04 = c6718EXb;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Exception {
        EXP exp = this.A02;
        Activity activity = this.A00;
        EnumC7495EyA enumC7495EyA = this.A06[i];
        EXP.A01(activity, this.A01, exp, C6729EXn.A0y(this.A03, null, Long.valueOf(this.A04.A00()), null), enumC7495EyA, this.A05, 86400, 5);
    }
}
