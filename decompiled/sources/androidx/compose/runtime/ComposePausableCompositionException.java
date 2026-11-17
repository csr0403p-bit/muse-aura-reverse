package androidx.compose.runtime;

import X.A6B;
import X.Ab1;
import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AbstractC0913AHp;
import X.C2308BTi;
import X.C6tn;
import X.FGI;
import com.facebook.aura.pairs.PairsDiscretionDocument;

/* loaded from: classes4.dex */
public final class ComposePausableCompositionException extends RuntimeException {
    public final AbstractC0913AHp<Object> instances;
    public final int lastOperation;
    public final Ab1 operations;
    public final AbstractC0913AHp<Object> reused;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return C6tn.A04(FGI.A09(this.lastOperation, "\n            |Failed to execute op number ", ":\n            |", AbstractC06907md.A01(PairsDiscretionDocument.TERMINATOR, AbstractC0878AGe.A0e(A6B.A02(new C2308BTi(new ComposePausableCompositionException$operationsSequence$1(this, null), 1)), 50), null), "\n            "));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AHp<Ljava/lang/Object;>;LX/AHp<Ljava/lang/Object;>;LX/Ab1;ILjava/lang/Throwable;)V */
    public ComposePausableCompositionException(Ab1 ab1, AbstractC0913AHp abstractC0913AHp, AbstractC0913AHp abstractC0913AHp2, Throwable th, int i) {
        super(th);
        this.instances = abstractC0913AHp;
        this.reused = abstractC0913AHp2;
        this.operations = ab1;
        this.lastOperation = i;
    }
}
