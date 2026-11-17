package com.facebook.aura.ui;

import X.BFM;
import X.C7384Etj;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchLazySectionItem {
    public final G0V<BFM, Integer, Unit> content;
    public final Object contentType;
    public final Object key;

    /* JADX WARN: Multi-variable type inference failed */
    public HatchLazySectionItem(Object obj, Object obj2, G0V<? super BFM, ? super Integer, Unit> g0v) {
        C7384Etj.A0Y(g0v, 2);
        this.key = obj;
        this.contentType = obj2;
        this.content = g0v;
    }

    public final G0V<BFM, Integer, Unit> getContent() {
        return this.content;
    }

    public final Object getContentType() {
        return this.contentType;
    }

    public final Object getKey() {
        return this.key;
    }
}
