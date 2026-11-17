package com.facebook.aura.spaces.view.cards;

import X.AKL;
import X.AbstractC7559F3s;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AnonymousClass793;
import X.AnonymousClass794;
import X.BBb;
import X.BFM;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C78N;
import X.C78e;
import X.C7OQ;
import X.C7OU;
import X.G0U;
import X.G0V;
import X.HpR;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.PermissionRequest;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.model.HatchFileProviderUtil;
import com.facebook.aura.pairs.PairsHistoryScreenKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import com.facebook.aura.webview.HtmlWebViewPool;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class SpacesWebViewHostBindingsKt {
    public static final String SPACES_HOST_TAG = "SpacesWebViewHost";

    /* renamed from: com.facebook.aura.spaces.view.cards.SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $cacheKey;
        public final /* synthetic */ HtmlWebViewPool $pool;
        public final /* synthetic */ HtmlSpacesWebViewSession $session;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HtmlSpacesWebViewSession htmlSpacesWebViewSession, HtmlWebViewPool htmlWebViewPool, String str, int i) {
            super(2);
            this.$session = htmlSpacesWebViewSession;
            this.$pool = htmlWebViewPool;
            this.$cacheKey = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            SpacesWebViewHostBindingsKt.installSpacesWebViewHostBindings(this.$session, this.$pool, this.$cacheKey, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final String resolveAcceptMimeType(String[] strArr) {
        ArrayList arrayListA11 = C60O.A11(strArr.length);
        for (String str : strArr) {
            arrayListA11.add(AnonymousClass002.A0l(str));
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : arrayListA11) {
            String str2 = (String) obj;
            if (str2.length() > 0 && !"*/*".equals(str2)) {
                arrayListA0h.add(obj);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return "*/*";
        }
        boolean z = arrayListA0h instanceof Collection;
        if (!z || !arrayListA0h.isEmpty()) {
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                if (!AnonymousClass005.A1a(AnonymousClass005.A0j(it), "image/")) {
                    if (z && arrayListA0h.isEmpty()) {
                        return PairsHistoryScreenKt.VIDEO_MIME_TYPE;
                    }
                    Iterator it2 = arrayListA0h.iterator();
                    while (it2.hasNext()) {
                        if (!AnonymousClass005.A1a(AnonymousClass005.A0j(it2), "video/")) {
                            if (z && arrayListA0h.isEmpty()) {
                                return "audio/*";
                            }
                            Iterator it3 = arrayListA0h.iterator();
                            while (it3.hasNext()) {
                                if (!AnonymousClass005.A1a(AnonymousClass005.A0j(it3), "audio/")) {
                                    return "*/*";
                                }
                            }
                            return "audio/*";
                        }
                    }
                    return PairsHistoryScreenKt.VIDEO_MIME_TYPE;
                }
            }
        }
        return PairsHistoryScreenKt.IMAGE_MIME_TYPE;
    }

    public static final String androidPermissionFor(String str) {
        if ("android.webkit.resource.VIDEO_CAPTURE".equals(str)) {
            return "android.permission.CAMERA";
        }
        if ("android.webkit.resource.AUDIO_CAPTURE".equals(str)) {
            return AnonymousClass000.A00(43);
        }
        return null;
    }

    public static final Uri createSpacesCaptureUri(Context context) {
        return HatchFileProviderUtil.INSTANCE.createCaptureUri(context);
    }

    public static final void installSpacesWebViewHostBindings(HtmlSpacesWebViewSession htmlSpacesWebViewSession, HtmlWebViewPool htmlWebViewPool, String str, BFM bfm, int i) {
        AnonymousClass005.A0x(htmlSpacesWebViewSession, htmlWebViewPool, str);
        bfm.AgG(-474463832);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, htmlSpacesWebViewSession) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(htmlWebViewPool, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, str);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            boolean zA67 = bfm.A67(htmlSpacesWebViewSession);
            int i2 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            int i3 = iA0T & 896;
            boolean zA1Q = zA67 | (i2 == 32 || ((iA0T & 64) != 0 && bfm.A67(htmlWebViewPool))) | AnonymousClass002.A1Q(i3, 256);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$endFileRequest$1$1(htmlSpacesWebViewSession, htmlWebViewPool, str);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            HpR hpR = new HpR();
            boolean zA1N = AnonymousClass003.A1N(bfm, htmlSpacesWebViewSession, function0);
            Object objAaT2 = bfm.AaT();
            if (zA1N || objAaT2 == C78N.A00) {
                objAaT2 = new SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$fileChooserLauncher$1$1(htmlSpacesWebViewSession, function0);
                bfm.Ai0(objAaT2);
            }
            C7OU c7ouA00 = C7OQ.A00(hpR, bfm, (G0U) objAaT2);
            AnonymousClass794 anonymousClass794 = new AnonymousClass794();
            boolean zA1S = AnonymousClass004.A1S(bfm, function0, c7ouA00, AnonymousClass005.A1S(bfm, htmlSpacesWebViewSession, activity, contextA0H));
            Object objAaT3 = bfm.AaT();
            if (zA1S || objAaT3 == C78N.A00) {
                objAaT3 = new SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$cameraCapturePermissionLauncher$1$1(htmlSpacesWebViewSession, activity, contextA0H, function0, c7ouA00);
                bfm.Ai0(objAaT3);
            }
            C7OU c7ouA002 = C7OQ.A00(anonymousClass794, bfm, (G0U) objAaT3);
            Object objAaT4 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT4 == obj) {
                objAaT4 = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT4;
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            AnonymousClass793 anonymousClass793 = new AnonymousClass793();
            boolean zA672 = bfm.A67(contextA0H);
            Object objAaT5 = bfm.AaT();
            if (zA672 || objAaT5 == obj) {
                objAaT5 = new SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$mediaPermissionLauncher$1$1(mutableState, mutableState2, contextA0H);
                bfm.Ai0(objAaT5);
            }
            C7OU c7ouA003 = C7OQ.A00(anonymousClass793, bfm, (G0U) objAaT5);
            Object[] objArr = {htmlSpacesWebViewSession, contextA0H, htmlWebViewPool, str};
            boolean zA1Y = AnonymousClass005.A1Y(bfm, c7ouA00, c7ouA003, AnonymousClass005.A1Y(bfm, contextA0H, c7ouA002, bfm.A67(htmlSpacesWebViewSession) | (i2 == 32 || ((iA0T & 64) != 0 && bfm.A67(htmlWebViewPool))), AnonymousClass003.A19(i3)), bfm.A65(function0));
            Object objAaT6 = bfm.AaT();
            if (zA1Y || objAaT6 == obj) {
                objAaT6 = new SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$1$1(htmlSpacesWebViewSession, htmlWebViewPool, str, contextA0H, c7ouA002, function0, c7ouA00, mutableState, mutableState2, c7ouA003);
                bfm.Ai0(objAaT6);
            }
            C78e.A07(bfm, (G0U) objAaT6, objArr);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(htmlSpacesWebViewSession, htmlWebViewPool, str, i);
        }
    }

    public static final /* synthetic */ PermissionRequest access$installSpacesWebViewHostBindings$lambda$4(MutableState mutableState) {
        return (PermissionRequest) mutableState.getValue();
    }

    public static final /* synthetic */ String[] access$installSpacesWebViewHostBindings$lambda$7(MutableState mutableState) {
        return (String[]) mutableState.getValue();
    }

    public static final Intent buildSpacesChooserIntent(String[] strArr, boolean z, boolean z2, Uri uri) {
        String strResolveAcceptMimeType = resolveAcceptMimeType(strArr);
        if (z2 && uri != null && strResolveAcceptMimeType.startsWith("image/")) {
            Intent intentA03 = C60P.A03("android.media.action.IMAGE_CAPTURE");
            intentA03.putExtra("output", uri);
            intentA03.addFlags(2);
            intentA03.addFlags(1);
            return intentA03;
        }
        Intent intentA032 = C60P.A03("android.intent.action.GET_CONTENT");
        intentA032.setType(strResolveAcceptMimeType);
        intentA032.addCategory(AnonymousClass000.A00(4));
        if (!z) {
            return intentA032;
        }
        intentA032.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        return intentA032;
    }
}
