package X;

import android.util.SparseArray;
import com.facebook.aura.bloks.extensions.visibility.AuraBloksVisibilityExtensionBinderUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FPv {
    public final AuraBloksVisibilityExtensionBinderUtils.AuraImpressionTimeTrackerFactory A02;
    public final AuraBloksVisibilityExtensionBinderUtils.AuraViewpointManagerProvider A03;
    public final SparseArray<Map<FDW, C7686FAf>> A01 = BV4.A0B();
    public final SparseArray<FQ8> A00 = BV4.A0B();

    public FPv(AuraBloksVisibilityExtensionBinderUtils.AuraImpressionTimeTrackerFactory auraImpressionTimeTrackerFactory, AuraBloksVisibilityExtensionBinderUtils.AuraViewpointManagerProvider auraViewpointManagerProvider) {
        this.A03 = auraViewpointManagerProvider;
        this.A02 = auraImpressionTimeTrackerFactory;
    }

    public static final C8020FPu A00(FPv fPv, FBB fbb, int i) {
        String strValueOf = String.valueOf(i);
        C8020FPu<?, ?> c8020FPu = C8020FPu.A03;
        WeakReference weakReferenceA0q = BV4.A0q(fbb);
        return new C8020FPu(c8020FPu, strValueOf, BV5.A0u(new FQ9(new FQE(fPv, i), fPv.A02.createNewImpressionTimeTracker(fbb), weakReferenceA0q)));
    }
}
