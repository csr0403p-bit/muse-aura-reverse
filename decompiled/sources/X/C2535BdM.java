package X;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.BdM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2535BdM implements InterfaceC2794BlU {
    public final C2538BdP A03;
    public int A00 = 0;
    public final Map<String, List<String>> A05 = BV4.A0u();
    public Set<Set<String>> A02 = C60O.A13();
    public final List<InterfaceC2694Bhu> A04 = C3cG.A0h();
    public List<InterfaceC2546BdX> A01 = C3cG.A0h();

    @Override // X.InterfaceC2794BlU
    public final void AIS(String str) {
        Map<String, List<String>> map = this.A05;
        if (map.containsKey(str)) {
            Iterator it = BV4.A0z(str, map).iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                Iterator<InterfaceC2546BdX> it2 = this.A01.iterator();
                while (it2.hasNext()) {
                    InterfaceC2544BdV interfaceC2544BdVAGM = ((InterfaceC2544BdV) it2.next()).AGM();
                    BeS.A06(interfaceC2544BdVAGM instanceof C2532BdJ, "CameraInfo doesn't contain Camera2 implementation.");
                    if (strA0j.equals(((C2532BdJ) interfaceC2544BdVAGM).A05.A00.A08)) {
                        return;
                    }
                }
            }
        }
    }

    public C2535BdM(C2538BdP c2538BdP) {
        this.A03 = c2538BdP;
        Set<Set<String>> setA13 = C60O.A13();
        try {
            setA13 = c2538BdP.A00.ADq();
        } catch (CameraAccessExceptionCompat unused) {
            AbstractC2875Bni.A02("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator<Set<String>> it = setA13.iterator();
        while (it.hasNext()) {
            ArrayList arrayListA0t = BV4.A0t(it.next());
            if (arrayListA0t.size() >= 2) {
                String str = (String) arrayListA0t.get(0);
                String str2 = (String) arrayListA0t.get(1);
                try {
                    C2538BdP c2538BdP2 = this.A03;
                    if (AbstractC2499BcQ.A00(c2538BdP2, str) && AbstractC2499BcQ.A00(c2538BdP2, str2)) {
                        this.A02.add(BV5.A0v(new String[]{str, str2}));
                        Map<String, List<String>> map = this.A05;
                        if (!map.containsKey(str)) {
                            map.put(str, C3cG.A0h());
                        }
                        if (!map.containsKey(str2)) {
                            map.put(str2, C3cG.A0h());
                        }
                        BV4.A0z(str, map).add(arrayListA0t.get(1));
                        BV4.A0z(str2, map).add(arrayListA0t.get(0));
                    }
                } catch (InitializationException unused2) {
                    AbstractC2875Bni.A01("Camera2CameraCoordinator", FGI.A0h("Concurrent camera id pair: (", str, ", ", str2, ") is not backward compatible"));
                }
            }
        }
    }
}
