package com.facebook.aura.conversation.view;

import X.AKQ;
import X.AOW;
import X.AT5;
import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1062ATq;
import X.C10G;
import X.C13s;
import X.C1515AkP;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.globaleffects.api.AppFloatingLayerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ float $aspectRatio;
    public final /* synthetic */ boolean $canShare;
    public final /* synthetic */ G0U<ImageOptionPreviewExit, Unit> $close;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ long $dimColor;
    public final /* synthetic */ MutableState<ImageOptionPreviewExit> $exit$delegate;
    public final /* synthetic */ String $imageUri;
    public final /* synthetic */ AT5<Float, AOW> $progress;
    public final /* synthetic */ AaC $sourceBounds;
    public final /* synthetic */ float $sourceDim;
    public final /* synthetic */ MutableState<AaC> $targetBounds$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4(AT5<Float, AOW> at5, MutableState<ImageOptionPreviewExit> mutableState, G0U<? super ImageOptionPreviewExit, Unit> g0u, float f, boolean z, MutableState<AaC> mutableState2, String str, String str2, AaC aaC, float f2, long j) {
        super(2);
        this.$progress = at5;
        this.$exit$delegate = mutableState;
        this.$close = g0u;
        this.$aspectRatio = f;
        this.$canShare = z;
        this.$targetBounds$delegate = mutableState2;
        this.$imageUri = str;
        this.$contentDescription = str2;
        this.$sourceBounds = aaC;
        this.$sourceDim = f2;
        this.$dimColor = j;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        Function0 function0;
        C13s c13s;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            ViewParent parent = AnonymousClass001.A0J(bfm).getParent();
            Window windowAMm = null;
            if ((parent instanceof C13s) && (c13s = (C13s) parent) != null) {
                windowAMm = c13s.AMm();
            }
            boolean zA67 = bfm.A67(windowAMm);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$1$1(windowAMm);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, windowAMm);
            AT5<Float, AOW> at5 = this.$progress;
            boolean zA1Y = AnonymousClass002.A1Y(this.$exit$delegate.getValue());
            G0U<ImageOptionPreviewExit, Unit> g0u = this.$close;
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$2$1(g0u);
                bfm.Ai0(objAaT2);
            }
            HatchImageOptionPreviewKt.ImageOptionPreviewBackHandler(at5, zA1Y, (Function0) objAaT2, bfm, 392);
            C1062ATq c1062ATq = C10G.A01;
            AT5<Float, AOW> at52 = this.$progress;
            float f = this.$aspectRatio;
            boolean z = this.$canShare;
            G0U<ImageOptionPreviewExit, Unit> g0u2 = this.$close;
            MutableState<AaC> mutableState = this.$targetBounds$delegate;
            String str = this.$imageUri;
            String str2 = this.$contentDescription;
            AaC aaC = this.$sourceBounds;
            float f2 = this.$sourceDim;
            long j = this.$dimColor;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            boolean zA672 = bfm.A67(at52);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == obj) {
                objAaT3 = new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$3$1$1(at52);
                bfm.Ai0(objAaT3);
            }
            Function0 function03 = (Function0) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$3$2$1(g0u2);
                bfm.Ai0(objAaT4);
            }
            HatchImageOptionPreviewKt.ImageOptionPreviewScrim(function03, (Function0) objAaT4, null, bfm, 48, 4);
            boolean zA673 = bfm.A67(at52);
            Object objAaT5 = bfm.AaT();
            if (zA673 || objAaT5 == obj) {
                objAaT5 = new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$3$3$1(at52);
                bfm.Ai0(objAaT5);
            }
            Function0 function04 = (Function0) objAaT5;
            Object objAaT6 = bfm.AaT();
            if (objAaT6 == obj) {
                objAaT6 = new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$3$4$1(mutableState);
                bfm.Ai0(objAaT6);
            }
            G0U g0u3 = (G0U) objAaT6;
            if (z) {
                Object objA0p = AnonymousClass001.A0p(bfm, -869445256);
                if (objA0p == obj) {
                    objA0p = new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$3$5$1(g0u2);
                    bfm.Ai0(objA0p);
                }
                function0 = (Function0) objA0p;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-869400710);
                BBI.A0R(bbi, false);
                function0 = null;
            }
            HatchImageOptionPreviewKt.ImageOptionPreviewChrome(f, function04, g0u3, function0, null, bfm, 384, 16);
            AaC value = mutableState.getValue();
            if (value != null && !value.A05()) {
                boolean zA1Z = AnonymousClass001.A1Z(at52, bfm, -869304702);
                Object objAaT7 = bfm.AaT();
                if (zA1Z || objAaT7 == obj) {
                    objAaT7 = new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$3$7$1$1(at52);
                    bfm.Ai0(objAaT7);
                }
                Function0 function05 = (Function0) objAaT7;
                Object objAaT8 = bfm.AaT();
                if (objAaT8 == obj) {
                    objAaT8 = new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$3$7$2$1(g0u2);
                    bfm.Ai0(objAaT8);
                }
                HatchImageOptionPreviewKt.m611ImageOptionPreviewImageCcamzx0(str, str2, aaC, value, f2, j, function05, (Function0) objAaT8, null, bfm, 12582912, 256);
            } else {
                bfm.AgE(-869304703);
            }
            AnonymousClass003.A0q(bbi);
            AppFloatingLayerKt.AppFloatingLayers(null, false, bfm, 0, 3);
            return;
        }
        bfm.Afo();
    }
}
