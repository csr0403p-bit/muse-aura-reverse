package X;

import android.app.Activity;
import com.facebook.payments.dcp.xapp.controller.purchase.IapPurchaseController;
import kotlin.Unit;

/* renamed from: X.FtA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8893FtA extends AbstractC07127nr implements G0V {
    public final int $t = 0;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/3UY;LX/5WW;LX/G0V<-TT;-LX/HtJ<-TR;>;+Ljava/lang/Object;>;TT;LX/HtJ<-LX/FtA;>;)V */
    public C8893FtA(C3UY c3uy, C5WW c5ww, Object obj, HtJ htJ, G0V g0v) {
        super(2, htJ);
        this.A07 = c3uy;
        this.A09 = c5ww;
        this.A06 = g0v;
        this.A08 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        if (this.$t != 0) {
            IapPurchaseController iapPurchaseController = (IapPurchaseController) this.A09;
            C9698Ge3 c9698Ge3 = (C9698Ge3) this.A08;
            return new C8893FtA((Activity) this.A06, (C9717GeV) this.A07, iapPurchaseController, c9698Ge3, htJ, (C10543Hqv) this.A01);
        }
        C8893FtA c8893FtA = new C8893FtA((C3UY) this.A07, (C5WW) this.A09, this.A08, htJ, (G0V) this.A06);
        c8893FtA.A01 = obj;
        return c8893FtA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x01ec: INVOKE (r4 I:X.BLa), (r6 I:java.lang.Object) INTERFACE call: X.BLa.Ahe(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:492), block:B:98:0x01ec */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a A[PHI: r1
  0x011a: PHI (r1v18 X.GfH) = (r1v17 X.GfH), (r1v19 X.GfH), (r1v20 X.GfH) binds: [B:13:0x002b, B:15:0x0033, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014d A[PHI: r1
  0x014d: PHI (r1v13 X.GfH) = (r1v12 X.GfH), (r1v14 X.GfH), (r1v15 X.GfH) binds: [B:56:0x0127, B:58:0x012f, B:60:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8893FtA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C8893FtA) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/facebook/payments/dcp/xapp/controller/purchase/IapPurchaseController;LX/Ge3;LX/GeV;LX/Hqv<Ljava/lang/String;>;Landroid/app/Activity;LX/HtJ<-LX/FtA;>;)V */
    public C8893FtA(Activity activity, C9717GeV c9717GeV, IapPurchaseController iapPurchaseController, C9698Ge3 c9698Ge3, HtJ htJ, C10543Hqv c10543Hqv) {
        super(2, htJ);
        this.A09 = iapPurchaseController;
        this.A08 = c9698Ge3;
        this.A07 = c9717GeV;
        this.A01 = c10543Hqv;
        this.A06 = activity;
    }
}
