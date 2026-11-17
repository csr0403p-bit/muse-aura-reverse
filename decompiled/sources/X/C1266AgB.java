package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AgB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1266AgB extends AbstractC1439Aj8 implements InterfaceC1403AiY, InterfaceC1224Af2 {
    public InterfaceC1286AgW A00;
    public boolean A01;

    @Override // X.InterfaceC1403AiY
    public final void AUZ(InterfaceC1497Ak4 interfaceC1497Ak4) {
        this.A01 = true;
    }

    @Override // X.InterfaceC1403AiY, X.InterfaceC1407Aic
    public final /* synthetic */ void AVH(long j) {
    }

    @Override // X.InterfaceC1224Af2
    public final Object bringIntoView(InterfaceC1497Ak4 interfaceC1497Ak4, Function0<AaC> function0, HtJ<? super Unit> htJ) {
        return C3cG.A0U(Hxb.A00(new BUI((Object) this, (InterfaceC1655Ane) new BTN(function0, this, interfaceC1497Ak4, 3), (G0U<? super AuT, Unit>) function0, (AuP) interfaceC1497Ak4, (InterfaceC1766AqJ) null, (HtJ<? super BUI>) 2), htJ));
    }

    public static final AaC A00(C1266AgB c1266AgB, InterfaceC1497Ak4 interfaceC1497Ak4, Function0<AaC> function0) {
        AaC aaCInvoke;
        if (!c1266AgB.isAttached || !c1266AgB.A01) {
            return null;
        }
        AbstractC1387AiH abstractC1387AiHA05 = AbstractC1414Aij.A05(c1266AgB);
        if (!interfaceC1497Ak4.isAttached() || (aaCInvoke = function0.invoke()) == null) {
            return null;
        }
        AaC aaCAPk = abstractC1387AiHA05.APk(interfaceC1497Ak4, false);
        return aaCInvoke.A03(AnonymousClass005.A0J(aaCAPk.A01, aaCAPk.A03));
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }
}
