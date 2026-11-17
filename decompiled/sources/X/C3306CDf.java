package X;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.CDf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3306CDf {
    public static final AtomicInteger A03 = new AtomicInteger();
    public final EnumC3305CDe A00;
    public final Set<String> A01;
    public final F0C A02;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Set<Ljava/lang/String;>;LX/CDe;)V */
    public C3306CDf(EnumC3305CDe enumC3305CDe, Set set) {
        AnonymousClass003.A0u(set, enumC3305CDe);
        A03.getAndIncrement();
        this.A01 = set;
        this.A00 = enumC3305CDe;
        this.A02 = AbstractC5321DgF.A01(C79.A00, this, 17);
    }
}
