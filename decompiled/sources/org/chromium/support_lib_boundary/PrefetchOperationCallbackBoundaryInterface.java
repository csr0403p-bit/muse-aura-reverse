package org.chromium.support_lib_boundary;

/* loaded from: classes3.dex */
public interface PrefetchOperationCallbackBoundaryInterface extends FeatureFlagHolderBoundaryInterface {

    /* renamed from: org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        @Deprecated
        public static void $default$onSuccess(PrefetchOperationCallbackBoundaryInterface prefetchOperationCallbackBoundaryInterface) {
            throw new UnsupportedOperationException("http://crbug.com/483041824 Replaced by onResult.");
        }
    }

    void onFailure(int i, String str, int i2);

    void onResult(int i);

    @Deprecated
    void onSuccess();
}
