package com.facebook.aura.overlay;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BFM;
import X.C1BO;
import X.C78N;
import X.G0V;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavKeyKt;
import com.facebook.aura.overlay.api.OverlayApi;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchOverlayFrameworkKt {
    public static final String TAG = "HatchOverlayFramework";

    /* renamed from: com.facebook.aura.overlay.HatchOverlayFrameworkKt$HatchOverlayFramework$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchOverlayFrameworkKt.HatchOverlayFramework(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final boolean hasBlockingOverlay(AbstractC3358CGz abstractC3358CGz, BFM bfm, int i, int i2) {
        if ((i2 & 1) != 0) {
            abstractC3358CGz = AnonymousClass002.A0h(bfm);
        }
        boolean zA65 = bfm.A65(abstractC3358CGz);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = OverlayApi.Companion.getInstance(abstractC3358CGz);
            bfm.Ai0(objAaT);
        }
        List list = (List) C1BO.A07(bfm, ((OverlayApi) objAaT).activeOverlays);
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AuraNavKeyKt.isBlockingOverlay((AuraNavKey) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchOverlayFramework(X.BFM r8, int r9) {
        /*
            r0 = 1169453376(0x45b47140, float:5774.1562)
            r8.AgG(r0)
            r7 = 1
            boolean r0 = X.AnonymousClass002.A1L(r9)
            boolean r0 = X.AnonymousClass001.A1b(r0, r8, r9)
            if (r0 == 0) goto Lb9
            X.CGz r2 = X.AnonymousClass002.A0h(r8)
            X.AKH<java.lang.Long> r0 = com.facebook.aura.session.LocalUserSessionKt.LocalUserSessionGeneration
            java.lang.Object r0 = r8.A6v(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            com.facebook.aura.overlay.viewmodel.HatchOverlayViewModel$Factory r4 = new com.facebook.aura.overlay.viewmodel.HatchOverlayViewModel$Factory
            r4.<init>(r2)
            java.lang.Class<com.facebook.aura.overlay.viewmodel.HatchOverlayViewModel> r3 = com.facebook.aura.overlay.viewmodel.HatchOverlayViewModel.class
            java.lang.String r2 = com.facebook.aura.session.LocalUserSessionKt.activityViewModelKey(r3, r0)
            androidx.activity.ComponentActivity r1 = X.AnonymousClass004.A0y(r8)
            X.A6J r0 = X.AnonymousClass003.A0Z(r1)
            X.AEs r6 = X.AnonymousClass003.A0Y(r4, r1, r0, r3, r2)
            com.facebook.aura.overlay.viewmodel.HatchOverlayViewModel r6 = (com.facebook.aura.overlay.viewmodel.HatchOverlayViewModel) r6
            X.1BN<X.AHD<com.facebook.aura.navigation.AuraNavKey>> r0 = r6.activeOverlays
            r5 = 0
            X.1BO r4 = X.C2CK.A02(r8, r0)
            com.facebook.aura.navigation.AuraNavigator r3 = X.AnonymousClass002.A0b(r8)
            java.lang.Object r1 = r4.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto La2
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto La2
        L55:
            r7 = 0
        L56:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            boolean r1 = r8.A66(r7)
            java.lang.Object r0 = r8.AaT()
            if (r1 != 0) goto L68
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L70
        L68:
            com.facebook.aura.overlay.HatchOverlayFrameworkKt$HatchOverlayFramework$1$1 r0 = new com.facebook.aura.overlay.HatchOverlayFrameworkKt$HatchOverlayFramework$1$1
            r0.<init>(r7)
            r8.Ai0(r0)
        L70:
            X.AnonymousClass001.A17(r8, r0, r2)
            java.lang.Object r2 = r4.getValue()
            boolean r0 = r8.A65(r4)
            boolean r1 = X.AnonymousClass004.A1T(r8, r3, r6, r0)
            java.lang.Object r0 = r8.AaT()
            if (r1 != 0) goto L89
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L91
        L89:
            com.facebook.aura.overlay.HatchOverlayFrameworkKt$HatchOverlayFramework$2$1 r0 = new com.facebook.aura.overlay.HatchOverlayFrameworkKt$HatchOverlayFramework$2$1
            r0.<init>(r4, r3, r6, r5)
            r8.Ai0(r0)
        L91:
            X.AnonymousClass001.A1A(r8, r0, r2, r3)
        L94:
            X.BBb r1 = r8.AAc()
            if (r1 == 0) goto La1
            com.facebook.aura.overlay.HatchOverlayFrameworkKt$HatchOverlayFramework$3 r0 = new com.facebook.aura.overlay.HatchOverlayFrameworkKt$HatchOverlayFramework$3
            r0.<init>(r9)
            r1.A06 = r0
        La1:
            return
        La2:
            java.util.Iterator r1 = r1.iterator()
        La6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r1.next()
            com.facebook.aura.navigation.AuraNavKey r0 = (com.facebook.aura.navigation.AuraNavKey) r0
            boolean r0 = com.facebook.aura.navigation.AuraNavKeyKt.isBlockingOverlay(r0)
            if (r0 == 0) goto La6
            goto L56
        Lb9:
            r8.Afo()
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.overlay.HatchOverlayFrameworkKt.HatchOverlayFramework(X.BFM, int):void");
    }
}
