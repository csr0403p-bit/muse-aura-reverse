package X;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: X.DfZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RemoteCallbackListC5294DfZ extends RemoteCallbackList<IMultiInstanceInvalidationCallback> {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    @Override // android.os.RemoteCallbackList
    public final /* bridge */ /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
        C7384Etj.A0Y(obj, 1);
        this.A00.A02.remove(obj);
    }

    public RemoteCallbackListC5294DfZ(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.A00 = multiInstanceInvalidationService;
    }
}
