package X;

import com.facebook.aura.iap.HatchIapBloksManagerProvider;
import com.facebook.aura.iap.iac.AuraIacBottomSheetLauncher;
import com.facebook.aura.maps.HatchNativeMapRenderer;

/* renamed from: X.8j6, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8j6 {
    public static Object A00(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        switch (i & 16383) {
            case 0:
                return HatchNativeMapRenderer.INSTANCE;
            case 1:
                return new AuraIacBottomSheetLauncher();
            case 2:
                return new HatchIapBloksManagerProvider();
            default:
                throw new RuntimeException("Nested Switch Binding Exception: ".concat(String.valueOf(i)));
        }
    }
}
