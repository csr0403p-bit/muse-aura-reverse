package X;

import android.content.ContentResolver;
import android.graphics.Rect;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class DVR extends AbstractC7009EeG implements InterfaceC7013EeK<C6988Edo> {
    public final ContentResolver A00;
    public static final String[] A03 = {"_id", "_data"};
    public static final String[] A04 = {"_data"};
    public static final Rect A02 = new Rect(0, 0, 512, 384);
    public static final Rect A01 = new Rect(0, 0, 96, 96);

    @Override // X.InterfaceC7013EeK
    public final boolean A5u(C7481Exe c7481Exe) {
        Rect rect = A02;
        return AbstractC6999Ee1.A00(c7481Exe, rect.width(), rect.height());
    }

    public DVR(ContentResolver contentResolver, C7011EeI c7011EeI, Executor executor) {
        super(c7011EeI, executor);
        this.A00 = contentResolver;
    }
}
