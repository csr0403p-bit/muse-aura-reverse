package androidx.compose.foundation.gestures;

import X.AWx;
import X.AbstractC1414Aij;
import X.AbstractC1439Aj8;
import X.AcJ;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.BLD;
import X.BUC;
import X.C1251Afj;
import X.C1257Aft;
import X.C1259Afy;
import X.C2295BSv;
import X.C3Q0;
import X.C3UY;
import X.C3cG;
import X.C8j3;
import X.C8j5;
import X.EnumC10460Hji;
import X.EnumC1108AYu;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.InterfaceC1180Adj;
import X.InterfaceC1260Afz;
import X.InterfaceC1261Ag0;
import X.InterfaceC1284AgU;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ScrollingLogic implements InterfaceC1284AgU {
    public InterfaceC1260Afz A01;
    public BLD A02;
    public EnumC1108AYu A03;
    public InterfaceC1180Adj A05;
    public NestedScrollDispatcher A06;
    public boolean A07;
    public boolean A08;
    public InterfaceC1261Ag0 A09;
    public final Function0<Boolean> A0B;
    public int A00 = 1;
    public C3Q0 A04 = ScrollableKt.A00;
    public final C1259Afy A0A = new C1259Afy(this);
    public final G0U<AWx, AWx> A0C = C2295BSv.A00(this, 14);

    public final long A04(float f) {
        long jA0P;
        int iFloatToRawIntBits;
        if (f == 0.0f) {
            return 0L;
        }
        if (this.A03 == EnumC1108AYu.A02) {
            jA0P = C8j3.A0P(f);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        } else {
            jA0P = C8j3.A0P(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f);
        }
        return (jA0P << 32) | (4294967295L & iFloatToRawIntBits);
    }

    public static float A00(ScrollingLogic scrollingLogic, float f, float f2) {
        return scrollingLogic.A08 ? f * (-1.0f) : f2;
    }

    public static final long A01(C3Q0 c3q0, ScrollingLogic scrollingLogic, int i, long j) {
        NestedScrollNode nestedScrollNodeA01;
        NestedScrollNode nestedScrollNodeA012;
        NestedScrollNode nestedScrollNode = scrollingLogic.A06.A01;
        long jMo6onPreScrollOzD1aCk = (nestedScrollNode == null || (nestedScrollNodeA012 = nestedScrollNode.A01()) == null) ? 0L : nestedScrollNodeA012.mo6onPreScrollOzD1aCk(j, i);
        long jA04 = AWx.A04(j, jMo6onPreScrollOzD1aCk);
        long jA05 = scrollingLogic.A05(scrollingLogic.A04(c3q0.AcG(scrollingLogic.A02(scrollingLogic.A05(AWx.A01(0.0f, 0.0f, scrollingLogic.A03 == EnumC1108AYu.A02 ? 1 : 2, jA04))))));
        AbstractC1439Aj8 abstractC1439Aj8 = (AbstractC1439Aj8) scrollingLogic.A09;
        if (abstractC1439Aj8.isAttached) {
            ViewTreeObserver viewTreeObserver = ((View) AbstractC1414Aij.A07(abstractC1439Aj8)).getViewTreeObserver();
            try {
                Method declaredMethod = AndroidComposeView.A1V;
                if (declaredMethod == null) {
                    declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.A1V = declaredMethod;
                }
                declaredMethod.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long jA042 = AWx.A04(jA04, jA05);
        NestedScrollNode nestedScrollNode2 = scrollingLogic.A06.A01;
        return AWx.A05(AWx.A05(jMo6onPreScrollOzD1aCk, jA05), (nestedScrollNode2 == null || (nestedScrollNodeA01 = nestedScrollNode2.A01()) == null) ? 0L : nestedScrollNodeA01.mo4onPostScrollDzOQY0M(jA05, jA042, i));
    }

    public final float A02(long j) {
        return C8j3.A05(C8j5.A0E(j, this.A03, EnumC1108AYu.A02));
    }

    public final long A05(long j) {
        return this.A08 ? AWx.A02(j, -1.0f) : j;
    }

    public final Object A06(long j, boolean z, HtJ<? super Unit> htJ) {
        if (!z || (!(this.A02 instanceof AcJ))) {
            char c = this.A03 == EnumC1108AYu.A02 ? (char) 1 : (char) 2;
            long jA0A = AnonymousClass007.A0A((c & 1) != 0 ? AnonymousClass003.A03(j) : 0.0f, (c & 2) != 0 ? C8j5.A03(j) : 0.0f);
            ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
            InterfaceC1260Afz interfaceC1260Afz = this.A01;
            Object objInvoke = (interfaceC1260Afz == null || !(this.A05.ADO() || this.A05.ADN())) ? scrollingLogic$onScrollStopped$performFling$1.invoke(new C1251Afj(jA0A), htJ) : interfaceC1260Afz.A4e(htJ, scrollingLogic$onScrollStopped$performFling$1, jA0A);
            if (objInvoke == EnumC10460Hji.A02) {
                return objInvoke;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3UY;LX/G0V<-LX/Afu;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public final Object A07(C3UY c3uy, HtJ htJ, G0V g0v) {
        return C3cG.A0U(this.A05.AcF(c3uy, htJ, new BUC(this, (G0V<? super G0U<? super C1257Aft, Unit>, ? super HtJ<? super Unit>, ? extends Object>) null, (ScrollingLogic) g0v, (HtJ<? super BUC>) 10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    @Override // X.InterfaceC1284AgU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A99(long r12, X.HtJ<? super X.C1251Afj> r14) {
        /*
            r11 = this;
            r3 = 9
            boolean r0 = r14 instanceof X.C2312BTm
            r7 = r11
            if (r0 == 0) goto L2a
            r5 = r14
            X.BTm r5 = (X.C2312BTm) r5
            int r0 = r5.$t
            if (r0 != r3) goto L2a
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r5.A00 = r2
        L19:
            java.lang.Object r4 = r5.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 != r1) goto L34
            java.lang.Object r9 = r5.A01
            X.BO7 r9 = (X.BO7) r9
            goto L30
        L2a:
            X.BTm r5 = new X.BTm
            r5.<init>(r11, r14, r3)
            goto L19
        L30:
            X.Hwg.A00(r4)     // Catch: java.lang.Throwable -> L60
            goto L56
        L34:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L39:
            X.Hwg.A00(r4)
            r10 = r12
            X.BO7 r9 = X.BO7.A00(r12)
            r7.A07 = r1
            X.3UY r0 = X.C3UY.A02     // Catch: java.lang.Throwable -> L60
            r8 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r6 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2     // Catch: java.lang.Throwable -> L60
            r6.<init>(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L60
            r5.A01 = r9     // Catch: java.lang.Throwable -> L60
            r5.A00 = r1     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r7.A07(r0, r5, r6)     // Catch: java.lang.Throwable -> L60
            if (r0 != r3) goto L56
            return r3
        L56:
            r7.A07 = r2
            long r1 = r9.element
            X.Afj r0 = new X.Afj
            r0.<init>(r1)
            return r0
        L60:
            r0 = move-exception
            r7.A07 = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.A99(long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Adj;LX/Afz;LX/BLD;LX/AYu;ZLandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;LX/Ag0;Lkotlin/jvm/functions/Function0<Ljava/lang/Boolean;>;)V */
    public ScrollingLogic(InterfaceC1260Afz interfaceC1260Afz, BLD bld, InterfaceC1261Ag0 interfaceC1261Ag0, EnumC1108AYu enumC1108AYu, InterfaceC1180Adj interfaceC1180Adj, NestedScrollDispatcher nestedScrollDispatcher, Function0 function0, boolean z) {
        this.A05 = interfaceC1180Adj;
        this.A01 = interfaceC1260Afz;
        this.A02 = bld;
        this.A03 = enumC1108AYu;
        this.A08 = z;
        this.A06 = nestedScrollDispatcher;
        this.A09 = interfaceC1261Ag0;
        this.A0B = function0;
    }

    public final float A03(long j) {
        float fA03 = C8j5.A03(j);
        float fAbs = Math.abs(fA03);
        float fA032 = AnonymousClass003.A03(j);
        double dAtan2 = (float) Math.atan2(fAbs, Math.abs(fA032));
        EnumC1108AYu enumC1108AYu = this.A03;
        if (dAtan2 >= 0.7853981633974483d) {
            if (enumC1108AYu == EnumC1108AYu.A03) {
                return fA03;
            }
        } else if (enumC1108AYu == EnumC1108AYu.A02) {
            return fA032;
        }
        return 0.0f;
    }
}
