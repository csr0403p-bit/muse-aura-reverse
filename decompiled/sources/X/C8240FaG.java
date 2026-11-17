package X;

import android.content.Context;
import android.view.View;
import com.facebook.aura.R;

/* renamed from: X.FaG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8240FaG extends C8236FaC {
    public final /* synthetic */ C8243FaJ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8240FaG(Context context, View view, SubMenuC8248FaQ subMenuC8248FaQ, C8243FaJ c8243FaJ) {
        super(context, view, subMenuC8248FaQ, R.attr._name_removed__res_0x7f04002a, 0, false);
        this.A00 = c8243FaJ;
        if ((((C8252FaX) subMenuC8248FaQ.getItem()).A02 & 32) != 32) {
            View view2 = c8243FaJ.A0C;
            this.A01 = view2 == null ? (View) c8243FaJ.A08 : view2;
        }
        C8247FaP c8247FaP = c8243FaJ.A0K;
        this.A04 = c8247FaP;
        AbstractC8231Fa7 abstractC8231Fa7 = this.A03;
        if (abstractC8231Fa7 != null) {
            abstractC8231Fa7.Acz(c8247FaP);
        }
    }

    @Override // X.C8236FaC
    public final void A01() {
        this.A00.A09 = null;
        super.A01();
    }
}
