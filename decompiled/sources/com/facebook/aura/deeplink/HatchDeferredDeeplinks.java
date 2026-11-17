package com.facebook.aura.deeplink;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.HwN;
import android.net.Uri;

/* loaded from: classes.dex */
public final class HatchDeferredDeeplinks {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final BLG<Link> _awaitingActivation;
    public final C1BN<Link> awaitingActivation;

    public final class Link extends C06G {
        public static final int $stable = 8;
        public final String routeName;
        public final Uri uri;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Link) {
                    Link link = (Link) obj;
                    if (!C7384Etj.areEqual(this.uri, link.uri) || !C7384Etj.areEqual(this.routeName, link.routeName)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Link copy$default(Link link, Uri uri, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = link.uri;
            }
            if ((i & 2) != 0) {
                str = link.routeName;
            }
            AnonymousClass003.A0u(uri, str);
            return new Link(uri, str);
        }

        public final Uri component1() {
            return this.uri;
        }

        public final String component2() {
            return this.routeName;
        }

        public final String getRouteName() {
            return this.routeName;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.routeName, AnonymousClass005.A0E(this.uri));
        }

        public Link(Uri uri, String str) {
            AnonymousClass003.A0u(uri, str);
            this.uri = uri;
            this.routeName = str;
        }

        public final Link copy(Uri uri, String str) {
            AnonymousClass003.A0u(uri, str);
            return new Link(uri, str);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final void park$fbandroid_express_aura_java_com_facebook_aura_deeplink_deeplink(Link link) {
        C7384Etj.A0Y(link, 0);
        AnonymousClass002.A1I(this._awaitingActivation, link);
    }

    public final boolean take$fbandroid_express_aura_java_com_facebook_aura_deeplink_deeplink(Link link) {
        C7384Etj.A0Y(link, 0);
        return C9286GCn.A00(link, HwN.A01, (C9286GCn) this._awaitingActivation);
    }

    public final void drop$fbandroid_express_aura_java_com_facebook_aura_deeplink_deeplink() {
        this._awaitingActivation.Af8(null);
    }

    public final C1BN<Link> getAwaitingActivation() {
        return this.awaitingActivation;
    }

    public final class Companion {
        public final HatchDeferredDeeplinks getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchDeferredDeeplinks) abstractC3358CGz.A03(HatchDeferredDeeplinks.class, HatchDeferredDeeplinks$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchDeferredDeeplinks(C06H c06h) {
        this();
    }

    public HatchDeferredDeeplinks() {
        C9286GCn c9286GCn = new C9286GCn(HwN.A01);
        this._awaitingActivation = c9286GCn;
        this.awaitingActivation = new C3Pi(null, c9286GCn);
    }
}
