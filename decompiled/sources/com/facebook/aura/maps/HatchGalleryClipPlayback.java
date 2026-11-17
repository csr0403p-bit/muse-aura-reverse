package com.facebook.aura.maps;

import X.AnonymousClass001;
import X.C0981AMm;
import X.C7384Etj;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchGalleryClipPlayback {
    public final C0981AMm<Object, Float> candidates = new C0981AMm<>();

    public final boolean isActive$fbandroid_express_aura_java_com_facebook_aura_maps_impl_impl(Object obj) {
        Map.Entry<Object, Float> next;
        C7384Etj.A0Y(obj, 0);
        Iterator<Map.Entry<Object, Float>> it = this.candidates.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fA02 = AnonymousClass001.A02(next.getValue());
                do {
                    Map.Entry<Object, Float> next2 = it.next();
                    float fA022 = AnonymousClass001.A02(next2.getValue());
                    if (Float.compare(fA02, fA022) > 0) {
                        next = next2;
                        fA02 = fA022;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry<Object, Float> entry = next;
        return C7384Etj.areEqual(entry != null ? entry.getKey() : null, obj);
    }

    public final void report$fbandroid_express_aura_java_com_facebook_aura_maps_impl_impl(Object obj, Float f) {
        C7384Etj.A0Y(obj, 0);
        C0981AMm<Object, Float> c0981AMm = this.candidates;
        if (f == null) {
            c0981AMm.remove(obj);
        } else {
            c0981AMm.put(obj, f);
        }
    }
}
