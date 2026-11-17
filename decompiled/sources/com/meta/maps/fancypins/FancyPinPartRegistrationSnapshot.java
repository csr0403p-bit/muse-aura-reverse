package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.BV4;
import X.C60P;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FancyPinPartRegistrationSnapshot {
    public final Map<String, Map<String, FancyPinErasedPartRegistration>> registrations;
    public final Map<String, Long> revisions;

    public final long revision(String str) {
        C7384Etj.A0Y(str, 0);
        return C60P.A01(BV4.A0b(str, this.revisions));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FancyPinPartRegistrationSnapshot(Map<String, ? extends Map<String, ? extends FancyPinErasedPartRegistration>> map, Map<String, Long> map2) {
        AnonymousClass003.A0u(map, map2);
        this.registrations = map;
        this.revisions = map2;
    }

    public final FancyPinErasedPartRegistration registration(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        Map<String, FancyPinErasedPartRegistration> map = this.registrations.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }
}
