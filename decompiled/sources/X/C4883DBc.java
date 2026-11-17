package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.DBc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4883DBc<T, E> {
    public final Ao0<T> A00 = new Ao0<>(0);
    public final Map<T, T> A01;
    public final Function0<Unit> A02;
    public final G0U<String, Unit> A03;
    public final G0U<String, Unit> A04;
    public final G0V<T, E, String> A05;
    public volatile boolean A06;

    /* JADX WARN: Incorrect types in method signature: (ZLjava/util/Map<TT;+TT;>;LX/G0U<-Ljava/lang/String;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/String;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/G0V<-TT;-TE;Ljava/lang/String;>;)V */
    public C4883DBc(Map map, Function0 function0, G0U g0u, G0U g0u2, G0V g0v, boolean z) {
        this.A01 = map;
        this.A04 = g0u;
        this.A03 = g0u2;
        this.A02 = function0;
        this.A05 = g0v;
        this.A06 = !z;
    }
}
