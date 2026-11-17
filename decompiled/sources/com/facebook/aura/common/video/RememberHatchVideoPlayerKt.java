package com.facebook.aura.common.video;

import X.AKO;
import X.BBI;
import X.BFM;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.common.video.HatchVideoPlayer;

/* loaded from: classes4.dex */
public abstract class RememberHatchVideoPlayerKt {
    public static final HatchVideoPlayer rememberHatchVideoPlayer(HatchVideoPlayer.RepeatMode repeatMode, boolean z, boolean z2, BFM bfm, int i, int i2) {
        if ((i2 & 1) != 0) {
            repeatMode = HatchVideoPlayer.RepeatMode.ONE;
        }
        boolean zA1J = C3cG.A1J(i2, z);
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        BBI bbi = (BBI) bfm;
        Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, bbi);
        Object objAaT = bfm.AaT();
        Object obj = objAaT;
        if (objAaT == C78N.A00) {
            new HatchVideoPlayerFactory();
            C7384Etj.A0Y(contextA00, 0);
            HatchVideoPlayerGroot hatchVideoPlayerGroot = new HatchVideoPlayerGroot(contextA00);
            if (zA1J) {
                hatchVideoPlayerGroot.disableAudio();
            } else {
                hatchVideoPlayerGroot.enableAudio();
            }
            hatchVideoPlayerGroot.setRepeatMode(repeatMode);
            hatchVideoPlayerGroot.setVideoScalingMode(HatchVideoPlayer.VideoScalingMode.SCALE_TO_FIT_WITH_CROPPING);
            hatchVideoPlayerGroot.setPlayWhenReadyFlag(z2);
            BBI.A0O(bbi, hatchVideoPlayerGroot);
            obj = hatchVideoPlayerGroot;
        }
        return (HatchVideoPlayer) obj;
    }
}
