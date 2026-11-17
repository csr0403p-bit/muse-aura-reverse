package X;

import kotlin.Unit;

/* renamed from: X.0w1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0w1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ String $labelText;
    public final /* synthetic */ String $pattern;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0w1(String str, String str2) {
        super(1);
        this.$labelText = str;
        this.$pattern = str2;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        AbstractC1564Ale.A08(interfaceC0857A6e, FGI.A0U(this.$labelText, ", ", this.$pattern));
        return Unit.INSTANCE;
    }
}
