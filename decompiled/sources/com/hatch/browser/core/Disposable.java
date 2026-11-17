package com.hatch.browser.core;

import X.BV5;
import X.C7384Etj;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public interface Disposable {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final void destroy(Object... objArr) {
            C7384Etj.A0Y(objArr, 0);
            for (Object obj : objArr) {
                if (obj instanceof Disposable) {
                    ((Disposable) obj).destroy();
                } else if (obj instanceof ArrayList) {
                    int size = ((Collection) obj).size();
                    for (int i = 0; i < size; i++) {
                        Object obj2 = ((AbstractList) obj).get(i);
                        if (obj2 instanceof Disposable) {
                            ((Disposable) obj2).destroy();
                        }
                    }
                } else if (obj instanceof Map) {
                    Iterator itA10 = BV5.A10((Map) obj);
                    while (itA10.hasNext()) {
                        Object next = itA10.next();
                        if (next instanceof Disposable) {
                            ((Disposable) next).destroy();
                        }
                    }
                } else if (obj instanceof Iterable) {
                    for (Object obj3 : (Iterable) obj) {
                        if (obj3 instanceof Disposable) {
                            ((Disposable) obj3).destroy();
                        }
                    }
                }
            }
        }
    }

    void destroy();
}
