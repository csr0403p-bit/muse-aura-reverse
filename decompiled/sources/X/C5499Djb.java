package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Djb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5499Djb implements InterfaceC5487DjP {
    public final InterfaceC5487DjP A00;
    public final ImmutableList<Integer> A01;

    @Override // X.InterfaceC5487DjP
    public final boolean A7A(Du1 du1) {
        return this.A00.A7A(du1);
    }

    @Override // X.InterfaceC5487DjP
    public final /* synthetic */ long AD6(long j) {
        return this.A00.AD8() - j;
    }

    @Override // X.InterfaceC5487DjP
    public final long AD8() {
        return this.A00.AD8();
    }

    @Override // X.InterfaceC5487DjP
    public final long AI5() {
        return this.A00.AI5();
    }

    @Override // X.InterfaceC5487DjP
    public final boolean AOd() {
        return this.A00.AOd();
    }

    @Override // X.InterfaceC5487DjP
    public final void AZv(long j) {
        this.A00.AZv(j);
    }

    public C5499Djb(InterfaceC5487DjP interfaceC5487DjP, List<Integer> list) {
        this.A00 = interfaceC5487DjP;
        this.A01 = ImmutableList.copyOf((Collection) list);
    }
}
