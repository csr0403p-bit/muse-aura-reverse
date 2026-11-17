package X;

import android.view.KeyEvent;
import android.view.View;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.BUj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2335BUj extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2335BUj(int i, Object obj, Object obj2) {
        super(0);
        this.$t = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, X.AHv] */
    /* JADX WARN: Type inference failed for: r0v92, types: [T] */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.Aj8] */
    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        LazyGridState lazyGridState;
        C3UX c3ux;
        int i;
        boolean zDispatchKeyEvent;
        C10543Hqv c10543Hqv;
        C1453AjM c1453AjM;
        View view;
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        Object objInvoke;
        ?? A02;
        switch (this.$t) {
            case 0:
                lazyGridState = (LazyGridState) this.A01;
                if (MutableState.A0A(lazyGridState.A0H)) {
                    c3ux = (C3UX) this.A00;
                    i = 46;
                    BU2.A0P(lazyGridState, c3ux, i);
                    zDispatchKeyEvent = true;
                    return Boolean.valueOf(zDispatchKeyEvent);
                }
                zDispatchKeyEvent = false;
                return Boolean.valueOf(zDispatchKeyEvent);
            case 1:
                lazyGridState = (LazyGridState) this.A01;
                if (MutableState.A0A(lazyGridState.A0G)) {
                    c3ux = (C3UX) this.A00;
                    i = 47;
                    BU2.A0P(lazyGridState, c3ux, i);
                    zDispatchKeyEvent = true;
                    return Boolean.valueOf(zDispatchKeyEvent);
                }
                zDispatchKeyEvent = false;
                return Boolean.valueOf(zDispatchKeyEvent);
            case 2:
                ((ASN) this.A01).A01.invoke(this.A00);
                return Unit.INSTANCE;
            case 3:
                c10543Hqv = (C10543Hqv) this.A00;
                A02 = ((C1506AkD) this.A01).A02();
                c10543Hqv.element = A02;
                return Unit.INSTANCE;
            case 4:
                C1342AhT.A00((AbstractC1439Aj8) this.A00, (C1342AhT) this.A01);
                return Unit.INSTANCE;
            case 5:
                C1438Aj7 c1438Aj7 = ((C1453AjM) this.A01).A0f;
                C10543Hqv c10543Hqv2 = (C10543Hqv) this.A00;
                if ((c1438Aj7.A02.aggregateChildKindSet & 8) != 0) {
                    for (AbstractC1439Aj8 abstractC1439Aj8 = c1438Aj7.A06; abstractC1439Aj8 != null; abstractC1439Aj8 = abstractC1439Aj8.parent) {
                        if ((abstractC1439Aj8.kindSet & 8) != 0) {
                            C0910AHm c0910AHmA0K = null;
                            AbstractC1437Aj6 abstractC1437Aj6A0X = abstractC1439Aj8;
                            do {
                                if (abstractC1437Aj6A0X instanceof InterfaceC1476Ajj) {
                                    InterfaceC1476Ajj interfaceC1476Ajj = (InterfaceC1476Ajj) abstractC1437Aj6A0X;
                                    if (interfaceC1476Ajj.AKZ()) {
                                        ?? c0919AHv = new C0919AHv();
                                        c10543Hqv2.element = c0919AHv;
                                        c0919AHv.A00 = true;
                                    }
                                    if (interfaceC1476Ajj.AKa()) {
                                        ((C0919AHv) c10543Hqv2.element).A01 = true;
                                    }
                                    interfaceC1476Ajj.A4Y((InterfaceC0857A6e) c10543Hqv2.element);
                                } else if ((abstractC1437Aj6A0X.kindSet & 8) != 0 && (abstractC1437Aj6A0X instanceof AbstractC1437Aj6)) {
                                    AbstractC1439Aj8 abstractC1439Aj82 = abstractC1437Aj6A0X.A00;
                                    int i2 = 0;
                                    abstractC1437Aj6A0X = abstractC1437Aj6A0X;
                                    while (abstractC1439Aj82 != null) {
                                        if ((abstractC1439Aj82.kindSet & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                abstractC1437Aj6A0X = abstractC1439Aj82;
                                            } else {
                                                c0910AHmA0K = C8j5.A0K(c0910AHmA0K);
                                                abstractC1437Aj6A0X = C8j4.A0X(c0910AHmA0K, abstractC1437Aj6A0X);
                                                c0910AHmA0K.A0G(abstractC1439Aj82);
                                            }
                                        }
                                        abstractC1439Aj82 = abstractC1439Aj82.child;
                                        abstractC1437Aj6A0X = abstractC1437Aj6A0X;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                abstractC1437Aj6A0X = AbstractC1414Aij.A00(c0910AHmA0K);
                            } while (abstractC1437Aj6A0X != 0);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 6:
                G0U g0u = (G0U) this.A00;
                C1390AiL c1390AiL = AbstractC1387AiH.A0R;
                g0u.invoke(c1390AiL);
                AbstractC1387AiH abstractC1387AiH = (AbstractC1387AiH) this.A01;
                boolean zAreEqual = C7384Etj.areEqual(abstractC1387AiH.A04, c1390AiL.A0I);
                boolean z = abstractC1387AiH.A0H;
                boolean z2 = c1390AiL.A0L;
                boolean zA1P = AnonymousClass002.A1P(z ? 1 : 0, z2 ? 1 : 0);
                if (!zAreEqual || zA1P) {
                    abstractC1387AiH.A04 = c1390AiL.A0I;
                    abstractC1387AiH.A0H = z2;
                    if (abstractC1387AiH.A0K && (zA1P || (z2 && !zAreEqual))) {
                        abstractC1387AiH.A0P.A0L();
                    }
                }
                abstractC1387AiH.A0K = true;
                c1390AiL.A0G = c1390AiL.A0I.mo2createOutlinePq9zytI(c1390AiL.A0D, c1390AiL.A0K, c1390AiL.A0J);
                return Unit.INSTANCE;
            case 7:
                zDispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.A00);
                return Boolean.valueOf(zDispatchKeyEvent);
            case 8:
                Ao6 ao6 = (Ao6) this.A00;
                Ao7 ao7 = ao6.A00;
                Ao7 ao72 = ao6.A01;
                Float f = ao6.A02;
                Float f2 = ao6.A03;
                float fA04 = (ao7 == null || f == null) ? 0.0f : AnonymousClass003.A04(ao7.A01) - f.floatValue();
                float fA042 = (ao72 == null || f2 == null) ? 0.0f : AnonymousClass003.A04(ao72.A01) - f2.floatValue();
                if (fA04 != 0.0f || fA042 != 0.0f) {
                    AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) this.A01;
                    int iA00 = AndroidComposeViewAccessibilityDelegateCompat.A00(androidComposeViewAccessibilityDelegateCompat, ao6.A04);
                    C1629An1 c1629An1 = (C1629An1) AndroidComposeViewAccessibilityDelegateCompat.A08(androidComposeViewAccessibilityDelegateCompat).A04(androidComposeViewAccessibilityDelegateCompat.A01);
                    if (c1629An1 != null) {
                        try {
                            C2197BAc c2197BAc = androidComposeViewAccessibilityDelegateCompat.A0D;
                            if (c2197BAc != null) {
                                c2197BAc.A02.setBoundsInScreen(AndroidComposeViewAccessibilityDelegateCompat.A05(androidComposeViewAccessibilityDelegateCompat, c1629An1));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    C1629An1 c1629An12 = (C1629An1) AndroidComposeViewAccessibilityDelegateCompat.A08(androidComposeViewAccessibilityDelegateCompat).A04(androidComposeViewAccessibilityDelegateCompat.A02);
                    if (c1629An12 != null) {
                        try {
                            C2197BAc c2197BAc2 = androidComposeViewAccessibilityDelegateCompat.A0E;
                            if (c2197BAc2 != null) {
                                c2197BAc2.A02.setBoundsInScreen(AndroidComposeViewAccessibilityDelegateCompat.A05(androidComposeViewAccessibilityDelegateCompat, c1629An12));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    androidComposeViewAccessibilityDelegateCompat.A0S.invalidate();
                    C1629An1 c1629An13 = (C1629An1) AndroidComposeViewAccessibilityDelegateCompat.A08(androidComposeViewAccessibilityDelegateCompat).A04(iA00);
                    if (c1629An13 != null && (c1453AjM = c1629An13.A00.A03) != null) {
                        if (ao7 != null) {
                            androidComposeViewAccessibilityDelegateCompat.A0Q.A0B(iA00, ao7);
                        }
                        if (ao72 != null) {
                            androidComposeViewAccessibilityDelegateCompat.A0R.A0B(iA00, ao72);
                        }
                        AndroidComposeViewAccessibilityDelegateCompat.A0F(c1453AjM, androidComposeViewAccessibilityDelegateCompat);
                    }
                }
                if (ao7 != null) {
                    ao6.A02 = ao7.A01.invoke();
                }
                if (ao72 != null) {
                    ao6.A03 = ao72.A01.invoke();
                }
                return Unit.INSTANCE;
            case 9:
                view = (View) this.A01;
                onAttachStateChangeListener = (BSC) this.A00;
                view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                return Unit.INSTANCE;
            case 10:
                view = (View) this.A01;
                onAttachStateChangeListener = (BSD) this.A00;
                view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                return Unit.INSTANCE;
            case 11:
                ((F2N) this.A00).A05((C2Kw) this.A01);
                return Unit.INSTANCE;
            case 12:
                Function0 function0 = (Function0) this.A00;
                if (function0 != null && (objInvoke = function0.invoke()) != null) {
                    return objInvoke;
                }
                InterfaceC1497Ak4 interfaceC1497Ak4 = (InterfaceC1497Ak4) this.A01;
                if (interfaceC1497Ak4.isAttached()) {
                    return C2J7.A00(0L, AQY.A01(interfaceC1497Ak4.AKd()));
                }
                return null;
            default:
                c10543Hqv = (C10543Hqv) this.A00;
                A02 = ARZ.A01(AbstractC1212Aep.A00, (Aeo) this.A01);
                c10543Hqv.element = A02;
                return Unit.INSTANCE;
        }
    }
}
