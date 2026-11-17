package com.facebook.aura.vds.compose.accessibility;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BBI;
import X.BFM;
import X.C00q;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import android.content.ContentResolver;
import android.provider.Settings;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;

/* loaded from: classes3.dex */
public abstract class ReducedMotionKt {
    public static final float readAnimatorDurationScale(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static final float rememberAnimatorDurationScale(boolean z, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        float fAFn;
        bfm.AgE(-1805057195);
        if ((i2 & 1) != 0) {
            z = false;
        }
        ContentResolver contentResolver = AnonymousClass002.A0H(bfm).getContentResolver();
        if (z) {
            bbiA0M = AnonymousClass002.A0M(bfm, -1468124147);
            boolean zA65 = bfm.A65(contentResolver);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                C7384Etj.A0X(contentResolver);
                objAaT = new ParcelableSnapshotMutableFloatState(readAnimatorDurationScale(contentResolver));
                bfm.Ai0(objAaT);
            }
            C00q c00q = (C00q) objAaT;
            boolean zA1J = AnonymousClass003.A1J(bfm, c00q, contentResolver);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == C78N.A00) {
                objAaT2 = new ReducedMotionKt$rememberAnimatorDurationScale$2$1(contentResolver, c00q);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, contentResolver);
            fAFn = c00q.AFn();
        } else {
            boolean zA1Y = AnonymousClass001.A1Y(contentResolver, bfm, -1468196222);
            Object objAaT3 = bfm.AaT();
            if (zA1Y || objAaT3 == C78N.A00) {
                C7384Etj.A0X(contentResolver);
                objAaT3 = Float.valueOf(readAnimatorDurationScale(contentResolver));
                bfm.Ai0(objAaT3);
            }
            fAFn = AnonymousClass001.A02(objAaT3);
            bbiA0M = C3cG.A07(bfm);
        }
        BBI.A0R(bbiA0M, false);
        return fAFn;
    }
}
