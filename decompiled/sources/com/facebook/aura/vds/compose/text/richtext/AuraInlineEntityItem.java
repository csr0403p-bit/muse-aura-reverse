package com.facebook.aura.vds.compose.text.richtext;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class AuraInlineEntityItem {
    public static final int $stable = 8;

    public final class Citation extends AuraInlineEntityItem {
        public static final int $stable = 8;
        public final String contentId;
        public final String faviconUrl;
        public final List<String> groupedUrls;
        public final Integer icon;
        public final int index;
        public final int length;
        public final AuraSourceType sourceType;
        public final String text;
        public final String url;

        public final Citation copy(int i, int i2, String str, String str2, Integer num, String str3, List<String> list, String str4, AuraSourceType auraSourceType) {
            C7384Etj.A0Y(str, 2);
            AnonymousClass002.A1D(str2, 3, str3);
            return new Citation(i, i2, str, str2, num, str3, list, str4, auraSourceType);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Citation) {
                    Citation citation = (Citation) obj;
                    if (this.index != citation.index || this.length != citation.length || !C7384Etj.areEqual(this.text, citation.text) || !C7384Etj.areEqual(this.url, citation.url) || !C7384Etj.areEqual(this.icon, citation.icon) || !C7384Etj.areEqual(this.contentId, citation.contentId) || !C7384Etj.areEqual(this.groupedUrls, citation.groupedUrls) || !C7384Etj.areEqual(this.faviconUrl, citation.faviconUrl) || this.sourceType != citation.sourceType) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ Citation(int i, int i2, String str, String str2, Integer num, String str3, List list, String str4, AuraSourceType auraSourceType, int i3, C06H c06h) {
            this(i, i2, str, str2, (i3 & 16) != 0 ? null : num, str3, (i3 & 64) != 0 ? null : list, (i3 & 128) != 0 ? null : str4, (i3 & 256) != 0 ? null : auraSourceType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Citation copy$default(Citation citation, int i, int i2, String str, String str2, Integer num, String str3, List list, String str4, AuraSourceType auraSourceType, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = citation.index;
            }
            if ((i3 & 2) != 0) {
                i2 = citation.length;
            }
            if ((i3 & 4) != 0) {
                str = citation.text;
            }
            if ((i3 & 8) != 0) {
                str2 = citation.url;
            }
            if ((i3 & 16) != 0) {
                num = citation.icon;
            }
            if ((i3 & 32) != 0) {
                str3 = citation.contentId;
            }
            if ((i3 & 64) != 0) {
                list = citation.groupedUrls;
            }
            if ((i3 & 128) != 0) {
                str4 = citation.faviconUrl;
            }
            if ((i3 & 256) != 0) {
                auraSourceType = citation.sourceType;
            }
            return citation.copy(i, i2, str, str2, num, str3, list, str4, auraSourceType);
        }

        public final int component1() {
            return this.index;
        }

        public final int component2() {
            return this.length;
        }

        public final String component3() {
            return this.text;
        }

        public final String component4() {
            return this.url;
        }

        public final Integer component5() {
            return this.icon;
        }

        public final String component6() {
            return this.contentId;
        }

        public final List<String> component7() {
            return this.groupedUrls;
        }

        public final String component8() {
            return this.faviconUrl;
        }

        public final AuraSourceType component9() {
            return this.sourceType;
        }

        @Override // com.facebook.aura.vds.compose.text.richtext.AuraInlineEntityItem
        public String getContentId() {
            return this.contentId;
        }

        public final String getFaviconUrl() {
            return this.faviconUrl;
        }

        public final List<String> getGroupedUrls() {
            return this.groupedUrls;
        }

        public final Integer getIcon() {
            return this.icon;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getLength() {
            return this.length;
        }

        public final AuraSourceType getSourceType() {
            return this.sourceType;
        }

        public final String getText() {
            return this.text;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return ((((AnonymousClass005.A0I(this.contentId, (AnonymousClass005.A0I(this.url, AnonymousClass005.A0I(this.text, ((this.index * 31) + this.length) * 31)) + AnonymousClass006.A0D(this.icon)) * 31) + AnonymousClass006.A0D(this.groupedUrls)) * 31) + AnonymousClass006.A0G(this.faviconUrl)) * 31) + C3cH.A02(this.sourceType);
        }

        public String toString() {
            return super.toString();
        }

        public Citation(int i, int i2, String str, String str2, Integer num, String str3, List<String> list, String str4, AuraSourceType auraSourceType) {
            C7384Etj.A0Y(str, 2);
            AnonymousClass002.A1D(str2, 3, str3);
            this.index = i;
            this.length = i2;
            this.text = str;
            this.url = str2;
            this.icon = num;
            this.contentId = str3;
            this.groupedUrls = list;
            this.faviconUrl = str4;
            this.sourceType = auraSourceType;
        }
    }

    public final class Deeplink extends AuraInlineEntityItem {
        public static final int $stable = 0;
        public final String contentId;
        public final String deeplink;
        public final int index;
        public final int length;
        public final String text;

        public Deeplink(int i, int i2, String str, String str2, String str3) {
            AnonymousClass005.A12(str, str2, str3, 2);
            this.index = i;
            this.length = i2;
            this.text = str;
            this.deeplink = str2;
            this.contentId = str3;
        }

        public final Deeplink copy(int i, int i2, String str, String str2, String str3) {
            AnonymousClass005.A12(str, str2, str3, 2);
            return new Deeplink(i, i2, str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Deeplink) {
                    Deeplink deeplink = (Deeplink) obj;
                    if (this.index != deeplink.index || this.length != deeplink.length || !C7384Etj.areEqual(this.text, deeplink.text) || !C7384Etj.areEqual(this.deeplink, deeplink.deeplink) || !C7384Etj.areEqual(this.contentId, deeplink.contentId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Deeplink copy$default(Deeplink deeplink, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = deeplink.index;
            }
            if ((i3 & 2) != 0) {
                i2 = deeplink.length;
            }
            if ((i3 & 4) != 0) {
                str = deeplink.text;
            }
            if ((i3 & 8) != 0) {
                str2 = deeplink.deeplink;
            }
            if ((i3 & 16) != 0) {
                str3 = deeplink.contentId;
            }
            return deeplink.copy(i, i2, str, str2, str3);
        }

        public final int component1() {
            return this.index;
        }

        public final int component2() {
            return this.length;
        }

        public final String component3() {
            return this.text;
        }

        public final String component4() {
            return this.deeplink;
        }

        public final String component5() {
            return this.contentId;
        }

        @Override // com.facebook.aura.vds.compose.text.richtext.AuraInlineEntityItem
        public String getContentId() {
            return this.contentId;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getLength() {
            return this.length;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.contentId, AnonymousClass005.A0I(this.deeplink, AnonymousClass005.A0I(this.text, ((this.index * 31) + this.length) * 31)));
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Latex extends AuraInlineEntityItem {
        public static final int $stable = 0;
        public final Float fontHeight;
        public final float height;
        public final String key;
        public final String latexExpression;
        public final String url;
        public final float width;

        public static /* synthetic */ Latex copy$default(Latex latex, String str, String str2, float f, float f2, Float f3, String str3, int i, Object obj) {
            String str4 = str;
            String str5 = str2;
            float f4 = f;
            float f5 = f2;
            Float f6 = f3;
            String str6 = str3;
            if ((i & 1) != 0) {
                str4 = latex.key;
            }
            if ((i & 2) != 0) {
                str5 = latex.url;
            }
            if ((i & 4) != 0) {
                f4 = latex.width;
            }
            if ((i & 8) != 0) {
                f5 = latex.height;
            }
            if ((i & 16) != 0) {
                f6 = latex.fontHeight;
            }
            if ((i & 32) != 0) {
                str6 = latex.latexExpression;
            }
            AnonymousClass003.A0u(str4, str5);
            return new Latex(str4, str5, f4, f5, f6, str6);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Latex) {
                    Latex latex = (Latex) obj;
                    if (!C7384Etj.areEqual(this.key, latex.key) || !C7384Etj.areEqual(this.url, latex.url) || Float.compare(this.width, latex.width) != 0 || Float.compare(this.height, latex.height) != 0 || !C7384Etj.areEqual(this.fontHeight, latex.fontHeight) || !C7384Etj.areEqual(this.latexExpression, latex.latexExpression)) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ Latex(String str, String str2, float f, float f2, Float f3, String str3, int i, C06H c06h) {
            this(str, str2, f, f2, f3, (i & 32) != 0 ? null : str3);
        }

        public final String component1() {
            return this.key;
        }

        public final String component2() {
            return this.url;
        }

        public final float component3() {
            return this.width;
        }

        public final float component4() {
            return this.height;
        }

        public final Float component5() {
            return this.fontHeight;
        }

        public final String component6() {
            return this.latexExpression;
        }

        @Override // com.facebook.aura.vds.compose.text.richtext.AuraInlineEntityItem
        public String getContentId() {
            return this.key;
        }

        public final Float getFontHeight() {
            return this.fontHeight;
        }

        public final float getHeight() {
            return this.height;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getLatexExpression() {
            return this.latexExpression;
        }

        public final String getUrl() {
            return this.url;
        }

        public final float getWidth() {
            return this.width;
        }

        public int hashCode() {
            return ((AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0I(this.url, AnonymousClass001.A0G(this.key)), this.width), this.height) + AnonymousClass006.A0D(this.fontHeight)) * 31) + AnonymousClass005.A0H(this.latexExpression);
        }

        public final Latex copy(String str, String str2, float f, float f2, Float f3, String str3) {
            AnonymousClass003.A0u(str, str2);
            return new Latex(str, str2, f, f2, f3, str3);
        }

        public String toString() {
            return super.toString();
        }

        public Latex(String str, String str2, float f, float f2, Float f3, String str3) {
            AnonymousClass003.A0u(str, str2);
            this.key = str;
            this.url = str2;
            this.width = f;
            this.height = f2;
            this.fontHeight = f3;
            this.latexExpression = str3;
        }
    }

    public final class PlaceEntity extends AuraInlineEntityItem {
        public static final int $stable = 0;
        public final String contentId;
        public final String imageUrl;
        public final int index;
        public final int length;
        public final String name;
        public final String placeId;

        public PlaceEntity(int i, int i2, String str, String str2, String str3, String str4) {
            C7384Etj.A0Y(str, 2);
            AnonymousClass002.A1D(str2, 3, str4);
            this.index = i;
            this.length = i2;
            this.placeId = str;
            this.name = str2;
            this.imageUrl = str3;
            this.contentId = str4;
        }

        public final PlaceEntity copy(int i, int i2, String str, String str2, String str3, String str4) {
            C7384Etj.A0Y(str, 2);
            AnonymousClass002.A1D(str2, 3, str4);
            return new PlaceEntity(i, i2, str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PlaceEntity) {
                    PlaceEntity placeEntity = (PlaceEntity) obj;
                    if (this.index != placeEntity.index || this.length != placeEntity.length || !C7384Etj.areEqual(this.placeId, placeEntity.placeId) || !C7384Etj.areEqual(this.name, placeEntity.name) || !C7384Etj.areEqual(this.imageUrl, placeEntity.imageUrl) || !C7384Etj.areEqual(this.contentId, placeEntity.contentId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PlaceEntity copy$default(PlaceEntity placeEntity, int i, int i2, String str, String str2, String str3, String str4, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = placeEntity.index;
            }
            if ((i3 & 2) != 0) {
                i2 = placeEntity.length;
            }
            if ((i3 & 4) != 0) {
                str = placeEntity.placeId;
            }
            if ((i3 & 8) != 0) {
                str2 = placeEntity.name;
            }
            if ((i3 & 16) != 0) {
                str3 = placeEntity.imageUrl;
            }
            if ((i3 & 32) != 0) {
                str4 = placeEntity.contentId;
            }
            return placeEntity.copy(i, i2, str, str2, str3, str4);
        }

        public final int component1() {
            return this.index;
        }

        public final int component2() {
            return this.length;
        }

        public final String component3() {
            return this.placeId;
        }

        public final String component4() {
            return this.name;
        }

        public final String component5() {
            return this.imageUrl;
        }

        public final String component6() {
            return this.contentId;
        }

        @Override // com.facebook.aura.vds.compose.text.richtext.AuraInlineEntityItem
        public String getContentId() {
            return this.contentId;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getLength() {
            return this.length;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPlaceId() {
            return this.placeId;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.contentId, (AnonymousClass005.A0I(this.name, AnonymousClass005.A0I(this.placeId, ((this.index * 31) + this.length) * 31)) + AnonymousClass006.A0G(this.imageUrl)) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SocialEntity extends AuraInlineEntityItem {
        public static final int $stable = 0;
        public final String contentId;
        public final String displayName;
        public final int index;
        public final int length;
        public final String profilePictureUrl;
        public final String userId;
        public final String username;

        public SocialEntity(int i, int i2, String str, String str2, String str3, String str4, String str5) {
            AnonymousClass002.A1B(str, 2, str2);
            AnonymousClass003.A0z(str4, str5);
            this.index = i;
            this.length = i2;
            this.userId = str;
            this.username = str2;
            this.displayName = str3;
            this.profilePictureUrl = str4;
            this.contentId = str5;
        }

        public final SocialEntity copy(int i, int i2, String str, String str2, String str3, String str4, String str5) {
            AnonymousClass002.A1B(str, 2, str2);
            AnonymousClass003.A0z(str4, str5);
            return new SocialEntity(i, i2, str, str2, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SocialEntity) {
                    SocialEntity socialEntity = (SocialEntity) obj;
                    if (this.index != socialEntity.index || this.length != socialEntity.length || !C7384Etj.areEqual(this.userId, socialEntity.userId) || !C7384Etj.areEqual(this.username, socialEntity.username) || !C7384Etj.areEqual(this.displayName, socialEntity.displayName) || !C7384Etj.areEqual(this.profilePictureUrl, socialEntity.profilePictureUrl) || !C7384Etj.areEqual(this.contentId, socialEntity.contentId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SocialEntity copy$default(SocialEntity socialEntity, int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = socialEntity.index;
            }
            if ((i3 & 2) != 0) {
                i2 = socialEntity.length;
            }
            if ((i3 & 4) != 0) {
                str = socialEntity.userId;
            }
            if ((i3 & 8) != 0) {
                str2 = socialEntity.username;
            }
            if ((i3 & 16) != 0) {
                str3 = socialEntity.displayName;
            }
            if ((i3 & 32) != 0) {
                str4 = socialEntity.profilePictureUrl;
            }
            if ((i3 & 64) != 0) {
                str5 = socialEntity.contentId;
            }
            return socialEntity.copy(i, i2, str, str2, str3, str4, str5);
        }

        public final int component1() {
            return this.index;
        }

        public final int component2() {
            return this.length;
        }

        public final String component3() {
            return this.userId;
        }

        public final String component4() {
            return this.username;
        }

        public final String component5() {
            return this.displayName;
        }

        public final String component6() {
            return this.profilePictureUrl;
        }

        public final String component7() {
            return this.contentId;
        }

        @Override // com.facebook.aura.vds.compose.text.richtext.AuraInlineEntityItem
        public String getContentId() {
            return this.contentId;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getLength() {
            return this.length;
        }

        public final String getProfilePictureUrl() {
            return this.profilePictureUrl;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.contentId, AnonymousClass005.A0I(this.profilePictureUrl, (AnonymousClass005.A0I(this.username, AnonymousClass005.A0I(this.userId, ((this.index * 31) + this.length) * 31)) + AnonymousClass006.A0G(this.displayName)) * 31));
        }

        public String toString() {
            return super.toString();
        }
    }

    public abstract String getContentId();

    public /* synthetic */ AuraInlineEntityItem(C06H c06h) {
    }

    public AuraInlineEntityItem() {
    }
}
