package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C8j2;
import X.FKC;

/* loaded from: classes6.dex */
public final class TransitionEvidence {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public DocumentKey after;
    public DocumentKey before;
    public boolean documentChanged;
    public TransitionKind kind;
    public Readiness readiness;
    public FKC waitedMs;

    public TransitionEvidence(TransitionKind transitionKind, FKC fkc, DocumentKey documentKey, DocumentKey documentKey2, boolean z, Readiness readiness) {
        C7384Etj.A0Y(readiness, 5);
        this.kind = transitionKind;
        this.waitedMs = fkc;
        this.before = documentKey;
        this.after = documentKey2;
        this.documentChanged = z;
        this.readiness = readiness;
    }

    /* renamed from: copy-DQ7CZLA, reason: not valid java name */
    public final TransitionEvidence m3798copyDQ7CZLA(TransitionKind transitionKind, FKC fkc, DocumentKey documentKey, DocumentKey documentKey2, boolean z, Readiness readiness) {
        C7384Etj.A0Y(readiness, 5);
        return new TransitionEvidence(transitionKind, fkc, documentKey, documentKey2, z, readiness);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TransitionEvidence) {
                TransitionEvidence transitionEvidence = (TransitionEvidence) obj;
                if (this.kind != transitionEvidence.kind || !C7384Etj.areEqual(this.waitedMs, transitionEvidence.waitedMs) || !C7384Etj.areEqual(this.before, transitionEvidence.before) || !C7384Etj.areEqual(this.after, transitionEvidence.after) || this.documentChanged != transitionEvidence.documentChanged || this.readiness != transitionEvidence.readiness) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setReadiness(Readiness readiness) {
        C7384Etj.A0Y(readiness, 0);
        this.readiness = readiness;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-DQ7CZLA$default, reason: not valid java name */
    public static /* synthetic */ TransitionEvidence m3796copyDQ7CZLA$default(TransitionEvidence transitionEvidence, TransitionKind transitionKind, FKC fkc, DocumentKey documentKey, DocumentKey documentKey2, boolean z, Readiness readiness, int i, Object obj) {
        if ((i & 1) != 0) {
            transitionKind = transitionEvidence.kind;
        }
        if ((i & 2) != 0) {
            fkc = transitionEvidence.waitedMs;
        }
        if ((i & 4) != 0) {
            documentKey = transitionEvidence.before;
        }
        if ((i & 8) != 0) {
            documentKey2 = transitionEvidence.after;
        }
        if ((i & 16) != 0) {
            z = transitionEvidence.documentChanged;
        }
        if ((i & 32) != 0) {
            readiness = transitionEvidence.readiness;
        }
        return transitionEvidence.m3798copyDQ7CZLA(transitionKind, fkc, documentKey, documentKey2, z, readiness);
    }

    public final TransitionKind component1() {
        return this.kind;
    }

    /* renamed from: component2-0hXNFcg, reason: not valid java name */
    public final FKC m3797component20hXNFcg() {
        return this.waitedMs;
    }

    public final DocumentKey component3() {
        return this.before;
    }

    public final DocumentKey component4() {
        return this.after;
    }

    public final boolean component5() {
        return this.documentChanged;
    }

    public final Readiness component6() {
        return this.readiness;
    }

    public final DocumentKey getAfter() {
        return this.after;
    }

    public final DocumentKey getBefore() {
        return this.before;
    }

    public final boolean getDocumentChanged() {
        return this.documentChanged;
    }

    public final TransitionKind getKind() {
        return this.kind;
    }

    public final Readiness getReadiness() {
        return this.readiness;
    }

    /* renamed from: getWaitedMs-0hXNFcg, reason: not valid java name */
    public final FKC m3799getWaitedMs0hXNFcg() {
        return this.waitedMs;
    }

    public int hashCode() {
        int iA0D = AnonymousClass006.A0D(this.kind) * 31;
        FKC fkc = this.waitedMs;
        return AnonymousClass005.A0G(this.readiness, C0KA.A01((((((iA0D + (fkc == null ? 0 : fkc.A00)) * 31) + AnonymousClass006.A0D(this.before)) * 31) + C3cH.A02(this.after)) * 31, this.documentChanged));
    }

    public final void setAfter(DocumentKey documentKey) {
        this.after = documentKey;
    }

    public final void setBefore(DocumentKey documentKey) {
        this.before = documentKey;
    }

    public final void setDocumentChanged(boolean z) {
        this.documentChanged = z;
    }

    public final void setKind(TransitionKind transitionKind) {
        this.kind = transitionKind;
    }

    /* renamed from: setWaitedMs-ExVfyTY, reason: not valid java name */
    public final void m3800setWaitedMsExVfyTY(FKC fkc) {
        this.waitedMs = fkc;
    }

    public String toString() {
        TransitionKind transitionKind = this.kind;
        FKC fkc = this.waitedMs;
        DocumentKey documentKey = this.before;
        DocumentKey documentKey2 = this.after;
        boolean z = this.documentChanged;
        Readiness readiness = this.readiness;
        StringBuilder sbA0f = C3cG.A0f(transitionKind, "TransitionEvidence(kind=");
        sbA0f.append(", waitedMs=");
        sbA0f.append(fkc);
        sbA0f.append(", before=");
        sbA0f.append(documentKey);
        sbA0f.append(", after=");
        sbA0f.append(documentKey2);
        sbA0f.append(", documentChanged=");
        sbA0f.append(z);
        return C3cJ.A0L(readiness, C8j2.A00(41), sbA0f);
    }

    public /* synthetic */ TransitionEvidence(TransitionKind transitionKind, FKC fkc, DocumentKey documentKey, DocumentKey documentKey2, boolean z, Readiness readiness, C06H c06h) {
        this(transitionKind, fkc, documentKey, documentKey2, z, readiness);
    }
}
