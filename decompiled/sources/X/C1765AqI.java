package X;

import kotlin.Unit;

/* renamed from: X.AqI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1765AqI extends C7438Evz implements G0U<C1392AiN, Unit> {
    public final /* synthetic */ InterfaceC1766AqJ $node;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1765AqI(InterfaceC1766AqJ interfaceC1766AqJ) {
        super(1, C2yI.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.$node = interfaceC1766AqJ;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(C1392AiN c1392AiN) {
        float[] fArr = c1392AiN.A00;
        InterfaceC1497Ak4 interfaceC1497Ak4 = (InterfaceC1497Ak4) ((AuZ) this.$node).A03.getValue();
        if (interfaceC1497Ak4 != null && interfaceC1497Ak4.isAttached()) {
            interfaceC1497Ak4.AhK(fArr);
        }
        return Unit.INSTANCE;
    }
}
