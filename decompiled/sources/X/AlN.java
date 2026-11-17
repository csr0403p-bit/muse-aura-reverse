package X;

import android.graphics.Rect;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AlN extends AbstractC7559F3s implements G2j<Integer, Integer, Integer, Integer, Unit> {
    public final /* synthetic */ int $semanticsId;
    public final /* synthetic */ C1558AlO this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlN(C1558AlO c1558AlO, int i) {
        super(4);
        this.this$0 = c1558AlO;
        this.$semanticsId = i;
    }

    @Override // X.G2j
    public final /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        int iA0F = AnonymousClass001.A0F(num);
        int iA0F2 = AnonymousClass001.A0F(num2);
        int iA0F3 = AnonymousClass001.A0F(num3);
        int iA0F4 = AnonymousClass001.A0F(num4);
        C1558AlO c1558AlO = this.this$0;
        InterfaceC1491Ajy interfaceC1491Ajy = c1558AlO.A03;
        ((AlR) interfaceC1491Ajy).A00.notifyViewEntered(c1558AlO.A05, this.$semanticsId, new Rect(iA0F, iA0F2, iA0F3, iA0F4));
        return Unit.INSTANCE;
    }
}
