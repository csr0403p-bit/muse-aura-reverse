package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C13s;
import X.C78N;
import X.G0V;
import android.view.ViewParent;
import android.view.Window;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class BottomSheetSceneStrategyKt {
    public static final int SHEET_TRANSITION_DURATION_MS = 250;

    /* renamed from: com.facebook.aura.navigation.BottomSheetSceneStrategyKt$SystemBarsModeEffect$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AuraThemeMode $mode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraThemeMode auraThemeMode, int i) {
            super(2);
            this.$mode = auraThemeMode;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            BottomSheetSceneStrategyKt.SystemBarsModeEffect(this.$mode, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.navigation.BottomSheetSceneStrategyKt$SystemBarsModeEffect$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AuraThemeMode $mode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraThemeMode auraThemeMode, int i) {
            super(2);
            this.$mode = auraThemeMode;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            BottomSheetSceneStrategyKt.SystemBarsModeEffect(this.$mode, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void SystemBarsModeEffect(AuraThemeMode auraThemeMode, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        C13s c13s;
        bfm.AgG(1249881841);
        int iA0D = (i & 6) == 0 ? AnonymousClass004.A0D(bfm, AnonymousClass003.A0K(auraThemeMode)) | i : i;
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 3, 2), bfm, iA0D)) {
            bfm.Afo();
        } else {
            if (auraThemeMode == null || auraThemeMode == AuraThemeMode.DEFAULT) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(auraThemeMode, i);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            ViewParent parent = AnonymousClass001.A0J(bfm).getParent();
            Window windowAMm = null;
            if ((parent instanceof C13s) && (c13s = (C13s) parent) != null) {
                windowAMm = c13s.AMm();
            }
            boolean zA67 = bfm.A67(windowAMm) | AnonymousClass001.A1M(iA0D);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new BottomSheetSceneStrategyKt$SystemBarsModeEffect$2$1(windowAMm, auraThemeMode);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, windowAMm, auraThemeMode);
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(auraThemeMode, i);
            bBbAAc.A06 = anonymousClass3;
        }
    }
}
