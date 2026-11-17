package X;

import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class FQ9 {
    public static final FBE A03 = new FBE() { // from class: X.FQC
        @Override // X.FBE
        public final Object ARD(FBB fbb, FDW fdw) {
            return new FQK();
        }
    };
    public final FQE A00;
    public final AuraImpressionTimeTracker A01;
    public final WeakReference<FBB> A02;

    public FQ9(FQE fqe, AuraImpressionTimeTracker auraImpressionTimeTracker, WeakReference weakReference) {
        this.A02 = weakReference;
        this.A01 = auraImpressionTimeTracker;
        this.A00 = fqe;
        weakReference.get();
    }
}
