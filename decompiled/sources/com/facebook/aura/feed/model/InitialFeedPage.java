package com.facebook.aura.feed.model;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.feed.repo.FeedCursorPage;
import com.facebook.aura.feed.repo.FeedPage;

/* loaded from: classes3.dex */
public interface InitialFeedPage {

    public final class Cursor extends C06G implements InitialFeedPage {
        public static final int $stable = 0;
        public final FeedCursorPage page;

        public Cursor(FeedCursorPage feedCursorPage) {
            C7384Etj.A0Y(feedCursorPage, 0);
            this.page = feedCursorPage;
        }

        public final Cursor copy(FeedCursorPage feedCursorPage) {
            C7384Etj.A0Y(feedCursorPage, 0);
            return new Cursor(feedCursorPage);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Cursor) && C7384Etj.areEqual(this.page, ((Cursor) obj).page));
        }

        public static /* synthetic */ Cursor copy$default(Cursor cursor, FeedCursorPage feedCursorPage, int i, Object obj) {
            if ((i & 1) != 0) {
                feedCursorPage = cursor.page;
            }
            C7384Etj.A0Y(feedCursorPage, 0);
            return new Cursor(feedCursorPage);
        }

        public final FeedCursorPage component1() {
            return this.page;
        }

        public final FeedCursorPage getPage() {
            return this.page;
        }

        public int hashCode() {
            return this.page.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Infinite extends C06G implements InitialFeedPage {
        public static final int $stable = 0;
        public final FeedPage page;

        public Infinite(FeedPage feedPage) {
            C7384Etj.A0Y(feedPage, 0);
            this.page = feedPage;
        }

        public final Infinite copy(FeedPage feedPage) {
            C7384Etj.A0Y(feedPage, 0);
            return new Infinite(feedPage);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Infinite) && C7384Etj.areEqual(this.page, ((Infinite) obj).page));
        }

        public static /* synthetic */ Infinite copy$default(Infinite infinite, FeedPage feedPage, int i, Object obj) {
            if ((i & 1) != 0) {
                feedPage = infinite.page;
            }
            C7384Etj.A0Y(feedPage, 0);
            return new Infinite(feedPage);
        }

        public final FeedPage component1() {
            return this.page;
        }

        public final FeedPage getPage() {
            return this.page;
        }

        public int hashCode() {
            return this.page.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
