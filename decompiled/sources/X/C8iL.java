package X;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* renamed from: X.8iL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iL implements Ht9, Function0 {
    public final int $t;
    public final Object A00;
    public final String A01;

    public C8iL(Context context, String str, int i) {
        this.$t = i;
        this.A00 = context;
        this.A01 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$t;
        Object obj = this.A00;
        return i != 0 ? C6PJ.A00((Context) obj, this.A01) : C6PX.A00((Context) obj, this.A01);
    }
}
