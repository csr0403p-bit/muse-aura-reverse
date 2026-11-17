package com.facebook.aura.bugreport;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass037;
import X.AxM;
import X.B15;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0CD;
import X.C0v5;
import X.C0z7;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1YD;
import X.C2VU;
import X.C3U4;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.C7OU;
import X.Ejq;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ String $annotateImageLabel;
    public final /* synthetic */ MutableState<Uri> $annotationDecodeInFlightUri$delegate;
    public final /* synthetic */ String $annotationFailureToast;
    public final /* synthetic */ MutableState<ScreenshotAnnotationTarget> $annotationTarget$delegate;
    public final /* synthetic */ String $attachmentImageDescription;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C7OU<Intent, ActivityResult> $galleryLauncher;
    public final /* synthetic */ MutableState<List<Uri>> $imageUris$delegate;
    public final /* synthetic */ C3UX $scope;

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ C7OU<Intent, ActivityResult> $galleryLauncher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C7OU<Intent, ActivityResult> c7ou) {
            super(3);
            this.$galleryLauncher = c7ou;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, anonymousClass037), bfm, i)) {
                AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.LARGE;
                AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.SECONDARY;
                AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.WITH_CIRCLE_BACKGROUND;
                AVy aVyA00 = BOf.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_mountain_square_plus_outline_24, 0);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201e8);
                boolean zA67 = bfm.A67(this.$galleryLauncher);
                C7OU<Intent, ActivityResult> c7ou = this.$galleryLauncher;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$1$1$1(c7ou);
                    bfm.Ai0(objAaT);
                }
                AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA01, (Function0) objAaT, null, false, null, null, null, null, bfm, (AVy.$stable << 3) | 28032, 0, 16161);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ(null, null, B1V.A01(new AnonymousClass1(this.$galleryLauncher), 918304989, true));
        MutableState<List<Uri>> mutableState = this.$imageUris$delegate;
        float f = AuraBugReportScreenKt.CLOSE_BUTTON_PADDING;
        final List<Uri> value = mutableState.getValue();
        final Context context = this.$context;
        final String str = this.$attachmentImageDescription;
        final String str2 = this.$annotateImageLabel;
        final C3UX c3ux = this.$scope;
        final String str3 = this.$annotationFailureToast;
        final MutableState<Uri> mutableState2 = this.$annotationDecodeInFlightUri$delegate;
        final MutableState<ScreenshotAnnotationTarget> mutableState3 = this.$annotationTarget$delegate;
        final MutableState<List<Uri>> mutableState4 = this.$imageUris$delegate;
        c0cd.APL(null, new G0U<Integer, Object>() { // from class: com.facebook.aura.bugreport.AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$invoke$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                value.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                value.get(i);
                return null;
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.bugreport.AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$invoke$$inlined$itemsIndexed$default$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                String str4;
                float f2;
                BBI bbiA0M;
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                boolean z = true;
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                Uri uri = (Uri) value.get(i);
                bfm.AgE(409563418);
                boolean zA1K = AnonymousClass003.A1K(bfm, context, uri);
                Object objAaT = bfm.AaT();
                if (zA1K || objAaT == C78N.A00) {
                    objAaT = AnonymousClass001.A0j(bfm, AuraBugReportScreenKt.isPreviewableAttachment(context, uri));
                }
                boolean zA1X = AnonymousClass001.A1X(objAaT);
                if (zA1X) {
                    str4 = str;
                } else {
                    zA1X = false;
                    str4 = null;
                }
                BS0 bs0 = BRg.A00;
                BRg bRgA01 = C11U.A01(C10G.A08(C10G.A04(bs0, 120.0f), 80.0f), 8.0f);
                if (zA1X) {
                    bfm.AgE(409968556);
                    MutableState mutableState5 = mutableState2;
                    float f3 = AuraBugReportScreenKt.CLOSE_BUTTON_PADDING;
                    boolean zA1Y = AnonymousClass002.A1Y(mutableState5.getValue());
                    String str5 = str2;
                    C1YD c1yd = new C1YD(0);
                    boolean zA1R = AnonymousClass001.A1R(bfm, str3, AnonymousClass001.A1T(bfm, context, AnonymousClass001.A1T(bfm, c3ux, bfm.A67(uri))));
                    Object objAaT2 = bfm.AaT();
                    if (zA1R || objAaT2 == C78N.A00) {
                        f2 = 80.0f;
                        objAaT2 = new AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$previewModifier$1$1(uri, c3ux, mutableState2, context, str3, mutableState3);
                        bfm.Ai0(objAaT2);
                    } else {
                        f2 = 80.0f;
                    }
                    bRgA01 = C0v5.A04(bRgA01, c1yd, str5, (Function0) objAaT2, zA1Y);
                    bbiA0M = (BBI) bfm;
                    BBI.A0R(bbiA0M, false);
                } else {
                    f2 = 80.0f;
                    bbiA0M = AnonymousClass002.A0M(bfm, 411225110);
                }
                BRg bRgA08 = C10G.A08(C10G.A04(bs0, 120.0f), f2);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                long j = bbiA0M.A06;
                int i3 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbiA0M);
                BRg bRgA012 = AxM.A01(bfm, bRgA08);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbiA0M.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbiA0M, function0);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i3);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
                C0z7 c0z7 = C0z7.A00;
                boolean zA65 = bfm.A65(uri);
                Object objAaT3 = bfm.AaT();
                if (zA65 || objAaT3 == C78N.A00) {
                    objAaT3 = B15.A00(uri);
                    bfm.Ai0(objAaT3);
                }
                AuraImageKt.AuraImage(bRgA01, (Ejq) objAaT3, str4, AuraBugReportScreenKt.THUMBNAIL_IMAGE_OPTIONS, false, null, null, false, false, false, null, null, null, null, false, null, bfm, 0, 0, 65520);
                BRg bRgA4C = c0z7.A4C(C2VU.A0D, C10G.A07(C3U4.A09(bs0, AuraBugReportScreenKt.CLOSE_BUTTON_PADDING), AuraBugReportScreenKt.CLOSE_BUTTON_SIZE));
                boolean zA652 = bfm.A65(mutableState4);
                if ((((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) ^ 48) <= 32 || !bfm.A63(i)) && (iA0d & 48) != 32) {
                    z = false;
                }
                boolean z2 = zA652 | z;
                Object objAaT4 = bfm.AaT();
                if (z2 || objAaT4 == C78N.A00) {
                    objAaT4 = new AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$1$2$1(mutableState4, i);
                    bfm.Ai0(objAaT4);
                }
                BRg bRgA04 = C0v5.A04(bRgA4C, null, null, (Function0) objAaT4, true);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D = AnonymousClass001.A0D(bbiA0M);
                AKQ akqA042 = BBI.A04(bbiA0M);
                BRg bRgA013 = AxM.A01(bfm, bRgA04);
                AnonymousClass005.A0n(bfm, bbiA0M, function0);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA013, g0vA0u);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.nav_close, 0), AuraIconSize.X_SMALL, null, C06G.A0A(bfm), null, bfm, AnonymousClass001.A03(), 41);
                BBI.A0R(bbiA0M, true);
                BBI.A0R(bbiA0M, true);
                BBI.A0R(bbiA0M, false);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996, true), value.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1(C7OU<Intent, ActivityResult> c7ou, MutableState<List<Uri>> mutableState, Context context, String str, String str2, C3UX c3ux, String str3, MutableState<Uri> mutableState2, MutableState<ScreenshotAnnotationTarget> mutableState3) {
        super(1);
        this.$galleryLauncher = c7ou;
        this.$imageUris$delegate = mutableState;
        this.$context = context;
        this.$attachmentImageDescription = str;
        this.$annotateImageLabel = str2;
        this.$scope = c3ux;
        this.$annotationFailureToast = str3;
        this.$annotationDecodeInFlightUri$delegate = mutableState2;
        this.$annotationTarget$delegate = mutableState3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
