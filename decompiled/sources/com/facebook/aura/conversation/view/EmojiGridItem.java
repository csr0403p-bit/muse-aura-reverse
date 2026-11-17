package com.facebook.aura.conversation.view;

import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public abstract class EmojiGridItem {

    public final class Emoji extends EmojiGridItem {
        public static final int $stable = 0;
        public final String emoji;

        public Emoji(String str) {
            C7384Etj.A0Y(str, 0);
            this.emoji = str;
        }

        public final Emoji copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Emoji(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Emoji) && C7384Etj.areEqual(this.emoji, ((Emoji) obj).emoji));
        }

        public static /* synthetic */ Emoji copy$default(Emoji emoji, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = emoji.emoji;
            }
            C7384Etj.A0Y(str, 0);
            return new Emoji(str);
        }

        public final String component1() {
            return this.emoji;
        }

        public final String getEmoji() {
            return this.emoji;
        }

        public int hashCode() {
            return this.emoji.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Header extends EmojiGridItem {
        public static final int $stable = 0;
        public final String title;

        public Header(String str) {
            C7384Etj.A0Y(str, 0);
            this.title = str;
        }

        public final Header copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Header(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Header) && C7384Etj.areEqual(this.title, ((Header) obj).title));
        }

        public static /* synthetic */ Header copy$default(Header header, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = header.title;
            }
            C7384Etj.A0Y(str, 0);
            return new Header(str);
        }

        public final String component1() {
            return this.title;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ EmojiGridItem(C06H c06h) {
    }

    public EmojiGridItem() {
    }
}
