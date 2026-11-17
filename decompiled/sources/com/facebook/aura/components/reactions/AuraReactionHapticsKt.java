package com.facebook.aura.components.reactions;

import X.ATD;
import X.Ab3;
import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AbstractC7607F5u;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BV6;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C8j3;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.common.ui.StaggeredEntranceKt;
import com.facebook.aura.identity.datr.MC;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class AuraReactionHapticsKt {
    public static final float CLICK_SHARPNESS = 0.5f;
    public static final int HUM_TICK_INTERVAL_MS = 40;
    public static final float HUM_TICK_SCALE = 0.6f;
    public static final int MAX_AMPLITUDE = 255;
    public static final float MIN_PRIMITIVE_SCALE = 0.05f;
    public static final int TRANSIENT_PULSE_MS = 10;
    public static final int WAVEFORM_STEP_MS = 10;

    public static final HapticBeat tap(int i, float f, float f2) {
        return new HapticBeat(i, f, f2, 0);
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraReactionAnimation.values().length];
            try {
                AnonymousClass002.A13(AuraReactionAnimation.NONE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraReactionAnimation.COLOR_SCATTER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraReactionAnimation.GLYPH_SCATTER, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraReactionAnimation.SPRINKLE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AuraReactionAnimation.HEART, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(AuraReactionAnimation.HEART_SCATTER, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(AuraReactionAnimation.CONFETTI, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(AuraReactionAnimation.FIRE_SMOKE, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(AuraReactionAnimation.LAUGH, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(AuraReactionAnimation.AWKWARD, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(AuraReactionAnimation.REDLINE, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(AuraReactionAnimation.SALUTE, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                C60Q.A1C(AuraReactionAnimation.TEAR_JEWEL, iArr);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                C60Q.A1D(AuraReactionAnimation.TINY_WATERFALL, iArr);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AuraReactionAnimation.SINGLE_TEAR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AuraReactionAnimation.HEART_EYES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[AuraReactionAnimation.LITTLE_WISH.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[AuraReactionAnimation.BLESSING_BLOOM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[AuraReactionAnimation.SINGLE_CLAP.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[AuraReactionAnimation.THINKING_DOTS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[AuraReactionAnimation.FLEX.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[AuraReactionAnimation.LIGHTNING_LATCH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[AuraReactionAnimation.MICRO_LAUNCH.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[AuraReactionAnimation.PRESSURE_RELEASE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[AuraReactionAnimation.MELT_REFORM.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[AuraReactionAnimation.GATHERED_HEART.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[AuraReactionAnimation.RIBBON_ARC.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[AuraReactionAnimation.SHOOTING_STAR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[AuraReactionAnimation.CROWN_DROP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[AuraReactionAnimation.VICTORY_GLEAM.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[AuraReactionAnimation.DISCO_FLASH.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[AuraReactionAnimation.SECRET_GOAT.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[AuraReactionAnimation.DOUBLE_TAKE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[AuraReactionAnimation.CELEBRATION_BLAST.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[AuraReactionAnimation.SUNSET_WASH.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final HapticBeat hum(int i, int i2, float f, float f2) {
        return new HapticBeat(i, f, f2, i2);
    }

    public static final int primitiveFor(float f) {
        return f >= 0.5f ? 1 : 7;
    }

    public static final boolean supportsPrimitives(Vibrator vibrator) {
        return Build.VERSION.SDK_INT >= 30 && vibrator.areAllPrimitivesSupported(1, 7);
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

    public static final VibrationEffect buildComposition(List<HapticBeat> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (HapticBeat hapticBeat : list) {
            int i = hapticBeat.durationMs;
            int i2 = hapticBeat.timeMs;
            if (i <= 0) {
                arrayListA0h.add(new HapticPulse(i2, primitiveFor(hapticBeat.sharpness), hapticBeat.intensity));
            } else {
                for (int i3 = i2; i3 < i2 + i; i3 += 40) {
                    arrayListA0h.add(new HapticPulse(i3, 7, hapticBeat.intensity * 0.6f));
                }
            }
        }
        if (arrayListA0h.size() > 1) {
            AbstractC06907md.A04(arrayListA0h, new Comparator() { // from class: com.facebook.aura.components.reactions.AuraReactionHapticsKt$buildComposition$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return Integer.valueOf(((HapticPulse) t).timeMs).compareTo(Integer.valueOf(((HapticPulse) t2).timeMs));
                }
            });
        }
        VibrationEffect.Composition compositionStartComposition = VibrationEffect.startComposition();
        C7384Etj.A0U(compositionStartComposition);
        Iterator it = arrayListA0h.iterator();
        C7384Etj.A0U(it);
        int i4 = 0;
        while (it.hasNext()) {
            HapticPulse hapticPulse = (HapticPulse) C7384Etj.A0F(it);
            compositionStartComposition.addPrimitive(hapticPulse.primitive, ATD.A03(hapticPulse.scale, 0.05f, 1.0f), AbstractC7607F5u.A0D(hapticPulse.timeMs, i4, 0));
            i4 = hapticPulse.timeMs;
        }
        VibrationEffect vibrationEffectCompose = compositionStartComposition.compose();
        C7384Etj.A0U(vibrationEffectCompose);
        return vibrationEffectCompose;
    }

    public static final VibrationEffect buildEffect(Vibrator vibrator, List<HapticBeat> list) {
        return supportsPrimitives(vibrator) ? buildComposition(list) : buildWaveform(list);
    }

    public static final VibrationEffect buildWaveform(List<HapticBeat> list) {
        int iEndMs = (endMs(list) / 10) + 1;
        int[] iArr = new int[iEndMs];
        for (HapticBeat hapticBeat : list) {
            int iA02 = Ab3.A02(hapticBeat.intensity, 255.0f);
            if (iA02 < 1) {
                iA02 = 1;
            } else if (iA02 > 255) {
                iA02 = 255;
            }
            int i = hapticBeat.timeMs;
            int iMax = i + Math.max(hapticBeat.durationMs, 10);
            for (int i2 = i / 10; i2 < iEndMs && i2 * 10 < iMax; i2++) {
                iArr[i2] = Math.max(iArr[i2], iA02);
            }
        }
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (int i3 = 0; i3 < iEndMs; i3++) {
            int i4 = iArr[i3];
            if (arrayListA0h2.isEmpty() || AnonymousClass001.A0F(AbstractC0878AGe.A0H(arrayListA0h2)) != i4) {
                BV6.A1R(arrayListA0h, 10L);
                C60Q.A1P(arrayListA0h2, i4);
            } else {
                arrayListA0h.set(C8j3.A0K(arrayListA0h), Long.valueOf(C3cG.A05(AbstractC0878AGe.A0H(arrayListA0h)) + 10));
            }
        }
        VibrationEffect vibrationEffectCreateWaveform = VibrationEffect.createWaveform(AbstractC0878AGe.A0o(arrayListA0h), AbstractC0878AGe.A0n(arrayListA0h2), -1);
        C7384Etj.A0U(vibrationEffectCreateWaveform);
        return vibrationEffectCreateWaveform;
    }

    public static final int endMs(List<HapticBeat> list) {
        Iterator<HapticBeat> it = list.iterator();
        if (!it.hasNext()) {
            return 0;
        }
        HapticBeat next = it.next();
        Integer numValueOf = Integer.valueOf(next.timeMs + Math.max(next.durationMs, 10));
        while (it.hasNext()) {
            HapticBeat next2 = it.next();
            Integer numValueOf2 = Integer.valueOf(next2.timeMs + Math.max(next2.durationMs, 10));
            if (numValueOf.compareTo(numValueOf2) < 0) {
                numValueOf = numValueOf2;
            }
        }
        return numValueOf.intValue();
    }

    public static final long getAURA_REACTION_HAPTIC_MAX_MS() {
        Iterator<AuraReactionAnimation> it = AuraReactionAnimation.getEntries().iterator();
        if (!it.hasNext()) {
            throw C8j3.A1D();
        }
        List<HapticBeat> listScoreFor = scoreFor(it.next());
        int iEndMs = listScoreFor != null ? endMs(listScoreFor) : 0;
        while (it.hasNext()) {
            List<HapticBeat> listScoreFor2 = scoreFor(it.next());
            int iEndMs2 = listScoreFor2 != null ? endMs(listScoreFor2) : 0;
            if (iEndMs < iEndMs2) {
                iEndMs = iEndMs2;
            }
        }
        return iEndMs;
    }

    public static final void playAuraReactionHaptic(Context context, AuraReactionAnimation auraReactionAnimation) {
        Vibrator vibrator;
        AnonymousClass003.A0u(context, auraReactionAnimation);
        List<HapticBeat> listScoreFor = scoreFor(auraReactionAnimation);
        if (listScoreFor == null || (vibrator = vibrator(context)) == null || !vibrator.hasVibrator()) {
            return;
        }
        try {
            vibrator.vibrate(buildEffect(vibrator, listScoreFor));
        } catch (SecurityException unused) {
        }
    }

    public static final List<HapticBeat> scoreFor(AuraReactionAnimation auraReactionAnimation) {
        HapticBeat[] hapticBeatArr;
        HapticBeat hapticBeatTap;
        HapticBeat hapticBeatTap2;
        HapticBeat hapticBeatTap3;
        switch (auraReactionAnimation.ordinal()) {
            case 0:
            case 18:
            case 19:
                return null;
            case 1:
                hapticBeatArr = new HapticBeat[4];
                hapticBeatArr[0] = tap(0, 0.32f, 0.12f);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.24f, 0.82f, 170, 1);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.58f, 0.46f, 275, 2);
                hapticBeatTap = tap(335, 0.16f, 0.84f);
                hapticBeatArr[3] = hapticBeatTap;
                return Arrays.asList(hapticBeatArr);
            case 2:
            case 3:
                hapticBeatArr = new HapticBeat[4];
                hapticBeatArr[0] = new HapticBeat(80, 0.2f, 0.1f, AuraRedlineKt.REDLINE_GLYPH_DURATION_MS);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.74f, 0.24f, 170, 1);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.34f, 0.5f, 210, 2);
                hapticBeatTap = tap(270, 0.22f, 0.68f);
                hapticBeatArr[3] = hapticBeatTap;
                return Arrays.asList(hapticBeatArr);
            case 4:
                hapticBeatArr = new HapticBeat[4];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.64f, 0.28f, 70, 0);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.54f, 0.66f, 180, 1);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.25f, 0.92f, HatchMessageShareDocumentRenderer.MIN_CONTENT_HEIGHT_PX, 2);
                hapticBeatTap = tap(450, 0.17f, 0.88f);
                hapticBeatArr[3] = hapticBeatTap;
                return Arrays.asList(hapticBeatArr);
            case 5:
                hapticBeatArr = new HapticBeat[5];
                hapticBeatArr[0] = tap(0, 0.34f, 0.12f);
                hapticBeatArr[1] = new HapticBeat(80, 0.43f, 0.14f, InviteCodeScratcherKt.REVEAL_DURATION_MS);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.92f, 0.72f, 110, 2);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.45f, 0.9f, 260, 3);
                hapticBeatTap2 = tap(395, 0.36f, 0.82f);
                hapticBeatArr[4] = hapticBeatTap2;
                return Arrays.asList(hapticBeatArr);
            case 6:
                hapticBeatArr = new HapticBeat[4];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.34f, 0.72f, 50, 0);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.44f, 0.66f, 140, 1);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.35f, 0.72f, 240, 2);
                hapticBeatTap = tap(StaggeredEntranceKt.StaggeredEntranceDurationMs, 0.18f, 0.9f);
                hapticBeatArr[3] = hapticBeatTap;
                return Arrays.asList(hapticBeatArr);
            case 7:
                hapticBeatArr = new HapticBeat[5];
                hapticBeatArr[0] = new HapticBeat(0, 0.16f, 0.72f, StaggeredEntranceKt.StaggeredEntranceDurationMs);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.3f, 0.96f, 105, 1);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.38f, 0.88f, 210, 2);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.24f, 1.0f, 315, 3);
                hapticBeatTap2 = tap(420, 0.1f, 0.45f);
                hapticBeatArr[4] = hapticBeatTap2;
                return Arrays.asList(hapticBeatArr);
            case 8:
                hapticBeatArr = new HapticBeat[3];
                hapticBeatArr[0] = tap(0, 0.72f, 0.46f);
                hapticBeatArr[1] = new HapticBeat(160, 0.15f, 0.84f, 160);
                hapticBeatTap3 = tap(HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH, 0.24f, 0.9f);
                hapticBeatArr[2] = hapticBeatTap3;
                return Arrays.asList(hapticBeatArr);
            case 9:
                hapticBeatArr = new HapticBeat[]{tap(80, 0.4f, 0.52f), tap(270, 0.24f, 1.0f)};
                return Arrays.asList(hapticBeatArr);
            case 10:
                hapticBeatArr = new HapticBeat[3];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.2f, 0.3f, 120, 0);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.34f, 0.24f, 540, 1);
                hapticBeatTap3 = tap(660, 0.24f, 1.0f);
                hapticBeatArr[2] = hapticBeatTap3;
                return Arrays.asList(hapticBeatArr);
            case 11:
            case 20:
                hapticBeatArr = new HapticBeat[3];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.28f, 0.24f, 480, 0);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.34f, 0.28f, 600, 1);
                hapticBeatTap3 = tap(AuraHeartEyesKt.HEART_EYES_TOTAL_MS, 0.22f, 0.82f);
                hapticBeatArr[2] = hapticBeatTap3;
                return Arrays.asList(hapticBeatArr);
            case 12:
                hapticBeatArr = new HapticBeat[3];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.42f, 0.2f, 100, 0);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.56f, 0.16f, HatchMessageShareDocumentRenderer.MIN_CONTENT_HEIGHT_PX, 1);
                hapticBeatTap3 = tap(570, 0.24f, 0.76f);
                hapticBeatArr[2] = hapticBeatTap3;
                return Arrays.asList(hapticBeatArr);
            case 13:
                hapticBeatArr = new HapticBeat[3];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.26f, 0.32f, 100, 0);
                hapticBeatArr[1] = new HapticBeat(180, 0.1f, 0.5f, 260);
                hapticBeatTap3 = tap(InviteCodeScratcherKt.REVEAL_DURATION_MS, 0.24f, 1.0f);
                hapticBeatArr[2] = hapticBeatTap3;
                return Arrays.asList(hapticBeatArr);
            case 14:
                hapticBeatArr = new HapticBeat[4];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.44f, 0.38f, 60, 0);
                hapticBeatArr[1] = new HapticBeat(160, 0.2f, 0.5f, 420);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.28f, 0.88f, 420, 2);
                hapticBeatTap = tap(AuraPressureReleaseKt.PRESSURE_TOTAL_MS, 0.34f, 1.0f);
                hapticBeatArr[3] = hapticBeatTap;
                return Arrays.asList(hapticBeatArr);
            case 15:
                return Collections.singletonList(tap(220, 1.0f, 0.48f));
            case 16:
                hapticBeatArr = new HapticBeat[4];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.24f, 0.72f, 130, 0);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.3f, 0.72f, 290, 1);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.36f, 0.72f, 450, 2);
                hapticBeatTap = tap(AuraPressureReleaseKt.PRESSURE_TOTAL_MS, 0.18f, 0.38f);
                hapticBeatArr[3] = hapticBeatTap;
                return Arrays.asList(hapticBeatArr);
            case 17:
                hapticBeatArr = new HapticBeat[3];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.6f, 0.26f, 80, 0);
                hapticBeatArr[1] = new HapticBeat(120, 0.18f, 0.18f, 200);
                hapticBeatTap3 = tap(400, 0.46f, 0.36f);
                hapticBeatArr[2] = hapticBeatTap3;
                return Arrays.asList(hapticBeatArr);
            case 21:
                hapticBeatArr = new HapticBeat[3];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.24f, 1.0f, 40, 0);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.82f, 0.98f, 140, 1);
                hapticBeatTap3 = tap(220, 0.18f, 0.94f);
                hapticBeatArr[2] = hapticBeatTap3;
                return Arrays.asList(hapticBeatArr);
            case 22:
                hapticBeatArr = new HapticBeat[3];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.26f, 0.74f, 80, 0);
                hapticBeatArr[1] = new HapticBeat(100, 0.28f, 0.68f, AuraRedlineKt.REDLINE_GLYPH_DURATION_MS);
                hapticBeatTap3 = tap(540, 0.52f, 0.42f);
                hapticBeatArr[2] = hapticBeatTap3;
                return Arrays.asList(hapticBeatArr);
            case 23:
                hapticBeatArr = new HapticBeat[]{new HapticBeat(0, 0.28f, 0.05f, 110), tap(115, 1.0f, 0.58f), tap(185, 0.28f, 0.96f), tap(245, 0.2f, 0.9f), tap(325, 0.13f, 0.84f), tap(AuraLightningLatchKt.LIGHTNING_TOTAL_MS, 0.16f, 0.18f)};
                return Arrays.asList(hapticBeatArr);
            case 24:
                hapticBeatArr = new HapticBeat[3];
                hapticBeatArr[0] = new HapticBeat(40, 0.28f, 0.08f, 500);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.28f, 0.26f, 560, 1);
                hapticBeatTap3 = tap(690, 0.52f, 0.34f);
                hapticBeatArr[2] = hapticBeatTap3;
                return Arrays.asList(hapticBeatArr);
            case 25:
                hapticBeatArr = new HapticBeat[3];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.24f, 0.44f, 140, 0);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.28f, 0.4f, 270, 1);
                hapticBeatTap3 = tap(420, 0.58f, 0.16f);
                hapticBeatArr[2] = hapticBeatTap3;
                return Arrays.asList(hapticBeatArr);
            case 26:
                hapticBeatArr = new HapticBeat[4];
                hapticBeatArr[0] = new HapticBeat(40, 0.2f, 0.6f, InviteCodeScratcherKt.REVEAL_DURATION_MS);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.16f, 0.88f, 160, 1);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.2f, 0.92f, AuraRedlineKt.REDLINE_GLYPH_DURATION_MS, 2);
                hapticBeatTap = tap(InviteCodeScratcherKt.REVEAL_DURATION_MS, 0.26f, 0.96f);
                hapticBeatArr[3] = hapticBeatTap;
                return Arrays.asList(hapticBeatArr);
            case 27:
                hapticBeatArr = new HapticBeat[4];
                hapticBeatArr[0] = new HapticBeat(0, 0.22f, 0.74f, 480);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.18f, 0.92f, 160, 1);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.24f, 0.96f, HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH, 2);
                hapticBeatTap = tap(InviteCodeScratcherKt.REVEAL_DURATION_MS, 0.58f, 1.0f);
                hapticBeatArr[3] = hapticBeatTap;
                return Arrays.asList(hapticBeatArr);
            case 28:
                hapticBeatArr = new HapticBeat[3];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.72f, 0.3f, 290, 0);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.34f, 0.42f, 400, 1);
                hapticBeatTap3 = tap(540, 0.2f, 0.78f);
                hapticBeatArr[2] = hapticBeatTap3;
                return Arrays.asList(hapticBeatArr);
            case 29:
                hapticBeatArr = new HapticBeat[3];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.68f, 0.34f, 70, 0);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.22f, 0.9f, 260, 1);
                hapticBeatTap3 = tap(400, 0.32f, 1.0f);
                hapticBeatArr[2] = hapticBeatTap3;
                return Arrays.asList(hapticBeatArr);
            case 30:
                hapticBeatArr = new HapticBeat[4];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.4f, 0.88f, 60, 0);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.52f, 0.82f, 230, 1);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.46f, 0.92f, 400, 2);
                hapticBeatTap = tap(MC.hatch_datr_bridge_sessionless_android.__CONFIG__, 0.58f, 0.86f);
                hapticBeatArr[3] = hapticBeatTap;
                return Arrays.asList(hapticBeatArr);
            case 31:
                hapticBeatArr = new HapticBeat[4];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.48f, 0.42f, 90, 0);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.36f, 0.52f, 240, 1);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.66f, 0.56f, 500, 2);
                hapticBeatTap = tap(660, 0.2f, 0.96f);
                hapticBeatArr[3] = hapticBeatTap;
                return Arrays.asList(hapticBeatArr);
            case 32:
                hapticBeatArr = new HapticBeat[4];
                AbstractC7607F5u.A1U(hapticBeatArr, 0.42f, 0.96f, 50, 0);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.36f, 0.9f, 180, 1);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.58f, 1.0f, 450, 2);
                hapticBeatTap = tap(AuraPressureReleaseKt.PRESSURE_TOTAL_MS, 0.2f, 0.86f);
                hapticBeatArr[3] = hapticBeatTap;
                return Arrays.asList(hapticBeatArr);
            case 33:
                hapticBeatArr = new HapticBeat[4];
                hapticBeatArr[0] = tap(0, 0.58f, 0.42f);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.78f, 0.94f, 180, 1);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.28f, 0.92f, 290, 2);
                hapticBeatTap = tap(420, 0.2f, 0.86f);
                hapticBeatArr[3] = hapticBeatTap;
                return Arrays.asList(hapticBeatArr);
            case 34:
                hapticBeatArr = new HapticBeat[3];
                hapticBeatArr[0] = new HapticBeat(50, 0.32f, 0.0f, 960);
                AbstractC7607F5u.A1U(hapticBeatArr, 0.42f, 0.08f, 440, 1);
                hapticBeatTap3 = tap(920, 0.2f, 0.05f);
                hapticBeatArr[2] = hapticBeatTap3;
                return Arrays.asList(hapticBeatArr);
            default:
                throw C3cG.A0q();
        }
    }
}
