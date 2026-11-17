package X;

import android.os.Handler;

/* renamed from: X.Bxt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3089Bxt implements C1HY {
    public static final C3089Bxt A08 = new C3089Bxt();
    public int A00;
    public int A01;
    public Handler A02;
    public boolean A03 = true;
    public boolean A04 = true;
    public final C5303Dfm A05 = new C5303Dfm(this, true);
    public final Runnable A06 = new Runnable() { // from class: X.Bxs
        public static final String __redex_internal_original_name = "ProcessLifecycleOwner$$ExternalSyntheticLambda0";

        @Override // java.lang.Runnable
        public final void run() {
            C3089Bxt c3089Bxt = this.A00;
            C3089Bxt c3089Bxt2 = C3089Bxt.A08;
            if (c3089Bxt.A00 == 0) {
                c3089Bxt.A03 = true;
                c3089Bxt.A05.A06(EnumC3085Bxl.ON_PAUSE);
            }
            if (c3089Bxt.A01 == 0 && c3089Bxt.A03) {
                c3089Bxt.A05.A06(EnumC3085Bxl.ON_STOP);
                c3089Bxt.A04 = true;
            }
        }
    };
    public final InterfaceC3092By0 A07 = new C3091Bxz(this);

    @Override // X.C1HY
    public final F2N getLifecycle() {
        return this.A05;
    }
}
