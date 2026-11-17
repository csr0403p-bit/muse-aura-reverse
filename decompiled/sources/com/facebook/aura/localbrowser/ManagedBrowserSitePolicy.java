package com.facebook.aura.localbrowser;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFI;
import X.C06H;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.DCl;
import X.G0U;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.localbrowser.ManagedBrowserSitePolicy;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ManagedBrowserSitePolicy {
    public static final String HEX = "0123456789abcdef";
    public final Set<String> hosts;
    public final ManagedBrowserSensitiveSitePolicyJson wire;
    public static final Companion Companion = new Companion();
    public static final int $stable = ManagedBrowserSensitiveSitePolicyJson.$stable;

    public final class Companion {
        public final boolean canonicalHost(String str) {
            C7384Etj.A0Y(str, 0);
            int length = str.length();
            if (3 <= length && length < 254 && C7BY.A0k(str, '.')) {
                int i = 0;
                while (true) {
                    char cCharAt = str.charAt(i);
                    if ('a' <= cCharAt && cCharAt < '{') {
                        List listA0h = C7BY.A0h(str, new char[1], '.');
                        if (!(listA0h instanceof Collection) || !listA0h.isEmpty()) {
                            Iterator it = listA0h.iterator();
                            while (it.hasNext()) {
                                String strA0j = AnonymousClass005.A0j(it);
                                int length2 = strA0j.length();
                                if (1 <= length2 && length2 < 64 && !C7BY.A0m(strA0j, '-') && !C7BY.A0l(strA0j, '-')) {
                                    int i2 = 0;
                                    do {
                                        char cCharAt2 = strA0j.charAt(i2);
                                        if ('a' <= cCharAt2) {
                                            if (cCharAt2 >= '{') {
                                            }
                                            i2++;
                                        } else if ('0' <= cCharAt2) {
                                            if (cCharAt2 >= ':') {
                                            }
                                            i2++;
                                        } else {
                                            if (cCharAt2 != '-') {
                                            }
                                            i2++;
                                        }
                                    } while (i2 < length2);
                                }
                            }
                        }
                        return true;
                    }
                    i++;
                    if (i >= length) {
                        break;
                    }
                }
            }
            return false;
        }

        public final ManagedBrowserSitePolicy fromJson(ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson) throws NoSuchAlgorithmException {
            C7384Etj.A0Y(managedBrowserSensitiveSitePolicyJson, 0);
            if (managedBrowserSensitiveSitePolicyJson.schema_version == 2 && managedBrowserSensitiveSitePolicyJson.hosts.size() <= 20480) {
                List<String> list = managedBrowserSensitiveSitePolicyJson.hosts;
                if (C7384Etj.areEqual(list, AbstractC0878AGe.A0W(AbstractC0878AGe.A0T(list)))) {
                    List<String> list2 = managedBrowserSensitiveSitePolicyJson.hosts;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<String> it = list2.iterator();
                        while (it.hasNext()) {
                            if (!ManagedBrowserSitePolicy.Companion.canonicalHost(AnonymousClass005.A0j(it))) {
                                return null;
                            }
                        }
                    }
                    MessageDigest messageDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256);
                    Charset charset = DCl.A05;
                    messageDigest.update("hatch-browser-sensitive-sites-v2\n".getBytes(charset));
                    Iterator<String> it2 = managedBrowserSensitiveSitePolicyJson.hosts.iterator();
                    while (it2.hasNext()) {
                        messageDigest.update(AnonymousClass005.A0j(it2).getBytes(charset));
                        messageDigest.update((byte) 10);
                    }
                    byte[] bArrDigest = messageDigest.digest();
                    C7384Etj.A0U(bArrDigest);
                    if (C7384Etj.areEqual(BFI.A0C("", new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserSitePolicy$Companion$$ExternalSyntheticLambda0
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return ManagedBrowserSitePolicy.Companion.fromJson$lambda$2(((Number) obj).byteValue());
                        }
                    }, bArrDigest), managedBrowserSensitiveSitePolicyJson.policy_digest)) {
                        List<String> list3 = managedBrowserSensitiveSitePolicyJson.hosts;
                        ArrayList arrayListA0m = AnonymousClass002.A0m(list3);
                        Iterator<String> it3 = list3.iterator();
                        while (it3.hasNext()) {
                            arrayListA0m.add(C7BY.A0K("www.", AnonymousClass005.A0j(it3)));
                        }
                        return new ManagedBrowserSitePolicy(managedBrowserSensitiveSitePolicyJson, AbstractC0878AGe.A0g(arrayListA0m));
                    }
                }
            }
            return null;
        }

        public static final CharSequence fromJson$lambda$2(byte b) {
            char cCharAt = ManagedBrowserSitePolicy.HEX.charAt((b & 255) >>> 4);
            char cCharAt2 = ManagedBrowserSitePolicy.HEX.charAt(b & 15);
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(cCharAt);
            sbA0w.append(cCharAt2);
            return sbA0w.toString();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final boolean allows(String str) {
        String host;
        String strA0L;
        C7384Etj.A0Y(str, 0);
        if (!str.equals("about:blank")) {
            String strNavigationUrl = LocalBrowserUrlPolicy.INSTANCE.navigationUrl(str);
            if (strNavigationUrl != null) {
                String strSubstring = null;
                try {
                    host = new URI(strNavigationUrl).getHost();
                } catch (IllegalArgumentException unused) {
                }
                if (host != null && (strA0L = C7BY.A0L(".", C60Q.A0j(host))) != null) {
                    strSubstring = C7BY.A0K("www.", strA0L);
                    if (strSubstring == null) {
                        return false;
                    }
                    while (!this.hosts.contains(strSubstring)) {
                        int iA08 = C7BY.A08(strSubstring, '.', 0);
                        if (iA08 >= 0) {
                            strSubstring = strSubstring.substring(iA08 + 1);
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final ManagedBrowserSensitiveSitePolicyJson getWire() {
        return this.wire;
    }

    public /* synthetic */ ManagedBrowserSitePolicy(ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson, Set set, C06H c06h) {
        this(managedBrowserSensitiveSitePolicyJson, set);
    }

    public ManagedBrowserSitePolicy(ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson, Set<String> set) {
        this.wire = managedBrowserSensitiveSitePolicyJson;
        this.hosts = set;
    }
}
