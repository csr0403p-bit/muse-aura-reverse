package X;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
public abstract class Hx6<I, O> {
    public abstract Intent createIntent(Context context, I i);

    public abstract O parseResult(int i, Intent intent);

    public AnonymousClass795<O> getSynchronousResult(Context context, I i) {
        return null;
    }
}
