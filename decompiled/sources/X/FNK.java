package X;

import android.util.LruCache;

/* loaded from: classes6.dex */
public final class FNK extends LruCache implements InterfaceC8014FPl {
    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Hi0 hi0 = (Hi0) obj2;
        if (z) {
            FNe.A05.A03(hi0);
        }
    }
}
