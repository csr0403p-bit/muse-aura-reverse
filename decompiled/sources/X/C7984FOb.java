package X;

import android.view.View;
import java.util.Set;

/* renamed from: X.FOb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7984FOb implements FSC {
    public final /* synthetic */ FOX A03;
    public boolean A02 = false;
    public int A01 = 0;
    public int A00 = -1;

    @Override // X.FSC
    public final void ASh(int i) {
        if (i == 1) {
            Set<FSE> set = this.A03.A0A.A0K;
            FSE fse = FOX.A0N;
            if (set.contains(fse)) {
                set.remove(fse);
                return;
            }
            return;
        }
        if (i == 0) {
            FOX fox = this.A03;
            if (fox.A0H) {
                return;
            }
            Set<FSE> set2 = fox.A0A.A0K;
            FSE fse2 = FOX.A0N;
            if (set2.contains(fse2)) {
                return;
            }
            set2.add(fse2);
        }
    }

    public C7984FOb(FOX fox) {
        this.A03 = fox;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // X.FSC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AUm(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewParent r1 = r7.getParent()
            boolean r0 = r1 instanceof android.view.View
            r5 = 0
            if (r0 == 0) goto L5e
            android.view.View r1 = (android.view.View) r1
            int r4 = r1.getPaddingBottom()
        Lf:
            int r3 = r6.A00
            r2 = 1
            if (r3 <= 0) goto L1b
            int r0 = r7.getHeight()
            r1 = 1
            if (r3 != r0) goto L1c
        L1b:
            r1 = 0
        L1c:
            int r0 = r6.A01
            if (r0 == r4) goto L21
            r5 = 1
        L21:
            boolean r0 = r6.A02
            if (r0 != 0) goto L60
            if (r1 != 0) goto L60
            if (r5 != 0) goto L60
            int r1 = r7.getTop()
            int r8 = r8 - r4
            X.FOX r3 = r6.A03
            boolean r0 = r3.A0J
            if (r0 == 0) goto L59
            r2 = r8
        L35:
            boolean r0 = r3.A0D
            if (r0 == 0) goto L56
            if (r2 == 0) goto L56
            int r8 = r8 - r1
            float r1 = (float) r8
            float r0 = (float) r2
            float r1 = r1 / r0
        L3f:
            r3.A00 = r1
            X.FPY r0 = r3.A06
            if (r0 == 0) goto L4c
            androidx.fragment.app.Fragment r0 = r0.A00
            com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment r0 = (com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment) r0
            r0.onOverlayingBottomSheetDragged(r1)
        L4c:
            boolean r0 = r3.A0D
            if (r0 == 0) goto L55
            float r0 = r3.A00
            X.FOX.A01(r3, r0)
        L55:
            return
        L56:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L3f
        L59:
            int r2 = r7.getHeight()
            goto L35
        L5e:
            r4 = 0
            goto Lf
        L60:
            r6.A01 = r4
            r6.A02 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7984FOb.AUm(android.view.View, int):void");
    }

    @Override // X.FSC
    public final void AUp(View view, FSE fse) {
        this.A00 = view.getHeight();
        this.A02 = false;
        FOX fox = this.A03;
        FS8 fs8 = fox.A0A.A06;
        C8003FOx c8003FOx = fox.A07;
        fs8.A0A(c8003FOx == null ? null : c8003FOx.A00());
        if (fse == FOX.A0N) {
            if (!fox.A0H) {
                fox.A04(C79.A00);
            }
            fox.A02();
        }
    }
}
