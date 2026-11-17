package com.facebook.aura.network.transport.cache;

import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AbstractC2159Azp;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFI;
import X.C10571Hud;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.DCl;
import X.G0U;
import com.facebook.aura.network.AuraAcceptLanguage;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchHttpCachePolicy;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchRequestBody;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HatchHttpCacheKey {
    public static final String KEY_VERSION = "hatch-http-cache-v1";
    public static final HatchHttpCacheKey INSTANCE = new HatchHttpCacheKey();
    public static final Set<String> VARY_HEADERS = C60O.A1A("Accept", AuraAcceptLanguage.HEADER, "X-API-Version");

    /* renamed from: com.facebook.aura.network.transport.cache.HatchHttpCacheKey$sha256$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Byte, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final CharSequence invoke(byte b) {
            return C3cJ.A0K(Integer.valueOf(b & 255));
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return invoke(b.byteValue());
        }
    }

    private final String bodyFingerprint(HatchHttpRequest hatchHttpRequest) {
        HatchRequestBody hatchRequestBody = hatchHttpRequest.body;
        return hatchRequestBody instanceof HatchRequestBody.Json ? ((HatchRequestBody.Json) hatchRequestBody).value : hatchRequestBody instanceof HatchRequestBody.Bytes ? sha256(new String(((HatchRequestBody.Bytes) hatchRequestBody).bytes, DCl.A00)) : "";
    }

    public final String hostForScope(String str) {
        Object objA0s;
        C7384Etj.A0Y(str, 0);
        try {
            String host = new URI(str).getHost();
            if (host == null) {
                host = "";
            }
            objA0s = C60Q.A0g(host);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        return (String) (objA0s instanceof C10571Hud ? "" : objA0s);
    }

    private final String sha256(String str) {
        byte[] bArrA1T = C3cH.A1T(str);
        C7384Etj.A0X(bArrA1T);
        return BFI.A0C("", AnonymousClass1.INSTANCE, bArrA1T);
    }

    public final String build(HatchHttpRequest hatchHttpRequest, HatchAuthScheme hatchAuthScheme, String str) {
        String str2;
        boolean zA1Z = AnonymousClass005.A1Z(hatchHttpRequest, hatchAuthScheme, str);
        HatchHttpCachePolicy hatchHttpCachePolicy = hatchHttpRequest.cachePolicy;
        if (hatchHttpCachePolicy == null || (str2 = hatchHttpCachePolicy.cacheKeyOverride) == null || C7BY.A0j(str2)) {
            str2 = hatchHttpRequest.url;
        }
        Set<Map.Entry<String, String>> setEntrySet = hatchHttpRequest.headers.entrySet();
        ArrayList arrayListA0h = C3cG.A0h();
        for (Map.Entry<String, String> entry : setEntrySet) {
            Map.Entry<String, String> entry2 = entry;
            Set<String> set = VARY_HEADERS;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<String> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (AbstractC2159Azp.A12(AnonymousClass005.A0j(it), C60O.A0t(entry2), zA1Z)) {
                        arrayListA0h.add(entry);
                        break;
                    }
                }
            }
        }
        String strA01 = AbstractC06907md.A01(PairsDiscretionDocument.TERMINATOR, AbstractC0878AGe.A0c(arrayListA0h, new Comparator() { // from class: com.facebook.aura.network.transport.cache.HatchHttpCacheKey$build$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                String str3 = (String) ((Map.Entry) t).getKey();
                Locale locale = Locale.US;
                C7384Etj.A0V(locale);
                return str3.toLowerCase(locale).compareTo(((String) ((Map.Entry) t2).getKey()).toLowerCase(locale));
            }
        }), HatchHttpCacheKey$build$varyHeaders$3.INSTANCE);
        StringBuilder sbA0x = C60O.A0x("hatch-http-cache-v1\n");
        sbA0x.append(hatchHttpRequest.method.name());
        sbA0x.append('\n');
        sbA0x.append(C7BY.A0S(str2, str2, '#'));
        sbA0x.append('\n');
        sbA0x.append(hatchAuthScheme.name());
        sbA0x.append('\n');
        sbA0x.append(str);
        sbA0x.append('\n');
        sbA0x.append(strA01);
        sbA0x.append('\n');
        return sha256(AnonymousClass001.A0v(INSTANCE.bodyFingerprint(hatchHttpRequest), sbA0x));
    }
}
