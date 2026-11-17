package X;

import com.google.common.base.Preconditions;

/* renamed from: X.Dba, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5181Dba implements InterfaceC5183Dbc {
    public boolean A00;
    public final C5175DbI A01 = new C5175DbI();
    public final C5175DbI A02 = new C5175DbI();

    @Override // X.InterfaceC5183Dbc
    public final /* bridge */ /* synthetic */ DYI build() {
        Preconditions.checkArgument(this.A00);
        return DY2.A00(AbstractC5176DbJ.A00(), "DCPProductInfoQuery", null, "dcp_query_product_info", C3cG.A0h(), C5175DbI.A00(this.A01), C5175DbI.A00(this.A02), C7458Ewj.A00, 0, false);
    }
}
