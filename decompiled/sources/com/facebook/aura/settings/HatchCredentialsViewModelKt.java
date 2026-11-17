package com.facebook.aura.settings;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C7384Etj;
import X.C7BY;
import X.DCl;
import X.FGI;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class HatchCredentialsViewModelKt {
    public static final int MAXIMUM_PASSWORD_UTF8_BYTES = 1024;
    public static final int MAXIMUM_USERNAME_UTF8_BYTES = 256;
    public static final int MAXIMUM_VERIFICATION_CODE_UTF8_BYTES = 256;
    public static final String SECURE_STORAGE_FAILURE_INVALID_REQUEST = "invalid_request";
    public static final String SECURE_STORAGE_FAILURE_REQUEST_FAILED = "request_failed";
    public static final String SECURE_STORAGE_FAILURE_VALIDATION = "validation";

    public static final boolean isSecureStoragePasswordTooLong(String str) {
        C7384Etj.A0Y(str, 0);
        return str.getBytes(DCl.A05).length > 1024;
    }

    public static final boolean isSecureStorageUsernameTooLong(String str) {
        C7384Etj.A0Y(str, 0);
        return str.getBytes(DCl.A05).length > 256;
    }

    public static final String normalizePageUrl(String str) {
        String host;
        List listA0g;
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() != 0) {
            if (!AnonymousClass006.A1b("https://", strA0l)) {
                strA0l = FGI.A0M("https://", strA0l);
            }
            Uri uri = Uri.parse(strA0l);
            String scheme = uri.getScheme();
            if (scheme != null && scheme.equalsIgnoreCase("https") && (host = uri.getHost()) != null && (listA0g = C7BY.A0g(host, new char[]{'.'})) != null) {
                if (!(listA0g instanceof Collection) || !listA0g.isEmpty()) {
                    Iterator it = listA0g.iterator();
                    while (it.hasNext()) {
                        if (C7BY.A0j(AnonymousClass005.A0j(it))) {
                        }
                    }
                }
                return strA0l;
            }
        }
        return null;
    }

    public static final SecureStorageVerificationCodeCaptureError verificationCodeValidationError(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        int length = strA0l.length();
        if (length == 0) {
            return null;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = strA0l.charAt(i);
            if ('0' > cCharAt || (cCharAt >= ':' && ('A' > cCharAt || (cCharAt >= '[' && ('a' > cCharAt || cCharAt >= '{'))))) {
                return SecureStorageVerificationCodeCaptureError.INVALID_CHARACTERS;
            }
        }
        if (strA0l.getBytes(DCl.A05).length > 256) {
            return SecureStorageVerificationCodeCaptureError.TOO_LONG;
        }
        return null;
    }

    public static final SecureStorageCatalogUiState withCandidates(SecureStorageCatalogUiState secureStorageCatalogUiState, AHD<CredentialCandidate> ahd) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : ahd) {
            if (((CredentialCandidate) obj).isFromOnePassword) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return secureStorageCatalogUiState.copy(ahd, AGI.A07(arrayList2), AGI.A07(AbstractC0878AGe.A0c(arrayList, new Comparator() { // from class: com.facebook.aura.settings.HatchCredentialsViewModelKt$withCandidates$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                String str = ((CredentialCandidate) t).displayName;
                Locale locale = Locale.ROOT;
                return str.toLowerCase(locale).compareTo(((CredentialCandidate) t2).displayName.toLowerCase(locale));
            }
        })), arrayList.isEmpty() ? PasswordsEntryPoint.SECURE_STORE : PasswordsEntryPoint.PASSWORDS, secureStorageCatalogUiState.customConnectors, secureStorageCatalogUiState.isLoading, secureStorageCatalogUiState.hasError);
    }
}
