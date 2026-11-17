package X;

import android.content.Context;
import com.facebook.aura.R;
import java.lang.ref.WeakReference;

/* renamed from: X.FQw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8045FQw implements InterfaceC7646F8n {
    public final /* synthetic */ String A00;

    public C8045FQw(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC7646F8n
    public final void execute(Context context, FBB fbb, Integer num) {
        C8040FQr c8040FQr;
        String str = this.A00;
        WeakReference<C8040FQr> weakReference = AbstractC8043FQu.A00;
        if (str == null || (c8040FQr = AbstractC8043FQu.A00.get()) == null || !str.equals(c8040FQr.getTag(R.id.foa_toast_tag_server_id))) {
            return;
        }
        c8040FQr.A03(c8040FQr.A01);
    }
}
