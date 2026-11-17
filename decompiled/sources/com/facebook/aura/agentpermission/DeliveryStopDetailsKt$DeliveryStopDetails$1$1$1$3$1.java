package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C07C;
import X.G0W;
import com.facebook.aura.gateway.DeliveryCheckoutTime;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class DeliveryStopDetailsKt$DeliveryStopDetails$1$1$1$3$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ DeliveryCheckoutTime $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryStopDetailsKt$DeliveryStopDetails$1$1$1$3$1(DeliveryCheckoutTime deliveryCheckoutTime) {
        super(3);
        this.$it = deliveryCheckoutTime;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            DeliveryDetailTextKt.DeliveryDetailText(DeliveryStopDetailsKt.deliveryStopDetailTimeText(this.$it, bfm, DeliveryCheckoutTime.$stable), null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
