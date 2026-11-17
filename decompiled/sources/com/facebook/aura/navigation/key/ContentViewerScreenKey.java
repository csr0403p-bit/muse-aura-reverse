package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ContentViewerScreenKey extends C06G implements AuraFullScreenNavKey {
    public final ContentViewerBottomActions bottomActions;
    public final boolean forceDarkMode;
    public final boolean fullscreenSingleVideo;
    public final boolean interactiveDismissEnabled;
    public final ContentViewerTarget target;
    public final boolean usesPushTransition;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, ContentViewerScreenKey$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null};

    public final class Companion {
        public final C9hr<ContentViewerScreenKey> serializer() {
            return ContentViewerScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ContentViewerScreenKey(ContentViewerTarget contentViewerTarget, boolean z, boolean z2, boolean z3, ContentViewerBottomActions contentViewerBottomActions, boolean z4) {
        C7384Etj.A0Y(contentViewerTarget, 0);
        this.target = contentViewerTarget;
        this.forceDarkMode = z;
        this.interactiveDismissEnabled = z2;
        this.fullscreenSingleVideo = z3;
        this.bottomActions = contentViewerBottomActions;
        this.usesPushTransition = z4;
    }

    public final ContentViewerScreenKey copy(ContentViewerTarget contentViewerTarget, boolean z, boolean z2, boolean z3, ContentViewerBottomActions contentViewerBottomActions, boolean z4) {
        C7384Etj.A0Y(contentViewerTarget, 0);
        return new ContentViewerScreenKey(contentViewerTarget, z, z2, z3, contentViewerBottomActions, z4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContentViewerScreenKey) {
                ContentViewerScreenKey contentViewerScreenKey = (ContentViewerScreenKey) obj;
                if (!C7384Etj.areEqual(this.target, contentViewerScreenKey.target) || this.forceDarkMode != contentViewerScreenKey.forceDarkMode || this.interactiveDismissEnabled != contentViewerScreenKey.interactiveDismissEnabled || this.fullscreenSingleVideo != contentViewerScreenKey.fullscreenSingleVideo || !C7384Etj.areEqual(this.bottomActions, contentViewerScreenKey.bottomActions) || this.usesPushTransition != contentViewerScreenKey.usesPushTransition) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ContentViewerScreenKey copy$default(ContentViewerScreenKey contentViewerScreenKey, ContentViewerTarget contentViewerTarget, boolean z, boolean z2, boolean z3, ContentViewerBottomActions contentViewerBottomActions, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            contentViewerTarget = contentViewerScreenKey.target;
        }
        if ((i & 2) != 0) {
            z = contentViewerScreenKey.forceDarkMode;
        }
        if ((i & 4) != 0) {
            z2 = contentViewerScreenKey.interactiveDismissEnabled;
        }
        if ((i & 8) != 0) {
            z3 = contentViewerScreenKey.fullscreenSingleVideo;
        }
        if ((i & 16) != 0) {
            contentViewerBottomActions = contentViewerScreenKey.bottomActions;
        }
        if ((i & 32) != 0) {
            z4 = contentViewerScreenKey.usesPushTransition;
        }
        return contentViewerScreenKey.copy(contentViewerTarget, z, z2, z3, contentViewerBottomActions, z4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(ContentViewerScreenKey contentViewerScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(contentViewerScreenKey.target, C3cH.A15($childSerializers, 0), c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || contentViewerScreenKey.forceDarkMode) {
            c9j5.AA7(c9iZ, 1, contentViewerScreenKey.forceDarkMode);
        }
        if (zAfR || !contentViewerScreenKey.interactiveDismissEnabled) {
            c9j5.AA7(c9iZ, 2, contentViewerScreenKey.interactiveDismissEnabled);
        }
        if (zAfR || contentViewerScreenKey.fullscreenSingleVideo) {
            c9j5.AA7(c9iZ, 3, contentViewerScreenKey.fullscreenSingleVideo);
        }
        if (zAfR || contentViewerScreenKey.bottomActions != null) {
            c9j5.AAP(contentViewerScreenKey.bottomActions, ContentViewerBottomActions$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || contentViewerScreenKey.usesPushTransition) {
            c9j5.AA7(c9iZ, 5, contentViewerScreenKey.usesPushTransition);
        }
    }

    public final ContentViewerTarget component1() {
        return this.target;
    }

    public final boolean component2() {
        return this.forceDarkMode;
    }

    public final boolean component3() {
        return this.interactiveDismissEnabled;
    }

    public final boolean component4() {
        return this.fullscreenSingleVideo;
    }

    public final ContentViewerBottomActions component5() {
        return this.bottomActions;
    }

    public final boolean component6() {
        return this.usesPushTransition;
    }

    public final ContentViewerBottomActions getBottomActions() {
        return this.bottomActions;
    }

    public final boolean getForceDarkMode() {
        return this.forceDarkMode;
    }

    public final boolean getFullscreenSingleVideo() {
        return this.fullscreenSingleVideo;
    }

    public final boolean getInteractiveDismissEnabled() {
        return this.interactiveDismissEnabled;
    }

    public final ContentViewerTarget getTarget() {
        return this.target;
    }

    public final boolean getUsesPushTransition() {
        return this.usesPushTransition;
    }

    public int hashCode() {
        return C0KA.A00((C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0E(this.target), this.forceDarkMode), this.interactiveDismissEnabled), this.fullscreenSingleVideo) + AnonymousClass006.A0D(this.bottomActions)) * 31, this.usesPushTransition);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ContentViewerScreenKey(ContentViewerTarget contentViewerTarget, boolean z, boolean z2, boolean z3, ContentViewerBottomActions contentViewerBottomActions, boolean z4, int i, C06H c06h) {
        this(contentViewerTarget, AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? true : z2, AnonymousClass005.A1P(i, z3), (i & 16) != 0 ? null : contentViewerBottomActions, AnonymousClass002.A1R(i, z4));
    }

    public /* synthetic */ ContentViewerScreenKey(int i, ContentViewerTarget contentViewerTarget, boolean z, boolean z2, boolean z3, ContentViewerBottomActions contentViewerBottomActions, boolean z4, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ContentViewerScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.target = contentViewerTarget;
        if ((i & 2) == 0) {
            this.forceDarkMode = false;
        } else {
            this.forceDarkMode = z;
        }
        if ((i & 4) == 0) {
            this.interactiveDismissEnabled = true;
        } else {
            this.interactiveDismissEnabled = z2;
        }
        if ((i & 8) == 0) {
            this.fullscreenSingleVideo = false;
        } else {
            this.fullscreenSingleVideo = z3;
        }
        if ((i & 16) == 0) {
            this.bottomActions = null;
        } else {
            this.bottomActions = contentViewerBottomActions;
        }
        if ((i & 32) == 0) {
            this.usesPushTransition = false;
        } else {
            this.usesPushTransition = z4;
        }
    }
}
