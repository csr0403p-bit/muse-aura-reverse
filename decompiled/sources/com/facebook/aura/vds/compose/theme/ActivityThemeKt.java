package com.facebook.aura.vds.compose.theme;

import X.AIC;
import X.AKO;
import X.AbstractC1798ArH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.C1HY;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.G0U;
import X.G0V;
import X.HxS;
import android.app.Activity;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class ActivityThemeKt {

    /* renamed from: com.facebook.aura.vds.compose.theme.ActivityThemeKt$ApplyTheme$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ActivityTheme $activityTheme;
        public final /* synthetic */ AuraThemeMode $modeOverride;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraThemeMode auraThemeMode, ActivityTheme activityTheme, int i) {
            super(2);
            this.$modeOverride = auraThemeMode;
            this.$activityTheme = activityTheme;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityThemeKt.ApplyTheme(this.$modeOverride, this.$activityTheme, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void applyActivityTheme(android.app.Activity r5, boolean r6, java.lang.Boolean r7, java.lang.Integer r8) {
        /*
            r0 = 1
            boolean r0 = X.AnonymousClass002.A1b(r7, r0)
            r4 = 0
            if (r0 != 0) goto L11
            int r1 = X.C60P.A00(r5)
            r0 = 32
            r3 = 0
            if (r1 != r0) goto L12
        L11:
            r3 = 1
        L12:
            android.view.Window r2 = r5.getWindow()
            android.view.View r0 = r2.getDecorView()
            X.Avc r1 = new X.Avc
            r1.<init>(r0, r2)
            r0 = r3 ^ 1
            r1.A01(r0)
            r1.A00(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setNavigationBarColor(r0)
            if (r6 != 0) goto L34
            if (r8 == 0) goto L38
            int r4 = r8.intValue()
        L34:
            r2.setStatusBarColor(r4)
            return
        L38:
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.theme.ActivityThemeKt.applyActivityTheme(android.app.Activity, boolean, java.lang.Boolean, java.lang.Integer):void");
    }

    public static final void ApplyTheme(AuraThemeMode auraThemeMode, ActivityTheme activityTheme, BFM bfm, int i) {
        boolean zA1b = AnonymousClass004.A1b(auraThemeMode, activityTheme);
        bfm.AgG(1333165912);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, auraThemeMode) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, activityTheme);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA08), bfm, iA08)) {
            BBI bbi = (BBI) bfm;
            Object objA07 = AKO.A07(AndroidCompositionLocals_androidKt.A01, bbi);
            C7384Etj.A0Z(objA07, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) objA07;
            AuraColors auraColorsA0W = C3cH.A0W(bfm);
            C1HY c1hy = (C1HY) AKO.A07(AIC.A00, bbi);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AbstractC1798ArH.A05(bbi, zA1b);
            }
            MutableState mutableState = (MutableState) objAaT;
            int iResolveNavBarColor = resolveNavBarColor(activityTheme, auraColorsA0W);
            boolean zA63 = bfm.A63(iResolveNavBarColor);
            int i2 = iA08 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            int i3 = iA08 & 14;
            boolean zA1V = AnonymousClass002.A1V(bfm, c1hy, AnonymousClass002.A1V(bfm, activity, zA63, AnonymousClass002.A1Q(i2, 32)), AnonymousClass002.A1Q(i3, 4));
            Object objAaT2 = bfm.AaT();
            if (zA1V || objAaT2 == obj) {
                objAaT2 = new ActivityThemeKt$ApplyTheme$1$1(c1hy, mutableState, iResolveNavBarColor, activityTheme, activity, auraThemeMode);
                BBI.A0O(bbi, objAaT2);
            }
            C78e.A01(bfm, c1hy, auraThemeMode, activityTheme, (G0U) objAaT2);
            Integer numValueOf = Integer.valueOf(iResolveNavBarColor);
            boolean zA1S = AnonymousClass002.A1S(bfm, iResolveNavBarColor, bfm.A67(activity) | AnonymousClass002.A1Q(i2, 32), AnonymousClass002.A1Q(i3, 4));
            Object objAaT3 = bfm.AaT();
            if (zA1S || objAaT3 == obj) {
                objAaT3 = new ActivityThemeKt$ApplyTheme$2$1(activity, activityTheme, auraThemeMode, iResolveNavBarColor);
                BBI.A0O(bbi, objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, numValueOf);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(auraThemeMode, activityTheme, i);
        }
    }

    public static /* synthetic */ void applyActivityTheme$default(Activity activity, boolean z, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        applyActivityTheme(activity, z, bool, num);
    }

    public static final int resolveNavBarColor(ActivityTheme activityTheme, AuraColors auraColors) {
        Integer num = activityTheme.navBarColor;
        if (num != null) {
            return num.intValue();
        }
        return HxS.A01(!activityTheme.forceUseDefaultPrimaryColor ? auraColors.highlight : auraColors.background);
    }

    public static final void applyTheme(MutableState<Boolean> mutableState, int i, ActivityTheme activityTheme, Activity activity, AuraThemeMode auraThemeMode) {
        if (MutableState.A0A((MutableState) mutableState)) {
            return;
        }
        applyActivityTheme(activity, activityTheme.transparentStatusBar, Boolean.valueOf(AnonymousClass002.A1Z(auraThemeMode, AuraThemeMode.DARK)), Integer.valueOf(i));
        MutableState.A09(true, mutableState);
    }
}
