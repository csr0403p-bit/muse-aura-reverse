package X;

import android.content.res.Resources;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.72w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC059772w {
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Ljava/lang/Integer;>;Landroid/content/res/Resources;)F */
    public static final float A00(Resources resources, List list) {
        float dimension = 0.0f;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dimension += resources.getDimension(C60Q.A03(it)) / resources.getDisplayMetrics().density;
        }
        return dimension;
    }

    public static final C76B A01(C76B c76b, float f) {
        C0881AGi c0881AGi = C0881AGi.A00;
        C73P c73p = new C73P(f, c0881AGi);
        return c76b.Agp(new C75R(new C73P(0.0f, c0881AGi), c73p, c73p, new C73P(0.0f, c0881AGi), c73p, c73p));
    }

    public static final C76B A02(C76B c76b, float f, float f2) {
        C0881AGi c0881AGi = C0881AGi.A00;
        return c76b.Agp(new C75R(new C73P(0.0f, c0881AGi), new C73P(f, c0881AGi), new C73P(f2, c0881AGi), new C73P(0.0f, c0881AGi), new C73P(f, c0881AGi), new C73P(f2, c0881AGi)));
    }

    public static final C76B A03(C76B c76b, float f, float f2, float f3, float f4) {
        C0881AGi c0881AGi = C0881AGi.A00;
        return c76b.Agp(new C75R(new C73P(0.0f, c0881AGi), new C73P(f, c0881AGi), new C73P(f2, c0881AGi), new C73P(0.0f, c0881AGi), new C73P(f3, c0881AGi), new C73P(f4, c0881AGi)));
    }
}
