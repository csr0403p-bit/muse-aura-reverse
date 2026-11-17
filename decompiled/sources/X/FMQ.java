package X;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

/* loaded from: classes6.dex */
public final class FMQ implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FMP A01;
    public final /* synthetic */ FBB A02;
    public final /* synthetic */ FDW A03;
    public final /* synthetic */ HsM A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public FMQ(View view, FMP fmp, FBB fbb, FDW fdw, HsM hsM, boolean z, boolean z2) {
        this.A06 = z;
        this.A00 = view;
        this.A05 = z2;
        this.A04 = hsM;
        this.A03 = fdw;
        this.A02 = fbb;
        this.A01 = fmp;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.A06) {
            Switch r1 = ((FMR) ((FJJ) this.A00)).A00;
            r1.setOnCheckedChangeListener(null);
            r1.setChecked(this.A05);
            r1.setOnCheckedChangeListener(this);
        }
        HsM hsM = this.A04;
        if (hsM != null) {
            FDW fdw = this.A03;
            C9115Fyg c9115FygA01 = C9115Fyg.A01(fdw);
            c9115FygA01.A06(Boolean.valueOf(z), 1);
            F9J.A03(this.A02, fdw, c9115FygA01, hsM, 2);
        }
    }
}
