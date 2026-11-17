package com.facebook.aura.settings;

import X.AKO;
import X.AbstractC1718Ap2;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BDU;
import X.BDa;
import X.BFM;
import X.C13s;
import X.C1er;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class SecureStorageWebDomainAutofillKt {

    /* renamed from: com.facebook.aura.settings.SecureStorageWebDomainAutofillKt$SecureStorageWebDomainAutofillEffect$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $pageUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, int i) {
            super(2);
            this.$pageUrl = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            SecureStorageWebDomainAutofillKt.SecureStorageWebDomainAutofillEffect(this.$pageUrl, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void SecureStorageWebDomainAutofillEffect(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        bfm.AgG(1532917285);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            BBI bbi = (BBI) bfm;
            View view = (View) AKO.A07(AndroidCompositionLocals_androidKt.A05, bbi);
            boolean z = (iA0d & 14) == 4;
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                String strNormalizePageUrl = HatchCredentialsViewModelKt.normalizePageUrl(str);
                objAaT = strNormalizePageUrl != null ? Uri.parse(strNormalizePageUrl).getHost() : null;
                bfm.Ai0(objAaT);
            }
            String str2 = (String) objAaT;
            MutableState mutableStateA00 = C1er.A00(bfm, str2);
            boolean zA1N = AnonymousClass003.A1N(bfm, view, mutableStateA00);
            Object objAaT2 = bfm.AaT();
            if (zA1N || objAaT2 == C78N.A00) {
                objAaT2 = new SecureStorageWebDomainAutofillKt$SecureStorageWebDomainAutofillEffect$1$1(view, mutableStateA00);
                BBI.A0O(bbi, objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, view);
            boolean zA1N2 = AnonymousClass003.A1N(bfm, view, str2);
            Object objAaT3 = bfm.AaT();
            if (zA1N2 || objAaT3 == C78N.A00) {
                objAaT3 = new SecureStorageWebDomainAutofillKt$SecureStorageWebDomainAutofillEffect$2$1(view, str2);
                BBI.A0O(bbi, objAaT3);
            }
            AnonymousClass001.A15(bfm, objAaT3);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, i);
        }
    }

    public static final void unwrapDialogLayout(View view) {
        AbstractC1718Ap2 abstractC1718Ap2;
        WebDomainAutofillLayout webDomainAutofillLayout = webDomainAutofillLayout(view);
        if (webDomainAutofillLayout != null) {
            webDomainAutofillLayout.setWebDomain(null);
            ViewParent parent = view.getParent();
            if (!(parent instanceof AbstractC1718Ap2) || (abstractC1718Ap2 = (AbstractC1718Ap2) parent) == null) {
                return;
            }
            abstractC1718Ap2.setViewCompositionStrategy(BDU.A00);
        }
    }

    public static final WebDomainAutofillLayout webDomainAutofillLayout(View view) {
        View view2;
        Object parent = view.getParent();
        ViewParent parent2 = (!(parent instanceof View) || (view2 = (View) parent) == null) ? null : view2.getParent();
        if (parent2 instanceof WebDomainAutofillLayout) {
            return (WebDomainAutofillLayout) parent2;
        }
        return null;
    }

    public static final WebDomainAutofillLayout wrapDialogLayout(View view) {
        AbstractC1718Ap2 abstractC1718Ap2;
        ViewGroup viewGroup;
        WebDomainAutofillLayout webDomainAutofillLayout = webDomainAutofillLayout(view);
        if (webDomainAutofillLayout != null) {
            return webDomainAutofillLayout;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof AbstractC1718Ap2) || (abstractC1718Ap2 = (AbstractC1718Ap2) parent) == null || !(abstractC1718Ap2 instanceof C13s)) {
            return null;
        }
        ViewParent parent2 = abstractC1718Ap2.getParent();
        if (!(parent2 instanceof ViewGroup) || (viewGroup = (ViewGroup) parent2) == null) {
            return null;
        }
        abstractC1718Ap2.setViewCompositionStrategy(BDa.A00);
        int iIndexOfChild = viewGroup.indexOfChild(abstractC1718Ap2);
        ViewGroup.LayoutParams layoutParams = abstractC1718Ap2.getLayoutParams();
        viewGroup.removeViewAt(iIndexOfChild);
        Context context = viewGroup.getContext();
        C7384Etj.A0U(context);
        WebDomainAutofillLayout webDomainAutofillLayout2 = new WebDomainAutofillLayout(context, view);
        webDomainAutofillLayout2.addView(abstractC1718Ap2, new FrameLayout.LayoutParams(-1, -1));
        viewGroup.addView(webDomainAutofillLayout2, iIndexOfChild, layoutParams);
        return webDomainAutofillLayout2;
    }
}
