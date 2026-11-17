package X;

import kotlin.Unit;

/* renamed from: X.FXa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8158FXa extends AbstractC07127nr implements G0V {
    public final int $t;
    public boolean A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8158FXa(int i, HtJ<? super C8158FXa> htJ) {
        super(2, htJ);
        this.$t = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        int i;
        C8158FXa c8158FXa;
        boolean zA1X;
        switch (this.$t) {
            case 0:
                i = 0;
                c8158FXa = new C8158FXa(i, htJ);
                zA1X = AnonymousClass001.A1X(obj);
                break;
            case 1:
                i = 1;
                c8158FXa = new C8158FXa(i, htJ);
                zA1X = AnonymousClass001.A1X(obj);
                break;
            default:
                c8158FXa = new C8158FXa(2, htJ);
                zA1X = AnonymousClass001.A1X(obj);
                break;
        }
        c8158FXa.A00 = zA1X;
        return c8158FXa;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        boolean z;
        if (this.$t != 0) {
            z = this.A00;
            Hwg.A00(obj);
        } else {
            Hwg.A00(obj);
            z = this.A00;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C8158FXa) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }
}
