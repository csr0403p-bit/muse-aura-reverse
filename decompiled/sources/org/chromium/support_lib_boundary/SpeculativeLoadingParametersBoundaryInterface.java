package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.Map;

/* loaded from: classes3.dex */
public interface SpeculativeLoadingParametersBoundaryInterface {

    /* renamed from: org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static Integer $default$getVariationsId(SpeculativeLoadingParametersBoundaryInterface speculativeLoadingParametersBoundaryInterface) {
            return null;
        }
    }

    Map<String, String> getAdditionalHeaders();

    InvocationHandler getNoVarySearchData();

    Integer getVariationsId();

    boolean isJavaScriptEnabled();
}
