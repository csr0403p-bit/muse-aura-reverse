package X;

import android.content.Intent;
import androidx.room.RoomDatabaseKt__RoomDatabaseKt;
import androidx.room.TriggerBasedInvalidationTracker;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EIR {
    public Intent A00;
    public C5297Dfd A01;
    public final EIN A02;
    public final TriggerBasedInvalidationTracker A03;
    public final Object A04;
    public final Map<C5296Dfc, C7550F2v> A05;
    public final AtomicInteger A06;
    public final ReentrantLock A07;
    public final Function0<Unit> A08;
    public final Function0<Unit> A09;
    public final String[] A0A;
    public final EC7 A0B;
    public final Map<String, String> A0C;
    public final Map<String, Set<String>> A0D;

    public EIR(EIN ein, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.A02 = ein;
        this.A0C = map;
        this.A0D = map2;
        this.A0A = strArr;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = new TriggerBasedInvalidationTracker(ein, map, map2, new EZ8(this, 1), strArr, ein.useTempTrackingTable);
        this.A03 = triggerBasedInvalidationTracker;
        this.A05 = C3cG.A0j();
        this.A07 = new ReentrantLock();
        this.A06 = BV4.A13(0);
        this.A09 = new C7589F5c(this, 2);
        this.A08 = new C7589F5c(this, 3);
        this.A0B = new EC7(ein);
        this.A04 = C3cG.A0T();
        triggerBasedInvalidationTracker.A00 = new C7589F5c(this, 4);
    }

    public final Object A00(HtJ<? super Unit> htJ) {
        RoomDatabaseKt__RoomDatabaseKt.A00(this.A02);
        Object objA04 = this.A03.A04(htJ);
        return objA04 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA04;
    }
}
