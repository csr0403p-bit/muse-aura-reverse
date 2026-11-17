package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3c5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3c5 extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3c5(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.$t = i;
        this.A02 = obj;
        this.A00 = obj3;
        this.A01 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.$t;
        Object obj = this.A02;
        if (i != 0) {
            if (AnonymousClass003.A1X(C1Vj.Expanded, ((C1Pn) obj).A00.A0B)) {
                AnonymousClass001.A1J(new C05363bi(this.A01, null, 10), (C3UX) this.A00);
            }
            return AnonymousClass001.A0i();
        }
        C1Pn c1Pn = (C1Pn) obj;
        if (AnonymousClass003.A1X(C1Vj.Hidden, c1Pn.A00.A0B)) {
            AnonymousClass001.A11(new C05363bi(c1Pn, null, 9), (C3UX) this.A01).AO5(new C05513bx(1, this.A00, c1Pn));
        }
        return Unit.INSTANCE;
    }
}
