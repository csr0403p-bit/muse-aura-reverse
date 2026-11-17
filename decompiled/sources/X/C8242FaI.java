package X;

import android.content.Context;
import android.view.View;
import com.facebook.aura.R;

/* renamed from: X.FaI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8242FaI extends C8236FaC {
    public final /* synthetic */ C8243FaJ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8242FaI(Context context, View view, C8249FaR c8249FaR, C8243FaJ c8243FaJ) {
        super(context, view, c8249FaR, R.attr._name_removed__res_0x7f04002a, 0, true);
        this.A00 = c8243FaJ;
        super.A00 = 8388613;
        C8247FaP c8247FaP = c8243FaJ.A0K;
        this.A04 = c8247FaP;
        AbstractC8231Fa7 abstractC8231Fa7 = this.A03;
        if (abstractC8231Fa7 != null) {
            abstractC8231Fa7.Acz(c8247FaP);
        }
    }

    @Override // X.C8236FaC
    public final void A01() {
        C8243FaJ c8243FaJ = this.A00;
        C8249FaR c8249FaR = c8243FaJ.A06;
        if (c8249FaR != null) {
            c8249FaR.close();
        }
        c8243FaJ.A0D = null;
        super.A01();
    }
}
