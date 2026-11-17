package X;

import com.facebook.payments.dcp.xapp.controller.init.IapSyncController;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* renamed from: X.Gdg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9676Gdg extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ AtomicBoolean $answered;
    public final /* synthetic */ HsT $initListener;
    public final /* synthetic */ boolean $persistsRetryFlag;
    public final /* synthetic */ String $uplSessionId;
    public final /* synthetic */ F0C $userScopedCache$delegate;
    public final /* synthetic */ C9678Gdi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9676Gdg(C9678Gdi c9678Gdi, HsT hsT, String str, AtomicBoolean atomicBoolean, F0C f0c, boolean z) {
        super(1);
        this.$answered = atomicBoolean;
        this.this$0 = c9678Gdi;
        this.$uplSessionId = str;
        this.$persistsRetryFlag = z;
        this.$initListener = hsT;
        this.$userScopedCache$delegate = f0c;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        C9677Gdh c9677Gdh;
        Throwable th2 = th;
        C7384Etj.A0Y(th2, 0);
        String str = AbstractC9675Gdf.A00;
        CFK.A08(str, "Unexpected IAP startup synchronization failure", th2);
        if (!this.$answered.get()) {
            try {
                c9677Gdh = IapSyncController.A00(null, this.this$0.A07, EnumC9704GeI.A08, this.$uplSessionId, null, null);
            } catch (Throwable th3) {
                CFK.A08(str, "Failed completing IAP startup synchronization", th3);
                c9677Gdh = new C9677Gdh(new I0P(5), EnumC9704GeI.A08);
            }
            C9678Gdi.A00(this.this$0, c9677Gdh, this.$initListener, this.$answered, this.$userScopedCache$delegate, this.$persistsRetryFlag);
        }
        return Unit.INSTANCE;
    }
}
