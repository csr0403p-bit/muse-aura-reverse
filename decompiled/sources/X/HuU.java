package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes6.dex */
public final /* synthetic */ class HuU implements InterfaceC2124Ayq {
    public final /* synthetic */ View A00;

    @Override // X.InterfaceC2124Ayq
    public final boolean ASI(Bundle bundle, C2129Ayx c2129Ayx, int i) {
        View view = this.A00;
        if ((i & 1) != 0) {
            try {
                InputContentInfo inputContentInfo = ((C2109AyZ) c2129Ayx.A00).A00;
                inputContentInfo.requestPermission();
                bundle = bundle == null ? BV6.A0N() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        InputContentInfo inputContentInfo2 = ((C2109AyZ) c2129Ayx.A00).A00;
        C8066FRu c8066FRu = new C8066FRu(new ClipData(inputContentInfo2.getDescription(), new ClipData.Item(inputContentInfo2.getContentUri())), 2);
        Uri linkUri = inputContentInfo2.getLinkUri();
        Hqo hqo = c8066FRu.A00;
        hqo.Add(linkUri);
        hqo.setExtras(bundle);
        return AnonymousClass002.A1Y(AbstractC8060FRo.A01(view, hqo.A5P()));
    }

    public /* synthetic */ HuU(View view) {
        this.A00 = view;
    }
}
