package X;

import com.facebook.payments.dcp.xapp.controller.IapSessionContextController;
import com.meta.health.healthconnect.HealthConnectObserverImpl;
import java.util.UUID;
import kotlin.Unit;

/* renamed from: X.FtF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8898FtF extends AbstractC07127nr implements G0U {
    public final int $t;
    public int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8898FtF(Object obj, IapSessionContextController iapSessionContextController, Hs8 hs8, HtJ<? super C8898FtF> htJ) {
        super(1, hs8);
        this.$t = htJ;
        this.A02 = iapSessionContextController;
        this.A01 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        int i;
        int i2 = this.$t;
        Object obj = this.A02;
        Object obj2 = this.A01;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        return new C8898FtF(obj2, obj, htJ, i);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C8898FtF) create((HtJ) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.$t != 0) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            if (this.A00 != 0) {
                Hwg.A00(obj);
            } else {
                Hwg.A00(obj);
                InterfaceC8971FvL interfaceC8971FvL = (InterfaceC8971FvL) this.A02;
                UUID uuid = ((C8969FvH) this.A01).A00;
                this.A00 = 1;
                if (((HealthConnectObserverImpl) interfaceC8971FvL).A02.A02(uuid, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        EnumC10460Hji enumC10460Hji2 = EnumC10460Hji.A02;
        if (this.A00 != 0) {
            Hwg.A00(obj);
        } else {
            Hwg.A00(obj);
            IapSessionContextController iapSessionContextController = (IapSessionContextController) this.A02;
            Hs8 hs8 = (Hs8) this.A01;
            this.A00 = 1;
            obj = IapSessionContextController.A00(hs8, iapSessionContextController, this);
            if (obj == enumC10460Hji2) {
                return enumC10460Hji2;
            }
        }
        return obj;
    }
}
