package X;

import java.io.IOException;

/* renamed from: X.ClB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4064ClB implements InterfaceC4009Cjn {
    @Override // X.InterfaceC4009Cjn
    public final void onSuccess() {
    }

    @Override // X.InterfaceC4009Cjn
    public final void onFailure(IOException iOException) {
        CFK.A0J("InProcessUploadScheduler", iOException, "Failed to upload batch, it will not be retried");
    }
}
