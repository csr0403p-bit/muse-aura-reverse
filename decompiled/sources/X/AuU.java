package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes4.dex */
public final class AuU implements InterfaceC2124Ayq {
    public final /* synthetic */ AuL A00;

    public AuU(AuL auL) {
        this.A00 = auL;
    }

    @Override // X.InterfaceC2124Ayq
    public final boolean ASI(Bundle bundle, C2129Ayx c2129Ayx, int i) {
        if ((i & 1) != 0) {
            try {
                InputContentInfo inputContentInfo = ((C2109AyZ) c2129Ayx.A00).A00;
                inputContentInfo.requestPermission();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception unused) {
                return false;
            }
        }
        InterfaceC2061AxY interfaceC2061AxY = this.A00.A00;
        InputContentInfo inputContentInfo2 = ((C2109AyZ) c2129Ayx.A00).A00;
        C1860AsY c1860AsY = new C1860AsY(new ClipData(inputContentInfo2.getDescription(), new ClipData.Item(inputContentInfo2.getContentUri())));
        C2131Ayz c2131Ayz = new C2131Ayz(inputContentInfo2.getDescription());
        Uri linkUri = inputContentInfo2.getLinkUri();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        C2040Ax7 c2040Ax7 = new C2040Ax7(new BLT(linkUri, bundle), c1860AsY, c2131Ayz, 0);
        if (((C1923Atk) interfaceC2061AxY).A00 != null) {
            return !C7384Etj.areEqual(((C2035Awp) r0).A00.onReceive(c2040Ax7), c2040Ax7);
        }
        return false;
    }
}
