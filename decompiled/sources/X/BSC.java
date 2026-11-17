package X;

import android.content.Context;
import android.view.View;
import com.facebook.aura.R;

/* loaded from: classes4.dex */
public final class BSC implements View.OnAttachStateChangeListener {
    public final int $t;
    public final Object A00;

    public BSC(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.$t == 0) {
            C1548AlB c1548AlB = (C1548AlB) this.A00;
            Context context = view.getContext();
            if (c1548AlB.A00) {
                return;
            }
            context.getApplicationContext().registerComponentCallbacks(c1548AlB.A02);
            c1548AlB.A00 = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AbstractC1718Ap2 abstractC1718Ap2;
        Boolean bool;
        switch (this.$t) {
            case 0:
                C1548AlB c1548AlB = (C1548AlB) this.A00;
                Context context = view.getContext();
                if (c1548AlB.A00) {
                    context.getApplicationContext().unregisterComponentCallbacks(c1548AlB.A02);
                    c1548AlB.A00 = false;
                }
                C1548AlB.A00(c1548AlB);
                return;
            case 1:
                abstractC1718Ap2 = (AbstractC1718Ap2) this.A00;
                break;
            case 2:
                abstractC1718Ap2 = (AbstractC1718Ap2) this.A00;
                C7384Etj.A0Y(abstractC1718Ap2, 0);
                for (Object obj : AbstractC0875AGb.A0B(abstractC1718Ap2.getParent(), C1226Af4.A00)) {
                    if (obj instanceof View) {
                        View view2 = (View) obj;
                        C7384Etj.A0Y(view2, 0);
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        if ((tag instanceof Boolean) && (bool = (Boolean) tag) != null && bool.booleanValue()) {
                            return;
                        }
                    }
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((HoC) this.A00).A5w(null);
                return;
        }
        abstractC1718Ap2.A0C();
    }
}
