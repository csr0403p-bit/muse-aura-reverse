package com.facebook.aura.conversation.view;

import X.AEk;
import X.AGI;
import X.AHD;
import X.AKQ;
import X.AOW;
import X.AT5;
import X.AWx;
import X.AYD;
import X.AaC;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B1V;
import X.B82;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BNH;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0n6;
import X.C0v5;
import X.C1515AkP;
import X.C1743Apg;
import X.C1YD;
import X.C1er;
import X.C2J7;
import X.C2VU;
import X.C3U4;
import X.C3UC;
import X.C3UQ;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C79;
import X.C7BY;
import X.C90l;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.richcontent.CurrentChatThreadLogMetadataKt;
import com.facebook.aura.conversation.view.richcontent.LocalIsPrimaryThreadKt;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.ProvideWindowBackDispatcherKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchImageOptionPreviewKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C3UX $coroutineScope;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ AT5<Float, AOW> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, AT5<Float, AOW> at5, Function0<Unit> function0, C3UX c3ux) {
            super(2);
            this.$enabled = z;
            this.$progress = at5;
            this.$onBack = function0;
            this.$coroutineScope = c3ux;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                boolean z = this.$enabled;
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$coroutineScope, AnonymousClass001.A1R(bfm, this.$onBack, bfm.A67(this.$progress)));
                AT5<Float, AOW> at5 = this.$progress;
                Function0<Unit> function0 = this.$onBack;
                C3UX c3ux = this.$coroutineScope;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new HatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$1$1$1(at5, function0, c3ux, null);
                    bfm.Ai0(objAaT);
                }
                B82.A00(bfm, (G0V) objAaT, 0, 0, z);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewBackHandler$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ AT5<Float, AOW> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AT5<Float, AOW> at5, boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.$progress = at5;
            this.$enabled = z;
            this.$onBack = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchImageOptionPreviewKt.ImageOptionPreviewBackHandler(this.$progress, this.$enabled, this.$onBack, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewBackdropBlur$1, reason: invalid class name and case insensitive filesystem */
    public final class C114701 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Float> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114701(Function0<Float> function0, int i) {
            super(2);
            this.$progress = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchImageOptionPreviewKt.ImageOptionPreviewBackdropBlur(this.$progress, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewBackdropBlur$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Float> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Function0<Float> function0, int i) {
            super(2);
            this.$progress = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchImageOptionPreviewKt.ImageOptionPreviewBackdropBlur(this.$progress, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewChrome$2, reason: invalid class name and case insensitive filesystem */
    public final class C114712 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ float $aspectRatio;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShare;
        public final /* synthetic */ G0U<AaC, Unit> $onTargetBoundsChanged;
        public final /* synthetic */ Function0<Float> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114712(float f, Function0<Float> function0, G0U<? super AaC, Unit> g0u, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$aspectRatio = f;
            this.$progress = function0;
            this.$onTargetBoundsChanged = g0u;
            this.$onShare = function02;
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
            HatchImageOptionPreviewKt.ImageOptionPreviewChrome(this.$aspectRatio, this.$progress, this.$onTargetBoundsChanged, this.$onShare, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewScrim$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Float> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Float> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$progress = function0;
            this.$onClick = function02;
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
            HatchImageOptionPreviewKt.ImageOptionPreviewScrim(this.$progress, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: HatchImageOptionPreview-T042LqI, reason: not valid java name */
    public static final void m609HatchImageOptionPreviewT042LqI(ImageOptionPreviewRequest imageOptionPreviewRequest, List<String> list, long j, String str, String str2, Function0<Unit> function0, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> hatchImageOptionPreviewKt$HatchImageOptionPreview$3;
        int i2;
        Function0 function02;
        AnonymousClass005.A16(list, str, str2, function0, 1);
        bfm.AgG(-155356566);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, imageOptionPreviewRequest) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(list, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str2);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            int i3 = -1;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
            if (imageOptionPreviewRequest == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    hatchImageOptionPreviewKt$HatchImageOptionPreview$3 = new HatchImageOptionPreviewKt$HatchImageOptionPreview$1(imageOptionPreviewRequest, list, j, str, str2, function0, i);
                }
            } else {
                AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
                boolean zA1W = AnonymousClass002.A1W(bfm, abstractC3358CGzA0h, ((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0d & 64) != 0 && bfm.A65(list))) | AnonymousClass003.A1E(iA0d), AnonymousClass005.A1M(iA0d));
                Object objAaT2 = bfm.AaT();
                if (zA1W || objAaT2 == obj) {
                    objAaT2 = imageOptionContentItems(list, str, str2, abstractC3358CGzA0h);
                    bfm.Ai0(objAaT2);
                }
                AHD ahd = (AHD) objAaT2;
                String strImageOptionSharedElementKey = imageOptionSharedElementKey(str, imageOptionPreviewRequest.index);
                Iterator it = ahd.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = 57344;
                        break;
                    }
                    i2 = 57344;
                    if (C7384Etj.areEqual(((ContentItem) it.next()).sharedElementKey, strImageOptionSharedElementKey)) {
                        i3 = i4;
                        break;
                    }
                    i4++;
                }
                ContentItem contentItem = (ContentItem) AbstractC0878AGe.A0A(i3, ahd);
                if (contentItem == null) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        hatchImageOptionPreviewKt$HatchImageOptionPreview$3 = new HatchImageOptionPreviewKt$HatchImageOptionPreview$item$1(imageOptionPreviewRequest, list, j, str, str2, function0, i);
                    }
                } else {
                    String str3 = contentItem.thumbnailUri;
                    if (str3 == null && (str3 = contentItem.imageUri) == null) {
                        bBbAAc = bfm.AAc();
                        if (bBbAAc == null) {
                            return;
                        } else {
                            hatchImageOptionPreviewKt$HatchImageOptionPreview$3 = new HatchImageOptionPreviewKt$HatchImageOptionPreview$previewUri$1(imageOptionPreviewRequest, list, j, str, str2, function0, i);
                        }
                    } else {
                        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
                        Context contextA0H = AnonymousClass002.A0H(bfm);
                        boolean zA1G = AnonymousClass003.A1G(bfm, LocalIsPrimaryThreadKt.LocalIsPrimaryThread);
                        Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
                        String str4 = contentItem.imageUri;
                        String str5 = contentItem.workspacePath;
                        if (str4 == null || str5 == null) {
                            AnonymousClass003.A0l(bfm, 1748818722);
                            function02 = null;
                        } else {
                            boolean zA1V = AnonymousClass005.A1V(bfm, contextA0H, abstractC3358CGzA0h, c3ux, AnonymousClass005.A1T(bfm, str5, contentItem, str4, AnonymousClass001.A1Z(auraNavigatorA0b, bfm, 1748389248)));
                            Object objAaT3 = bfm.AaT();
                            if (zA1V || objAaT3 == obj) {
                                objAaT3 = new HatchImageOptionPreviewKt$HatchImageOptionPreview$share$1$1(auraNavigatorA0b, str5, contentItem, str4, contextA0H, abstractC3358CGzA0h, c3ux);
                                bfm.Ai0(objAaT3);
                            }
                            function02 = (Function0) objAaT3;
                            AnonymousClass001.A1D(bfm);
                        }
                        String strA0t = AnonymousClass001.A0t(bfm, Integer.valueOf(imageOptionPreviewRequest.index + 1), R.string._name_removed__res_0x7f120865);
                        AaC aaC = imageOptionPreviewRequest.sourceBounds;
                        float f = imageOptionPreviewRequest.sourceDim;
                        float f2 = imageOptionPreviewRequest.aspectRatio;
                        boolean zA1X = AnonymousClass002.A1X(function02);
                        boolean zA1O = AnonymousClass003.A1O(bfm, mapCurrentChatThreadLogMetadata, function02, AnonymousClass001.A1U(bfm, zA1G, AnonymousClass001.A1a(AnonymousClass003.A1N(bfm, auraNavigatorA0b, ahd), bfm, i3))) | ((458752 & iA0d) == 131072);
                        Object objAaT4 = bfm.AaT();
                        if (zA1O || objAaT4 == obj) {
                            objAaT4 = new HatchImageOptionPreviewKt$HatchImageOptionPreview$2$1(auraNavigatorA0b, ahd, i3, zA1G, mapCurrentChatThreadLogMetadata, function02, function0);
                            bfm.Ai0(objAaT4);
                        }
                        m610ImageOptionPreviewDialog3f6hBDE(str3, strA0t, aaC, f, j, f2, zA1X, (G0U) objAaT4, bfm, (iA0d << 6) & i2);
                    }
                }
            }
            bBbAAc.A06 = hatchImageOptionPreviewKt$HatchImageOptionPreview$3;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            hatchImageOptionPreviewKt$HatchImageOptionPreview$3 = new HatchImageOptionPreviewKt$HatchImageOptionPreview$3(imageOptionPreviewRequest, list, j, str, str2, function0, i);
            bBbAAc.A06 = hatchImageOptionPreviewKt$HatchImageOptionPreview$3;
        }
    }

    public static final String imageOptionSharedElementKey(String str, int i) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0V("lobster_image_option_", str, "_", i);
    }

    public static final void ImageOptionPreviewChrome(float f, Function0<Float> function0, G0U<? super AaC, Unit> g0u, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(965620820);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA04 |= AnonymousClass004.A0W(bfm, function02);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA04 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA04 |= AnonymousClass004.A0h(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA04), bfm, iA04)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA00 = BNH.A00(C1743Apg.A01(bfm).A0E, AnonymousClass001.A0T(bRgA0Q));
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, i4);
            C90l c90l = C90l.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(c90l.AiP(bs0, 1.0f, true)), AuraDimensKt.SpacingXlarge);
            boolean zA1K = AnonymousClass004.A1K(iA04) | AnonymousClass004.A1F(iA04);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = new HatchImageOptionPreviewKt$ImageOptionPreviewChrome$1$1$1(g0u, f);
                bfm.Ai0(objAaT);
            }
            C01N.A07(bfm, bRgA09.then(new C3UQ((G0U) objAaT)));
            if (function02 == null) {
                bfm.AgE(2011563090);
            } else {
                bfm.AgE(2011563091);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b12);
                AuraLabelButtonStyle auraLabelButtonStyleElevated = AuraButtonStyles.INSTANCE.elevated(null, bfm, 48, 1);
                BRg bRgA06 = C3U4.A06(bs0, AuraDimensKt.SpacingMedium);
                boolean zA1C = AnonymousClass003.A1C(iA04);
                Object objAaT2 = bfm.AaT();
                if (zA1C || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchImageOptionPreviewKt$ImageOptionPreviewChrome$1$2$1$1(function0);
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, AnonymousClass001.A0W(bRgA06, objAaT2), auraLabelButtonStyleElevated, null, ComposableSingletons$HatchImageOptionPreviewKt.lambda$1395957059, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 1572864, 0, 0, 134201253);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114712(f, function0, g0u, function02, bRgA0Q, i, i2);
        }
    }

    /* renamed from: ImageOptionPreviewImage-Ccamzx0, reason: not valid java name */
    public static final void m611ImageOptionPreviewImageCcamzx0(String str, String str2, AaC aaC, AaC aaC2, float f, long j, Function0<Float> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-933145133);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, aaC);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, aaC2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A08(bfm, f);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0R(bfm, j);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function0);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, function02);
        }
        int i3 = i2 & 256;
        int iA0l = 100663296;
        if (i3 != 0) {
            iA0d |= iA0l;
        } else if ((i & 100663296) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA0d |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 38347923, 38347922), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120862);
            int i4 = 3670016 & iA0d;
            boolean zA1K = AnonymousClass004.A1K(iA0d) | AnonymousClass004.A1M(iA0d) | AnonymousClass002.A1Q(i4, 1048576);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = new HatchImageOptionPreviewKt$ImageOptionPreviewImage$bounds$1$1(aaC, aaC2, function0);
                bfm.Ai0(objAaT);
            }
            Function0 function03 = (Function0) objAaT;
            boolean zA65 = bfm.A65(function03);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchImageOptionPreviewKt$ImageOptionPreviewImage$1$1(function03);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA03 = AYD.A03(bRg2, (G0U) objAaT2);
            boolean zA652 = bfm.A65(function03);
            Object objAaT3 = bfm.AaT();
            if (zA652 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchImageOptionPreviewKt$ImageOptionPreviewImage$2$1(function03);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA00 = C3UC.A00(bRgA03, (G0W) objAaT3);
            boolean zA1Q = AnonymousClass002.A1Q(i4, 1048576);
            Object objAaT4 = bfm.AaT();
            if (zA1Q || objAaT4 == C78N.A00) {
                objAaT4 = new HatchImageOptionPreviewKt$ImageOptionPreviewImage$3$1(function0);
                bfm.Ai0(objAaT4);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgA00, objAaT4);
            boolean zA1H = AnonymousClass007.A1H(iA0d) | AnonymousClass005.A1L(iA0d) | AnonymousClass002.A1Q(i4, 1048576);
            Object objAaT5 = bfm.AaT();
            if (zA1H || objAaT5 == C78N.A00) {
                objAaT5 = new HatchImageOptionPreviewKt$ImageOptionPreviewImage$4$1(j, f, function0);
                bfm.Ai0(objAaT5);
            }
            BRg bRgA01 = C0v5.A01(null, null, AEk.A03(bRgA0W, (G0U) objAaT5), new C1YD(0), strA01, function02, true);
            boolean zA1I = AnonymousClass004.A1I(iA0d);
            Object objAaT6 = bfm.AaT();
            if (zA1I || objAaT6 == C78N.A00) {
                objAaT6 = new HatchImageOptionPreviewKt$ImageOptionPreviewImage$5$1(str2);
                bfm.Ai0(objAaT6);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA01, objAaT6, false);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            AuraImageKt.m2573AuraImageXRP3Ue8(str, m614coverBoundsd16Qtg0(BRg.A00, aaC2.A01()), B18.A00, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, (iA0d & 14) | 805306752, 48, 30200);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchImageOptionPreviewKt$ImageOptionPreviewImage$7(str, str2, aaC, aaC2, f, j, function0, function02, bRg2, i, i2);
        }
    }

    public static final void ImageOptionPreviewScrim(Function0<Float> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1856646857);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            long j = AnonymousClass002.A0c(bfm).scrim;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120027);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            boolean zA1B = AnonymousClass003.A1B(iA0T) | bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new HatchImageOptionPreviewKt$ImageOptionPreviewScrim$1$1(j, function0);
                bfm.Ai0(objAaT);
            }
            BRg bRgA01 = C0v5.A01(null, null, AEk.A01(bRgA0T, (G0U) objAaT), new C1YD(0), null, function02, true);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchImageOptionPreviewKt$ImageOptionPreviewScrim$2$1(strA01);
                bfm.Ai0(objAaT2);
            }
            C01N.A07(bfm, AnonymousClass001.A0Y(bRgA01, objAaT2, false));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(function0, function02, bRg2, i, i2);
        }
    }

    /* renamed from: coverBounds-d16Qtg0, reason: not valid java name */
    public static final BRg m614coverBoundsd16Qtg0(BRg bRg, long j) {
        return C3UC.A00(bRg, new HatchImageOptionPreviewKt$coverBounds$1(j));
    }

    public static final AHD<ContentItem> imageOptionContentItems(List<String> list, String str, String str2, AbstractC3358CGz abstractC3358CGz) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (String str3 : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            String str4 = str3;
            HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
            String strBuildAuthenticatedRawImageUrl = hatchFileOperations.buildAuthenticatedRawImageUrl(str4, abstractC3358CGz);
            if (strBuildAuthenticatedRawImageUrl != null) {
                String strNormalizeWorkspacePath = WorkspaceUriResolver.INSTANCE.normalizeWorkspacePath(str4, null);
                String str5 = strNormalizeWorkspacePath;
                if (strNormalizeWorkspacePath == null) {
                    str5 = str4;
                }
                arrayList.add(new ContentItem(C7BY.A0R(str5, str5, '/'), ContentType.Image.INSTANCE, strNormalizeWorkspacePath, strBuildAuthenticatedRawImageUrl, null, imageOptionSharedElementKey(str, i), str2, hatchFileOperations.buildAuthenticatedImageUrl(str4, abstractC3358CGz, HatchThumbnailDisplaySize.MEDIUM), null, false, null, null, null, null, null));
            }
            i = i2;
        }
        return AGI.A07(arrayList);
    }

    public static final void logImageOptionPreviewDismiss(boolean z, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.IMAGE_OPTION_TILE, null, map);
    }

    public static final void logImageOptionPreviewShare(boolean z, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.SHARE_BUTTON, null, map, null);
    }

    public static final void ImageOptionPreviewBackHandler(AT5<Float, AOW> at5, boolean z, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(1513513069);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(at5, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            ProvideWindowBackDispatcherKt.ProvideWindowBackDispatcher(B1V.A00(bfm, new AnonymousClass1(z, at5, function0, (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), C78N.A00)), -1522182015), bfm, 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(at5, z, function0, i);
        }
    }

    public static final void ImageOptionPreviewBackdropBlur(Function0<Float> function0, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass4;
        bfm.AgG(-780369653);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            bfm.Afo();
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new C114701(function0, i);
                    bBbAAc.A06 = anonymousClass4;
                }
                return;
            }
            View viewA0J = AnonymousClass001.A0J(bfm);
            float fAh4 = AnonymousClass002.A0Y(bfm).Ah4(20.0f);
            Float fValueOf = Float.valueOf(fAh4);
            boolean zA1V = AnonymousClass002.A1V(bfm, viewA0J, bfm.A62(fAh4), AnonymousClass001.A1L(iA0T));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new HatchImageOptionPreviewKt$ImageOptionPreviewBackdropBlur$2$1(function0, fAh4, viewA0J, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, viewA0J, fValueOf);
            boolean zA67 = bfm.A67(viewA0J);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchImageOptionPreviewKt$ImageOptionPreviewBackdropBlur$3$1(viewA0J);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, viewA0J);
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(function0, i);
            bBbAAc.A06 = anonymousClass4;
        }
    }

    /* renamed from: ImageOptionPreviewDialog-3f6hBDE, reason: not valid java name */
    public static final void m610ImageOptionPreviewDialog3f6hBDE(String str, String str2, AaC aaC, float f, long j, float f2, boolean z, G0U<? super ImageOptionPreviewExit, Unit> g0u, BFM bfm, int i) {
        bfm.AgG(-1185683264);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, aaC);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0Q(bfm, j);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A09(bfm, f2);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0t(bfm, z);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1D(iA0d), bfm, iA0d)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            AT5 at5 = (AT5) AnonymousClass005.A0e(bfm, objAaT, obj);
            MutableState mutableState = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            boolean zA1X = AnonymousClass002.A1X(mutableState.getValue());
            Boolean boolValueOf = Boolean.valueOf(zA1X);
            Object value = mutableState2.getValue();
            boolean zA1O = AnonymousClass003.A1O(bfm, at5, mutableStateA00, bfm.A66(zA1X));
            Object objAaT2 = bfm.AaT();
            if (zA1O || objAaT2 == obj) {
                objAaT2 = new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$1$1(zA1X, at5, mutableState2, mutableStateA00, null);
                bfm.Ai0(objAaT2);
            }
            C78e.A04(bfm, boolValueOf, value, (G0V) objAaT2);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$close$1$1(mutableState2);
                bfm.Ai0(objAaT3);
            }
            G0U g0u2 = (G0U) objAaT3;
            boolean zA67 = bfm.A67(at5);
            Object objAaT4 = bfm.AaT();
            if (zA67 || objAaT4 == obj) {
                objAaT4 = new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$2$1(at5);
                bfm.Ai0(objAaT4);
            }
            ImageOptionPreviewBackdropBlur((Function0) objAaT4, bfm, 0);
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$3$1(g0u2);
                bfm.Ai0(objAaT5);
            }
            C0n6.A00(bfm, new BA2(C79.A00, true, true, false, false), (Function0) objAaT5, B1V.A00(bfm, new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4(at5, mutableState2, g0u2, f2, z, mutableState, str, str2, aaC, f, j), -145567031), 438, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$5(str, str2, aaC, f, j, f2, z, g0u, i);
        }
    }

    public static final /* synthetic */ AaC access$ImageOptionPreviewDialog_3f6hBDE$lambda$2(MutableState mutableState) {
        return (AaC) mutableState.getValue();
    }

    public static final /* synthetic */ ImageOptionPreviewExit access$ImageOptionPreviewDialog_3f6hBDE$lambda$5(MutableState mutableState) {
        return (ImageOptionPreviewExit) mutableState.getValue();
    }

    public static final AaC fitted(AaC aaC, float f) {
        int iFloatToRawIntBits;
        if (aaC.A05() || f <= 0.0f) {
            return aaC;
        }
        float f2 = aaC.A02 - aaC.A01;
        float f3 = aaC.A00 - aaC.A03;
        if (f2 / f3 > f) {
            iFloatToRawIntBits = Float.floatToRawIntBits(f3 * f);
        } else {
            f3 = f2 / f;
            iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        }
        long jFloatToRawIntBits = (iFloatToRawIntBits << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
        long jA00 = aaC.A00();
        float fA00 = AnonymousClass001.A00(jFloatToRawIntBits) / 2.0f;
        float fA01 = AnonymousClass001.A01(jFloatToRawIntBits, 4294967295L) / 2.0f;
        return C2J7.A00(AWx.A04(jA00, (4294967295L & Float.floatToRawIntBits(fA01)) | (Float.floatToRawIntBits(fA00) << 32)), jFloatToRawIntBits);
    }
}
