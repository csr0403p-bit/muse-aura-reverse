package X;

import android.view.View;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* renamed from: X.Fe1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8437Fe1 implements InterfaceC8451FeF {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FragmentTransitionSupport A01;
    public final /* synthetic */ ArrayList A02;

    public C8437Fe1(View view, FragmentTransitionSupport fragmentTransitionSupport, ArrayList arrayList) {
        this.A01 = fragmentTransitionSupport;
        this.A00 = view;
        this.A02 = arrayList;
    }

    @Override // X.InterfaceC8451FeF
    public final void AWo(AbstractC8429Fds abstractC8429Fds) {
    }

    @Override // X.InterfaceC8451FeF
    public final void AWq() {
    }

    @Override // X.InterfaceC8451FeF
    public final void AWr() {
    }

    @Override // X.InterfaceC8451FeF
    public final void AWp(AbstractC8429Fds abstractC8429Fds) {
        abstractC8429Fds.A0Z(this);
        this.A00.setVisibility(8);
        ArrayList arrayList = this.A02;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC7607F5u.A0d(arrayList, i).setVisibility(0);
        }
    }

    @Override // X.InterfaceC8451FeF
    public final /* synthetic */ void AWs(AbstractC8429Fds abstractC8429Fds) {
        abstractC8429Fds.A0Z(this);
        abstractC8429Fds.A0Y(this);
    }
}
