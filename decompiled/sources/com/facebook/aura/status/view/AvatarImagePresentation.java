package com.facebook.aura.status.view;

import X.AWA;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7197Ei9;
import X.C7384Etj;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;

/* loaded from: classes4.dex */
public final class AvatarImagePresentation extends C06G {
    public final Float idleCropTopFraction;
    public final AWA idleImageSize;
    public final C7197Ei9 options;
    public final AuraDrawableSource source;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarImagePresentation) {
                AvatarImagePresentation avatarImagePresentation = (AvatarImagePresentation) obj;
                if (!C7384Etj.areEqual(this.source, avatarImagePresentation.source) || !C7384Etj.areEqual(this.options, avatarImagePresentation.options) || !C7384Etj.areEqual(this.idleImageSize, avatarImagePresentation.idleImageSize) || !C7384Etj.areEqual(this.idleCropTopFraction, avatarImagePresentation.idleCropTopFraction)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-EFwzd8w$default, reason: not valid java name */
    public static /* synthetic */ AvatarImagePresentation m2212copyEFwzd8w$default(AvatarImagePresentation avatarImagePresentation, AuraDrawableSource auraDrawableSource, C7197Ei9 c7197Ei9, AWA awa, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            auraDrawableSource = avatarImagePresentation.source;
        }
        if ((i & 2) != 0) {
            c7197Ei9 = avatarImagePresentation.options;
        }
        if ((i & 4) != 0) {
            awa = avatarImagePresentation.idleImageSize;
        }
        if ((i & 8) != 0) {
            f = avatarImagePresentation.idleCropTopFraction;
        }
        AnonymousClass003.A0u(auraDrawableSource, c7197Ei9);
        return new AvatarImagePresentation(auraDrawableSource, c7197Ei9, awa, f);
    }

    public final AuraDrawableSource component1() {
        return this.source;
    }

    public final C7197Ei9 component2() {
        return this.options;
    }

    /* renamed from: component3-VsRJwc0, reason: not valid java name */
    public final AWA m2213component3VsRJwc0() {
        return this.idleImageSize;
    }

    public final Float component4() {
        return this.idleCropTopFraction;
    }

    public final Float getIdleCropTopFraction() {
        return this.idleCropTopFraction;
    }

    /* renamed from: getIdleImageSize-VsRJwc0, reason: not valid java name */
    public final AWA m2215getIdleImageSizeVsRJwc0() {
        return this.idleImageSize;
    }

    public final C7197Ei9 getOptions() {
        return this.options;
    }

    public final AuraDrawableSource getSource() {
        return this.source;
    }

    public int hashCode() {
        int iA0F = AnonymousClass005.A0F(this.options, AnonymousClass005.A0E(this.source));
        AWA awa = this.idleImageSize;
        return ((iA0F + (awa == null ? 0 : AnonymousClass002.A0A(awa.A00))) * 31) + C3cH.A02(this.idleCropTopFraction);
    }

    public AvatarImagePresentation(AuraDrawableSource auraDrawableSource, C7197Ei9 c7197Ei9, AWA awa, Float f) {
        AnonymousClass003.A0u(auraDrawableSource, c7197Ei9);
        this.source = auraDrawableSource;
        this.options = c7197Ei9;
        this.idleImageSize = awa;
        this.idleCropTopFraction = f;
    }

    /* renamed from: copy-EFwzd8w, reason: not valid java name */
    public final AvatarImagePresentation m2214copyEFwzd8w(AuraDrawableSource auraDrawableSource, C7197Ei9 c7197Ei9, AWA awa, Float f) {
        AnonymousClass003.A0u(auraDrawableSource, c7197Ei9);
        return new AvatarImagePresentation(auraDrawableSource, c7197Ei9, awa, f);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AvatarImagePresentation(AuraDrawableSource auraDrawableSource, C7197Ei9 c7197Ei9, AWA awa, Float f, C06H c06h) {
        this(auraDrawableSource, c7197Ei9, awa, f);
    }
}
