package com.facebook.aura.settings.support;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.C0CD;
import X.C7384Etj;
import X.C7438Evz;
import X.C78N;
import X.G0U;
import X.G0W;
import X.G2j;
import android.net.Uri;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ContactSupportAttachmentsKt$AttachmentsCard$1$1$1$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ AHD<Uri> $attachments;
    public final /* synthetic */ boolean $canAdd;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ G0U<Uri, Unit> $onAttachmentRemoved;
    public final /* synthetic */ G0U<List<? extends Uri>, Unit> $onAttachmentsPicked;

    /* renamed from: com.facebook.aura.settings.support.ContactSupportAttachmentsKt$AttachmentsCard$1$1$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $canAdd;
        public final /* synthetic */ G0U<List<? extends Uri>, Unit> $onAttachmentsPicked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, G0U<? super List<? extends Uri>, Unit> g0u) {
            super(3);
            this.$canAdd = z;
            this.$onAttachmentsPicked = g0u;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                ContactSupportAttachmentsKt.AddAttachmentButton(this.$canAdd, this.$onAttachmentsPicked, null, bfm, 0, 4);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.support.ContactSupportAttachmentsKt$AttachmentsCard$1$1$1$1$1$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements G0U<Uri, String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Override // X.G0U
        public /* bridge */ /* synthetic */ String invoke(Uri uri) {
            C7384Etj.A0Y(uri, 0);
            return uri.toString();
        }

        public AnonymousClass2() {
            super(1, Uri.class, "toString", "toString()Ljava/lang/String;", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String invoke2(Uri uri) {
            C7384Etj.A0Y(uri, 0);
            return uri.toString();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ(null, null, B1V.A01(new AnonymousClass1(this.$canAdd, this.$onAttachmentsPicked), -426189378, true));
        final AHD<Uri> ahd = this.$attachments;
        final AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        final boolean z = this.$enabled;
        final G0U<Uri, Unit> g0u = this.$onAttachmentRemoved;
        final ContactSupportAttachmentsKt$AttachmentsCard$1$1$1$1$1$invoke$$inlined$items$default$1 contactSupportAttachmentsKt$AttachmentsCard$1$1$1$1$1$invoke$$inlined$items$default$1 = new G0U() { // from class: com.facebook.aura.settings.support.ContactSupportAttachmentsKt$AttachmentsCard$1$1$1$1$1$invoke$$inlined$items$default$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }

            @Override // X.G0U
            public final Void invoke(Uri uri) {
                return null;
            }
        };
        c0cd.APL(anonymousClass2 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.settings.support.ContactSupportAttachmentsKt$AttachmentsCard$1$1$1$1$1$invoke$$inlined$items$default$2
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, anonymousClass2, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.settings.support.ContactSupportAttachmentsKt$AttachmentsCard$1$1$1$1$1$invoke$$inlined$items$default$3
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, contactSupportAttachmentsKt$AttachmentsCard$1$1$1$1$1$invoke$$inlined$items$default$1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.settings.support.ContactSupportAttachmentsKt$AttachmentsCard$1$1$1$1$1$invoke$$inlined$items$default$4
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                Uri uri = (Uri) ahd.get(i);
                bfm.AgE(-1734995222);
                boolean z2 = z;
                boolean zA1J = AnonymousClass003.A1J(bfm, g0u, uri);
                Object objAaT = bfm.AaT();
                if (zA1J || objAaT == C78N.A00) {
                    objAaT = new ContactSupportAttachmentsKt$AttachmentsCard$1$1$1$1$1$3$1$1(g0u, uri);
                    bfm.Ai0(objAaT);
                }
                ContactSupportAttachmentsKt.AttachmentThumbnail(uri, z2, (Function0) objAaT, null, bfm, 0, 8);
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 802480018, true), ahd.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContactSupportAttachmentsKt$AttachmentsCard$1$1$1$1$1(AHD<? extends Uri> ahd, boolean z, G0U<? super List<? extends Uri>, Unit> g0u, boolean z2, G0U<? super Uri, Unit> g0u2) {
        super(1);
        this.$attachments = ahd;
        this.$canAdd = z;
        this.$onAttachmentsPicked = g0u;
        this.$enabled = z2;
        this.$onAttachmentRemoved = g0u2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
