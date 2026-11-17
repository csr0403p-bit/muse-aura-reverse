package X;

import com.facebook.aura.startup.sessioninit.HatchSessionInitRepo;

/* renamed from: X.3cK, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3cK {
    public static Object A00(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        switch (i & 16383) {
            case 0:
                return new HatchSessionInitRepo();
            case 1:
                return C4JM.A00().getApplicationContext().getPackageManager();
            case 2:
                return C4JM.A00().getApplicationInfo();
            case 3:
                return C4JM.A00().getPackageName();
            default:
                throw new RuntimeException("Nested Switch Binding Exception: ".concat(String.valueOf(i)));
        }
    }
}
