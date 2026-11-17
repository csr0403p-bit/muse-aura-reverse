package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Fhj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8632Fhj extends AbstractC7559F3s implements Function0 {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8632Fhj(int i) {
        super(0);
        this.$t = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 1:
                return new C0917AHt(6);
            case 2:
            case 3:
            case 4:
                return AnonymousClass001.A0h();
            case 5:
                return "DEFAULT";
            case 6:
                AIY aiy = new AIY();
                Iterator itA10 = BV5.A10(AbstractC9044FxQ.A02);
                while (itA10.hasNext()) {
                    aiy.add(AbstractC9051FxZ.A00(((HiP) itA10.next()).A02));
                }
                aiy.add(AbstractC9051FxZ.A00(C3cG.A0x(C9048FxW.class)));
                aiy.add(AbstractC9051FxZ.A00(C3cG.A0x(C9003Fwg.class)));
                return AIX.A00(aiy);
            default:
                return null;
        }
    }
}
