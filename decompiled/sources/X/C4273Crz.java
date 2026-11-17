package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.Crz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4273Crz implements InterfaceC4394Cux {
    public final /* synthetic */ BasePendingResult A00;
    public final /* synthetic */ C4170CoW A01;

    public C4273Crz(BasePendingResult basePendingResult, C4170CoW c4170CoW) {
        this.A01 = c4170CoW;
        this.A00 = basePendingResult;
    }

    @Override // X.InterfaceC4394Cux
    public final void ASJ(Status status) {
        this.A01.A00.remove(this.A00);
    }
}
