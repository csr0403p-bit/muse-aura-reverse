package X;

import android.app.PendingIntent;
import android.content.Context;
import android.view.textclassifier.TextClassification;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.8i9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8i9 implements Ht9, Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C8i9(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws PendingIntent.CanceledException {
        switch (this.$t) {
            case 0:
                ((C7dk) ((C7dn) this.A00)).A02.invoke(this.A01);
                break;
            case 1:
                Context context = (Context) this.A00;
                TextClassification textClassification = (TextClassification) this.A01;
                String text = textClassification.getText();
                C7dh.A00(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                break;
            case 2:
                GAo.A02(C79.A0K, C6ys.A00, new C8iZ(this.A01, null, 1), (C3UX) this.A00);
                break;
            default:
                return C06827l3.A01((CharSequence) this.A01, (C06827l3) this.A00);
        }
        return Unit.INSTANCE;
    }
}
