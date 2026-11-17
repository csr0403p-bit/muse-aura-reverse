package X;

import android.content.Context;
import com.facebook.rendercore.text.RCTextView;

/* loaded from: classes6.dex */
public final class FI2 extends FGT<RCTextView> implements InterfaceC7830FGl<RCTextView> {
    public long A00;
    public static InterfaceC7833FGo<FI2, RCTextView, Void> A02 = new FIB();
    public static InterfaceC7833FGo<FI2, RCTextView, Void> A01 = new FIN();

    @Override // X.InterfaceC7830FGl
    public final /* bridge */ /* synthetic */ RCTextView A7d(Context context) {
        return new RCTextView(context);
    }

    @Override // X.InterfaceC7830FGl
    public final /* synthetic */ FEZ AIs() {
        return Hnn.A00;
    }

    @Override // X.InterfaceC7830FGl
    public final /* synthetic */ int AY3() {
        return 3;
    }

    public FI2(long j) {
        this.A00 = j;
        C7834FGp[] c7834FGpArr = {new C7834FGp(A01, this), new C7834FGp(A02, this)};
        int i = 0;
        do {
            A0U(c7834FGpArr[i]);
            i++;
        } while (i < 2);
    }

    @Override // X.InterfaceC7830FGl
    public final /* synthetic */ Class AIr() {
        return getClass();
    }
}
