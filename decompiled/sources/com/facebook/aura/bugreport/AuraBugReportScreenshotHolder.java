package com.facebook.aura.bugreport;

import java.io.File;

/* loaded from: classes.dex */
public final class AuraBugReportScreenshotHolder {
    public static final int $stable = 0;
    public static final AuraBugReportScreenshotHolder INSTANCE = new AuraBugReportScreenshotHolder();
    public static File screenshotFile;

    public final File consumeScreenshot() {
        File file = screenshotFile;
        screenshotFile = null;
        return file;
    }

    public final void setScreenshot(File file) {
        screenshotFile = file;
    }
}
