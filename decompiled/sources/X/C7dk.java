package X;

import kotlin.Unit;

/* renamed from: X.7dk, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7dk extends C7dn {
    public final int A00;
    public final String A01;
    public final G0U<InterfaceC2266BNk, Unit> A02;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TextContextMenuItem(key=");
        sbA0x.append(super.A00);
        sbA0x.append(", label=\"");
        sbA0x.append(this.A01);
        sbA0x.append("\", leadingIcon=");
        sbA0x.append(this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;Ljava/lang/String;ILX/G0U<-LX/BNk;Lkotlin/Unit;>;)V */
    public C7dk(Object obj, String str, G0U g0u, int i) {
        super(obj);
        this.A01 = str;
        this.A00 = i;
        this.A02 = g0u;
    }
}
