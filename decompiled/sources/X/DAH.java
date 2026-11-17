package X;

import com.google.common.base.Function;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableSet;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public final class DAH<F, T> implements Function {
    public final /* synthetic */ C3432CNc A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ G0U<List<EEy>, T> A02;

    @Override // com.google.common.base.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Exception exc = (Exception) obj;
        G0U<List<EEy>, T> g0u = this.A02;
        Integer num = this.A01;
        C7384Etj.A0X(exc);
        return g0u.invoke(Collections.singletonList(new EEy(EFB.A02, RegularImmutableMap.A03, exc, exc instanceof TimeoutException ? C79.A0F : exc instanceof RejectedExecutionException ? C79.A0G : C79.A0H, num, RegularImmutableSet.A05)));
    }

    public DAH(C3432CNc c3432CNc, Integer num, G0U g0u) {
        this.A02 = g0u;
        this.A00 = c3432CNc;
        this.A01 = num;
    }
}
