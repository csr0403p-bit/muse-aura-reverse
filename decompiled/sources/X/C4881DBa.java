package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.DBa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4881DBa<T, E> implements DB6 {
    public final Map<T, T> A00;
    public final G0U<G0V<? super T, ? super E, Unit>, Function0<Unit>> A01;
    public final G0V<T, E, String> A02;
    public final boolean A03;

    @Override // X.DB6
    public final String getName() {
        return "PointWatching";
    }

    @Override // X.DB6
    public final DBA install(G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0) {
        boolean z = this.A03;
        Function0<Unit> function0Invoke = this.A01.invoke(new EZ7(new C4883DBc(this.A00, function0, g0u, g0u2, this.A02, z), 5));
        if (!z) {
            g0u.invoke("PointsMatched:Initial");
        }
        return new C4882DBb(function0Invoke);
    }

    /* JADX WARN: Incorrect types in method signature: (ZLjava/util/Map<TT;+TT;>;LX/G0U<-LX/G0V<-TT;-TE;Lkotlin/Unit;>;+Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;>;LX/G0V<-TT;-TE;Ljava/lang/String;>;)V */
    public C4881DBa(Map map, G0U g0u, G0V g0v, boolean z) {
        AnonymousClass003.A0x(map, g0u);
        this.A03 = z;
        this.A00 = map;
        this.A01 = g0u;
        this.A02 = g0v;
    }
}
