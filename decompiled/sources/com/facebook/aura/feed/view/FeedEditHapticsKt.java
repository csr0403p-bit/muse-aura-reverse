package com.facebook.aura.feed.view;

import X.AbstractC0878AGe;
import X.BV6;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class FeedEditHapticsKt {
    public static final int ZIP_PULSE_AMPLITUDE = 179;
    public static final long ZIP_PULSE_MS = 8;
    public static final int[] ZIP_TICK_DELAYS_MS = {35, 19, 18, 16, 18, 18, 22, 26, 39, 69};
    public static final float ZIP_TICK_SCALE = 0.7f;

    public static final void playFeedEditOpenHaptic(Context context) {
        C7384Etj.A0Y(context, 0);
        Vibrator vibrator = vibrator(context);
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        try {
            vibrator.vibrate(buildEditOpenEffect(vibrator));
        } catch (SecurityException unused) {
        }
    }

    public static final VibrationEffect buildZipWaveform(boolean z) {
        int length = ZIP_TICK_DELAYS_MS.length;
        int i = length * 2;
        ArrayList arrayListA11 = C60O.A11(i);
        ArrayList arrayListA112 = z ? C60O.A11(i) : null;
        for (int i2 = 0; i2 < length; i2++) {
            BV6.A1R(arrayListA11, r7[i2]);
            if (arrayListA112 != null) {
                C60Q.A1P(arrayListA112, 0);
            }
            BV6.A1R(arrayListA11, 8L);
            if (arrayListA112 != null) {
                C60Q.A1P(arrayListA112, ZIP_PULSE_AMPLITUDE);
            }
        }
        long[] jArrA0o = AbstractC0878AGe.A0o(arrayListA11);
        VibrationEffect vibrationEffectCreateWaveform = arrayListA112 != null ? VibrationEffect.createWaveform(jArrA0o, AbstractC0878AGe.A0n(arrayListA112), -1) : VibrationEffect.createWaveform(jArrA0o, -1);
        C7384Etj.A0X(vibrationEffectCreateWaveform);
        return vibrationEffectCreateWaveform;
    }

    public static final boolean supportsPrimitives(Vibrator vibrator) {
        return Build.VERSION.SDK_INT >= 30 && vibrator.areAllPrimitivesSupported(7);
    }

    public static final Vibrator vibrator(Context context) {
        if (Build.VERSION.SDK_INT < 31) {
            return (Vibrator) context.getSystemService(Vibrator.class);
        }
        VibratorManager vibratorManager = (VibratorManager) context.getSystemService(VibratorManager.class);
        if (vibratorManager != null) {
            return vibratorManager.getDefaultVibrator();
        }
        return null;
    }

    public static final VibrationEffect buildEditOpenEffect(Vibrator vibrator) {
        if (!supportsPrimitives(vibrator)) {
            return buildZipWaveform(vibrator.hasAmplitudeControl());
        }
        VibrationEffect.Composition compositionStartComposition = VibrationEffect.startComposition();
        C7384Etj.A0U(compositionStartComposition);
        for (int i : ZIP_TICK_DELAYS_MS) {
            compositionStartComposition.addPrimitive(7, 0.7f, i);
        }
        VibrationEffect vibrationEffectCompose = compositionStartComposition.compose();
        C7384Etj.A0U(vibrationEffectCompose);
        return vibrationEffectCompose;
    }
}
