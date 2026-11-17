package X;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;

/* renamed from: X.60B, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C60B extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C60B(Object obj, LazyListState lazyListState, HtJ<? super C60B> htJ) {
        super(2, lazyListState);
        this.$t = htJ;
        this.A01 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        int i;
        switch (this.$t) {
            case 0:
                C60B c60b = new C60B(htJ);
                c60b.A01 = obj;
                return c60b;
            case 1:
                obj2 = this.A01;
                i = 1;
                break;
            default:
                obj2 = this.A01;
                i = 2;
                break;
        }
        return new C60B(obj2, htJ, i);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i;
        C60B c60b;
        HtJ htJ = (HtJ) obj2;
        switch (this.$t) {
            case 0:
                c60b = new C60B(htJ);
                c60b.A01 = obj;
                break;
            case 1:
                obj3 = this.A01;
                i = 1;
                c60b = new C60B(obj3, htJ, i);
                break;
            default:
                obj3 = this.A01;
                i = 2;
                c60b = new C60B(obj3, htJ, i);
                break;
        }
        return c60b.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C3UX c3ux;
        Object objAcF;
        int i = this.$t;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i2 = this.A00;
        switch (i) {
            case 0:
                if (i2 != 0) {
                    c3ux = (C3UX) this.A01;
                    Hwg.A00(obj);
                } else {
                    Hwg.A00(obj);
                    c3ux = (C3UX) this.A01;
                }
                while (HzS.A06(c3ux.AEA())) {
                    AnonymousClass604 anonymousClass604 = new AnonymousClass604(1);
                    this.A01 = c3ux;
                    this.A00 = 1;
                    if (AvW.A01(anonymousClass604, this) == enumC10460Hji) {
                        break;
                    }
                }
                break;
            case 1:
                if (i2 == 0) {
                    Hwg.A00(obj);
                    LazyListState lazyListState = (LazyListState) this.A01;
                    BCL bcl = new BCL(1, null);
                    this.A00 = 1;
                    objAcF = lazyListState.AcF(C3UY.A02, this, bcl);
                    if (objAcF == enumC10460Hji) {
                    }
                    break;
                }
                Hwg.A00(obj);
                break;
            default:
                if (i2 == 0) {
                    Hwg.A00(obj);
                    C20Q c20q = (C20Q) this.A01;
                    this.A00 = 1;
                    objAcF = c20q.collect(C3no.A00, this);
                    if (objAcF == enumC10460Hji) {
                    }
                    break;
                }
                Hwg.A00(obj);
                break;
        }
        return enumC10460Hji;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60B(HtJ<? super C60B> htJ) {
        super(2, htJ);
        this.$t = 0;
    }
}
