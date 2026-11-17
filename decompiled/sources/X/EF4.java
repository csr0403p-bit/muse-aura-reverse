package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public final class EF4 {
    public final DAG A00;
    public final ImmutableList<EEy> A01;
    public final Integer A02;
    public final byte[] A03;

    public EF4(DAG dag, Integer num, List list, byte[] bArr) {
        this.A02 = num;
        this.A00 = dag;
        this.A03 = bArr;
        this.A01 = ImmutableList.copyOf((Collection) list);
    }
}
