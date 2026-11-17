package com.facebook.aura.tabs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.navigation.key.DemotedTabScreenKey;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import com.facebook.aura.navigation.key.SpaceNavigationIdKt;
import com.facebook.aura.navigation.key.SpaceTabScreenKey;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public interface AuraTabItem {

    /* renamed from: com.facebook.aura.tabs.AuraTabItem$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static boolean $default$isOpen(AuraTabItem auraTabItem, AuraTabRootNavKey auraTabRootNavKey, AuraNavKey auraNavKey) {
            Object modalNavKey;
            PeerSpaceScreenKey peerSpaceScreenKey;
            Object obj;
            if (auraNavKey instanceof SpacesModalScreenKey) {
                if (!(auraTabItem instanceof Space)) {
                    return false;
                }
                modalNavKey = ((Space) auraTabItem).artifact.itemKey;
                obj = ((SpacesModalScreenKey) auraNavKey).slug;
            } else if (auraNavKey instanceof PeerSpaceScreenKey) {
                if (!(auraTabItem instanceof Space) || (peerSpaceScreenKey = AuraTabLayoutKt.toPeerSpaceScreenKey(((Space) auraTabItem).artifact)) == null) {
                    return false;
                }
                PeerSpaceScreenKey peerSpaceScreenKey2 = (PeerSpaceScreenKey) auraNavKey;
                if (!C7384Etj.areEqual(peerSpaceScreenKey.hostMuse, peerSpaceScreenKey2.hostMuse)) {
                    return false;
                }
                modalNavKey = peerSpaceScreenKey.spaceId;
                obj = peerSpaceScreenKey2.spaceId;
            } else {
                if (!(auraNavKey instanceof DemotedTabScreenKey)) {
                    return auraTabItem.matches(auraTabRootNavKey);
                }
                if (!(auraTabItem instanceof Fixed)) {
                    return false;
                }
                modalNavKey = ((Fixed) auraTabItem).tab.getModalNavKey();
                obj = auraNavKey;
            }
            return C7384Etj.areEqual(modalNavKey, obj);
        }

        public static boolean $default$matches(AuraTabItem auraTabItem, AuraTabRootNavKey auraTabRootNavKey) {
            if (auraTabItem instanceof Fixed) {
                return ((Fixed) auraTabItem).tab.matches(auraTabRootNavKey);
            }
            if (auraTabItem instanceof Space) {
                return (auraTabRootNavKey instanceof SpaceTabScreenKey) && C7384Etj.areEqual(((SpaceTabScreenKey) auraTabRootNavKey).slug, ((Space) auraTabItem).artifact.itemKey);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final class Fixed extends C06G implements AuraTabItem {
        public static final int $stable = 0;
        public final String id;
        public final FixedTab tab;

        public Fixed(FixedTab fixedTab) {
            C7384Etj.A0Y(fixedTab, 0);
            this.tab = fixedTab;
            this.id = fixedTab.getNavigationId();
        }

        public final Fixed copy(FixedTab fixedTab) {
            C7384Etj.A0Y(fixedTab, 0);
            return new Fixed(fixedTab);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Fixed) && this.tab == ((Fixed) obj).tab);
        }

        public static /* synthetic */ Fixed copy$default(Fixed fixed, FixedTab fixedTab, int i, Object obj) {
            if ((i & 1) != 0) {
                fixedTab = fixed.tab;
            }
            C7384Etj.A0Y(fixedTab, 0);
            return new Fixed(fixedTab);
        }

        public final FixedTab component1() {
            return this.tab;
        }

        @Override // com.facebook.aura.tabs.AuraTabItem
        public String getId() {
            return this.id;
        }

        public final FixedTab getTab() {
            return this.tab;
        }

        public int hashCode() {
            return this.tab.hashCode();
        }

        @Override // com.facebook.aura.tabs.AuraTabItem
        public /* bridge */ boolean isOpen(AuraTabRootNavKey auraTabRootNavKey, AuraNavKey auraNavKey) {
            return CC.$default$isOpen(this, auraTabRootNavKey, auraNavKey);
        }

        @Override // com.facebook.aura.tabs.AuraTabItem
        public /* bridge */ boolean matches(AuraTabRootNavKey auraTabRootNavKey) {
            return CC.$default$matches(this, auraTabRootNavKey);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Space extends C06G implements AuraTabItem {
        public static final int $stable = 0;
        public final ArtifactItem artifact;
        public final String id;
        public final boolean isLoading;

        public Space(ArtifactItem artifactItem, boolean z) {
            C7384Etj.A0Y(artifactItem, 0);
            this.artifact = artifactItem;
            this.isLoading = z;
            this.id = SpaceNavigationIdKt.spaceNavigationId(artifactItem.itemKey);
        }

        public final Space copy(ArtifactItem artifactItem, boolean z) {
            C7384Etj.A0Y(artifactItem, 0);
            return new Space(artifactItem, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Space) {
                    Space space = (Space) obj;
                    if (!C7384Etj.areEqual(this.artifact, space.artifact) || this.isLoading != space.isLoading) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Space copy$default(Space space, ArtifactItem artifactItem, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                artifactItem = space.artifact;
            }
            if ((i & 2) != 0) {
                z = space.isLoading;
            }
            C7384Etj.A0Y(artifactItem, 0);
            return new Space(artifactItem, z);
        }

        public final ArtifactItem component1() {
            return this.artifact;
        }

        public final boolean component2() {
            return this.isLoading;
        }

        public final ArtifactItem getArtifact() {
            return this.artifact;
        }

        @Override // com.facebook.aura.tabs.AuraTabItem
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0E(this.artifact), this.isLoading);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        @Override // com.facebook.aura.tabs.AuraTabItem
        public /* bridge */ boolean isOpen(AuraTabRootNavKey auraTabRootNavKey, AuraNavKey auraNavKey) {
            return CC.$default$isOpen(this, auraTabRootNavKey, auraNavKey);
        }

        @Override // com.facebook.aura.tabs.AuraTabItem
        public /* bridge */ boolean matches(AuraTabRootNavKey auraTabRootNavKey) {
            return CC.$default$matches(this, auraTabRootNavKey);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Space(ArtifactItem artifactItem, boolean z, int i, C06H c06h) {
            this(artifactItem, AnonymousClass001.A1Q(i, z));
        }
    }

    String getId();

    boolean isOpen(AuraTabRootNavKey auraTabRootNavKey, AuraNavKey auraNavKey);

    boolean matches(AuraTabRootNavKey auraTabRootNavKey);

    public abstract class DefaultImpls {
        @Deprecated
        public static boolean isOpen(AuraTabItem auraTabItem, AuraTabRootNavKey auraTabRootNavKey, AuraNavKey auraNavKey) {
            return CC.$default$isOpen(auraTabItem, auraTabRootNavKey, auraNavKey);
        }

        @Deprecated
        public static boolean matches(AuraTabItem auraTabItem, AuraTabRootNavKey auraTabRootNavKey) {
            return CC.$default$matches(auraTabItem, auraTabRootNavKey);
        }
    }
}
