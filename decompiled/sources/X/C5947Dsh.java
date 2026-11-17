package X;

import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import kotlin.Unit;

/* renamed from: X.Dsh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5947Dsh extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5947Dsh(String str, int i) {
        super(1);
        this.$t = i;
        this.A00 = str;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        PointEditor pointEditorAddPointData;
        String str;
        String str2;
        String str3;
        int i = this.$t;
        MarkerEditor markerEditorA01 = AbstractC7559F3s.A01(obj);
        switch (i) {
            case 1:
                str3 = "register_token";
                pointEditorAddPointData = markerEditorA01.pointEditor(str3);
                str = "provider_name";
                str2 = this.A00;
                break;
            case 2:
            default:
                str3 = "unregister_token";
                pointEditorAddPointData = markerEditorA01.pointEditor(str3);
                str = "provider_name";
                str2 = this.A00;
                break;
            case 3:
                pointEditorAddPointData = markerEditorA01.pointEditor("get_token_error").addPointData("provider_name", this.A00);
                str = "error_type";
                str2 = "GetTokenException";
                break;
        }
        pointEditorAddPointData.addPointData(str, str2);
        return Unit.INSTANCE;
    }
}
