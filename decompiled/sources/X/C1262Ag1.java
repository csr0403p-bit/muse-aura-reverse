package X;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.NonTouchScrollingLogic;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableNestedScrollConnection;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.TrackpadScrollingLogic;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;

/* renamed from: X.Ag1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1262Ag1 extends DragGestureNode implements InterfaceC1476Ajj, InterfaceC1527Akg, InterfaceC1261Ag0 {
    public MouseWheelScrollingLogic A00;
    public TrackpadScrollingLogic A01;
    public G0V<? super Float, ? super Float, Boolean> A02;
    public G0V<? super AWx, ? super HtJ<? super AWx>, ? extends Object> A03;
    public InterfaceC1260Afz A04;
    public BLD A05;
    public final AcJ A06;
    public final ScrollingLogic A07;
    public final InterfaceC1214Aes A08;
    public final NestedScrollDispatcher A09;
    public final C1265AgA A0A;
    public final ScrollableNestedScrollConnection A0B;

    @Override // X.InterfaceC1527Akg
    public final boolean ATl(KeyEvent keyEvent) {
        long jA0P;
        int iFloatToRawIntBits;
        if (!super.A0B) {
            return false;
        }
        if (((keyEvent.getKeyCode() << 32) != C10384HaO.A0X && (keyEvent.getKeyCode() << 32) != C10384HaO.A0Y) || AbstractC1712Aov.A00(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        boolean zA1Z = AnonymousClass002.A1Z(this.A07.A03, EnumC1108AYu.A03);
        long j = this.A0A.A00;
        if (j == AbstractC1288AgY.A00) {
            j = 0;
        }
        if (zA1Z) {
            float f = (int) (j & 4294967295L);
            if (!AnonymousClass002.A1M(((keyEvent.getKeyCode() << 32) > C10384HaO.A0Y ? 1 : ((keyEvent.getKeyCode() << 32) == C10384HaO.A0Y ? 0 : -1)))) {
                f = -f;
            }
            jA0P = C8j3.A0P(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f);
        } else {
            float f2 = (int) (j >> 32);
            if (!AnonymousClass002.A1M(((keyEvent.getKeyCode() << 32) > C10384HaO.A0Y ? 1 : ((keyEvent.getKeyCode() << 32) == C10384HaO.A0Y ? 0 : -1)))) {
                f2 = -f2;
            }
            jA0P = C8j3.A0P(f2);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        AnonymousClass001.A1J(new BU3(this, null, 1, (jA0P << 32) | (4294967295L & iFloatToRawIntBits)), getCoroutineScope());
        return true;
    }

    @Override // X.InterfaceC1527Akg
    public final boolean AUr(KeyEvent keyEvent) {
        return false;
    }

    public C1262Ag1(InterfaceC1260Afz interfaceC1260Afz, C3MW c3mw, BLD bld, EnumC1108AYu enumC1108AYu, InterfaceC1180Adj interfaceC1180Adj, InterfaceC1072AWd interfaceC1072AWd, boolean z, boolean z2) {
        super(enumC1108AYu, interfaceC1072AWd, ScrollableKt.A03, z);
        this.A04 = interfaceC1260Afz;
        this.A05 = bld;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.A09 = nestedScrollDispatcher;
        AcI acI = new AcI(new C1054ATb(new C1155Acn(ScrollableKt.A02)), ScrollableKt.A01);
        this.A06 = acI;
        InterfaceC1260Afz interfaceC1260Afz2 = this.A04;
        BLD bld2 = this.A05;
        ScrollingLogic scrollingLogic = new ScrollingLogic(interfaceC1260Afz2, bld2 == null ? acI : bld2, this, enumC1108AYu, interfaceC1180Adj, nestedScrollDispatcher, C2292BSs.A00(this, 25), z2);
        this.A07 = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, z);
        this.A0B = scrollableNestedScrollConnection;
        C1506AkD c1506AkD = new C1506AkD(false, null, 2);
        A0G(c1506AkD);
        this.A08 = c1506AkD;
        C1265AgA c1265AgA = new C1265AgA(c3mw, enumC1108AYu, scrollingLogic, C2292BSs.A00(this, 26), z2);
        A0G(c1265AgA);
        this.A0A = c1265AgA;
        A0G(new NestedScrollNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        C1266AgB c1266AgB = new C1266AgB();
        c1266AgB.A00 = c1265AgA;
        A0G(c1266AgB);
    }

    public final void A0O(InterfaceC1260Afz interfaceC1260Afz, C3MW c3mw, BLD bld, EnumC1108AYu enumC1108AYu, InterfaceC1180Adj interfaceC1180Adj, InterfaceC1072AWd interfaceC1072AWd, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (super.A0B != z) {
            this.A0B.A00 = z;
            z3 = true;
        } else {
            z3 = false;
        }
        BLD bld2 = bld == null ? this.A06 : bld;
        ScrollingLogic scrollingLogic = this.A07;
        NestedScrollDispatcher nestedScrollDispatcher = this.A09;
        boolean z5 = true;
        if (C7384Etj.areEqual(scrollingLogic.A05, interfaceC1180Adj)) {
            z4 = false;
        } else {
            scrollingLogic.A05 = interfaceC1180Adj;
            z4 = true;
        }
        scrollingLogic.A01 = interfaceC1260Afz;
        EnumC1108AYu enumC1108AYu2 = scrollingLogic.A03;
        if (enumC1108AYu2 != enumC1108AYu) {
            scrollingLogic.A03 = enumC1108AYu;
            enumC1108AYu2 = enumC1108AYu;
            z4 = true;
        }
        if (scrollingLogic.A08 != z2) {
            scrollingLogic.A08 = z2;
        } else {
            z5 = z4;
        }
        scrollingLogic.A02 = bld2;
        scrollingLogic.A06 = nestedScrollDispatcher;
        C1265AgA c1265AgA = this.A0A;
        c1265AgA.A02 = enumC1108AYu;
        c1265AgA.A05 = z2;
        c1265AgA.A01 = c3mw;
        this.A04 = interfaceC1260Afz;
        this.A05 = bld;
        G0U<C1312Agx, Boolean> g0u = ScrollableKt.A03;
        EnumC1108AYu enumC1108AYu3 = EnumC1108AYu.A03;
        if (enumC1108AYu2 != enumC1108AYu3) {
            enumC1108AYu3 = EnumC1108AYu.A02;
        }
        A0M(enumC1108AYu3, interfaceC1072AWd, g0u, z, z5);
        if (z3) {
            this.A02 = null;
            this.A03 = null;
            AaW.A00(this);
        }
    }

    @Override // X.InterfaceC1476Ajj
    public final void A4Y(InterfaceC0857A6e interfaceC0857A6e) {
        if (super.A0B && (this.A02 == null || this.A03 == null)) {
            this.A02 = new C2296BSw(this, 0);
            this.A03 = new BU3(this, null, 4);
        }
        G0V<? super Float, ? super Float, Boolean> g0v = this.A02;
        if (g0v != null) {
            InterfaceC0857A6e.A00(AbstractC1578Alt.A0L, interfaceC0857A6e, null, g0v);
        }
        G0V<? super AWx, ? super HtJ<? super AWx>, ? extends Object> g0v2 = this.A03;
        if (g0v2 != null) {
            interfaceC0857A6e.Aca(AbstractC1578Alt.A0M, g0v2);
        }
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKZ() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKa() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AOU() {
        return true;
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        if (this.isAttached) {
            AXN axnA08 = AbstractC1414Aij.A08(this);
            ((AcI) this.A06).A01 = new C1054ATb(new C1155Acn(axnA08));
        }
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.A00;
        if (mouseWheelScrollingLogic != null) {
            ((NonTouchScrollingLogic) mouseWheelScrollingLogic).A00 = AbstractC1414Aij.A08(this);
        }
        TrackpadScrollingLogic trackpadScrollingLogic = this.A01;
        if (trackpadScrollingLogic != null) {
            ((NonTouchScrollingLogic) trackpadScrollingLogic).A00 = AbstractC1414Aij.A08(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    @Override // androidx.compose.foundation.gestures.DragGestureNode, X.InterfaceC1348AhZ
    /* renamed from: onPointerEvent-H0pRuoY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo13onPointerEventH0pRuoY(X.C1247Afe r8, X.EnumC1080AXj r9, long r10) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1262Ag1.mo13onPointerEventH0pRuoY(X.Afe, X.AXj, long):void");
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, X.AbstractC1439Aj8
    /* renamed from: onDensityChange */
    public final void onViewConfigurationChange() {
        onViewConfigurationChange();
        if (this.isAttached) {
            AXN axnA08 = AbstractC1414Aij.A08(this);
            ((AcI) this.A06).A01 = new C1054ATb(new C1155Acn(axnA08));
        }
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.A00;
        if (mouseWheelScrollingLogic != null) {
            ((NonTouchScrollingLogic) mouseWheelScrollingLogic).A00 = AbstractC1414Aij.A08(this);
        }
        TrackpadScrollingLogic trackpadScrollingLogic = this.A01;
        if (trackpadScrollingLogic != null) {
            ((NonTouchScrollingLogic) trackpadScrollingLogic).A00 = AbstractC1414Aij.A08(this);
        }
    }
}
