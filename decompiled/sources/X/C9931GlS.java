package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GlS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9931GlS {
    public final int A00;
    public final HashMap<String, AbstractC9915Gl5> A01;
    public final AbstractC9944Glx A02;
    public final AbstractC9915Gl5[] A03;

    public static C9931GlS A00(AbstractC9904Gkk abstractC9904Gkk, AbstractC9944Glx abstractC9944Glx, AbstractC9915Gl5[] abstractC9915Gl5Arr, boolean z) {
        int length = abstractC9915Gl5Arr.length;
        AbstractC9915Gl5[] abstractC9915Gl5Arr2 = new AbstractC9915Gl5[length];
        for (int i = 0; i < length; i++) {
            AbstractC9915Gl5 abstractC9915Gl5A04 = abstractC9915Gl5Arr[i];
            if (!abstractC9915Gl5A04.A0N()) {
                abstractC9915Gl5A04 = abstractC9915Gl5A04.A04(abstractC9904Gkk.A0G(abstractC9915Gl5A04, abstractC9915Gl5A04._type));
            }
            abstractC9915Gl5Arr2[i] = abstractC9915Gl5A04;
        }
        return new C9931GlS(abstractC9904Gkk, abstractC9944Glx, abstractC9915Gl5Arr2, z, false);
    }

    public final C9939Gli A01(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, C10035GoB c10035GoB) {
        return new C9939Gli(abstractC9916Gl7, abstractC9904Gkk, null, c10035GoB, this.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.AbstractC9904Gkk r9, X.C9939Gli r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9931GlS.A02(X.Gkk, X.Gli):java.lang.Object");
    }

    public C9931GlS(AbstractC9904Gkk abstractC9904Gkk, AbstractC9944Glx abstractC9944Glx, AbstractC9915Gl5[] abstractC9915Gl5Arr, boolean z, boolean z2) {
        AbstractC9970Gmj abstractC9970GmjAHe;
        this.A02 = abstractC9944Glx;
        this.A01 = z ? new Hpz(abstractC9904Gkk._config._base._locale) : BV4.A0u();
        int length = abstractC9915Gl5Arr.length;
        this.A00 = length;
        this.A03 = new AbstractC9915Gl5[length];
        if (z2) {
            C9898Gke c9898Gke = abstractC9904Gkk._config;
            for (AbstractC9915Gl5 abstractC9915Gl5 : abstractC9915Gl5Arr) {
                if (!(abstractC9915Gl5 instanceof C9936Glf) || !((C9936Glf) abstractC9915Gl5)._ignorable) {
                    List<C10009Gnh> listA0b = ((GmW) abstractC9915Gl5).A00;
                    if (listA0b == null) {
                        AbstractC9910Gks abstractC9910GksA02 = c9898Gke.A02();
                        listA0b = (abstractC9910GksA02 == null || (abstractC9970GmjAHe = abstractC9915Gl5.AHe()) == null || (listA0b = abstractC9910GksA02.A0b(abstractC9970GmjAHe)) == null) ? Collections.EMPTY_LIST : listA0b;
                        ((GmW) abstractC9915Gl5).A00 = listA0b;
                    }
                    if (!listA0b.isEmpty()) {
                        Iterator<C10009Gnh> it = listA0b.iterator();
                        while (it.hasNext()) {
                            this.A01.put(it.next()._simpleName, abstractC9915Gl5);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < length; i++) {
            AbstractC9915Gl5 abstractC9915Gl52 = abstractC9915Gl5Arr[i];
            this.A03[i] = abstractC9915Gl52;
            if (!(abstractC9915Gl52 instanceof C9936Glf) || !((C9936Glf) abstractC9915Gl52)._ignorable) {
                this.A01.put(abstractC9915Gl52._propName._simpleName, abstractC9915Gl52);
            }
        }
    }
}
