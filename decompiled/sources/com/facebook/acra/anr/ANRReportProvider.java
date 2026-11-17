package com.facebook.acra.anr;

/* loaded from: classes5.dex */
public interface ANRReportProvider {
    void reportSoftError(String str, Throwable th);

    boolean shouldCollectAndUploadANRReports();
}
