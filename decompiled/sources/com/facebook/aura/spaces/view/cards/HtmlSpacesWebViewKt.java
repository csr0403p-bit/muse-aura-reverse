package com.facebook.aura.spaces.view.cards;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C2nw;
import X.C60O;
import X.C6t6;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7BY;
import X.C7qW;
import X.G0U;
import X.G0V;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.spaces.preload.SpacesShareBridge;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import com.facebook.aura.spaces.repo.SpacesDataInvalidatedEvent;
import com.facebook.aura.spaces.repo.SpacesWebViewSessionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class HtmlSpacesWebViewKt {
    public static final int MAX_RENDERER_RECOVERIES = 1;
    public static final String SPACE_CACHE_KEY_PREFIX = "space:";
    public static final String SPACE_MODAL_CACHE_KEY_PREFIX = "space:modal:";

    /* renamed from: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$SavedSpaceLoadingIndicator$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HtmlSpacesWebViewKt.SavedSpaceLoadingIndicator(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$SpacesShareBridgeEffect$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C6t6 $webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C6t6 c6t6, int i) {
            super(2);
            this.$webView = c6t6;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HtmlSpacesWebViewKt.SpacesShareBridgeEffect(this.$webView, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void pauseSpacesMedia(C6t6 c6t6) {
        c6t6.evaluateJavascript("window.__fwaSpacesSetAudioPaused&&window.__fwaSpacesSetAudioPaused(true);", null);
        c6t6.onPause();
    }

    public static final String spaceSlugFromCacheKey(String str) {
        String str2 = SPACE_MODAL_CACHE_KEY_PREFIX;
        if (!C60O.A1X(str, SPACE_MODAL_CACHE_KEY_PREFIX)) {
            str2 = SPACE_CACHE_KEY_PREFIX;
            if (!str.startsWith(SPACE_CACHE_KEY_PREFIX)) {
                return null;
            }
        }
        return C7BY.A0K(str2, str);
    }

    public static final void SavedSpaceLoadingIndicator(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1505544417);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205f4);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HtmlSpacesWebViewKt$SavedSpaceLoadingIndicator$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0v(bfm, bRg, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, i, i2);
        }
    }

    public static final void SpacesShareBridgeEffect(C6t6 c6t6, BFM bfm, int i) {
        bfm.AgG(-881297944);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, c6t6) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA65 = bfm.A65(bfm.A6v(LocalUserSessionKt.LocalUserSession)) | bfm.A65(c6t6);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                Context applicationContext = c6t6.getContext().getApplicationContext();
                C7384Etj.A0X(applicationContext);
                objAaT = new SpacesShareBridge(applicationContext, new HtmlSpacesWebViewKt$SpacesShareBridgeEffect$shareBridge$1$1(applicationContext));
                bfm.Ai0(objAaT);
            }
            SpacesShareBridge spacesShareBridge = (SpacesShareBridge) objAaT;
            HtmlSpacesWebViewSession htmlSpacesWebViewSessionSpacesSession = SpacesWebViewSessionKt.spacesSession(c6t6);
            boolean zA1V = AnonymousClass005.A1V(bfm, auraNavigatorA0b, c6t6, contextA0H, bfm.A67(spacesShareBridge));
            Object objAaT2 = bfm.AaT();
            if (zA1V || objAaT2 == C78N.A00) {
                objAaT2 = new HtmlSpacesWebViewKt$SpacesShareBridgeEffect$1$1(spacesShareBridge, auraNavigatorA0b, c6t6, contextA0H);
                bfm.Ai0(objAaT2);
            }
            bfm.AZp((Function0) objAaT2);
            Boolean boolValueOf = Boolean.valueOf(htmlSpacesWebViewSessionSpacesSession.authToken != null);
            boolean zA1S = AnonymousClass005.A1S(bfm, htmlSpacesWebViewSessionSpacesSession, spacesShareBridge, c6t6);
            Object objAaT3 = bfm.AaT();
            if (zA1S || objAaT3 == C78N.A00) {
                objAaT3 = new HtmlSpacesWebViewKt$SpacesShareBridgeEffect$2$1(htmlSpacesWebViewSessionSpacesSession, spacesShareBridge, c6t6);
                bfm.Ai0(objAaT3);
            }
            C78e.A01(bfm, spacesShareBridge, htmlSpacesWebViewSessionSpacesSession, boolValueOf, (G0U) objAaT3);
            boolean zA67 = bfm.A67(spacesShareBridge);
            Object objAaT4 = bfm.AaT();
            if (zA67 || objAaT4 == C78N.A00) {
                objAaT4 = new HtmlSpacesWebViewKt$SpacesShareBridgeEffect$3$1(spacesShareBridge);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A17(bfm, objAaT4, spacesShareBridge);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(c6t6, i);
        }
    }

    public static final JsonObject buildQueryInvalidationMessage(SpacesDataInvalidatedEvent spacesDataInvalidatedEvent) {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("type", "hatch:space:query-invalidated", c2nwA1K);
        C7qW.A06("spaceSlug", spacesDataInvalidatedEvent.slug, c2nwA1K);
        C7qW.A08("payload", new HtmlSpacesWebViewKt$buildQueryInvalidationMessage$1$1(spacesDataInvalidatedEvent), c2nwA1K);
        return c2nwA1K.A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isOnGatewayOrigin(java.lang.String r3, X.AbstractC3358CGz r4) {
        /*
            java.lang.String r1 = X.C60P.A1K(r4)
            boolean r0 = X.C7BY.A0j(r1)
            r4 = 0
            if (r0 != 0) goto L49
            com.facebook.aura.network.http.HatchHttpApi r0 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            java.lang.String r0 = r0.jarvisHttpBaseUrl(r1)
            if (r0 == 0) goto L49
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L36
            android.net.Uri r2 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r3.getScheme()     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r2.getScheme()     // Catch: java.lang.Throwable -> L36
            boolean r0 = X.C7384Etj.areEqual(r1, r0)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L30
            boolean r1 = X.C60R.A1S(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0 = 1
            if (r1 != 0) goto L31
        L30:
            r0 = 0
        L31:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L36
            goto L3b
        L36:
            r0 = move-exception
            X.Hud r2 = X.C3cG.A0s(r0)
        L3b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            boolean r0 = r2 instanceof X.C10571Hud
            if (r0 == 0) goto L44
            r2 = r1
        L44:
            boolean r0 = X.AnonymousClass001.A1X(r2)
            return r0
        L49:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt.isOnGatewayOrigin(java.lang.String, X.CGz):boolean");
    }

    public static final void resumeSpacesMedia(C6t6 c6t6) {
        c6t6.onResume();
        c6t6.evaluateJavascript("window.__fwaSpacesSetAudioPaused&&window.__fwaSpacesSetAudioPaused(false);", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07eb A[PHI: r0
  0x07eb: PHI (r0v116 java.lang.String) = (r0v115 java.lang.String), (r0v195 java.lang.String) binds: [B:330:0x077a, B:332:0x077e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0a42  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3 A[PHI: r1
  0x00d3: PHI (r1v2 int) = (r1v1 int), (r1v210 int), (r1v211 int) binds: [B:37:0x00bd, B:41:0x00cf, B:42:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:444:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123 A[PHI: r15
  0x0123: PHI (r15v1 int) = (r15v0 int), (r15v7 int) binds: [B:65:0x0117, B:68:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014a A[PHI: r0 r12
  0x014a: PHI (r0v52 int) = (r0v51 int), (r0v210 int), (r0v211 int) binds: [B:77:0x0136, B:83:0x0146, B:84:0x0148] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r12v3 int) = (r12v2 int), (r12v12 int), (r12v12 int) binds: [B:77:0x0136, B:83:0x0146, B:84:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0166  */
    /* renamed from: HtmlSpacesWebView-KAcDUPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2202HtmlSpacesWebViewKAcDUPU(java.lang.String r72, com.facebook.aura.spaces.repo.SpaceCard r73, X.BRg r74, float r75, float r76, boolean r77, float r78, float r79, float r80, java.util.Map<java.lang.String, java.lang.String> r81, X.G0U<? super java.lang.String, kotlin.Unit> r82, X.G0U<? super java.lang.String, kotlin.Unit> r83, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r84, X.G0V<? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> r85, X.G0U<? super X.B6A, kotlin.Unit> r86, kotlin.jvm.functions.Function0<kotlin.Unit> r87, com.facebook.aura.analytics.hatch.HatchSurface r88, com.facebook.aura.analytics.hatch.HatchSubsurface r89, com.facebook.aura.analytics.hatch.HatchScreen r90, X.BFM r91, int r92, int r93, int r94) {
        /*
            Method dump skipped, instructions count: 2836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt.m2202HtmlSpacesWebViewKAcDUPU(java.lang.String, com.facebook.aura.spaces.repo.SpaceCard, X.BRg, float, float, boolean, float, float, float, java.util.Map, X.G0U, X.G0U, X.G0W, X.G0V, X.G0U, kotlin.jvm.functions.Function0, com.facebook.aura.analytics.hatch.HatchSurface, com.facebook.aura.analytics.hatch.HatchSubsurface, com.facebook.aura.analytics.hatch.HatchScreen, X.BFM, int, int, int):void");
    }
}
