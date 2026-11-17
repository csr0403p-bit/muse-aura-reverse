package X;

import android.os.Build;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class E9Y extends CLi {
    public final /* synthetic */ E9b A00;

    public E9Y(E9b e9b) {
        this.A00 = e9b;
    }

    public static Set<int[]> A00() {
        try {
            Object objA0d = BV5.A0d("getEmojiConsistencySet", Class.forName("android.text.EmojiConsistency"));
            if (objA0d == null) {
                return Collections.EMPTY_SET;
            }
            Set<int[]> set = (Set) objA0d;
            Iterator<int[]> it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    @Override // X.CLi
    public final void A02(CPK cpk) {
        E9b e9b = this.A00;
        if (cpk == null) {
            e9b.A00.A07(C60O.A0i("metadataRepo cannot be null"));
            return;
        }
        e9b.A03 = cpk;
        CPK cpk2 = e9b.A03;
        E9X e9x = e9b.A00;
        e9b.A02 = new E9T(e9x.A01, e9x.A03, cpk2, Build.VERSION.SDK_INT >= 34 ? E9c.A00() : A00());
        e9x.A04();
    }
}
