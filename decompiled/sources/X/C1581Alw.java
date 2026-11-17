package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;

/* renamed from: X.Alw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1581Alw {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public final C00q A04;
    public final C00q A05;
    public final C00s A06;
    public final MutableState A07;
    public final MutableState A08;
    public final InterfaceC1601AmT A09;
    public final InterfaceC1601AmT A0A;

    public C1581Alw(String str) {
        Boolean boolA0i = AnonymousClass001.A0i();
        AGE age = AGE.A00;
        this.A08 = C3cG.A08(age, boolA0i);
        this.A07 = C3cG.A08(age, AnonymousClass001.A0h());
        this.A05 = new ParcelableSnapshotMutableFloatState(0.0f);
        this.A06 = new ParcelableSnapshotMutableLongState(0L);
        this.A04 = new ParcelableSnapshotMutableFloatState(1.0f);
        this.A09 = new C1588AmF(FGI.A0M(str, " source"));
        this.A0A = new C1588AmF(FGI.A0M(str, " target"));
        this.A00 = -1L;
        this.A01 = -1L;
        this.A02 = -1L;
        this.A03 = -1L;
    }
}
