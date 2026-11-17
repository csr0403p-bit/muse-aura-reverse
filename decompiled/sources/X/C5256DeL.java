package X;

import android.app.Application;
import android.content.Context;

/* renamed from: X.DeL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5256DeL implements InterfaceC5264DeT<Context, C5251DeG> {
    @Override // X.InterfaceC5264DeT
    public final /* bridge */ /* synthetic */ C5251DeG APe(Context context) {
        Context context2 = context;
        Application application = C4JM.A00;
        if (application != null) {
            return new C5251DeG(context2, new C5254DeJ(application));
        }
        throw C3cG.A0Q("An application must be set ```AppContext.set(app)``` before you can start performing injections");
    }
}
