package X;

import com.google.common.collect.BoundType;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: classes5.dex */
public interface DQ1 extends InterfaceC5026DPa, InterfaceC7431Evo {
    DQ1<E> A8u();

    NavigableSet<E> A9s();

    DPD ABd();

    /* JADX WARN: Incorrect types in method signature: (TE;Lcom/google/common/collect/BoundType;)LX/DQ1<TE;>; */
    DQ1 ANM(BoundType upperBound, Object boundType);

    DPD APT();

    DPD AY1();

    DPD AY2();

    /* JADX WARN: Incorrect types in method signature: (TE;Lcom/google/common/collect/BoundType;TE;Lcom/google/common/collect/BoundType;)LX/DQ1<TE;>; */
    DQ1 AgY(BoundType lowerBound, BoundType lowerBoundType, Object upperBound, Object upperBoundType);

    /* JADX WARN: Incorrect types in method signature: (TE;Lcom/google/common/collect/BoundType;)LX/DQ1<TE;>; */
    DQ1 Agk(BoundType lowerBound, Object boundType);

    Comparator<? super E> comparator();

    @Override // X.InterfaceC5026DPa
    Set entrySet();
}
