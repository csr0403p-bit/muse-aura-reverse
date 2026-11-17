package com.facebook.traffic.nts.tasos.http_layer_bwe;

import java.util.List;

/* loaded from: classes6.dex */
public interface HttpLayerBwe {
    BweStats getDownloadBwe();

    List<BucketStats> getDownloadBweByBucket();

    BweStats getUploadBwe();

    List<BucketStats> getUploadBweByBucket();
}
