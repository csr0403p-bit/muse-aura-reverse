package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.Ehe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7169Ehe implements InterfaceC7136Egs {
    public final InterfaceC7005EeA<Integer> A00;
    public final InterfaceC7005EeA<Boolean> A01;
    public final InterfaceC7005EeA<Boolean> A02 = AbstractC7180Ehp.A00;
    public final InterfaceC7153EhO A03;
    public final AbstractC7151EhM A04;
    public final InterfaceC7127Egh<CCV, InterfaceC7064EfB> A05;
    public final ExecutorService A06;
    public final InterfaceC7005EeA<Integer> A07;
    public final InterfaceC7005EeA<Integer> A08;
    public final InterfaceC7005EeA<Boolean> A09;
    public final InterfaceC7005EeA<Integer> A0A;
    public final InterfaceC7005EeA<Boolean> A0B;
    public final DK9 A0C;
    public final ScheduledExecutorService A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C7277Ek3 A00(android.graphics.Bitmap.Config r19, X.C7169Ehe r20, X.C7197Ei9 r21, X.EhK r22) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7169Ehe.A00(android.graphics.Bitmap$Config, X.Ehe, X.Ei9, X.EhK):X.Ek3");
    }

    public C7169Ehe(InterfaceC7005EeA interfaceC7005EeA, InterfaceC7005EeA interfaceC7005EeA2, InterfaceC7005EeA interfaceC7005EeA3, InterfaceC7005EeA interfaceC7005EeA4, InterfaceC7005EeA interfaceC7005EeA5, InterfaceC7005EeA interfaceC7005EeA6, InterfaceC7005EeA interfaceC7005EeA7, DK9 dk9, InterfaceC7153EhO interfaceC7153EhO, AbstractC7151EhM abstractC7151EhM, InterfaceC7127Egh interfaceC7127Egh, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = interfaceC7153EhO;
        this.A0D = scheduledExecutorService;
        this.A06 = executorService;
        this.A0C = dk9;
        this.A04 = abstractC7151EhM;
        this.A05 = interfaceC7127Egh;
        this.A00 = interfaceC7005EeA;
        this.A0A = interfaceC7005EeA2;
        this.A01 = interfaceC7005EeA3;
        this.A0B = interfaceC7005EeA4;
        this.A09 = interfaceC7005EeA5;
        this.A07 = interfaceC7005EeA6;
        this.A08 = interfaceC7005EeA7;
        this.A0E = z;
        this.A0F = z2;
        this.A0G = z3;
        this.A0H = z4;
    }

    @Override // X.InterfaceC7136Egs
    public final Drawable createDrawable(Resources resources, InterfaceC7064EfB interfaceC7064EfB, C7197Ei9 c7197Ei9) throws Throwable {
        InterfaceC7173Ehi interfaceC7173Ehi;
        Object objA0s;
        Object extra;
        EhK ehK;
        AnonymousClass003.A0x(interfaceC7064EfB, c7197Ei9);
        if (!(interfaceC7064EfB instanceof C7150EhL)) {
            return null;
        }
        C7150EhL c7150EhL = (C7150EhL) interfaceC7064EfB;
        synchronized (interfaceC7064EfB) {
            try {
                EhK ehK2 = c7150EhL.A00;
                interfaceC7173Ehi = ehK2 == null ? null : ehK2.A02;
            } catch (Throwable th) {
                th = th;
            }
        }
        synchronized (interfaceC7064EfB) {
        }
        System.nanoTime();
        try {
            synchronized (interfaceC7064EfB) {
                ehK = c7150EhL.A00;
            }
            ehK.getClass();
            objA0s = A00(interfaceC7173Ehi != null ? interfaceC7173Ehi.getAnimatedBitmapConfig() : null, this, c7197Ei9, ehK);
        } catch (Throwable th2) {
            objA0s = C3cG.A0s(th2);
        }
        th = HsJ.A00(objA0s);
        if (th == null) {
            InterfaceC7278Ek4 interfaceC7278Ek4 = (InterfaceC7278Ek4) objA0s;
            Drawable c7280Ek6 = AnonymousClass001.A1X(this.A02.get()) ? new C7280Ek6(interfaceC7278Ek4) : new C7279Ek5(interfaceC7278Ek4);
            System.nanoTime();
            return c7280Ek6;
        }
        if ((th instanceof NullPointerException) && (extra = c7150EhL.getExtra("uri_source", null)) != null) {
            throw BV4.A0a(AnonymousClass006.A0y(extra, " uri=", C3cG.A0g(th.getMessage())));
        }
        throw th;
    }
}
