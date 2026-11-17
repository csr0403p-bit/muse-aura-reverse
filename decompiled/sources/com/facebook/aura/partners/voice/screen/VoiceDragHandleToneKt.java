package com.facebook.aura.partners.voice.screen;

import X.AQY;
import X.ATD;
import X.AWx;
import X.AaC;
import X.Ab3;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B10;
import X.BLU;
import X.C2J7;
import X.C7384Etj;
import X.C8j3;
import X.EGb;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import com.facebook.aura.partners.voice.ui.EmbodimentReferenceFramingKt;

/* loaded from: classes4.dex */
public abstract class VoiceDragHandleToneKt {
    public static final Rect pixelRegion(float f, float f2, float f3, float f4, Bitmap bitmap) {
        int iA04 = ATD.A04((int) f, 0, bitmap.getWidth() - 1);
        int iA042 = ATD.A04((int) f2, 0, bitmap.getHeight() - 1);
        return new Rect(iA04, iA042, ATD.A04(Ab3.A01(f3), iA04 + 1, bitmap.getWidth()), ATD.A04(Ab3.A01(f4), iA042 + 1, bitmap.getHeight()));
    }

    /* renamed from: prefersOnLightArt-JqoCqck, reason: not valid java name */
    public static final boolean m1767prefersOnLightArtJqoCqck(Bitmap bitmap, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, BLU blu, long j, long j2, int i, VoiceDragHandleCandidates voiceDragHandleCandidates) {
        int iIntValue = i;
        AaC aaCA02 = EmbodimentReferenceFramingKt.m1801embodimentReferenceBoundse4CFRc8((C8j3.A0P(bitmap.getHeight()) & 4294967295L) | (C8j3.A0P(bitmap.getWidth()) << 32), AQY.A01(blu.A01()), referenceFraming, false, 0.0f).A02(blu.A01, blu.A03);
        long jA0M = AnonymousClass005.A0M(AnonymousClass001.A00(j2), AnonymousClass001.A01(j2, 4294967295L));
        AaC aaCA00 = C2J7.A00(AWx.A04(j, AnonymousClass005.A0L(AnonymousClass001.A00(jA0M) / 2.0f, AnonymousClass001.A01(jA0M, 4294967295L) / 2.0f)), j2);
        if (!aaCA02.A05() && aaCA02.A06(aaCA00.A00())) {
            AaC aaCA04 = aaCA00.A04(aaCA02);
            float f = aaCA04.A01;
            float f2 = aaCA02.A01;
            float f3 = aaCA02.A02 - f2;
            float f4 = aaCA04.A03;
            float f5 = aaCA02.A03;
            float f6 = aaCA02.A00 - f5;
            Integer numRegionMeanColor = regionMeanColor(bitmap, pixelRegion(((f - f2) / f3) * bitmap.getWidth(), ((f4 - f5) / f6) * bitmap.getHeight(), ((aaCA04.A02 - f2) / f3) * bitmap.getWidth(), ((aaCA04.A00 - f5) / f6) * bitmap.getHeight(), bitmap));
            if (numRegionMeanColor != null) {
                iIntValue = numRegionMeanColor.intValue();
            }
        }
        int iA05 = EGb.A05(iIntValue, 255);
        return EGb.A01(voiceDragHandleCandidates.onLightArt, iA05) >= EGb.A01(voiceDragHandleCandidates.onDarkArt, iA05);
    }

    public static final Integer regionMeanColor(Bitmap bitmap, Rect rect) {
        int iWidth = rect.width() * rect.height();
        int[] iArr = new int[iWidth];
        bitmap.getPixels(iArr, 0, rect.width(), rect.left, rect.top, rect.width(), rect.height());
        long jRed = 0;
        long jGreen = 0;
        long jBlue = 0;
        int i = 0;
        for (int i2 = 0; i2 < iWidth; i2++) {
            if (Color.alpha(iArr[i2]) != 0) {
                jRed += Color.red(r11);
                jGreen += Color.green(r11);
                jBlue += Color.blue(r11);
                i++;
            }
        }
        if (i == 0) {
            return null;
        }
        long j = i;
        return Integer.valueOf(Color.rgb((int) (jRed / j), (int) (jGreen / j), (int) (jBlue / j)));
    }

    public static final VoiceDragHandleTones measureDragHandleTones(VoiceDragHandleToneSource voiceDragHandleToneSource, VoiceDragHandleRestingGeometry voiceDragHandleRestingGeometry, int i, VoiceDragHandleCandidates voiceDragHandleCandidates) {
        Bitmap bitmapCopy;
        boolean zA1b = AnonymousClass004.A1b(voiceDragHandleToneSource, voiceDragHandleRestingGeometry);
        C7384Etj.A0Y(voiceDragHandleCandidates, 3);
        Bitmap bitmapA00 = B10.A00(voiceDragHandleToneSource.still.still);
        VoiceDragHandleTones voiceDragHandleTonesMeasureDragHandleTones = null;
        if (!bitmapA00.isRecycled()) {
            if (bitmapA00.getConfig() == Bitmap.Config.HARDWARE) {
                bitmapCopy = bitmapA00.copy(Bitmap.Config.ARGB_8888, zA1b);
                if (bitmapCopy != null) {
                }
            } else {
                bitmapCopy = bitmapA00;
            }
            try {
                voiceDragHandleTonesMeasureDragHandleTones = measureDragHandleTones(bitmapCopy, voiceDragHandleToneSource, voiceDragHandleRestingGeometry, i, voiceDragHandleCandidates);
                if (bitmapCopy != bitmapA00) {
                    bitmapCopy.recycle();
                    return voiceDragHandleTonesMeasureDragHandleTones;
                }
            } catch (Throwable th) {
                if (bitmapCopy != bitmapA00) {
                    bitmapCopy.recycle();
                }
                throw th;
            }
        }
        return voiceDragHandleTonesMeasureDragHandleTones;
    }

    public static final VoiceDragHandleTones measureDragHandleTones(Bitmap bitmap, VoiceDragHandleToneSource voiceDragHandleToneSource, VoiceDragHandleRestingGeometry voiceDragHandleRestingGeometry, int i, VoiceDragHandleCandidates voiceDragHandleCandidates) {
        AaC aaC = voiceDragHandleRestingGeometry.halfScreenMedia;
        AaC aaC2 = voiceDragHandleRestingGeometry.fullScreenMedia;
        int iA01 = Ab3.A01(aaC.A02 - aaC.A01);
        float f = aaC2.A02;
        float f2 = aaC2.A01;
        int iA012 = Ab3.A01(f - f2);
        float f3 = aaC2.A00;
        float f4 = aaC2.A03;
        int iA013 = Ab3.A01(f3 - f4);
        if (iA01 > 0 && iA012 > 0 && iA013 > 0) {
            BLU bluCallAvatarFrameBounds = VoiceEmbodimentBackdropKt.callAvatarFrameBounds(iA01, iA01, voiceDragHandleToneSource.liveCropTopFraction);
            int iA014 = Ab3.A01(aaC.A01);
            int iA015 = Ab3.A01(aaC.A03);
            BLU blu = new BLU(bluCallAvatarFrameBounds.A01 + iA014, bluCallAvatarFrameBounds.A03 + iA015, bluCallAvatarFrameBounds.A02 + iA014, bluCallAvatarFrameBounds.A00 + iA015);
            BLU bluCallAvatarFullScreenFrameBounds = VoiceEmbodimentBackdropKt.callAvatarFullScreenFrameBounds(iA012, iA013);
            int iA016 = Ab3.A01(f2);
            int iA017 = Ab3.A01(f4);
            BLU blu2 = new BLU(bluCallAvatarFullScreenFrameBounds.A01 + iA016, bluCallAvatarFullScreenFrameBounds.A03 + iA017, bluCallAvatarFullScreenFrameBounds.A02 + iA016, bluCallAvatarFullScreenFrameBounds.A00 + iA017);
            VoiceEmbodimentMedia.ReferenceFraming referenceFraming = voiceDragHandleToneSource.still.framing;
            return new VoiceDragHandleTones(m1767prefersOnLightArtJqoCqck(bitmap, referenceFraming, blu, voiceDragHandleRestingGeometry.halfScreenHandleCenter, voiceDragHandleRestingGeometry.sampleSize, i, voiceDragHandleCandidates), m1767prefersOnLightArtJqoCqck(bitmap, referenceFraming, blu2, voiceDragHandleRestingGeometry.fullScreenHandleCenter, voiceDragHandleRestingGeometry.sampleSize, i, voiceDragHandleCandidates));
        }
        return null;
    }
}
