package X;

import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryJsonKt;
import com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor;
import com.meta.maps.display.fancypins.FancyPinsPlugin;
import com.meta.maps.fancypins.FancyPinDataController;
import com.meta.maps.fancypins.FancyPinOverlayView;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Fle, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8826Fle extends C7438Evz implements Function0 {
    public final int $t;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8826Fle(Object obj, int i) {
        Class cls;
        String str;
        int i2;
        String str2;
        this.$t = i;
        switch (i) {
            case 0:
                cls = C7807FFo.class;
                str = "cancel()V";
                i2 = 0;
                str2 = AuraSubscriptionRepositoryJsonKt.CHANGE_ACTION_CANCEL;
                break;
            case 1:
                cls = FancyPinDataController.class;
                str = "close()V";
                i2 = 0;
                str2 = "close";
                break;
            case 2:
                cls = FancyPinOverlayView.class;
                str = "unbindEngine()V";
                i2 = 0;
                str2 = "unbindEngine";
                break;
            case 3:
                cls = FancyPinsMapFrameSyncExecutor.class;
                str = "close()V";
                i2 = 0;
                str2 = "close";
                break;
            case 4:
                cls = FancyPinsPlugin.class;
                str = "disableCollisionProxy()V";
                i2 = 0;
                str2 = "disableCollisionProxy";
                break;
            case 5:
            case 6:
                cls = FancyPinsPlugin.class;
                str = "requestUpdate()V";
                i2 = 0;
                str2 = "requestUpdate";
                break;
            case 7:
                cls = InterfaceC9729Gei.class;
                str = "pblRequestTimeoutEnabled()Z";
                i2 = 0;
                str2 = "pblRequestTimeoutEnabled";
                break;
            default:
                cls = AtomicReference.class;
                str = "get()Ljava/lang/Object;";
                i2 = 0;
                str2 = "get";
                break;
        }
        super(i2, obj, cls, str2, str, i2);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() throws Exception {
        switch (this.$t) {
            case 0:
                C7807FFo c7807FFo = (C7807FFo) this.receiver;
                ((C8631Fhi) c7807FFo.A01).invoke(c7807FFo);
                c7807FFo.A00.clear();
                break;
            case 1:
                ((FancyPinDataController) this.receiver).close();
                break;
            case 2:
                ((FancyPinOverlayView) this.receiver).unbindEngine();
                break;
            case 3:
                ((FancyPinsMapFrameSyncExecutor) this.receiver).close();
                break;
            case 4:
                ((FancyPinsPlugin) this.receiver).disableCollisionProxy();
                break;
            case 5:
            case 6:
            default:
                ((FancyPinsPlugin) this.receiver).requestUpdate();
                break;
            case 7:
                return AnonymousClass001.A0h();
            case 8:
                return ((AtomicReference) this.receiver).get();
        }
        return Unit.INSTANCE;
    }
}
