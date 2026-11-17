package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AWe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1073AWe {
    public static final long A0I = 2147483647L | (2147483647L << 32);
    public long A00;
    public long A01;
    public long A02;
    public AOe<Float> A03;
    public AOe<Float> A04;
    public AOe<C2ae> A05;
    public GraphicsLayer A06;
    public boolean A07;
    public final AT5<C2ae, ARY> A08;
    public final AT5<Float, AOW> A09;
    public final MutableState A0A;
    public final MutableState A0B;
    public final MutableState A0C;
    public final MutableState A0D;
    public final MutableState A0E;
    public final Function0<Unit> A0F;
    public final C3UX A0G;
    public final ASQ A0H;

    public final void A00() {
        C3UX c3ux;
        G0V g0vA0O;
        GraphicsLayer graphicsLayer = this.A06;
        AOe<Float> aOe = this.A03;
        MutableState mutableState = this.A0A;
        if (!MutableState.A0A(mutableState) && aOe != null && graphicsLayer != null) {
            MutableState.A09(true, mutableState);
            boolean zA0A = MutableState.A0A(this.A0C);
            boolean z = !zA0A;
            if (!zA0A) {
                graphicsLayer.A09(0.0f);
            }
            c3ux = this.A0G;
            g0vA0O = new BUE(aOe, this, graphicsLayer, null, z);
        } else {
            if (!MutableState.A0A(this.A0C)) {
                return;
            }
            if (graphicsLayer != null) {
                graphicsLayer.A09(1.0f);
            }
            c3ux = this.A0G;
            g0vA0O = BU2.A0O(this, null, 24);
        }
        AnonymousClass001.A1J(g0vA0O, c3ux);
    }

    public final void A01() {
        ASQ asq;
        MutableState mutableState = this.A0D;
        if (MutableState.A0A(mutableState)) {
            MutableState.A09(false, mutableState);
            BU2.A0P(this, this.A0G, 26);
        }
        MutableState mutableState2 = this.A0A;
        if (MutableState.A0A(mutableState2)) {
            MutableState.A09(false, mutableState2);
            BU2.A0P(this, this.A0G, 27);
        }
        MutableState mutableState3 = this.A0C;
        if (MutableState.A0A(mutableState3)) {
            MutableState.A09(false, mutableState3);
            BU2.A0P(this, this.A0G, 28);
        }
        this.A07 = false;
        this.A0E.Af8(C8j3.A0l(0L));
        this.A02 = A0I;
        GraphicsLayer graphicsLayer = this.A06;
        if (graphicsLayer != null && (asq = this.A0H) != null) {
            asq.AaE(graphicsLayer);
        }
        this.A06 = null;
        this.A03 = null;
        this.A04 = null;
        this.A05 = null;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3UX;LX/ASQ;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    public C1073AWe(ASQ asq, Function0 function0, C3UX c3ux) {
        this.A0G = c3ux;
        this.A0H = asq;
        this.A0F = function0;
        Boolean boolA0h = AnonymousClass001.A0h();
        AGE age = AGE.A00;
        this.A0D = C3cG.A08(age, boolA0h);
        this.A0A = C3cG.A08(age, boolA0h);
        this.A0C = C3cG.A08(age, boolA0h);
        this.A0B = C3cG.A08(age, boolA0h);
        long j = A0I;
        this.A02 = j;
        this.A00 = 0L;
        this.A06 = asq != null ? asq.A7n() : null;
        this.A08 = new AT5<>(AVd.A03, C8j3.A0l(0L), null);
        this.A09 = new AT5<>(AVd.A02, C8j3.A0t(), null);
        this.A0E = C3cG.A08(age, C8j3.A0l(0L));
        this.A01 = j;
    }
}
