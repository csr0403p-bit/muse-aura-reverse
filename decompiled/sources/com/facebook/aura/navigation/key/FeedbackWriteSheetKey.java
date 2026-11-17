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
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class FeedbackWriteSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final String entityId;
    public final String entityType;
    public final Map<String, String> metadata;
    public final String surface;
    public final String verdict;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, FeedbackWriteSheetKey$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<FeedbackWriteSheetKey> serializer() {
            return FeedbackWriteSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedbackWriteSheetKey) {
                FeedbackWriteSheetKey feedbackWriteSheetKey = (FeedbackWriteSheetKey) obj;
                if (!C7384Etj.areEqual(this.entityType, feedbackWriteSheetKey.entityType) || !C7384Etj.areEqual(this.entityId, feedbackWriteSheetKey.entityId) || !C7384Etj.areEqual(this.verdict, feedbackWriteSheetKey.verdict) || !C7384Etj.areEqual(this.surface, feedbackWriteSheetKey.surface) || !C7384Etj.areEqual(this.metadata, feedbackWriteSheetKey.metadata)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedbackWriteSheetKey copy$default(FeedbackWriteSheetKey feedbackWriteSheetKey, String str, String str2, String str3, String str4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedbackWriteSheetKey.entityType;
        }
        if ((i & 2) != 0) {
            str2 = feedbackWriteSheetKey.entityId;
        }
        if ((i & 4) != 0) {
            str3 = feedbackWriteSheetKey.verdict;
        }
        if ((i & 8) != 0) {
            str4 = feedbackWriteSheetKey.surface;
        }
        if ((i & 16) != 0) {
            map = feedbackWriteSheetKey.metadata;
        }
        return feedbackWriteSheetKey.copy(str, str2, str3, str4, map);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(FeedbackWriteSheetKey feedbackWriteSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(feedbackWriteSheetKey.entityType, c9iZ, 0);
        c9j5.AAV(feedbackWriteSheetKey.entityId, c9iZ, 1);
        c9j5.AAV(feedbackWriteSheetKey.verdict, c9iZ, 2);
        boolean zAfR = c9j5.AfR();
        if (zAfR || feedbackWriteSheetKey.surface != null) {
            c9j5.AAP(feedbackWriteSheetKey.surface, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || !C7384Etj.areEqual(feedbackWriteSheetKey.metadata, AGH.A0E())) {
            c9j5.AAQ(feedbackWriteSheetKey.metadata, C06G.A0e(f0cArr, 4), c9iZ, 4);
        }
    }

    public final String component1() {
        return this.entityType;
    }

    public final String component2() {
        return this.entityId;
    }

    public final String component3() {
        return this.verdict;
    }

    public final String component4() {
        return this.surface;
    }

    public final Map<String, String> component5() {
        return this.metadata;
    }

    public final String getEntityId() {
        return this.entityId;
    }

    public final String getEntityType() {
        return this.entityType;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getSurface() {
        return this.surface;
    }

    public final String getVerdict() {
        return this.verdict;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.metadata, (AnonymousClass005.A0I(this.verdict, AnonymousClass005.A0I(this.entityId, AnonymousClass001.A0G(this.entityType))) + AnonymousClass006.A0G(this.surface)) * 31);
    }

    public FeedbackWriteSheetKey(String str, String str2, String str3, String str4, Map<String, String> map) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(map, 4);
        this.entityType = str;
        this.entityId = str2;
        this.verdict = str3;
        this.surface = str4;
        this.metadata = map;
    }

    public final FeedbackWriteSheetKey copy(String str, String str2, String str3, String str4, Map<String, String> map) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(map, 4);
        return new FeedbackWriteSheetKey(str, str2, str3, str4, map);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedbackWriteSheetKey(String str, String str2, String str3, String str4, Map map, int i, C06H c06h) {
        this(str, str2, str3, AnonymousClass006.A0u(i, str4), (i & 16) != 0 ? AGH.A0E() : map);
    }

    public /* synthetic */ FeedbackWriteSheetKey(int i, String str, String str2, String str3, String str4, Map map, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(FeedbackWriteSheetKey$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.entityType = str;
        this.entityId = str2;
        this.verdict = str3;
        this.surface = (i & 8) == 0 ? null : str4;
        if ((i & 16) == 0) {
            this.metadata = AGH.A0E();
        } else {
            this.metadata = map;
        }
    }
}
