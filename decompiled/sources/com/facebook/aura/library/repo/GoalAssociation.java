package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface GoalAssociation {

    /* renamed from: com.facebook.aura.library.repo.GoalAssociation$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static boolean $default$isActionable(GoalAssociation goalAssociation) {
            return !(goalAssociation instanceof Cron);
        }

        public static /* synthetic */ boolean access$isActionable$jd(GoalAssociation goalAssociation) {
            return !(goalAssociation instanceof Cron);
        }
    }

    public final class Cron extends C06G implements GoalAssociation {
        public final String associationId;
        public final String createdAt;
        public final String cronId;
        public final String imageUrl;
        public final String schedule;
        public final String status;
        public final String subtitle;
        public final String title;
        public final String updatedAt;

        public static /* synthetic */ Cron copy$default(Cron cron, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
            String str10 = str;
            String str11 = str2;
            String str12 = str3;
            String str13 = str4;
            String str14 = str5;
            String str15 = str6;
            String str16 = str7;
            String str17 = str8;
            String str18 = str9;
            if ((i & 1) != 0) {
                str10 = cron.associationId;
            }
            if ((i & 2) != 0) {
                str11 = cron.cronId;
            }
            if ((i & 4) != 0) {
                str12 = cron.schedule;
            }
            if ((i & 8) != 0) {
                str13 = cron.status;
            }
            if ((i & 16) != 0) {
                str14 = cron.title;
            }
            if ((i & 32) != 0) {
                str15 = cron.subtitle;
            }
            if ((i & 64) != 0) {
                str16 = cron.imageUrl;
            }
            if ((i & 128) != 0) {
                str17 = cron.createdAt;
            }
            if ((i & 256) != 0) {
                str18 = cron.updatedAt;
            }
            AnonymousClass003.A0u(str10, str11);
            return new Cron(str10, str11, str12, str13, str14, str15, str16, str17, str18);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Cron) {
                    Cron cron = (Cron) obj;
                    if (!C7384Etj.areEqual(this.associationId, cron.associationId) || !C7384Etj.areEqual(this.cronId, cron.cronId) || !C7384Etj.areEqual(this.schedule, cron.schedule) || !C7384Etj.areEqual(this.status, cron.status) || !C7384Etj.areEqual(this.title, cron.title) || !C7384Etj.areEqual(this.subtitle, cron.subtitle) || !C7384Etj.areEqual(this.imageUrl, cron.imageUrl) || !C7384Etj.areEqual(this.createdAt, cron.createdAt) || !C7384Etj.areEqual(this.updatedAt, cron.updatedAt)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.associationId;
        }

        public final String component2() {
            return this.cronId;
        }

        public final String component3() {
            return this.schedule;
        }

        public final String component4() {
            return this.status;
        }

        public final String component5() {
            return this.title;
        }

        public final String component6() {
            return this.subtitle;
        }

        public final String component7() {
            return this.imageUrl;
        }

        public final String component8() {
            return this.createdAt;
        }

        public final String component9() {
            return this.updatedAt;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getAssociationId() {
            return this.associationId;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getCreatedAt() {
            return this.createdAt;
        }

        public final String getCronId() {
            return this.cronId;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getImageUrl() {
            return this.imageUrl;
        }

        public final String getSchedule() {
            return this.schedule;
        }

        public final String getStatus() {
            return this.status;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getTitle() {
            return this.title;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public int hashCode() {
            return ((((((((((((AnonymousClass005.A0I(this.cronId, AnonymousClass001.A0G(this.associationId)) + AnonymousClass006.A0G(this.schedule)) * 31) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.imageUrl)) * 31) + AnonymousClass006.A0G(this.createdAt)) * 31) + AnonymousClass005.A0H(this.updatedAt);
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public /* bridge */ boolean isActionable() {
            return !(this instanceof Cron);
        }

        public Cron(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            AnonymousClass003.A0u(str, str2);
            this.associationId = str;
            this.cronId = str2;
            this.schedule = str3;
            this.status = str4;
            this.title = str5;
            this.subtitle = str6;
            this.imageUrl = str7;
            this.createdAt = str8;
            this.updatedAt = str9;
        }

        public final Cron copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            AnonymousClass003.A0u(str, str2);
            return new Cron(str, str2, str3, str4, str5, str6, str7, str8, str9);
        }

        public String toString() {
            return super.toString();
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static boolean isActionable(GoalAssociation goalAssociation) {
            return !(goalAssociation instanceof Cron);
        }
    }

    public final class Document extends C06G implements GoalAssociation {
        public final String associationId;
        public final String createdAt;
        public final String imageUrl;
        public final String path;
        public final String subtitle;
        public final String title;
        public final String updatedAt;

        public static /* synthetic */ Document copy$default(Document document, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            String str8 = str;
            String str9 = str2;
            String str10 = str3;
            String str11 = str4;
            String str12 = str5;
            String str13 = str6;
            String str14 = str7;
            if ((i & 1) != 0) {
                str8 = document.associationId;
            }
            if ((i & 2) != 0) {
                str9 = document.path;
            }
            if ((i & 4) != 0) {
                str10 = document.title;
            }
            if ((i & 8) != 0) {
                str11 = document.subtitle;
            }
            if ((i & 16) != 0) {
                str12 = document.imageUrl;
            }
            if ((i & 32) != 0) {
                str13 = document.createdAt;
            }
            if ((i & 64) != 0) {
                str14 = document.updatedAt;
            }
            AnonymousClass003.A0u(str8, str9);
            return new Document(str8, str9, str10, str11, str12, str13, str14);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Document) {
                    Document document = (Document) obj;
                    if (!C7384Etj.areEqual(this.associationId, document.associationId) || !C7384Etj.areEqual(this.path, document.path) || !C7384Etj.areEqual(this.title, document.title) || !C7384Etj.areEqual(this.subtitle, document.subtitle) || !C7384Etj.areEqual(this.imageUrl, document.imageUrl) || !C7384Etj.areEqual(this.createdAt, document.createdAt) || !C7384Etj.areEqual(this.updatedAt, document.updatedAt)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.associationId;
        }

        public final String component2() {
            return this.path;
        }

        public final String component3() {
            return this.title;
        }

        public final String component4() {
            return this.subtitle;
        }

        public final String component5() {
            return this.imageUrl;
        }

        public final String component6() {
            return this.createdAt;
        }

        public final String component7() {
            return this.updatedAt;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getAssociationId() {
            return this.associationId;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getCreatedAt() {
            return this.createdAt;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getImageUrl() {
            return this.imageUrl;
        }

        public final String getPath() {
            return this.path;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getTitle() {
            return this.title;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public int hashCode() {
            return ((((((((AnonymousClass005.A0I(this.path, AnonymousClass001.A0G(this.associationId)) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.imageUrl)) * 31) + AnonymousClass006.A0G(this.createdAt)) * 31) + AnonymousClass005.A0H(this.updatedAt);
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public /* bridge */ boolean isActionable() {
            return true;
        }

        public Document(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            AnonymousClass003.A0u(str, str2);
            this.associationId = str;
            this.path = str2;
            this.title = str3;
            this.subtitle = str4;
            this.imageUrl = str5;
            this.createdAt = str6;
            this.updatedAt = str7;
        }

        public final Document copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            AnonymousClass003.A0u(str, str2);
            return new Document(str, str2, str3, str4, str5, str6, str7);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Space extends C06G implements GoalAssociation {
        public final String associationId;
        public final String createdAt;
        public final String imageUrl;
        public final String slug;
        public final String subtitle;
        public final String title;
        public final String updatedAt;

        public static /* synthetic */ Space copy$default(Space space, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            String str8 = str;
            String str9 = str2;
            String str10 = str3;
            String str11 = str4;
            String str12 = str5;
            String str13 = str6;
            String str14 = str7;
            if ((i & 1) != 0) {
                str8 = space.associationId;
            }
            if ((i & 2) != 0) {
                str9 = space.slug;
            }
            if ((i & 4) != 0) {
                str10 = space.title;
            }
            if ((i & 8) != 0) {
                str11 = space.subtitle;
            }
            if ((i & 16) != 0) {
                str12 = space.imageUrl;
            }
            if ((i & 32) != 0) {
                str13 = space.createdAt;
            }
            if ((i & 64) != 0) {
                str14 = space.updatedAt;
            }
            AnonymousClass003.A0u(str8, str9);
            return new Space(str8, str9, str10, str11, str12, str13, str14);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Space) {
                    Space space = (Space) obj;
                    if (!C7384Etj.areEqual(this.associationId, space.associationId) || !C7384Etj.areEqual(this.slug, space.slug) || !C7384Etj.areEqual(this.title, space.title) || !C7384Etj.areEqual(this.subtitle, space.subtitle) || !C7384Etj.areEqual(this.imageUrl, space.imageUrl) || !C7384Etj.areEqual(this.createdAt, space.createdAt) || !C7384Etj.areEqual(this.updatedAt, space.updatedAt)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.associationId;
        }

        public final String component2() {
            return this.slug;
        }

        public final String component3() {
            return this.title;
        }

        public final String component4() {
            return this.subtitle;
        }

        public final String component5() {
            return this.imageUrl;
        }

        public final String component6() {
            return this.createdAt;
        }

        public final String component7() {
            return this.updatedAt;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getAssociationId() {
            return this.associationId;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getCreatedAt() {
            return this.createdAt;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getImageUrl() {
            return this.imageUrl;
        }

        public final String getSlug() {
            return this.slug;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getTitle() {
            return this.title;
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public int hashCode() {
            return ((((((((AnonymousClass005.A0I(this.slug, AnonymousClass001.A0G(this.associationId)) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.imageUrl)) * 31) + AnonymousClass006.A0G(this.createdAt)) * 31) + AnonymousClass005.A0H(this.updatedAt);
        }

        @Override // com.facebook.aura.library.repo.GoalAssociation
        public /* bridge */ boolean isActionable() {
            return true;
        }

        public Space(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            AnonymousClass003.A0u(str, str2);
            this.associationId = str;
            this.slug = str2;
            this.title = str3;
            this.subtitle = str4;
            this.imageUrl = str5;
            this.createdAt = str6;
            this.updatedAt = str7;
        }

        public final Space copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            AnonymousClass003.A0u(str, str2);
            return new Space(str, str2, str3, str4, str5, str6, str7);
        }

        public String toString() {
            return super.toString();
        }
    }

    String getAssociationId();

    String getCreatedAt();

    String getImageUrl();

    String getSubtitle();

    String getTitle();

    String getUpdatedAt();

    boolean isActionable();
}
