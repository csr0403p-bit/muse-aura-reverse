package com.facebook.aura.navigation;

import X.AnonymousClass005;
import X.B1V;
import X.BFM;
import X.BLi;
import X.BMI;
import X.BRL;
import X.C7384Etj;
import X.G0V;
import X.HtJ;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class TransparentOverlayScene<T> implements BLi<T> {
    public final G0V<BFM, Integer, Unit> content;
    public final List<BRL<T>> entries;
    public final BRL<T> entry;
    public final Object key;
    public final List<BRL<T>> overlaidEntries;
    public final List<BRL<T>> previousEntries;
    public final float zIndex;

    public TransparentOverlayScene(Object obj, BRL<T> brl, float f, List<BRL<T>> list, List<BRL<T>> list2) {
        C7384Etj.A0Y(obj, 0);
        AnonymousClass005.A12(brl, list, list2, 1);
        this.key = obj;
        this.entry = brl;
        this.zIndex = f;
        this.previousEntries = list;
        this.overlaidEntries = list2;
        this.entries = Collections.singletonList(brl);
        this.content = B1V.A01(new TransparentOverlayScene$content$1(this), 46586028, true);
    }

    public boolean equals(Object obj) {
        return (obj instanceof TransparentOverlayScene) && C7384Etj.areEqual(this.key, ((TransparentOverlayScene) obj).key);
    }

    @Override // X.AMP
    public G0V<BFM, Integer, Unit> getContent() {
        return this.content;
    }

    @Override // X.AMP
    public List<BRL<T>> getEntries() {
        return this.entries;
    }

    @Override // X.AMP
    public Object getKey() {
        return this.key;
    }

    @Override // X.BLi
    public List<BRL<T>> getOverlaidEntries() {
        return this.overlaidEntries;
    }

    @Override // X.AMP
    public List<BRL<T>> getPreviousEntries() {
        return this.previousEntries;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    @Override // X.BLi
    public /* bridge */ Object onRemove(HtJ<? super Unit> htJ) {
        return Unit.INSTANCE;
    }

    public /* bridge */ Map<String, Object> getMetadata() {
        return BMI.A00(this);
    }
}
