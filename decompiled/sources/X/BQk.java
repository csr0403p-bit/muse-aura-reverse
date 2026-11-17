package X;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BQk extends ContentObserver {
    public final /* synthetic */ HzR<Unit> A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/HzR<Lkotlin/Unit;>;Landroid/os/Handler;)V */
    public BQk(Handler handler, HzR hzR) {
        super(handler);
        this.A00 = hzR;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.A00.AhZ(Unit.INSTANCE);
    }
}
