package X;

import android.util.Log;
import java.util.UUID;

/* renamed from: X.BYu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2392BYu implements InterfaceC2393BYv {
    @Override // X.InterfaceC2393BYv
    public final InterfaceC6174DxH A2z(UUID uuid) {
        InterfaceC2393BYv interfaceC2393BYv = C5394Dhl.A03;
        C1H.A00(interfaceC2393BYv);
        InterfaceC6174DxH interfaceC6174DxHA2z = interfaceC2393BYv.A2z(uuid);
        C1H.A00(interfaceC6174DxHA2z);
        if (!"L3".isEmpty()) {
            try {
                interfaceC6174DxHA2z.AeI("securityLevel", "L3");
                return interfaceC6174DxHA2z;
            } catch (Exception e) {
                Log.w("HeroExoDrmProvider", FGI.A0M("Unable to set DRM security level ", "L3"), e);
            }
        }
        return interfaceC6174DxHA2z;
    }
}
