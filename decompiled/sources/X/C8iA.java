package X;

import android.content.Context;
import androidx.glance.appwidget.AppWidgetSession;

/* renamed from: X.8iA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iA implements Ht9, G0V {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c0  */
    @Override // X.G0V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r15, java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8iA.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public C8iA(Context context, AppWidgetSession appWidgetSession, int i) {
        this.$t = i;
        if (i != 0) {
            this.A00 = context;
            this.A01 = appWidgetSession;
        } else {
            this.A00 = appWidgetSession;
            this.A01 = context;
        }
    }

    public C8iA(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }
}
