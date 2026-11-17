package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public final class E4V {
    public final ImmutableList<E5B> A00;
    public final int[] A01;

    public E4V(List<E5B> list, int[] iArr) {
        this.A00 = ImmutableList.copyOf((Collection) list);
        this.A01 = iArr;
    }
}
