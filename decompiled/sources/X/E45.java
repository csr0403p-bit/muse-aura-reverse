package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public final class E45 {
    public final E5C A00;
    public final E4X A01;
    public final E4W A02;
    public final E4V A03;
    public final ImmutableList<E5I> A04;

    /* JADX WARN: Incorrect types in method signature: (LX/E5C;Ljava/util/List<LX/E5I;>;LX/E4X;LX/E4W;LX/E4V;)V */
    public E45(E5C e5c, E4X e4x, E4W e4w, E4V e4v, List list) {
        this.A00 = e5c;
        this.A04 = list != null ? ImmutableList.copyOf((Collection) list) : ImmutableList.of();
        this.A01 = e4x;
        this.A02 = e4w;
        this.A03 = e4v;
    }
}
