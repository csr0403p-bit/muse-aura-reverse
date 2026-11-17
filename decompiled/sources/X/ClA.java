package X;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class ClA implements InterfaceC4009Cjn {
    @Override // X.InterfaceC4009Cjn
    public final void onSuccess() {
    }

    @Override // X.InterfaceC4009Cjn
    public final void onFailure(IOException iOException) {
        CFK.A0J("InProcessUploadScheduler", iOException, "Failed to upload batch, it will not be retried");
    }
}
