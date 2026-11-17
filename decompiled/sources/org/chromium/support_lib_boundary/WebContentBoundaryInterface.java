package org.chromium.support_lib_boundary;

import android.content.Context;
import android.webkit.WebView;
import java.util.function.Function;

/* loaded from: classes6.dex */
public interface WebContentBoundaryInterface {
    void destroy();

    <T extends WebView> T executeViewFactory(Context context, Function<Context, T> function);
}
