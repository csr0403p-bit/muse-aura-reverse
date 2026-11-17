package com.facebook.aura.browsertask.control;

import X.C7384Etj;

/* loaded from: classes2.dex */
public abstract class BrowserTaskControlJsonKt {
    public static final BrowserViewerRequestJson toRequestJson(BrowserViewerPreference browserViewerPreference) {
        C7384Etj.A0Y(browserViewerPreference, 0);
        return new BrowserViewerRequestJson(new BrowserViewerJson(browserViewerPreference.width, browserViewerPreference.height, browserViewerPreference.devicePixelRatio));
    }
}
