package com.facebook.tigon.requestdomainhelpers;

import X.ETi;
import android.net.Uri;
import java.net.URI;

/* loaded from: classes5.dex */
public final class TigonRequestDomainHelpers {
    public static volatile boolean sLibraryLoaded;

    public static boolean isFirstPartySecure(String str, String str2) {
        boolean zIsFirstPartySecureNative = false;
        if (str != null && str2 != null) {
            try {
                ensureLibraryLoaded();
                zIsFirstPartySecureNative = isFirstPartySecureNative(str, str2);
                return zIsFirstPartySecureNative;
            } catch (LinkageError unused) {
            }
        }
        return zIsFirstPartySecureNative;
    }

    public static native boolean isFirstPartySecureNative(String str, String str2);

    public static native boolean isMetaAIVmHostNative(String str);

    public static void ensureLibraryLoaded() {
        if (sLibraryLoaded) {
            return;
        }
        synchronized (TigonRequestDomainHelpers.class) {
            if (!sLibraryLoaded) {
                ETi.loadLibrary("tigonrequestdomainhelpers");
                sLibraryLoaded = true;
            }
        }
    }

    public static boolean isMetaAIVmHost(String str) {
        if (str == null) {
            return false;
        }
        try {
            ensureLibraryLoaded();
            return isMetaAIVmHostNative(str);
        } catch (LinkageError unused) {
            return true;
        }
    }

    public static boolean isFirstPartySecure(Uri uri, String str) {
        String string;
        if (uri == null) {
            string = null;
        } else {
            string = uri.toString();
        }
        return isFirstPartySecure(string, str);
    }

    public static boolean isFirstPartySecure(URI uri, String str) {
        String string;
        if (uri == null) {
            string = null;
        } else {
            string = uri.toString();
        }
        return isFirstPartySecure(string, str);
    }
}
