package X;

import android.view.Choreographer;
import androidx.glance.session.GlobalSnapshotManagerKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BCL extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BCL(int i, HtJ<? super BCL> htJ) {
        super(2, htJ);
        this.$t = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        int i;
        switch (this.$t) {
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
        return new BCL(i, htJ);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        HtJ htJ = (HtJ) obj2;
        switch (this.$t) {
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            default:
                if (htJ != null) {
                    htJ.getContext();
                }
                Unit unit = Unit.INSTANCE;
                Hwg.A00(unit);
                return unit;
        }
        return new BCL(i, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                if (this.A00 != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            case 1:
                if (this.A00 != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            case 2:
                if (this.A00 != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Choreographer.getInstance();
            default:
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                if (this.A00 == 0) {
                    Hwg.A00(obj);
                    this.A00 = 1;
                    if (GlobalSnapshotManagerKt.A00(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    Hwg.A00(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
