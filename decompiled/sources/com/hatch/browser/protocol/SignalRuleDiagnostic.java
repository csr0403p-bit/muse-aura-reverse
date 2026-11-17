package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.C06H;
import X.C0KA;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public final class SignalRuleDiagnostic {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public int candidateCount;
    public int confirmedCount;
    public SignalEvidenceKind evidenceKind;
    public List<? extends SignalDiagnosticOutcome> limitations;
    public SignalDiagnosticOutcome outcome;
    public String query;
    public int renderedCount;
    public boolean requiresRenderedMatch;
    public String ruleId;
    public SignalKind signal;
    public String urlMatcher;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SignalRuleDiagnostic) {
                SignalRuleDiagnostic signalRuleDiagnostic = (SignalRuleDiagnostic) obj;
                if (!C7384Etj.areEqual(this.ruleId, signalRuleDiagnostic.ruleId) || this.signal != signalRuleDiagnostic.signal || this.evidenceKind != signalRuleDiagnostic.evidenceKind || !C7384Etj.areEqual(this.query, signalRuleDiagnostic.query) || !C7384Etj.areEqual(this.urlMatcher, signalRuleDiagnostic.urlMatcher) || this.requiresRenderedMatch != signalRuleDiagnostic.requiresRenderedMatch || this.outcome != signalRuleDiagnostic.outcome || this.candidateCount != signalRuleDiagnostic.candidateCount || this.confirmedCount != signalRuleDiagnostic.confirmedCount || this.renderedCount != signalRuleDiagnostic.renderedCount || !C7384Etj.areEqual(this.limitations, signalRuleDiagnostic.limitations)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setEvidenceKind(SignalEvidenceKind signalEvidenceKind) {
        C7384Etj.A0Y(signalEvidenceKind, 0);
        this.evidenceKind = signalEvidenceKind;
    }

    public final void setLimitations(List<? extends SignalDiagnosticOutcome> list) {
        C7384Etj.A0Y(list, 0);
        this.limitations = list;
    }

    public final void setOutcome(SignalDiagnosticOutcome signalDiagnosticOutcome) {
        C7384Etj.A0Y(signalDiagnosticOutcome, 0);
        this.outcome = signalDiagnosticOutcome;
    }

    public final void setRuleId(String str) {
        C7384Etj.A0Y(str, 0);
        this.ruleId = str;
    }

    public final void setSignal(SignalKind signalKind) {
        C7384Etj.A0Y(signalKind, 0);
        this.signal = signalKind;
    }

    public final void setUrlMatcher(String str) {
        C7384Etj.A0Y(str, 0);
        this.urlMatcher = str;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-MoFwMrk$default, reason: not valid java name */
    public static /* synthetic */ SignalRuleDiagnostic m3769copyMoFwMrk$default(SignalRuleDiagnostic signalRuleDiagnostic, String str, SignalKind signalKind, SignalEvidenceKind signalEvidenceKind, String str2, String str3, boolean z, SignalDiagnosticOutcome signalDiagnosticOutcome, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = signalRuleDiagnostic.ruleId;
        }
        if ((i4 & 2) != 0) {
            signalKind = signalRuleDiagnostic.signal;
        }
        if ((i4 & 4) != 0) {
            signalEvidenceKind = signalRuleDiagnostic.evidenceKind;
        }
        if ((i4 & 8) != 0) {
            str2 = signalRuleDiagnostic.query;
        }
        if ((i4 & 16) != 0) {
            str3 = signalRuleDiagnostic.urlMatcher;
        }
        if ((i4 & 32) != 0) {
            z = signalRuleDiagnostic.requiresRenderedMatch;
        }
        if ((i4 & 64) != 0) {
            signalDiagnosticOutcome = signalRuleDiagnostic.outcome;
        }
        if ((i4 & 128) != 0) {
            i = signalRuleDiagnostic.candidateCount;
        }
        if ((i4 & 256) != 0) {
            i2 = signalRuleDiagnostic.confirmedCount;
        }
        if ((i4 & 512) != 0) {
            i3 = signalRuleDiagnostic.renderedCount;
        }
        if ((i4 & 1024) != 0) {
            list = signalRuleDiagnostic.limitations;
        }
        return signalRuleDiagnostic.m3773copyMoFwMrk(str, signalKind, signalEvidenceKind, str2, str3, z, signalDiagnosticOutcome, i, i2, i3, list);
    }

    public final String component1() {
        return this.ruleId;
    }

    /* renamed from: component10-pVg5ArA, reason: not valid java name */
    public final int m3770component10pVg5ArA() {
        return this.renderedCount;
    }

    public final List<SignalDiagnosticOutcome> component11() {
        return this.limitations;
    }

    public final SignalKind component2() {
        return this.signal;
    }

    public final SignalEvidenceKind component3() {
        return this.evidenceKind;
    }

    public final String component4() {
        return this.query;
    }

    public final String component5() {
        return this.urlMatcher;
    }

    public final boolean component6() {
        return this.requiresRenderedMatch;
    }

    public final SignalDiagnosticOutcome component7() {
        return this.outcome;
    }

    /* renamed from: component8-pVg5ArA, reason: not valid java name */
    public final int m3771component8pVg5ArA() {
        return this.candidateCount;
    }

    /* renamed from: component9-pVg5ArA, reason: not valid java name */
    public final int m3772component9pVg5ArA() {
        return this.confirmedCount;
    }

    /* renamed from: getCandidateCount-pVg5ArA, reason: not valid java name */
    public final int m3774getCandidateCountpVg5ArA() {
        return this.candidateCount;
    }

    /* renamed from: getConfirmedCount-pVg5ArA, reason: not valid java name */
    public final int m3775getConfirmedCountpVg5ArA() {
        return this.confirmedCount;
    }

    public final SignalEvidenceKind getEvidenceKind() {
        return this.evidenceKind;
    }

    public final List<SignalDiagnosticOutcome> getLimitations() {
        return this.limitations;
    }

    public final SignalDiagnosticOutcome getOutcome() {
        return this.outcome;
    }

    public final String getQuery() {
        return this.query;
    }

    /* renamed from: getRenderedCount-pVg5ArA, reason: not valid java name */
    public final int m3776getRenderedCountpVg5ArA() {
        return this.renderedCount;
    }

    public final boolean getRequiresRenderedMatch() {
        return this.requiresRenderedMatch;
    }

    public final String getRuleId() {
        return this.ruleId;
    }

    public final SignalKind getSignal() {
        return this.signal;
    }

    public final String getUrlMatcher() {
        return this.urlMatcher;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.limitations, (((((AnonymousClass005.A0F(this.outcome, C0KA.A01(AnonymousClass005.A0I(this.urlMatcher, (AnonymousClass005.A0F(this.evidenceKind, AnonymousClass005.A0F(this.signal, AnonymousClass001.A0G(this.ruleId))) + AnonymousClass006.A0G(this.query)) * 31), this.requiresRenderedMatch)) + this.candidateCount) * 31) + this.confirmedCount) * 31) + this.renderedCount) * 31);
    }

    /* renamed from: setCandidateCount-WZ4Q5Ns, reason: not valid java name */
    public final void m3777setCandidateCountWZ4Q5Ns(int i) {
        this.candidateCount = i;
    }

    /* renamed from: setConfirmedCount-WZ4Q5Ns, reason: not valid java name */
    public final void m3778setConfirmedCountWZ4Q5Ns(int i) {
        this.confirmedCount = i;
    }

    public final void setQuery(String str) {
        this.query = str;
    }

    /* renamed from: setRenderedCount-WZ4Q5Ns, reason: not valid java name */
    public final void m3779setRenderedCountWZ4Q5Ns(int i) {
        this.renderedCount = i;
    }

    public final void setRequiresRenderedMatch(boolean z) {
        this.requiresRenderedMatch = z;
    }

    public String toString() {
        String str = this.ruleId;
        SignalKind signalKind = this.signal;
        SignalEvidenceKind signalEvidenceKind = this.evidenceKind;
        String str2 = this.query;
        String str3 = this.urlMatcher;
        boolean z = this.requiresRenderedMatch;
        SignalDiagnosticOutcome signalDiagnosticOutcome = this.outcome;
        String strValueOf = String.valueOf(BV4.A03(this.candidateCount));
        String strValueOf2 = String.valueOf(BV4.A03(this.confirmedCount));
        String strValueOf3 = String.valueOf(BV4.A03(this.renderedCount));
        List<? extends SignalDiagnosticOutcome> list = this.limitations;
        StringBuilder sbA0x = C3cI.A0x("SignalRuleDiagnostic(ruleId=", str);
        sbA0x.append(", signal=");
        sbA0x.append(signalKind);
        sbA0x.append(", evidenceKind=");
        sbA0x.append(signalEvidenceKind);
        sbA0x.append(", query=");
        sbA0x.append(str2);
        sbA0x.append(", urlMatcher=");
        sbA0x.append(str3);
        sbA0x.append(", requiresRenderedMatch=");
        sbA0x.append(z);
        sbA0x.append(", outcome=");
        sbA0x.append(signalDiagnosticOutcome);
        sbA0x.append(", candidateCount=");
        sbA0x.append(strValueOf);
        sbA0x.append(", confirmedCount=");
        sbA0x.append(strValueOf2);
        sbA0x.append(", renderedCount=");
        sbA0x.append(strValueOf3);
        return C3cJ.A0L(list, ", limitations=", sbA0x);
    }

    public SignalRuleDiagnostic(String str, SignalKind signalKind, SignalEvidenceKind signalEvidenceKind, String str2, String str3, boolean z, SignalDiagnosticOutcome signalDiagnosticOutcome, int i, int i2, int i3, List<? extends SignalDiagnosticOutcome> list) {
        AnonymousClass005.A0x(str, signalKind, signalEvidenceKind);
        AnonymousClass002.A1E(str3, 4, signalDiagnosticOutcome);
        C7384Etj.A0Y(list, 10);
        this.ruleId = str;
        this.signal = signalKind;
        this.evidenceKind = signalEvidenceKind;
        this.query = str2;
        this.urlMatcher = str3;
        this.requiresRenderedMatch = z;
        this.outcome = signalDiagnosticOutcome;
        this.candidateCount = i;
        this.confirmedCount = i2;
        this.renderedCount = i3;
        this.limitations = list;
    }

    /* renamed from: copy-MoFwMrk, reason: not valid java name */
    public final SignalRuleDiagnostic m3773copyMoFwMrk(String str, SignalKind signalKind, SignalEvidenceKind signalEvidenceKind, String str2, String str3, boolean z, SignalDiagnosticOutcome signalDiagnosticOutcome, int i, int i2, int i3, List<? extends SignalDiagnosticOutcome> list) {
        AnonymousClass005.A0x(str, signalKind, signalEvidenceKind);
        AnonymousClass002.A1E(str3, 4, signalDiagnosticOutcome);
        C7384Etj.A0Y(list, 10);
        return new SignalRuleDiagnostic(str, signalKind, signalEvidenceKind, str2, str3, z, signalDiagnosticOutcome, i, i2, i3, list);
    }

    public /* synthetic */ SignalRuleDiagnostic(String str, SignalKind signalKind, SignalEvidenceKind signalEvidenceKind, String str2, String str3, boolean z, SignalDiagnosticOutcome signalDiagnosticOutcome, int i, int i2, int i3, List list, C06H c06h) {
        this(str, signalKind, signalEvidenceKind, str2, str3, z, signalDiagnosticOutcome, i, i2, i3, list);
    }
}
