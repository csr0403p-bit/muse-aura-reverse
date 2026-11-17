package X;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.MutableState;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BTX implements Ht9, G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public BTX(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                AT5 at5 = (AT5) this.A00;
                AT7 at7 = (AT7) this.A01;
                G0U g0u = (G0U) this.A02;
                F1F f1f = (F1F) this.A03;
                ATT att = (ATT) obj;
                AT7<T, V> at72 = at5.A04;
                SuspendAnimationKt.A06(att, at72);
                MutableState mutableState = att.A06;
                Object objA01 = AT5.A01(at5, mutableState.getValue());
                if (MutableState.A0B(mutableState, objA01)) {
                    if (g0u != null) {
                        g0u.invoke(at5);
                        break;
                    }
                } else {
                    at72.A05.Af8(objA01);
                    at7.A05.Af8(objA01);
                    if (g0u != null) {
                        g0u.invoke(at5);
                    }
                    att.A00();
                    f1f.element = true;
                    break;
                }
                break;
            case 1:
                MutableState mutableState2 = (MutableState) this.A00;
                C1049ASt c1049ASt = (C1049ASt) this.A01;
                C1051ASv c1051ASv = (C1051ASv) this.A02;
                C3UX c3ux = (C3UX) this.A03;
                long jA05 = C3cG.A05(obj);
                C1BO c1bo = (C1BO) mutableState2.getValue();
                long jA052 = c1bo != null ? C3cG.A05(c1bo.getValue()) : jA05;
                if (c1049ASt.A00 == Long.MIN_VALUE || c1051ASv.element != SuspendAnimationKt.A00(c3ux.AEA())) {
                    c1049ASt.A00 = jA05;
                    C0910AHm<C1050ASu<?, ?>> c0910AHm = c1049ASt.A03;
                    C1050ASu<?, ?>[] c1050ASuArr = c0910AHm.A01;
                    int i = c0910AHm.A00;
                    for (int i2 = 0; i2 < i; i2++) {
                        c1050ASuArr[i2].A06 = true;
                    }
                    c1051ASv.element = SuspendAnimationKt.A00(c3ux.AEA());
                }
                float f = c1051ASv.element;
                if (f == 0.0f) {
                    C0910AHm<C1050ASu<?, ?>> c0910AHm2 = c1049ASt.A03;
                    C1050ASu<?, ?>[] c1050ASuArr2 = c0910AHm2.A01;
                    int i3 = c0910AHm2.A00;
                    for (int i4 = 0; i4 < i3; i4++) {
                        C1050ASu<?, ?> c1050ASu = c1050ASuArr2[i4];
                        c1050ASu.A08.Af8(c1050ASu.A02.A05);
                        c1050ASu.A06 = true;
                    }
                    break;
                } else {
                    long j = (long) ((jA052 - c1049ASt.A00) / f);
                    C0910AHm<C1050ASu<?, ?>> c0910AHm3 = c1049ASt.A03;
                    C1050ASu<?, ?>[] c1050ASuArr3 = c0910AHm3.A01;
                    int i5 = c0910AHm3.A00;
                    boolean z = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        C1050ASu<?, ?> c1050ASu2 = c1050ASuArr3[i6];
                        if (!c1050ASu2.A05) {
                            MutableState.A09(false, c1050ASu2.A09.A02);
                            if (c1050ASu2.A06) {
                                c1050ASu2.A06 = false;
                                c1050ASu2.A00 = j;
                            }
                            long j2 = j - c1050ASu2.A00;
                            c1050ASu2.A08.Af8(c1050ASu2.A02.AMR(j2));
                            c1050ASu2.A05 = c1050ASu2.A02.AOR(j2);
                        }
                        if (!c1050ASu2.A05) {
                            z = false;
                        }
                    }
                    MutableState.A09(!z, c1049ASt.A01);
                    break;
                }
                break;
            case 2:
                C1265AgA c1265AgA = (C1265AgA) this.A00;
                HoC hoC = (HoC) this.A02;
                InterfaceC1258Afu interfaceC1258Afu = (InterfaceC1258Afu) this.A03;
                float fA02 = AnonymousClass001.A02(obj);
                float f2 = c1265AgA.A05 ? 1.0f : -1.0f;
                ScrollingLogic scrollingLogic = c1265AgA.A08;
                long jA053 = scrollingLogic.A05(scrollingLogic.A04(f2 * fA02));
                ScrollingLogic scrollingLogic2 = ((C1259Afy) interfaceC1258Afu).A00;
                float fA022 = f2 * scrollingLogic.A02(scrollingLogic.A05(ScrollingLogic.A01(scrollingLogic2.A04, scrollingLogic2, 1, jA053)));
                if (Math.abs(fA022) < Math.abs(fA02)) {
                    CancellationException cancellationException = new CancellationException(FGI.A0P("Scroll animation cancelled because scroll was not consumed (", " < ", ')', fA022, fA02));
                    cancellationException.initCause(null);
                    hoC.A5w(cancellationException);
                    break;
                }
                break;
            case 3:
                C1051ASv c1051ASv2 = (C1051ASv) this.A00;
                C3Q0 c3q0 = (C3Q0) this.A01;
                C1051ASv c1051ASv3 = (C1051ASv) this.A02;
                AcI acI = (AcI) this.A03;
                ATT att2 = (ATT) obj;
                MutableState mutableState3 = att2.A06;
                float fA07 = C8j3.A07(mutableState3) - c1051ASv2.element;
                float fAcG = c3q0.AcG(fA07);
                c1051ASv2.element = C8j3.A07(mutableState3);
                c1051ASv3.element = AnonymousClass001.A02(((AOl) att2.A04).A00.invoke(att2.A02));
                if (C8j3.A01(fA07, fAcG) > 0.5f) {
                    att2.A00();
                }
                acI.A00++;
                break;
            case 4:
                C1051ASv c1051ASv4 = (C1051ASv) this.A00;
                MouseWheelScrollingLogic mouseWheelScrollingLogic = (MouseWheelScrollingLogic) this.A01;
                InterfaceC1258Afu interfaceC1258Afu2 = (InterfaceC1258Afu) this.A02;
                G0U g0u2 = (G0U) this.A03;
                ATT att3 = (ATT) obj;
                float fA072 = C8j3.A07(att3.A06);
                float f3 = c1051ASv4.element;
                float f4 = fA072 - f3;
                if (AbstractC1252Afl.A00(f4)) {
                    if (AnonymousClass003.A1X(Float.valueOf(f3), g0u2)) {
                        att3.A00();
                        break;
                    }
                } else {
                    if (AbstractC1252Afl.A00(f4 - MouseWheelScrollingLogic.A00(mouseWheelScrollingLogic, interfaceC1258Afu2, f4))) {
                        f3 = c1051ASv4.element + f4;
                        c1051ASv4.element = f3;
                        if (AnonymousClass003.A1X(Float.valueOf(f3), g0u2)) {
                        }
                    }
                    att3.A00();
                }
                break;
            case 5:
                C1229Af7 c1229Af7 = (C1229Af7) this.A00;
                c1229Af7.A03 = new C1227Af5((C1131Abf) this.A01, (AfG) this.A03, (C1361Ahm) this.A02);
                return new BSM(c1229Af7, 4);
            case 6:
                C1897AtH c1897AtH = (C1897AtH) this.A00;
                AmD amD = (AmD) this.A01;
                C1805ArO c1805ArO = (C1805ArO) this.A02;
                AuI auI = (AuI) this.A03;
                if (MutableState.A0A(c1897AtH.A0B)) {
                    AmD.A00(c1897AtH, auI, c1805ArO, amD);
                }
                return new BSL(1);
            case 7:
                Function0 function0 = (Function0) this.A00;
                Function0 function02 = (Function0) this.A01;
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.A02;
                Object obj2 = this.A03;
                InterfaceC2266BNk interfaceC2266BNk = (InterfaceC2266BNk) obj;
                function0.invoke();
                if (function02 == null || AnonymousClass003.A1Y(function02)) {
                    interfaceC2266BNk.close();
                }
                textFieldSelectionState.A0P.Af8(obj2);
                break;
            default:
                Set set = (Set) this.A00;
                Object obj3 = this.A01;
                Set set2 = (Set) this.A02;
                C1BO c1bo2 = (C1BO) this.A03;
                set.add(obj3);
                return new BPU(c1bo2, obj3, set, set2);
        }
        return Unit.INSTANCE;
    }
}
