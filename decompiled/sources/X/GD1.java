package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public interface GD1 {
    static <C extends GD4> GD7<C> A00(C c) {
        C7384Etj.A0Y(c, 0);
        GD4 gd4CopyWithOverrides = c;
        String strMo29getIdentifierDnvc6hM = c.mo29getIdentifierDnvc6hM();
        C7384Etj.A0Y(strMo29getIdentifierDnvc6hM, 0);
        GD4 gd4 = GD5.A00.get(new GD8(strMo29getIdentifierDnvc6hM));
        if (gd4 != null) {
            gd4CopyWithOverrides = c.copyWithOverrides(gd4.getBufferSize(), gd4.isActive(), gd4.getForwardToDebugLogs(), gd4.getMinLogLevel(), true);
        }
        GD0 gd0ComputeIfAbsent = GD0.A09.computeIfAbsent(new GD8(c.mo29getIdentifierDnvc6hM()), new C10653I0x(0, c, gd4CopyWithOverrides));
        C7384Etj.A0X(gd0ComputeIfAbsent);
        return gd0ComputeIfAbsent;
    }

    void A8B(Function0<String> function0);

    void A9n(Throwable th, Function0<String> function0);

    void A9o(Function0<String> function0);

    void ANP(Function0<String> function0);
}
