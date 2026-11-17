package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Gnm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10014Gnm extends AbstractC9922GlJ {
    public int A00;
    public final AbstractC9916Gl7[] A01;

    public C10014Gnm(AbstractC9916Gl7[] abstractC9916Gl7Arr) {
        ((AbstractC9922GlJ) this).A00 = abstractC9916Gl7Arr[0];
        this.A01 = abstractC9916Gl7Arr;
        this.A00 = 1;
    }

    public static C10014Gnm A0A(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9916Gl7 abstractC9916Gl72) {
        AbstractC9916Gl7[] abstractC9916Gl7Arr;
        if (abstractC9916Gl72 instanceof C10014Gnm) {
            ArrayList arrayListA0u = BV5.A0u(abstractC9916Gl7);
            ((C10014Gnm) abstractC9916Gl72).A0B(arrayListA0u);
            abstractC9916Gl7Arr = (AbstractC9916Gl7[]) arrayListA0u.toArray(new AbstractC9916Gl7[arrayListA0u.size()]);
        } else {
            abstractC9916Gl7Arr = new AbstractC9916Gl7[]{abstractC9916Gl7, abstractC9916Gl72};
        }
        return new C10014Gnm(abstractC9916Gl7Arr);
    }

    private final void A0B(List<AbstractC9916Gl7> list) {
        AbstractC9916Gl7[] abstractC9916Gl7Arr = this.A01;
        int length = abstractC9916Gl7Arr.length;
        for (int i = this.A00 - 1; i < length; i++) {
            AbstractC9916Gl7 abstractC9916Gl7 = abstractC9916Gl7Arr[i];
            if (abstractC9916Gl7 instanceof C10014Gnm) {
                ((C10014Gnm) abstractC9916Gl7).A0B(list);
            } else {
                list.add(abstractC9916Gl7);
            }
        }
    }
}
