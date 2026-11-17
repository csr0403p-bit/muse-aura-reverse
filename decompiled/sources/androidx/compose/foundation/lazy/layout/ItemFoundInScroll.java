package androidx.compose.foundation.lazy.layout;

import X.AOW;
import X.AT7;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class ItemFoundInScroll extends CancellationException {
    public final int itemOffset;
    public final AT7<Float, AOW> previousAnimation;

    /* JADX WARN: Incorrect types in method signature: (ILX/AT7<Ljava/lang/Float;LX/AOW;>;)V */
    public ItemFoundInScroll(AT7 at7, int i) {
        this.itemOffset = i;
        this.previousAnimation = at7;
    }
}
