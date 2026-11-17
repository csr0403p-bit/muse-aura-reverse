package com.facebook.aura.network.sandbox;

import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BzK;
import X.C06827l3;
import X.C4oT;
import X.C7384Etj;
import X.C7BY;
import X.C9X;
import X.F0C;
import X.FGI;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraSandbox {
    public static final String FACEBOOK_HOST_SUFFIX = ".facebook.com";
    public static final String GRAPHQL_SANDBOX_KEY = "sandbox_graphql_prefix";
    public static final String HTTP_SANDBOX_KEY = "sandbox_okhttp_prefix";
    public static final String MUSE_STEFI_BASE_URL = "https://api.muse.ai";
    public static final String STEFI_BASE_URL = "https://hatch-api.meta.ai";
    public static final String XAPP_E2E_TOKENS_KEY = "xapp.e2e.tokens";
    public static final AuraSandbox INSTANCE = new AuraSandbox();
    public static final F0C prefs$delegate = AbstractC5321DgF.A03(AuraSandbox$prefs$2.INSTANCE);

    public final String resolveHttpHost$fbandroid_express_aura_java_com_facebook_aura_network_sandbox_sandbox(boolean z, String str, Function0<String> function0, Function0<Boolean> function02) {
        C7384Etj.A0Y(str, 1);
        C7384Etj.A0Y(function0, 2);
        C7384Etj.A0Y(function02, 3);
        if (z) {
            String strNormalizeSandboxHost = normalizeSandboxHost(function0.invoke());
            if (strNormalizeSandboxHost.length() > 0) {
                return strNormalizeSandboxHost;
            }
            if (str.length() <= 0 && function02.invoke().booleanValue()) {
                throw new IllegalStateException("Token-seeded E2E run has no sandbox host: EndToEnd.getSandboxUrlString() is blank and no dev-sandbox pref is set. Refusing to route native Hatch traffic to production.");
            }
        }
        return str;
    }

    public final void setGraphqlHost(String str) {
        C7384Etj.A0Y(str, 0);
        BzK bzKA9q = ((C4oT) prefs$delegate.getValue()).A9q();
        bzKA9q.AYr(GRAPHQL_SANDBOX_KEY, str);
        bzKA9q.apply();
    }

    public final void setHttpHost(String str) {
        C7384Etj.A0Y(str, 0);
        BzK bzKA9q = ((C4oT) prefs$delegate.getValue()).A9q();
        bzKA9q.AYr(HTTP_SANDBOX_KEY, str);
        bzKA9q.apply();
    }

    private final C4oT getPrefs() {
        return (C4oT) prefs$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String resolveHttpHost$fbandroid_express_aura_java_com_facebook_aura_network_sandbox_sandbox$default(AuraSandbox auraSandbox, boolean z, String str, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 8) != 0) {
            function02 = AuraSandbox$resolveHttpHost$1.INSTANCE;
        }
        return auraSandbox.resolveHttpHost$fbandroid_express_aura_java_com_facebook_aura_network_sandbox_sandbox(z, str, function0, function02);
    }

    public final String getGraphqlHost() {
        String strA0l;
        String string = ((C4oT) prefs$delegate.getValue()).getString(GRAPHQL_SANDBOX_KEY, "");
        return (string == null || (strA0l = AnonymousClass002.A0l(string)) == null) ? "" : strA0l;
    }

    private final String normalizeSandboxHost(String str) {
        String string = C7BY.A0F(str).toString();
        return C7BY.A0L(".facebook.com", C7BY.A0U(string, "://", string));
    }

    public final String getHttpHost() {
        String string;
        boolean zA04 = C9X.A04();
        String str = "";
        String string2 = ((C4oT) prefs$delegate.getValue()).getString(HTTP_SANDBOX_KEY, "");
        if (string2 != null && (string = C7BY.A0F(string2).toString()) != null) {
            str = string;
        }
        return resolveHttpHost$fbandroid_express_aura_java_com_facebook_aura_network_sandbox_sandbox(zA04, str, AuraSandbox$httpHost$1.INSTANCE, AuraSandbox$httpHost$2.INSTANCE);
    }

    public final boolean isGraphqlSandboxEnabled() {
        return AnonymousClass002.A1N(getGraphqlHost().length());
    }

    public final boolean isHttpSandboxEnabled() {
        return AnonymousClass002.A1N(getHttpHost().length());
    }

    public final String rewriteUrl(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        if (str2.length() == 0) {
            return str;
        }
        C06827l3 c06827l3A02 = C06827l3.A02("://([^./]+)\\.(.+)");
        String strReplaceFirst = c06827l3A02.nativePattern.matcher(str).replaceFirst(FGI.A0U("://$1.", str2, ".$2"));
        C7384Etj.A0U(strReplaceFirst);
        return strReplaceFirst;
    }
}
