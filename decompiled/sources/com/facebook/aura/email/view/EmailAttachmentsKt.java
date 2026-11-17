package com.facebook.aura.email.view;

import X.AKH;
import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
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
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C0v5;
import X.C0z7;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1YD;
import X.C1YY;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3UV;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C9m9;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.text.format.Formatter;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.email.model.EmailAttachment;
import com.facebook.aura.email.model.EmailMessage;
import com.facebook.aura.email.repo.EmailRepository;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailAttachmentsKt {

    /* renamed from: com.facebook.aura.email.view.EmailAttachmentsKt$EmailAttachmentDownload$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailAttachment $attachment;
        public final /* synthetic */ boolean $available;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, EmailAttachment emailAttachment, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$environmentId = str;
            this.$messageId = str2;
            this.$attachment = emailAttachment;
            this.$available = z;
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
            EmailAttachmentsKt.EmailAttachmentDownload(this.$environmentId, this.$messageId, this.$attachment, this.$available, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailAttachmentsKt$EmailAttachmentPreview$2, reason: invalid class name and case insensitive filesystem */
    public final class C117532 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailAttachment $attachment;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $preview;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117532(EmailAttachment emailAttachment, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$attachment = emailAttachment;
            this.$preview = str;
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
            EmailAttachmentsKt.EmailAttachmentPreview(this.$attachment, this.$preview, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailAttachmentsKt$EmailAttachmentTile$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailAttachment $attachment;
        public final /* synthetic */ boolean $available;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, EmailAttachment emailAttachment, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$environmentId = str;
            this.$messageId = str2;
            this.$attachment = emailAttachment;
            this.$available = z;
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
            EmailAttachmentsKt.EmailAttachmentTile(this.$environmentId, this.$messageId, this.$attachment, this.$available, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailAttachmentsKt$EmailAttachments$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ EmailMessage $message;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, EmailMessage emailMessage, BRg bRg, int i, int i2) {
            super(2);
            this.$environmentId = str;
            this.$message = emailMessage;
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
            EmailAttachmentsKt.EmailAttachments(this.$environmentId, this.$message, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailAttachmentsKt$EmailAttachments$3, reason: invalid class name and case insensitive filesystem */
    public final class C117543 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ EmailMessage $message;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117543(String str, EmailMessage emailMessage, BRg bRg, int i, int i2) {
            super(2);
            this.$environmentId = str;
            this.$message = emailMessage;
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
            EmailAttachmentsKt.EmailAttachments(this.$environmentId, this.$message, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EmailAttachmentDownload(java.lang.String r27, java.lang.String r28, com.facebook.aura.email.model.EmailAttachment r29, boolean r30, X.BRg r31, X.BFM r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailAttachmentsKt.EmailAttachmentDownload(java.lang.String, java.lang.String, com.facebook.aura.email.model.EmailAttachment, boolean, X.BRg, X.BFM, int, int):void");
    }

    public static final void EmailAttachmentPreview(EmailAttachment emailAttachment, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1405197411);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailAttachment) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
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
            Context contextA0H = AnonymousClass002.A0H(bfm);
            if (str != null) {
                bfm.AgE(-809969600);
                AuraImageKt.AuraImage(str, AnonymousClass001.A0T(bRg2), AnonymousClass005.A0Z(C7197Ei9.A0P), emailAttachment.filename, null, false, null, null, false, null, bfm, (iA0T >> 3) & 14, 1008);
                AnonymousClass001.A1D(bfm);
            } else {
                BRg bRgA09 = C3U4.A09(AnonymousClass002.A0R(bRg2, bfm, -809729009), 8.0f);
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(4.0f), bfm, C2VU.A02, 6);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA09);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                String str2 = emailAttachment.filename;
                AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, 0L, AnonymousClass001.A0g(bfm, akh).caption1Regular, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14838);
                long j = emailAttachment.size;
                if (j < 0) {
                    j = 0;
                }
                String shortFileSize = Formatter.formatShortFileSize(contextA0H, j);
                C7384Etj.A0U(shortFileSize);
                AuraTextKt.m2639AuraTextUY9GdpU(shortFileSize, null, C06G.A08(bfm), AnonymousClass001.A0g(bfm, akh).caption1Regular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, false);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117532(emailAttachment, str, bRg2, i, i2);
        }
    }

    public static final void EmailAttachmentTile(String str, String str2, EmailAttachment emailAttachment, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1995422790);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, emailAttachment);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = EmailRepository.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            EmailRepository emailRepository = (EmailRepository) objAaT;
            Object[] objArr = {emailRepository, str, str2, emailAttachment, Boolean.valueOf(z)};
            int i4 = iA0d & 14;
            boolean zA1T = AnonymousClass001.A1T(bfm, emailRepository, AnonymousClass003.A1E(iA0d)) | AnonymousClass002.A1Q(i4, 4);
            int i5 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1V = AnonymousClass002.A1V(bfm, emailAttachment, zA1T, AnonymousClass002.A1Q(i5, 32));
            Object objAaT2 = bfm.AaT();
            if (zA1V || objAaT2 == C78N.A00) {
                objAaT2 = new EmailAttachmentsKt$EmailAttachmentTile$preview$2$1(z, emailRepository, str, str2, emailAttachment, null);
                bfm.Ai0(objAaT2);
            }
            MutableState mutableStateA03 = C3UV.A03(bfm, null, (G0V) objAaT2, objArr);
            BRg bRgA01 = C1b8.A01(C11U.A01(C10G.A07(bRg2, 100.0f), 12.0f), AnonymousClass002.A0c(bfm).secondaryButtonBackground);
            C1YD c1yd = new C1YD(0);
            boolean zA1V2 = AnonymousClass002.A1V(bfm, emailAttachment, AnonymousClass003.A18(i5), bfm.A67(auraNavigatorA0b) | AnonymousClass003.A17(i4));
            Object objAaT3 = bfm.AaT();
            if (zA1V2 || objAaT3 == C78N.A00) {
                objAaT3 = new EmailAttachmentsKt$EmailAttachmentTile$1$1(auraNavigatorA0b, str, str2, emailAttachment);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA04 = C0v5.A04(bRgA01, c1yd, null, (Function0) objAaT3, z);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            C0z7 c0z7 = C0z7.A00;
            String strA05 = MutableState.A05(mutableStateA03);
            BS0 bs0 = BRg.A00;
            EmailAttachmentPreview(emailAttachment, strA05, C10G.A01, bfm, ((iA0d >> 6) & 14) | 384, 0);
            EmailAttachmentDownload(str, str2, emailAttachment, z, c0z7.A4C(C2VU.A07, bs0), bfm, iA0d & 8190, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, str2, emailAttachment, z, bRg2, i, i2);
        }
    }

    public static final void EmailAttachments(String str, EmailMessage emailMessage, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c117543;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(str, emailMessage);
        bfm.AgG(-1550015244);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, emailMessage);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (emailMessage.attachments.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c117543 = new AnonymousClass1(str, emailMessage, bRg2, i, i2);
                    bBbAAc.A06 = c117543;
                }
                return;
            }
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
            if ("QUARANTINED".equals(emailMessage.attachmentStatus)) {
                bfm.AgE(-941437885);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12093d), null, C06G.A08(bfm), C06G.A0S(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            } else {
                bfm.AgE(-941246460);
            }
            BBI.A0R(bbi, false);
            BRg bRgA00 = AbstractC07539Wl.A00(C10G.A02, FGI.A0M("email-attachments:", emailMessage.id));
            C9m9 c9m9A00 = AcQ.A00(8.0f);
            boolean zA67 = bfm.A67(emailMessage) | AnonymousClass004.A1F(iA0d);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new EmailAttachmentsKt$EmailAttachments$2$1$1(emailMessage, str);
                bfm.Ai0(objAaT);
            }
            C1YY.A00(null, null, c9m9A00, null, null, bfm, null, bRgA00, (G0U) objAaT, RuntimeInternals.IOPRIO_BACKGROUND, 494, false, false);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c117543 = new C117543(str, emailMessage, bRg2, i, i2);
            bBbAAc.A06 = c117543;
        }
    }
}
