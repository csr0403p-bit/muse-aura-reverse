package X;

import androidx.compose.runtime.MutableState;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import kotlin.Unit;

/* renamed from: X.8i8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8i8 implements Ht9, G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C8i8(int i, C7Hd c7Hd, Hm1<? super Unit> hm1) {
        this.$t = i;
        this.A01 = c7Hd;
        this.A00 = hm1;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                MutableState mutableState = (MutableState) this.A00;
                G0U g0u = (G0U) this.A01;
                mutableState.Af8(obj);
                g0u.invoke(obj);
                break;
            case 1:
                C7Hd c7Hd = (C7Hd) this.A01;
                Object obj2 = c7Hd.A03;
                Object obj3 = this.A00;
                synchronized (obj2) {
                    c7Hd.A00.remove(obj3);
                    break;
                }
            case 2:
                return GlanceAppWidgetReceiver.onDeleted$lambda$0((GlanceAppWidgetReceiver) this.A00, (int[]) this.A01, (C76r) obj);
            default:
                return GlanceAppWidgetReceiver.onUpdate$lambda$0((GlanceAppWidgetReceiver) this.A00, (int[]) this.A01, (C76r) obj);
        }
        return Unit.INSTANCE;
    }
}
