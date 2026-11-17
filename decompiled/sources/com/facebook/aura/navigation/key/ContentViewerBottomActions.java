package com.facebook.aura.navigation.key;

import X.AGH;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ContentViewerBottomActions extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<String> actionIds;
    public final Map<String, String> analyticsMetadata;
    public final String ownerId;
    public final String subjectId;

    public final class Companion {
        public final C9hr<ContentViewerBottomActions> serializer() {
            return ContentViewerBottomActions$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1U(num, null, AbstractC5321DgF.A02(num, ContentViewerBottomActions$Companion$$childSerializers$1.INSTANCE), null, ContentViewerBottomActions$Companion$$childSerializers$2.INSTANCE);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContentViewerBottomActions) {
                ContentViewerBottomActions contentViewerBottomActions = (ContentViewerBottomActions) obj;
                if (!C7384Etj.areEqual(this.ownerId, contentViewerBottomActions.ownerId) || !C7384Etj.areEqual(this.actionIds, contentViewerBottomActions.actionIds) || !C7384Etj.areEqual(this.subjectId, contentViewerBottomActions.subjectId) || !C7384Etj.areEqual(this.analyticsMetadata, contentViewerBottomActions.analyticsMetadata)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ContentViewerBottomActions copy$default(ContentViewerBottomActions contentViewerBottomActions, String str, List list, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentViewerBottomActions.ownerId;
        }
        if ((i & 2) != 0) {
            list = contentViewerBottomActions.actionIds;
        }
        if ((i & 4) != 0) {
            str2 = contentViewerBottomActions.subjectId;
        }
        if ((i & 8) != 0) {
            map = contentViewerBottomActions.analyticsMetadata;
        }
        AnonymousClass005.A0y(str, list, map);
        return new ContentViewerBottomActions(str, list, str2, map);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(ContentViewerBottomActions contentViewerBottomActions, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(contentViewerBottomActions.ownerId, c9iZ, 0);
        c9j5.AAQ(contentViewerBottomActions.actionIds, C3cH.A15(f0cArr, 1), c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || contentViewerBottomActions.subjectId != null) {
            c9j5.AAP(contentViewerBottomActions.subjectId, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !C3cG.A1M(contentViewerBottomActions.analyticsMetadata)) {
            c9j5.AAQ(contentViewerBottomActions.analyticsMetadata, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
    }

    public final String component1() {
        return this.ownerId;
    }

    public final List<String> component2() {
        return this.actionIds;
    }

    public final String component3() {
        return this.subjectId;
    }

    public final Map<String, String> component4() {
        return this.analyticsMetadata;
    }

    public final List<String> getActionIds() {
        return this.actionIds;
    }

    public final Map<String, String> getAnalyticsMetadata() {
        return this.analyticsMetadata;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getSubjectId() {
        return this.subjectId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.analyticsMetadata, (AnonymousClass005.A0F(this.actionIds, AnonymousClass001.A0G(this.ownerId)) + AnonymousClass006.A0G(this.subjectId)) * 31);
    }

    public ContentViewerBottomActions(String str, List<String> list, String str2, Map<String, String> map) {
        AnonymousClass005.A0y(str, list, map);
        this.ownerId = str;
        this.actionIds = list;
        this.subjectId = str2;
        this.analyticsMetadata = map;
    }

    public final ContentViewerBottomActions copy(String str, List<String> list, String str2, Map<String, String> map) {
        AnonymousClass005.A0y(str, list, map);
        return new ContentViewerBottomActions(str, list, str2, map);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ContentViewerBottomActions(int i, String str, List list, String str2, Map map, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ContentViewerBottomActions$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.ownerId = str;
        this.actionIds = list;
        this.subjectId = C3cI.A0W(i, str2);
        if ((i & 8) == 0) {
            this.analyticsMetadata = AGH.A0E();
        } else {
            this.analyticsMetadata = map;
        }
    }

    public /* synthetic */ ContentViewerBottomActions(String str, List list, String str2, Map map, int i, C06H c06h) {
        this(str, list, AnonymousClass006.A0t(i, str2), C3cH.A0o(map, i & 8));
    }
}
