package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.BV4;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinHullPool {
    public final HashMap<FancyPinHullReuseKey, ArrayDeque<FancyPinHullView>> hullsByKey = BV4.A0u();

    public final FancyPinHullView dequeue(FancyPinHullReuseKey fancyPinHullReuseKey) {
        C7384Etj.A0Y(fancyPinHullReuseKey, 0);
        ArrayDeque<FancyPinHullView> arrayDeque = this.hullsByKey.get(fancyPinHullReuseKey);
        if (arrayDeque == null || arrayDeque.isEmpty()) {
            return null;
        }
        return arrayDeque.removeLast();
    }

    public final int getCount() {
        Iterator itA1R = C60P.A1R(this.hullsByKey);
        int size = 0;
        while (itA1R.hasNext()) {
            size += ((AbstractCollection) itA1R.next()).size();
        }
        return size;
    }

    public final void prewarm(int i, FancyPinHullReuseKey fancyPinHullReuseKey, Function0<FancyPinHullView> function0) {
        AnonymousClass003.A0x(fancyPinHullReuseKey, function0);
        HashMap<FancyPinHullReuseKey, ArrayDeque<FancyPinHullView>> map = this.hullsByKey;
        ArrayDeque<FancyPinHullView> arrayDeque = map.get(fancyPinHullReuseKey);
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            map.put(fancyPinHullReuseKey, arrayDeque);
        }
        ArrayDeque<FancyPinHullView> arrayDeque2 = arrayDeque;
        int size = i - arrayDeque2.size();
        if (size < 0) {
            return;
        }
        for (int i2 = 0; i2 < size; i2++) {
            arrayDeque2.addLast(function0.invoke());
        }
    }

    public final void recycle(FancyPinHullView fancyPinHullView, FancyPinHullReuseKey fancyPinHullReuseKey) {
        AnonymousClass003.A0u(fancyPinHullView, fancyPinHullReuseKey);
        fancyPinHullView.prepareForReuse();
        if (fancyPinHullView.getVisibility() != 4) {
            throw C3cG.A0Q("Check failed.");
        }
        if (fancyPinHullView.getAlpha() != 1.0f) {
            throw C3cG.A0Q("Check failed.");
        }
        if (fancyPinHullView.currentVariantIndex != -1) {
            throw C3cG.A0Q("Check failed.");
        }
        HashMap<FancyPinHullReuseKey, ArrayDeque<FancyPinHullView>> map = this.hullsByKey;
        ArrayDeque<FancyPinHullView> arrayDeque = map.get(fancyPinHullReuseKey);
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            map.put(fancyPinHullReuseKey, arrayDeque);
        }
        arrayDeque.addLast(fancyPinHullView);
    }
}
