package com.facebook.aura.settings.support;

import X.AHD;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFM;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1AC;
import X.C1DP;
import X.C1YY;
import X.C2VU;
import X.C7384Etj;
import X.C78N;
import X.C9m9;
import X.G0U;
import X.G0W;
import android.net.Uri;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ContactSupportAttachmentsKt$AttachmentsCard$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ AHD<Uri> $attachments;
    public final /* synthetic */ boolean $canAdd;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ G0U<Uri, Unit> $onAttachmentRemoved;
    public final /* synthetic */ G0U<List<? extends Uri>, Unit> $onAttachmentsPicked;

    /* renamed from: com.facebook.aura.settings.support.ContactSupportAttachmentsKt$AttachmentsCard$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<Uri> $attachments;
        public final /* synthetic */ boolean $canAdd;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G0U<Uri, Unit> $onAttachmentRemoved;
        public final /* synthetic */ G0U<List<? extends Uri>, Unit> $onAttachmentsPicked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, G0U<? super List<? extends Uri>, Unit> g0u, AHD<? extends Uri> ahd, boolean z2, G0U<? super Uri, Unit> g0u2) {
            super(3);
            this.$canAdd = z;
            this.$onAttachmentsPicked = g0u;
            this.$attachments = ahd;
            this.$enabled = z2;
            this.$onAttachmentRemoved = g0u2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                C1062ATq c1062ATq = C10G.A02;
                float f = AuraDimensKt.SpacingMedium;
                C1DP c1dp = new C1DP(f, f, f, f);
                C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingSmall);
                C1AC c1ac = C2VU.A04;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onAttachmentRemoved, AnonymousClass001.A1U(bfm, this.$enabled, AnonymousClass001.A1T(bfm, this.$attachments, AnonymousClass001.A1R(bfm, this.$onAttachmentsPicked, bfm.A66(this.$canAdd)))));
                AHD<Uri> ahd = this.$attachments;
                boolean z = this.$canAdd;
                G0U<List<? extends Uri>, Unit> g0u = this.$onAttachmentsPicked;
                boolean z2 = this.$enabled;
                G0U<Uri, Unit> g0u2 = this.$onAttachmentRemoved;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new ContactSupportAttachmentsKt$AttachmentsCard$1$1$1$1$1(ahd, z, g0u, z2, g0u2);
                    bfm.Ai0(objAaT);
                }
                C1YY.A00(null, null, c9m9A00, c1dp, null, bfm, c1ac, c1062ATq, (G0U) objAaT, 196614, 458, false, false);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$canAdd, this.$onAttachmentsPicked, this.$attachments, this.$enabled, this.$onAttachmentRemoved), 320040641);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContactSupportAttachmentsKt$AttachmentsCard$1$1(boolean z, G0U<? super List<? extends Uri>, Unit> g0u, AHD<? extends Uri> ahd, boolean z2, G0U<? super Uri, Unit> g0u2) {
        super(1);
        this.$canAdd = z;
        this.$onAttachmentsPicked = g0u;
        this.$attachments = ahd;
        this.$enabled = z2;
        this.$onAttachmentRemoved = g0u2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
