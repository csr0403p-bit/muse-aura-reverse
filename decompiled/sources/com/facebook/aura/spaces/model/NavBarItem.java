package com.facebook.aura.spaces.model;

import X.C06H;
import X.C7384Etj;
import com.facebook.aura.navigation.key.SpaceNavigationIdKt;
import com.facebook.aura.spaces.repo.SpaceCard;

/* loaded from: classes.dex */
public abstract class NavBarItem {

    public final class BuiltInItem extends NavBarItem {
        public final String displayTitle;
        public final String id;
        public final boolean isPinnable;
        public final BuiltInItemType type;

        public BuiltInItem(BuiltInItemType builtInItemType) {
            C7384Etj.A0Y(builtInItemType, 0);
            this.type = builtInItemType;
            this.id = builtInItemType.getId();
            this.displayTitle = builtInItemType.getDisplayTitle();
            this.isPinnable = true;
        }

        public final BuiltInItem copy(BuiltInItemType builtInItemType) {
            C7384Etj.A0Y(builtInItemType, 0);
            return new BuiltInItem(builtInItemType);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof BuiltInItem) && this.type == ((BuiltInItem) obj).type);
        }

        public static /* synthetic */ BuiltInItem copy$default(BuiltInItem builtInItem, BuiltInItemType builtInItemType, int i, Object obj) {
            if ((i & 1) != 0) {
                builtInItemType = builtInItem.type;
            }
            C7384Etj.A0Y(builtInItemType, 0);
            return new BuiltInItem(builtInItemType);
        }

        public final BuiltInItemType component1() {
            return this.type;
        }

        @Override // com.facebook.aura.spaces.model.NavBarItem
        public String getDisplayTitle() {
            return this.displayTitle;
        }

        @Override // com.facebook.aura.spaces.model.NavBarItem
        public String getId() {
            return this.id;
        }

        public final BuiltInItemType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // com.facebook.aura.spaces.model.NavBarItem
        public boolean isPinnable() {
            return this.isPinnable;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ChatItem extends NavBarItem {
        public static final ChatItem INSTANCE = new ChatItem();
        public static final String displayTitle = "Chat";
        public static final String id = "chat";
        public static final boolean isPinnable = false;

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatItem);
        }

        @Override // com.facebook.aura.spaces.model.NavBarItem
        public String getDisplayTitle() {
            return displayTitle;
        }

        @Override // com.facebook.aura.spaces.model.NavBarItem
        public String getId() {
            return id;
        }

        @Override // com.facebook.aura.spaces.model.NavBarItem
        public boolean isPinnable() {
            return isPinnable;
        }

        public String toString() {
            return "ChatItem";
        }

        public int hashCode() {
            return 258867776;
        }
    }

    public final class SpaceItem extends NavBarItem {
        public final String displayTitle;
        public final String id;
        public final boolean isPinnable;
        public final SpaceCard spaceCard;

        public SpaceItem(SpaceCard spaceCard) {
            C7384Etj.A0Y(spaceCard, 0);
            this.spaceCard = spaceCard;
            this.id = SpaceNavigationIdKt.spaceNavigationId(spaceCard.id);
            this.displayTitle = spaceCard.title;
            this.isPinnable = true;
        }

        public final SpaceItem copy(SpaceCard spaceCard) {
            C7384Etj.A0Y(spaceCard, 0);
            return new SpaceItem(spaceCard);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SpaceItem) && C7384Etj.areEqual(this.spaceCard, ((SpaceItem) obj).spaceCard));
        }

        public static /* synthetic */ SpaceItem copy$default(SpaceItem spaceItem, SpaceCard spaceCard, int i, Object obj) {
            if ((i & 1) != 0) {
                spaceCard = spaceItem.spaceCard;
            }
            C7384Etj.A0Y(spaceCard, 0);
            return new SpaceItem(spaceCard);
        }

        public final SpaceCard component1() {
            return this.spaceCard;
        }

        @Override // com.facebook.aura.spaces.model.NavBarItem
        public String getDisplayTitle() {
            return this.displayTitle;
        }

        @Override // com.facebook.aura.spaces.model.NavBarItem
        public String getId() {
            return this.id;
        }

        public final SpaceCard getSpaceCard() {
            return this.spaceCard;
        }

        public int hashCode() {
            return this.spaceCard.hashCode();
        }

        @Override // com.facebook.aura.spaces.model.NavBarItem
        public boolean isPinnable() {
            return this.isPinnable;
        }

        public String toString() {
            return super.toString();
        }
    }

    public abstract String getDisplayTitle();

    public abstract String getId();

    public abstract boolean isPinnable();

    public /* synthetic */ NavBarItem(C06H c06h) {
    }

    public NavBarItem() {
    }
}
