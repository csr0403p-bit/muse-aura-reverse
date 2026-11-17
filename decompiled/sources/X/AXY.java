package X;

import java.util.Map;

/* loaded from: classes4.dex */
public interface AXY extends C3TF {
    /* JADX WARN: Incorrect types in method signature: (IILjava/util/Map<LX/Ak0;Ljava/lang/Integer;>;LX/G0U<-LX/AYU;Lkotlin/Unit;>;)LX/Abi; */
    InterfaceC1134Abi APV(Map map, G0U g0u, int i, int i2);

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/Map<LX/Ak0;Ljava/lang/Integer;>;LX/G0U<-LX/Amr;Lkotlin/Unit;>;LX/G0U<-LX/AYU;Lkotlin/Unit;>;)LX/Abi; */
    InterfaceC1134Abi APW(Map map, G0U g0u, G0U g0u2, int i, int i2);

    static InterfaceC1134Abi A00(AXY axy, Object obj, int i, int i2, int i3) {
        return axy.APV(C9jH.A00, new C2295BSv(obj, i), i2, i3);
    }

    static InterfaceC1134Abi A01(AXY axy, G0U g0u, int i, int i2) {
        return axy.APV(C9jH.A00, g0u, i, i2);
    }
}
