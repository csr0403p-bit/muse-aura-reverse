package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: X.ARw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1033ARw implements InterfaceC1380AiA {
    public final Function0<List<AaC>> A00;
    public final Function0<Boolean> A01;

    /* JADX WARN: Multi-variable type inference failed */
    public C1033ARw(Function0<Boolean> function0, Function0<? extends List<AaC>> function02) {
        this.A01 = function0;
        this.A00 = function02;
    }

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int maxIntrinsicHeight(C3TF c3tf, List list, int i) {
        return AXQ.A00(c3tf, this, list, i);
    }

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int maxIntrinsicWidth(C3TF c3tf, List list, int i) {
        return AXQ.A01(c3tf, this, list, i);
    }

    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
        ArrayList arrayListA0t;
        ArrayList arrayListA0t2 = C60Q.A0t(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3TG c3tg = list.get(i);
            if (!(c3tg.AIX() instanceof AbG)) {
                arrayListA0t2.add(c3tg);
            }
        }
        List<AaC> listInvoke = this.A00.invoke();
        if (listInvoke != null) {
            arrayListA0t = C60Q.A0t(listInvoke);
            int size2 = listInvoke.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AaC aaC = listInvoke.get(i2);
                if (aaC != null) {
                    C3TG c3tg2 = (C3TG) arrayListA0t2.get(i2);
                    float f = aaC.A02;
                    float f2 = aaC.A01;
                    int iFloor = (int) Math.floor(f - f2);
                    float f3 = aaC.A00;
                    AnonymousClass002.A1J(c3tg2.AQW(AYL.A05(0, iFloor, 0, (int) Math.floor(f3 - r9))), C8j3.A0l(C8j3.A0T(Math.round(f2), Math.round(aaC.A03))), arrayListA0t);
                }
            }
        } else {
            arrayListA0t = null;
        }
        ArrayList arrayListA0t3 = C60Q.A0t(list);
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C3TG c3tg3 = list.get(i3);
            if (c3tg3.AIX() instanceof AbG) {
                arrayListA0t3.add(c3tg3);
            }
        }
        return AXY.A01(axy, BTA.A01(AbstractC1727ApL.A01(arrayListA0t3, this.A01), arrayListA0t, 48), Constraints.A01(j), Constraints.A00(j));
    }

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int minIntrinsicHeight(C3TF c3tf, List list, int i) {
        return AXQ.A02(c3tf, this, list, i);
    }

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int minIntrinsicWidth(C3TF c3tf, List list, int i) {
        return AXQ.A03(c3tf, this, list, i);
    }
}
