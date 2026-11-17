package X;

import android.view.ViewConfiguration;

/* renamed from: X.AgM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1276AgM {
    public static final double A00;
    public static final double A01;
    public static final float A02 = ViewConfiguration.getScrollFriction();

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        A01 = dLog;
        A00 = dLog - 1.0d;
    }
}
