package com.facebook.aura.ui.adaptive;

import X.Ab3;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C60Q;
import X.C7384Etj;
import X.C7438Evz;
import X.C8j3;
import X.G0V;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;

/* loaded from: classes4.dex */
public final class AuraDevice {
    public static final int $stable = 0;
    public static final AuraDevice INSTANCE = new AuraDevice();
    public static final int LARGE_SCREEN_SHORTEST_SIDE_DP = 600;

    /* renamed from: com.facebook.aura.ui.adaptive.AuraDevice$isLargeScreen$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0V<Integer, Integer, Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2, Ab3.class, "min", "min(II)I", 1);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2)));
        }

        public final Integer invoke(int i, int i2) {
            return Integer.valueOf(Math.min(i, i2));
        }
    }

    /* renamed from: com.facebook.aura.ui.adaptive.AuraDevice$supportsTwoPane$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C142531 extends C7438Evz implements G0V<Integer, Integer, Integer> {
        public static final C142531 INSTANCE = new C142531();

        public C142531() {
            super(2, Ab3.class, "max", "max(II)I", 1);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.max(AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2)));
        }

        public final Integer invoke(int i, int i2) {
            return Integer.valueOf(Math.max(i, i2));
        }
    }

    public final boolean isLargeScreen(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        return largestWindowSideDp(activity, AnonymousClass1.INSTANCE) >= 600.0f;
    }

    public final boolean supportsTwoPane(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        return largestWindowSideDp(activity, C142531.INSTANCE) >= 840.0f;
    }

    public final AuraDeviceType type(Context context) {
        C7384Etj.A0Y(context, 0);
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.watch") ? AuraDeviceType.Watch : packageManager.hasSystemFeature("android.hardware.type.automotive") ? AuraDeviceType.Automotive : hasHinge(packageManager) ? AuraDeviceType.Foldable : C8j3.A0Z(context).smallestScreenWidthDp >= 600 ? AuraDeviceType.Tablet : AuraDeviceType.Phone;
    }

    private final boolean hasHinge(PackageManager packageManager) {
        return Build.VERSION.SDK_INT >= 30 && packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    private final float largestWindowSideDp(Activity activity, G0V<? super Integer, ? super Integer, Integer> g0v) {
        Integer numValueOf;
        int iHeight;
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
            C7384Etj.A0U(bounds);
            numValueOf = Integer.valueOf(bounds.width());
            iHeight = bounds.height();
        } else {
            Point point = new Point();
            activity.getWindowManager().getDefaultDisplay().getRealSize(point);
            numValueOf = Integer.valueOf(point.x);
            iHeight = point.y;
        }
        return AnonymousClass007.A08(numValueOf, g0v, iHeight) / C60Q.A0B(activity).density;
    }
}
