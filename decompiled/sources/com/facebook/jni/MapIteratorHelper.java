package com.facebook.jni;

import X.AnonymousClass002;
import X.C3cH;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class MapIteratorHelper {
    public final Iterator<Map.Entry> mIterator;
    public Object mKey;
    public Object mValue;

    public boolean hasNext() {
        if (!this.mIterator.hasNext()) {
            this.mKey = null;
            this.mValue = null;
            return false;
        }
        Map.Entry entryA0l = C3cH.A0l(this.mIterator);
        this.mKey = entryA0l.getKey();
        this.mValue = entryA0l.getValue();
        return true;
    }

    public MapIteratorHelper(Map map) {
        this.mIterator = AnonymousClass002.A0n(map);
    }
}
