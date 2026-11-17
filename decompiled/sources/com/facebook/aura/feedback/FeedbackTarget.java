package com.facebook.aura.feedback;

import X.AGH;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes.dex */
public final class FeedbackTarget extends C06G {
    public static final int $stable = 0;
    public final String entityId;
    public final String entityType;
    public final Map<String, String> metadata;
    public final String surface;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedbackTarget) {
                FeedbackTarget feedbackTarget = (FeedbackTarget) obj;
                if (!C7384Etj.areEqual(this.entityType, feedbackTarget.entityType) || !C7384Etj.areEqual(this.entityId, feedbackTarget.entityId) || !C7384Etj.areEqual(this.surface, feedbackTarget.surface) || !C7384Etj.areEqual(this.metadata, feedbackTarget.metadata)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-UcLkrEQ$default, reason: not valid java name */
    public static /* synthetic */ FeedbackTarget m856copyUcLkrEQ$default(FeedbackTarget feedbackTarget, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedbackTarget.entityType;
        }
        if ((i & 2) != 0) {
            str2 = feedbackTarget.entityId;
        }
        if ((i & 4) != 0) {
            str3 = feedbackTarget.surface;
        }
        if ((i & 8) != 0) {
            map = feedbackTarget.metadata;
        }
        AnonymousClass005.A0y(str, str2, map);
        return new FeedbackTarget(str, str2, str3, map);
    }

    /* renamed from: component1-nN4RILs, reason: not valid java name */
    public final String m857component1nN4RILs() {
        return this.entityType;
    }

    public final String component2() {
        return this.entityId;
    }

    public final String component3() {
        return this.surface;
    }

    public final Map<String, String> component4() {
        return this.metadata;
    }

    public final String getEntityId() {
        return this.entityId;
    }

    /* renamed from: getEntityType-nN4RILs, reason: not valid java name */
    public final String m859getEntityTypenN4RILs() {
        return this.entityType;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.metadata, (AnonymousClass005.A0I(this.entityId, AnonymousClass001.A0G(this.entityType)) + AnonymousClass006.A0G(this.surface)) * 31);
    }

    public /* synthetic */ FeedbackTarget(String str, String str2, String str3, Map map, C06H c06h) {
        this(str, str2, str3, map);
    }

    /* renamed from: copy-UcLkrEQ, reason: not valid java name */
    public final FeedbackTarget m858copyUcLkrEQ(String str, String str2, String str3, Map<String, String> map) {
        AnonymousClass005.A0y(str, str2, map);
        return new FeedbackTarget(str, str2, str3, map);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedbackTarget(String str, String str2, String str3, Map map, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3), (i & 8) != 0 ? AGH.A0E() : map);
    }

    public FeedbackTarget(String str, String str2, String str3, Map<String, String> map) {
        AnonymousClass005.A0y(str, str2, map);
        this.entityType = str;
        this.entityId = str2;
        this.surface = str3;
        this.metadata = map;
    }
}
