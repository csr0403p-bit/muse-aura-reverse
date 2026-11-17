package com.facebook.aura.explore.repo;

import X.C06G;
import X.C7384Etj;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes.dex */
public interface ExploreJarvisPath extends JarvisPath.Extension {

    public final class IdeaCard extends C06G implements ExploreJarvisPath {
        public final String id;

        public IdeaCard(String str) {
            C7384Etj.A0Y(str, 0);
            this.id = str;
        }

        public final IdeaCard copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new IdeaCard(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof IdeaCard) && C7384Etj.areEqual(this.id, ((IdeaCard) obj).id));
        }

        public static /* synthetic */ IdeaCard copy$default(IdeaCard ideaCard, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ideaCard.id;
            }
            C7384Etj.A0Y(str, 0);
            return new IdeaCard(str);
        }

        public final String component1() {
            return this.id;
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0M("api/idea-cards/", this.id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class IdeaCardExecute extends C06G implements ExploreJarvisPath {
        public final String id;

        public IdeaCardExecute(String str) {
            C7384Etj.A0Y(str, 0);
            this.id = str;
        }

        public final IdeaCardExecute copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new IdeaCardExecute(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof IdeaCardExecute) && C7384Etj.areEqual(this.id, ((IdeaCardExecute) obj).id));
        }

        public static /* synthetic */ IdeaCardExecute copy$default(IdeaCardExecute ideaCardExecute, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ideaCardExecute.id;
            }
            C7384Etj.A0Y(str, 0);
            return new IdeaCardExecute(str);
        }

        public final String component1() {
            return this.id;
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("api/idea-cards/", this.id, "/execute");
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class IdeaCardShare extends C06G implements ExploreJarvisPath {
        public final String id;

        public IdeaCardShare(String str) {
            C7384Etj.A0Y(str, 0);
            this.id = str;
        }

        public final IdeaCardShare copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new IdeaCardShare(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof IdeaCardShare) && C7384Etj.areEqual(this.id, ((IdeaCardShare) obj).id));
        }

        public static /* synthetic */ IdeaCardShare copy$default(IdeaCardShare ideaCardShare, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ideaCardShare.id;
            }
            C7384Etj.A0Y(str, 0);
            return new IdeaCardShare(str);
        }

        public final String component1() {
            return this.id;
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("api/idea-cards/", Uri.encode(this.id), "/share");
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class IdeaCards implements ExploreJarvisPath {
        public static final IdeaCards INSTANCE = new IdeaCards();
        public static final String value = "api/idea-cards";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof IdeaCards);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "IdeaCards";
        }

        public int hashCode() {
            return -1561867222;
        }
    }

    public final class IdeaEngagement extends C06G implements ExploreJarvisPath {
        public final String ideaId;

        public IdeaEngagement(String str) {
            C7384Etj.A0Y(str, 0);
            this.ideaId = str;
        }

        public final IdeaEngagement copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new IdeaEngagement(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof IdeaEngagement) && C7384Etj.areEqual(this.ideaId, ((IdeaEngagement) obj).ideaId));
        }

        public static /* synthetic */ IdeaEngagement copy$default(IdeaEngagement ideaEngagement, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ideaEngagement.ideaId;
            }
            C7384Etj.A0Y(str, 0);
            return new IdeaEngagement(str);
        }

        public final String component1() {
            return this.ideaId;
        }

        public final String getIdeaId() {
            return this.ideaId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("api/ideas/", this.ideaId, "/engagement");
        }

        public int hashCode() {
            return this.ideaId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
