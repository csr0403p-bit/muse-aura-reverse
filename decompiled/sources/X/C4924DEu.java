package X;

import android.util.Pair;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DEu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4924DEu {
    public int A00;
    public long A01;
    public long A02;
    public C6154Dwx A03;
    public C5480DjH A04;
    public C4927DEx A05;
    public List<? extends EnumC5684DnO> A06;
    public List<? extends Pair<DnW, String>> A07 = new CopyOnWriteArrayList();
    public final AtomicReference<String> A08 = BV4.A15();
    public final AtomicReference<AbstractC6071DvB> A09 = BV4.A15();
    public final AtomicReference<ImmutableMap<String, String>> A0A = BV4.A16(RegularImmutableMap.A03);

    /* JADX WARN: Incorrect types in method signature: (LX/Dwx;JJILjava/util/List<+LX/DnO;>;)V */
    public C4924DEu(C6154Dwx c6154Dwx, List list, int i, long j, long j2) {
        this.A03 = c6154Dwx;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = i;
        this.A06 = new CopyOnWriteArrayList(list);
    }
}
