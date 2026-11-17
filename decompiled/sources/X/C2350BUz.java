package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.BUz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2350BUz extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2350BUz(Object obj, int i, int i2) {
        super(0);
        this.$t = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                ((G0U) this.A01).invoke(Integer.valueOf(this.A00));
                break;
            case 1:
                break;
            case 2:
                ((InterfaceC07449Vz) this.A01).onReviewClick(this.A00);
                break;
            default:
                View view = (View) this.A01;
                int layerType = view.getLayerType();
                int i = this.A00;
                if (layerType != i) {
                    view.setLayerType(i, null);
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
