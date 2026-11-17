package X;

import java.util.List;

/* renamed from: X.Ary, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1834Ary implements InterfaceC1841AsE {
    public final ApQ A00;
    public final List<C1836As0> A01;
    public final List<C1733ApU<C1821Arl>> A02;
    public final F0C A03;
    public final F0C A04;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        throw X.C60O.A0i(r0);
     */
    /* JADX WARN: Incorrect types in method signature: (LX/ApQ;LX/Arm;Ljava/util/List<LX/ApU<LX/Arl;>;>;LX/AXN;LX/2K7;)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1834Ary(X.ApQ r33, X.C1822Arm r34, X.C2K7 r35, X.AXN r36, java.util.List r37) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1834Ary.<init>(X.ApQ, X.Arm, X.2K7, X.AXN, java.util.List):void");
    }

    @Override // X.InterfaceC1841AsE
    public final boolean AG7() {
        List<C1836As0> list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).A02.AG7()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1841AsE
    public final float AHR() {
        return AnonymousClass001.A02(this.A03.getValue());
    }

    @Override // X.InterfaceC1841AsE
    public final float AHj() {
        return AnonymousClass001.A02(this.A04.getValue());
    }
}
