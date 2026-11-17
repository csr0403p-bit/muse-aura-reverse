package com.facebook.traffic.nts.tasos.http_layer_bwe;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: classes6.dex */
public final class HttpLayerBweImpl implements HttpLayerBwe {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public HttpLayerBweImpl(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBwe
    public native BweStats getDownloadBwe();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBwe
    public native List<BucketStats> getDownloadBweByBucket();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBwe
    public native BweStats getUploadBwe();

    @Override // com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBwe
    public native List<BucketStats> getUploadBweByBucket();

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("http_layer_bwe");
    }
}
