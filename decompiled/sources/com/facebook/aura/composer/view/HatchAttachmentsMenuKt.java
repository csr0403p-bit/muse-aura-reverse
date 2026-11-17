package com.facebook.aura.composer.view;

import X.AHD;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B81;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.accessibility.ScreenReaderKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchAttachmentsMenuKt {

    /* renamed from: com.facebook.aura.composer.view.HatchAttachmentsMenuKt$HatchAttachmentsMenu$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
        public final /* synthetic */ AHD<AuraContextMenuItem> $menuItems;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AHD<AuraContextMenuItem> ahd) {
            super(2);
            this.$menuItems = ahd;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
            bfm.AgE(-860573376);
            AHD<AuraContextMenuItem> ahd = this.$menuItems;
            AnonymousClass002.A19(bfm);
            return ahd;
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchAttachmentsMenuKt$HatchAttachmentsMenu$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Boolean> $allowsFileAttachments;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ boolean $isPrimaryThread;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCameraClick;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onFilesClick;
        public final /* synthetic */ Function0<Unit> $onGalleryClick;
        public final /* synthetic */ Function0<Unit> $onVideoClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Boolean> function06, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$expanded = z;
            this.$onDismiss = function0;
            this.$onCameraClick = function02;
            this.$onGalleryClick = function03;
            this.$onVideoClick = function04;
            this.$onFilesClick = function05;
            this.$allowsFileAttachments = function06;
            this.$isPrimaryThread = z2;
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
            HatchAttachmentsMenuKt.HatchAttachmentsMenu(this.$expanded, this.$onDismiss, this.$onCameraClick, this.$onGalleryClick, this.$onVideoClick, this.$onFilesClick, this.$allowsFileAttachments, this.$isPrimaryThread, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchAttachmentsMenu(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Boolean> function06, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        boolean z3;
        BRg bRg2 = bRg;
        int iA0C = AnonymousClass002.A0C(function0, function02, 1);
        C7384Etj.A0Y(function03, 3);
        AnonymousClass003.A0y(function04, function05);
        C7384Etj.A0Y(function06, 6);
        bfm.AgG(1341399176);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, function03);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0X(bfm, function04);
        }
        if ((i & 196608) == 0) {
            iA0n |= AnonymousClass004.A0Y(bfm, function05);
        }
        if ((i & 1572864) == 0) {
            iA0n |= AnonymousClass004.A0Z(bfm, function06);
        }
        if ((i & 12582912) == 0) {
            iA0n |= AnonymousClass004.A0u(bfm, z2);
        }
        int i3 = i2 & 256;
        int iA0l = 100663296;
        if (i3 != 0) {
            iA0n |= iA0l;
        } else if ((i & 100663296) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA0n |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 38347923, 38347922), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchScreen hatchScreenChatScreen = HatchInteractionEnumsKt.chatScreen(z2);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120180);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120182);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120183);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120181);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.camera_wght400_outline_24, 0);
            AVy aVyA002 = BOf.A00(bfm, R.drawable.image_wght400_outline_24, 0);
            AVy aVyA003 = BOf.A00(bfm, R.drawable.circle_play_wght400_outline_24, 0);
            AVy aVyA004 = BOf.A00(bfm, R.drawable.paperclip_wght400_outline_24, 0);
            boolean zRememberIsCameraCaptureAvailable = ComposerCameraAvailabilityKt.rememberIsCameraCaptureAvailable(bfm, 0);
            boolean zA1Y = AnonymousClass003.A1Y(function06);
            boolean zA1P = AnonymousClass003.A1P(bfm, aVyA003, aVyA004, AnonymousClass005.A1T(bfm, strA014, aVyA00, aVyA002, AnonymousClass005.A1T(bfm, strA01, strA012, strA013, AnonymousClass001.A1U(bfm, zA1Y, bfm.A66(zRememberIsCameraCaptureAvailable)))));
            Object objAaT = bfm.AaT();
            if (zA1P || objAaT == C78N.A00) {
                BS0 bs0 = BRg.A00;
                AuraContextMenuItem auraContextMenuItem = new AuraContextMenuItem(0, strA01, null, aVyA00, null, null, false, false, false, true, false, bs0, 1, 1);
                if (!zRememberIsCameraCaptureAvailable) {
                    auraContextMenuItem = null;
                }
                AuraContextMenuItem auraContextMenuItem2 = new AuraContextMenuItem(1, strA012, null, aVyA002, null, null, false, false, false, true, false, bs0, 1, 1);
                AuraContextMenuItem auraContextMenuItem3 = new AuraContextMenuItem(iA0C, strA013, null, aVyA003, null, null, false, false, false, true, false, bs0, 1, 1);
                if (!zA1Y) {
                    auraContextMenuItem3 = null;
                }
                objAaT = AnonymousClass001.A0z(bfm, BFI.A0F(new AuraContextMenuItem[]{auraContextMenuItem, auraContextMenuItem2, auraContextMenuItem3, zA1Y ? new AuraContextMenuItem(3, strA014, null, aVyA004, null, null, false, false, false, true, false, bs0, 1, 1) : null}));
            }
            AHD ahd = (AHD) objAaT;
            int iOrdinal = hatchScreenChatScreen.ordinal();
            boolean zA63 = bfm.A63(iOrdinal);
            Object objAaT2 = bfm.AaT();
            if (zA63 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchAttachmentsMenuKt$HatchAttachmentsMenu$logClick$1$1(hatchScreenChatScreen);
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            boolean zA632 = bfm.A63(iOrdinal);
            int i4 = iA0n & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA18 = zA632 | AnonymousClass003.A18(i4);
            Object objAaT3 = bfm.AaT();
            if (zA18 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchAttachmentsMenuKt$HatchAttachmentsMenu$dismiss$1$1(hatchScreenChatScreen, function0);
                bfm.Ai0(objAaT3);
            }
            Function0 function07 = (Function0) objAaT3;
            if (z) {
                boolean zA1Y2 = AnonymousClass001.A1Y(function07, bfm, 1249690679);
                Object objAaT4 = bfm.AaT();
                if (zA1Y2 || objAaT4 == C78N.A00) {
                    objAaT4 = new HatchAttachmentsMenuKt$HatchAttachmentsMenu$1$1(function07);
                    bfm.Ai0(objAaT4);
                }
                z3 = true;
                B81.A00(false, (Function0) objAaT4, bfm, 0, 1);
            } else {
                z3 = true;
                bfm.AgE(1249724314);
            }
            AnonymousClass001.A1D(bfm);
            boolean zRememberIsScreenReaderEnabled = ScreenReaderKt.rememberIsScreenReaderEnabled(bfm, 0);
            long jA0G = AnonymousClass002.A0G(Float.floatToRawIntBits(8.0f), Float.floatToRawIntBits(0.0f) << 32);
            boolean zA1R = AnonymousClass001.A1R(bfm, g0u, AnonymousClass002.A1Q(i4, 32)) | AnonymousClass004.A1K(iA0n) | AnonymousClass004.A1M(iA0n) | AnonymousClass005.A1L(iA0n);
            if ((458752 & iA0n) != 131072) {
                z3 = false;
            }
            boolean z4 = zA1R | z3;
            Object objAaT5 = bfm.AaT();
            if (z4 || objAaT5 == C78N.A00) {
                objAaT5 = new HatchAttachmentsMenuKt$HatchAttachmentsMenu$2$1(function0, g0u, function02, function03, function04, function05);
                bfm.Ai0(objAaT5);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(bRg2, (G0U) objAaT5, function07, z, null, jA0G, null, zRememberIsScreenReaderEnabled, new AnonymousClass3(ahd), false, null, null, null, false, bfm, ((iA0n >> 24) & 14) | 196608 | ((iA0n << 9) & 7168), 0, 15952);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(z, function0, function02, function03, function04, function05, function06, z2, bRg2, i, i2);
        }
    }
}
