package com.facebook.aura.partners.voice.screen;

import X.C7384Etj;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.graphics.Rect;
import android.util.Rational;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class HatchSystemPipControllerKt {
    public static final Rational HatchSystemPipAspectRatio = new Rational(1, 1);

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<android.app.RemoteAction> buildHatchSystemPipActions(android.content.Context r5, boolean r6, boolean r7, java.lang.String r8, java.lang.String r9) {
        /*
            r0 = 0
            X.AnonymousClass005.A12(r5, r8, r9, r0)
            if (r6 != 0) goto Lb
            r4 = 2131231331(0x7f080263, float:1.807874E38)
            if (r7 == 0) goto Le
        Lb:
            r4 = 2131231332(0x7f080264, float:1.8078742E38)
        Le:
            r0 = 2131231429(0x7f0802c5, float:1.8078939E38)
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithResource(r5, r0)
            com.facebook.aura.partners.voice.background.HatchSystemPipActionIntents r1 = com.facebook.aura.partners.voice.background.HatchSystemPipActionIntents.INSTANCE
            android.app.PendingIntent r0 = r1.endCall(r5)
            android.app.RemoteAction r3 = new android.app.RemoteAction
            r3.<init>(r2, r9, r9, r0)
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithResource(r5, r4)
            android.app.PendingIntent r0 = r1.toggleMute(r5)
            android.app.RemoteAction r1 = new android.app.RemoteAction
            r1.<init>(r2, r8, r8, r0)
            r0 = r7 ^ 1
            r1.setEnabled(r0)
            android.app.RemoteAction[] r0 = new android.app.RemoteAction[]{r3, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.HatchSystemPipControllerKt.buildHatchSystemPipActions(android.content.Context, boolean, boolean, java.lang.String, java.lang.String):java.util.List");
    }

    public static final PictureInPictureParams buildHatchSystemPipParams(boolean z, Rect rect, List<RemoteAction> list) {
        PictureInPictureParams.Builder seamlessResizeEnabled = new PictureInPictureParams.Builder().setAspectRatio(HatchSystemPipAspectRatio).setActions(list).setAutoEnterEnabled(z).setSeamlessResizeEnabled(false);
        C7384Etj.A0U(seamlessResizeEnabled);
        if (rect != null && !rect.isEmpty()) {
            seamlessResizeEnabled.setSourceRectHint(rect);
        }
        PictureInPictureParams pictureInPictureParamsBuild = seamlessResizeEnabled.build();
        C7384Etj.A0U(pictureInPictureParamsBuild);
        return pictureInPictureParamsBuild;
    }

    public static final Rational getHatchSystemPipAspectRatio() {
        return HatchSystemPipAspectRatio;
    }
}
