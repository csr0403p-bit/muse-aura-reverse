package androidx.camera.camera2.internal.compat.quirk;

import X.AbstractC2875Bni;
import X.AnonymousClass007;
import X.BV4;
import X.BX1;
import X.C2473Bc0;
import X.C2476Bc3;
import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class CamcorderProfileResolutionQuirk implements BX1 {
    public List<Size> A00 = null;
    public final C2473Bc0 A01;

    public final List<Size> A00() throws CloneNotSupportedException {
        if (this.A00 == null) {
            Size[] sizeArrA02 = this.A01.A02(34);
            List<Size> listAsList = sizeArrA02 != null ? Arrays.asList((Object[]) sizeArrA02.clone()) : Collections.EMPTY_LIST;
            this.A00 = listAsList;
            AbstractC2875Bni.A01("CamcorderProfileResolutionQuirk", AnonymousClass007.A0a("mSupportedResolutions = ", listAsList));
        }
        return BV4.A0t(this.A00);
    }

    public CamcorderProfileResolutionQuirk(C2476Bc3 c2476Bc3) {
        this.A01 = c2476Bc3.A01();
    }
}
