package com.facebook.aura.sharesheet;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.sharesheet.AvatarSharePage;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class AvatarSharePages extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final AvatarSharePages Empty;
    public final AHD<AvatarSharePage.Dance> dances;
    public final AHD<AvatarSharePage.Intro> intros;

    public final class Companion {
        public final AvatarSharePages getEmpty() {
            return AvatarSharePages.Empty;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarSharePages) {
                AvatarSharePages avatarSharePages = (AvatarSharePages) obj;
                if (!C7384Etj.areEqual(this.dances, avatarSharePages.dances) || !C7384Etj.areEqual(this.intros, avatarSharePages.intros)) {
                }
            }
            return false;
        }
        return true;
    }

    public final AHD<AvatarSharePage> pagesFor(AvatarShareTab avatarShareTab) {
        int iA0E = AnonymousClass001.A0E(avatarShareTab, 0);
        if (iA0E == 0) {
            return this.dances;
        }
        if (iA0E == 1) {
            return this.intros;
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarShareTab.values().length];
            try {
                AnonymousClass002.A13(AvatarShareTab.Dances, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AvatarShareTab.Intros, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        AHI ahi = AHI.A01;
        Empty = new AvatarSharePages(ahi, ahi);
    }

    public static /* synthetic */ AvatarSharePages copy$default(AvatarSharePages avatarSharePages, AHD ahd, AHD ahd2, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = avatarSharePages.dances;
        }
        if ((i & 2) != 0) {
            ahd2 = avatarSharePages.intros;
        }
        AnonymousClass003.A0u(ahd, ahd2);
        return new AvatarSharePages(ahd, ahd2);
    }

    public final AHD<AvatarSharePage.Dance> component1() {
        return this.dances;
    }

    public final AHD<AvatarSharePage.Intro> component2() {
        return this.intros;
    }

    public final AHD<AvatarSharePage.Dance> getDances() {
        return this.dances;
    }

    public final AHD<AvatarSharePage.Intro> getIntros() {
        return this.intros;
    }

    public final boolean getShowsTabs() {
        return (this.dances.isEmpty() || this.intros.isEmpty()) ? false : true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.intros, AnonymousClass005.A0E(this.dances));
    }

    public AvatarSharePages(AHD<AvatarSharePage.Dance> ahd, AHD<AvatarSharePage.Intro> ahd2) {
        AnonymousClass003.A0u(ahd, ahd2);
        this.dances = ahd;
        this.intros = ahd2;
    }

    public final AvatarSharePages copy(AHD<AvatarSharePage.Dance> ahd, AHD<AvatarSharePage.Intro> ahd2) {
        AnonymousClass003.A0u(ahd, ahd2);
        return new AvatarSharePages(ahd, ahd2);
    }

    public final AvatarShareTab resolveTab(AvatarShareTab avatarShareTab) {
        return (!getShowsTabs() || avatarShareTab == null) ? !this.dances.isEmpty() ? AvatarShareTab.Dances : AvatarShareTab.Intros : avatarShareTab;
    }

    public String toString() {
        return super.toString();
    }
}
