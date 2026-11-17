package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.BeM;
import X.C0Yr;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import X.HqA;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;

/* loaded from: classes2.dex */
public final class HatchPictureInPictureModeKt$rememberIsInPictureInPictureMode$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ComponentActivity $activity;
    public final /* synthetic */ MutableState<Boolean> $isInPictureInPicture$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPictureInPictureModeKt$rememberIsInPictureInPictureMode$1$1(ComponentActivity componentActivity, MutableState<Boolean> mutableState) {
        super(1);
        this.$activity = componentActivity;
        this.$isInPictureInPicture$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final MutableState<Boolean> mutableState = this.$isInPictureInPicture$delegate;
        final BeM<HqA> beM = new BeM() { // from class: com.facebook.aura.ui.HatchPictureInPictureModeKt$rememberIsInPictureInPictureMode$1$1$listener$1
            @Override // X.BeM
            public final void accept(HqA hqA) {
                C7384Etj.A0Y(hqA, 0);
                MutableState.A09(hqA.A01, mutableState);
            }
        };
        this.$activity.addOnPictureInPictureModeChangedListener(beM);
        final ComponentActivity componentActivity = this.$activity;
        return new C78g() { // from class: com.facebook.aura.ui.HatchPictureInPictureModeKt$rememberIsInPictureInPictureMode$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                componentActivity.removeOnPictureInPictureModeChangedListener(beM);
            }
        };
    }
}
