package com.facebook.aura.ui;

import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public interface HatchLazySectionScope {

    /* renamed from: com.facebook.aura.ui.HatchLazySectionScope$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ void item$default(HatchLazySectionScope hatchLazySectionScope, Object obj, Object obj2, G0V g0v, int i, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                obj2 = null;
            }
            hatchLazySectionScope.item(obj, obj2, g0v);
        }
    }

    void item(Object obj, Object obj2, G0V<? super BFM, ? super Integer, Unit> g0v);

    public abstract class DefaultImpls {
    }
}
