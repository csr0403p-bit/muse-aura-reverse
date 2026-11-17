package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public final class E00 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final ImmutableList<E0J> A03;

    public E00(List<E0J> list, long j, long j2) {
        this.A03 = ImmutableList.copyOf((Collection) list);
        this.A02 = j;
        this.A00 = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.A01 = j3;
    }
}
