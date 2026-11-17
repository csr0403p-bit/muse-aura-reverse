package com.facebook.aura.spaces.menu;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchScreen;

/* loaded from: classes.dex */
public interface SpaceMenuLogOrigin {

    public final class ChatCard extends C06G implements SpaceMenuLogOrigin {
        public static final int $stable = 0;
        public final HatchScreen screen;
        public final String spaceId;

        public ChatCard(HatchScreen hatchScreen, String str) {
            C7384Etj.A0Y(hatchScreen, 0);
            this.screen = hatchScreen;
            this.spaceId = str;
        }

        public final ChatCard copy(HatchScreen hatchScreen, String str) {
            C7384Etj.A0Y(hatchScreen, 0);
            return new ChatCard(hatchScreen, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ChatCard) {
                    ChatCard chatCard = (ChatCard) obj;
                    if (this.screen != chatCard.screen || !C7384Etj.areEqual(this.spaceId, chatCard.spaceId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ChatCard copy$default(ChatCard chatCard, HatchScreen hatchScreen, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchScreen = chatCard.screen;
            }
            if ((i & 2) != 0) {
                str = chatCard.spaceId;
            }
            C7384Etj.A0Y(hatchScreen, 0);
            return new ChatCard(hatchScreen, str);
        }

        public final HatchScreen component1() {
            return this.screen;
        }

        public final String component2() {
            return this.spaceId;
        }

        public final HatchScreen getScreen() {
            return this.screen;
        }

        public final String getSpaceId() {
            return this.spaceId;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.screen) + AnonymousClass006.A0G(this.spaceId);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LibraryRow implements SpaceMenuLogOrigin {
        public static final int $stable = 0;
        public static final LibraryRow INSTANCE = new LibraryRow();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LibraryRow);
        }

        public String toString() {
            return "LibraryRow";
        }

        public int hashCode() {
            return 813836330;
        }
    }

    public final class SpacePage extends C06G implements SpaceMenuLogOrigin {
        public static final int $stable = 0;
        public final String spaceId;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SpacePage) && C7384Etj.areEqual(this.spaceId, ((SpacePage) obj).spaceId));
        }

        public static /* synthetic */ SpacePage copy$default(SpacePage spacePage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = spacePage.spaceId;
            }
            return new SpacePage(str);
        }

        public final String component1() {
            return this.spaceId;
        }

        public final SpacePage copy(String str) {
            return new SpacePage(str);
        }

        public final String getSpaceId() {
            return this.spaceId;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.spaceId);
        }

        public SpacePage(String str) {
            this.spaceId = str;
        }

        public String toString() {
            return super.toString();
        }
    }
}
