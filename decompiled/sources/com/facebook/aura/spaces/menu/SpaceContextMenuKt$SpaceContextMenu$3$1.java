package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B1V;
import X.BFM;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class SpaceContextMenuKt$SpaceContextMenu$3$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, G0V<? super BFM, ? super Integer, ? extends Unit>> {
    public final /* synthetic */ Integer $audienceCount;
    public final /* synthetic */ boolean $multiplayer;
    public final /* synthetic */ String $slug;

    /* renamed from: com.facebook.aura.spaces.menu.SpaceContextMenuKt$SpaceContextMenu$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(2);
            this.$slug = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                SpaceCollaboratorCountKt.SpaceCollaboratorCount(this.$slug, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.SpaceContextMenuKt$SpaceContextMenu$3$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(2);
            this.$slug = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                SpaceCollaboratorCountKt.SpacePublishedStatus(this.$slug, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    @Override // X.G0U
    public final G0V<BFM, Integer, Unit> invoke(AuraContextMenuItem auraContextMenuItem) {
        Object anonymousClass2;
        int i;
        Integer num;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        int i2 = auraContextMenuItem.id;
        if (i2 != 0) {
            if (i2 != 10) {
                if (i2 != 11 || (num = this.$audienceCount) == null) {
                    return null;
                }
                return B1V.A01(new SpaceContextMenuKt$SpaceContextMenu$3$1$3$1(num.intValue()), -1769301001, true);
            }
            anonymousClass2 = new AnonymousClass1(this.$slug);
            i = 677201192;
        } else {
            if (!this.$multiplayer) {
                return null;
            }
            anonymousClass2 = new AnonymousClass2(this.$slug);
            i = 1147153324;
        }
        return B1V.A01(anonymousClass2, i, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceContextMenuKt$SpaceContextMenu$3$1(boolean z, Integer num, String str) {
        super(1);
        this.$multiplayer = z;
        this.$audienceCount = num;
        this.$slug = str;
    }
}
