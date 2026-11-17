package com.facebook.aura.commands.contacts;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class ScoredContact extends C06G {
    public final CanonicalContact contact;
    public final double score;

    public ScoredContact(CanonicalContact canonicalContact, double d) {
        C7384Etj.A0Y(canonicalContact, 0);
        this.contact = canonicalContact;
        this.score = d;
    }

    public final ScoredContact copy(CanonicalContact canonicalContact, double d) {
        C7384Etj.A0Y(canonicalContact, 0);
        return new ScoredContact(canonicalContact, d);
    }

    public static /* synthetic */ ScoredContact copy$default(ScoredContact scoredContact, CanonicalContact canonicalContact, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            canonicalContact = scoredContact.contact;
        }
        if ((i & 2) != 0) {
            d = scoredContact.score;
        }
        C7384Etj.A0Y(canonicalContact, 0);
        return new ScoredContact(canonicalContact, d);
    }

    public final CanonicalContact component1() {
        return this.contact;
    }

    public final double component2() {
        return this.score;
    }

    public final CanonicalContact getContact() {
        return this.contact;
    }

    public final double getScore() {
        return this.score;
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
