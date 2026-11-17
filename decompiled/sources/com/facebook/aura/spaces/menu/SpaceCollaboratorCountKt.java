package com.facebook.aura.spaces.menu;

import X.AbstractC07539Wl;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C1822Arm;
import X.C7384Etj;
import X.F60;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.library.repo.ArtifactSharingInfo;
import com.facebook.aura.library.repo.ArtifactSharingRecipient;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class SpaceCollaboratorCountKt {
    public static final String MUSE_PRINCIPAL_PREFIX = "muse:";
    public static final String PUBLIC_SHARING_STATE = "public";

    /* renamed from: com.facebook.aura.spaces.menu.SpaceCollaboratorCountKt$SpaceCollaboratorCount$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$slug = str;
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
            SpaceCollaboratorCountKt.SpaceCollaboratorCount(this.$slug, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.SpaceCollaboratorCountKt$SpaceCollaboratorCount$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$slug = str;
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
            SpaceCollaboratorCountKt.SpaceCollaboratorCount(this.$slug, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.SpaceCollaboratorCountKt$SpaceMenuTrailingValue$1, reason: invalid class name and case insensitive filesystem */
    public final class C138961 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138961(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
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
            SpaceCollaboratorCountKt.SpaceMenuTrailingValue(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.SpaceCollaboratorCountKt$SpacePublishedStatus$1, reason: invalid class name and case insensitive filesystem */
    public final class C138971 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138971(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$slug = str;
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
            SpaceCollaboratorCountKt.SpacePublishedStatus(this.$slug, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.SpaceCollaboratorCountKt$SpacePublishedStatus$2, reason: invalid class name and case insensitive filesystem */
    public final class C138982 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138982(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$slug = str;
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
            SpaceCollaboratorCountKt.SpacePublishedStatus(this.$slug, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void SpaceCollaboratorCount(String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass2;
        ArtifactSharingInfo artifactSharingInfo;
        int museCollaboratorCount;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1445232320);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            UnifiedArtifact unifiedArtifactRememberSpaceCatalogEntry = SpaceContextMenuKt.rememberSpaceCatalogEntry(str, bfm, iA0d & 14);
            if (unifiedArtifactRememberSpaceCatalogEntry == null || (artifactSharingInfo = unifiedArtifactRememberSpaceCatalogEntry.sharing) == null || (museCollaboratorCount = getMuseCollaboratorCount(artifactSharingInfo)) < 1) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass2 = new AnonymousClass1(str, bRg, i, i2);
                    bBbAAc.A06 = anonymousClass2;
                }
                return;
            }
            SpaceMenuTrailingValue(AnonymousClass007.A0Y(museCollaboratorCount, bfm, R.plurals._name_removed__res_0x7f10001e), AbstractC07539Wl.A00(bRg, "hatch-space-collaborator-count"), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(str, bRg, i, i2);
            bBbAAc.A06 = anonymousClass2;
        }
    }

    public static final void SpacePublishedStatus(String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c138982;
        ArtifactSharingInfo artifactSharingInfo;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1186693417);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            UnifiedArtifact unifiedArtifactRememberSpaceCatalogEntry = SpaceContextMenuKt.rememberSpaceCatalogEntry(str, bfm, iA0d & 14);
            if (unifiedArtifactRememberSpaceCatalogEntry == null || (artifactSharingInfo = unifiedArtifactRememberSpaceCatalogEntry.sharing) == null || !isPublished(artifactSharingInfo)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c138982 = new C138971(str, bRg, i, i2);
                    bBbAAc.A06 = c138982;
                }
                return;
            }
            SpaceMenuTrailingValue(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120610), AbstractC07539Wl.A00(bRg, "hatch-space-share-link-published"), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c138982 = new C138982(str, bRg, i, i2);
            bBbAAc.A06 = c138982;
        }
    }

    public static final int getMuseCollaboratorCount(ArtifactSharingInfo artifactSharingInfo) {
        int i = 0;
        C7384Etj.A0Y(artifactSharingInfo, 0);
        List<ArtifactSharingRecipient> list = artifactSharingInfo.recipients;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<ArtifactSharingRecipient> it = list.iterator();
            while (it.hasNext()) {
                if (AnonymousClass005.A1a(it.next().principal, "muse:") && (i = i + 1) < 0) {
                    AbstractC0885AGm.A13();
                    throw F60.createAndThrow();
                }
            }
        }
        return i;
    }

    public static final boolean isPublished(ArtifactSharingInfo artifactSharingInfo) {
        C7384Etj.A0Y(artifactSharingInfo, 0);
        return "public".equals(artifactSharingInfo.state);
    }

    public static final void SpaceMenuTrailingValue(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1495550867);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C06G.A08(bfm), C1822Arm.A00(null, C06G.A0T(bfm), null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, SpaceMenuPresentationKt.SpaceMenuRowLineHeight), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 126, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138961(str, bRg2, i, i2);
        }
    }
}
