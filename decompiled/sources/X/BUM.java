package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BUM extends F2X implements G0V {
    public final int $t;

    /* JADX WARN: Illegal instructions before constructor call */
    public BUM(Object obj, int i) {
        Class cls;
        String str;
        int i2;
        int i3;
        String str2;
        this.$t = i;
        switch (i) {
            case 0:
                cls = C1262Ag1.class;
                str = "onWheelScrollStopped-TH1AsA0(J)V";
                i2 = 4;
                i3 = 2;
                str2 = "onWheelScrollStopped";
                break;
            case 1:
                cls = C1262Ag1.class;
                str = "onTrackpadScrollStopped-TH1AsA0(J)V";
                i2 = 4;
                i3 = 2;
                str2 = "onTrackpadScrollStopped";
                break;
            default:
                cls = B1U.class;
                str = "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;";
                i2 = 8;
                i3 = 2;
                str2 = "invoke";
                break;
        }
        super(i3, obj, cls, str2, str, i2);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        long j;
        C1262Ag1 c1262Ag1;
        C3UX c3uxA02;
        HtJ htJ;
        int i;
        switch (this.$t) {
            case 0:
                j = ((C1251Afj) obj).A00;
                c1262Ag1 = (C1262Ag1) this.receiver;
                c3uxA02 = c1262Ag1.A09.A02();
                htJ = null;
                i = 3;
                AnonymousClass001.A1J(new BU3(c1262Ag1, htJ, i, j), c3uxA02);
                break;
            case 1:
                j = ((C1251Afj) obj).A00;
                c1262Ag1 = (C1262Ag1) this.receiver;
                c3uxA02 = c1262Ag1.A09.A02();
                htJ = null;
                i = 2;
                AnonymousClass001.A1J(new BU3(c1262Ag1, htJ, i, j), c3uxA02);
                break;
            default:
                int iA0F = AnonymousClass001.A0F(obj2);
                ((B1U) this.receiver).A0B((BFM) obj, iA0F);
                break;
        }
        return Unit.INSTANCE;
    }
}
