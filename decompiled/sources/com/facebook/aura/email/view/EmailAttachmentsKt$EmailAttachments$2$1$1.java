package com.facebook.aura.email.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.BFM;
import X.C0CD;
import X.C7384Etj;
import X.G0U;
import X.G2j;
import com.facebook.aura.email.model.EmailAttachment;
import com.facebook.aura.email.model.EmailMessage;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailAttachmentsKt$EmailAttachments$2$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ EmailMessage $message;

    /* renamed from: com.facebook.aura.email.view.EmailAttachmentsKt$EmailAttachments$2$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<EmailAttachment, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Object invoke(EmailAttachment emailAttachment) {
            C7384Etj.A0Y(emailAttachment, 0);
            return Integer.valueOf(emailAttachment.index);
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        final EmailMessage emailMessage = this.$message;
        final AHD<EmailAttachment> ahd = emailMessage.attachments;
        final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        final String str = this.$environmentId;
        final EmailAttachmentsKt$EmailAttachments$2$1$1$invoke$$inlined$items$default$1 emailAttachmentsKt$EmailAttachments$2$1$1$invoke$$inlined$items$default$1 = new G0U() { // from class: com.facebook.aura.email.view.EmailAttachmentsKt$EmailAttachments$2$1$1$invoke$$inlined$items$default$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }

            @Override // X.G0U
            public final Void invoke(EmailAttachment emailAttachment) {
                return null;
            }
        };
        c0cd.APL(anonymousClass1 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.email.view.EmailAttachmentsKt$EmailAttachments$2$1$1$invoke$$inlined$items$default$2
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, anonymousClass1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.email.view.EmailAttachmentsKt$EmailAttachments$2$1$1$invoke$$inlined$items$default$3
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, emailAttachmentsKt$EmailAttachments$2$1$1$invoke$$inlined$items$default$1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, AnonymousClass001.A0M(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.email.view.EmailAttachmentsKt$EmailAttachments$2$1$1$invoke$$inlined$items$default$4
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                EmailAttachment emailAttachment = (EmailAttachment) ahd.get(i);
                bfm.AgE(1370799677);
                EmailAttachmentsKt.EmailAttachmentTile(str, emailMessage.id, emailAttachment, !"QUARANTINED".equals(r0.attachmentStatus), null, bfm, 0, 16);
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 802480018), ahd.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailAttachmentsKt$EmailAttachments$2$1$1(EmailMessage emailMessage, String str) {
        super(1);
        this.$message = emailMessage;
        this.$environmentId = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
