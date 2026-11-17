package com.facebook.aura.navigation;

import X.AMP;
import X.AnonymousClass001;
import X.BFM;
import X.BMI;
import X.BRL;
import X.C0881AGi;
import X.C7384Etj;
import X.G0V;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class BlockingOverlayScene<T> implements AMP<T> {
    public final G0V<BFM, Integer, Unit> content;
    public final List<BRL<T>> entries;
    public final BRL<T> entry;
    public final Object key;
    public final List<BRL<T>> previousEntries;

    public BlockingOverlayScene(BRL<T> brl) {
        C7384Etj.A0Y(brl, 0);
        this.entry = brl;
        this.key = brl.A00;
        this.entries = Collections.singletonList(brl);
        this.previousEntries = C0881AGi.A00;
        this.content = AnonymousClass001.A0M(new BlockingOverlayScene$content$1(this), -1550374345);
    }

    public boolean equals(Object obj) {
        return (obj instanceof BlockingOverlayScene) && C7384Etj.areEqual(this.key, ((BlockingOverlayScene) obj).key);
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

    @Override // X.AMP
    public List<BRL<T>> getPreviousEntries() {
        return this.previousEntries;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public /* bridge */ Map<String, Object> getMetadata() {
        return BMI.A00(this);
    }
}
