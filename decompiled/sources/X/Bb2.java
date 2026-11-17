package X;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class Bb2 {
    public static volatile Bb2 A08;
    public final DisplayManager A01;
    public static final Size A06 = BV6.A0P(1920, 1080);
    public static final Size A04 = BV6.A0P(HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH, 240);
    public static final Size A05 = BV6.A0P(640, 480);
    public static final Object A07 = C3cG.A0T();
    public volatile Size A03 = null;
    public final Bb1 A02 = new Bb1();
    public final C2413Ban A00 = new C2413Ban();

    public static Size A00(Bb2 bb2) {
        Point point = new Point();
        bb2.A02(false).getRealSize(point);
        Size sizeA0P = BV6.A0P(point.x, point.y);
        Size size = A04;
        Size size2 = AbstractC2484BcB.A00;
        if (BV7.A0B(sizeA0P) < BV7.A0B(size) && (bb2.A00.A00 == null || (sizeA0P = SmallDisplaySizeQuirk.A00.get(Build.MODEL.toUpperCase(Locale.US))) == null)) {
            sizeA0P = A05;
        }
        if (sizeA0P.getHeight() > sizeA0P.getWidth()) {
            sizeA0P = BV8.A0a(sizeA0P);
        }
        int iA0B = BV7.A0B(sizeA0P);
        Size size3 = A06;
        if (iA0B > BV7.A0B(size3)) {
            sizeA0P = size3;
        }
        if (bb2.A02.A00 != null && ExtraCroppingQuirk.A00()) {
            Size sizeA0P2 = BV6.A0P(1920, 1080);
            if (BV7.A0B(sizeA0P2) > BV7.A0B(sizeA0P)) {
                return sizeA0P2;
            }
        }
        return sizeA0P;
    }

    public static Bb2 A01(Context context) {
        if (A08 == null) {
            synchronized (A07) {
                if (A08 == null) {
                    A08 = new Bb2(context);
                }
            }
        }
        return A08;
    }

    public final Display A02(boolean z) {
        Display[] displays = this.A01.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display display = null;
        int i = -1;
        for (Display display2 : displays) {
            if (!z || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i2 = point.x * point.y;
                if (i2 > i) {
                    i = i2;
                    display = display2;
                }
            }
        }
        if (display != null) {
            return display;
        }
        if (z) {
            Display display3 = null;
            int i3 = -1;
            for (Display display4 : displays) {
                Point point2 = new Point();
                display4.getRealSize(point2);
                int i4 = point2.x * point2.y;
                if (i4 > i3) {
                    i3 = i4;
                    display3 = display4;
                }
            }
            if (display3 != null) {
                return display3;
            }
        }
        throw C60O.A0i("No display can be found from the input display manager!");
    }

    public Bb2(Context context) {
        this.A01 = (DisplayManager) context.getSystemService("display");
    }
}
