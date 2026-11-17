package X;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AaN extends AbstractC1439Aj8 implements AXN, BRr, SuspendingPointerInputModifierNode {
    public long A00;
    public C1247Afe A01 = AaM.A00;
    public PointerInputEventHandler A02;
    public Object A03;
    public Object A04;
    public Object[] A05;
    public C1247Afe A06;
    public HoC A07;
    public final C0910AHm<SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> A08;
    public final Object A09;
    public final C0910AHm<SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> A0A;

    @Override // X.AXN
    public final /* synthetic */ float Agy(int i) {
        return i / AbstractC1414Aij.A08(this).AEm();
    }

    private final void A00(C1247Afe c1247Afe, EnumC1080AXj enumC1080AXj) {
        C0910AHm<SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> c0910AHm;
        Hm1<? super C1247Afe> hm1;
        Hm1<? super C1247Afe> hm12;
        synchronized (this.A09) {
            c0910AHm = this.A0A;
            c0910AHm.A0C(this.A08, c0910AHm.A00);
        }
        try {
            int iOrdinal = enumC1080AXj.ordinal();
            if (iOrdinal == 0 || iOrdinal == 2) {
                SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>[] suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutineArr = c0910AHm.A01;
                int i = c0910AHm.A00;
                for (int i2 = 0; i2 < i; i2++) {
                    SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?> suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutineArr[i2];
                    if (enumC1080AXj == suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A00 && (hm1 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A01) != null) {
                        suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A01 = null;
                        hm1.resumeWith(c1247Afe);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    throw C3cG.A0q();
                }
                int i3 = c0910AHm.A00 - 1;
                SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>[] suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutineArr2 = c0910AHm.A01;
                if (i3 < suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutineArr2.length) {
                    while (i3 >= 0) {
                        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?> suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutineArr2[i3];
                        if (enumC1080AXj == suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2.A00 && (hm12 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2.A01) != null) {
                            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2.A01 = null;
                            hm12.resumeWith(c1247Afe);
                        }
                        i3--;
                    }
                }
            }
        } finally {
            c0910AHm.A09();
        }
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public final void AbO() {
        HoC hoC = this.A07;
        if (hoC != null) {
            hoC.A5w(new PointerInputResetException());
            this.A07 = null;
        }
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public final /* synthetic */ long mo12getTouchBoundsExpansionRZrCHBk() {
        return C2Uv.A00;
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onCancelPointerInput */
    public final void onViewConfigurationChange() {
        C1247Afe c1247Afe = this.A06;
        if (c1247Afe != null) {
            List<C1299Agk> list = c1247Afe.A05;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (C8j3.A0h(list, i).A0F) {
                    List<C1299Agk> list2 = c1247Afe.A05;
                    ArrayList arrayListA0t = C60Q.A0t(list2);
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        C1299Agk c1299AgkA0h = C8j3.A0h(list2, i2);
                        long j = c1299AgkA0h.A08;
                        long j2 = c1299AgkA0h.A0A;
                        long j3 = c1299AgkA0h.A0E;
                        float f = c1299AgkA0h.A05;
                        boolean z = c1299AgkA0h.A0F;
                        arrayListA0t.add(new C1299Agk(f, 1.0f, c1299AgkA0h.A07, j, j3, j2, j3, j2, 0L, 0L, false, z, z));
                    }
                    C1247Afe c1247Afe2 = new C1247Afe(null, arrayListA0t);
                    this.A01 = c1247Afe2;
                    A00(c1247Afe2, EnumC1080AXj.A03);
                    A00(c1247Afe2, EnumC1080AXj.A04);
                    A00(c1247Afe2, EnumC1080AXj.A02);
                    this.A06 = null;
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo13onPointerEventH0pRuoY(C1247Afe c1247Afe, EnumC1080AXj enumC1080AXj, long j) {
        this.A00 = j;
        if (enumC1080AXj == EnumC1080AXj.A03) {
            this.A01 = c1247Afe;
        }
        if (this.A07 == null) {
            this.A07 = GAo.A02(C79.A0K, C6ys.A00, BU2.A0O(this, null, 49), getCoroutineScope());
        }
        A00(c1247Afe, enumC1080AXj);
        List<C1299Agk> list = c1247Afe.A05;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1247Afe = null;
                break;
            } else if (!AbstractC1078AXh.A03(C8j3.A0h(list, i))) {
                break;
            } else {
                i++;
            }
        }
        this.A06 = c1247Afe;
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    public AaN(PointerInputEventHandler pointerInputEventHandler, Object obj, Object obj2, Object[] objArr) {
        this.A03 = obj;
        this.A04 = obj2;
        this.A05 = objArr;
        this.A02 = pointerInputEventHandler;
        C0910AHm<SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> c0910AHm = new C0910AHm<>(0, new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine[16]);
        this.A08 = c0910AHm;
        this.A09 = c0910AHm;
        this.A0A = new C0910AHm<>(0, new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine[16]);
        this.A00 = 0L;
    }

    @Override // X.BRr
    public final <R> Object A50(G0V<? super InterfaceC1074AXb, ? super HtJ<? super R>, ? extends Object> g0v, HtJ<? super R> htJ) {
        GBL gblA03 = C7Bm.A03(htJ);
        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?> suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<>(this, gblA03);
        synchronized (this.A09) {
            this.A08.A0G(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine);
            AtomicReferenceFieldUpdater<GBG<?>, Object> atomicReferenceFieldUpdater = GBG.A01;
            new GBG(EnumC10460Hji.A02, C7Bm.A02(C7Bm.A01(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, g0v))).resumeWith(Unit.INSTANCE);
        }
        gblA03.AO2(BUX.A00(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, 30));
        return gblA03.A0F();
    }

    @Override // X.AXN
    public final float AEm() {
        return AbstractC1414Aij.A08(this).AEm();
    }

    @Override // X.C0dm
    public final float AFo() {
        return AbstractC1414Aij.A08(this).AFo();
    }

    @Override // X.AXN
    public final /* synthetic */ int Abr(float f) {
        return ASU.A01(this, f);
    }

    @Override // X.C0dm
    public final /* synthetic */ float Agw(long j) {
        return AbstractC1499Ak6.A00(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Agx(float f) {
        return f / AbstractC1414Aij.A08(this).AEm();
    }

    @Override // X.AXN
    public final /* synthetic */ long Agz(long j) {
        return ASU.A02(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah3(long j) {
        return ASU.A00(j, this);
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah4(float f) {
        return f * AbstractC1414Aij.A08(this).AEm();
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah6(long j) {
        return ASU.A03(this, j);
    }

    @Override // X.C0dm
    public final /* synthetic */ long Ah7(float f) {
        return AbstractC1499Ak6.A01(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah8(float f) {
        return AXN.A02(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah9(int i) {
        return AXN.A03(this, i);
    }

    @Override // X.AbstractC1439Aj8
    /* renamed from: onDensityChange */
    public final void onViewConfigurationChange() {
        AbO();
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        AbO();
    }

    @Override // X.InterfaceC1348AhZ
    public final void onViewConfigurationChange() {
        AbO();
    }
}
