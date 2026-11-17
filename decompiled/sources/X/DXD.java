package X;

import com.google.common.collect.ByFunctionOrdering;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.NaturalOrdering;
import java.util.List;

/* loaded from: classes5.dex */
public final class DXD {
    public final ImmutableList<E0J> A00;
    public static final DOM<E0J> A02 = new ByFunctionOrdering(new F5K(1), NaturalOrdering.A00);
    public static final DXD A01 = new DXD(ImmutableList.of());

    public DXD(List list) {
        this.A00 = ImmutableList.sortedCopyOf(A02, list);
    }
}
