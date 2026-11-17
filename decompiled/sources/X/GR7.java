package X;

import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GR7 extends GRD {
    public final G4z A00;
    public final Map<Long, McfReference> A01;

    /* JADX WARN: Multi-variable type inference failed */
    public GR7(Map<Long, ? extends McfReference> map) {
        this.A01 = map;
        this.A00 = new G4z(map);
    }
}
