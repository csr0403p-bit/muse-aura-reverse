package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class Ao4 {
    public final Aeh A00;
    public final C0919AHv A01;

    /* JADX WARN: Incorrect types in method signature: (LX/Alc;LX/Ab0<LX/An1;>;)V */
    public Ao4(Ab0 ab0, C1562Alc c1562Alc) {
        this.A01 = c1562Alc.A04;
        List listA0C = c1562Alc.A0C(false, true);
        this.A00 = new Aeh(listA0C.size());
        int size = listA0C.size();
        for (int i = 0; i < size; i++) {
            C1562Alc c1562Alc2 = (C1562Alc) listA0C.get(i);
            if (ab0.A05(c1562Alc2.A01)) {
                this.A00.A07(c1562Alc2.A01);
            }
        }
    }
}
