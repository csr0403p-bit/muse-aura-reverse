package X;

import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import java.util.List;

/* renamed from: X.Cpn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4201Cpn extends AbstractC4379Cud {
    public final /* synthetic */ C4196CpV A00;
    public final /* synthetic */ CSE A01;

    public C4201Cpn(C4196CpV c4196CpV, CSE cse) {
        this.A01 = cse;
        this.A00 = c4196CpV;
    }

    @Override // X.AbstractC4379Cud
    public final void onLocationResult(LocationResult locationResult) {
        CSE cse = this.A01;
        List list = locationResult.A00;
        int size = list.size();
        cse.A00.A0H(size == 0 ? null : list.get(size - 1));
        try {
            C4196CpV c4196CpV = this.A00;
            CRy.A07("GetCurrentLocation", "Listener type must not be empty");
            c4196CpV.A07(new C4248CrK(this, "GetCurrentLocation"), new CSE(), false);
        } catch (RemoteException unused) {
        }
    }
}
