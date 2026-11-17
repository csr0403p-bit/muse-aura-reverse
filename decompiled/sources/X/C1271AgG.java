package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.AgG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1271AgG extends C7438Evz implements Function0<AaC> {
    public final /* synthetic */ Function0<AaC> $boundsProvider;
    public final /* synthetic */ InterfaceC1497Ak4 $childCoordinates;
    public final /* synthetic */ C1266AgB this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1271AgG(C1266AgB c1266AgB, InterfaceC1497Ak4 interfaceC1497Ak4, Function0<AaC> function0) {
        super(0, C2yI.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.this$0 = c1266AgB;
        this.$childCoordinates = interfaceC1497Ak4;
        this.$boundsProvider = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ AaC invoke() {
        return C1266AgB.A00(this.this$0, this.$childCoordinates, this.$boundsProvider);
    }
}
