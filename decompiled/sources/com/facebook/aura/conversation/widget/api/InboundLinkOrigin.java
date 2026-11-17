package com.facebook.aura.conversation.widget.api;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface InboundLinkOrigin {

    /* loaded from: classes2.dex */
    public final class HomeScreenWidget implements InboundLinkOrigin {
        public static final int $stable = 0;
        public static final HomeScreenWidget INSTANCE = new HomeScreenWidget();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof HomeScreenWidget);
        }

        public String toString() {
            return "HomeScreenWidget";
        }

        public int hashCode() {
            return 2111927527;
        }
    }

    /* loaded from: classes3.dex */
    public final class MetaApp extends C06G implements InboundLinkOrigin {
        public static final int $stable = 0;
        public final InboundLinkOpener opener;

        public MetaApp(InboundLinkOpener inboundLinkOpener) {
            C7384Etj.A0Y(inboundLinkOpener, 0);
            this.opener = inboundLinkOpener;
        }

        public final MetaApp copy(InboundLinkOpener inboundLinkOpener) {
            C7384Etj.A0Y(inboundLinkOpener, 0);
            return new MetaApp(inboundLinkOpener);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof MetaApp) && this.opener == ((MetaApp) obj).opener);
        }

        public static /* synthetic */ MetaApp copy$default(MetaApp metaApp, InboundLinkOpener inboundLinkOpener, int i, Object obj) {
            if ((i & 1) != 0) {
                inboundLinkOpener = metaApp.opener;
            }
            C7384Etj.A0Y(inboundLinkOpener, 0);
            return new MetaApp(inboundLinkOpener);
        }

        public final InboundLinkOpener component1() {
            return this.opener;
        }

        public final InboundLinkOpener getOpener() {
            return this.opener;
        }

        public int hashCode() {
            return this.opener.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes2.dex */
    public final class Notification implements InboundLinkOrigin {
        public static final int $stable = 0;
        public static final Notification INSTANCE = new Notification();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Notification);
        }

        public String toString() {
            return "Notification";
        }

        public int hashCode() {
            return -745664125;
        }
    }
}
