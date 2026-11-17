package X;

import android.database.ContentObserver;
import kotlin.Unit;

/* renamed from: X.FtI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8901FtI extends AbstractC07127nr implements G0W {
    public final int $t;
    public int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8901FtI(Object obj, EIR eir, HtJ<? super C8901FtI> htJ) {
        super(3, eir);
        this.$t = htJ;
        this.A01 = obj;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.$t;
        HtJ htJ = (HtJ) obj3;
        Object obj4 = this.A01;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        return new C8901FtI(obj4, htJ, i).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                if (this.A00 != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                ((EIR) this.A01).A06.decrementAndGet();
                break;
            case 1:
                if (this.A00 != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                C9607GRo c9607GRo = (C9607GRo) this.A01;
                int i = c9607GRo.A00 - 1;
                c9607GRo.A00 = i;
                if (i == 0) {
                    AbstractC7608F5v.A1L("No more collectors. Stopping audio level updates.");
                    HoC hoC = c9607GRo.A03;
                    if (hoC != null) {
                        hoC.A5w(null);
                    }
                    c9607GRo.A03 = null;
                    break;
                }
                break;
            case 2:
                if (this.A00 != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                C9608GRp c9608GRp = (C9608GRp) this.A01;
                if (c9608GRp.A04.decrementAndGet() == 0) {
                    ContentObserver contentObserver = c9608GRp.A00;
                    if (contentObserver != null) {
                        c9608GRp.A02.getContentResolver().unregisterContentObserver(contentObserver);
                    }
                    c9608GRp.A00 = null;
                    break;
                }
                break;
            default:
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                if (this.A00 != 0) {
                    Hwg.A00(obj);
                    break;
                } else {
                    Hwg.A00(obj);
                    HwK hwK = HwK.A00;
                    C8902FtJ c8902FtJ = new C8902FtJ(this.A01, null, 14);
                    this.A00 = 1;
                    if (GAo.A00(this, hwK, c8902FtJ) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
