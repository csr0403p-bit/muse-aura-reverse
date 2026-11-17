package X;

import com.google.android.gms.location.LocationResult;

/* renamed from: X.Cu8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4363Cu8 implements InterfaceC4283CsI {
    public final /* synthetic */ LocationResult A00;

    public C4363Cu8(LocationResult locationResult) {
        this.A00 = locationResult;
    }

    @Override // X.InterfaceC4283CsI
    public final /* synthetic */ void ARP(Object obj) {
        ((AbstractC4379Cud) obj).onLocationResult(this.A00);
    }
}
