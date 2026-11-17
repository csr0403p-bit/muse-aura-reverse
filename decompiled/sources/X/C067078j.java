package X;

import androidx.compose.runtime.ForgottenCoroutineScopeException;
import androidx.compose.runtime.RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.78j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C067078j implements C3UX, InterfaceC1559AlZ {
    public static final C78T A04 = new C78K();
    public final C78T A00;
    public final C78T A01;
    public final Object A02 = this;
    public volatile C78T A03;

    public final void A00() {
        synchronized (this.A02) {
            C78T c78t = this.A03;
            if (c78t == null) {
                this.A03 = A04;
            } else {
                HzS.A03(new ForgottenCoroutineScopeException(), c78t);
            }
        }
    }

    @Override // X.C3UX
    public final C78T AEA() {
        C78T c78tPlus = this.A03;
        if (c78tPlus == null || c78tPlus == A04) {
            C78T c78t = this.A01;
            BFB bfb = (BFB) c78t.get(BFB.A01);
            C78T rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 = bfb != null ? new RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, bfb, this) : C6ys.A00;
            synchronized (this.A02) {
                c78tPlus = this.A03;
                if (c78tPlus == null) {
                    c78tPlus = c78t.plus(new C9250GBd((HoC) c78t.get(HoC.A00))).plus(this.A00).plus(rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1);
                } else if (c78tPlus == A04) {
                    C9250GBd c9250GBd = new C9250GBd((HoC) c78t.get(HoC.A00));
                    c9250GBd.A5w(new ForgottenCoroutineScopeException());
                    c78tPlus = c78t.plus(c9250GBd).plus(this.A00).plus(rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1);
                }
                this.A03 = c78tPlus;
            }
        }
        C7384Etj.A0X(c78tPlus);
        return c78tPlus;
    }

    @Override // X.InterfaceC1559AlZ
    public final void onRemembered() {
    }

    public C067078j(C78T c78t, C78T c78t2) {
        this.A01 = c78t;
        this.A00 = c78t2;
    }

    @Override // X.InterfaceC1559AlZ
    public final void onAbandoned() {
        A00();
    }

    @Override // X.InterfaceC1559AlZ
    public final void onForgotten() {
        A00();
    }
}
