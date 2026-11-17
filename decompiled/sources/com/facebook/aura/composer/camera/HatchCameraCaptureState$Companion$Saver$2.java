package com.facebook.aura.composer.camera;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BV3;
import X.C7384Etj;
import X.C8j2;
import X.G0U;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchCameraCaptureState$Companion$Saver$2 extends AbstractC7559F3s implements G0U<List<? extends Object>, HatchCameraCaptureState> {
    public static final HatchCameraCaptureState$Companion$Saver$2 INSTANCE = new HatchCameraCaptureState$Companion$Saver$2();

    public HatchCameraCaptureState$Companion$Saver$2() {
        super(1);
    }

    @Override // X.G0U
    public final HatchCameraCaptureState invoke(List<? extends Object> list) {
        C7384Etj.A0Y(list, 0);
        int i = HatchCameraCaptureState.$stable;
        Object obj = list.get(0);
        String strA00 = BV3.A00(0);
        C7384Etj.A0Z(obj, strA00);
        Object obj2 = list.get(1);
        C7384Etj.A0Z(obj2, strA00);
        Object obj3 = list.get(2);
        C7384Etj.A0Z(obj3, C8j2.A00(72));
        return new HatchCameraCaptureState((String) obj, (String) obj2, AnonymousClass001.A1X(obj3));
    }
}
