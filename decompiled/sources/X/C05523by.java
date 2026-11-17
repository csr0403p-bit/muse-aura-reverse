package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3by, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05523by extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05523by(int i, Object obj, Object obj2) {
        super(0);
        this.$t = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        C3UX c3ux;
        Object obj;
        HtJ htJ;
        int i;
        switch (this.$t) {
            case 0:
                c3ux = (C3UX) this.A00;
                obj = this.A01;
                htJ = null;
                i = 2;
                break;
            case 1:
                c3ux = (C3UX) this.A00;
                obj = this.A01;
                htJ = null;
                i = 3;
                break;
            default:
                C1Pn c1Pn = (C1Pn) this.A01;
                if (AnonymousClass003.A1X(C1Vj.PartiallyExpanded, c1Pn.A00.A0B)) {
                    AnonymousClass001.A1J(new C05363bi(c1Pn, null, 11), (C3UX) this.A00);
                }
                return AnonymousClass001.A0i();
        }
        AnonymousClass001.A1J(new C05363bi(obj, htJ, i), c3ux);
        return Unit.INSTANCE;
    }
}
