package com.facebook.aura.spaces.view.cards;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C6t6;
import X.C78N;
import X.C78e;
import X.G0V;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class SavedSpaceAdmissionEffectKt {

    /* renamed from: com.facebook.aura.spaces.view.cards.SavedSpaceAdmissionEffectKt$SavedSpaceAdmissionEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $contentKey;
        public final /* synthetic */ String $shareKey;
        public final /* synthetic */ String $shortcode;
        public final /* synthetic */ String $sourceUrl;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ C6t6 $webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C6t6 c6t6, AbstractC3358CGz abstractC3358CGz, String str, String str2, String str3, String str4, int i) {
            super(2);
            this.$webView = c6t6;
            this.$userSession = abstractC3358CGz;
            this.$shortcode = str;
            this.$shareKey = str2;
            this.$sourceUrl = str3;
            this.$contentKey = str4;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            SavedSpaceAdmissionEffectKt.SavedSpaceAdmissionEffect(this.$webView, this.$userSession, this.$shortcode, this.$shareKey, this.$sourceUrl, this.$contentKey, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void SavedSpaceAdmissionEffect(C6t6 c6t6, AbstractC3358CGz abstractC3358CGz, String str, String str2, String str3, String str4, BFM bfm, int i) {
        AnonymousClass005.A0x(c6t6, abstractC3358CGz, str);
        AnonymousClass003.A0y(str3, str4);
        bfm.AgG(-1987766528);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, c6t6) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, abstractC3358CGz);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, str3);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0i(bfm, str4);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0T, 74898), bfm, iA0T)) {
            Object[] objArr = {c6t6, abstractC3358CGz, str, str2, str3, str4};
            boolean zA1V = AnonymousClass002.A1V(bfm, abstractC3358CGz, bfm.A67(c6t6) | AnonymousClass003.A1F(458752, iA0T, 131072), AnonymousClass003.A1F(57344, iA0T, 16384)) | AnonymousClass003.A1D(iA0T) | AnonymousClass006.A1X(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new SavedSpaceAdmissionEffectKt$SavedSpaceAdmissionEffect$1$1(c6t6, str4, str3, abstractC3358CGz, str, str2, null);
                bfm.Ai0(objAaT);
            }
            C78e.A08(bfm, (G0V) objAaT, objArr);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(c6t6, abstractC3358CGz, str, str2, str3, str4, i);
        }
    }
}
