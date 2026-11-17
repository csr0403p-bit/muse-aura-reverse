package X;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Atk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1923Atk implements InterfaceC2036Awq, InterfaceC2061AxY {
    public final /* synthetic */ AbstractC1769AqM A00;
    public final /* synthetic */ InterfaceC2147AzZ A01;
    public final /* synthetic */ AuQ A02;
    public final /* synthetic */ C1910AtV A03;
    public final /* synthetic */ C1881Asv A04;
    public final /* synthetic */ TransformedTextFieldState A05;
    public final /* synthetic */ InterfaceC1079AXi A06;
    public final /* synthetic */ Function0<Unit> A07;
    public final /* synthetic */ G0U<ImeAction, Unit> A08;
    public final /* synthetic */ G0U<Boolean, Unit> A09;
    public final /* synthetic */ C1910AtV A0A;

    /* JADX WARN: Incorrect types in method signature: (LX/AtV;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;LX/AzZ;LX/G0U<-Landroidx/compose/ui/text/input/ImeAction;Lkotlin/Unit;>;LX/AqM;LX/AuQ;LX/Asv;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/AXi;LX/G0U<-Ljava/lang/Boolean;Lkotlin/Unit;>;)V */
    public C1923Atk(AbstractC1769AqM abstractC1769AqM, InterfaceC2147AzZ interfaceC2147AzZ, AuQ auQ, C1910AtV c1910AtV, C1881Asv c1881Asv, TransformedTextFieldState transformedTextFieldState, InterfaceC1079AXi interfaceC1079AXi, Function0 function0, G0U g0u, G0U g0u2) {
        this.A03 = c1910AtV;
        this.A05 = transformedTextFieldState;
        this.A01 = interfaceC2147AzZ;
        this.A08 = g0u;
        this.A00 = abstractC1769AqM;
        this.A02 = auQ;
        this.A04 = c1881Asv;
        this.A07 = function0;
        this.A06 = interfaceC1079AXi;
        this.A09 = g0u2;
        this.A0A = c1910AtV;
    }

    @Override // X.InterfaceC2036Awq
    public final void A9r(G0U<? super C1891AtA, Unit> g0u) {
        this.A0A.A9r(g0u);
    }

    @Override // X.InterfaceC2036Awq
    public final int ALz() {
        return this.A03.ALz();
    }

    @Override // X.InterfaceC2036Awq
    public final long AQ5(long j) {
        return this.A0A.AQ5(j);
    }

    @Override // X.InterfaceC2036Awq
    public final long AQ6(long j) {
        return this.A0A.AQ6(j);
    }

    @Override // X.InterfaceC2061AxY
    public final int AXq(HandwritingGesture handwritingGesture) {
        if (Build.VERSION.SDK_INT < 34) {
            return 2;
        }
        AtM atM = AtM.A00;
        TransformedTextFieldState transformedTextFieldState = this.A05;
        return atM.A0I(handwritingGesture, this.A04, transformedTextFieldState, this.A06, this.A07);
    }

    @Override // X.InterfaceC2036Awq
    public final boolean beginBatchEdit() {
        this.A0A.A00++;
        return true;
    }

    @Override // X.InterfaceC2036Awq
    public final boolean endBatchEdit() {
        return this.A0A.endBatchEdit();
    }

    @Override // X.InterfaceC2061AxY
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return AtM.A00.A0K(cancellationSignal, previewableHandwritingGesture, this.A04, this.A05);
    }
}
