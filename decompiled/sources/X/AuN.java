package X;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.text.input.ImeAction;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Unit;

@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
/* loaded from: classes4.dex */
public final class AuN implements InterfaceC1925Atm {
    public AuI A00;
    public C1805ArO A01;
    public Runnable A02;
    public List<WeakReference<AuM>> A03;
    public G0U<? super List<? extends AzK>, Unit> A04;
    public G0U<? super ImeAction, Unit> A05;
    public boolean A06;
    public Rect A07;
    public final View A08;
    public final C0910AHm<AvJ> A09;
    public final C1938AuS A0A;
    public final InterfaceC2137Az5 A0B;
    public final Executor A0C;
    public final F0C A0D;

    /* JADX WARN: Incorrect types in method signature: (LX/ArO;LX/AuI;LX/G0U<-Ljava/util/List<+LX/AzK;>;Lkotlin/Unit;>;LX/G0U<-Landroidx/compose/ui/text/input/ImeAction;Lkotlin/Unit;>;)V */
    @Override // X.InterfaceC1925Atm
    public final void Ag5(AuI auI, C1805ArO c1805ArO, G0U g0u, G0U g0u2) {
        this.A06 = true;
        this.A01 = c1805ArO;
        this.A00 = auI;
        this.A04 = g0u;
        this.A05 = g0u2;
        A00(AvJ.A04);
    }

    @Override // X.InterfaceC1925Atm
    public final void AgT() {
        this.A06 = false;
        this.A04 = new BUU(9);
        this.A05 = new BUU(10);
        this.A07 = null;
        A00(AvJ.A05);
    }

    public AuN(View view, InterfaceC1406Aib interfaceC1406Aib) {
        AvN avN = new AvN(view);
        ExecutorC10644I0o executorC10644I0o = new ExecutorC10644I0o(Choreographer.getInstance(), 0);
        this.A08 = view;
        this.A0B = avN;
        this.A0C = executorC10644I0o;
        this.A04 = new BUU(7);
        this.A05 = new BUU(8);
        this.A01 = new C1805ArO("", Au3.A01);
        this.A00 = AuI.A06;
        this.A03 = C3cG.A0h();
        this.A0D = AbstractC5321DgF.A02(C79.A0C, C2328BUc.A00(this, 35));
        this.A0A = new C1938AuS(interfaceC1406Aib, avN);
        this.A09 = C0910AHm.A02(new AvJ[16], 0);
    }

    private final void A00(AvJ avJ) {
        this.A09.A0G(avJ);
        if (this.A02 == null) {
            Runnable runnable = new Runnable() { // from class: X.AuV
                public static final String __redex_internal_original_name = "TextInputServiceAndroid$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindFocus;
                    AuN auN = this.A00;
                    auN.A02 = null;
                    View view = auN.A08;
                    if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                        auN.A09.A09();
                        return;
                    }
                    Boolean bool = null;
                    Boolean boolValueOf = null;
                    C0910AHm<AvJ> c0910AHm = auN.A09;
                    AvJ[] avJArr = c0910AHm.A01;
                    int i = c0910AHm.A00;
                    for (int i2 = 0; i2 < i; i2++) {
                        AvJ avJ2 = avJArr[i2];
                        int iOrdinal = avJ2.ordinal();
                        if (iOrdinal == 0) {
                            bool = true;
                            boolValueOf = true;
                        } else if (iOrdinal == 1) {
                            boolValueOf = false;
                            bool = boolValueOf;
                        } else {
                            if (iOrdinal != 2 && iOrdinal != 3) {
                                throw C3cG.A0q();
                            }
                            if (!AnonymousClass002.A1b(bool, false)) {
                                boolValueOf = Boolean.valueOf(avJ2 == AvJ.A03);
                            }
                        }
                    }
                    c0910AHm.A09();
                    if (AnonymousClass002.A1b(bool, true)) {
                        AuN.A01(auN);
                    }
                    if (boolValueOf != null) {
                        boolean zBooleanValue = boolValueOf.booleanValue();
                        Az8 az8 = ((AvN) auN.A0B).A01.A00;
                        if (zBooleanValue) {
                            az8.A02();
                        } else {
                            az8.A01();
                        }
                    }
                    if (AnonymousClass002.A1b(bool, false)) {
                        AuN.A01(auN);
                    }
                }
            };
            this.A0C.execute(runnable);
            this.A02 = runnable;
        }
    }

    public static final void A01(AuN auN) {
        AvN avN = (AvN) auN.A0B;
        ((InputMethodManager) avN.A02.getValue()).restartInput(avN.A00);
    }

    @Override // X.InterfaceC1925Atm
    public final void ANO() {
        A00(AvJ.A02);
    }

    @Override // X.InterfaceC1925Atm
    public final void Aff() {
        A00(AvJ.A03);
    }

    @Override // X.InterfaceC1925Atm
    public final void Ag4() {
        A00(AvJ.A04);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    @Override // X.InterfaceC1925Atm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ai7(X.C1805ArO r13, X.C1805ArO r14) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AuN.Ai7(X.ArO, X.ArO):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/ArO;LX/Ayu;LX/Aux;LX/G0U<-LX/AiN;Lkotlin/Unit;>;LX/AaC;LX/AaC;)V */
    @Override // X.InterfaceC1925Atm
    public final void AiA(AaC aaC, AaC aaC2, C1958Aux c1958Aux, InterfaceC2128Ayu interfaceC2128Ayu, C1805ArO c1805ArO, G0U g0u) {
        C1938AuS c1938AuS = this.A0A;
        synchronized (c1938AuS.A0C) {
            c1938AuS.A04 = c1805ArO;
            c1938AuS.A03 = interfaceC2128Ayu;
            c1938AuS.A02 = c1958Aux;
            c1938AuS.A05 = g0u;
            c1938AuS.A01 = aaC;
            c1938AuS.A00 = aaC2;
            if (c1938AuS.A06 || c1938AuS.A0B) {
                C1938AuS.A00(c1938AuS);
            }
        }
    }

    @Override // X.InterfaceC1925Atm
    @Deprecated(message = "This method should not be called, used BringIntoViewRequester instead.")
    public final void ARO(AaC aaC) {
        Rect rect;
        this.A07 = Ab3.A04(aaC);
        if (!this.A03.isEmpty() || (rect = this.A07) == null) {
            return;
        }
        this.A08.requestRectangleOnScreen(new Rect(rect));
    }
}
