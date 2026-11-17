package X;

import android.view.PointerIcon;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes4.dex */
public abstract class AnM extends AbstractC1439Aj8 implements InterfaceC1348AhZ, InterfaceC1237AfR, C1Z2 {
    public InterfaceC1762AqF A00;
    public BG1 A01;
    public boolean A02;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1348AhZ
    /* renamed from: A01, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void onViewConfigurationChange() {
        if (this.A02) {
            this.A02 = false;
            if (this.isAttached) {
                C10543Hqv c10543HqvA0z = C3cG.A0z();
                AbstractC1235AfP.A03(this, BUX.A00(c10543HqvA0z, 25));
                AnM anM = (AnM) c10543HqvA0z.element;
                if (anM != null) {
                    anM.A00();
                } else {
                    A02(null);
                }
            }
        }
    }

    private final void A02(InterfaceC1762AqF interfaceC1762AqF) {
        boolean z = this instanceof C1616Amn;
        InterfaceC1659Ani interfaceC1659Ani = (InterfaceC1659Ani) ARZ.A01(Am0.A0B, this);
        if (z) {
            if (interfaceC1659Ani != null) {
                ((C1618Amp) interfaceC1659Ani).A01 = interfaceC1762AqF;
            }
        } else if (interfaceC1659Ani != null) {
            C1618Amp c1618Amp = (C1618Amp) interfaceC1659Ani;
            if (interfaceC1762AqF == null) {
                interfaceC1762AqF = C1763AqG.A00;
            }
            c1618Amp.A00 = interfaceC1762AqF;
            AndroidComposeView androidComposeView = c1618Amp.A02;
            PointerIcon systemIcon = PointerIcon.getSystemIcon(androidComposeView.getContext(), interfaceC1762AqF instanceof C1590AmH ? ((C1590AmH) interfaceC1762AqF).A00 : 1000);
            if (C7384Etj.areEqual(androidComposeView.getPointerIcon(), systemIcon)) {
                return;
            }
            androidComposeView.setPointerIcon(systemIcon);
        }
    }

    public final void A03(InterfaceC1762AqF interfaceC1762AqF) {
        if (C7384Etj.areEqual(this.A00, interfaceC1762AqF)) {
            return;
        }
        this.A00 = interfaceC1762AqF;
        if (this.A02) {
            F1F f1f = new F1F();
            f1f.element = true;
            AbstractC1235AfP.A04(this, BUX.A00(f1f, 26));
            if (f1f.element) {
                A00();
            }
        }
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public final long mo12getTouchBoundsExpansionRZrCHBk() {
        BG1 bg1 = this.A01;
        return bg1 != null ? bg1.A00(AbstractC1414Aij.A08(this)) : C2Uv.A00;
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // X.InterfaceC1348AhZ
    /* renamed from: onPointerEvent-H0pRuoY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo13onPointerEventH0pRuoY(X.C1247Afe r7, X.EnumC1080AXj r8, long r9) {
        /*
            r6 = this;
            X.AXj r0 = X.EnumC1080AXj.A04
            if (r8 != r0) goto L3c
            java.util.List<X.Agk> r5 = r7.A05
            int r4 = r5.size()
            r3 = 0
        Lb:
            if (r3 >= r4) goto L3c
            X.Agk r0 = X.C8j3.A0h(r5, r3)
            int r2 = r0.A07
            boolean r1 = r6 instanceof X.C1616Amn
            r0 = 3
            if (r1 == 0) goto L44
            if (r2 == r0) goto L1d
            r0 = 4
            if (r2 != r0) goto L49
        L1d:
            int r1 = r7.A00
            r0 = 4
            if (r1 != r0) goto L3d
            r0 = 1
            r6.A02 = r0
            X.F1F r1 = new X.F1F
            r1.<init>()
            r1.element = r0
            r0 = 26
            X.BUX r0 = X.BUX.A00(r1, r0)
            X.AbstractC1235AfP.A04(r6, r0)
            boolean r0 = r1.element
            if (r0 == 0) goto L3c
            r6.A00()
        L3c:
            return
        L3d:
            r0 = 5
            if (r1 != r0) goto L3c
            r6.onDensityChange()
            return
        L44:
            if (r2 == r0) goto L49
            r0 = 4
            if (r2 != r0) goto L1d
        L49:
            int r3 = r3 + 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnM.mo13onPointerEventH0pRuoY(X.Afe, X.AXj, long):void");
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A00() {
        InterfaceC1762AqF interfaceC1762AqF;
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        AbstractC1235AfP.A03(this, BUX.A00(c10543HqvA0z, 27));
        AnM anM = (AnM) c10543HqvA0z.element;
        if (anM == null || (interfaceC1762AqF = anM.A00) == null) {
            interfaceC1762AqF = this.A00;
        }
        A02(interfaceC1762AqF);
    }

    @Override // X.InterfaceC1348AhZ
    public final void onCancelPointerInput() {
        onDensityChange();
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        onDensityChange();
    }
}
