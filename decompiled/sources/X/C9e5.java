package X;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.9e5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9e5 {
    public final String A05;
    public List<? extends Annotation> A00 = C0881AGi.A00;
    public final List<String> A03 = new ArrayList();
    public final Set<String> A06 = new HashSet();
    public final List<C9iZ> A02 = new ArrayList();
    public final List<List<Annotation>> A01 = new ArrayList();
    public final List<Boolean> A04 = new ArrayList();

    public static final void A00(String str, List list, C9e5 c9e5, C9iZ c9iZ, boolean z) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(c9iZ, 1);
        if (!c9e5.A06.add(str)) {
            throw new IllegalArgumentException(FGI.A0d("Element with name '", str, "' is already registered in ", c9e5.A05));
        }
        c9e5.A03.add(str);
        c9e5.A02.add(c9iZ);
        c9e5.A01.add(list);
        c9e5.A04.add(Boolean.valueOf(z));
    }

    public C9e5(String str) {
        this.A05 = str;
    }
}
