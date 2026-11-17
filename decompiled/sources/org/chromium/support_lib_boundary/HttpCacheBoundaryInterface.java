package org.chromium.support_lib_boundary;

/* loaded from: classes6.dex */
public interface HttpCacheBoundaryInterface {
    long getDefaultQuotaBytes();

    long getQuotaBytes();

    boolean isUsingDefaultQuota();

    void setQuotaBytes(long j);

    void useDefaultQuota();
}
