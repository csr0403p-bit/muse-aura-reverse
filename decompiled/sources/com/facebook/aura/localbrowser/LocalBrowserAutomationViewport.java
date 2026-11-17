package com.facebook.aura.localbrowser;

import X.Ab3;
import X.AnonymousClass007;

/* loaded from: classes2.dex */
public final class LocalBrowserAutomationViewport {
    public static final int $stable = 0;
    public final double density;
    public final int densityDpi;
    public final long size;

    public final double getDensity() {
        return this.density;
    }

    public final int getDensityDpi() {
        return this.densityDpi;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m1210getSizeYbymL2g() {
        return this.size;
    }

    public LocalBrowserAutomationViewport(int i) {
        this.densityDpi = i;
        double d = i / 160.0d;
        this.density = d;
        this.size = AnonymousClass007.A0C(Ab3.A00(384.0d * d), Ab3.A00(832.0d * d));
    }
}
