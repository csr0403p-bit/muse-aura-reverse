package com.facebook.aura.model;

import X.A3q;
import X.AGH;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ReplyElementSupport extends C06G {
    public static final int $stable = 0;
    public final Map<String, Set<String>> kindsByTarget;
    public final Set<String> targetTypes;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReplyElementSupport) {
                ReplyElementSupport replyElementSupport = (ReplyElementSupport) obj;
                if (!C7384Etj.areEqual(this.kindsByTarget, replyElementSupport.kindsByTarget) || !C7384Etj.areEqual(this.targetTypes, replyElementSupport.targetTypes)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean supports(ReplyElementReference replyElementReference, String str) {
        boolean zA1a = AnonymousClass002.A1a(replyElementReference, str);
        if (ReplyElementJsonKt.isValid(replyElementReference)) {
            Set<String> set = this.kindsByTarget.get(replyElementReference.type);
            if (set == null) {
                set = A3q.A00;
            }
            if (set.contains(str)) {
                return zA1a;
            }
        }
        return false;
    }

    public final boolean supportsTargetType(String str) {
        C7384Etj.A0Y(str, 0);
        return this.targetTypes.contains(str);
    }

    public static /* synthetic */ ReplyElementSupport copy$default(ReplyElementSupport replyElementSupport, Map map, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            map = replyElementSupport.kindsByTarget;
        }
        if ((i & 2) != 0) {
            set = replyElementSupport.targetTypes;
        }
        AnonymousClass003.A0u(map, set);
        return new ReplyElementSupport(map, set);
    }

    public final Map<String, Set<String>> component1() {
        return this.kindsByTarget;
    }

    public final Set<String> component2() {
        return this.targetTypes;
    }

    public final Map<String, Set<String>> getKindsByTarget() {
        return this.kindsByTarget;
    }

    public final Set<String> getTargetTypes() {
        return this.targetTypes;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.targetTypes, AnonymousClass005.A0E(this.kindsByTarget));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyElementSupport(Map<String, ? extends Set<String>> map, Set<String> set) {
        AnonymousClass003.A0u(map, set);
        this.kindsByTarget = map;
        this.targetTypes = set;
    }

    public final ReplyElementSupport copy(Map<String, ? extends Set<String>> map, Set<String> set) {
        AnonymousClass003.A0u(map, set);
        return new ReplyElementSupport(map, set);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ReplyElementSupport(Map map, Set set, int i, C06H c06h) {
        this(C3cH.A0o(map, i & 1), (i & 2) != 0 ? A3q.A00 : set);
    }

    public ReplyElementSupport() {
        this(AGH.A0E(), A3q.A00);
    }
}
