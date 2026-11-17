package com.facebook.aura.composer.view;

import X.A3q;
import X.AHD;
import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C1890At8;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2k;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.utils.HatchLinkPreviewKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ComposerLinkPreviewsKt {

    /* renamed from: com.facebook.aura.composer.view.ComposerLinkPreviewsKt$ComposerLinkPreview$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<String> $attachedUrls;
        public final /* synthetic */ G2k<String, Function0<Unit>, BRg, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onRemoveAttachedUrl;
        public final /* synthetic */ ComposerLinkPreviewState $previews;
        public final /* synthetic */ C1890At8 $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(C1890At8 c1890At8, G2k<? super String, ? super Function0<Unit>, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, ComposerLinkPreviewState composerLinkPreviewState, AHD<String> ahd, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$state = c1890At8;
            this.$content = g2k;
            this.$previews = composerLinkPreviewState;
            this.$attachedUrls = ahd;
            this.$onRemoveAttachedUrl = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ComposerLinkPreviewsKt.ComposerLinkPreview(this.$state, this.$content, this.$previews, this.$attachedUrls, this.$onRemoveAttachedUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ComposerLinkPreview(C1890At8 c1890At8, G2k<? super String, ? super Function0<Unit>, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, ComposerLinkPreviewState composerLinkPreviewState, AHD<String> ahd, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(c1890At8, g2k);
        AnonymousClass002.A1B(composerLinkPreviewState, 2, ahd);
        C7384Etj.A0Y(g0u, 4);
        bfm.AgG(1645041713);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1890At8) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g2k);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, composerLinkPreviewState);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, ahd);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            List<String> listRememberLinkPreviewUrls = HatchLinkPreviewKt.rememberLinkPreviewUrls(c1890At8.A07().toString(), 2, bfm, 48);
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = AnonymousClass004.A11(bfm, A3q.A00);
            }
            MutableState mutableState = (MutableState) objAaT;
            int i4 = iA0d & 896;
            boolean zA1J = AnonymousClass003.A1J(bfm, mutableState, listRememberLinkPreviewUrls) | AnonymousClass003.A19(i4);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == C78N.A00) {
                objAaT2 = new ComposerLinkPreviewsKt$ComposerLinkPreview$1$1(listRememberLinkPreviewUrls, composerLinkPreviewState, mutableState, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, listRememberLinkPreviewUrls);
            List<String> urls = composerLinkPreviewState.getUrls();
            ArrayList arrayList = new ArrayList();
            for (String str : urls) {
                if (listRememberLinkPreviewUrls.contains(str) && !ahd.contains(str)) {
                    arrayList.add(str);
                }
            }
            if (ahd.isEmpty() && arrayList.isEmpty()) {
                bfm.AgE(1862279889);
            } else {
                bfm.AgE(1861692718);
                InterfaceC1380AiA interfaceC1380AiAA13 = AnonymousClass004.A13(bfm, 8.0f);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRg2);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA13, akqA04, bRgA01, iA0J);
                Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, 1555483938);
                while (itA0w.hasNext()) {
                    String str2 = (String) itA0w.next();
                    boolean zA65 = bfm.A65(mutableState) | bfm.A65(str2) | (i4 == 256) | ((57344 & iA0d) == 16384);
                    Object objAaT3 = bfm.AaT();
                    if (zA65 || objAaT3 == C78N.A00) {
                        objAaT3 = new ComposerLinkPreviewsKt$ComposerLinkPreview$2$1$1$1(str2, composerLinkPreviewState, g0u, mutableState);
                        bfm.Ai0(objAaT3);
                    }
                    g2k.invoke(str2, objAaT3, BRg.A00, bfm, Integer.valueOf(((iA0d << 6) & 7168) | 384));
                }
                BBI.A0R(bbi, zA1b);
                Iterator itA0w2 = AnonymousClass001.A0w(bfm, arrayList, 1555492763);
                while (itA0w2.hasNext()) {
                    String str3 = (String) itA0w2.next();
                    boolean zA652 = bfm.A65(mutableState) | bfm.A65(str3) | (i4 == 256);
                    Object objAaT4 = bfm.AaT();
                    if (zA652 || objAaT4 == C78N.A00) {
                        objAaT4 = new ComposerLinkPreviewsKt$ComposerLinkPreview$2$2$1$1(str3, composerLinkPreviewState, mutableState);
                        bfm.Ai0(objAaT4);
                    }
                    g2k.invoke(str3, objAaT4, BRg.A00, bfm, Integer.valueOf(((iA0d << 6) & 7168) | 384));
                }
                AnonymousClass003.A0q(bbi);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(c1890At8, g2k, composerLinkPreviewState, ahd, g0u, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ Set access$ComposerLinkPreview$lambda$1(MutableState mutableState) {
        return (Set) mutableState.getValue();
    }
}
