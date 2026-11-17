package com.facebook.aura.skills.model;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface ConnectorCatalogQuery {

    public final class Category extends C06G implements ConnectorCatalogQuery {
        public final String id;

        public Category(String str) {
            C7384Etj.A0Y(str, 0);
            this.id = str;
        }

        public final Category copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Category(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Category) && C7384Etj.areEqual(this.id, ((Category) obj).id));
        }

        public static /* synthetic */ Category copy$default(Category category, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = category.id;
            }
            C7384Etj.A0Y(str, 0);
            return new Category(str);
        }

        public final String component1() {
            return this.id;
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Search extends C06G implements ConnectorCatalogQuery {
        public final String categoryId;
        public final String query;

        public Search(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.query = str;
            this.categoryId = str2;
        }

        public final Search copy(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            return new Search(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Search) {
                    Search search = (Search) obj;
                    if (!C7384Etj.areEqual(this.query, search.query) || !C7384Etj.areEqual(this.categoryId, search.categoryId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Search copy$default(Search search, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = search.query;
            }
            if ((i & 2) != 0) {
                str2 = search.categoryId;
            }
            C7384Etj.A0Y(str, 0);
            return new Search(str, str2);
        }

        public final String component1() {
            return this.query;
        }

        public final String component2() {
            return this.categoryId;
        }

        public final String getCategoryId() {
            return this.categoryId;
        }

        public final String getQuery() {
            return this.query;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.query) + AnonymousClass006.A0G(this.categoryId);
        }

        public String toString() {
            return super.toString();
        }
    }
}
