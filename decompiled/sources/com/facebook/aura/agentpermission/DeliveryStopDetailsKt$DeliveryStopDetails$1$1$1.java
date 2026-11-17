package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.gateway.DeliveryCheckoutTime;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class DeliveryStopDetailsKt$DeliveryStopDetails$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ DeliveryStopDetailsUiState $details;

    /* renamed from: com.facebook.aura.agentpermission.DeliveryStopDetailsKt$DeliveryStopDetails$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ DeliveryStopDetailsUiState $details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DeliveryStopDetailsUiState deliveryStopDetailsUiState) {
            super(3);
            this.$details = deliveryStopDetailsUiState;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                DeliveryDetailTextKt.DeliveryDetailText(this.$details.address, null, bfm, 0, 2);
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

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$details), 257520138);
        String str = this.$details.contactName;
        if (str != null) {
            AnonymousClass005.A0u(hatchSectionScope, new DeliveryStopDetailsKt$DeliveryStopDetails$1$1$1$2$1(str), -1760207768);
        }
        DeliveryCheckoutTime deliveryCheckoutTime = this.$details.time;
        if (deliveryCheckoutTime != null) {
            AnonymousClass005.A0u(hatchSectionScope, new DeliveryStopDetailsKt$DeliveryStopDetails$1$1$1$3$1(deliveryCheckoutTime), -1935601957);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryStopDetailsKt$DeliveryStopDetails$1$1$1(DeliveryStopDetailsUiState deliveryStopDetailsUiState) {
        super(1);
        this.$details = deliveryStopDetailsUiState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
