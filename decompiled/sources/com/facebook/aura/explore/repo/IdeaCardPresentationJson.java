package com.facebook.aura.explore.repo;

import X.AbstractC2159Azp;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.model.TextWithButtonPresentationJsonKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class IdeaCardPresentationJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String actionLabel;
    public final List<IdeaBadgeJson> badges;
    public final IdeaDisplayBadgeJson display_badge;
    public final MediaRefJson icon;
    public final List<IdeaLabelJson> labels;
    public final MediaRefJson previewImage;

    public final class Companion {
        public final C9hr<IdeaCardPresentationJson> serializer() {
            return IdeaCardPresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, AbstractC5321DgF.A02(num, IdeaCardPresentationJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, IdeaCardPresentationJson$Companion$$childSerializers$2.INSTANCE), null, null};
    }

    public final IdeaCardPresentationJson copy(MediaRefJson mediaRefJson, MediaRefJson mediaRefJson2, List<IdeaLabelJson> list, List<IdeaBadgeJson> list2, IdeaDisplayBadgeJson ideaDisplayBadgeJson, String str) {
        AnonymousClass002.A1B(list, 2, list2);
        C7384Etj.A0Y(str, 5);
        return new IdeaCardPresentationJson(mediaRefJson, mediaRefJson2, list, list2, ideaDisplayBadgeJson, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardPresentationJson) {
                IdeaCardPresentationJson ideaCardPresentationJson = (IdeaCardPresentationJson) obj;
                if (!C7384Etj.areEqual(this.previewImage, ideaCardPresentationJson.previewImage) || !C7384Etj.areEqual(this.icon, ideaCardPresentationJson.icon) || !C7384Etj.areEqual(this.labels, ideaCardPresentationJson.labels) || !C7384Etj.areEqual(this.badges, ideaCardPresentationJson.badges) || !C7384Etj.areEqual(this.display_badge, ideaCardPresentationJson.display_badge) || !C7384Etj.areEqual(this.actionLabel, ideaCardPresentationJson.actionLabel)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdeaCardPresentationJson copy$default(IdeaCardPresentationJson ideaCardPresentationJson, MediaRefJson mediaRefJson, MediaRefJson mediaRefJson2, List list, List list2, IdeaDisplayBadgeJson ideaDisplayBadgeJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaRefJson = ideaCardPresentationJson.previewImage;
        }
        if ((i & 2) != 0) {
            mediaRefJson2 = ideaCardPresentationJson.icon;
        }
        if ((i & 4) != 0) {
            list = ideaCardPresentationJson.labels;
        }
        if ((i & 8) != 0) {
            list2 = ideaCardPresentationJson.badges;
        }
        if ((i & 16) != 0) {
            ideaDisplayBadgeJson = ideaCardPresentationJson.display_badge;
        }
        if ((i & 32) != 0) {
            str = ideaCardPresentationJson.actionLabel;
        }
        return ideaCardPresentationJson.copy(mediaRefJson, mediaRefJson2, list, list2, ideaDisplayBadgeJson, str);
    }

    private final String labelText(String str) {
        IdeaLabelJson next;
        String str2;
        Iterator<IdeaLabelJson> it = this.labels.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC2159Azp.A12(next.role, str, true)) {
                break;
            }
        }
        IdeaLabelJson ideaLabelJson = next;
        if (ideaLabelJson == null || (str2 = ideaLabelJson.text) == null || str2.length() <= 0) {
            return null;
        }
        return str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaCardPresentationJson ideaCardPresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || ideaCardPresentationJson.previewImage != null) {
            c9j5.AAP(ideaCardPresentationJson.previewImage, MediaRefJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || ideaCardPresentationJson.icon != null) {
            c9j5.AAP(ideaCardPresentationJson.icon, MediaRefJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(ideaCardPresentationJson.labels)) {
            c9j5.AAQ(ideaCardPresentationJson.labels, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(ideaCardPresentationJson.badges)) {
            c9j5.AAQ(ideaCardPresentationJson.badges, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || ideaCardPresentationJson.display_badge != null) {
            c9j5.AAP(ideaCardPresentationJson.display_badge, IdeaDisplayBadgeJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || !C3cH.A1Q(ideaCardPresentationJson.actionLabel)) {
            c9j5.AAV(ideaCardPresentationJson.actionLabel, c9iZ, 5);
        }
    }

    public final List<String> badgeTexts() {
        List<IdeaBadgeJson> list = this.badges;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<IdeaBadgeJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().text);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it2 = arrayListA0i.iterator();
        while (it2.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it2);
        }
        return arrayListA0h;
    }

    public final MediaRefJson component1() {
        return this.previewImage;
    }

    public final MediaRefJson component2() {
        return this.icon;
    }

    public final List<IdeaLabelJson> component3() {
        return this.labels;
    }

    public final List<IdeaBadgeJson> component4() {
        return this.badges;
    }

    public final IdeaDisplayBadgeJson component5() {
        return this.display_badge;
    }

    public final String component6() {
        return this.actionLabel;
    }

    public final String displayBadgeText() {
        String str;
        IdeaDisplayBadgeJson ideaDisplayBadgeJson = this.display_badge;
        if (ideaDisplayBadgeJson == null || (str = ideaDisplayBadgeJson.text) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public final String getActionLabel() {
        return this.actionLabel;
    }

    public final List<IdeaBadgeJson> getBadges() {
        return this.badges;
    }

    public final IdeaDisplayBadgeJson getDisplay_badge() {
        return this.display_badge;
    }

    public final MediaRefJson getIcon() {
        return this.icon;
    }

    public final List<IdeaLabelJson> getLabels() {
        return this.labels;
    }

    public final MediaRefJson getPreviewImage() {
        return this.previewImage;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.actionLabel, (AnonymousClass005.A0F(this.badges, AnonymousClass005.A0F(this.labels, ((AnonymousClass006.A0D(this.previewImage) * 31) + AnonymousClass006.A0D(this.icon)) * 31)) + C3cH.A02(this.display_badge)) * 31);
    }

    public final String iconMimeType() {
        MediaVariantJson mediaVariantJsonFirstVariant;
        String str;
        MediaRefJson mediaRefJson = this.icon;
        if (mediaRefJson == null || (mediaVariantJsonFirstVariant = mediaRefJson.firstVariant()) == null || (str = mediaVariantJsonFirstVariant.mimeType) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public final String iconUrl() {
        MediaRefJson mediaRefJson = this.icon;
        if (mediaRefJson != null) {
            return mediaRefJson.firstUrl();
        }
        return null;
    }

    public final String primaryLabel() {
        return labelText(TextWithButtonPresentationJsonKt.TEXT_WITH_BUTTON_STYLE_PRIMARY);
    }

    public final String secondaryLabel() {
        return labelText("secondary");
    }

    public /* synthetic */ IdeaCardPresentationJson(int i, MediaRefJson mediaRefJson, MediaRefJson mediaRefJson2, List list, List list2, IdeaDisplayBadgeJson ideaDisplayBadgeJson, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.previewImage = null;
        } else {
            this.previewImage = mediaRefJson;
        }
        if ((i & 2) == 0) {
            this.icon = null;
        } else {
            this.icon = mediaRefJson2;
        }
        if ((i & 4) == 0) {
            this.labels = C0881AGi.A00;
        } else {
            this.labels = list;
        }
        if ((i & 8) == 0) {
            this.badges = C0881AGi.A00;
        } else {
            this.badges = list2;
        }
        if ((i & 16) == 0) {
            this.display_badge = null;
        } else {
            this.display_badge = ideaDisplayBadgeJson;
        }
        if ((i & 32) == 0) {
            this.actionLabel = "";
        } else {
            this.actionLabel = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public IdeaCardPresentationJson(MediaRefJson mediaRefJson, MediaRefJson mediaRefJson2, List<IdeaLabelJson> list, List<IdeaBadgeJson> list2, IdeaDisplayBadgeJson ideaDisplayBadgeJson, String str) {
        AnonymousClass002.A1B(list, 2, list2);
        C7384Etj.A0Y(str, 5);
        this.previewImage = mediaRefJson;
        this.icon = mediaRefJson2;
        this.labels = list;
        this.badges = list2;
        this.display_badge = ideaDisplayBadgeJson;
        this.actionLabel = str;
    }

    public /* synthetic */ IdeaCardPresentationJson(MediaRefJson mediaRefJson, MediaRefJson mediaRefJson2, List list, List list2, IdeaDisplayBadgeJson ideaDisplayBadgeJson, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : mediaRefJson, (i & 2) != 0 ? null : mediaRefJson2, (i & 4) != 0 ? C0881AGi.A00 : list, (i & 8) != 0 ? C0881AGi.A00 : list2, (i & 16) != 0 ? null : ideaDisplayBadgeJson, (i & 32) != 0 ? "" : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IdeaCardPresentationJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(null, null, c0881AGi, c0881AGi, null, "");
    }
}
