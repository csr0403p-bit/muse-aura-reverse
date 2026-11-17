package X;

import android.content.Context;

/* renamed from: X.F9a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7658F9a {
    public final boolean A00;

    public C7658F9a() {
        this(true);
    }

    public static void A00(Context context, InterfaceC7646F8n interfaceC7646F8n, FBB fbb) {
        FD3.A03.A03(context, new C7658F9a(true), interfaceC7646F8n, fbb, null);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7658F9a) && this.A00 == ((C7658F9a) obj).A00);
    }

    public final String toString() {
        return FGI.A0p("Options(isTerminal=", ", mayChangeTopScreen=", ")", false, this.A00);
    }

    public final int hashCode() {
        return C0KA.A00(38347, this.A00);
    }

    public C7658F9a(boolean z) {
        this.A00 = z;
    }
}
