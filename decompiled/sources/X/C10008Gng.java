package X;

import java.util.List;

/* renamed from: X.Gng, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10008Gng {
    public final List<AbstractC9915Gl5> A00;

    public final void A00(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, C9913Gl1 c9913Gl1, Object obj) {
        Class<?> cls = abstractC9904Gkk._view;
        List<AbstractC9915Gl5> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC9915Gl5 abstractC9915Gl5 = list.get(i);
            if (cls == null || abstractC9915Gl5.A0R(cls)) {
                C9926GlN c9926GlNA11 = c9913Gl1.A11(abstractC9916Gl7.A1R());
                c9926GlNA11.A1P();
                abstractC9915Gl5.A0K(obj, c9926GlNA11, abstractC9904Gkk);
            }
        }
    }

    public C10008Gng() {
        this.A00 = C3cG.A0h();
    }

    public C10008Gng(List<AbstractC9915Gl5> list) {
        this.A00 = list;
    }
}
