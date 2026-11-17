package X;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.video.heroplayer.common.MosScoreCalculation;

/* renamed from: X.Dla, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5595Dla {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final C5815Dpz A06;
    public final AbrContextAwareConfiguration A07;
    public final C5092DXa A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final int A0F;
    public final boolean A0G;
    public volatile int A0H;
    public volatile int A0I;
    public volatile String A0J;
    public volatile String A0K;
    public volatile boolean A0L;

    public static final int A01(C5595Dla c5595Dla, C6154Dwx[] c6154DwxArr) {
        int i;
        int i2;
        if (!BV7.A1Z(c6154DwxArr[0].A0X, "audio")) {
            int i3 = c5595Dla.A0F;
            if (i3 > 0) {
                int iA05 = c5595Dla.A05(c6154DwxArr);
                i = Integer.MAX_VALUE;
                int i4 = 0;
                for (C6154Dwx c6154Dwx : c6154DwxArr) {
                    float fA00 = MosScoreCalculation.A00(c6154Dwx, iA05, c5595Dla.A07.abrSetting.usePlaybackCsvqm);
                    if (fA00 > 0.0f) {
                        if (fA00 >= i3 && (i2 = c6154Dwx.A05) < i) {
                            i = i2;
                        }
                        int i5 = c6154Dwx.A05;
                        if (i5 > i4) {
                            i4 = i5;
                        }
                    }
                }
                int i6 = i4;
                if (i == Integer.MAX_VALUE) {
                    return i6;
                }
            }
            return 0;
        }
        i = Integer.MAX_VALUE;
        for (C6154Dwx c6154Dwx2 : c6154DwxArr) {
            if (c6154Dwx2.A05 < i) {
                i = c6154Dwx2.A05;
            }
        }
        return i;
    }

    public static C6154Dwx A02(C6154Dwx[] c6154DwxArr, int i) {
        for (C6154Dwx c6154Dwx : c6154DwxArr) {
            if (c6154Dwx.A05 == i) {
                return c6154Dwx;
            }
        }
        return null;
    }

    public static int A00(Context context, C6154Dwx[] c6154DwxArr, float f, float f2, boolean z, boolean z2, boolean z3) {
        C6154Dwx c6154Dwx;
        int i;
        WindowManager windowManager;
        Display defaultDisplay;
        Display.Mode mode;
        if (context == null) {
            return Integer.MAX_VALUE;
        }
        int length = c6154DwxArr.length;
        if (length != 0) {
            C6154Dwx c6154Dwx2 = c6154DwxArr[0];
            if (c6154Dwx2.A0Q < c6154Dwx2.A0D) {
                f = f2;
            }
        }
        if (f < 1.0f) {
            f = 1.0f;
        }
        int physicalWidth = C60Q.A0B(context).widthPixels;
        int physicalHeight = C60Q.A0B(context).heightPixels;
        if (z && (windowManager = (WindowManager) context.getSystemService("window")) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null && (mode = defaultDisplay.getMode()) != null) {
            if (z2) {
                physicalWidth = Math.min(physicalWidth, mode.getPhysicalWidth());
                physicalHeight = Math.min(physicalHeight, mode.getPhysicalHeight());
            } else {
                physicalWidth = mode.getPhysicalWidth();
                physicalHeight = mode.getPhysicalHeight();
            }
        }
        return (int) (((!z3 || physicalWidth <= physicalHeight || length <= 0 || (i = (c6154Dwx = c6154DwxArr[0]).A0D) <= 0) ? physicalWidth : Math.min(physicalWidth, (physicalHeight * c6154Dwx.A0Q) / i)) * f);
    }

    public static boolean A03(C5595Dla c5595Dla, String str, String str2) {
        return "fb_stories".equalsIgnoreCase(str) || (c5595Dla.A0G && ("fb_shorts_viewer".equalsIgnoreCase(str2) || "fb_shorts_native_in_feed_unit".equalsIgnoreCase(str2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01dc A[PHI: r5
  0x01dc: PHI (r5v1 int) = (r5v0 int), (r5v12 int) binds: [B:16:0x002a, B:18:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[PHI: r5
  0x002c: PHI (r5v12 int) = (r5v0 int), (r5v13 int) binds: [B:16:0x002a, B:14:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A04(X.C6154Dwx r26, java.util.ArrayList r27, X.C6154Dwx[] r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5595Dla.A04(X.Dwx, java.util.ArrayList, X.Dwx[], int, int):int");
    }

    public final int A05(C6154Dwx[] c6154DwxArr) {
        Context context = this.A05;
        if (context == null || c6154DwxArr.length == 0 || c6154DwxArr[0].A0D <= 0) {
            return 0;
        }
        float f = C60Q.A0B(context).widthPixels;
        C6154Dwx c6154Dwx = c6154DwxArr[0];
        return (int) (f / Math.max(1.0f, c6154Dwx.A0Q / c6154Dwx.A0D));
    }

    public C5595Dla(Context context, C5815Dpz c5815Dpz, AbrContextAwareConfiguration abrContextAwareConfiguration, C5092DXa c5092DXa) {
        this.A08 = c5092DXa;
        this.A05 = context;
        this.A06 = c5815Dpz;
        this.A07 = abrContextAwareConfiguration;
        this.A02 = abrContextAwareConfiguration.getMaxWidthCell();
        this.A03 = abrContextAwareConfiguration.getMaxWidthInlinePlayer();
        this.A09 = abrContextAwareConfiguration.getBypassWidthLimitsStories();
        this.A0A = abrContextAwareConfiguration.getBypassWidthLimitsStoriesPrefetch();
        this.A0B = abrContextAwareConfiguration.getBypassWidthLimitsSponsoredVerticalVideos();
        this.A00 = abrContextAwareConfiguration.getScreenWidthMultiplierLandscapeVideo();
        this.A01 = abrContextAwareConfiguration.getScreenWidthMultiplierPortraitVideo();
        C5686DnS c5686DnS = abrContextAwareConfiguration.abrSetting;
        this.A04 = c5686DnS.maxWidthSphericalVideo;
        this.A0F = c5686DnS.minMosConstraintLimit;
        this.A0G = c5686DnS.treatShortFormAsStories;
        this.A0E = c5686DnS.enablePhysicalDisplaySize;
        this.A0C = c5686DnS.clampPhysicalDisplaySizeToRenderSurface;
        this.A0D = c5686DnS.enableLandscapeDisplayFix;
    }
}
