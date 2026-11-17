package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.Map;

/* loaded from: classes3.dex */
public interface WebViewNavigationBoundaryInterface extends IsomorphicObjectBoundaryInterface {
    boolean didCommit();

    boolean didCommitErrorPage();

    InvocationHandler getPage();

    Map<String, String> getResponseHeaders();

    int getStatusCode();

    String getUrl();

    InvocationHandler getWebResourceError();

    boolean isBack();

    boolean isForward();

    boolean isHistory();

    boolean isReload();

    boolean isRestore();

    boolean isSameDocument();

    boolean wasInitiatedByPage();
}
