package com.facebook.aura.commands.sms;

import X.AnonymousClass003;
import X.C06G;
import java.util.List;

/* loaded from: classes3.dex */
public final class AmbiguousNameMatch extends C06G {
    public final List<ContactCandidate> candidates;
    public final String query;

    public static /* synthetic */ AmbiguousNameMatch copy$default(AmbiguousNameMatch ambiguousNameMatch, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ambiguousNameMatch.query;
        }
        if ((i & 2) != 0) {
            list = ambiguousNameMatch.candidates;
        }
        AnonymousClass003.A0u(str, list);
        return new AmbiguousNameMatch(str, list);
    }

    public final String component1() {
        return this.query;
    }

    public final List<ContactCandidate> component2() {
        return this.candidates;
    }

    public final List<ContactCandidate> getCandidates() {
        return this.candidates;
    }

    public final String getQuery() {
        return this.query;
    }

    public AmbiguousNameMatch(String str, List<ContactCandidate> list) {
        AnonymousClass003.A0u(str, list);
        this.query = str;
        this.candidates = list;
    }

    public final AmbiguousNameMatch copy(String str, List<ContactCandidate> list) {
        AnonymousClass003.A0u(str, list);
        return new AmbiguousNameMatch(str, list);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
