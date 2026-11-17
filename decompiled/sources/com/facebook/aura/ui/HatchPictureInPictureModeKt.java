package com.facebook.aura.ui;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public abstract class HatchPictureInPictureModeKt {
    public static final boolean rememberIsInPictureInPictureMode(ComponentActivity componentActivity, BFM bfm, int i) {
        C7384Etj.A0Y(componentActivity, 0);
        boolean zA65 = bfm.A65(componentActivity);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = AnonymousClass005.A0S(bfm, componentActivity.isInPictureInPictureMode());
        }
        MutableState mutableState = (MutableState) objAaT;
        boolean zA1J = AnonymousClass003.A1J(bfm, mutableState, componentActivity);
        Object objAaT2 = bfm.AaT();
        if (zA1J || objAaT2 == C78N.A00) {
            objAaT2 = new HatchPictureInPictureModeKt$rememberIsInPictureInPictureMode$1$1(componentActivity, mutableState);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A17(bfm, objAaT2, componentActivity);
        return MutableState.A0A(mutableState);
    }
}
