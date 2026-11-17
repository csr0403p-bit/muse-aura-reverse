package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1Cr, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Cr extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ String $closeSheet;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1Cr(String str, Function0<Unit> function0) {
        super(1);
        this.$closeSheet = str;
        this.$onDismissRequest = function0;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        InterfaceC0857A6e interfaceC0857A6e2 = interfaceC0857A6e;
        interfaceC0857A6e2.Aca(AbstractC1671Anw.A0h, Float.valueOf(1.0f));
        AbstractC1564Ale.A08(interfaceC0857A6e2, this.$closeSheet);
        AbstractC1564Ale.A0A(interfaceC0857A6e2, null, new C05453br(this.$onDismissRequest, 8));
        return Unit.INSTANCE;
    }
}
