package com.facebook.aura.bloks.extensions.visibility;

import X.AnonymousClass005;
import X.BV6;
import X.C7384Etj;
import X.C7686FAf;
import X.C8020FPu;
import X.C8021FPx;
import X.F6D;
import X.FBA;
import X.FBB;
import X.FBC;
import X.FDW;
import X.FPv;
import X.FQ4;
import X.FQ8;
import X.FQB;
import android.util.SparseArray;
import android.view.View;
import com.facebook.aura.bloks.host.AuraBloksHost;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class AuraBloksVisibilityExtensionBinderUtils {
    public static final AuraBloksVisibilityExtensionBinderUtils INSTANCE = new AuraBloksVisibilityExtensionBinderUtils();

    public final class AuraImpressionTimeTrackerFactory {
        public AuraImpressionTimeTracker createNewImpressionTimeTracker(FBB fbb) {
            C7384Etj.A0Y(fbb, 0);
            ConcurrentHashMap<String, Long> concurrentHashMap = ((AuraBloksHost) fbb.A02).mImpressionTimesMap;
            C7384Etj.A0U(concurrentHashMap);
            return new AuraImpressionTimeTracker(concurrentHashMap);
        }
    }

    public final class AuraViewpointManagerProvider {
        public C8021FPx getViewpointManager(FBB fbb) {
            C7384Etj.A0Y(fbb, 0);
            return ((AuraBloksHost) fbb.A02).mViewpointManager;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void bind(android.view.View r13, X.FBB r14, X.FDW r15, X.FDW r16) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bloks.extensions.visibility.AuraBloksVisibilityExtensionBinderUtils.bind(android.view.View, X.FBB, X.FDW, X.FDW):void");
    }

    public static final void unbind(View view, FBB fbb, FDW fdw, FDW fdw2) {
        int i;
        SparseArray<Map<FDW, C7686FAf>> sparseArray;
        Map<FDW, C7686FAf> map;
        AnonymousClass005.A14(view, fbb, fdw, fdw2);
        FPv fPv = (FPv) FBA.A05(fbb, fdw);
        if (fPv == null || (map = (sparseArray = fPv.A01).get((i = fdw2.A04))) == null) {
            return;
        }
        SparseArray<FQ8> sparseArray2 = fPv.A00;
        FQ8 fq8 = sparseArray2.get(i);
        if (fq8 != null) {
            fq8.A01.removeOnAttachStateChangeListener(fq8);
            sparseArray2.remove(i);
        }
        if (map.size() != 1) {
            map.remove(fdw);
            return;
        }
        C8021FPx c8021FPx = ((AuraBloksHost) fbb.A02).mViewpointManager;
        if (c8021FPx != null) {
            FQB fqb = c8021FPx.A01;
            if (fqb != null && fqb.A02.A01) {
                C7686FAf c7686FAf = map.get(fdw);
                if (c7686FAf != null) {
                    c7686FAf.A00 = FBC.A00(F6D.A01(fbb, fdw.A09));
                    FQ4 fq4 = new FQ4(view, fPv, fdw, c8021FPx, map, i);
                    LinkedHashMap<Integer, Runnable> linkedHashMap = c8021FPx.A04;
                    synchronized (linkedHashMap) {
                        BV6.A1E(fq4, linkedHashMap, i);
                    }
                    return;
                }
                return;
            }
            c8021FPx.A00(view, C8020FPu.A03);
        }
        map.remove(fdw);
        sparseArray.remove(i);
    }

    public static final FPv createController(FBB fbb, FDW fdw) {
        return new FPv(new AuraImpressionTimeTrackerFactory(), new AuraViewpointManagerProvider());
    }
}
