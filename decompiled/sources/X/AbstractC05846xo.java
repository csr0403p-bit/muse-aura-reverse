package X;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: X.6xo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC05846xo {
    public static final C6xG A00;

    static {
        C6xG c6xH;
        try {
            final WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface = (WebViewProviderFactoryBoundaryInterface) C7510EyX.A00(WebViewProviderFactoryBoundaryInterface.class, (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, WebView.getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null));
            c6xH = new C6xG(webViewProviderFactoryBoundaryInterface) { // from class: X.6xO
                public final WebViewProviderFactoryBoundaryInterface A00;

                @Override // X.C6xG
                public final WebViewProviderBoundaryInterface A85(WebView webView) {
                    return (WebViewProviderBoundaryInterface) C7510EyX.A00(WebViewProviderBoundaryInterface.class, this.A00.createWebView(webView));
                }

                @Override // X.C6xG
                public final ProfileStoreBoundaryInterface AJB() {
                    return (ProfileStoreBoundaryInterface) C7510EyX.A00(ProfileStoreBoundaryInterface.class, this.A00.getProfileStore());
                }

                @Override // X.C6xG
                public final StaticsBoundaryInterface AL2() {
                    return (StaticsBoundaryInterface) C7510EyX.A00(StaticsBoundaryInterface.class, this.A00.getStatics());
                }

                @Override // X.C6xG
                public final String[] AMi() {
                    return this.A00.getSupportedFeatures();
                }

                @Override // X.C6xG
                public final WebkitToCompatConverterBoundaryInterface AMj() {
                    return (WebkitToCompatConverterBoundaryInterface) C7510EyX.A00(WebkitToCompatConverterBoundaryInterface.class, this.A00.getWebkitToCompatConverter());
                }

                {
                    this.A00 = webViewProviderFactoryBoundaryInterface;
                }
            };
        } catch (ClassNotFoundException unused) {
            c6xH = new C6xH();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        A00 = c6xH;
    }
}
