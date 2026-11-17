package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public final class Observation {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public ElementRef blockingLocator;
    public List<ControlFact> controlFacts;
    public DocumentKey document;
    public PageMetadata metadata;
    public List<RedactedItems> redactions;
    public TransitionEvidence renderFence;
    public RefScope scope;
    public SignalDiagnostics signalDiagnostics;
    public List<ObservationSignal> signals;
    public String text;
    public ViewMotion viewMotion;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Observation) {
                Observation observation = (Observation) obj;
                if (!C7384Etj.areEqual(this.blockingLocator, observation.blockingLocator) || !C7384Etj.areEqual(this.redactions, observation.redactions) || !C7384Etj.areEqual(this.viewMotion, observation.viewMotion) || !C7384Etj.areEqual(this.renderFence, observation.renderFence) || !C7384Etj.areEqual(this.text, observation.text) || !C7384Etj.areEqual(this.scope, observation.scope) || !C7384Etj.areEqual(this.document, observation.document) || !C7384Etj.areEqual(this.metadata, observation.metadata) || !C7384Etj.areEqual(this.signals, observation.signals) || !C7384Etj.areEqual(this.signalDiagnostics, observation.signalDiagnostics) || !C7384Etj.areEqual(this.controlFacts, observation.controlFacts)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setControlFacts(List<ControlFact> list) {
        C7384Etj.A0Y(list, 0);
        this.controlFacts = list;
    }

    public final void setDocument(DocumentKey documentKey) {
        C7384Etj.A0Y(documentKey, 0);
        this.document = documentKey;
    }

    public final void setMetadata(PageMetadata pageMetadata) {
        C7384Etj.A0Y(pageMetadata, 0);
        this.metadata = pageMetadata;
    }

    public final void setScope(RefScope refScope) {
        C7384Etj.A0Y(refScope, 0);
        this.scope = refScope;
    }

    public final void setSignals(List<ObservationSignal> list) {
        C7384Etj.A0Y(list, 0);
        this.signals = list;
    }

    public final void setText(String str) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Observation copy$default(Observation observation, ElementRef elementRef, List list, ViewMotion viewMotion, TransitionEvidence transitionEvidence, String str, RefScope refScope, DocumentKey documentKey, PageMetadata pageMetadata, List list2, SignalDiagnostics signalDiagnostics, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            elementRef = observation.blockingLocator;
        }
        if ((i & 2) != 0) {
            list = observation.redactions;
        }
        if ((i & 4) != 0) {
            viewMotion = observation.viewMotion;
        }
        if ((i & 8) != 0) {
            transitionEvidence = observation.renderFence;
        }
        if ((i & 16) != 0) {
            str = observation.text;
        }
        if ((i & 32) != 0) {
            refScope = observation.scope;
        }
        if ((i & 64) != 0) {
            documentKey = observation.document;
        }
        if ((i & 128) != 0) {
            pageMetadata = observation.metadata;
        }
        if ((i & 256) != 0) {
            list2 = observation.signals;
        }
        if ((i & 512) != 0) {
            signalDiagnostics = observation.signalDiagnostics;
        }
        if ((i & 1024) != 0) {
            list3 = observation.controlFacts;
        }
        return observation.copy(elementRef, list, viewMotion, transitionEvidence, str, refScope, documentKey, pageMetadata, list2, signalDiagnostics, list3);
    }

    public final ElementRef component1() {
        return this.blockingLocator;
    }

    public final SignalDiagnostics component10() {
        return this.signalDiagnostics;
    }

    public final List<ControlFact> component11() {
        return this.controlFacts;
    }

    public final List<RedactedItems> component2() {
        return this.redactions;
    }

    public final ViewMotion component3() {
        return this.viewMotion;
    }

    public final TransitionEvidence component4() {
        return this.renderFence;
    }

    public final String component5() {
        return this.text;
    }

    public final RefScope component6() {
        return this.scope;
    }

    public final DocumentKey component7() {
        return this.document;
    }

    public final PageMetadata component8() {
        return this.metadata;
    }

    public final List<ObservationSignal> component9() {
        return this.signals;
    }

    public final ElementRef getBlockingLocator() {
        return this.blockingLocator;
    }

    public final List<ControlFact> getControlFacts() {
        return this.controlFacts;
    }

    public final DocumentKey getDocument() {
        return this.document;
    }

    public final PageMetadata getMetadata() {
        return this.metadata;
    }

    public final List<RedactedItems> getRedactions() {
        return this.redactions;
    }

    public final TransitionEvidence getRenderFence() {
        return this.renderFence;
    }

    public final RefScope getScope() {
        return this.scope;
    }

    public final SignalDiagnostics getSignalDiagnostics() {
        return this.signalDiagnostics;
    }

    public final List<ObservationSignal> getSignals() {
        return this.signals;
    }

    public final String getText() {
        return this.text;
    }

    public final ViewMotion getViewMotion() {
        return this.viewMotion;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.controlFacts, (AnonymousClass005.A0F(this.signals, AnonymousClass005.A0F(this.metadata, AnonymousClass005.A0F(this.document, AnonymousClass005.A0F(this.scope, AnonymousClass005.A0I(this.text, ((((((AnonymousClass006.A0D(this.blockingLocator) * 31) + AnonymousClass006.A0D(this.redactions)) * 31) + AnonymousClass006.A0D(this.viewMotion)) * 31) + AnonymousClass006.A0D(this.renderFence)) * 31))))) + C3cH.A02(this.signalDiagnostics)) * 31);
    }

    public final void setBlockingLocator(ElementRef elementRef) {
        this.blockingLocator = elementRef;
    }

    public final void setRedactions(List<RedactedItems> list) {
        this.redactions = list;
    }

    public final void setRenderFence(TransitionEvidence transitionEvidence) {
        this.renderFence = transitionEvidence;
    }

    public final void setSignalDiagnostics(SignalDiagnostics signalDiagnostics) {
        this.signalDiagnostics = signalDiagnostics;
    }

    public final void setViewMotion(ViewMotion viewMotion) {
        this.viewMotion = viewMotion;
    }

    public String toString() {
        ElementRef elementRef = this.blockingLocator;
        List<RedactedItems> list = this.redactions;
        ViewMotion viewMotion = this.viewMotion;
        TransitionEvidence transitionEvidence = this.renderFence;
        String str = this.text;
        RefScope refScope = this.scope;
        DocumentKey documentKey = this.document;
        PageMetadata pageMetadata = this.metadata;
        List<ObservationSignal> list2 = this.signals;
        SignalDiagnostics signalDiagnostics = this.signalDiagnostics;
        List<ControlFact> list3 = this.controlFacts;
        StringBuilder sbA0f = C3cG.A0f(elementRef, "Observation(blockingLocator=");
        sbA0f.append(", redactions=");
        sbA0f.append(list);
        sbA0f.append(", viewMotion=");
        sbA0f.append(viewMotion);
        sbA0f.append(", renderFence=");
        sbA0f.append(transitionEvidence);
        sbA0f.append(", text=");
        sbA0f.append(str);
        AbstractC7609F5w.A1M(sbA0f, refScope);
        sbA0f.append(", document=");
        AbstractC7608F5v.A1Q(sbA0f, documentKey);
        sbA0f.append(pageMetadata);
        sbA0f.append(", signals=");
        sbA0f.append(list2);
        sbA0f.append(", signalDiagnostics=");
        sbA0f.append(signalDiagnostics);
        return C3cJ.A0L(list3, ", controlFacts=", sbA0f);
    }

    public Observation(ElementRef elementRef, List<RedactedItems> list, ViewMotion viewMotion, TransitionEvidence transitionEvidence, String str, RefScope refScope, DocumentKey documentKey, PageMetadata pageMetadata, List<ObservationSignal> list2, SignalDiagnostics signalDiagnostics, List<ControlFact> list3) {
        AnonymousClass003.A0y(str, refScope);
        AnonymousClass005.A13(documentKey, pageMetadata, list2, 6);
        C7384Etj.A0Y(list3, 10);
        this.blockingLocator = elementRef;
        this.redactions = list;
        this.viewMotion = viewMotion;
        this.renderFence = transitionEvidence;
        this.text = str;
        this.scope = refScope;
        this.document = documentKey;
        this.metadata = pageMetadata;
        this.signals = list2;
        this.signalDiagnostics = signalDiagnostics;
        this.controlFacts = list3;
    }

    public final Observation copy(ElementRef elementRef, List<RedactedItems> list, ViewMotion viewMotion, TransitionEvidence transitionEvidence, String str, RefScope refScope, DocumentKey documentKey, PageMetadata pageMetadata, List<ObservationSignal> list2, SignalDiagnostics signalDiagnostics, List<ControlFact> list3) {
        AnonymousClass003.A0y(str, refScope);
        AnonymousClass005.A13(documentKey, pageMetadata, list2, 6);
        C7384Etj.A0Y(list3, 10);
        return new Observation(elementRef, list, viewMotion, transitionEvidence, str, refScope, documentKey, pageMetadata, list2, signalDiagnostics, list3);
    }
}
