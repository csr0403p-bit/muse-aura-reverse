package X;

import com.facebook.aura.app.noopbindings.infra.NoOpInfraBindingsKt;

/* renamed from: X.F5z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7612F5z {
    public static Object A00(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        switch (i & 16383) {
            case 0:
                return new C9576GPk();
            case 1:
                return new NoOpInfraBindingsKt.AnonymousClass1();
            case 2:
                return new C10431HcW();
            case 3:
                return new HgM();
            case 4:
                return new HgO();
            case 5:
                return HgS.A00;
            default:
                throw new RuntimeException("Nested Switch Binding Exception: ".concat(String.valueOf(i)));
        }
    }
}
