package com.facebook.aura.settings.support;

import X.ADq;
import X.AHD;
import X.AKH;
import X.AKQ;
import X.ATD;
import X.AVy;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BNt;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C0v5;
import X.C0z7;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1DG;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7OQ;
import X.C7OU;
import X.F60;
import X.G0U;
import X.G0V;
import X.HpR;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ContactSupportAttachmentsKt {
    public static final String TAG = "ContactSupportAttachments";
    public static final float ThumbnailHeight = 120.0f;

    /* renamed from: com.facebook.aura.settings.support.ContactSupportAttachmentsKt$AddAttachmentButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<List<? extends Uri>, Unit> $onAttachmentsPicked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z, G0U<? super List<? extends Uri>, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$enabled = z;
            this.$onAttachmentsPicked = g0u;
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
            ContactSupportAttachmentsKt.AddAttachmentButton(this.$enabled, this.$onAttachmentsPicked, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.support.ContactSupportAttachmentsKt$AttachmentThumbnail$2, reason: invalid class name and case insensitive filesystem */
    public final class C136362 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRemove;
        public final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136362(Uri uri, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$uri = uri;
            this.$enabled = z;
            this.$onRemove = function0;
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
            ContactSupportAttachmentsKt.AttachmentThumbnail(this.$uri, this.$enabled, this.$onRemove, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.support.ContactSupportAttachmentsKt$AttachmentsCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C136372 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AHD<Uri> $attachments;
        public final /* synthetic */ boolean $canAdd;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G0U<Uri, Unit> $onAttachmentRemoved;
        public final /* synthetic */ G0U<List<? extends Uri>, Unit> $onAttachmentsPicked;
        public final /* synthetic */ C07C $this_AttachmentsCard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C136372(C07C c07c, AHD<? extends Uri> ahd, boolean z, boolean z2, G0U<? super List<? extends Uri>, Unit> g0u, G0U<? super Uri, Unit> g0u2, int i) {
            super(2);
            this.$this_AttachmentsCard = c07c;
            this.$attachments = ahd;
            this.$canAdd = z;
            this.$enabled = z2;
            this.$onAttachmentsPicked = g0u;
            this.$onAttachmentRemoved = g0u2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ContactSupportAttachmentsKt.AttachmentsCard(this.$this_AttachmentsCard, this.$attachments, this.$canAdd, this.$enabled, this.$onAttachmentsPicked, this.$onAttachmentRemoved, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void AttachmentsCard(C07C c07c, AHD<? extends Uri> ahd, boolean z, boolean z2, G0U<? super List<? extends Uri>, Unit> g0u, G0U<? super Uri, Unit> g0u2, BFM bfm, int i) {
        boolean zA1b = AnonymousClass004.A1b(c07c, ahd);
        C7384Etj.A0Y(g0u, 4);
        C7384Etj.A0Y(g0u2, 5);
        bfm.AgG(-915200421);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, ahd);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$ContactSupportAttachmentsKt.f262lambda$1610709970;
            boolean zA1V = AnonymousClass002.A1V(bfm, ahd, AnonymousClass003.A1D(iA0d), AnonymousClass003.A1F(57344, iA0d, 16384)) | AnonymousClass003.A1E(iA0d) | ((458752 & iA0d) == 131072);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new ContactSupportAttachmentsKt$AttachmentsCard$1$1(z, g0u, ahd, z2, g0u2);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, zA1b, g0v, 0L, (G0U) objAaT, bfm, (iA0d & 14) | 384, 5);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136372(c07c, ahd, z, z2, g0u, g0u2, i);
        }
    }

    public static final void AddAttachmentButton(boolean z, G0U<? super List<? extends Uri>, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1573975139);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HpR hpR = new HpR();
            boolean zA1N = AnonymousClass001.A1N(iA0n);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = new ContactSupportAttachmentsKt$AddAttachmentButton$launcher$1$1(g0u);
                bfm.Ai0(objAaT);
            }
            C7OU c7ouA00 = C7OQ.A00(hpR, bfm, (G0U) objAaT);
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.XM_LARGE;
            AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.SECONDARY;
            AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.WITH_CIRCLE_BACKGROUND;
            AVy aVyA00 = BOf.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_mountain_square_plus_outline_24, 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201e8);
            boolean zA67 = bfm.A67(c7ouA00);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new ContactSupportAttachmentsKt$AddAttachmentButton$1$1(c7ouA00);
                bfm.Ai0(objAaT2);
            }
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(bRg2, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA01, (Function0) objAaT2, null, z, null, null, null, null, bfm, AnonymousClass001.A06(iA0n << 27, ((iA0n >> 6) & 14) | 28032 | (AVy.$stable << 3)), 0, 15648);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, g0u, bRg2, i, i2);
        }
    }

    public static final void AttachmentThumbnail(Uri uri, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(-2091291157);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, uri) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            float f = ThumbnailHeight;
            BRg bRgA01 = C11U.A01(C10G.A0C(bRgA0P, 80.0f, f), 8.0f);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA012 = C1b8.A01(bRgA01, C06G.A0J(bfm, akh));
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA012);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA013, i4);
            C0z7 c0z7 = C0z7.A00;
            String string = uri.toString();
            C7384Etj.A0U(string);
            BS0 bs0 = BRg.A00;
            AuraImageKt.m2573AuraImageXRP3Ue8(string, C10G.A01, B18.A00, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201eb), null, false, new C1DG(f), 0L, false, false, false, ComposableSingletons$ContactSupportAttachmentsKt.f263lambda$260500272, null, null, null, bfm, 806879664, 48, 30128);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.nav_close, 0);
            AuraIconSize auraIconSize = AuraIconSize.X_SMALL;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12071f);
            long jA0G = C06G.A0G(bfm, akh);
            Alignment alignment = C2VU.A0D;
            AuraIconKt.m2567AuraIconFHprtrg(C10G.A02(alignment, C10G.A09(C3U4.A09(C0v5.A05(c0z7.A4C(alignment, bs0), null, function0, z), AuraDimensKt.SpacingXsmall), 40.0f, 40.0f), false), aVyA00, auraIconSize, strA01, jA0G, null, bfm, AnonymousClass001.A03(), 32);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136362(uri, z, function0, bRgA0P, i, i2);
        }
    }

    public static final List<Uri> pickedUris(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return AbstractC0885AGm.A0z(intent.getData());
        }
        ADq aDqA0C = ATD.A0C(0, clipData.getItemCount());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = aDqA0C.iterator();
        while (it.hasNext()) {
            Uri uri = clipData.getItemAt(((BNt) it).A00()).getUri();
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        return arrayList;
    }
}
