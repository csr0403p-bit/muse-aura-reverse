package com.facebook.aura.markdown.render.inline;

import X.AnonymousClass003;
import X.C06827l3;
import X.C0881AGi;
import X.C7384Etj;
import X.G0V;
import X.HwV;
import com.facebook.aura.memory.AuraByteLruCache;
import java.util.List;

/* loaded from: classes4.dex */
public final class PhoneRangeCache {
    public static final long ENTRY_OVERHEAD_BYTES = 128;
    public static final int MAX_ENTRIES = 256;
    public static final int MAX_ENTRY_FRACTION = 4;
    public static final long MAX_WEIGHT_BYTES = 1048576;
    public static final long RANGE_BYTES = 96;
    public static final PhoneRangeCache INSTANCE = new PhoneRangeCache();
    public static final AuraByteLruCache<String, List<HwV<String, Integer, Integer>>> cache = new AuraByteLruCache<>(256, 1048576, 0, false, 262144, new G0V() { // from class: com.facebook.aura.markdown.render.inline.PhoneRangeCache$$ExternalSyntheticLambda0
        @Override // X.G0V
        public final Object invoke(Object obj, Object obj2) {
            return Long.valueOf(PhoneRangeCache.cache$lambda$0((String) obj, (List) obj2));
        }
    }, 12, null);
    public static final C06827l3 PHONE_DIGIT_RUN = C06827l3.A02("\\p{Nd}(?:(?:[^\\p{L}\\p{Nd}]|[xX]){0,4}\\p{Nd}){9}");

    public final List<HwV<String, Integer, Integer>> rangesFor(String str) {
        C7384Etj.A0Y(str, 0);
        if (!PHONE_DIGIT_RUN.A07(str)) {
            return C0881AGi.A00;
        }
        AuraByteLruCache<String, List<HwV<String, Integer, Integer>>> auraByteLruCache = cache;
        List<HwV<String, Integer, Integer>> list = auraByteLruCache.get(str);
        if (list != null) {
            return list;
        }
        List<HwV<String, Integer, Integer>> listDetectPhoneRanges = PhoneLinkifierKt.detectPhoneRanges(str);
        auraByteLruCache.put(str, listDetectPhoneRanges);
        return listDetectPhoneRanges;
    }

    public static final long cache$lambda$0(String str, List list) {
        AnonymousClass003.A0u(str, list);
        return (str.length() * 2) + 128 + (list.size() * 96);
    }
}
