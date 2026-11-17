package X;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController;
import com.facebook.payments.dcp.xapp.controller.productinfo.ProductInfoController;
import com.meta.health.healthconnect.HealthConnectPlugin;

/* renamed from: X.FtY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8916FtY extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8916FtY(HtJ<? super C8916FtY> htJ) {
        super(htJ);
        this.$t = 0;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                this.A0A = obj;
                this.A00 |= Integer.MIN_VALUE;
                return TapGestureDetectorKt.A00(null, null, this, null, null, null, null, null);
            case 1:
                this.A09 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return IapPrefetchDataController.A01(null, (IapPrefetchDataController) this.A0A, null, null, null, null, this);
            case 2:
                this.A09 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ProductInfoController.A03((ProductInfoController) this.A0A, null, null, this);
            default:
                this.A09 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return HealthConnectPlugin.A09(null, null, (HealthConnectPlugin) this.A0A, null, null, null, null, null, this, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8916FtY(Object obj, IapPrefetchDataController iapPrefetchDataController, HtJ<? super C8916FtY> htJ) {
        super(iapPrefetchDataController);
        this.$t = htJ;
        this.A0A = obj;
    }
}
