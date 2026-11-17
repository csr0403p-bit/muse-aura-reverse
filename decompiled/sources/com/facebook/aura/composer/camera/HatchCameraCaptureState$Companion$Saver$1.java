package com.facebook.aura.composer.camera;

import X.AbstractC7559F3s;
import X.C1bi;
import X.C7384Etj;
import X.G0V;
import androidx.compose.runtime.MutableState;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchCameraCaptureState$Companion$Saver$1 extends AbstractC7559F3s implements G0V<C1bi, HatchCameraCaptureState, List<? extends Object>> {
    public static final HatchCameraCaptureState$Companion$Saver$1 INSTANCE = new HatchCameraCaptureState$Companion$Saver$1();

    public HatchCameraCaptureState$Companion$Saver$1() {
        super(2);
    }

    @Override // X.G0V
    public final List<Object> invoke(C1bi c1bi, HatchCameraCaptureState hatchCameraCaptureState) {
        C7384Etj.A0Y(hatchCameraCaptureState, 1);
        int i = HatchCameraCaptureState.$stable;
        return Arrays.asList(hatchCameraCaptureState.ownerId, hatchCameraCaptureState.filename, Boolean.valueOf(MutableState.A0A(hatchCameraCaptureState.pending$delegate)));
    }
}
