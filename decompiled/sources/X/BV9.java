package X;

import androidx.work.impl.foreground.SystemForegroundService;
import com.facebook.aura.partners.voice.session.impl.EmbodimentFillDrawer;
import com.facebook.common.dextricks.DexStore;
import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class BV9 {
    public static long A01(long j, long j2, int i) {
        long j3 = j << i;
        BigInteger bigInteger = EXL.A00;
        long j4 = j3 & 4294967295L;
        long j5 = j3 >>> 32;
        long j6 = j2 & 4294967295L;
        long j7 = j2 >>> 32;
        long j8 = j5 * j7;
        long j9 = j7 * j4;
        return j8 + ((((j5 * j6) + ((j4 * j6) >>> 32)) + (4294967295L & j9)) >>> 32) + (j9 >>> 32);
    }

    public static long A02(FDW fdw, long j) {
        return AbstractC5463Diy.A01(Hus.A00(fdw.A0F(35), 0.0f, Float.intBitsToFloat((int) (j >> 32))), Hus.A00(fdw.A0F(36), 0.0f, AbstractC5463Diy.A00(j)));
    }

    public static void A05(DexStore.Config.Builder builder) {
        builder.mMode = (byte) 0;
        builder.mSync = (byte) 0;
        builder.mDalvikVerify = (byte) 0;
        builder.mDalvikOptimize = (byte) 0;
        builder.mDalvikRegisterMaps = (byte) 0;
        builder.mArtFilter = (byte) 0;
        builder.mArtHugeMethodMax = -1;
        builder.mArtLargeMethodMax = -1;
        builder.mArtSmallMethodMax = -1;
        builder.mArtTinyMethodMax = -1;
        builder.mArtTruncatedDexSize = -1;
        builder.mEnableArtVerifyNone = false;
        builder.mEnableDex2OatQuickening = false;
        builder.mEnableQuickening = false;
        builder.mEnableMixedMode = false;
        builder.mEnableMixedModeClassPath = false;
        builder.mEnableMixedModePgo = false;
        builder.mPgoCompilerFilter = (byte) 0;
        builder.mDoPeriodicPgoCompilation = false;
        builder.mMinTimeBetweenPgoCompilationMs = 0L;
        builder.mMultidexCompilationStrategy = (byte) 0;
        builder.mLegacyFlags = 0;
        builder.mHenosisFlags = 0;
    }

    public static void A06(C5627DmA c5627DmA) {
        c5627DmA.A0k.set(null);
        Integer andSet = c5627DmA.A0l.getAndSet(null);
        if (andSet != null) {
            int iIntValue = andSet.intValue();
            c5627DmA.A0e.set(iIntValue);
            C5645DmZ c5645DmZ = c5627DmA.A16;
            if (c5645DmZ != null) {
                c5645DmZ.A08.set(iIntValue);
            }
        }
    }

    public static int A00(EmbodimentFillDrawer embodimentFillDrawer, int i, int i2, int i3) {
        int i4 = (i + i2) - i3;
        Float fInvoke = embodimentFillDrawer.focusY.invoke();
        return fInvoke != null ? ATD.A04(((i2 / 2) + i) - Ab3.A01(i3 * (1.0f - fInvoke.floatValue())), Math.min(i4, i), i) : i4;
    }

    public static void A04(EKZ ekz, int i) {
        InterfaceC6632ELc interfaceC6632ELc = ekz.A01;
        if (interfaceC6632ELc != null) {
            SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC6632ELc;
            systemForegroundService.A02 = true;
            EK9.A00().A02(SystemForegroundService.A04, "Shutting down.");
            systemForegroundService.stopForeground(true);
            SystemForegroundService.A03 = null;
            systemForegroundService.stopSelf(i);
        }
    }

    public static void A07(AbstractMap abstractMap, float f, float f2, boolean z, boolean z2) {
        abstractMap.put("has_enough_bandwidth", Boolean.valueOf(z));
        abstractMap.put("has_bad_vsr_score", Boolean.valueOf(z2));
        abstractMap.put("max_speed", Float.valueOf(f));
        abstractMap.put("min_speed", Float.valueOf(f2));
    }

    public static String A03(Object obj, Throwable th) {
        String strA0U = FGI.A0U(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
        Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strA0U), th);
        return FGI.A0h("<", strA0U, " threw ", th.getClass().getName(), ">");
    }
}
