package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.aura.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AvV extends ViewGroup {
    public int A00;
    public final int A01;
    public final C2038Ax5 A02;
    public final List<B1Q> A03;
    public final List<B1Q> A04;

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final B1Q A00(AzW azW) {
        C2038Ax5 c2038Ax5 = this.A02;
        Map<AzW, B1Q> map = c2038Ax5.A01;
        B1Q b1qRemove = map.get(azW);
        if (b1qRemove == null) {
            List<B1Q> list = this.A04;
            C7384Etj.A0Y(list, 0);
            b1qRemove = list.isEmpty() ? null : list.remove(0);
            if (b1qRemove == null) {
                int i = this.A00;
                List<B1Q> list2 = this.A03;
                if (i > AnonymousClass002.A0E(list2)) {
                    b1qRemove = new B1Q(getContext());
                    addView(b1qRemove);
                    list2.add(b1qRemove);
                } else {
                    b1qRemove = list2.get(this.A00);
                    Map<B1Q, AzW> map2 = c2038Ax5.A00;
                    AzW azW2 = map2.get(b1qRemove);
                    if (azW2 != null) {
                        azW2.AVU();
                        B1Q b1q = map.get(azW2);
                        if (b1q != null) {
                            map2.remove(b1q);
                        }
                        map.remove(azW2);
                        b1qRemove.A00();
                    }
                }
                int i2 = this.A00;
                this.A00 = i2 < this.A01 + (-1) ? i2 + 1 : 0;
            }
            map.put(azW, b1qRemove);
            c2038Ax5.A00.put(b1qRemove, azW);
        }
        return b1qRemove;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    public AvV(Context context) {
        super(context);
        this.A01 = 5;
        ArrayList arrayListA0h = C3cG.A0h();
        this.A03 = arrayListA0h;
        ArrayList arrayListA0h2 = C3cG.A0h();
        this.A04 = arrayListA0h2;
        this.A02 = new C2038Ax5();
        setClipChildren(false);
        B1Q b1q = new B1Q(context);
        addView(b1q);
        arrayListA0h.add(b1q);
        arrayListA0h2.add(b1q);
        this.A00 = 1;
        setTag(R.id.hide_in_inspector_tag, true);
    }

    public final void A01(AzW azW) {
        azW.AVU();
        C2038Ax5 c2038Ax5 = this.A02;
        Map<AzW, B1Q> map = c2038Ax5.A01;
        B1Q b1q = map.get(azW);
        if (b1q != null) {
            b1q.A00();
            B1Q b1q2 = map.get(azW);
            if (b1q2 != null) {
                c2038Ax5.A00.remove(b1q2);
            }
            map.remove(azW);
            this.A04.add(b1q);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
