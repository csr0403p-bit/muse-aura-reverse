package X;

import X.InterfaceC4391Cut;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.Cov, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4185Cov<R extends InterfaceC4391Cut, A extends Api.AnyClient> extends BasePendingResult<R> implements InterfaceC4374CuU<R> {
    public final C4378CuY<A> A00;
    public final C4240CrC<?> A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4185Cov(C4240CrC<?> c4240CrC, AbstractC4272Cry abstractC4272Cry) {
        super(abstractC4272Cry);
        CRy.A04(abstractC4272Cry, "GoogleApiClient must not be null");
        CRy.A04(c4240CrC, "Api must not be null");
        this.A00 = c4240CrC.A01;
        this.A01 = c4240CrC;
    }
}
