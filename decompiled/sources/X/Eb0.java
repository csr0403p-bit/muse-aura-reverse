package X;

import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Eb0 {
    public C0G A00;
    public final String A01;
    public final Map<Class<?>, Object> A02;
    public final C6844Eaw A03;
    public final C6854EbC A04;
    public final C6853EbB A05;

    /* JADX WARN: Incorrect types in method signature: (LX/EbC;Ljava/lang/String;LX/Eaw;LX/EbB;Ljava/util/Map<Ljava/lang/Class<*>;+Ljava/lang/Object;>;)V */
    public Eb0(String str, Map map, C6844Eaw c6844Eaw, C6854EbC c6854EbC, C6853EbB c6853EbB) {
        C7384Etj.A0Y(map, 4);
        this.A04 = c6854EbC;
        this.A01 = str;
        this.A03 = c6844Eaw;
        this.A05 = c6853EbB;
        this.A02 = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Request{method=");
        sbA0x.append(this.A01);
        sbA0x.append(", url=");
        sbA0x.append(this.A04);
        C6844Eaw c6844Eaw = this.A03;
        if (c6844Eaw.A00.length / 2 != 0) {
            sbA0x.append(", headers=[");
            Iterator<HxE<? extends String, ? extends String>> it = c6844Eaw.iterator();
            int i = 0;
            while (it.hasNext()) {
                HxE<? extends String, ? extends String> next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                HxE<? extends String, ? extends String> hxE = next;
                String str = (String) hxE.first;
                String str2 = (String) hxE.second;
                if (i > 0) {
                    C8j3.A1K(sbA0x);
                }
                sbA0x.append(str);
                sbA0x.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
                sbA0x.append(str2);
                i = i2;
            }
            sbA0x.append(']');
        }
        Map<Class<?>, Object> map = this.A02;
        if (!map.isEmpty()) {
            sbA0x.append(", tags=");
            sbA0x.append(map);
        }
        return C8j3.A15(sbA0x);
    }
}
