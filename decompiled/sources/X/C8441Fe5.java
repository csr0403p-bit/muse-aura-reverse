package X;

import androidx.transition.FragmentTransitionSupport;

/* renamed from: X.Fe5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8441Fe5 implements InterfaceC8451FeF {
    public final /* synthetic */ FragmentTransitionSupport A00;
    public final /* synthetic */ Runnable A01;

    public C8441Fe5(FragmentTransitionSupport fragmentTransitionSupport, Runnable runnable) {
        this.A00 = fragmentTransitionSupport;
        this.A01 = runnable;
    }

    @Override // X.InterfaceC8451FeF
    public final void AWo(AbstractC8429Fds abstractC8429Fds) {
    }

    @Override // X.InterfaceC8451FeF
    public final void AWp(AbstractC8429Fds abstractC8429Fds) {
        this.A01.run();
    }

    @Override // X.InterfaceC8451FeF
    public final void AWq() {
    }

    @Override // X.InterfaceC8451FeF
    public final void AWr() {
    }

    @Override // X.InterfaceC8451FeF
    public final /* synthetic */ void AWs(AbstractC8429Fds abstractC8429Fds) {
    }
}
