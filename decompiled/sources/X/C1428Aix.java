package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Aix, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1428Aix extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1429Aiy $placeableResult;
    public final /* synthetic */ long $positionOnScreen;
    public final /* synthetic */ long $size;
    public final /* synthetic */ AbstractC1424Ait this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1428Aix(AbstractC1424Ait abstractC1424Ait, C1429Aiy c1429Aiy, long j, long j2) {
        super(0);
        this.this$0 = abstractC1424Ait;
        this.$positionOnScreen = j;
        this.$size = j2;
        this.$placeableResult = c1429Aiy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Unit invoke() {
        AbstractC1424Ait abstractC1424Ait = this.this$0;
        C1425Aiu c1425Aiu = abstractC1424Ait.A01;
        if (c1425Aiu == null) {
            c1425Aiu = new C1425Aiu(abstractC1424Ait);
            abstractC1424Ait.A01 = c1425Aiu;
        }
        c1425Aiu.A02 = false;
        c1425Aiu.A00 = this.$positionOnScreen;
        c1425Aiu.A01 = this.$size;
        G0U<InterfaceC1620Amr, Unit> g0uAJs = this.$placeableResult.A00.AJs();
        if (g0uAJs != null) {
            g0uAJs.invoke(c1425Aiu);
        }
        return Unit.INSTANCE;
    }
}
