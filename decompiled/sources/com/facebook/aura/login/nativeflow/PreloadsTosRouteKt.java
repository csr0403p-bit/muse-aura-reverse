package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BOD;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.InterfaceC7353EnQ;
import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.login.nativeflow.PreloadsTosViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class PreloadsTosRouteKt {

    /* renamed from: com.facebook.aura.login.nativeflow.PreloadsTosRouteKt$PreloadsTosRoute$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            PreloadsTosRouteKt.PreloadsTosRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void PreloadsTosRoute(BFM bfm, int i) {
        bfm.AgG(1416571582);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Context applicationContext = AnonymousClass002.A0H(bfm).getApplicationContext();
            C7384Etj.A0Z(applicationContext, "null cannot be cast to non-null type android.app.Application");
            PreloadsTosViewModel.Factory factory = new PreloadsTosViewModel.Factory((Application) applicationContext);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            PreloadsTosViewModel preloadsTosViewModel = (PreloadsTosViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(PreloadsTosViewModel.class));
            boolean zA1M = AnonymousClass003.A1M(bfm, preloadsTosViewModel, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new PreloadsTosRouteKt$PreloadsTosRoute$1$1(preloadsTosViewModel, auraNavigatorA0b, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, preloadsTosViewModel, auraNavigatorA0b);
            boolean zA67 = bfm.A67(preloadsTosViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new PreloadsTosRouteKt$PreloadsTosRoute$2$1(preloadsTosViewModel);
                bfm.Ai0(objAaT2);
            }
            PreloadsTosScreenKt.PreloadsTosScreen((Function0) ((InterfaceC7353EnQ) objAaT2), null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(i);
        }
    }

    public static final /* synthetic */ Boolean access$rememberNativeLoginStartKey$lambda$1(MutableState mutableState) {
        return (Boolean) mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.navigation.AuraNavKey rememberNativeLoginStartKey(boolean r7, X.BFM r8, int r9) {
        /*
            r0 = -542670044(0xffffffffdfa78324, float:-2.4141062E19)
            r8.AgE(r0)
            boolean r0 = com.facebook.aura.preloads.HatchPreloadsTosRepositoryKt.isPreloadsTosEnabled()
            if (r0 == 0) goto L65
            android.content.Context r0 = X.AnonymousClass002.A0H(r8)
            android.content.Context r5 = r0.getApplicationContext()
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Object r0 = r8.AaT()
            java.lang.Object r3 = X.C78N.A00
            if (r0 != r3) goto L24
            com.facebook.aura.login.nativeflow.PreloadsTosRouteKt$rememberNativeLoginStartKey$showsPreloadsTos$2$1 r0 = com.facebook.aura.login.nativeflow.PreloadsTosRouteKt$rememberNativeLoginStartKey$showsPreloadsTos$2$1.INSTANCE
            r8.Ai0(r0)
        L24:
            androidx.compose.runtime.MutableState r2 = X.AnonymousClass002.A0N(r8, r0, r1)
            boolean r1 = X.AnonymousClass003.A1J(r8, r2, r5)
            java.lang.Object r0 = r8.AaT()
            r6 = 0
            if (r1 != 0) goto L35
            if (r0 != r3) goto L3d
        L35:
            com.facebook.aura.login.nativeflow.PreloadsTosRouteKt$rememberNativeLoginStartKey$1$1 r0 = new com.facebook.aura.login.nativeflow.PreloadsTosRouteKt$rememberNativeLoginStartKey$1$1
            r0.<init>(r2, r5, r6)
            r8.Ai0(r0)
        L3d:
            X.AnonymousClass001.A18(r8, r0, r5)
            java.lang.Object r1 = r2.getValue()
            if (r1 == 0) goto L52
            java.lang.Boolean r0 = X.AnonymousClass001.A0i()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            com.facebook.aura.navigation.key.PreloadsTosScreenKey r6 = com.facebook.aura.navigation.key.PreloadsTosScreenKey.INSTANCE
        L52:
            X.AnonymousClass002.A19(r8)
            return r6
        L56:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L65
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L65:
            if (r7 == 0) goto L6c
            com.facebook.aura.navigation.key.NativeLoginIntroScreenKey r6 = com.facebook.aura.navigation.key.NativeLoginIntroScreenKey.INSTANCE
        L69:
            com.facebook.aura.navigation.AuraNavKey r6 = (com.facebook.aura.navigation.AuraNavKey) r6
            goto L52
        L6c:
            com.facebook.aura.navigation.key.NativeLoginLandingScreenKey r6 = com.facebook.aura.navigation.key.NativeLoginLandingScreenKey.INSTANCE
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.PreloadsTosRouteKt.rememberNativeLoginStartKey(boolean, X.BFM, int):com.facebook.aura.navigation.AuraNavKey");
    }
}
