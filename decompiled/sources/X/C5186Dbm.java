package X;

import com.google.common.base.Preconditions;

/* renamed from: X.Dbm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5186Dbm implements InterfaceC5182Dbb {
    public boolean A00;
    public final C5175DbI A01 = new C5175DbI();
    public final C5175DbI A02 = new C5175DbI();

    @Override // X.InterfaceC5182Dbb, X.InterfaceC5183Dbc
    public final /* bridge */ /* synthetic */ DY5 build() {
        Preconditions.checkArgument(this.A00);
        return DY2.A00(AbstractC5176DbJ.A00(), "DCPCreatePurchasedOrderMutation", "input", "pay_dcp_create_purchased_order", C3cG.A0h(), C5175DbI.A00(this.A01), C5175DbI.A00(this.A02), C7460Ewl.A00, 12, true);
    }

    @Override // X.InterfaceC5183Dbc
    public final /* bridge */ /* synthetic */ DYI build() {
        throw F60.createAndThrow();
    }
}
