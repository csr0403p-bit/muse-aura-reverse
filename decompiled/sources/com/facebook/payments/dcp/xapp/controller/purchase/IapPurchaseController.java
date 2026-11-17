package com.facebook.payments.dcp.xapp.controller.purchase;

import X.AnonymousClass003;
import X.C3cG;
import X.C78U;
import X.C9574GPi;
import X.C9661Gd3;
import X.C9685Gdp;
import X.C9696Ge1;
import X.C9697Ge2;
import X.C9698Ge3;
import X.C9699Ge6;
import X.C9702GeG;
import X.C9716GeU;
import X.C9717GeV;
import X.C9719GeX;
import X.C9722Gea;
import X.C9758GfC;
import X.C9760GfE;
import X.EnumC9704GeI;
import X.HjL;
import X.Hs0;
import X.HsR;
import X.Hx5;
import X.InterfaceC9568GPa;
import X.InterfaceC9729Gei;
import X.InterfaceC9761GfF;
import android.os.SystemClock;
import com.facebook.aura.iap.HatchIapCacheProvider;
import com.facebook.payments.dcp.iap.internal.mutator.IapMutator;
import com.facebook.payments.dcp.xapp.controller.IapSessionContextController;
import com.facebook.payments.dcp.xapp.controller.productinfo.DcpProductDetailsLoader;
import com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController;
import com.facebook.quicklog.reliability.CancelReason;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes6.dex */
public final class IapPurchaseController {
    public final HsR A00;
    public final C9699Ge6 A01;
    public final InterfaceC9729Gei A02;
    public final C9574GPi A03;
    public final IapSessionContextController A04;
    public final ConsumePurchaseController A05;
    public final IapPaymentController A06;
    public final IapPrePaymentController A07;
    public final IapQuoteController A08;
    public final C78U A09;
    public final C9716GeU A0A;
    public final HatchIapCacheProvider A0B;
    public final IapMutator A0C;
    public final C9685Gdp A0D;
    public final IapVerifyPurchaseController A0E;

    public IapPurchaseController(HatchIapCacheProvider hatchIapCacheProvider, IapMutator iapMutator, HsR hsR, C9699Ge6 c9699Ge6, C9685Gdp c9685Gdp, InterfaceC9729Gei interfaceC9729Gei, C9574GPi c9574GPi, IapSessionContextController iapSessionContextController, ConsumePurchaseController consumePurchaseController, IapQuoteController iapQuoteController, C78U c78u, C9716GeU c9716GeU) {
        this.A01 = c9699Ge6;
        this.A00 = hsR;
        this.A02 = interfaceC9729Gei;
        this.A09 = c78u;
        this.A08 = iapQuoteController;
        this.A05 = consumePurchaseController;
        this.A04 = iapSessionContextController;
        this.A0C = iapMutator;
        this.A0A = c9716GeU;
        this.A03 = c9574GPi;
        this.A0D = c9685Gdp;
        this.A0B = hatchIapCacheProvider;
        this.A06 = new IapPaymentController(hsR, c9699Ge6, interfaceC9729Gei, c9574GPi, this, c9716GeU);
        InterfaceC9568GPa interfaceC9568GPa = c9685Gdp.A00;
        this.A07 = new IapPrePaymentController(hatchIapCacheProvider, hsR, c9699Ge6, interfaceC9568GPa, interfaceC9729Gei, c9574GPi, new DcpProductDetailsLoader(interfaceC9568GPa, c9574GPi), this, c9716GeU);
        this.A0E = new IapVerifyPurchaseController(iapMutator, c9699Ge6, c9685Gdp.A02, c9574GPi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.GeI, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v5, types: [X.GeU] */
    public static final void A00(C9717GeV c9717GeV, IapPurchaseController iapPurchaseController, EnumC9704GeI enumC9704GeI, InterfaceC9761GfF interfaceC9761GfF) throws Throwable {
        boolean z;
        ?? r9;
        boolean z2;
        boolean z3;
        boolean zEquals;
        boolean zEquals2;
        boolean zEquals3;
        boolean z4;
        boolean z5;
        boolean zEquals4;
        boolean zEquals5;
        boolean zEquals6;
        NoWhenBranchMatchedException noWhenBranchMatchedExceptionA0q;
        Hx5 hx5 = 0;
        C9698Ge3 c9698Ge3 = null;
        long jElapsedRealtime = 0;
        boolean z6 = false;
        boolean z7 = false;
        C9661Gd3 c9661Gd3 = null;
        if (c9717GeV != null) {
            r9 = iapPurchaseController.A0A;
            synchronized (r9) {
                if (c9717GeV.A04) {
                    return;
                }
                c9717GeV.A04 = true;
                C9697Ge2 c9697Ge2 = r9.A01.A01;
                C9717GeV c9717GeV2 = c9697Ge2.A00;
                if ((c9717GeV2 != null ? c9717GeV2.A08 : null) == c9717GeV.A08) {
                    z6 = true;
                    c9697Ge2.A00 = null;
                }
                c9698Ge3 = c9717GeV.A01;
                c9661Gd3 = c9717GeV.A02;
                Hx5 hx52 = c9717GeV.A0B;
                z7 = c9717GeV.A05;
                jElapsedRealtime = SystemClock.elapsedRealtime() - c9717GeV.A06;
                z = true;
                hx5 = hx52;
            }
        } else {
            z = false;
        }
        try {
            r9 = enumC9704GeI;
            C9758GfC c9758GfC = C9758GfC.A00;
            if (interfaceC9761GfF.equals(c9758GfC) || interfaceC9761GfF.equals(C9696Ge1.A00)) {
                try {
                    HsR hsR = iapPurchaseController.A00;
                    if (hsR != null) {
                        HjL hjL = (HjL) hsR;
                        hjL.A04.flowEndCancel(hjL.A01, CancelReason.USER_CANCELLED);
                    }
                    iapPurchaseController.A01.A0R(c9698Ge3, c9661Gd3, r9);
                } catch (Throwable th) {
                    iapPurchaseController.A01.A0R(c9698Ge3, c9661Gd3, r9);
                    throw th;
                }
            } else if (interfaceC9761GfF.equals(C9760GfE.A00)) {
                try {
                    HsR hsR2 = iapPurchaseController.A00;
                    if (hsR2 != null) {
                        HjL hjL2 = (HjL) hsR2;
                        hjL2.A04.flowEndCancel(hjL2.A01, CancelReason.USER_CANCELLED);
                    }
                    iapPurchaseController.A01.A0S(c9698Ge3, c9661Gd3, r9);
                } catch (Throwable th2) {
                    iapPurchaseController.A01.A0S(c9698Ge3, c9661Gd3, r9);
                    throw th2;
                }
            } else if (interfaceC9761GfF instanceof C9719GeX) {
                try {
                    HsR hsR3 = iapPurchaseController.A00;
                    if (hsR3 != null) {
                        HjL hjL3 = (HjL) hsR3;
                        hjL3.A04.flowEndFail(hjL3.A01, r9.name(), null);
                    }
                    iapPurchaseController.A01.A0L(((C9719GeX) interfaceC9761GfF).A00, c9698Ge3, c9661Gd3, r9);
                } catch (Throwable th3) {
                    iapPurchaseController.A01.A0L(((C9719GeX) interfaceC9761GfF).A00, c9698Ge3, c9661Gd3, r9);
                    throw th3;
                }
            } else {
                if (!(interfaceC9761GfF instanceof C9722Gea)) {
                    throw C3cG.A0q();
                }
                if (c9698Ge3 != null) {
                    try {
                        HsR hsR4 = iapPurchaseController.A00;
                        if (hsR4 != null) {
                            HjL hjL4 = (HjL) hsR4;
                            hjL4.A04.flowEndSuccess(hjL4.A01);
                        }
                        iapPurchaseController.A01.A0T(c9698Ge3, c9661Gd3, r9);
                    } catch (Throwable th4) {
                        iapPurchaseController.A01.A0T(c9698Ge3, c9661Gd3, r9);
                        throw th4;
                    }
                }
            }
            if (z) {
                try {
                    C9716GeU c9716GeU = iapPurchaseController.A0A;
                    if (z6) {
                        c9716GeU.A00.A0Q(c9698Ge3, jElapsedRealtime, z7);
                    }
                    if (interfaceC9761GfF instanceof C9722Gea) {
                        hx5.onPurchaseSuccessful((Hs0) ((C9722Gea) interfaceC9761GfF).A00);
                        return;
                    }
                    if (interfaceC9761GfF instanceof C9719GeX) {
                        hx5.onPurchaseFailed(r9, ((C9719GeX) interfaceC9761GfF).A00);
                    } else {
                        if (!interfaceC9761GfF.equals(c9758GfC) && !interfaceC9761GfF.equals(C9760GfE.A00) && !interfaceC9761GfF.equals(C9696Ge1.A00)) {
                            throw C3cG.A0q();
                        }
                        hx5.onPurchaseFinished(r9);
                    }
                } finally {
                    th = th;
                    if (!z4) {
                        if (!z5) {
                            if (!zEquals4) {
                                if (!zEquals5) {
                                    if (!zEquals6) {
                                    }
                                }
                            }
                            hx5.onPurchaseFinished(enumC9704GeI);
                            throw th;
                        }
                        hx5.onPurchaseFailed(enumC9704GeI, ((C9719GeX) interfaceC9761GfF).A00);
                        throw th;
                    }
                    hx5.onPurchaseSuccessful((Hs0) ((C9722Gea) interfaceC9761GfF).A00);
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            if (!z) {
                throw th;
            }
            try {
                C9716GeU c9716GeU2 = iapPurchaseController.A0A;
                if (z6) {
                    c9716GeU2.A00.A0Q(c9698Ge3, jElapsedRealtime, z7);
                }
            } finally {
                th = th;
                if (!(interfaceC9761GfF instanceof C9722Gea)) {
                    EnumC9704GeI enumC9704GeI2 = r9;
                    if (!(interfaceC9761GfF instanceof C9719GeX)) {
                        EnumC9704GeI enumC9704GeI3 = r9;
                        if (!interfaceC9761GfF.equals(C9758GfC.A00)) {
                            enumC9704GeI3 = r9;
                            if (!interfaceC9761GfF.equals(C9760GfE.A00)) {
                                enumC9704GeI3 = r9;
                                if (!interfaceC9761GfF.equals(C9696Ge1.A00)) {
                                    NoWhenBranchMatchedException noWhenBranchMatchedExceptionA0q2 = C3cG.A0q();
                                }
                            }
                        }
                        hx5.onPurchaseFinished(enumC9704GeI3);
                        throw th;
                    }
                    hx5.onPurchaseFailed(enumC9704GeI2, ((C9719GeX) interfaceC9761GfF).A00);
                    throw th;
                }
                hx5.onPurchaseSuccessful((Hs0) ((C9722Gea) interfaceC9761GfF).A00);
                throw th;
            }
            if (!z2) {
                if (!z3) {
                    if (!zEquals) {
                        if (!zEquals2) {
                            if (!zEquals3) {
                                throw C3cG.A0q();
                            }
                        }
                    }
                    hx5.onPurchaseFinished(enumC9704GeI3);
                    throw th;
                }
                hx5.onPurchaseFailed(enumC9704GeI2, ((C9719GeX) interfaceC9761GfF).A00);
                throw th;
            }
            hx5.onPurchaseSuccessful((Hs0) ((C9722Gea) interfaceC9761GfF).A00);
            throw th;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/Hla;>;LX/Gd7;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC9665Gd7 r8, java.util.List r9, X.HtJ r10) {
        /*
            r7 = this;
            r3 = 10
            boolean r0 = r10 instanceof X.C8911FtT
            if (r0 == 0) goto L2a
            r6 = r10
            X.FtT r6 = (X.C8911FtT) r6
            int r0 = r6.$t
            if (r0 != r3) goto L2a
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r6.A00 = r2
        L18:
            java.lang.Object r1 = r6.A04
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto La4
            java.lang.Object r3 = r6.A03
            X.GeV r3 = (X.C9717GeV) r3
            java.lang.Object r8 = r6.A02
            goto L4e
        L2a:
            X.FtT r6 = new X.FtT
            r6.<init>(r7, r10, r3)
            goto L18
        L30:
            X.Hwg.A00(r1)
            boolean r0 = r8 instanceof X.C9714GeS
            r3 = 0
            if (r0 == 0) goto L3f
            r0 = r8
            X.GeS r0 = (X.C9714GeS) r0
            if (r0 == 0) goto L3f
            X.GeV r3 = r0.A00
        L3f:
            com.facebook.payments.dcp.xapp.controller.purchase.IapVerifyPurchaseController r2 = r7.A0E     // Catch: java.util.concurrent.CancellationException -> L8e
            X.Gei r1 = r7.A02     // Catch: java.util.concurrent.CancellationException -> L8e
            r0 = 0
            X.C8911FtT.A00(r0, r8, r3, r6, r4)     // Catch: java.util.concurrent.CancellationException -> L8e
            java.lang.Object r1 = r2.A01(r1, r8, r9, r6)     // Catch: java.util.concurrent.CancellationException -> L8e
            if (r1 != r5) goto L51
            return r5
        L4e:
            X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L8e
        L51:
            X.GfG r1 = (X.InterfaceC9762GfG) r1     // Catch: java.util.concurrent.CancellationException -> L8e
            boolean r0 = r1 instanceof X.C9722Gea     // Catch: java.util.concurrent.CancellationException -> L8e
            if (r0 == 0) goto L7b
            X.Gea r1 = (X.C9722Gea) r1     // Catch: java.util.concurrent.CancellationException -> L8e
            SuccessT r6 = r1.A00     // Catch: java.util.concurrent.CancellationException -> L8e
            X.Hke r6 = (X.Hke) r6     // Catch: java.util.concurrent.CancellationException -> L8e
            X.78U r0 = r7.A09     // Catch: java.util.concurrent.CancellationException -> L8e
            r9 = 0
            r10 = 8
            X.FtE r5 = new X.FtE     // Catch: java.util.concurrent.CancellationException -> L8e
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L8e
            r0.A02(r5)     // Catch: java.util.concurrent.CancellationException -> L8e
            if (r3 == 0) goto L86
            java.util.List<X.Hs0> r0 = r6.A02     // Catch: java.util.concurrent.CancellationException -> L8e
            java.lang.Object r1 = X.AbstractC0878AGe.A0F(r0)     // Catch: java.util.concurrent.CancellationException -> L8e
            X.Gea r0 = new X.Gea     // Catch: java.util.concurrent.CancellationException -> L8e
            r0.<init>(r1)     // Catch: java.util.concurrent.CancellationException -> L8e
            r7.A02(r3, r0)     // Catch: java.util.concurrent.CancellationException -> L8e
            goto L86
        L7b:
            boolean r0 = r1 instanceof X.C9719GeX     // Catch: java.util.concurrent.CancellationException -> L8e
            if (r0 == 0) goto L89
            if (r3 == 0) goto L86
            X.GfF r1 = (X.InterfaceC9761GfF) r1     // Catch: java.util.concurrent.CancellationException -> L8e
            r7.A02(r3, r1)     // Catch: java.util.concurrent.CancellationException -> L8e
        L86:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L89:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()     // Catch: java.util.concurrent.CancellationException -> L8e
            throw r0     // Catch: java.util.concurrent.CancellationException -> L8e
        L8e:
            r4 = move-exception
            if (r3 == 0) goto La8
            X.HiU r2 = X.HiU.A00
            X.Gei r1 = r7.A02
            java.lang.String r0 = "VERIFY_DCPPAYMENT"
            X.Hzd r1 = r2.A04(r1, r0, r4)
            X.GeX r0 = new X.GeX
            r0.<init>(r1)
            r7.A02(r3, r0)
            throw r4
        La4:
            java.lang.IllegalStateException r4 = X.AnonymousClass001.A0n()
        La8:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.purchase.IapPurchaseController.A01(X.Gd7, java.util.List, X.HtJ):java.lang.Object");
    }

    public final void A02(C9717GeV c9717GeV, InterfaceC9761GfF<Hs0> interfaceC9761GfF) {
        AnonymousClass003.A0u(c9717GeV, interfaceC9761GfF);
        A00(c9717GeV, this, C9702GeG.A00.A00(interfaceC9761GfF), interfaceC9761GfF);
    }
}
