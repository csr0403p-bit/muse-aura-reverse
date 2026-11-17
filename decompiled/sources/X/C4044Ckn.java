package X;

import android.content.ComponentName;
import android.content.Context;
import com.facebook.analytics2.logger.GooglePlayUploadService;

/* renamed from: X.Ckn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4044Ckn extends AbstractC4063Cl8 {
    public final Context A00;
    public final ComponentName A01;

    public C4044Ckn(Context context) {
        this.A00 = context;
        this.A01 = new ComponentName(context, (Class<?>) GooglePlayUploadService.class);
    }
}
